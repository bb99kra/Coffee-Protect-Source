/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.painting;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_T2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.painting.CP_G0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public class StaticPaintingVariant
extends CP_T2
implements CP_G0 {
    private final int width;
    private final int height;
    private final ResourceLocation assetId;
    private final @Nullable Component title;
    private final @Nullable Component author;
    private static String[] CP_J;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long g;
    private static transient /* synthetic */ String RHihhKXiMc = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public StaticPaintingVariant(int n, int n2, ResourceLocation resourceLocation) {
        this(null, n, n2, resourceLocation, null, null);
    }

    public StaticPaintingVariant(int n, int n2, ResourceLocation resourceLocation, @Nullable Component component, @Nullable Component component2) {
        this(null, n, n2, resourceLocation, component, component2);
    }

    @ApiStatus.Internal
    public StaticPaintingVariant(@Nullable TypesBuilderData typesBuilderData, int n, int n2, ResourceLocation resourceLocation, @Nullable Component component, @Nullable Component component2) {
        super(typesBuilderData);
        this.width = n;
        this.height = n2;
        this.assetId = resourceLocation;
        this.title = component;
        this.author = component2;
    }

    @Override
    public CP_G0 copy(@Nullable TypesBuilderData typesBuilderData) {
        return new StaticPaintingVariant(typesBuilderData, this.width, this.height, this.assetId, this.title, this.author);
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public ResourceLocation getAssetId() {
        return this.assetId;
    }

    @Override
    public @Nullable Component getTitle() {
        return this.title;
    }

    @Override
    public @Nullable Component getAuthor() {
        return this.author;
    }

    @Override
    public boolean deepEquals(@Nullable Object object) {
        int n;
        StaticPaintingVariant staticPaintingVariant;
        String[] stringArray;
        block14: {
            int n2;
            block13: {
                long l = b ^ 0x3A2850C16145L;
                stringArray = StaticPaintingVariant.CP_R();
                Object object2 = this;
                if (stringArray != null) {
                    if (object2 == object) {
                        return true;
                    }
                    object2 = object;
                }
                if (stringArray != null) {
                    if (!(object2 instanceof StaticPaintingVariant)) {
                        return false;
                    }
                    object2 = object;
                }
                staticPaintingVariant = (StaticPaintingVariant)object2;
                int n2 = this.width;
                n2 = staticPaintingVariant.width;
                if (stringArray == null) break block13;
                if (n != n2) {
                    return false;
                }
                n = this.height;
                if (stringArray == null) break block14;
                n2 = staticPaintingVariant.height;
            }
            if (n != n2) {
                return false;
            }
            n = this.assetId.equals(staticPaintingVariant.assetId) ? 1 : 0;
        }
        if (stringArray != null) {
            if (!n) {
                return false;
            }
            n = Objects.equals(this.title, staticPaintingVariant.title);
        }
        if (stringArray != null) {
            if (!n) {
                return false;
            }
            n = Objects.equals(this.author, staticPaintingVariant.author);
        }
        return n;
    }

    @Override
    public int deepHashCode() {
        return Objects.hash(this.width, this.height, this.assetId, this.title, this.author);
    }

    @Override
    public String toString() {
        long l = b ^ 0x43476F427942L;
        return (String)((Object)StaticPaintingVariant.a("p", (int)17210, (long)(0x29B0C0C2D58E5497L ^ l))) + this.width + (String)((Object)StaticPaintingVariant.a("p", (int)17907, (long)(0x2E2A2E55506A5258L ^ l))) + this.height + (String)((Object)StaticPaintingVariant.a("p", (int)28291, (long)(0x5ED04A3A3EF7F92FL ^ l))) + this.assetId + (String)((Object)StaticPaintingVariant.a("p", (int)16274, (long)(0x3C59FB1F18FFA83CL ^ l))) + this.title + (String)((Object)StaticPaintingVariant.a("p", (int)1559, (long)(0x1BD319FF4B4811B8L ^ l))) + this.author + (char)g;
    }

    public static void CP_Y(String[] stringArray) {
        CP_J = stringArray;
    }

    public static String[] CP_R() {
        return CP_J;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    StaticPaintingVariant.b = CP_s.a(-3311518023621028285L, -219214675398274824L, MethodHandles.lookup().lookupClass()).a(73112511093046L);
                    StaticPaintingVariant.f = new HashMap<K, V>(13);
                    StaticPaintingVariant.CP_Y(new String[2]);
                    var5 = StaticPaintingVariant.b ^ 9990710889681L;
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[5];
                    var12_4 = 0;
                    var11_5 = "se\u00cc\u009f\u008f\u00a7S\u008c\u00bb\u00c3\u00975\u0010;\u00eeT\u00eb\u00d3\n\u0004\u00faP\u0016<\u00ed\u008d\u00b1\u00c3\u0088\u0083D\u00fc \u00ca:\u0003\u0000\u00d9\u008a\u008c\u00f5\u00cb13\u0019\u00c1\u009b^e\u00a3\u00d7\u00d7M\u001b6~\u00c9r\u00ba\u00a5\u008fnO\u00a0K8\u00c4\u00b0\u00ba\u008a\u00e5\u00dc\u00e8\u00f06U\u00d6\u00ee\u00fd\u00ce\u009d\u00e9\u0086u\u00ba\u00ab\u00da\u000e\u00ad\u00c1\u009a\u00ab\u009b\u00fek\u00d8\u00c6\u00c7{\u008c}\u00f6Z,\u00e4#\u00dd\u00e4n\u00d42lJ\u00ccB\u00bd\u0087\u001b:4+\u0000";
                    var13_6 = "se\u00cc\u009f\u008f\u00a7S\u008c\u00bb\u00c3\u00975\u0010;\u00eeT\u00eb\u00d3\n\u0004\u00faP\u0016<\u00ed\u008d\u00b1\u00c3\u0088\u0083D\u00fc \u00ca:\u0003\u0000\u00d9\u008a\u008c\u00f5\u00cb13\u0019\u00c1\u009b^e\u00a3\u00d7\u00d7M\u001b6~\u00c9r\u00ba\u00a5\u008fnO\u00a0K8\u00c4\u00b0\u00ba\u008a\u00e5\u00dc\u00e8\u00f06U\u00d6\u00ee\u00fd\u00ce\u009d\u00e9\u0086u\u00ba\u00ab\u00da\u000e\u00ad\u00c1\u009a\u00ab\u009b\u00fek\u00d8\u00c6\u00c7{\u008c}\u00f6Z,\u00e4#\u00dd\u00e4n\u00d42lJ\u00ccB\u00bd\u0087\u001b:4+\u0000".length();
                    var10_7 = 32;
                    var9_8 = -1;
lbl21:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl26:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = StaticPaintingVariant.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u0088\u00ad\u00a1n1\u00ae\u00c6\u0088\u0005C\u00ba\u00cb\u0019\u00ef\u0011\u00a9;, v\u00ae\u00fd$\u0091\u008c\u00e9>\u00fc\u0097y3z \u0005l\u00ca\u009f\u0081HX\u00a35\u0010i\u000eG\u0086\u008e\u00fc\u0007\r\u00ac\u0099_\u00eb\u00bcN\u0013'v+\u00dc\u00cb`k";
                        var13_6 = "\u0088\u00ad\u00a1n1\u00ae\u00c6\u0088\u0005C\u00ba\u00cb\u0019\u00ef\u0011\u00a9;, v\u00ae\u00fd$\u0091\u008c\u00e9>\u00fc\u0097y3z \u0005l\u00ca\u009f\u0081HX\u00a35\u0010i\u000eG\u0086\u008e\u00fc\u0007\r\u00ac\u0099_\u00eb\u00bcN\u0013'v+\u00dc\u00cb`k".length();
                        var10_7 = 32;
                        var9_8 = -1;
lbl35:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl40:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = StaticPaintingVariant.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
                switch (v5) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl52:
                    // 1 sources

                    ** continue;
                }
            }
            StaticPaintingVariant.d = var14_3;
            StaticPaintingVariant.e = new String[5];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl66:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = 8563956361378909491L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        StaticPaintingVariant.g = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x39C1;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/painting/StaticPaintingVariant", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            StaticPaintingVariant.e[n2] = StaticPaintingVariant.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = StaticPaintingVariant.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/painting/StaticPaintingVariant" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(StaticPaintingVariant.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

