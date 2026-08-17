/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
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
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlTM;
import me.nik.coffeeprotect.IlIlZ6;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.IlIlvF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class IlIlQg
implements Listener {
    private final CoffeeProtect IlIlX;
    private static final long a = IlIls.a((long)-8832167801685493084L, (long)-6237869816496420359L, MethodHandles.lookup().lookupClass()).a(74673078740261L);
    private static final String b;
    private static transient /* synthetic */ String ymNfXYfvCL = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlQg(CoffeeProtect coffeeProtect) {
        this.IlIlX = coffeeProtect;
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void IlIlp(PlayerCommandPreprocessEvent playerCommandPreprocessEvent) {
        String[] stringArray;
        block14: {
            IlIlTM ilIlTM;
            IlIlTM ilIlTM2;
            block13: {
                Player player;
                block12: {
                    int n;
                    block10: {
                        block11: {
                            long l = a ^ 0x11FA681E907DL;
                            player = playerCommandPreprocessEvent.getPlayer();
                            stringArray = IlIlvF.IlIlo();
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
                    IlIlrW.IlIlU(stringArray2);
                    return;
                }
                ilIlTM = ilIlTM2 = this.IlIlX.IlIlF().IlIlR(player);
                if (stringArray == null) break block13;
                if (ilIlTM == null) break block14;
                ilIlTM = ilIlTM2;
            }
            if (stringArray != null) {
                if (ilIlTM.IlIls() <= IlIlOq.DISABLED_COMMANDS_COOLDOWN.IlIlq()) {
                    playerCommandPreprocessEvent.setCancelled(true);
                    return;
                }
                ilIlTM = ilIlTM2;
            }
            ilIlTM.IlIlP();
        }
        String string = playerCommandPreprocessEvent.getMessage().toLowerCase();
        if (IlIlZ6.IlIli(IlIlOq.DISABLED_COMMANDS_COMMANDS.IlIlT(), string::startsWith)) {
            playerCommandPreprocessEvent.setMessage(IlIlOq.DISABLED_COMMANDS_REPLACE.IlIld());
        }
        if (stringArray == null) {
            PacketWrapper.IlIle((int[])new int[5]);
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
                b = IlIlQg.a(byArray3).intern();
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

