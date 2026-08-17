/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJO
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlTM;
import me.nik.coffeeprotect.IlIlTV;
import me.nik.coffeeprotect.IlIljl;
import me.nik.coffeeprotect.IlIlu7;
import me.nik.coffeeprotect.IlIluV;
import me.nik.coffeeprotect.IlIlyR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

@IlIljl(IlIlJ="Invalid Chunk Batch Ack", IlIlM="Checks for invalid chunk batch ack packets")
public class IlIluy
extends IlIluV {
    private static final long b = IlIls.a((long)6047176657027930342L, (long)-4360429374762929747L, MethodHandles.lookup().lookupClass()).a(252792819422161L);
    private static final String d;
    private static transient /* synthetic */ String LMWxVwfclg = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIluy(IlIlTM ilIlTM) {
        super(ilIlTM, IlIlOq.CHECKS_INVALID_CHUNK_BATCH_ACK_ENABLED.IlIlt());
    }

    @Override
    public IlIlTV IlIlh(PacketReceiveEvent packetReceiveEvent) {
        block6: {
            float f;
            block5: {
                int n;
                block4: {
                    long l = b ^ 0x46B40847A1F1L;
                    String string = IlIlu7.IlIlq();
                    if (packetReceiveEvent.getPacketType() != IlIlnN.CHUNK_BATCH_ACK) {
                        return null;
                    }
                    IlIlJO ilIlJO = new IlIlJO(packetReceiveEvent);
                    f = ilIlJO.IlIlg();
                    n = IlIlyR.IlIlR(f);
                    if (string != null) break block4;
                    if (n != 0) break block5;
                    float f2 = f - 0.0f;
                    n = f2 == 0.0f ? 0 : (f2 < 0.0f ? -1 : 1);
                }
                if (n >= 0) break block6;
            }
            return new IlIlTV(this, d + f);
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
                d = IlIluy.b(byArray3).intern();
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

