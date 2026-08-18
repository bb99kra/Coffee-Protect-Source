/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.CP_TE;
import me.nik.coffeeprotect.CP_TM;
import me.nik.coffeeprotect.CP_TV;
import me.nik.coffeeprotect.CP_jl;
import me.nik.coffeeprotect.CP_u7;
import me.nik.coffeeprotect.CP_uV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.entity.Player;

@CP_jl(CP_J="Invalid Abilities", CP_M="Checks for invalid abilities packets")
public class CP_uE
extends CP_uV {
    private static final long b = CP_s.a(-8003158481236764700L, 4972450649098962349L, MethodHandles.lookup().lookupClass()).a(7476736781404L);
    private static final String d;
    private static final long e;
    private static transient /* synthetic */ String hioehdlRCt = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_uE(CP_TM ilIlTM) {
        super(ilIlTM, CP_Oq.CHECKS_INVALID_ABILITIES_ENABLED.CP_t());
    }

    @Override
    public CP_TV CP_h(PacketReceiveEvent packetReceiveEvent) {
        block4: {
            long l;
            block5: {
                long l2 = b ^ 0x6211CF666634L;
                String string = CP_u7.CP_q();
                if (packetReceiveEvent.getPacketType() != CP_nN.PLAYER_ABILITIES) break block4;
                long l3 = this.CP_w.CP_G() - e;
                l = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                if (string != null) break block5;
                if (l <= 0) break block4;
                l = (long)((Player)packetReceiveEvent.getPlayer()).getAllowFlight();
            }
            if (l == false) {
                return new CP_TE(this, d);
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x3F86BC726D94L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        byte[] byArray3 = cipher.doFinal("X\u00b0b!Q&\u0005\u00a7e\u0016\u00d13<)~\u0016O\u0012\u00aa\u0019\u00d6\u00f2\u0084\u00be\u009ep\u0018\fe\u00be\u00bae".getBytes("ISO-8859-1"));
        d = CP_uE.b(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = -6299469486076323769L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                e = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static String b(byte[] byArray) {
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
