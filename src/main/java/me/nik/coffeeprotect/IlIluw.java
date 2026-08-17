/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  org.bukkit.GameMode
 *  org.bukkit.entity.Player
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlTE;
import me.nik.coffeeprotect.IlIlTM;
import me.nik.coffeeprotect.IlIlTV;
import me.nik.coffeeprotect.IlIljl;
import me.nik.coffeeprotect.IlIlu7;
import me.nik.coffeeprotect.IlIluV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

@IlIljl(IlIlJ="Invalid Spectate", IlIlM="Checks for invalid spectate packets")
public class IlIluw
extends IlIluV {
    private static final long b = IlIls.a((long)945157817482135844L, (long)-3394171564546458896L, MethodHandles.lookup().lookupClass()).a(56700329974101L);
    private static final String d;
    private static final long e;
    private static transient /* synthetic */ String keohIeDGay = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIluw(IlIlTM ilIlTM) {
        super(ilIlTM, IlIlOq.CHECKS_INVALID_SPECTATE_ENABLED.IlIlt());
    }

    @Override
    public IlIlTV IlIlh(PacketReceiveEvent packetReceiveEvent) {
        block4: {
            Object object;
            block5: {
                long l = b ^ 0x56ADBEDE9C9BL;
                String string = IlIlu7.IlIlq();
                if (packetReceiveEvent.getPacketType() != IlIlnN.SPECTATE) break block4;
                object = this.IlIlw;
                if (string != null) break block5;
                if (((IlIlTM)object).IlIlG() <= e) break block4;
                object = packetReceiveEvent.getPlayer();
            }
            if (((Player)object).getGameMode() != GameMode.SPECTATOR) {
                return new IlIlTE(this, d);
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x3FA181A1466L;
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
        byte[] byArray3 = cipher.doFinal("\u00bf\u00e3\u0012\u00eb\u001a>s#\u0015d\u00e3\u00f9\u00f6\u009c\\\u00a8}B\u00b3[#\u00af\u001f\u00a7".getBytes("ISO-8859-1"));
        d = IlIluw.b(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = -6544110808795604417L;
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

