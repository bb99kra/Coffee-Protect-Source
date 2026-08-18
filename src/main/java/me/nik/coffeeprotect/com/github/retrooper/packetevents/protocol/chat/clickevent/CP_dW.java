/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_AA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_Ao;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_G9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_XU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_fg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_io;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_q4;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_rj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_ui;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_vb;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_w;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.StaticClickEventAction;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_h4;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_ys;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class CP_dW {
    private static final VersionedRegistry<CP_rj<?>> CP_i;
    public static final CP_rj<CP_q4> CP_k;
    public static final CP_rj<CP_w> CP_UnderScore;
    public static final CP_rj<CP_Ao> CP_c;
    @ApiStatus.Obsolete
    public static final CP_rj<CP_fg> CP_o;
    public static final CP_rj<CP_XU> CP_R;
    public static final CP_rj<CP_G9> CP_K;
    public static final CP_rj<CP_AA> CP_p;
    public static final CP_rj<CP_vb> CP_O;
    public static final CP_rj<CP_io> CP_A;
    private static transient /* synthetic */ String ksgwoPipTR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_dW() {
    }

    @ApiStatus.Internal
    public static <T extends CP_ui> CP_rj<T> CP_S(String string, boolean bl, CP_ys<T> ilIlys, CP_h4<T> ilIlh4) {
        return CP_i.define(string, typesBuilderData -> new StaticClickEventAction((TypesBuilderData)typesBuilderData, bl, ilIlys, ilIlh4));
    }

    public static VersionedRegistry<CP_rj<?>> CP_u() {
        return CP_i;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = CP_s.a(3599022919278369753L, 2741001647738540012L, MethodHandles.lookup().lookupClass()).a(276765325216635L) ^ 117480433805319L;
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
                var0_3 = new String[10];
                var6_4 = 0;
                var5_5 = "z\u0092\u00fa\u00fd\u00caD\u00c3\u0017\u0018\u009bL\u00a4\u001a\u00d5\u0098N\u0099\u00d4U\u00fd\u00fc\u00e4C\u008c\u00e2\u00a9\u009c\u008a\u0013\u00cf\u00bb:\\\u0010-[\u001e\u00f8\u008d\u001f\u00ef\u0094\u0003\u0095\u00a8b549G\u0018\u00b7\u00a1t\u001b\u0083\u0093d\u00c2b\u00dc\u00ad\u00a8\u00f9ot\u0095\u000b\u00c3\u0013\u00a76\u00f0e#\u0018@\u00bc\u00abMs\u00a8\u00c6\u0007j\u001e\u00f4]4\u00d8x}\u00b1\u0083!\u00f7i\u0004\u008c\u00e2\u0010\u00c6>\u00fff9L3\u009c\u00c2>X\u00dc\u00a0\u00ec\u00f1\u00b5\u0010\u00aa##{y\u00e5\u0094\u0004\u00f6k\u00a4\u0083\u00b2\u00ef\u00dai\u0010P\u00c4G\u0080\u00b5\u00b7\u00b0nk\u00b9\u00b8\u00b9`\u00fec\u00c6";
                var7_6 = "z\u0092\u00fa\u00fd\u00caD\u00c3\u0017\u0018\u009bL\u00a4\u001a\u00d5\u0098N\u0099\u00d4U\u00fd\u00fc\u00e4C\u008c\u00e2\u00a9\u009c\u008a\u0013\u00cf\u00bb:\\\u0010-[\u001e\u00f8\u008d\u001f\u00ef\u0094\u0003\u0095\u00a8b549G\u0018\u00b7\u00a1t\u001b\u0083\u0093d\u00c2b\u00dc\u00ad\u00a8\u00f9ot\u0095\u000b\u00c3\u0013\u00a76\u00f0e#\u0018@\u00bc\u00abMs\u00a8\u00c6\u0007j\u001e\u00f4]4\u00d8x}\u00b1\u0083!\u00f7i\u0004\u008c\u00e2\u0010\u00c6>\u00fff9L3\u009c\u00c2>X\u00dc\u00a0\u00ec\u00f1\u00b5\u0010\u00aa##{y\u00e5\u0094\u0004\u00f6k\u00a4\u0083\u00b2\u00ef\u00dai\u0010P\u00c4G\u0080\u00b5\u00b7\u00b0nk\u00b9\u00b8\u00b9`\u00fec\u00c6".length();
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
                    var0_3[var6_4++] = CP_dW.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u0081d\u00197>\u0099s\u00a2\u00ca\bt\u0091\u00de\u00ae\u00e9\u00e3\u0010\u008e\u00c8\u0083\u00bf\u0093R\u00ff\u0088j\u00be\u0012\u00f6i\u00c3H!";
                    var7_6 = "\u0081d\u00197>\u0099s\u00a2\u00ca\bt\u0091\u00de\u00ae\u00e9\u00e3\u0010\u008e\u00c8\u0083\u00bf\u0093R\u00ff\u0088j\u00be\u0012\u00f6i\u00c3H!".length();
                    var4_7 = 16;
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
                    var0_3[var6_4++] = CP_dW.a(var8_9).intern();
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
        CP_dW.CP_i = new VersionedRegistry<T>(var0_3[4]);
        CP_dW.CP_k = CP_dW.CP_S(var0_3[6], true, (CP_ys<CP_q4>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, CP_m(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_q4;)(), (CP_h4<CP_q4>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Object;)V, CP_y(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_q4 ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_q4;)V)());
        CP_dW.CP_UnderScore = CP_dW.CP_S(var0_3[2], false, (CP_ys<CP_w>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, CP_w(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_w;)(), (CP_h4<CP_w>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Object;)V, CP_L(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_w ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_w;)V)());
        CP_dW.CP_c = CP_dW.CP_S(var0_3[5], true, (CP_ys<CP_Ao>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, CP_l(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_Ao;)(), (CP_h4<CP_Ao>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Object;)V, CP_N(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_Ao ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_Ao;)V)());
        CP_dW.CP_o = CP_dW.CP_S(var0_3[3], false, (CP_ys<CP_fg>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, CP_a(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_fg;)(), (CP_h4<CP_fg>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Object;)V, CP_m(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_fg ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_fg;)V)());
        CP_dW.CP_R = CP_dW.CP_S(var0_3[7], true, (CP_ys<CP_XU>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, CP_b(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_XU;)(), (CP_h4<CP_XU>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Object;)V, CP_C(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_XU ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_XU;)V)());
        CP_dW.CP_K = CP_dW.CP_S(var0_3[8], true, (CP_ys<CP_G9>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, CP_m(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_G9;)(), (CP_h4<CP_G9>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Object;)V, CP_H(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_G9 ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_G9;)V)());
        CP_dW.CP_p = CP_dW.CP_S(var0_3[1], true, (CP_ys<CP_AA>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, CP_J(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_AA;)(), (CP_h4<CP_AA>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Object;)V, CP_u(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_AA ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_AA;)V)());
        CP_dW.CP_O = CP_dW.CP_S(var0_3[9], true, (CP_ys<CP_vb>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, CP_A(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_vb;)(), (CP_h4<CP_vb>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Object;)V, CP_a(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_vb ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_vb;)V)());
        CP_dW.CP_A = CP_dW.CP_S(var0_3[0], true, (CP_ys<CP_io>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, CP_b(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_io;)(), (CP_h4<CP_io>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Object;)V, CP_a(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_io ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_io;)V)());
        CP_dW.CP_i.unloadMappings();
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

