/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_AS;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_OG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_d2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_xl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_xw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_xm
extends CP_xl {
    int CP_W;
    byte[] CP_c;
    String CP_o;
    Instant CP_B;
    long CP_P;
    CP_AS CP_U;
    @Nullable
    Component CP_K;
    CP_d2 CP_Z;
    CP_OG CP_w;
    private static final long a = CP_s.a(-8806765314095255380L, 9195170564708604800L, MethodHandles.lookup().lookupClass()).a(274083291729091L);
    private static final String b;
    private static transient /* synthetic */ String pJZFOqoKOl = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_xm(UUID uUID, int n, byte[] byArray, String string, Instant instant, long l, CP_AS ilIlAS, @Nullable Component component, CP_d2 ilIld2, CP_OG ilIlOG) {
        long l2 = a ^ 0x534A0426D9F5L;
        super(Component.text(string), ilIlOG.CP_J(), uUID);
        this.CP_W = n;
        this.CP_c = byArray;
        this.CP_o = string;
        this.CP_B = instant;
        this.CP_P = l;
        this.CP_U = ilIlAS;
        this.CP_K = component;
        boolean bl = CP_xw.CP_v();
        try {
            this.CP_Z = ilIld2;
            this.CP_w = ilIlOG;
            if (bl) {
                PacketWrapper.CP_e(new int[5]);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CP_xm.a(unsupportedOperationException);
        }
    }

    public int CP_R() {
        return this.CP_W;
    }

    public void CP_P(int n) {
        this.CP_W = n;
    }

    public byte[] CP_g() {
        return this.CP_c;
    }

    public void CP_X(byte[] byArray) {
        this.CP_c = byArray;
    }

    @Override
    public Component CP_b() {
        return Component.text(this.CP_o);
    }

    @Override
    @Deprecated
    public void CP_v(Component component) {
        long l = a ^ 0x482E08AFC274L;
        throw new UnsupportedOperationException(b);
    }

    public String CP_r() {
        return this.CP_o;
    }

    public void CP_q(String string) {
        this.CP_o = string;
    }

    public Instant CP_l() {
        return this.CP_B;
    }

    public void CP_d(Instant instant) {
        this.CP_B = instant;
    }

    public long CP_c() {
        return this.CP_P;
    }

    public void CP_V(long l) {
        this.CP_P = l;
    }

    public CP_AS CP_a() {
        return this.CP_U;
    }

    public void CP_j(CP_AS ilIlAS) {
        this.CP_U = ilIlAS;
    }

    public Optional<Component> CP_U() {
        return Optional.ofNullable(this.CP_K);
    }

    public void CP_w(@Nullable Component component) {
        this.CP_K = component;
    }

    public CP_d2 CP_s() {
        return this.CP_Z;
    }

    public void CP_n(CP_d2 ilIld2) {
        this.CP_Z = ilIld2;
    }

    public CP_OG CP_J() {
        return this.CP_w;
    }

    public void CP_I(CP_OG ilIlOG) {
        this.CP_w = ilIlOG;
    }

    @Deprecated
    public CP_OG CP_w() {
        return this.CP_w;
    }

    @Deprecated
    public void CP_x(CP_OG ilIlOG) {
        this.CP_w = ilIlOG;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0xDD009D42904L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0086\u0093\u00b26;\u00eb\u0003i\u00e4\u00f6g\u00aa\u00a0\u00a0a\u009aS\u00a9b\u00cf/;\u00b8\u00ddik\t\u000bS\u00a7C\u0014m\u0016S\u00b7\u00c4\u00e8(\u0011\u00afz\u00d5;\u00b7\bk\u00e2w\u00bb8\u00de\u00e1\u00d0>\u00a5\u00bb\u00ce\u00c3\u009f\u009dz\u00f3?B'\u00a4\u00c2$TL\u00c59T\u00db\u00a35\u00b4k%\u00f1\u008c\n\u00b0\u00a6\u00dc\u00af\u00a3\u0080\u0081\u0086\u009a\u00b7\u00d1A\u0013\u0097K\u001db\u00b6\u0087\u00dd\u00a4\u0000\u00d0\u000e\u0087Z\n\u0082\u00b2\t\u00b4G\u0014\u00dcG\u0013\u00ce\u00cal\u00c4B\u00bc(1g".getBytes("ISO-8859-1"));
                b = CP_xm.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
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

