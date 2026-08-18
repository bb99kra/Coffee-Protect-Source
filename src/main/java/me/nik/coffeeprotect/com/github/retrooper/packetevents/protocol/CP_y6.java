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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public final class CP_y6
extends Enum<CP_y6> {
    public static final /* enum */ CP_y6 KEEP_ALIVE;
    public static final /* enum */ CP_y6 CHAT_MESSAGE;
    public static final /* enum */ CP_y6 INTERACT_ENTITY;
    public static final /* enum */ CP_y6 PLAYER_FLYING;
    public static final /* enum */ CP_y6 PLAYER_POSITION;
    public static final /* enum */ CP_y6 PLAYER_ROTATION;
    public static final /* enum */ CP_y6 PLAYER_POSITION_AND_ROTATION;
    public static final /* enum */ CP_y6 PLAYER_DIGGING;
    public static final /* enum */ CP_y6 PLAYER_BLOCK_PLACEMENT;
    public static final /* enum */ CP_y6 HELD_ITEM_CHANGE;
    public static final /* enum */ CP_y6 ANIMATION;
    public static final /* enum */ CP_y6 ENTITY_ACTION;
    public static final /* enum */ CP_y6 STEER_VEHICLE;
    public static final /* enum */ CP_y6 CLOSE_WINDOW;
    public static final /* enum */ CP_y6 CLICK_WINDOW;
    public static final /* enum */ CP_y6 WINDOW_CONFIRMATION;
    public static final /* enum */ CP_y6 CREATIVE_INVENTORY_ACTION;
    public static final /* enum */ CP_y6 CLICK_WINDOW_BUTTON;
    public static final /* enum */ CP_y6 UPDATE_SIGN;
    public static final /* enum */ CP_y6 PLAYER_ABILITIES;
    public static final /* enum */ CP_y6 TAB_COMPLETE;
    public static final /* enum */ CP_y6 CLIENT_SETTINGS;
    public static final /* enum */ CP_y6 CLIENT_STATUS;
    public static final /* enum */ CP_y6 PLUGIN_MESSAGE;
    public static final /* enum */ CP_y6 SPECTATE;
    public static final /* enum */ CP_y6 RESOURCE_PACK_STATUS;
    private static final /* synthetic */ CP_y6[] CP_H;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_y6[] values() {
        return (CP_y6[])CP_H.clone();
    }

    public static CP_y6 valueOf(String string) {
        return Enum.valueOf(CP_y6.class, string);
    }

    private static /* synthetic */ CP_y6[] CP_G() {
        long l = a ^ 0x309A6266A8D4L;
        CP_y6[] ilIly6Array = new CP_y6[CP_y6.a("q", (int)16777, (long)(0x3CD97EAE09218726L ^ l))];
        ilIly6Array[0] = KEEP_ALIVE;
        ilIly6Array[1] = CHAT_MESSAGE;
        ilIly6Array[2] = INTERACT_ENTITY;
        ilIly6Array[3] = PLAYER_FLYING;
        ilIly6Array[4] = PLAYER_POSITION;
        ilIly6Array[5] = PLAYER_ROTATION;
        ilIly6Array[CP_y6.a("q", (int)5830, (long)(0x7D4C43816B7B5061L ^ l))] = PLAYER_POSITION_AND_ROTATION;
        ilIly6Array[CP_y6.a("q", (int)17091, (long)(0x19D066396E71847FL ^ l))] = PLAYER_DIGGING;
        ilIly6Array[CP_y6.a("q", (int)19889, (long)(0x1D582140FF140B2FL ^ l))] = PLAYER_BLOCK_PLACEMENT;
        ilIly6Array[CP_y6.a("q", (int)8337, (long)(0x2566D34E866C6600L ^ l))] = HELD_ITEM_CHANGE;
        ilIly6Array[CP_y6.a("q", (int)30064, (long)(0x334296FA34533D3L ^ l))] = ANIMATION;
        ilIly6Array[CP_y6.a("q", (int)28916, (long)(0xA9F296E5E73B641L ^ l))] = ENTITY_ACTION;
        ilIly6Array[CP_y6.a("q", (int)8042, (long)(0x6252406F97ED9C7L ^ l))] = STEER_VEHICLE;
        ilIly6Array[CP_y6.a("q", (int)8322, (long)(0x1AE7C32ED2B5E623L ^ l))] = CLOSE_WINDOW;
        ilIly6Array[CP_y6.a("q", (int)10693, (long)(0xC5E257012CBEF58L ^ l))] = CLICK_WINDOW;
        ilIly6Array[CP_y6.a("q", (int)27677, (long)(0x77C80E44EC9EAAA4L ^ l))] = WINDOW_CONFIRMATION;
        ilIly6Array[CP_y6.a("q", (int)20374, (long)(0x2F5CB407B07F8921L ^ l))] = CREATIVE_INVENTORY_ACTION;
        ilIly6Array[CP_y6.a("q", (int)20269, (long)(0x548A5AFE05770988L ^ l))] = CLICK_WINDOW_BUTTON;
        ilIly6Array[CP_y6.a("q", (int)13235, (long)(0x3EE1E771C5E0F509L ^ l))] = UPDATE_SIGN;
        ilIly6Array[CP_y6.a("q", (int)6007, (long)(0x31BE133F4123D1C3L ^ l))] = PLAYER_ABILITIES;
        ilIly6Array[CP_y6.a("q", (int)7118, (long)(0x55F5AFC0982D5D7DL ^ l))] = TAB_COMPLETE;
        ilIly6Array[CP_y6.a("q", (int)14082, (long)(0x6E848BF80382F1AEL ^ l))] = CLIENT_SETTINGS;
        ilIly6Array[CP_y6.a("q", (int)11474, (long)(0x7AB04F04FC256A70L ^ l))] = CLIENT_STATUS;
        ilIly6Array[CP_y6.a("q", (int)11937, (long)(0x187E576BC60B681FL ^ l))] = PLUGIN_MESSAGE;
        ilIly6Array[CP_y6.a("q", (int)28135, (long)(0x6C734B1744B72B51L ^ l))] = SPECTATE;
        ilIly6Array[CP_y6.a("q", (int)3568, (long)(0xA07C4405A31CB4DL ^ l))] = RESOURCE_PACK_STATUS;
        return ilIly6Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_y6.a = CP_s.a(5019851508713924776L, -5430625027942885912L, MethodHandles.lookup().lookupClass()).a(13024030360146L);
                        var20 = CP_y6.a ^ 54657982210947L;
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
                        var11_3 = new String[26];
                        var17_4 = 0;
                        var16_5 = ":5\u00ce\f\u00ecv%\u00a6t\u001d\u0084\u00d7\u00d7\u00ee\u00d7C\u0010\u0095&\u001bg\u00a5gQvr\u00a8G\u00e4u\u00ec0\u00c9\u0018\u0095&\u001bg\u00a5gQv~\u00e1{\"d\u00f8\u00da.\u00b2Nai\u00a5\u00a1\u00a6y \u00f8q1u(\u00c5^\u00b1^\u0088\u00f1J\u0099\u00a3\u00d0\u0095Y\u00aa\u001aw\u00a7\u0019\u00a7\u0087#<@\u00cd\u0000i\u00c7\t\u0010\u00f5\u00deKp\u001d\u0089:\u00b9X!= 3P\u00cc\u00ad\u0010+<G\u0083\u00baM\u00cc6f\u00c9\u0019\u00c3^\u00b6\u00de\t\u00109\b\u009f\u00be\u00c7\u0010m\u0093a{\u000e\u00f8\r\u0095D=\u0018f \u00b7\u00fa\u001e\u0089/\u0085}nh\u00b6ZO\u00f9\u00cf(\u0016\u00b8?3\u0015:L\u0010\u00bb\u00ef[\u0089\u0011WDu\u0002}-y\u0096\u001f\u00d1j\u0018L~\u00ffC\u0006\u009a\u00ea\u00d8\u00ad\u0092\u00e2}\u00e0\u00ac?\u00af\u00f9\u008e\u0019\u00c4O\u000f\u00de\u00d7\u0018\u00b4E\u00c3'\u00d7\u00d54\u008a\u00ad\u00e5_\u0014\u001b\u00f0dsr\u00c9l\u00d1S\u0015\u00ad\u0091\u0010\u00fe\u009a\u00af=a4\u00cfHB#\u00c6\u00d7U\u00dc\u000b\u00d6\u0010\u00df\u001e\u0005,n\u0095\u0095\u00ab)\u00d9P\u00f1X\u00aa,\u00cc\u0018\u009e\u00f9K\u00f1\u0090+\u00aa\u0014\u00d5\u008f\u00bcPq\u0004\u0098\u0013\u00f1:\u00eb\u00ecYj\u001dD\u0010\u00f8q1u(\u00c5^\u00b1H\u00d2\u00c2\u0018$(]\u0096\u0010\u008e\u009e\u001ag\u00a6\u00fa\u00ccF\u001b\u00e8+$\u0096\u009c:\r\u0010\u0018x\u00e8E0\u00c7\u009a\u00e88\u00fe\u0085\u00e9\u00afM)=\u0010.'s\u00c0W\u008a%\u0015\u0010\u00a2\u000e\u0000i=bz \u00f7\u00f7*X\u00adu\u00bbu\u00eaRgf\\\u0004_\u00d4\u00f8\u00b5\u00c4s\u00ac\u00e7Q\u00a87\u008bxN!\u0082s\\\u0010\u00c8\u00dbX\u00adE\u00a6|t\u00d7\u00abUVv\u00a0y\u00d6\u00107\u00b4\u00f8y97>O\u0081\u00ff4\u001c\u009f9I8\u0010\u0001b\u00b7+\u007f\u001a\u00c2\u0097\u009f\u0090[\u00e5\u00c1\u00ae{\u00a7\u0018\u00e8\u00d1\u00c2d\u00a1S'4\u0081\u0017\u00fa\u00cf\u001dF\u0086\u00d6\u00da\u009a7\u00b1V\u00b1\u00b6\u0094\u0010\u00d8\u0007\u00ab\u0091\u00b0i[;\u0085H \u0089\u0098\u00e3\u00cf\u00bc";
                        var18_6 = ":5\u00ce\f\u00ecv%\u00a6t\u001d\u0084\u00d7\u00d7\u00ee\u00d7C\u0010\u0095&\u001bg\u00a5gQvr\u00a8G\u00e4u\u00ec0\u00c9\u0018\u0095&\u001bg\u00a5gQv~\u00e1{\"d\u00f8\u00da.\u00b2Nai\u00a5\u00a1\u00a6y \u00f8q1u(\u00c5^\u00b1^\u0088\u00f1J\u0099\u00a3\u00d0\u0095Y\u00aa\u001aw\u00a7\u0019\u00a7\u0087#<@\u00cd\u0000i\u00c7\t\u0010\u00f5\u00deKp\u001d\u0089:\u00b9X!= 3P\u00cc\u00ad\u0010+<G\u0083\u00baM\u00cc6f\u00c9\u0019\u00c3^\u00b6\u00de\t\u00109\b\u009f\u00be\u00c7\u0010m\u0093a{\u000e\u00f8\r\u0095D=\u0018f \u00b7\u00fa\u001e\u0089/\u0085}nh\u00b6ZO\u00f9\u00cf(\u0016\u00b8?3\u0015:L\u0010\u00bb\u00ef[\u0089\u0011WDu\u0002}-y\u0096\u001f\u00d1j\u0018L~\u00ffC\u0006\u009a\u00ea\u00d8\u00ad\u0092\u00e2}\u00e0\u00ac?\u00af\u00f9\u008e\u0019\u00c4O\u000f\u00de\u00d7\u0018\u00b4E\u00c3'\u00d7\u00d54\u008a\u00ad\u00e5_\u0014\u001b\u00f0dsr\u00c9l\u00d1S\u0015\u00ad\u0091\u0010\u00fe\u009a\u00af=a4\u00cfHB#\u00c6\u00d7U\u00dc\u000b\u00d6\u0010\u00df\u001e\u0005,n\u0095\u0095\u00ab)\u00d9P\u00f1X\u00aa,\u00cc\u0018\u009e\u00f9K\u00f1\u0090+\u00aa\u0014\u00d5\u008f\u00bcPq\u0004\u0098\u0013\u00f1:\u00eb\u00ecYj\u001dD\u0010\u00f8q1u(\u00c5^\u00b1H\u00d2\u00c2\u0018$(]\u0096\u0010\u008e\u009e\u001ag\u00a6\u00fa\u00ccF\u001b\u00e8+$\u0096\u009c:\r\u0010\u0018x\u00e8E0\u00c7\u009a\u00e88\u00fe\u0085\u00e9\u00afM)=\u0010.'s\u00c0W\u008a%\u0015\u0010\u00a2\u000e\u0000i=bz \u00f7\u00f7*X\u00adu\u00bbu\u00eaRgf\\\u0004_\u00d4\u00f8\u00b5\u00c4s\u00ac\u00e7Q\u00a87\u008bxN!\u0082s\\\u0010\u00c8\u00dbX\u00adE\u00a6|t\u00d7\u00abUVv\u00a0y\u00d6\u00107\u00b4\u00f8y97>O\u0081\u00ff4\u001c\u009f9I8\u0010\u0001b\u00b7+\u007f\u001a\u00c2\u0097\u009f\u0090[\u00e5\u00c1\u00ae{\u00a7\u0018\u00e8\u00d1\u00c2d\u00a1S'4\u0081\u0017\u00fa\u00cf\u001dF\u0086\u00d6\u00da\u009a7\u00b1V\u00b1\u00b6\u0094\u0010\u00d8\u0007\u00ab\u0091\u00b0i[;\u0085H \u0089\u0098\u00e3\u00cf\u00bc".length();
                        var15_7 = 16;
                        var14_8 = -1;
lbl19:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_8;
                            v4 = var16_5.substring(v3, v3 + var15_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = CP_y6.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "!]ph0(t\u00c3\u00b3s\u00b1\u00e8|\u00efJ\u00ed\u0010\u00bb\u00ef[\u0089\u0011WDu\u00c1|c\u0085}\n\u00a4x";
                            var18_6 = "!]ph0(t\u00c3\u00b3s\u00b1\u00e8|\u00efJ\u00ed\u0010\u00bb\u00ef[\u0089\u0011WDu\u00c1|c\u0085}\n\u00a4x".length();
                            var15_7 = 16;
                            var14_8 = -1;
lbl33:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_8;
                                v4 = var16_5.substring(v6, v6 + var15_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = CP_y6.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var12_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl50:
                        // 1 sources

                        ** continue;
                    }
                }
                CP_y6.d = new HashMap<K, V>(13);
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
                var6_12 = new long[41];
                var3_13 = 0;
                var4_14 = "S\u0093\u0099\u0016\u00e7_\u00b1p\u00cfE$;\u00b98\u00f1\u00f4\u00e4\u0093\u008f\u009b*X\u00c5\u00fa\u00d1\u00e6\u00eb\u00c9N-\u001c\u009c=q\u00f41\u00d7\u0018\u00b1#.\u00fa\u009d\u00ef5.\u0091\u00fb`!\u00c2\u001a(\u00d5\u0017\u00d9\u00ac,T\u0084\t;\u00ee\u00de*\u00015\u00f1\u0013\u00c8\u00db\u0091\u00f4t\u00d9\u0082\u00a2A\u008cG\u0019\u0083\u00b9\u00b9\u00dc4\u0084\u008a%\u0080\u00d5\u00005\u0000\u0010\u00b2\u0092\u00e2\u00a2\u00c8,\u00ec\u00a0\u008d\u0014z\u0086 \u009er\u00e2T\u00b4\u0083\u00bb C<P&\u00851W\u00a0\u00fd4\u00fe\u00e0>\u00e5\u0002\u001b\u0093\u0087\u00ce\u00c0\u00b0\u00b7\f\u00af\u00f3\u0018>\u001f\u0018D\u00e2\u0095\u00ebBi\u00aaQ\u00e9\u00c7\u00b2\u001a\u00abn\u00b7\u0082\u00b8\u00de\u008a\u00ae\u00d8\u00df9giu*\u00ad'h\u009a\u0093xC)Z\u0018\u00cf\u009e\u001d\u0084\t\u0086\u000f\u001dG\u0005\u00bf\u00ef\u00c5\u0099\u00c5\u009f\u009e\u00c1\u001d\"\u00d1l\u00b6\u00e3\u00d5\u0080\u00a5\fy\u00dduA#\u00a4\u007f\u00e8$SL\u0099\u00f0\u0017\u0018\u00bf\u001b\u0011P\u0015a\r\u0017$\u00cb\u001a\u00c6X\u00a4\u00854\u00b2O\u00120\u0095\u00a4~\u00fd\r\u00c5\u0004\u001e\u00bd\u00df\u00ba{\b\u00ae\u0004\u00afx\u009a#\u00be\fZ\u00fbZ6\u00e1\u00f9\u0018\u00d1\u00cd\u00c0\u00130am\u00dfn\u0001\u0011Zd\u001f\u00b2^\u0007\u0098a\u00d9\u00cbb\u00a0*\u0019k}>\u00d6\u00f1J\u00f984H\u00e2\u0098:\u00ef";
                var5_15 = "S\u0093\u0099\u0016\u00e7_\u00b1p\u00cfE$;\u00b98\u00f1\u00f4\u00e4\u0093\u008f\u009b*X\u00c5\u00fa\u00d1\u00e6\u00eb\u00c9N-\u001c\u009c=q\u00f41\u00d7\u0018\u00b1#.\u00fa\u009d\u00ef5.\u0091\u00fb`!\u00c2\u001a(\u00d5\u0017\u00d9\u00ac,T\u0084\t;\u00ee\u00de*\u00015\u00f1\u0013\u00c8\u00db\u0091\u00f4t\u00d9\u0082\u00a2A\u008cG\u0019\u0083\u00b9\u00b9\u00dc4\u0084\u008a%\u0080\u00d5\u00005\u0000\u0010\u00b2\u0092\u00e2\u00a2\u00c8,\u00ec\u00a0\u008d\u0014z\u0086 \u009er\u00e2T\u00b4\u0083\u00bb C<P&\u00851W\u00a0\u00fd4\u00fe\u00e0>\u00e5\u0002\u001b\u0093\u0087\u00ce\u00c0\u00b0\u00b7\f\u00af\u00f3\u0018>\u001f\u0018D\u00e2\u0095\u00ebBi\u00aaQ\u00e9\u00c7\u00b2\u001a\u00abn\u00b7\u0082\u00b8\u00de\u008a\u00ae\u00d8\u00df9giu*\u00ad'h\u009a\u0093xC)Z\u0018\u00cf\u009e\u001d\u0084\t\u0086\u000f\u001dG\u0005\u00bf\u00ef\u00c5\u0099\u00c5\u009f\u009e\u00c1\u001d\"\u00d1l\u00b6\u00e3\u00d5\u0080\u00a5\fy\u00dduA#\u00a4\u007f\u00e8$SL\u0099\u00f0\u0017\u0018\u00bf\u001b\u0011P\u0015a\r\u0017$\u00cb\u001a\u00c6X\u00a4\u00854\u00b2O\u00120\u0095\u00a4~\u00fd\r\u00c5\u0004\u001e\u00bd\u00df\u00ba{\b\u00ae\u0004\u00afx\u009a#\u00be\fZ\u00fbZ6\u00e1\u00f9\u0018\u00d1\u00cd\u00c0\u00130am\u00dfn\u0001\u0011Zd\u001f\u00b2^\u0007\u0098a\u00d9\u00cbb\u00a0*\u0019k}>\u00d6\u00f1J\u00f984H\u00e2\u0098:\u00ef".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u001c\u00fdR\u00dd\u00e6\u0092J\u0015s\u00e3\u00adQ\u0088\u00cbl\u0094";
                    var5_15 = "\u001c\u00fdR\u00dd\u00e6\u0092J\u0015s\u00e3\u00adQ\u0088\u00cbl\u0094".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
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
lbl101:
                // 1 sources

                ** continue;
            }
        }
        CP_y6.b = var6_12;
        CP_y6.c = new Integer[41];
        CP_y6.KEEP_ALIVE = new CP_y6();
        CP_y6.CHAT_MESSAGE = new CP_y6();
        CP_y6.INTERACT_ENTITY = new CP_y6();
        CP_y6.PLAYER_FLYING = new CP_y6();
        CP_y6.PLAYER_POSITION = new CP_y6();
        CP_y6.PLAYER_ROTATION = new CP_y6();
        CP_y6.PLAYER_POSITION_AND_ROTATION = new CP_y6();
        CP_y6.PLAYER_DIGGING = new CP_y6();
        CP_y6.PLAYER_BLOCK_PLACEMENT = new CP_y6();
        CP_y6.HELD_ITEM_CHANGE = new CP_y6();
        CP_y6.ANIMATION = new CP_y6();
        CP_y6.ENTITY_ACTION = new CP_y6();
        CP_y6.STEER_VEHICLE = new CP_y6();
        CP_y6.CLOSE_WINDOW = new CP_y6();
        CP_y6.CLICK_WINDOW = new CP_y6();
        CP_y6.WINDOW_CONFIRMATION = new CP_y6();
        CP_y6.CREATIVE_INVENTORY_ACTION = new CP_y6();
        CP_y6.CLICK_WINDOW_BUTTON = new CP_y6();
        CP_y6.UPDATE_SIGN = new CP_y6();
        CP_y6.PLAYER_ABILITIES = new CP_y6();
        CP_y6.TAB_COMPLETE = new CP_y6();
        CP_y6.CLIENT_SETTINGS = new CP_y6();
        CP_y6.CLIENT_STATUS = new CP_y6();
        CP_y6.PLUGIN_MESSAGE = new CP_y6();
        CP_y6.SPECTATE = new CP_y6();
        CP_y6.RESOURCE_PACK_STATUS = new CP_y6();
        CP_y6.CP_H = CP_y6.CP_G();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xBAF;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_y6", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_y6.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_y6.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_y6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_y6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

