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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

@CheckInfo(CP_J="Invalid Chunk Batch Ack", CP_M="Checks for invalid chunk batch ack packets")
public class InvalidChunkBatchAckCheck
extends Check {
    private static final long b = CP_s.a(6047176657027930342L, -4360429374762929747L, MethodHandles.lookup().lookupClass()).a(252792819422161L);
    private static final String d;
    private static transient /* synthetic */ String LMWxVwfclg = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public InvalidChunkBatchAckCheck(UserData ilIlTM) {
        super(ilIlTM, CP_Oq.CHECKS_INVALID_CHUNK_BATCH_ACK_ENABLED.CP_t());
    }

    @Override
    public CheckResult CP_h(PacketReceiveEvent packetReceiveEvent) {
        block6: {
            float f;
            block5: {
                int n;
                block4: {
                    long l = b ^ 0x46B40847A1F1L;
                    String string = InvalidPositionCheck.CP_q();
                    if (packetReceiveEvent.getPacketType() != CP_nN.CHUNK_BATCH_ACK) {
                        return null;
                    }
                    CP_JO ilIlJO = new CP_JO(packetReceiveEvent);
                    f = ilIlJO.CP_g();
                    n = CP_yR.CP_R(f);
                    if (string != null) break block4;
                    if (n != 0) break block5;
                    float f2 = f - 0.0f;
                    n = f2 == 0.0f ? 0 : (f2 < 0.0f ? -1 : 1);
                }
                if (n >= 0) break block6;
            }
            return new CheckResult(this, d + f);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x283E6F159E55L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("z\u00e3\u00beH\u00d2\u0000\u0015\u0099N\u000fKb\u00a9e\u00d1\u00cf".getBytes("ISO-8859-1"));
                d = InvalidChunkBatchAckCheck.b(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
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
