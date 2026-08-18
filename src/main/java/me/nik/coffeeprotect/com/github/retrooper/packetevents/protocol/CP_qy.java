/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_Tg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_hC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_hU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_o2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_oL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_rL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_rl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_x4;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_J5;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JD;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JE;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Ja;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Jc;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Jp;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_vO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_vh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_vq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public final class CP_qy
extends Enum<CP_qy>
implements CP_oL,
CP_rl {
    public static final /* enum */ CP_qy CLIENT_SETTINGS;
    public static final /* enum */ CP_qy PLUGIN_MESSAGE;
    public static final /* enum */ CP_qy CONFIGURATION_END_ACK;
    public static final /* enum */ CP_qy KEEP_ALIVE;
    public static final /* enum */ CP_qy PONG;
    public static final /* enum */ CP_qy RESOURCE_PACK_STATUS;
    public static final /* enum */ CP_qy COOKIE_RESPONSE;
    public static final /* enum */ CP_qy SELECT_KNOWN_PACKS;
    public static final /* enum */ CP_qy CUSTOM_CLICK_ACTION;
    public static final /* enum */ CP_qy ACCEPT_CODE_OF_CONDUCT;
    private static int CP_c;
    private static final Map<Byte, Map<Integer, CP_oL>> CP_UnderScore;
    private final int[] CP_T = new int[CP_hU.CP_A().CP_C().length];
    private final Class<? extends PacketWrapper<?>> CP_S;
    private static final CP_qy[] CP_V;
    private static String[] CP_D;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_qy[] values() {
        return (CP_qy[])CP_V.clone();
    }

    public static CP_qy valueOf(String string) {
        return Enum.valueOf(CP_qy.class, string);
    }

    private CP_qy(Class<? extends PacketWrapper<?>> clazz) {
        Arrays.fill(this.CP_T, -1);
        this.CP_S = clazz;
    }

    @Override
    public Class<? extends PacketWrapper<?>> CP_B() {
        return this.CP_S;
    }

    public static void CP_UnderScore() {
        CP_c = 0;
        CP_qy.CP_Z(CP_o2.values());
        CP_qy.CP_Z(CP_x4.values());
        CP_qy.CP_Z(CP_rL.values());
        CP_qy.CP_Z(CP_Tg.values());
    }

    private static void CP_Z(Enum<?>[] enumArray) {
        block2: {
            long l = a ^ 0x3416DD5DF55EL;
            int n = CP_c;
            PacketWrapper[] packetWrapperArray = CP_hU.CP_X();
            for (Enum<?> enum_ : enumArray) {
                int n2 = enum_.ordinal();
                CP_qy ilIlqy = CP_qy.valueOf(enum_.name());
                ilIlqy.CP_T[n] = n2;
                Map map = CP_UnderScore.computeIfAbsent((byte)n, CP_qy::lambda$loadPacketIds$0);
                map.put(n2, ilIlqy);
                if (packetWrapperArray == null) {
                    if (packetWrapperArray == null) continue;
                }
                break block2;
            }
            ++CP_c;
        }
    }

    @Nullable
    public static CP_oL CP_i(int n) {
        return CP_qy.CP_l(ClientVersion.CP_k(), n);
    }

    @Nullable
    public static CP_oL CP_l(ClientVersion clientVersion, int n) {
        CP_hU.CP_V();
        int n2 = CP_hU.CP_A().CP_G(clientVersion);
        Map<Integer, CP_oL> map = CP_UnderScore.get((byte)n2);
        return map.get(n);
    }

    @Deprecated
    public int CP_g() {
        return this.CP_g(ClientVersion.CP_k());
    }

    @Override
    public int CP_g(ClientVersion clientVersion) {
        CP_hU.CP_V();
        int n = CP_hU.CP_A().CP_G(clientVersion);
        return this.CP_T[n];
    }

    @Override
    public CP_hC CP_Y() {
        return CP_hC.CLIENT;
    }

    private static Map lambda$loadPacketIds$0(Byte by) {
        return new HashMap();
    }

    private static CP_qy[] CP_X() {
        long l = a ^ 0x1EA301A07B8L;
        CP_qy[] ilIlqyArray = new CP_qy[CP_qy.a("y", (int)12828, (long)(0x62370DC4D53FB647L ^ l))];
        ilIlqyArray[0] = CLIENT_SETTINGS;
        ilIlqyArray[1] = PLUGIN_MESSAGE;
        ilIlqyArray[2] = CONFIGURATION_END_ACK;
        ilIlqyArray[3] = KEEP_ALIVE;
        ilIlqyArray[4] = PONG;
        ilIlqyArray[5] = RESOURCE_PACK_STATUS;
        ilIlqyArray[CP_qy.a("y", (int)21883, (long)(0x17D2B09B93265121L ^ l))] = COOKIE_RESPONSE;
        ilIlqyArray[CP_qy.a("y", (int)21434, (long)(0x5CD2E435830557E2L ^ l))] = SELECT_KNOWN_PACKS;
        ilIlqyArray[CP_qy.a("y", (int)7369, (long)(0x3010A2A347349895L ^ l))] = CUSTOM_CLICK_ACTION;
        ilIlqyArray[CP_qy.a("y", (int)514, (long)(0x5F4CCD23AFFE865BL ^ l))] = ACCEPT_CODE_OF_CONDUCT;
        return ilIlqyArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    block19: {
                        CP_qy.a = CP_s.a(300971010369856013L, 1525534121713509800L, MethodHandles.lookup().lookupClass()).a(42604455120898L);
                        var20 = CP_qy.a ^ 74646657613052L;
                        if (CP_qy.CP_c() != null) {
                            CP_qy.CP_m(new String[2]);
                        }
                        var12_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var13_2 = 1; var13_2 < 8; ++var13_2) {
                            v2 = v2;
                            v2[var13_2] = (byte)(var20 << var13_2 * 8 >>> 56);
                        }
                        var12_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var11_3 = new String[10];
                        var17_4 = 0;
                        var16_5 = "\u00c3LS\u00b8/\u00dd\u00fe\u0091\n\u00fc;\u00b4P)\u00aa\u0019\u00f5\u00a1\u0098~\u00e1@\u00a5\u00ee\bA\u00b6_w\u0095bx*\u0018\u00e3\u0098\u00f9\u00f0H\"]V\u00ab\u00c4XT\u0006\u00e7,\u00eaHWW\u0012:\u008f\u00bf\u00c4\u0010F\u00b4-4*{Tz\u0014\u0005\u001f7\u00e9\u00c80?\u0018\u00d6\u00a9bs\u00a6S\u00d4-,\u008e=A\u00f5\u00af\u00df\u00cdis\u0092\u00a88\u00d8\u00c6\u0014\u0018\u0099i:\u00da\u00a8\u001f6\u00c8\u0089\u0085\u0006\u00d6\u00a8\u00fa\u00d4\u00e4&^u\u00a1sQ\u0000\u0099\u0010\u008em9\u00f5s\u001c\u00cc\u00fa\u00aa\u00836\u009cp\r\u00aa\u009d\u0018\u00b8Fp\ro\u00c8\u007f\u00c4\u00ee\u00058\u00984\u0090[\u009e\u0093\u00df\u00e90\u00c4>\u0011\u0006";
                        var18_6 = "\u00c3LS\u00b8/\u00dd\u00fe\u0091\n\u00fc;\u00b4P)\u00aa\u0019\u00f5\u00a1\u0098~\u00e1@\u00a5\u00ee\bA\u00b6_w\u0095bx*\u0018\u00e3\u0098\u00f9\u00f0H\"]V\u00ab\u00c4XT\u0006\u00e7,\u00eaHWW\u0012:\u008f\u00bf\u00c4\u0010F\u00b4-4*{Tz\u0014\u0005\u001f7\u00e9\u00c80?\u0018\u00d6\u00a9bs\u00a6S\u00d4-,\u008e=A\u00f5\u00af\u00df\u00cdis\u0092\u00a88\u00d8\u00c6\u0014\u0018\u0099i:\u00da\u00a8\u001f6\u00c8\u0089\u0085\u0006\u00d6\u00a8\u00fa\u00d4\u00e4&^u\u00a1sQ\u0000\u0099\u0010\u008em9\u00f5s\u001c\u00cc\u00fa\u00aa\u00836\u009cp\r\u00aa\u009d\u0018\u00b8Fp\ro\u00c8\u007f\u00c4\u00ee\u00058\u00984\u0090[\u009e\u0093\u00df\u00e90\u00c4>\u0011\u0006".length();
                        var15_7 = 24;
                        var14_8 = -1;
lbl21:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_8;
                            v4 = var16_5.substring(v3, v3 + var15_7);
                            v5 = -1;
                            break block19;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = CP_qy.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u0012\u0094y>\u00c04\u00d0\u00e7\u00ce\u008e\u0088\u00bb\f\u00e4\u008bb\u0010\u00dd\u001fDu>\u0094B,\u0006Y\b\u00fcTE\\\u001e";
                            var18_6 = "\u0012\u0094y>\u00c04\u00d0\u00e7\u00ce\u008e\u0088\u00bb\f\u00e4\u008bb\u0010\u00dd\u001fDu>\u0094B,\u0006Y\b\u00fcTE\\\u001e".length();
                            var15_7 = 16;
                            var14_8 = -1;
lbl35:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_8;
                                v4 = var16_5.substring(v6, v6 + var15_7);
                                v5 = 0;
                                break block19;
                                break;
                            }
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = CP_qy.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            break block20;
                            break;
                        }
                    }
                    var19_9 = var12_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                CP_qy.d = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[9];
                var3_13 = 0;
                var4_14 = "E\u00c2\u00f4\u009d\u00c3\u00d0cb\u00ec\u001e\u0097C|\u0004\u00dc\u00fe\u00bf\u00d9x\u0084\u00f9\u00a3pLk\u0003\u00df]\u00df\u0081\u00b3\u008d\u00c0X\u00f7w\u00d2b\u00b7\u001f\f\u0086\\\u00e1\u00a515x\u00ca\u00db\u0016+\u00af\f\u0082\u009e";
                var5_15 = "E\u00c2\u00f4\u009d\u00c3\u00d0cb\u00ec\u001e\u0097C|\u0004\u00dc\u00fe\u00bf\u00d9x\u0084\u00f9\u00a3pLk\u0003\u00df]\u00df\u0081\u00b3\u008d\u00c0X\u00f7w\u00d2b\u00b7\u001f\f\u0086\\\u00e1\u00a515x\u00ca\u00db\u0016+\u00af\f\u0082\u009e".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block21;
                    break;
                }
lbl77:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00a7\u00db3\u00d5\t\u00efv\u00b8\u00d6\u008b\u00b3W%\u00f7\u008e\u00f1";
                    var5_15 = "\u00a7\u00db3\u00d5\t\u00efv\u00b8\u00d6\u008b\u00b3W%\u00f7\u008e\u00f1".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block22;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl103:
                // 1 sources

                ** continue;
            }
        }
        CP_qy.b = var6_12;
        CP_qy.c = new Integer[9];
        CP_qy.CLIENT_SETTINGS = new CP_qy(CP_vO.class);
        CP_qy.PLUGIN_MESSAGE = new CP_qy(CP_J5.class);
        CP_qy.CONFIGURATION_END_ACK = new CP_qy(CP_JD.class);
        CP_qy.KEEP_ALIVE = new CP_qy(CP_Jp.class);
        CP_qy.PONG = new CP_qy(CP_JV.class);
        CP_qy.RESOURCE_PACK_STATUS = new CP_qy(CP_JE.class);
        CP_qy.COOKIE_RESPONSE = new CP_qy(CP_vq.class);
        CP_qy.SELECT_KNOWN_PACKS = new CP_qy(CP_Ja.class);
        CP_qy.CUSTOM_CLICK_ACTION = new CP_qy(CP_vh.class);
        CP_qy.ACCEPT_CODE_OF_CONDUCT = new CP_qy(CP_Jc.class);
        CP_qy.CP_V = CP_qy.CP_X();
        CP_qy.CP_c = 0;
        CP_qy.CP_UnderScore = new HashMap<Byte, Map<Integer, CP_oL>>();
    }

    public static void CP_m(String[] stringArray) {
        CP_D = stringArray;
    }

    public static String[] CP_c() {
        return CP_D;
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x32BF;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_qy", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_qy.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_qy.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_qy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_qy.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

