/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

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
import me.nik.coffeeprotect.CP_oI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public final class CP_Cz
extends Enum<CP_Cz> {
    public static final /* enum */ CP_Cz REDSTONE;
    public static final /* enum */ CP_Cz TRAPDOOR;
    public static final /* enum */ CP_Cz CARPET;
    public static final /* enum */ CP_Cz ANVIL;
    public static final /* enum */ CP_Cz END_PORTAL;
    public static final /* enum */ CP_Cz BOOK;
    public static final /* enum */ CP_Cz RAILS;
    public static final /* enum */ CP_Cz TRIPWIRE_HOOK;
    public static final /* enum */ CP_Cz OBSERVER;
    public static final /* enum */ CP_Cz LEVER;
    public static final /* enum */ CP_Cz HEAD;
    public static final /* enum */ CP_Cz SHULKER;
    public static final /* enum */ CP_Cz BUNDLE;
    public static final /* enum */ CP_Cz CONTAINER;
    private final String[] CP_C;
    private static final /* synthetic */ CP_Cz[] CP_z;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_Cz[] values() {
        return (CP_Cz[])CP_z.clone();
    }

    public static CP_Cz valueOf(String string) {
        return Enum.valueOf(CP_Cz.class, string);
    }

    public String[] CP_W() {
        return this.CP_C;
    }

    private CP_Cz(String ... stringArray) {
        this.CP_C = stringArray;
    }

    public static boolean CP_r(String string, CP_Cz ... ilIlCzArray) {
        int n;
        block6: {
            long l = a ^ 0x3D5418F6BFE3L;
            String string2 = CP_oI.CP_n();
            if (string == null) {
                return false;
            }
            CP_Cz[] ilIlCzArray2 = ilIlCzArray;
            int n2 = ilIlCzArray2.length;
            int n3 = 0;
            while (n3 < n2) {
                block7: {
                    CP_Cz ilIlCz = ilIlCzArray2[n3];
                    String[] stringArray = ilIlCz.CP_C;
                    int n4 = stringArray.length;
                    n = 0;
                    if (string2 != null) break block6;
                    int n5 = n;
                    while (n5 < n4) {
                        String string3 = stringArray[n5];
                        if (string2 == null) {
                            if (string2 == null) {
                                if (string == string3) {
                                    return true;
                                }
                                ++n5;
                            }
                            if (string2 == null) continue;
                        }
                        break block7;
                    }
                    ++n3;
                }
                if (string2 == null) continue;
            }
            n = 0;
        }
        return n != 0;
    }

    private static /* synthetic */ CP_Cz[] CP_U() {
        long l = a ^ 0x263B3C7FB0DCL;
        CP_Cz[] ilIlCzArray = new CP_Cz[CP_Cz.a("r", (int)4573, (long)(0x10F22A0CA8A57924L ^ l))];
        ilIlCzArray[0] = REDSTONE;
        ilIlCzArray[1] = TRAPDOOR;
        ilIlCzArray[2] = CARPET;
        ilIlCzArray[3] = ANVIL;
        ilIlCzArray[4] = END_PORTAL;
        ilIlCzArray[5] = BOOK;
        ilIlCzArray[CP_Cz.a("r", (int)3684, (long)(0x42E2743EE15669AL ^ l))] = RAILS;
        ilIlCzArray[CP_Cz.a("r", (int)7846, (long)(0x33115C21135E7657L ^ l))] = TRIPWIRE_HOOK;
        ilIlCzArray[CP_Cz.a("r", (int)26508, (long)(0x45D3779150878F66L ^ l))] = OBSERVER;
        ilIlCzArray[CP_Cz.a("r", (int)7219, (long)(0x532709A7AB5174D5L ^ l))] = LEVER;
        ilIlCzArray[CP_Cz.a("r", (int)11649, (long)(0x2DDE1C1CA8334569L ^ l))] = HEAD;
        ilIlCzArray[CP_Cz.a("r", (int)1187, (long)(0x3569356B927D6C4CL ^ l))] = SHULKER;
        ilIlCzArray[CP_Cz.a("r", (int)5861, (long)(0x218168408484FE06L ^ l))] = BUNDLE;
        ilIlCzArray[CP_Cz.a("r", (int)14821, (long)(0x691BBE8DE238D11AL ^ l))] = CONTAINER;
        return ilIlCzArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_Cz.a = CP_s.a(-5848139986395580907L, 3682304213235014905L, MethodHandles.lookup().lookupClass()).a(124596914831410L);
                        var20 = CP_Cz.a ^ 90045170887521L;
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
                        var11_3 = new String[106];
                        var17_4 = 0;
                        var16_5 = "\t\u00bf\u00eeF\u00d2o\u00a3\u00ca3\u0016/\u00e1y\u0080\u009c\u0000\u0010\u00f7\u00b0w\u0013IN\u00a0\u00fe\u00d9\u0081\u00d8\u00b8\u00cel\u000bZ\u0010~\u00a5\u00e4\u00bc\u0086O\u00b9\u00bb\u00eb\u00d8\u00c5TM\u00f4\u0014g\u00109\u001dqw\u00b3\f\u00bd\u0004\u0086S\u0089]\u00c7\u00d2CN\u0010\u00c2F\u00052\u00ac\f\u00cd\u00c6\u00b0\u00fe{\u00ebm\u00deZ\u001b\u0010Z^;\u008b\u008b\u00b5\u0093c\u0098\u00c2\u00df\u00c1\u00a3\u00d21\u00f1\u0010\u00ed\u00e1\u00a2x\t\u00bd\u001b_y\u00f0\u00a63\u00a5\u00a8\u009c\u00dd\u0010>\u00d0\u001e2y\u00b763\u00ac:\u00b2\u00f2J\u00c0\u008c\u0099\u0010\u00a3\u00e8UMP\u001dX\u00d3\u00bd\u00e6(\u00f5@\u0088[e\u0018oL\u00d1\u0091\u00e8\u00abM\u00a9\u00f3\u00f7\u00c2\u00bc=\u00bfz\u0087\u00f4t\u0091\u00ec\u001a\u008b\u001a\u008d\u0010\u00e4Q-\u00b6\u00e08#]\u0004\u00d2)\u007f\u00f0}\u00e2\u00f1\b\u00e1\u00b0\u0081\u00f0\u0002\u00c7\u00a6#\u0010\u00dd\u00a5\u00da\u00f3\u0003\u00e9\u00a5\u009a\u00e5\u0001\u008c\u00a0\u00b2:\u009aN\u0010\u0007\u00e0B\u0088\u00f2\u00ce\u00b9\u00f27\u00bd/J\u0089\u00f0\u0007h\u0018\u00ff\u0095\rW\u00a4\u00ca\u00e7\u00f1/x\u0081\u00f5\u00a7\u00aeeu\u0081\u00dd\u00a4\u00b5\u00f9\u00a7\u00c9\u00c3\u0018irK\u009f\u00d0\u0016\u00f9\u00f5w~\u00fdGA>\u00c6[\u00b5\u0003x\u0016\u00abo\u0010\u00d8\u0018b\u00ba\u0005.\u001f.8\u00e8\u00b4\u009b\u00b1(x\b\u00aa\u00fdY\u00e9\t{\u00ca\u00e2\u00fb\u00d7\u0010~\u0084\u00b7\u00bd?S\u000e\u00fe\u00b8R6Y?\u00a9\u00fc\u00ea\b\u00db\u0004\u0018\u00da\u009dX\u001b0\u00187YbG\u00b4\u00d5X\u0087K/\u008f'_j\u00d4F\u00b9\u00bb\u0010K\u0088\u00a2|\u00fc\u0010$h\u00e9\u000f\u00d8\u00ad\u0085\u008a\u00a9\u00d2k\r\u00f1$\u0099K\u0010\u0007{x\u0014\u00fdX\u0014\u00e9\u00f1*\u00d9\u0093w\u00dbI\u009d\u0010H,\u0018\u0093\u00961\u00fc_$\u00cc\u00bd\u00f1,\u009a\u00b1.\u0018oL\u00d1\u0091\u00e8\u00abM\u00a9\u00ce@u=\u00bc\u00fd\u0007\"\u00ablK\u00c1\u00c6~\u00a8\u00e8\u0010:5\u009e\u0098Tb\u00037\u00fc\u00cc\u0005\u000fT\u00849p\u0018~\u00d9\u0015R\u00cf\u00dc3y5\u00d8\u008bo\u00b5r\\\u00a3\u00aee\u0084\u00b6\u00d1\u000b\u00c5\u00d8\u0010l\u0081\u00d3\u000bm\u00a0\u00fa\u00ae4\u00c7\u00df\u0013\u000b@H*\u0010\u0006\u00f0\u00f17B^c\u00baK\u0086a\u0093\u0096\u00c8\u0000\u00c5\u0018\u00f2\u00d1.7\u0083d\u00f8&\u0012\u0016\u00ceBn\u00aacD\u00bfQ\u00e3`m\u0080!\u00f9\u0018/yq\u007f\u00f9\u0088\u00f0a\u00c7\u00fd/dj\u00ae\u00ce\u00b7S\u0085f\u00ee~\u00cbi}\u0010\b\u00e2:\u0097HR\u00c7\u008e_\u00c1\u00c1\u0088\u0013\u00f2=h\u0010+\u00d9hD\f\nKE\u00d2\u0098\u0091\u00cb\u00cb\u00bd\u00ab\u00eb\b\u00f7\u00a4\u0003\u00ec\u00ed\u00cc\u009e\u00c4\b\u00fa\u00eb]\u00b2\u00bbiF\u00dd\u0010\u00f4E\u0098\u00f1\u00a2\u00de9\u00de\u00e4\u00c9\u0099\t\u00ce^P\u00a6\u00109\u001c\u00d93^\u0000\u001d[\u00c1+\u00db\u00ea\u001f\u00f6M\u0085\u00109\u001c\u00d93^\u0000\u001d[\u00d6\u00a1ywUv<\u00ea\u0010s\u00c2\u00b8\u0087!\u00c6\u00ca\u00d0\u008c\u00dfQ\u00e9*\u00d7m\u00e8\u0010\u00b7\u0003c\u00c8\u00f0\u00c5\u0098|\u00ce \u0012\u00f9^Jq\u00ec\b!z\u00ee\u00feL\u00d6\u0096*\u0010[=b\u0097:G\u00a5\u008fkc\u00b1\u00db\u0014L\u00f7\u00b9\u0018\u00a6G\u00fe?\u00aeH\u00d1\u00aet\u00d9\u00fdW1\u00b4;\u00cd\u001d\u00fax\n--\u00d7\u00ef\u0010V\u00c2[\u00e3L\u0090ro\u0082\u00ce\u00ed\u00c9L*k\b\u0010\u0015\u00d7y\u0080\u00c8\u0007\u0003\u008e\u0098\u00c9\b\u00d0\u00e9\u0012M\u00a5\u00109\u001c\u00d93^\u0000\u001d[\u00d6\u00a1ywUv<\u00ea\u0010Z3\u00e6ey\u00bf\u000eU\u00c3\u0010\u009b\b\u00cau\u00bd\u00f4\u0010\u0088\u00d8D\u0012\u00fc\u00d3\u008dU\u008c\u00a8A\u001b\u00e9%\u00c0\u00b6\u0018T)\u00f0\u00f9>\u00cd\u00c3\u0011\u00eb.\u0005\u00bbh\u009a\u00a8\u00f8\u00d5I\u00e0I\u009a\u00aa\u0017\u00d9\bD\u00a9\u0090%X\u00f7`?\u0010\u00b66\u00ad\u0012(PAyv\u00a5G\u008d\u00deB\u0097\u008b\u0010H,\u0018\u0093\u00961\u00fc_\u00d0\u0091\u00a7\u0093\u00a7A\u00c9\u00f3\u0010JI\u009b6\u00d7&\u00dc\u00dc\u0001\u00f57Xa\u0093\u00efr\u0010(\u00f1\u00e1d!\u001fxh\u00fe\u0086=\u001cb\u0007p\u009e\u0018oL\u00d1\u0091\u00e8\u00abM\u00a9\u00c9\u00bf\u00f2\u008f\u00a4v\u0014\u0084\u00b1\u0085\u00c2\u00c2\u0093y\r[\b\u0098\u0095\u0017\u00e4(=\u00d1\u00c7\u0010\"r|\u00ebwtrM\u00eb\u00f5h\u0082\u00f3VYy\u0018\u008e\u009d\u00c9\u00d8@\u00f3\u00dc\u00a6\\\"\u00dfxo<\t\u0005\u00cf\u00e6\u00eag\u00a1\u00e0\u00cf{\b\u00fa\u00eb]\u00b2\u00bbiF\u00dd\u0010H,\u0018\u0093\u00961\u00fc_\u00d0\u0091\u00a7\u0093\u00a7A\u00c9\u00f3\b\u00f7\u00a4\u0003\u00ec\u00ed\u00cc\u009e\u00c4\b!z\u00ee\u00feL\u00d6\u0096*\u0018\u00f2\u00d1.7\u0083d\u00f8&\u001b\u0006-^\u00ad\u00bauQq\u00c1\u0005\u009aj\u00d3KK\u0010\u00f3\u00a1\u0004\u00aat\u0007\u00c2a\u000f}bZ\u00deF!\u001e\u0018\u00f2\u00d1.7\u0083d\u00f8&\u00d7c\u00b0\u00f7\u00f5O\u00dcQ\u00cc\u00e3\n\u001e4\u0006\u0002\u0085\u0010\u0088\u00d8D\u0012\u00fc\u00d3\u008dU\u008c\u00a8A\u001b\u00e9%\u00c0\u00b6\u0010(\n\u0013\u00cf<\u0013\u00c7\u001bQ\u00c0\u008dR\u00bd\u00830\u009f\u0010\u00ad\u00edI\u00fd[\u00ab\u00b7\u00e72\u0088C\u0015\u000e\u00cf7a\u0010\u00ec\r\u00d2\u0012\u00e8\u00cf\u0085A\u00da\u001f\u0088\u0016u4\u00ab\u0086\u0010\u0011\u00ba\u00bb?\u0016K\u00a2\u00c6wyHtl=\u008e\u00bc\u0010\u00030\u009f\u0080\u00d4\u000e\u000b\u00bf\u00e0\u00d6\u0092\u0004~\u00ac\u00e6T\u0010\u0007{x\u0014\u00fdX\u0014\u00e9\u00b5T\u001f\u00f4\u00f4N\u00bb\u00f4\u0010T\u00ff\u009aw\u00f9\u00b5 \u0018\u00ee\u00ceG\u0091\u00034\u0001e\b\u00db\u0004\u0018\u00da\u009dX\u001b0\u0010\u00c3:9f\u000f\u00f3tf\u00ec\u0015\u00cc\t\u0094\u00cfu\u0087\u0010\n\u00a1Cb0\u00d4=f[4!{?B\u0010)\u0018\u00f1S;7\u00a2\u00a7(\u00fa\u0001\u00a2\u00c5\u00e2\u000eo\u00b6\u00a0/a\u000f\u00d2wdz\u00d7\u0018\u00f1\u0088\u00f5\u00a0\u00c8j\u00cc\u00fa\u0082\u00d6\u00ca\u00b9\u0012\u00e2A:/\u001d\u00c8\u00ad\u00d6\u00878\"\b\f\u00c2\u00ddWO\u00fdq\u00bb\u0010Hh\u0013\u00cb\u00ee\u00ed\u00dc Ys\u00dc\u00bd\u00ac\u00b1\u0007\u00b8\u0010\u0006\u00d3\u00bbQ.\u00af\u00e1\u007f\u009d\u00b7!\u00c7#\u00d1\u00c7\u0083\u0010\u001d2\u001c\u00cf/\u00ef\u00c5\u0010>A\u00a0\u00f4\u00de-\u0015}\u0010<\u00cbp\u007f\u00ae\u0093\u00a0_\u0005VM\u00bd\u00da\u00dd+\u00c4\u0018)\u0089\u00fet\u001can\u00e1`\u00f2\t\u00bc\u00bc\u00a9\u00f1yRK\u00c4t\u001f\u00a9\u00e5\u00c0\u0010\u00b0\u00c2%\u00d1\u000740\u0091\u0005\u00bf\u00bf\u0003\\\u00ff\u00a7M\u0010Y\u00e1\u0092+?\u00d9\u001d>g%\u00f0T\u00dfu\u0006u\u0010\u00a0\u00ccy\u00de\u00d4<\u00cb\u00a8\u00de \u0006p\u008a]\u008a7\b\u00d1\u00d3}\u0099Z\u001c\u0017\u008d\u0010\u00d8k\u001f\u00c1\u0082oo\u0000\u00dc 36t\u0006 \u00c2\u0010L\u00c0\u00f2\u00e5\u00e1d;\u0006J\u00de\u00b6\u00d3\u00b7\u0083(\u0018\u0018\u0097P7~\u00f6 {0\u0002=\u0016q\u00ca\u008a\u00d8\u008e+\u00d8\u00f3:$f\u00ef\u0090\u0010\u0097\u00d3_\u0016[\u00c8\u0094\u00d8)\u001f\u00b2\u00a5m\u00ff \u00b5\b\u00e1\u00b0\u0081\u00f0\u0002\u00c7\u00a6#\u0010Hh\u0013\u00cb\u00ee\u00ed\u00dc Ys\u00dc\u00bd\u00ac\u00b1\u0007\u00b8\b\u0007\u0085/\u00c2M\\\u00cb\u00a6\u0010\u007f\u001d,\u00bb\u00ac\u00ee\u0090\\\u00d1H\u0012\u0003\u00d8\u0002\u0087\u0012\u0010\u00af\u00a1\u00df[\u00ed\u00ddQ\u00b2\u0019d\u00f6f\u00a7\u008f G\u0010\u00dc\u00e5\u00ff\u00c2K\u0017\u0090w\u00e1\u009d\u007f\u0003\n\u009aYS\u0010,\u009b;&\u009d\u001a>\u0005\u00a0\u00ae,\u00f8\u00d9\u008egj\u0018\u0007{x\u0014\u00fdX\u0014\u00e9\u00ad,\u0017\u00bc\u0013\u008c\u00df\u00a7W\u00ca\u00e0\u00a9I\u009d\u00d9\u00ac\u0018\u00d1E!4%\u00bd\u001cvj\u00ad\u00a3\u00c4C?\u00c8\u00ee\u00aeb\u00fbID\u0005\u00c26\b\u0015\u00b5\u0006\u00b5@\u00eaa\u00d8\b\u00c9\u00c0\u0095\u00ff\u0088\u00de\u00f0\u00ff\u0018\u00b3\u00d2\u00fa\u001f\u00eb\u00b3\u00ecSN\u001dw\u00f3\u00f7`\u00fey~\u0088p\u0016c\u00be%\u00df\u0010\u00fdW\u00c0\u00d3;dMp\u00cc[\u00f3P\u00a5\u00c3\u00110";
                        var18_6 = "\t\u00bf\u00eeF\u00d2o\u00a3\u00ca3\u0016/\u00e1y\u0080\u009c\u0000\u0010\u00f7\u00b0w\u0013IN\u00a0\u00fe\u00d9\u0081\u00d8\u00b8\u00cel\u000bZ\u0010~\u00a5\u00e4\u00bc\u0086O\u00b9\u00bb\u00eb\u00d8\u00c5TM\u00f4\u0014g\u00109\u001dqw\u00b3\f\u00bd\u0004\u0086S\u0089]\u00c7\u00d2CN\u0010\u00c2F\u00052\u00ac\f\u00cd\u00c6\u00b0\u00fe{\u00ebm\u00deZ\u001b\u0010Z^;\u008b\u008b\u00b5\u0093c\u0098\u00c2\u00df\u00c1\u00a3\u00d21\u00f1\u0010\u00ed\u00e1\u00a2x\t\u00bd\u001b_y\u00f0\u00a63\u00a5\u00a8\u009c\u00dd\u0010>\u00d0\u001e2y\u00b763\u00ac:\u00b2\u00f2J\u00c0\u008c\u0099\u0010\u00a3\u00e8UMP\u001dX\u00d3\u00bd\u00e6(\u00f5@\u0088[e\u0018oL\u00d1\u0091\u00e8\u00abM\u00a9\u00f3\u00f7\u00c2\u00bc=\u00bfz\u0087\u00f4t\u0091\u00ec\u001a\u008b\u001a\u008d\u0010\u00e4Q-\u00b6\u00e08#]\u0004\u00d2)\u007f\u00f0}\u00e2\u00f1\b\u00e1\u00b0\u0081\u00f0\u0002\u00c7\u00a6#\u0010\u00dd\u00a5\u00da\u00f3\u0003\u00e9\u00a5\u009a\u00e5\u0001\u008c\u00a0\u00b2:\u009aN\u0010\u0007\u00e0B\u0088\u00f2\u00ce\u00b9\u00f27\u00bd/J\u0089\u00f0\u0007h\u0018\u00ff\u0095\rW\u00a4\u00ca\u00e7\u00f1/x\u0081\u00f5\u00a7\u00aeeu\u0081\u00dd\u00a4\u00b5\u00f9\u00a7\u00c9\u00c3\u0018irK\u009f\u00d0\u0016\u00f9\u00f5w~\u00fdGA>\u00c6[\u00b5\u0003x\u0016\u00abo\u0010\u00d8\u0018b\u00ba\u0005.\u001f.8\u00e8\u00b4\u009b\u00b1(x\b\u00aa\u00fdY\u00e9\t{\u00ca\u00e2\u00fb\u00d7\u0010~\u0084\u00b7\u00bd?S\u000e\u00fe\u00b8R6Y?\u00a9\u00fc\u00ea\b\u00db\u0004\u0018\u00da\u009dX\u001b0\u00187YbG\u00b4\u00d5X\u0087K/\u008f'_j\u00d4F\u00b9\u00bb\u0010K\u0088\u00a2|\u00fc\u0010$h\u00e9\u000f\u00d8\u00ad\u0085\u008a\u00a9\u00d2k\r\u00f1$\u0099K\u0010\u0007{x\u0014\u00fdX\u0014\u00e9\u00f1*\u00d9\u0093w\u00dbI\u009d\u0010H,\u0018\u0093\u00961\u00fc_$\u00cc\u00bd\u00f1,\u009a\u00b1.\u0018oL\u00d1\u0091\u00e8\u00abM\u00a9\u00ce@u=\u00bc\u00fd\u0007\"\u00ablK\u00c1\u00c6~\u00a8\u00e8\u0010:5\u009e\u0098Tb\u00037\u00fc\u00cc\u0005\u000fT\u00849p\u0018~\u00d9\u0015R\u00cf\u00dc3y5\u00d8\u008bo\u00b5r\\\u00a3\u00aee\u0084\u00b6\u00d1\u000b\u00c5\u00d8\u0010l\u0081\u00d3\u000bm\u00a0\u00fa\u00ae4\u00c7\u00df\u0013\u000b@H*\u0010\u0006\u00f0\u00f17B^c\u00baK\u0086a\u0093\u0096\u00c8\u0000\u00c5\u0018\u00f2\u00d1.7\u0083d\u00f8&\u0012\u0016\u00ceBn\u00aacD\u00bfQ\u00e3`m\u0080!\u00f9\u0018/yq\u007f\u00f9\u0088\u00f0a\u00c7\u00fd/dj\u00ae\u00ce\u00b7S\u0085f\u00ee~\u00cbi}\u0010\b\u00e2:\u0097HR\u00c7\u008e_\u00c1\u00c1\u0088\u0013\u00f2=h\u0010+\u00d9hD\f\nKE\u00d2\u0098\u0091\u00cb\u00cb\u00bd\u00ab\u00eb\b\u00f7\u00a4\u0003\u00ec\u00ed\u00cc\u009e\u00c4\b\u00fa\u00eb]\u00b2\u00bbiF\u00dd\u0010\u00f4E\u0098\u00f1\u00a2\u00de9\u00de\u00e4\u00c9\u0099\t\u00ce^P\u00a6\u00109\u001c\u00d93^\u0000\u001d[\u00c1+\u00db\u00ea\u001f\u00f6M\u0085\u00109\u001c\u00d93^\u0000\u001d[\u00d6\u00a1ywUv<\u00ea\u0010s\u00c2\u00b8\u0087!\u00c6\u00ca\u00d0\u008c\u00dfQ\u00e9*\u00d7m\u00e8\u0010\u00b7\u0003c\u00c8\u00f0\u00c5\u0098|\u00ce \u0012\u00f9^Jq\u00ec\b!z\u00ee\u00feL\u00d6\u0096*\u0010[=b\u0097:G\u00a5\u008fkc\u00b1\u00db\u0014L\u00f7\u00b9\u0018\u00a6G\u00fe?\u00aeH\u00d1\u00aet\u00d9\u00fdW1\u00b4;\u00cd\u001d\u00fax\n--\u00d7\u00ef\u0010V\u00c2[\u00e3L\u0090ro\u0082\u00ce\u00ed\u00c9L*k\b\u0010\u0015\u00d7y\u0080\u00c8\u0007\u0003\u008e\u0098\u00c9\b\u00d0\u00e9\u0012M\u00a5\u00109\u001c\u00d93^\u0000\u001d[\u00d6\u00a1ywUv<\u00ea\u0010Z3\u00e6ey\u00bf\u000eU\u00c3\u0010\u009b\b\u00cau\u00bd\u00f4\u0010\u0088\u00d8D\u0012\u00fc\u00d3\u008dU\u008c\u00a8A\u001b\u00e9%\u00c0\u00b6\u0018T)\u00f0\u00f9>\u00cd\u00c3\u0011\u00eb.\u0005\u00bbh\u009a\u00a8\u00f8\u00d5I\u00e0I\u009a\u00aa\u0017\u00d9\bD\u00a9\u0090%X\u00f7`?\u0010\u00b66\u00ad\u0012(PAyv\u00a5G\u008d\u00deB\u0097\u008b\u0010H,\u0018\u0093\u00961\u00fc_\u00d0\u0091\u00a7\u0093\u00a7A\u00c9\u00f3\u0010JI\u009b6\u00d7&\u00dc\u00dc\u0001\u00f57Xa\u0093\u00efr\u0010(\u00f1\u00e1d!\u001fxh\u00fe\u0086=\u001cb\u0007p\u009e\u0018oL\u00d1\u0091\u00e8\u00abM\u00a9\u00c9\u00bf\u00f2\u008f\u00a4v\u0014\u0084\u00b1\u0085\u00c2\u00c2\u0093y\r[\b\u0098\u0095\u0017\u00e4(=\u00d1\u00c7\u0010\"r|\u00ebwtrM\u00eb\u00f5h\u0082\u00f3VYy\u0018\u008e\u009d\u00c9\u00d8@\u00f3\u00dc\u00a6\\\"\u00dfxo<\t\u0005\u00cf\u00e6\u00eag\u00a1\u00e0\u00cf{\b\u00fa\u00eb]\u00b2\u00bbiF\u00dd\u0010H,\u0018\u0093\u00961\u00fc_\u00d0\u0091\u00a7\u0093\u00a7A\u00c9\u00f3\b\u00f7\u00a4\u0003\u00ec\u00ed\u00cc\u009e\u00c4\b!z\u00ee\u00feL\u00d6\u0096*\u0018\u00f2\u00d1.7\u0083d\u00f8&\u001b\u0006-^\u00ad\u00bauQq\u00c1\u0005\u009aj\u00d3KK\u0010\u00f3\u00a1\u0004\u00aat\u0007\u00c2a\u000f}bZ\u00deF!\u001e\u0018\u00f2\u00d1.7\u0083d\u00f8&\u00d7c\u00b0\u00f7\u00f5O\u00dcQ\u00cc\u00e3\n\u001e4\u0006\u0002\u0085\u0010\u0088\u00d8D\u0012\u00fc\u00d3\u008dU\u008c\u00a8A\u001b\u00e9%\u00c0\u00b6\u0010(\n\u0013\u00cf<\u0013\u00c7\u001bQ\u00c0\u008dR\u00bd\u00830\u009f\u0010\u00ad\u00edI\u00fd[\u00ab\u00b7\u00e72\u0088C\u0015\u000e\u00cf7a\u0010\u00ec\r\u00d2\u0012\u00e8\u00cf\u0085A\u00da\u001f\u0088\u0016u4\u00ab\u0086\u0010\u0011\u00ba\u00bb?\u0016K\u00a2\u00c6wyHtl=\u008e\u00bc\u0010\u00030\u009f\u0080\u00d4\u000e\u000b\u00bf\u00e0\u00d6\u0092\u0004~\u00ac\u00e6T\u0010\u0007{x\u0014\u00fdX\u0014\u00e9\u00b5T\u001f\u00f4\u00f4N\u00bb\u00f4\u0010T\u00ff\u009aw\u00f9\u00b5 \u0018\u00ee\u00ceG\u0091\u00034\u0001e\b\u00db\u0004\u0018\u00da\u009dX\u001b0\u0010\u00c3:9f\u000f\u00f3tf\u00ec\u0015\u00cc\t\u0094\u00cfu\u0087\u0010\n\u00a1Cb0\u00d4=f[4!{?B\u0010)\u0018\u00f1S;7\u00a2\u00a7(\u00fa\u0001\u00a2\u00c5\u00e2\u000eo\u00b6\u00a0/a\u000f\u00d2wdz\u00d7\u0018\u00f1\u0088\u00f5\u00a0\u00c8j\u00cc\u00fa\u0082\u00d6\u00ca\u00b9\u0012\u00e2A:/\u001d\u00c8\u00ad\u00d6\u00878\"\b\f\u00c2\u00ddWO\u00fdq\u00bb\u0010Hh\u0013\u00cb\u00ee\u00ed\u00dc Ys\u00dc\u00bd\u00ac\u00b1\u0007\u00b8\u0010\u0006\u00d3\u00bbQ.\u00af\u00e1\u007f\u009d\u00b7!\u00c7#\u00d1\u00c7\u0083\u0010\u001d2\u001c\u00cf/\u00ef\u00c5\u0010>A\u00a0\u00f4\u00de-\u0015}\u0010<\u00cbp\u007f\u00ae\u0093\u00a0_\u0005VM\u00bd\u00da\u00dd+\u00c4\u0018)\u0089\u00fet\u001can\u00e1`\u00f2\t\u00bc\u00bc\u00a9\u00f1yRK\u00c4t\u001f\u00a9\u00e5\u00c0\u0010\u00b0\u00c2%\u00d1\u000740\u0091\u0005\u00bf\u00bf\u0003\\\u00ff\u00a7M\u0010Y\u00e1\u0092+?\u00d9\u001d>g%\u00f0T\u00dfu\u0006u\u0010\u00a0\u00ccy\u00de\u00d4<\u00cb\u00a8\u00de \u0006p\u008a]\u008a7\b\u00d1\u00d3}\u0099Z\u001c\u0017\u008d\u0010\u00d8k\u001f\u00c1\u0082oo\u0000\u00dc 36t\u0006 \u00c2\u0010L\u00c0\u00f2\u00e5\u00e1d;\u0006J\u00de\u00b6\u00d3\u00b7\u0083(\u0018\u0018\u0097P7~\u00f6 {0\u0002=\u0016q\u00ca\u008a\u00d8\u008e+\u00d8\u00f3:$f\u00ef\u0090\u0010\u0097\u00d3_\u0016[\u00c8\u0094\u00d8)\u001f\u00b2\u00a5m\u00ff \u00b5\b\u00e1\u00b0\u0081\u00f0\u0002\u00c7\u00a6#\u0010Hh\u0013\u00cb\u00ee\u00ed\u00dc Ys\u00dc\u00bd\u00ac\u00b1\u0007\u00b8\b\u0007\u0085/\u00c2M\\\u00cb\u00a6\u0010\u007f\u001d,\u00bb\u00ac\u00ee\u0090\\\u00d1H\u0012\u0003\u00d8\u0002\u0087\u0012\u0010\u00af\u00a1\u00df[\u00ed\u00ddQ\u00b2\u0019d\u00f6f\u00a7\u008f G\u0010\u00dc\u00e5\u00ff\u00c2K\u0017\u0090w\u00e1\u009d\u007f\u0003\n\u009aYS\u0010,\u009b;&\u009d\u001a>\u0005\u00a0\u00ae,\u00f8\u00d9\u008egj\u0018\u0007{x\u0014\u00fdX\u0014\u00e9\u00ad,\u0017\u00bc\u0013\u008c\u00df\u00a7W\u00ca\u00e0\u00a9I\u009d\u00d9\u00ac\u0018\u00d1E!4%\u00bd\u001cvj\u00ad\u00a3\u00c4C?\u00c8\u00ee\u00aeb\u00fbID\u0005\u00c26\b\u0015\u00b5\u0006\u00b5@\u00eaa\u00d8\b\u00c9\u00c0\u0095\u00ff\u0088\u00de\u00f0\u00ff\u0018\u00b3\u00d2\u00fa\u001f\u00eb\u00b3\u00ecSN\u001dw\u00f3\u00f7`\u00fey~\u0088p\u0016c\u00be%\u00df\u0010\u00fdW\u00c0\u00d3;dMp\u00cc[\u00f3P\u00a5\u00c3\u00110".length();
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
                            var11_3[var17_4++] = CP_Cz.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u0080wR\u00cd\u00c1F=\u00f8P2{\u00d3\u0087\u00d6\u0017S=6\u00cd\f\u0091~\u0098\u00b3\u0010#\u00ac\u00d7\u0096\u0000\u009d\u0019\u008c\u00dajV\u0092f\u00ec\u00c8\u00fb";
                            var18_6 = "\u0080wR\u00cd\u00c1F=\u00f8P2{\u00d3\u0087\u00d6\u0017S=6\u00cd\f\u0091~\u0098\u00b3\u0010#\u00ac\u00d7\u0096\u0000\u009d\u0019\u008c\u00dajV\u0092f\u00ec\u00c8\u00fb".length();
                            var15_7 = 24;
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
                            var11_3[var17_4++] = CP_Cz.a(var19_9).intern();
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
                CP_Cz.d = new HashMap<K, V>(13);
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
                var6_12 = new long[27];
                var3_13 = 0;
                var4_14 = "\u0086\u00de\u008c\u008bF\u00ce\u0013\u00b8\u00bd\u0019\u00bf7\u00a3\u00bc\u008aJ\u00dd!\u0005\u00c4\u009e\u007f\u00bd\u0093;Z\u0019\u0098ZZ\u00ab\u00f4\u00f1\u00b2\u00ae\u00c2Nm\u00d7\r\u00d1\u00e8l\u0000\u00e6>>\u00e4\u0019F\u0084\u00e9,\b\u00cd\u00e9\u00d3\u00e4\u0094\u00ef\u00a3)\u0012\u000f\u00d0\f\u00e0\u00a1\u0088`L\u00a9\u00aa\u0018{\u00d20\u000b\u009f7\u00ba#?L\u001a8h\u00dcX)\u0099\u00a8\u00e3\u00db\u00e0\u00e0\u00c7H\u00a5\u00b5\u0082\u000eCc\u0086n\u0005b\u000f\u0010\u000e\u0019\u00b9\"\u0092 \u0004\u00c6_\u00d6\u000b$*P\u00fa\u0095\u00e2\u00e25#\u0085i\u0090\n\u008d\u00ff\u00c1\tSt)B\u00cfV2\u00a7\u00f3\u00f5t~\u001d}\u00ad58\u0003\u0082@6\u00c7\u00ea\u00cc\u00b1G\u0088\u0016\u0085j\u0004C\u0081\u00fe\u001e$Ku\f\u007f\u00aa$?h\u008b\u00db?\u0006:\u00d8\\\u00cd\u0097\u0094\u0094\u00ca\u00f4\u00e8\u00e9\"\u00fe\r";
                var5_15 = "\u0086\u00de\u008c\u008bF\u00ce\u0013\u00b8\u00bd\u0019\u00bf7\u00a3\u00bc\u008aJ\u00dd!\u0005\u00c4\u009e\u007f\u00bd\u0093;Z\u0019\u0098ZZ\u00ab\u00f4\u00f1\u00b2\u00ae\u00c2Nm\u00d7\r\u00d1\u00e8l\u0000\u00e6>>\u00e4\u0019F\u0084\u00e9,\b\u00cd\u00e9\u00d3\u00e4\u0094\u00ef\u00a3)\u0012\u000f\u00d0\f\u00e0\u00a1\u0088`L\u00a9\u00aa\u0018{\u00d20\u000b\u009f7\u00ba#?L\u001a8h\u00dcX)\u0099\u00a8\u00e3\u00db\u00e0\u00e0\u00c7H\u00a5\u00b5\u0082\u000eCc\u0086n\u0005b\u000f\u0010\u000e\u0019\u00b9\"\u0092 \u0004\u00c6_\u00d6\u000b$*P\u00fa\u0095\u00e2\u00e25#\u0085i\u0090\n\u008d\u00ff\u00c1\tSt)B\u00cfV2\u00a7\u00f3\u00f5t~\u001d}\u00ad58\u0003\u0082@6\u00c7\u00ea\u00cc\u00b1G\u0088\u0016\u0085j\u0004C\u0081\u00fe\u001e$Ku\f\u007f\u00aa$?h\u008b\u00db?\u0006:\u00d8\\\u00cd\u0097\u0094\u0094\u00ca\u00f4\u00e8\u00e9\"\u00fe\r".length();
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
                    var4_14 = "\u00d25\u00ad\u0081xI\u0006\u009a\u0081R-\u00e8\u00df\u0086\u00d7\u0082";
                    var5_15 = "\u00d25\u00ad\u0081xI\u0006\u009a\u0081R-\u00e8\u00df\u0086\u00d7\u0082".length();
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
        CP_Cz.b = var6_12;
        CP_Cz.c = new Integer[27];
        CP_Cz.REDSTONE = new CP_Cz(new String[]{var11_3[44], var11_3[35]});
        v15 = new String[CP_Cz.a("r", (int)26802, (long)(336136172531227644L ^ var20))];
        v15[0] = var11_3[27];
        v15[1] = var11_3[2];
        v15[2] = var11_3[68];
        v15[3] = var11_3[17];
        v15[4] = var11_3[38];
        v15[5] = var11_3[19];
        v15[CP_Cz.a("r", (int)19646, (long)(5338656570250444795L ^ var20))] = var11_3[75];
        v15[CP_Cz.a("r", (int)27886, (long)(7640946134613761976L ^ var20))] = var11_3[8];
        v15[CP_Cz.a("r", (int)24102, (long)(665341004729363835L ^ var20))] = var11_3[40];
        v15[CP_Cz.a("r", (int)1215, (long)(8199864391202535423L ^ var20))] = var11_3[20];
        CP_Cz.TRAPDOOR = new CP_Cz(v15);
        v16 = new String[CP_Cz.a("r", (int)28704, (long)(7633395610263815028L ^ var20))];
        v16[0] = var11_3[72];
        v16[1] = var11_3[51];
        v16[2] = var11_3[96];
        v16[3] = var11_3[42];
        v16[4] = var11_3[52];
        v16[5] = var11_3[69];
        v16[CP_Cz.a("r", (int)3684, (long)(301266862803942695L ^ var20))] = var11_3[80];
        v16[CP_Cz.a("r", (int)7846, (long)(3679770746521742826L ^ var20))] = var11_3[6];
        v16[CP_Cz.a("r", (int)26508, (long)(5031365548719772891L ^ var20))] = var11_3[53];
        v16[CP_Cz.a("r", (int)7219, (long)(5991896890906668904L ^ var20))] = var11_3[0];
        v16[CP_Cz.a("r", (int)11649, (long)(3305197661029686996L ^ var20))] = var11_3[84];
        v16[CP_Cz.a("r", (int)15768, (long)(8494328748346592971L ^ var20))] = var11_3[31];
        v16[CP_Cz.a("r", (int)14602, (long)(2181240572365720144L ^ var20))] = var11_3[88];
        v16[CP_Cz.a("r", (int)21940, (long)(8103794331830167285L ^ var20))] = var11_3[63];
        v16[CP_Cz.a("r", (int)1561, (long)(495794427378267456L ^ var20))] = var11_3[21];
        v16[CP_Cz.a("r", (int)26156, (long)(5683273744334820723L ^ var20))] = var11_3[65];
        v16[CP_Cz.a("r", (int)19544, (long)(2785275967459573534L ^ var20))] = var11_3[74];
        v16[CP_Cz.a("r", (int)6949, (long)(6973916775658907773L ^ var20))] = var11_3[89];
        v16[CP_Cz.a("r", (int)6421, (long)(1767590090361104969L ^ var20))] = var11_3[1];
        CP_Cz.CARPET = new CP_Cz(v16);
        CP_Cz.ANVIL = new CP_Cz(new String[]{var11_3[59], var11_3[67], var11_3[13]});
        CP_Cz.END_PORTAL = new CP_Cz(new String[]{var11_3[78], var11_3[103], var11_3[94]});
        CP_Cz.BOOK = new CP_Cz(new String[]{var11_3[24], var11_3[79], var11_3[97], var11_3[90]});
        CP_Cz.RAILS = new CP_Cz(new String[]{var11_3[71], var11_3[55], var11_3[48], var11_3[37], var11_3[57]});
        CP_Cz.TRIPWIRE_HOOK = new CP_Cz(new String[]{var11_3[50], var11_3[22]});
        CP_Cz.OBSERVER = new CP_Cz(new String[]{var11_3[64]});
        CP_Cz.LEVER = new CP_Cz(new String[]{var11_3[11]});
        CP_Cz.HEAD = new CP_Cz(new String[]{var11_3[77], var11_3[3], var11_3[83]});
        v17 = new String[CP_Cz.a("r", (int)3802, (long)(2204858226779618699L ^ var20))];
        v17[0] = var11_3[62];
        v17[1] = var11_3[56];
        v17[2] = var11_3[41];
        v17[3] = var11_3[98];
        v17[4] = var11_3[61];
        v17[5] = var11_3[104];
        v17[CP_Cz.a("r", (int)3684, (long)(301266862803942695L ^ var20))] = var11_3[102];
        v17[CP_Cz.a("r", (int)7846, (long)(3679770746521742826L ^ var20))] = var11_3[76];
        v17[CP_Cz.a("r", (int)26508, (long)(5031365548719772891L ^ var20))] = var11_3[15];
        v17[CP_Cz.a("r", (int)7219, (long)(5991896890906668904L ^ var20))] = var11_3[23];
        v17[CP_Cz.a("r", (int)11649, (long)(3305197661029686996L ^ var20))] = var11_3[25];
        v17[CP_Cz.a("r", (int)1187, (long)(3848680705620867057L ^ var20))] = var11_3[99];
        v17[CP_Cz.a("r", (int)5861, (long)(2414245642983957947L ^ var20))] = var11_3[14];
        v17[CP_Cz.a("r", (int)14821, (long)(7573868559226096295L ^ var20))] = var11_3[29];
        v17[CP_Cz.a("r", (int)4573, (long)(1221141609030509209L ^ var20))] = var11_3[82];
        v17[CP_Cz.a("r", (int)1375, (long)(2509494355684423184L ^ var20))] = var11_3[10];
        v17[CP_Cz.a("r", (int)17453, (long)(4242031631813195645L ^ var20))] = var11_3[16];
        v17[CP_Cz.a("r", (int)1318, (long)(4887292975231858273L ^ var20))] = var11_3[47];
        CP_Cz.SHULKER = new CP_Cz(v17);
        v18 = new String[CP_Cz.a("r", (int)1318, (long)(4887292975231858273L ^ var20))];
        v18[0] = var11_3[60];
        v18[1] = var11_3[4];
        v18[2] = var11_3[95];
        v18[3] = var11_3[70];
        v18[4] = var11_3[28];
        v18[5] = var11_3[26];
        v18[CP_Cz.a("r", (int)3684, (long)(301266862803942695L ^ var20))] = var11_3[73];
        v18[CP_Cz.a("r", (int)7846, (long)(3679770746521742826L ^ var20))] = var11_3[87];
        v18[CP_Cz.a("r", (int)26508, (long)(5031365548719772891L ^ var20))] = var11_3[30];
        v18[CP_Cz.a("r", (int)7219, (long)(5991896890906668904L ^ var20))] = var11_3[9];
        v18[CP_Cz.a("r", (int)11649, (long)(3305197661029686996L ^ var20))] = var11_3[81];
        v18[CP_Cz.a("r", (int)1187, (long)(3848680705620867057L ^ var20))] = var11_3[5];
        v18[CP_Cz.a("r", (int)5861, (long)(2414245642983957947L ^ var20))] = var11_3[85];
        v18[CP_Cz.a("r", (int)14821, (long)(7573868559226096295L ^ var20))] = var11_3[66];
        v18[CP_Cz.a("r", (int)4573, (long)(1221141609030509209L ^ var20))] = var11_3[34];
        v18[CP_Cz.a("r", (int)1375, (long)(2509494355684423184L ^ var20))] = var11_3[49];
        v18[CP_Cz.a("r", (int)17453, (long)(4242031631813195645L ^ var20))] = var11_3[105];
        CP_Cz.BUNDLE = new CP_Cz(v18);
        CP_Cz.CONTAINER = new CP_Cz(new String[]{var11_3[54], var11_3[7], var11_3[12], var11_3[100]});
        CP_Cz.CP_z = CP_Cz.CP_U();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6D75;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_Cz", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Cz.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Cz.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_Cz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Cz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
