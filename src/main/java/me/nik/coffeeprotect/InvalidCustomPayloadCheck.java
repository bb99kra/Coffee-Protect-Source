/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.util.NumberConversions
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
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.UserData;
import me.nik.coffeeprotect.CheckResult;
import me.nik.coffeeprotect.CheckInfo;
import me.nik.coffeeprotect.Check;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.Location;
import org.bukkit.util.NumberConversions;

@CheckInfo(CP_J="Invalid Custom Payload", CP_M="Checks for invalid custom payload packets")
public class InvalidCustomPayloadCheck
extends Check {
    private float CP_A = 0.0f;
    private long CP_B = 0L;
    private static final int CP_G;
    private static final int CP_f;
    private static final int CP_F;
    private static final int CP_m;
    private static final int CP_a;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;
    private static final long[] j;
    private static final Long[] k;
    private static final Map l;
    private static transient /* synthetic */ String pdBSBAnXoM = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public InvalidCustomPayloadCheck(UserData ilIlTM) {
        super(ilIlTM, CP_Oq.CHECKS_INVALID_CUSTOM_PAYLOAD_ENABLED.CP_t());
    }

    private static double CP_Z(long l, Location location) {
        return NumberConversions.square((double)((double)InvalidCustomPayloadCheck.CP_E(l) - location.getX())) + NumberConversions.square((double)((double)InvalidCustomPayloadCheck.CP_H(l) - location.getY())) + NumberConversions.square((double)((double)InvalidCustomPayloadCheck.CP_Y(l) - location.getZ()));
    }

    private static int CP_E(long l) {
        long l2 = b ^ 0x48A6FF8B7AABL;
        return (int)(l << 0 >> InvalidCustomPayloadCheck.b("d", (int)30883, (long)(0x6E66A7B700E6A6FDL ^ l2)));
    }

    private static int CP_H(long l) {
        long l2 = b ^ 0xCC31BB343A4L;
        return (int)(l << InvalidCustomPayloadCheck.b("d", (int)17279, (long)(0x470E6F1CD1F52433L ^ l2)) >> InvalidCustomPayloadCheck.b("d", (int)13466, (long)(0x109234A5AB8453DFL ^ l2)));
    }

    private static int CP_Y(long l) {
        long l2 = b ^ 0x1B41C73E5866L;
        return (int)(l << InvalidCustomPayloadCheck.b("d", (int)29811, (long)(0x671E882E59BF88FCL ^ l2)) >> InvalidCustomPayloadCheck.b("d", (int)27371, (long)(0x2E18334602E1679L ^ l2)));
    }

    /*
     * Exception decompiling
     */
    @Override
    public CheckResult CP_h(PacketReceiveEvent var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [25[TRYBLOCK]], but top level block is 90[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            block21: {
                                InvalidCustomPayloadCheck.b = CP_s.a(3333490147535127281L, -353102473853109420L, MethodHandles.lookup().lookupClass()).a(28682455317985L);
                                InvalidCustomPayloadCheck.f = new HashMap<K, V>(13);
                                var22 = InvalidCustomPayloadCheck.b ^ 86440510685007L;
                                var24_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                v0 = SecretKeyFactory.getInstance("DES");
                                v1 = new byte[8];
                                v2 = v1;
                                v1[0] = (byte)(var22 >>> 56);
                                for (var25_2 = 1; var25_2 < 8; ++var25_2) {
                                    v2 = v2;
                                    v2[var25_2] = (byte)(var22 << var25_2 * 8 >>> 56);
                                }
                                var24_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                                var31_3 = new String[40];
                                var29_4 = 0;
                                var28_5 = "\\\u00fdQ\u00f5\u00a9J\u00f2\u0001{Iy\u00e8e\u00d2\u009dJ n\u00ca\u00fc\u00b7\u00d6H\u000e\u00d5\u00de7\u00d4O\u0083h\u00d3[\u0092\u00f3fB\u0018H\u00d5t\u00c1\u00ed\u00fd<\u0091\u000e\u001f\u00db\u0010,\u0087\u00a7\u00a7a\u0090\u00d2g\u00f8MA\u0018\u00da\u00ffY\u00f48\u00af\u00f8\u00bd\u0000\u00ad\u00ba`\u00ac!6%\u00f5I\u000f\u009d\u00fbl\u00d3\u0002\u00e1\u0012\u00f8\u0092\u0015?\u00f5\u00f2\u00ae\u00b1]\u0019\u009b\u00e5\u00a7\u0019\u008a=S\u0014\u0000\u009e\u00b6o\u00f3\u00db\u00a7\u0092\u00b8\u00fcT;\u00f3\u0004^\u00db\u00cd(\u00b3\u0096\u00fb\tcx3\u00d88\u0006V\u00b1/\u00e8p;\f\u00d80X\u009d\u00a1\u00a4\u00df\u000fP\u00d4\u0002\u00de\u00eeb\u00990y\u00ce\u001d\t\u00bd\u00b1\u0094 \u0083\u001aj\u0088,\u0010p|\u00de4C\u0000T\u0085\u0089\u00f0\r\u00e8G<7\u009e\u008b\u0010\u0001\u008b \u0016#&\u00e2M8\u00c0\"\u0090\u00a4\u00b3\u000f3\u008a\u00e5\u00ed\u00126j\u00f4\u00ed/4(\u00913\u0099t\u00c9Y\u00c1m\u00e6\u0083\b\u00faS3\u0005\n/\u00d1}\u0012\u00cd\u008a\u00cd\u00fb\u00d3\u0089_\u00a4\u00ed\u00c7\u00b8N\u00c7\u009e\u007f\u00c6\u00fb\u0007 j\u00d6\u00c2A\u00d9\u000fvJ<dGl7\u008b\u0007\u009c<`b\u00d9\u00ff\u00da\u0081i\u0005\u00c7\u00b6\u008a\u00cb_[00\u00e6\u00d9\u00efm\u007f3\u0010\u009et%\u00e2\u00d9\u00cd\u00b6\u00e1\u0007O\u000bF\u00e9\u00be\u0083\u0091\u0016\u0083\u00fc\u00d6\u00b6\u00c9\u00d9\u00d6J:\u00cc\u00ac`\u00a9:Fh\u00fc\u00e4|\u0005>5\u00c7` ]\u00ef\u00ec\u00e8d{\u0013J\u00e7\u009b\u0082g\u00bd9_\u00c8\u00a9\u00d4\u00cf\u00ae0=\u00ac\u00e3\u001b\u00c8d\u00a5+V\u00f7\u00ca(\u008fn\u00bf\u0080o\u00a7\u00cf\u0007\\\u001d\u00a8\u001efRXX\u0083b\u008f=[\u00a6\u00a0I}\u00ce\u00b2\u00c9\u0006\u0098\u00ad@n\u00cb\u0017\u00ff/\u0018o\u00b8 \u000bI\u00d9\u008a\u00dd\u00e8\u00be\u0018\u00c5^bHk\u00e0\u00f9p\u00b9\u0094\u0099\u00faL\u001f\u00d9\u001e\u000f\u0082iU\u00de\u00ff<\u00060\u00fa0\u00f4>\u00b7!\u00ce\u00e8\u00e0S`\u0089\u00db\u00deu\u00f5p\u00f4\u00c8P\u00d1M\u00d1R\u0007O\u00aa\u00c8XM\u0002\u00d5Y\u00d9\u00b86\u00e1\u00b1\u00fb\u00f3p\u00f6\u0096-\u00c3,c, \u00f0X\u00dfZ\u0001\u00dd\u008e=C,\u00cd-\u0019\u00e5\u00a4\b\u00f9](n\u0001Con\u00ab\u00c8\u00ac\u00af5e\u00d4j\u0018\u001c\u00de\u00832\u00a3\u0003\u0017\u00b31\u00ef\u0083\u00d9\u00c9\u00fc\u00d1xc+C\u0093\u00de\u00e7y\u00d3(\u000e\u0084W\n5-\u00b2a(\u00a9UI\u00a49\u00ed;)kOD\u0014eA\u00c2'\u00a9\u0092X4\u00b3@(\u00a4\u00a3\u00bfq\u00c7\u00ddT\u00fc \u001f\u00e9\u001daI\u009di\u00aa\u00d0\u00a2.\u00ba\u00e9\u000b\u00e2\u00d4RE\r\u009bQ\u00d5\u008a1~\u00cb\u00ef\u00e7\u007f\u00be\u00ff\u00d4(,f\u009a\u00d7\u00bbdg?f\u00dfF,\u00d1\u001f\u00b0a{\u000eq\u00a9T\u00e2\u001fsm\u008eY\u001d\u00d0\u00fe\u00c1\u007fG\u00f5U\u00a5\u00e8|:H \u00fc\u00b1\u0007u\u001e\u00a0\u00b7\u00e2\u00f2\u00f6h\u00bd\u0005z\u00b3[\u0088\u00a7\u00d4\u001c\u0001\u00abU\u00e3A\u0019\u00bf\ty,\u0003W(A\u007f\u000b\u00f4\u00ba\u00e32\u00a0\u00b7\u00a1\":*r\"?\u00ae\u00e1\u0088\u0086\u00f4Zu1\u0017Z\u00f1\u001b!\u00dc\u00ac3\u00b7\u00e6o4\u0086\u0083/{(\u00d7\u00a8\u00f0\u00a1~#\u00e3\u00dd\u00fe\u00b7\u001e3\u00bf\u00f1\u0081\u00b9\u001a\u00dd\u0097\u0014\u00da\u009e\u00b9JGg\u00c4\u00ea\u00da\u00fb\u00a4{|8\u00e6\u00e4\u00ab\u00a1J\u0019\u0018Y\u009f\u00c8\u00e0\u00f9$\u0013\u00b6\r\u00e0\u00d8\u00fe\u0016\u00cd\u00d2\u00d4\u0093\u0080\u00f7\u0087\u00de\u00b3\u00c4_ \u00b9\u00beB\u009a\u0017\u00a2\u00f6\u00e9m\rC\u0016}\u0006f,\u0085\u008d\u00a5\u008bi9*7\u00d9\u00b8\u00d7\u00f1\u0082\u00b7\u00efB \u0095\u000e\u00f7\u0083/\u00b6g'\u00d1\u00be\u00b4\u008cj\u0081MS\u00f7\f\u0082+=\u00becBW\u00dc\u00a1M\u00d0`q\u00b7\u0010\u00beb\u00c4\u0092\\\u00bdR\u0003,\u007f\u00fdp\u008c(\u00cc_ R\u00a8\r\u00cb\u00f3\u00a4\u00835RNiA\u0011\u009fZB\u00f0\u00ac\u00ae\u00f5E\u001f\u00ca\u00823$\u0082<\u00e7fx\u00ed(\bjn\u00ees\u00c6}v\u00a7\u007f\u00045\u00a9\u0018\u009aMU\u0017\u00dd\f\u0016\u00d5r\u0017\u00d6\u00d7\u0094\u0083\t\u00e0cn\u008b\u00e6\u00df\u00c8\u009dA\u001e\u00b40,\u009bx\u0015\u00b1\u008c\u00ba_\u00f7\u00c2\u00b3\u00da_\u00ef\u00e7O5\u00b0\u00cf$]{\u0095\u00fc\u00fe\u0097 69\u009a\u00cb\u00e6\u0002\u00c9\u00d8\u0005\u00bbp\u0080s?\u0019\u00dbZ\u0084}\u009eD(Z\u0010\u0090UE\u00db\u00eb\u00c4\u00f8>\u00c6\u00e07\u00c7\u00da\u00c9\u00f3\u00ddq\u00fa\u00adX=1\u000e\u0014\r|Dd\u00c48\u00f4\u00c0-H)'\u00ea\u0019(\u00cd\u00fb\u0084\u00ceB4\u00d5\u00b9\u000eB\u00f0\f\u00e9\u00b9\u00ba\t\u00f8\u001di\u00ben\u00a5S\u00d86\u0095\u00a4\\,TKJR\u00a7\u0089e\u00fdE\u0018\u00ca0]k\u00ad\u00f5\u0082+\u00ca\u0005\u0005!\u008aq\u00eb\u00dc\u00fa\u00f7\u00d5N\u00f8\u00e7\u008c\u00fe\u00a4t\u00eaUm/\u008fB\u0083\u000f\u0002\u0005\u0085\u00bb\u001b \u0092\u00b4\u00ea\u00a0\u0085\u00b8\u0094\u00de+%8\"170\u00a1X\u00c0\u00db\u0083*\u00faJ;\u00a0pX\u001b\u00bb\u00cdt\u0015\u00bc\u00c6\u00cd\u0002\u0088s\u00ab\u007f\u00ab\u00ff\u0090|\u008aN\u00af\u00e6q\u001eK\u0095\u00dd\u00d1\u00df(\u0003\u0003\u00f3\u00e5\u008c\u00f3'/\u00b4\f\u00bf8\u00b5\u00fe7 \u0085\u0006\u00ce\u00b8\"l\u00d1X\u00e8P\u008e\u00c14\u001d\u00ddU\u00ab\u008f\u00fa\u00e7s\u00b7\u0092\u00e9\u00f5[\fh\n\u00a69uh\u00f5W\u00fc\u001d\rE\u0089\u00de\u00c7uD\u0016#\u0015\u00c7\u00c5@)b \u001c\u00f2<\u00fa^\u00d6\u00f6\u00bf_8]\u00e6\u009fFu\u00c6\u00f8\u0090\u00cb\u00a3?0&\u00f9\u00c3\u00e7,]\u00dd\u00ca8\u008e \"\u00a8>$R\u00ad~L\u00b1\u00e3\u00ea\u00b2\u007fhJE\u00db\u00b9v\u00b3\u00d8\u0000Z1-\u00e7\u00e8\u0014\u00e4\u00e7L\u00b7 \u0093\u00d8\u00e7\u00e8\u00cf\u00b7ES\u0012e\u00fe`\u0000g\u00be>\u00ce\u00ba#d\u00f4\u00b1\u00fe,\u00c8\u00db\u0013\nQ\u00ca\u00d4\u009d(\u00c0\u00a6\u008a\"\u0006\u00a9\u0093\u00c4\u0091\u00e8\u00c7F\u00c7d\u00dcet\u00ab\u0002\u00f0\u0087\"9\u00cc\t7GD\u00a7S\u009f\u00e8\u00adY}\u0012\u00b2\u00efD\u00e0(\u00e7\u0092\u00a9\u00d8\u00f6\u001c\u0016\u00c7\u00881R\u00d8\u0095*\u0083\u0012}\u009bJ\u0007\u0004N\u00fa27\u00c0\u0083x\u0089\u0085Y\u009c\u000f&\u00b7\u00f4v\u001ce\u00fc";
                                var30_6 = "\\\u00fdQ\u00f5\u00a9J\u00f2\u0001{Iy\u00e8e\u00d2\u009dJ n\u00ca\u00fc\u00b7\u00d6H\u000e\u00d5\u00de7\u00d4O\u0083h\u00d3[\u0092\u00f3fB\u0018H\u00d5t\u00c1\u00ed\u00fd<\u0091\u000e\u001f\u00db\u0010,\u0087\u00a7\u00a7a\u0090\u00d2g\u00f8MA\u0018\u00da\u00ffY\u00f48\u00af\u00f8\u00bd\u0000\u00ad\u00ba`\u00ac!6%\u00f5I\u000f\u009d\u00fbl\u00d3\u0002\u00e1\u0012\u00f8\u0092\u0015?\u00f5\u00f2\u00ae\u00b1]\u0019\u009b\u00e5\u00a7\u0019\u008a=S\u0014\u0000\u009e\u00b6o\u00f3\u00db\u00a7\u0092\u00b8\u00fcT;\u00f3\u0004^\u00db\u00cd(\u00b3\u0096\u00fb\tcx3\u00d88\u0006V\u00b1/\u00e8p;\f\u00d80X\u009d\u00a1\u00a4\u00df\u000fP\u00d4\u0002\u00de\u00eeb\u00990y\u00ce\u001d\t\u00bd\u00b1\u0094 \u0083\u001aj\u0088,\u0010p|\u00de4C\u0000T\u0085\u0089\u00f0\r\u00e8G<7\u009e\u008b\u0010\u0001\u008b \u0016#&\u00e2M8\u00c0\"\u0090\u00a4\u00b3\u000f3\u008a\u00e5\u00ed\u00126j\u00f4\u00ed/4(\u00913\u0099t\u00c9Y\u00c1m\u00e6\u0083\b\u00faS3\u0005\n/\u00d1}\u0012\u00cd\u008a\u00cd\u00fb\u00d3\u0089_\u00a4\u00ed\u00c7\u00b8N\u00c7\u009e\u007f\u00c6\u00fb\u0007 j\u00d6\u00c2A\u00d9\u000fvJ<dGl7\u008b\u0007\u009c<`b\u00d9\u00ff\u00da\u0081i\u0005\u00c7\u00b6\u008a\u00cb_[00\u00e6\u00d9\u00efm\u007f3\u0010\u009et%\u00e2\u00d9\u00cd\u00b6\u00e1\u0007O\u000bF\u00e9\u00be\u0083\u0091\u0016\u0083\u00fc\u00d6\u00b6\u00c9\u00d9\u00d6J:\u00cc\u00ac`\u00a9:Fh\u00fc\u00e4|\u0005>5\u00c7` ]\u00ef\u00ec\u00e8d{\u0013J\u00e7\u009b\u0082g\u00bd9_\u00c8\u00a9\u00d4\u00cf\u00ae0=\u00ac\u00e3\u001b\u00c8d\u00a5+V\u00f7\u00ca(\u008fn\u00bf\u0080o\u00a7\u00cf\u0007\\\u001d\u00a8\u001efRXX\u0083b\u008f=[\u00a6\u00a0I}\u00ce\u00b2\u00c9\u0006\u0098\u00ad@n\u00cb\u0017\u00ff/\u0018o\u00b8 \u000bI\u00d9\u008a\u00dd\u00e8\u00be\u0018\u00c5^bHk\u00e0\u00f9p\u00b9\u0094\u0099\u00faL\u001f\u00d9\u001e\u000f\u0082iU\u00de\u00ff<\u00060\u00fa0\u00f4>\u00b7!\u00ce\u00e8\u00e0S`\u0089\u00db\u00deu\u00f5p\u00f4\u00c8P\u00d1M\u00d1R\u0007O\u00aa\u00c8XM\u0002\u00d5Y\u00d9\u00b86\u00e1\u00b1\u00fb\u00f3p\u00f6\u0096-\u00c3,c, \u00f0X\u00dfZ\u0001\u00dd\u008e=C,\u00cd-\u0019\u00e5\u00a4\b\u00f9](n\u0001Con\u00ab\u00c8\u00ac\u00af5e\u00d4j\u0018\u001c\u00de\u00832\u00a3\u0003\u0017\u00b31\u00ef\u0083\u00d9\u00c9\u00fc\u00d1xc+C\u0093\u00de\u00e7y\u00d3(\u000e\u0084W\n5-\u00b2a(\u00a9UI\u00a49\u00ed;)kOD\u0014eA\u00c2'\u00a9\u0092X4\u00b3@(\u00a4\u00a3\u00bfq\u00c7\u00ddT\u00fc \u001f\u00e9\u001daI\u009di\u00aa\u00d0\u00a2.\u00ba\u00e9\u000b\u00e2\u00d4RE\r\u009bQ\u00d5\u008a1~\u00cb\u00ef\u00e7\u007f\u00be\u00ff\u00d4(,f\u009a\u00d7\u00bbdg?f\u00dfF,\u00d1\u001f\u00b0a{\u000eq\u00a9T\u00e2\u001fsm\u008eY\u001d\u00d0\u00fe\u00c1\u007fG\u00f5U\u00a5\u00e8|:H \u00fc\u00b1\u0007u\u001e\u00a0\u00b7\u00e2\u00f2\u00f6h\u00bd\u0005z\u00b3[\u0088\u00a7\u00d4\u001c\u0001\u00abU\u00e3A\u0019\u00bf\ty,\u0003W(A\u007f\u000b\u00f4\u00ba\u00e32\u00a0\u00b7\u00a1\":*r\"?\u00ae\u00e1\u0088\u0086\u00f4Zu1\u0017Z\u00f1\u001b!\u00dc\u00ac3\u00b7\u00e6o4\u0086\u0083/{(\u00d7\u00a8\u00f0\u00a1~#\u00e3\u00dd\u00fe\u00b7\u001e3\u00bf\u00f1\u0081\u00b9\u001a\u00dd\u0097\u0014\u00da\u009e\u00b9JGg\u00c4\u00ea\u00da\u00fb\u00a4{|8\u00e6\u00e4\u00ab\u00a1J\u0019\u0018Y\u009f\u00c8\u00e0\u00f9$\u0013\u00b6\r\u00e0\u00d8\u00fe\u0016\u00cd\u00d2\u00d4\u0093\u0080\u00f7\u0087\u00de\u00b3\u00c4_ \u00b9\u00beB\u009a\u0017\u00a2\u00f6\u00e9m\rC\u0016}\u0006f,\u0085\u008d\u00a5\u008bi9*7\u00d9\u00b8\u00d7\u00f1\u0082\u00b7\u00efB \u0095\u000e\u00f7\u0083/\u00b6g'\u00d1\u00be\u00b4\u008cj\u0081MS\u00f7\f\u0082+=\u00becBW\u00dc\u00a1M\u00d0`q\u00b7\u0010\u00beb\u00c4\u0092\\\u00bdR\u0003,\u007f\u00fdp\u008c(\u00cc_ R\u00a8\r\u00cb\u00f3\u00a4\u00835RNiA\u0011\u009fZB\u00f0\u00ac\u00ae\u00f5E\u001f\u00ca\u00823$\u0082<\u00e7fx\u00ed(\bjn\u00ees\u00c6}v\u00a7\u007f\u00045\u00a9\u0018\u009aMU\u0017\u00dd\f\u0016\u00d5r\u0017\u00d6\u00d7\u0094\u0083\t\u00e0cn\u008b\u00e6\u00df\u00c8\u009dA\u001e\u00b40,\u009bx\u0015\u00b1\u008c\u00ba_\u00f7\u00c2\u00b3\u00da_\u00ef\u00e7O5\u00b0\u00cf$]{\u0095\u00fc\u00fe\u0097 69\u009a\u00cb\u00e6\u0002\u00c9\u00d8\u0005\u00bbp\u0080s?\u0019\u00dbZ\u0084}\u009eD(Z\u0010\u0090UE\u00db\u00eb\u00c4\u00f8>\u00c6\u00e07\u00c7\u00da\u00c9\u00f3\u00ddq\u00fa\u00adX=1\u000e\u0014\r|Dd\u00c48\u00f4\u00c0-H)'\u00ea\u0019(\u00cd\u00fb\u0084\u00ceB4\u00d5\u00b9\u000eB\u00f0\f\u00e9\u00b9\u00ba\t\u00f8\u001di\u00ben\u00a5S\u00d86\u0095\u00a4\\,TKJR\u00a7\u0089e\u00fdE\u0018\u00ca0]k\u00ad\u00f5\u0082+\u00ca\u0005\u0005!\u008aq\u00eb\u00dc\u00fa\u00f7\u00d5N\u00f8\u00e7\u008c\u00fe\u00a4t\u00eaUm/\u008fB\u0083\u000f\u0002\u0005\u0085\u00bb\u001b \u0092\u00b4\u00ea\u00a0\u0085\u00b8\u0094\u00de+%8\"170\u00a1X\u00c0\u00db\u0083*\u00faJ;\u00a0pX\u001b\u00bb\u00cdt\u0015\u00bc\u00c6\u00cd\u0002\u0088s\u00ab\u007f\u00ab\u00ff\u0090|\u008aN\u00af\u00e6q\u001eK\u0095\u00dd\u00d1\u00df(\u0003\u0003\u00f3\u00e5\u008c\u00f3'/\u00b4\f\u00bf8\u00b5\u00fe7 \u0085\u0006\u00ce\u00b8\"l\u00d1X\u00e8P\u008e\u00c14\u001d\u00ddU\u00ab\u008f\u00fa\u00e7s\u00b7\u0092\u00e9\u00f5[\fh\n\u00a69uh\u00f5W\u00fc\u001d\rE\u0089\u00de\u00c7uD\u0016#\u0015\u00c7\u00c5@)b \u001c\u00f2<\u00fa^\u00d6\u00f6\u00bf_8]\u00e6\u009fFu\u00c6\u00f8\u0090\u00cb\u00a3?0&\u00f9\u00c3\u00e7,]\u00dd\u00ca8\u008e \"\u00a8>$R\u00ad~L\u00b1\u00e3\u00ea\u00b2\u007fhJE\u00db\u00b9v\u00b3\u00d8\u0000Z1-\u00e7\u00e8\u0014\u00e4\u00e7L\u00b7 \u0093\u00d8\u00e7\u00e8\u00cf\u00b7ES\u0012e\u00fe`\u0000g\u00be>\u00ce\u00ba#d\u00f4\u00b1\u00fe,\u00c8\u00db\u0013\nQ\u00ca\u00d4\u009d(\u00c0\u00a6\u008a\"\u0006\u00a9\u0093\u00c4\u0091\u00e8\u00c7F\u00c7d\u00dcet\u00ab\u0002\u00f0\u0087\"9\u00cc\t7GD\u00a7S\u009f\u00e8\u00adY}\u0012\u00b2\u00efD\u00e0(\u00e7\u0092\u00a9\u00d8\u00f6\u001c\u0016\u00c7\u00881R\u00d8\u0095*\u0083\u0012}\u009bJ\u0007\u0004N\u00fa27\u00c0\u0083x\u0089\u0085Y\u009c\u000f&\u00b7\u00f4v\u001ce\u00fc".length();
                                var27_7 = 16;
                                var26_8 = -1;
lbl20:
                                // 2 sources

                                while (true) {
                                    v3 = ++var26_8;
                                    v4 = var28_5.substring(v3, v3 + var27_7);
                                    v5 = -1;
                                    break block21;
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = InvalidCustomPayloadCheck.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "%V\u00b3*F\u00f7\u00f8u\"ped\u001c\u00e0\u000e\u001a\u0083O\u007f\u00b2''\t\"\u0018C\u00be/\u001b\u00a5\u00dc\u00b9\u0088\u00b9\u0098c\u00d5\u00f9>\u007f\u00f8G4~z7\u00b7\u0003\u0094";
                                    var30_6 = "%V\u00b3*F\u00f7\u00f8u\"ped\u001c\u00e0\u000e\u001a\u0083O\u007f\u00b2''\t\"\u0018C\u00be/\u001b\u00a5\u00dc\u00b9\u0088\u00b9\u0098c\u00d5\u00f9>\u007f\u00f8G4~z7\u00b7\u0003\u0094".length();
                                    var27_7 = 24;
                                    var26_8 = -1;
lbl34:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var26_8;
                                        v4 = var28_5.substring(v6, v6 + var27_7);
                                        v5 = 0;
                                        break block21;
                                        break;
                                    }
                                    break;
                                }
lbl39:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = InvalidCustomPayloadCheck.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    break block22;
                                    break;
                                }
                            }
                            var32_9 = var24_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                        InvalidCustomPayloadCheck.d = var31_3;
                        InvalidCustomPayloadCheck.e = new String[40];
                        InvalidCustomPayloadCheck.i = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var22 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v9 = v9;
                            v9[var12_11] = (byte)(var22 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[20];
                        var14_13 = 0;
                        var15_14 = "\u00e7UT\u00ad\u0018\u00e2\u00dd\u0019\u009bz\u00f2/A(\u0001\u00e1\u0004\u0001c\u00aa\u000f3\u00cfV\u00c2\u008b\u00b5\u001d\u00fdXd\u00fa:\u0089N\u00c3\u0002\u00f0\u00d3\u00af\u009a\u000b\u00f1\u00b5\u001e_\u008ct\u00e7\u0010y@=\u00af\u001a] \u00f8\u008a\u00b7\u00e8q\u00c1\u009fo-\u0010\u00ec\u00ac\u00a46\u00e3@N\u001b\u0096\u00d3\u00f3L5\u00b7'\u00e2\u000f\u0098\u00e5\u0099\u0013P]\u000b_\u00fd6\u00e3\u00ce~kF\u00db~\u000e\u00bf\u0081\u008bn\u00d7\u00a6J*L\u00fcF\u0096o\u00fem\u0006\u00fd.\u00d5\u00af4u\b\u00f8\u0091\u00b6\u0099\u00eac\u000e\u0000\u00bd\u00a3\u001d\u00aa\u0099F\u00ea\u0017\u0004\u00f1W";
                        var16_15 = "\u00e7UT\u00ad\u0018\u00e2\u00dd\u0019\u009bz\u00f2/A(\u0001\u00e1\u0004\u0001c\u00aa\u000f3\u00cfV\u00c2\u008b\u00b5\u001d\u00fdXd\u00fa:\u0089N\u00c3\u0002\u00f0\u00d3\u00af\u009a\u000b\u00f1\u00b5\u001e_\u008ct\u00e7\u0010y@=\u00af\u001a] \u00f8\u008a\u00b7\u00e8q\u00c1\u009fo-\u0010\u00ec\u00ac\u00a46\u00e3@N\u001b\u0096\u00d3\u00f3L5\u00b7'\u00e2\u000f\u0098\u00e5\u0099\u0013P]\u000b_\u00fd6\u00e3\u00ce~kF\u00db~\u000e\u00bf\u0081\u008bn\u00d7\u00a6J*L\u00fcF\u0096o\u00fem\u0006\u00fd.\u00d5\u00af4u\b\u00f8\u0091\u00b6\u0099\u00eac\u000e\u0000\u00bd\u00a3\u001d\u00aa\u0099F\u00ea\u0017\u0004\u00f1W".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v10 = var17_12;
                            v11 = var14_13++;
                            v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v13 = -1;
                            break block23;
                            break;
                        }
lbl78:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "[\u00f5\u00fa\u001anm\u0019\u009e\u009f\u00be\u0097\u00a4\"\u00ea\u0097f";
                            var16_15 = "[\u00f5\u00fa\u001anm\u0019\u009e\u009f\u00be\u0097\u00a4\"\u00ea\u0097f".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v10 = var17_12;
                                v11 = var14_13++;
                                v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v13 = 0;
                                break block23;
                                break;
                            }
                            break;
                        }
lbl91:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            break block24;
                            break;
                        }
                    }
                    var19_18 = v12;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    v14 = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
                    switch (v13) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl104:
                        // 1 sources

                        ** continue;
                    }
                }
                InvalidCustomPayloadCheck.g = var17_12;
                InvalidCustomPayloadCheck.h = new Integer[20];
                InvalidCustomPayloadCheck.CP_a = (int)InvalidCustomPayloadCheck.b("d", (int)7000, (long)(var22 ^ 9051843927667589360L));
                InvalidCustomPayloadCheck.CP_m = (int)InvalidCustomPayloadCheck.b("d", (int)8893, (long)(var22 ^ 8284384123770566930L));
                InvalidCustomPayloadCheck.CP_G = (int)InvalidCustomPayloadCheck.b("d", (int)20349, (long)(var22 ^ 3572903089303688408L));
                InvalidCustomPayloadCheck.CP_F = (int)InvalidCustomPayloadCheck.b("d", (int)8893, (long)(var22 ^ 8284384123770566930L));
                InvalidCustomPayloadCheck.CP_f = (int)InvalidCustomPayloadCheck.b("d", (int)20349, (long)(var22 ^ 3572903089303688408L));
                InvalidCustomPayloadCheck.l = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v15 = SecretKeyFactory.getInstance("DES");
                v16 = new byte[8];
                v17 = v16;
                v16[0] = (byte)(var22 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v17 = v17;
                    v17[var1_21] = (byte)(var22 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v15.generateSecret(new DESKeySpec(v17)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[2];
                var3_23 = 0;
                var4_24 = "\u00b6\u00ebLD\u00ad\u00cd.\u00cd\u00caN\u00f0r\u00b2\u00f2\u00a6\u00c4";
                var5_25 = "\u00b6\u00ebLD\u00ad\u00cd.\u00cd\u00caN\u00f0r\u00b2\u00f2\u00a6\u00c4".length();
                var2_26 = 0;
                while (true) {
                    break block25;
                    break;
                }
lbl131:
                // 1 sources

                while (true) {
                    var6_22[v18] = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
                    if (var2_26 < var5_25) ** continue;
                    break block26;
                    break;
                }
            }
            var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
            v18 = var3_23++;
            var8_28 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            ** while (true)
        }
        InvalidCustomPayloadCheck.j = var6_22;
        InvalidCustomPayloadCheck.k = new Long[2];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String b(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5F29;
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
                throw new RuntimeException("me/nik/coffeeprotect/InvalidCustomPayloadCheck", exception);
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
            InvalidCustomPayloadCheck.e[n2] = InvalidCustomPayloadCheck.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = InvalidCustomPayloadCheck.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/InvalidCustomPayloadCheck" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x41A8;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/InvalidCustomPayloadCheck", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            InvalidCustomPayloadCheck.h[n2] = n3;
        }
        return h[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = InvalidCustomPayloadCheck.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/InvalidCustomPayloadCheck" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6F90;
        if (k[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])InvalidCustomPayloadCheck.l.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    InvalidCustomPayloadCheck.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/InvalidCustomPayloadCheck", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            InvalidCustomPayloadCheck.k[n2] = l4;
        }
        return k[n2];
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = InvalidCustomPayloadCheck.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/InvalidCustomPayloadCheck" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(InvalidCustomPayloadCheck.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(InvalidCustomPayloadCheck.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(InvalidCustomPayloadCheck.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
