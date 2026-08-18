/*
 * Decompiled with CFR 0.152.
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.painting.CP_G0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.painting.StaticPaintingVariant;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_xu;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.TranslatableComponent;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public final class CP_dO {
    private static final VersionedRegistry<CP_G0> CP_UnderScore;
    public static final CP_G0 CP_Q;
    public static final CP_G0 CP_F;
    public static final CP_G0 CP_l;
    public static final CP_G0 CP_p;
    public static final CP_G0 CP_v;
    public static final CP_G0 CP_d;
    public static final CP_G0 CP_V;
    public static final CP_G0 CP_a;
    public static final CP_G0 CP_t;
    public static final CP_G0 CP_u;
    public static final CP_G0 CP_X;
    public static final CP_G0 CP_x;
    public static final CP_G0 CP_g;
    public static final CP_G0 CP_W;
    public static final CP_G0 CP_K;
    public static final CP_G0 CP_y;
    public static final CP_G0 CP_H;
    public static final CP_G0 CP_j;
    public static final CP_G0 CP_e;
    public static final CP_G0 CP_P;
    public static final CP_G0 CP_i;
    public static final CP_G0 CP_I;
    public static final CP_G0 CP_G;
    public static final CP_G0 CP_E;
    public static final CP_G0 CP_S;
    public static final CP_G0 CP_s;
    public static final CP_G0 CP_c;
    public static final CP_G0 CP_O;
    public static final CP_G0 CP_f;
    public static final CP_G0 CP_n;
    public static final CP_G0 CP_m;
    public static final CP_G0 CP_J;
    public static final CP_G0 CP_B;
    public static final CP_G0 CP_Z;
    public static final CP_G0 CP_o;
    public static final CP_G0 CP_L;
    public static final CP_G0 CP_A;
    public static final CP_G0 CP_T;
    public static final CP_G0 CP_h;
    public static final CP_G0 CP_q;
    public static final CP_G0 CP_U;
    public static final CP_G0 CP_M;
    public static final CP_G0 CP_Y;
    public static final CP_G0 CP_z;
    public static final CP_G0 CP_R;
    public static final CP_G0 CP_D;
    public static final CP_G0 CP_r;
    public static final CP_G0 CP_C;
    public static final CP_G0 CP_w;
    public static final CP_G0 CP_b;
    public static final CP_G0 CP_N;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String RAPYmoAcNm = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_dO() {
    }

    @ApiStatus.Internal
    public static CP_G0 CP_V(String string, int n, int n2) {
        return CP_dO.CP_U(string, n, n2, true);
    }

    @ApiStatus.Internal
    public static CP_G0 CP_U(String string, int n, int n2, boolean bl) {
        long l = a ^ 0x172326E3B314L;
        ResourceLocation resourceLocation = ResourceLocation.minecraft(string);
        TranslatableComponent translatableComponent = Component.CP_U((String)((Object)CP_dO.a("a", (int)21445, (long)(0x32286B973E0D30FBL ^ l))) + string + (String)((Object)CP_dO.a("a", (int)27323, (long)(0x1D67F044404789ABL ^ l))), CP_xu.CP_e);
        TranslatableComponent translatableComponent2 = bl ? Component.CP_U((String)((Object)CP_dO.a("a", (int)10568, (long)(0x58555E320F794A60L ^ l))) + string + (String)((Object)CP_dO.a("a", (int)30321, (long)(0xAB93497043C157BL ^ l))), CP_xu.CP_M) : null;
        return CP_dO.CP_l(string, n, n2, resourceLocation, translatableComponent, translatableComponent2);
    }

    @ApiStatus.Internal
    public static CP_G0 CP_l(String string, int n, int n2, ResourceLocation resourceLocation, @Nullable Component component, @Nullable Component component2) {
        return CP_UnderScore.define(string, typesBuilderData -> new StaticPaintingVariant((TypesBuilderData)typesBuilderData, n, n2, resourceLocation, component, component2));
    }

    public static VersionedRegistry<CP_G0> CP_Q() {
        return CP_UnderScore;
    }

    @Nullable
    public static CP_G0 CP_E(String string) {
        return CP_UnderScore.getByName(string);
    }

    @Nullable
    public static CP_G0 CP_Q(ClientVersion clientVersion, int n) {
        return CP_UnderScore.getById(clientVersion, n);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_dO.a = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s.a(6255027607750698044L, -5000945629740477252L, MethodHandles.lookup().lookupClass()).a(197327077913386L);
                var9 = CP_dO.a ^ 116975858280306L;
                CP_dO.d = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[56];
                var5_4 = 0;
                var4_5 = "1\u00cd\u00fa\u0016\u00ba\u00bd\u00d7\u00c4\u00c4=u\u0087\u00d9\u000e\u00ddv De\u00c4\u00fcx AZ\u00f3\u0099\u000f}\u00e2\u00ad\u00abI\u00f4L\u00ce\u00839\u00a3\u000e\u0011\u009c+\u00a8V\\\u00a3\u001a\u00ae\u0018\u009e\u00ba}\u00a1\u00fa\u00c7]\u00ean\u0005\u00b5U\u0081m\u0095tnt)DH\u00b0]\u00bc\u0010>k@\u00c5/N\u00fb(\u00da\u0098\u00c2\u00b3\u000b\u00dc\u00f5?\u0010\u00c7\u00d6\u0098\u0098L\u00ba\u00cd\u001c\u00baG\u001d^o\u00d3\u0012\u0087\u0010^\u00ef\u00f8_`q9\u00b65T^G\u00ee\u0081\u00ea\u0005\u0010\u00fe\u00ee\u0094\u00b4\u00fd\u00f6\u000b\u00fco\u00d7z5\u0018\u00c55\u00b4\u0010\u000b\u00b7\u0006\u0090\u001a\u00fc\u00c2\u00f0\u009cL\u0086=\u0006\u00c4N\u0091 \u001c\u00cc!\u0012\u0002\u00d7\u00c7\u0080\u00fb\u00e4X\u00a3\u0007\u00d4\u0017\u00cbB\u008f $ \u00f8\u00962\u00cf\u00b0\u00de\u0096\u0017=hr(m>\u00850\u001e0L\u00ad\u00c4\u00f0qvw\t\u001dw'\u0000B\u0017\u00c0\u0013+\u00af\u00e3VYc.\u0093@\u008e\u00d9(\u0003\u0013\u00e7\u00e4\u00ea\u0013 b\u0095\u0083u9H\u00a7\u0014\u0083:C\u008e\\|\u00e5\u001b\u00f6W\u00b9\u00d7\r\u00e8\u0099\u00d2\u00f7z\u0016(N\u00a6\u001b\u008f \u009e\u00ed%\u008d\u00f6\u0002|\u00d4\u001e\u008bR\u00a2+\u00d2\u00aa\u00b1\b\u00cd\u00d5\u00e8\u00b5\u001a\u00f8\u001b1\u00f5g#\u0088\u00ecJ\u00e3\u0018\u00d73\u00a0\u0018\u00da\u00cb\u009b\u00d8vI\u001f# \u0083\u0085#\u009d\u001bq\u0097eW\u00f1y\u0010\u00b7\u0006\u001a-\u00db\u0088\u00db|\u00d7I\u00bd\u001c\u00ad\u0017\u00c3\u00a2 \u00f8\u00d3\u00b7\u009f\u00ddn]^\u008cd\u0003\u008c8\u00b0\u00ecb\u00b2{\u001a\u00bf\bL\u00cf\u0096\u000e\u00e5\u00af\u00d3\u0011\u00ed\u00d7\u00fe W\u0006C\u001fA1\u00ee\u00b7GhM\u00fe\u00f1\u00ed\u0016\u00ec\u00c1k\u00b0\u00f9HU\u00f2,dB\u00a1\r\n\u00bec\u00a1\u00107>-k\u00f3\u008c\u00ff\u00da\u00f5\u0088\u0084*\u00a8A\u0087b\u0010%\u00c1$PI\u0007;\u00fd\u0087\u00e9\u008f^6Z\u00d9\u009a\u0010\u00cd\u00cb7\u00ba\u00d6%\u0003[\u00cf\u00b9\u00c6\u00a8g\u00cf\u00aev\u0010]\u000e8+\u00d2\u00f9\u00d8\u00b7\u00d8XA\b\u00fd\u0092\u00eb\u00dd\u0010W\u00a37\u00bb\u00c6%\u00e2G\u00f4\t\u0081\u008cQ8\u0019\u0087\u0018\u00c6l\u00b9\u0090\u00da_\u00b3\u00c0\u00fe\u00db\u0096\u00f90\u001f\u007f\u0091\u00a9\u00f9\u00d3[\u00d6\u00e9{\u008a\u0010t\u00c3\u00f08HMW]\u00b7\u001f\u00fbj\u00c5\u00f4\u0018K\u0010\u00f8ftN\u00eb#-\u0012\u00ff\u00e2\u0012\u0088x>{\u0084 [\u00a7\u0090\u00ef\u00e7x\u00c7\u0083\u008eD}\u0092\u00ba\u00ba\u0017\u008c\u00f1\u00ca\u0093\u00ef\u00e5\u00edm\u00fe\u00e5!r\u00133}\u0091\u009c\u0010\u00fe\u00b9\u00f6wM\u000f\u00b0\u0007\u008aA\u0014\u00e1\u00b1`\u009a\u008e\u0010\u00ba\u00a3\u00c9\u0087\u00cc\u00f0\u00f8\u00bc\u0099\u00bd\u0084\u00a7V!\u00c3[ KuaJ\u00b1\u00e5^\u00a6EH\u0097\u00ee\u00cc%-s\u00b7\u00cf\u00f5\u00b4\u0083\u009d\u001a\u0006k\u00c4Zv\u00d9Sve\u0010J\u008c\u00d3\u00e6\u00895n\u00d7a\u008e\u00ca\u0000\u00c4{\u00c5\u0001\u0010\u00b9\u0010\u008c\u0091)\u00a4\u00fe\u00f6\u0085\u00d3\u0002\u0013v\u00f9\u00e9x(\u009cm9\u0012\u00e6G\u00a1\\Qc\u0099 \n\u00fe\u00a1m\u00be\u0006~{\u0002|1\u0093i\u0086\u00d3S?\u0011\u008cl\u00e4\u00f4\u00b3\u00a8\u00d7\u00e5\u00f9\u00fe(\u00fa\u000b\u001fh \u0003X\\\u00a1\u00cc\u00158W\u00d3\u00ddV\u00985E\u00ff\u0089\tQK!\u00be\u00e2\u00a7\u00f2\u00f7\u00dc\u00d3\u00f9?\u00dd\u00e8\u0094\u00dfG\n\u0010?8\u0095Q~\u000f\"\u001dg\u00a3\u0098\u0088UR\u0099\u00d1\u0010Wjl;\u00fe\u00d6\u0016\u00c1\u0090\u009d!\u00b8\u00c4\u00ff\u00a9O\u0010^\u0016\u008c\u008c:5\u00d5\b\u00f8\u00b2.y\u00a8y>\u001a\u0010\u00be\u00d5\u00b9\u008c\u00ff5^\u00d6\u00f5Y\u00b2\u00eb\u00d3\u00e8\u009b\u009d\u0010J\u00d1\u0089\u00bf\u00bd0\b\u00d8jw\u00fcT\u0015\u0082x\u00fb\u0018\u00e0Q\u00b0\u00ed\u000b\u00f0&\u00ea\u0089\u00f8M)\u00bf\u00d0\u00b7\u0084\u0001\u00a9Q\u00dc.\u00c3\u008d\u001c\u0010\b\u00a1\u00f3\u00d5\u0093\u00b4Y\u00f4N\u0002h5\u00b88\u00b9\u00f9\u0010\u00d3\u0094\u001eq\u00a8\u0098\u00f8^\u0086q\u00b7\u0084\u00b9\u00f1A\u0005\u0010\u00f0C\u00d1\u00be?,\u00f9\u00c6\u008aF\u00e8\u00a7\u000bXp`\u0010\u00d0\u0095\u0011m\u0082\u00b32A\b\u009c s6+\b-\u0010\u001b\u00fbGo\u00c9h\u00cb\u000b\u0082\u00e6KnkD,$\u0010S\u008dW\u001e\u008d\u0096\u0082\u00b3\u00d2g\u00cdP\u00ed\u001e\u009bc\u0010\u00bfY\u00a7\u001d\u00aeG\u0097H\u001b\u00ca\u0096ts\u00f0\u00f1\u0010\u0010P\u00f9\u0002\u008e\u001b\u0087\u00c5q\u00ab)W*\u0086R+x\u0018[b\u00f5\u00f0K\u00ee\u009e\u00e8 \u00ad\u00e5\u00b3-\u00d6\u00d6\u0005\u0002K\u00d8T\u009c^Jn \u00f8\u00bc\u00a5e/\u00f5\u009fOn}H\u0011\u0093\u00d5\u00eah|\u0019G\u00d5E\u00fe7\u00ef\u00e9x\n%\u00a90\u0012=\u0010\u00f7\u00bb\u0001mA\u00ba_\u0093!~\u00c5\u00d9\u0094\u00bc\u00b7\u0093\u0010\u00e1\u00b0\u00f8a\u00e0\u00be;\u00a5\u0080\u0000\u009e\u00d4\u0011\u007f:Q\u0010\u00fa\u00ff\u0099E-\u008c\u009d\u0018\u00eeL\u0083q\u00f3\t\u0099\u008f\u0010\u00a4\f\u00f5\u00a5\u00ceW\u00a4\u00ac\u00ff*\u00af\u00aenT<\u00b1\u0010\u00a4\"\u00b1\u00b3\u0018\u00da\u00b9\n\u00d6\u0096-\u00b1'X\u0095P\u0010wV&\u00f7vs\u0081d\u0007\u00f8\u00e1kq\u00fe\u009b\u009e";
                var6_6 = "1\u00cd\u00fa\u0016\u00ba\u00bd\u00d7\u00c4\u00c4=u\u0087\u00d9\u000e\u00ddv De\u00c4\u00fcx AZ\u00f3\u0099\u000f}\u00e2\u00ad\u00abI\u00f4L\u00ce\u00839\u00a3\u000e\u0011\u009c+\u00a8V\\\u00a3\u001a\u00ae\u0018\u009e\u00ba}\u00a1\u00fa\u00c7]\u00ean\u0005\u00b5U\u0081m\u0095tnt)DH\u00b0]\u00bc\u0010>k@\u00c5/N\u00fb(\u00da\u0098\u00c2\u00b3\u000b\u00dc\u00f5?\u0010\u00c7\u00d6\u0098\u0098L\u00ba\u00cd\u001c\u00baG\u001d^o\u00d3\u0012\u0087\u0010^\u00ef\u00f8_`q9\u00b65T^G\u00ee\u0081\u00ea\u0005\u0010\u00fe\u00ee\u0094\u00b4\u00fd\u00f6\u000b\u00fco\u00d7z5\u0018\u00c55\u00b4\u0010\u000b\u00b7\u0006\u0090\u001a\u00fc\u00c2\u00f0\u009cL\u0086=\u0006\u00c4N\u0091 \u001c\u00cc!\u0012\u0002\u00d7\u00c7\u0080\u00fb\u00e4X\u00a3\u0007\u00d4\u0017\u00cbB\u008f $ \u00f8\u00962\u00cf\u00b0\u00de\u0096\u0017=hr(m>\u00850\u001e0L\u00ad\u00c4\u00f0qvw\t\u001dw'\u0000B\u0017\u00c0\u0013+\u00af\u00e3VYc.\u0093@\u008e\u00d9(\u0003\u0013\u00e7\u00e4\u00ea\u0013 b\u0095\u0083u9H\u00a7\u0014\u0083:C\u008e\\|\u00e5\u001b\u00f6W\u00b9\u00d7\r\u00e8\u0099\u00d2\u00f7z\u0016(N\u00a6\u001b\u008f \u009e\u00ed%\u008d\u00f6\u0002|\u00d4\u001e\u008bR\u00a2+\u00d2\u00aa\u00b1\b\u00cd\u00d5\u00e8\u00b5\u001a\u00f8\u001b1\u00f5g#\u0088\u00ecJ\u00e3\u0018\u00d73\u00a0\u0018\u00da\u00cb\u009b\u00d8vI\u001f# \u0083\u0085#\u009d\u001bq\u0097eW\u00f1y\u0010\u00b7\u0006\u001a-\u00db\u0088\u00db|\u00d7I\u00bd\u001c\u00ad\u0017\u00c3\u00a2 \u00f8\u00d3\u00b7\u009f\u00ddn]^\u008cd\u0003\u008c8\u00b0\u00ecb\u00b2{\u001a\u00bf\bL\u00cf\u0096\u000e\u00e5\u00af\u00d3\u0011\u00ed\u00d7\u00fe W\u0006C\u001fA1\u00ee\u00b7GhM\u00fe\u00f1\u00ed\u0016\u00ec\u00c1k\u00b0\u00f9HU\u00f2,dB\u00a1\r\n\u00bec\u00a1\u00107>-k\u00f3\u008c\u00ff\u00da\u00f5\u0088\u0084*\u00a8A\u0087b\u0010%\u00c1$PI\u0007;\u00fd\u0087\u00e9\u008f^6Z\u00d9\u009a\u0010\u00cd\u00cb7\u00ba\u00d6%\u0003[\u00cf\u00b9\u00c6\u00a8g\u00cf\u00aev\u0010]\u000e8+\u00d2\u00f9\u00d8\u00b7\u00d8XA\b\u00fd\u0092\u00eb\u00dd\u0010W\u00a37\u00bb\u00c6%\u00e2G\u00f4\t\u0081\u008cQ8\u0019\u0087\u0018\u00c6l\u00b9\u0090\u00da_\u00b3\u00c0\u00fe\u00db\u0096\u00f90\u001f\u007f\u0091\u00a9\u00f9\u00d3[\u00d6\u00e9{\u008a\u0010t\u00c3\u00f08HMW]\u00b7\u001f\u00fbj\u00c5\u00f4\u0018K\u0010\u00f8ftN\u00eb#-\u0012\u00ff\u00e2\u0012\u0088x>{\u0084 [\u00a7\u0090\u00ef\u00e7x\u00c7\u0083\u008eD}\u0092\u00ba\u00ba\u0017\u008c\u00f1\u00ca\u0093\u00ef\u00e5\u00edm\u00fe\u00e5!r\u00133}\u0091\u009c\u0010\u00fe\u00b9\u00f6wM\u000f\u00b0\u0007\u008aA\u0014\u00e1\u00b1`\u009a\u008e\u0010\u00ba\u00a3\u00c9\u0087\u00cc\u00f0\u00f8\u00bc\u0099\u00bd\u0084\u00a7V!\u00c3[ KuaJ\u00b1\u00e5^\u00a6EH\u0097\u00ee\u00cc%-s\u00b7\u00cf\u00f5\u00b4\u0083\u009d\u001a\u0006k\u00c4Zv\u00d9Sve\u0010J\u008c\u00d3\u00e6\u00895n\u00d7a\u008e\u00ca\u0000\u00c4{\u00c5\u0001\u0010\u00b9\u0010\u008c\u0091)\u00a4\u00fe\u00f6\u0085\u00d3\u0002\u0013v\u00f9\u00e9x(\u009cm9\u0012\u00e6G\u00a1\\Qc\u0099 \n\u00fe\u00a1m\u00be\u0006~{\u0002|1\u0093i\u0086\u00d3S?\u0011\u008cl\u00e4\u00f4\u00b3\u00a8\u00d7\u00e5\u00f9\u00fe(\u00fa\u000b\u001fh \u0003X\\\u00a1\u00cc\u00158W\u00d3\u00ddV\u00985E\u00ff\u0089\tQK!\u00be\u00e2\u00a7\u00f2\u00f7\u00dc\u00d3\u00f9?\u00dd\u00e8\u0094\u00dfG\n\u0010?8\u0095Q~\u000f\"\u001dg\u00a3\u0098\u0088UR\u0099\u00d1\u0010Wjl;\u00fe\u00d6\u0016\u00c1\u0090\u009d!\u00b8\u00c4\u00ff\u00a9O\u0010^\u0016\u008c\u008c:5\u00d5\b\u00f8\u00b2.y\u00a8y>\u001a\u0010\u00be\u00d5\u00b9\u008c\u00ff5^\u00d6\u00f5Y\u00b2\u00eb\u00d3\u00e8\u009b\u009d\u0010J\u00d1\u0089\u00bf\u00bd0\b\u00d8jw\u00fcT\u0015\u0082x\u00fb\u0018\u00e0Q\u00b0\u00ed\u000b\u00f0&\u00ea\u0089\u00f8M)\u00bf\u00d0\u00b7\u0084\u0001\u00a9Q\u00dc.\u00c3\u008d\u001c\u0010\b\u00a1\u00f3\u00d5\u0093\u00b4Y\u00f4N\u0002h5\u00b88\u00b9\u00f9\u0010\u00d3\u0094\u001eq\u00a8\u0098\u00f8^\u0086q\u00b7\u0084\u00b9\u00f1A\u0005\u0010\u00f0C\u00d1\u00be?,\u00f9\u00c6\u008aF\u00e8\u00a7\u000bXp`\u0010\u00d0\u0095\u0011m\u0082\u00b32A\b\u009c s6+\b-\u0010\u001b\u00fbGo\u00c9h\u00cb\u000b\u0082\u00e6KnkD,$\u0010S\u008dW\u001e\u008d\u0096\u0082\u00b3\u00d2g\u00cdP\u00ed\u001e\u009bc\u0010\u00bfY\u00a7\u001d\u00aeG\u0097H\u001b\u00ca\u0096ts\u00f0\u00f1\u0010\u0010P\u00f9\u0002\u008e\u001b\u0087\u00c5q\u00ab)W*\u0086R+x\u0018[b\u00f5\u00f0K\u00ee\u009e\u00e8 \u00ad\u00e5\u00b3-\u00d6\u00d6\u0005\u0002K\u00d8T\u009c^Jn \u00f8\u00bc\u00a5e/\u00f5\u009fOn}H\u0011\u0093\u00d5\u00eah|\u0019G\u00d5E\u00fe7\u00ef\u00e9x\n%\u00a90\u0012=\u0010\u00f7\u00bb\u0001mA\u00ba_\u0093!~\u00c5\u00d9\u0094\u00bc\u00b7\u0093\u0010\u00e1\u00b0\u00f8a\u00e0\u00be;\u00a5\u0080\u0000\u009e\u00d4\u0011\u007f:Q\u0010\u00fa\u00ff\u0099E-\u008c\u009d\u0018\u00eeL\u0083q\u00f3\t\u0099\u008f\u0010\u00a4\f\u00f5\u00a5\u00ceW\u00a4\u00ac\u00ff*\u00af\u00aenT<\u00b1\u0010\u00a4\"\u00b1\u00b3\u0018\u00da\u00b9\n\u00d6\u0096-\u00b1'X\u0095P\u0010wV&\u00f7vs\u0081d\u0007\u00f8\u00e1kq\u00fe\u009b\u009e".length();
                var3_7 = 16;
                var2_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = CP_dO.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u0087(q_\u00d0i\u00cb\\\u00a7\u0083\u0092\u00f2\u000b\u0095\u008d\u00ceA\u0015B\u009f\u001cg9s \u00dcw\u00b4\n\u00b6w\b\u007f\u00a3\u009b\u00c8*V\u001f\u00b3O6a\u0012\u00e2\u009bi\u00c0\u0011\u00a1\u0086GG\u00ec\u00ff\\\u0087";
                    var6_6 = "\u0087(q_\u00d0i\u00cb\\\u00a7\u0083\u0092\u00f2\u000b\u0095\u008d\u00ceA\u0015B\u009f\u001cg9s \u00dcw\u00b4\n\u00b6w\b\u007f\u00a3\u009b\u00c8*V\u001f\u00b3O6a\u0012\u00e2\u009bi\u00c0\u0011\u00a1\u0086GG\u00ec\u00ff\\\u0087".length();
                    var3_7 = 24;
                    var2_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = CP_dO.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl51:
                // 1 sources

                ** continue;
            }
        }
        CP_dO.b = var7_3;
        CP_dO.c = new String[56];
        CP_dO.CP_UnderScore = new VersionedRegistry<T>((String)CP_dO.a("a", (int)8139, (long)(4415611355713775762L ^ var9)));
        CP_dO.CP_Q = CP_dO.CP_V((String)CP_dO.a("a", (int)7223, (long)(2192602750562806618L ^ var9)), 4, 4);
        CP_dO.CP_F = CP_dO.CP_V((String)CP_dO.a("a", (int)31080, (long)(4736719763102453289L ^ var9)), 2, 1);
        CP_dO.CP_l = CP_dO.CP_V((String)CP_dO.a("a", (int)14721, (long)(6815844453952458472L ^ var9)), 1, 2);
        CP_dO.CP_p = CP_dO.CP_V((String)CP_dO.a("a", (int)26983, (long)(2267460121058827821L ^ var9)), 2, 1);
        CP_dO.CP_v = CP_dO.CP_U((String)CP_dO.a("a", (int)23276, (long)(3165718483500658097L ^ var9)), 2, 2, false);
        CP_dO.CP_d = CP_dO.CP_V((String)CP_dO.a("a", (int)30107, (long)(5455593352342815431L ^ var9)), 4, 3);
        CP_dO.CP_V = CP_dO.CP_V((String)CP_dO.a("a", (int)15300, (long)(2803533173268974724L ^ var9)), 2, 2);
        CP_dO.CP_a = CP_dO.CP_V((String)CP_dO.a("a", (int)31125, (long)(6466451150721470162L ^ var9)), 3, 4);
        CP_dO.CP_t = CP_dO.CP_V((String)CP_dO.a("a", (int)10554, (long)(8818728402227666541L ^ var9)), 2, 2);
        CP_dO.CP_u = CP_dO.CP_V((String)CP_dO.a("a", (int)19820, (long)(7060611565248346661L ^ var9)), 4, 4);
        CP_dO.CP_X = CP_dO.CP_U((String)CP_dO.a("a", (int)25229, (long)(3471327197885978087L ^ var9)), 2, 2, false);
        CP_dO.CP_x = CP_dO.CP_V((String)CP_dO.a("a", (int)15769, (long)(5290253971995396815L ^ var9)), 1, 1);
        CP_dO.CP_g = CP_dO.CP_V((String)CP_dO.a("a", (int)31809, (long)(5257513698625211175L ^ var9)), 4, 2);
        CP_dO.CP_W = CP_dO.CP_V((String)CP_dO.a("a", (int)15157, (long)(2226628864227314752L ^ var9)), 1, 1);
        CP_dO.CP_K = CP_dO.CP_V((String)CP_dO.a("a", (int)23895, (long)(2956996965229685299L ^ var9)), 3, 3);
        CP_dO.CP_y = CP_dO.CP_V((String)CP_dO.a("a", (int)20828, (long)(8681570493166413329L ^ var9)), 4, 2);
        CP_dO.CP_H = CP_dO.CP_U((String)CP_dO.a("a", (int)7318, (long)(8127991926412913636L ^ var9)), 2, 2, false);
        CP_dO.CP_j = CP_dO.CP_V((String)CP_dO.a("a", (int)1653, (long)(829992692240331069L ^ var9)), 4, 2);
        CP_dO.CP_e = CP_dO.CP_V((String)CP_dO.a("a", (int)3787, (long)(5120437276514859396L ^ var9)), 4, 4);
        CP_dO.CP_P = CP_dO.CP_V((String)CP_dO.a("a", (int)3745, (long)(8963859771679816146L ^ var9)), 3, 3);
        CP_dO.CP_i = CP_dO.CP_V((String)CP_dO.a("a", (int)25501, (long)(4023100621292688603L ^ var9)), 1, 2);
        CP_dO.CP_I = CP_dO.CP_V((String)CP_dO.a("a", (int)5317, (long)(4461037401583199156L ^ var9)), 4, 4);
        CP_dO.CP_G = CP_dO.CP_V((String)CP_dO.a("a", (int)17726, (long)(1861750910371066475L ^ var9)), 2, 1);
        CP_dO.CP_E = CP_dO.CP_V((String)CP_dO.a("a", (int)19482, (long)(7582175214077442884L ^ var9)), 3, 3);
        CP_dO.CP_S = CP_dO.CP_V((String)CP_dO.a("a", (int)20681, (long)(8233097295502993319L ^ var9)), 2, 2);
        CP_dO.CP_s = CP_dO.CP_U((String)CP_dO.a("a", (int)22065, (long)(1258717872603554118L ^ var9)), 2, 2, false);
        CP_dO.CP_c = CP_dO.CP_V((String)CP_dO.a("a", (int)26768, (long)(2158513109610586084L ^ var9)), 4, 2);
        CP_dO.CP_O = CP_dO.CP_V((String)CP_dO.a("a", (int)11298, (long)(2721794379148073799L ^ var9)), 4, 2);
        CP_dO.CP_f = CP_dO.CP_V((String)CP_dO.a("a", (int)9813, (long)(3459230736011268382L ^ var9)), 3, 3);
        CP_dO.CP_n = CP_dO.CP_V((String)CP_dO.a("a", (int)4964, (long)(2468839017920439300L ^ var9)), 1, 2);
        CP_dO.CP_m = CP_dO.CP_V((String)CP_dO.a("a", (int)1010, (long)(5962864652037960834L ^ var9)), 1, 1);
        CP_dO.CP_J = CP_dO.CP_V((String)CP_dO.a("a", (int)21154, (long)(6469268016090539517L ^ var9)), 2, 2);
        CP_dO.CP_B = CP_dO.CP_V((String)CP_dO.a("a", (int)443, (long)(8468280868203411193L ^ var9)), 3, 3);
        CP_dO.CP_Z = CP_dO.CP_V((String)CP_dO.a("a", (int)4634, (long)(3017694304719185216L ^ var9)), 4, 4);
        CP_dO.CP_o = CP_dO.CP_V((String)CP_dO.a("a", (int)568, (long)(5455904649764713851L ^ var9)), 1, 1);
        CP_dO.CP_L = CP_dO.CP_U((String)CP_dO.a("a", (int)13910, (long)(8903365182689968389L ^ var9)), 2, 2, false);
        CP_dO.CP_A = CP_dO.CP_V((String)CP_dO.a("a", (int)8893, (long)(8596949855689381333L ^ var9)), 3, 4);
        CP_dO.CP_T = CP_dO.CP_V((String)CP_dO.a("a", (int)18226, (long)(3336812332483735633L ^ var9)), 3, 3);
        CP_dO.CP_h = CP_dO.CP_V((String)CP_dO.a("a", (int)16341, (long)(8076842871636265095L ^ var9)), 1, 1);
        CP_dO.CP_q = CP_dO.CP_V((String)CP_dO.a("a", (int)2302, (long)(162439685007228842L ^ var9)), 2, 2);
        CP_dO.CP_U = CP_dO.CP_V((String)CP_dO.a("a", (int)15154, (long)(2844432776049986653L ^ var9)), 1, 1);
        CP_dO.CP_M = CP_dO.CP_V((String)CP_dO.a("a", (int)11419, (long)(2117028413737573370L ^ var9)), 2, 1);
        CP_dO.CP_Y = CP_dO.CP_V((String)CP_dO.a("a", (int)20169, (long)(2875373394618284428L ^ var9)), 4, 3);
        CP_dO.CP_z = CP_dO.CP_V((String)CP_dO.a("a", (int)7958, (long)(3401246197759355005L ^ var9)), 2, 2);
        CP_dO.CP_R = CP_dO.CP_V((String)CP_dO.a("a", (int)1288, (long)(6893009851597664857L ^ var9)), 2, 2);
        CP_dO.CP_D = CP_dO.CP_V((String)CP_dO.a("a", (int)9767, (long)(4754601734874599779L ^ var9)), 1, 1);
        CP_dO.CP_r = CP_dO.CP_V((String)CP_dO.a("a", (int)9080, (long)(3997453511520818216L ^ var9)), 1, 1);
        CP_dO.CP_C = CP_dO.CP_V((String)CP_dO.a("a", (int)21256, (long)(1635834722072978500L ^ var9)), 3, 3);
        CP_dO.CP_w = CP_dO.CP_V((String)CP_dO.a("a", (int)22367, (long)(6758201457340112952L ^ var9)), 2, 1);
        CP_dO.CP_b = CP_dO.CP_V((String)CP_dO.a("a", (int)27070, (long)(2233197783419150044L ^ var9)), 3, 3);
        CP_dO.CP_N = CP_dO.CP_V((String)CP_dO.a("a", (int)819, (long)(3572695376255333480L ^ var9)), 3, 3);
        CP_dO.CP_UnderScore.unloadMappings();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x167;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/painting/CP_dO", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            CP_dO.c[n2] = CP_dO.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_dO.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/painting/CP_dO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_dO.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

