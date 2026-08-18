/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.CP_Ai;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.CP_L;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.CP_Oy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.CP_hq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.CP_xp;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.StaticAttributeDisplayType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Ow;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Q9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class CP_fB {
    private static final VersionedRegistry<CP_L<?>> CP_f;
    public static final CP_L<CP_Oy> CP_a;
    public static final CP_L<CP_hq> CP_I;
    public static final CP_L<CP_xp> CP_u;
    private static transient /* synthetic */ String eaObkpUijE = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_fB() {
    }

    @ApiStatus.Internal
    public static <T extends CP_Ai> CP_L<T> CP_f(String string, CP_Q9<T> ilIlQ9, CP_Ow<T> ilIlOw) {
        return CP_f.define(string, typesBuilderData -> new StaticAttributeDisplayType((TypesBuilderData)typesBuilderData, ilIlQ9, ilIlOw));
    }

    public static VersionedRegistry<CP_L<?>> CP_b() {
        return CP_f;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = CP_s.a(1568250189601471893L, -6363294962630345119L, MethodHandles.lookup().lookupClass()).a(171315315263843L) ^ 61358076908619L;
                var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var9 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new String[4];
                var6_4 = 0;
                var5_5 = "T\u00d5\u008f\u00bb\u00c8q\u0081&\u0010B\u00f1\u009d\n\u00e1~D;\u00ed,\u00ab\u008e\u000e\u00aa\u00bf\u008b";
                var7_6 = "T\u00d5\u008f\u00bb\u00c8q\u0081&\u0010B\u00f1\u009d\n\u00e1~D;\u00ed,\u00ab\u008e\u000e\u00aa\u00bf\u008b".length();
                var4_7 = 8;
                var3_8 = -1;
lbl18:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl23:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = CP_fB.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00d4c\u00dd\u008a\u00917\u00bb\u0010\u00c9\u0086\u00aa\u0085x\u00c0U\u00b8G\u008b\fo\u009dN\u00c1m\b&\u000b\u00bb\u00a1\u001d\\\u0004\u0097";
                    var7_6 = "\u00d4c\u00dd\u008a\u00917\u00bb\u0010\u00c9\u0086\u00aa\u0085x\u00c0U\u00b8G\u008b\fo\u009dN\u00c1m\b&\u000b\u00bb\u00a1\u001d\\\u0004\u0097".length();
                    var4_7 = 24;
                    var3_8 = -1;
lbl32:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = CP_fB.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl49:
                // 1 sources

                ** continue;
            }
        }
        CP_fB.CP_f = new VersionedRegistry<T>(var0_3[2]);
        CP_fB.CP_a = CP_fB.CP_f(var0_3[3], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_z(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/attribute/CP_Oy;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_p(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.CP_Oy ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/attribute/CP_Oy;)V)());
        CP_fB.CP_I = CP_fB.CP_f(var0_3[0], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_F(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/attribute/CP_hq;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_U(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.CP_hq ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/attribute/CP_hq;)V)());
        CP_fB.CP_u = CP_fB.CP_f(var0_3[1], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_N(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/attribute/CP_xp;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_H(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.CP_xp ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/attribute/CP_xp;)V)());
        CP_fB.CP_f.unloadMappings();
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

