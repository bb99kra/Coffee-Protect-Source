/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.TypeAdapter
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonWriter
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_GB;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_X5;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_xu;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

final class CP_Ar
extends TypeAdapter<CP_X5> {
    static final TypeAdapter<CP_X5> CP_o;
    static final TypeAdapter<CP_X5> CP_W;
    private final boolean CP_y;
    private static final long a;
    private static final String b;
    private static final long c;
    private static transient /* synthetic */ String ntUqWbqzvJ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_Ar(boolean bl) {
        this.CP_y = bl;
    }

    public void CP_a(JsonWriter jsonWriter, CP_X5 ilIlX5) throws IOException {
        block12: {
            boolean bl;
            String[] stringArray;
            block10: {
                long l = a ^ 0x725579084481L;
                stringArray = CP_GB.CP_C();
                try {
                    block11: {
                        try {
                            try {
                                bl = ilIlX5 instanceof CP_xu;
                                if (stringArray == null) break block10;
                                if (!bl) break block11;
                            }
                            catch (IOException iOException) {
                                throw CP_Ar.a(iOException);
                            }
                            jsonWriter.value(CP_xu.CP_q.key((CP_xu)ilIlX5));
                            if (stringArray != null) break block12;
                        }
                        catch (IOException iOException) {
                            throw CP_Ar.a(iOException);
                        }
                    }
                    bl = this.CP_y;
                }
                catch (IOException iOException) {
                    throw CP_Ar.a(iOException);
                }
            }
            try {
                block13: {
                    try {
                        if (!bl) break block13;
                        jsonWriter.value(CP_xu.CP_q.key(CP_xu.CP_X(ilIlX5)));
                        if (stringArray != null) break block12;
                    }
                    catch (IOException iOException) {
                        throw CP_Ar.a(iOException);
                    }
                }
                jsonWriter.value(CP_Ar.CP_Y(ilIlX5));
            }
            catch (IOException iOException) {
                throw CP_Ar.a(iOException);
            }
        }
    }

    private static String CP_Y(CP_X5 ilIlX5) {
        long l = a ^ 0x654B6101382BL;
        return String.format(Locale.ROOT, b, Character.valueOf((char)c), ilIlX5.CP_e());
    }

    @Nullable
    public CP_X5 CP_y(JsonReader jsonReader) throws IOException {
        CP_X5 ilIlX5;
        long l = a ^ 0x33D6DF1C1D31L;
        CP_X5 ilIlX52 = CP_Ar.CP_F(jsonReader.nextString());
        try {
            if (ilIlX52 == null) {
                return null;
            }
        }
        catch (IOException iOException) {
            throw CP_Ar.a(iOException);
        }
        try {
            ilIlX5 = this.CP_y ? CP_xu.CP_X(ilIlX52) : ilIlX52;
        }
        catch (IOException iOException) {
            throw CP_Ar.a(iOException);
        }
        return ilIlX5;
    }

    @Nullable
    static CP_X5 CP_F(@NotNull String string) {
        long l = a ^ 0x4AB63EBDB979L;
        String[] stringArray = CP_GB.CP_C();
        Object object = string;
        if (stringArray != null) {
            if (((String)object).startsWith("#")) {
                return CP_X5.CP_N(string);
            }
            object = CP_xu.CP_q.value(string);
        }
        return (CP_X5)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(-623516435521430455L, -6519443547651597339L, MethodHandles.lookup().lookupClass()).a(97288995097112L);
        long l = a ^ 0x3B1970A0CFA7L;
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
        byte[] byArray3 = cipher.doFinal("Y\u00ae\u0084%c\u00dc\u00db5".getBytes("ISO-8859-1"));
        b = CP_Ar.a(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = -2728465465287432273L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                c = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                CP_o = new CP_Ar(false).nullSafe();
                CP_W = new CP_Ar(true).nullSafe();
                return;
            }
            byArray5 = byArray5;
            byArray5[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
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

