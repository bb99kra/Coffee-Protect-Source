/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerCommandPreprocessEvent
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.CP_TM;
import me.nik.coffeeprotect.CP_Z6;
import me.nik.coffeeprotect.CP_rW;
import me.nik.coffeeprotect.CP_vF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CP_Qg
implements Listener {
    private final CoffeeProtect CP_X;
    private static final long a = CP_s.a(-8832167801685493084L, -6237869816496420359L, MethodHandles.lookup().lookupClass()).a(74673078740261L);
    private static final String b;
    private static transient /* synthetic */ String ymNfXYfvCL = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Qg(CoffeeProtect coffeeProtect) {
        this.CP_X = coffeeProtect;
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void CP_p(PlayerCommandPreprocessEvent playerCommandPreprocessEvent) {
        String[] stringArray;
        block14: {
            CP_TM ilIlTM;
            CP_TM ilIlTM2;
            block13: {
                Player player;
                block12: {
                    int n;
                    block10: {
                        block11: {
                            long l = a ^ 0x11FA681E907DL;
                            player = playerCommandPreprocessEvent.getPlayer();
                            stringArray = CP_vF.CP_o();
                            n = player.isDead();
                            if (stringArray == null) break block10;
                            if (n != 0) break block11;
                            n = player.isValid() ? 1 : 0;
                            if (stringArray == null) break block10;
                            if (n == 0) break block11;
                            n = player.isOnline() ? 1 : 0;
                            if (stringArray == null) break block10;
                            if (n == 0) break block11;
                            n = player.isSleeping() ? 1 : 0;
                            if (stringArray == null) break block10;
                            if (n == 0) break block12;
                        }
                        playerCommandPreprocessEvent.setCancelled(true);
                        n = 1;
                    }
                    String[] stringArray2 = new String[n];
                    stringArray2[0] = b + player.getName();
                    CP_rW.CP_U(stringArray2);
                    return;
                }
                ilIlTM = ilIlTM2 = this.CP_X.CP_F().CP_R(player);
                if (stringArray == null) break block13;
                if (ilIlTM == null) break block14;
                ilIlTM = ilIlTM2;
            }
            if (stringArray != null) {
                if (ilIlTM.CP_s() <= CP_Oq.DISABLED_COMMANDS_COOLDOWN.CP_q()) {
                    playerCommandPreprocessEvent.setCancelled(true);
                    return;
                }
                ilIlTM = ilIlTM2;
            }
            ilIlTM.CP_P();
        }
        String string = playerCommandPreprocessEvent.getMessage().toLowerCase();
        if (CP_Z6.CP_i(CP_Oq.DISABLED_COMMANDS_COMMANDS.CP_T(), string::startsWith)) {
            playerCommandPreprocessEvent.setMessage(CP_Oq.DISABLED_COMMANDS_REPLACE.CP_d());
        }
        if (stringArray == null) {
            PacketWrapper.CP_e(new int[5]);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x7E7520A7B42CL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00c1\u00b5\u00ac\u009d\u00fc\u00ad\u00e1d\u0004o~\u00c9R\u0087\u0017r\u00e1<\u00c7\u00ab5\u00e1C\u00d0\u0001\u0005y\u00ef\u00ed\u00dcN\u00c9\u00cf\u00f6g\u009cFF\u00efI\u0003\u0019\u00b4`\u00d8\u0019{\u0093\fsz\u00df\u00ad\u00f41\u00a7".getBytes("ISO-8859-1"));
                b = CP_Qg.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }
}
