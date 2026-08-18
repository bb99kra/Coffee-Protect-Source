/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.UserData;
import me.nik.coffeeprotect.CheckResult;
import me.nik.coffeeprotect.CheckInfo;
import me.nik.coffeeprotect.InvalidPositionCheck;
import me.nik.coffeeprotect.Check;
import me.nik.coffeeprotect.CP_yR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

@CheckInfo(CP_J="Invalid Debug Subscription Request", CP_M="Checks for invalid debug subscription request packets")
public class InvalidDebugSubscriptionRequestCheck
extends Check {
    private static final long b = CP_s.a(3741001988097124137L, 7221391009565020060L, MethodHandles.lookup().lookupClass()).a(16739620309645L);
    private static final String d;
    private static final long e;
    private static transient /* synthetic */ String HBIZHfCboD = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public InvalidDebugSubscriptionRequestCheck(UserData ilIlTM) {
        super(ilIlTM, CP_Oq.CHECKS_INVALID_DEBUG_SUBSCRIPTION_REQUEST_ENABLED.CP_t());
    }

    @Override
    public CheckResult CP_h(PacketReceiveEvent packetReceiveEvent) {
        block6: {
            int n;
            block5: {
                int n2;
                block4: {
                    long l = b ^ 0x6DC093720918L;
                    String string = InvalidPositionCheck.CP_q();
                    if (packetReceiveEvent.getPacketType() != CP_nN.DEBUG_SUBSCRIPTION_REQUEST) {
                        return null;
                    }
                    CP_JR ilIlJR = new CP_JR(packetReceiveEvent);
                    n = ilIlJR.CP_V().size();
                    n2 = CP_yR.CP_j(n);
                    if (string != null) break block4;
                    if (n2 != 0) break block5;
                    n2 = n;
                }
                if (n2 <= (int)e) break block6;
            }
            return new CheckResult(this, d + n);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x366A50D8F5FAL;
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
        byte[] byArray3 = cipher.doFinal("R\u00d4\u008e\u00ab\u008b\u00a2\u00bb\u009fh\u00f1\u009f\u0002\u00162\u0015\u001e".getBytes("ISO-8859-1"));
        d = InvalidDebugSubscriptionRequestCheck.b(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = 9063675647762037316L;
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
