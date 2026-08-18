/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.auto.service.AutoService
 *  me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.serializer.json.JSONComponentSerializer$Provider
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_f;

import com.google.auto.service.AutoService;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_TJ;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_jU;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_nx;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_oV;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.serializer.json.JSONComponentSerializer;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.kyori.adventure.util.Services;

@ApiStatus.Internal
@AutoService(value={JSONComponentSerializer.Provider.class})
public final class CP_J
implements CP_jU,
Services.Fallback {
    private static String[] CP_P;
    private static final long a;
    private static final String b;
    private static transient /* synthetic */ String uvZaQWLUvD = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Override
    @NotNull
    public CP_nx CP_H() {
        return CP_oV.CP_F();
    }

    @Override
    @NotNull
    public @NotNull Supplier<@NotNull CP_TJ> CP_f() {
        return CP_oV::CP_Q;
    }

    public String toString() {
        long l = a ^ 0x72F6F01789C1L;
        return b;
    }

    public static void CP_T(String[] stringArray) {
        CP_P = stringArray;
    }

    public static String[] CP_y() {
        return CP_P;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(-7741023641863354319L, -8033372539790993595L, MethodHandles.lookup().lookupClass()).a(280615706826780L);
        long l = a ^ 0x5249EBD4083FL;
        CP_J.CP_T(new String[2]);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0083\u0005\u00be\u00c7\u009c\u00a6#(\u00b7\u0007ex\u00df\u0081\u00ebxn7\u0013\u00c5%>M\u00ac#\u00c0\u00fe^\u00fb\u0082\u00f8\u00fb\u00fc.\u00a4)\u00f6\u00ed\f\u00d2\" \u00b0_[\u00cc24G\u00e74i8\u00aa\u00faC\f\u0018\u00b3U?\u00ba\u001f\u00b9".getBytes("ISO-8859-1"));
                b = CP_J.a(byArray3).intern();
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

