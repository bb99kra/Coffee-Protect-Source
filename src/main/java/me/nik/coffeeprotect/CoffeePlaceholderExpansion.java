/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Level
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.core.Filter
 *  org.apache.logging.log4j.core.Filter$Result
 *  org.apache.logging.log4j.core.LifeCycle$State
 *  org.apache.logging.log4j.core.LogEvent
 *  org.apache.logging.log4j.core.Logger
 *  org.apache.logging.log4j.message.Message
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Filter;
import java.util.logging.LogRecord;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CP_Li;
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.CP_PA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.LifeCycle;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.message.Message;

public class CoffeePlaceholderExpansion
implements org.apache.logging.log4j.core.Filter,
Filter {
    private final List<String> CP_e;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static transient /* synthetic */ String axjZExtAaq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CoffeePlaceholderExpansion() {
        long l = a ^ 0x444BB70C99D6L;
        boolean bl = CP_PA.CP_y();
        String[] stringArray = new String[CoffeePlaceholderExpansion.b("d", (int)7284, (long)(0x593647EB2A2CA915L ^ l))];
        stringArray[0] = CoffeePlaceholderExpansion.a("y", (int)27266, (long)(0x23A09902FED4982L ^ l));
        stringArray[1] = CoffeePlaceholderExpansion.a("y", (int)32546, (long)(0x4A535AB45AA05C21L ^ l));
        stringArray[2] = CoffeePlaceholderExpansion.a("y", (int)5126, (long)(0x78570B98C963370DL ^ l));
        stringArray[3] = CoffeePlaceholderExpansion.a("y", (int)12225, (long)(0x2E4EE0DCBD70CD9L ^ l));
        stringArray[4] = CoffeePlaceholderExpansion.a("y", (int)26997, (long)(0x7D352ABAC6CF4A7CL ^ l));
        stringArray[5] = CoffeePlaceholderExpansion.a("y", (int)8876, (long)(0x75327DDADC0D81A3L ^ l));
        stringArray[CoffeePlaceholderExpansion.b("d", (int)21091, (long)(0x290F9188F6CC6717L ^ l))] = CoffeePlaceholderExpansion.a("y", (int)13035, (long)(0x50ECEC450B8A11EAL ^ l));
        stringArray[CoffeePlaceholderExpansion.b("d", (int)14125, (long)(0x37D5E1D61098242L ^ l))] = CoffeePlaceholderExpansion.a("y", (int)17545, (long)(0x30B86BFF20926796L ^ l));
        stringArray[CoffeePlaceholderExpansion.b("d", (int)18407, (long)(0x6496CCC2A5DC7283L ^ l))] = CoffeePlaceholderExpansion.a("y", (int)7822, (long)(0x4F9467555C793D8AL ^ l));
        stringArray[CoffeePlaceholderExpansion.b("d", (int)16562, (long)(0x588707BB7F5E75C5L ^ l))] = CoffeePlaceholderExpansion.a("y", (int)13869, (long)(0x6C1615C65C81533L ^ l));
        stringArray[CoffeePlaceholderExpansion.b("d", (int)22482, (long)(0x17ACD425AA6462B2L ^ l))] = CoffeePlaceholderExpansion.a("y", (int)9386, (long)(0x353EF824BE8307B6L ^ l));
        stringArray[CoffeePlaceholderExpansion.b("d", (int)14109, (long)(0x74670560DD2B827FL ^ l))] = CoffeePlaceholderExpansion.a("y", (int)23049, (long)(0x22CB78462E787913L ^ l));
        stringArray[CoffeePlaceholderExpansion.b("d", (int)3056, (long)(0x29E57258DC6A3E96L ^ l))] = CoffeePlaceholderExpansion.a("y", (int)18117, (long)(0x2A9F8E8B6B0D65C3L ^ l));
        stringArray[CoffeePlaceholderExpansion.b("d", (int)5094, (long)(0x7706D5902C6C268CL ^ l))] = CoffeePlaceholderExpansion.a("y", (int)20980, (long)(0x6C416C0F63DE72F6L ^ l));
        stringArray[CoffeePlaceholderExpansion.b("d", (int)2203, (long)(0x3E4D1B47934E3DEDL ^ l))] = CoffeePlaceholderExpansion.a("y", (int)10429, (long)(0x55EDF378DC3C8BBAL ^ l));
        stringArray[CoffeePlaceholderExpansion.b("d", (int)27370, (long)(0x58E19AFB3D0F5F81L ^ l))] = CoffeePlaceholderExpansion.a("y", (int)12415, (long)(0x6B6EC12C8AD49375L ^ l));
        stringArray[CoffeePlaceholderExpansion.b("d", (int)26956, (long)(0x6C1B8F669A11DC25L ^ l))] = CoffeePlaceholderExpansion.a("y", (int)18412, (long)(0x2A1A9FD06BF064FFL ^ l));
        stringArray[CoffeePlaceholderExpansion.b("d", (int)7052, (long)(0x51A0552708122EE0L ^ l))] = CoffeePlaceholderExpansion.a("y", (int)11019, (long)(0x6D15B8281C040806L ^ l));
        stringArray[CoffeePlaceholderExpansion.b("d", (int)2241, (long)(0xE45D05A18C9BDAFL ^ l))] = CoffeePlaceholderExpansion.a("y", (int)7670, (long)(0x6376F086EA5ABEEFL ^ l));
        stringArray[CoffeePlaceholderExpansion.b("d", (int)12799, (long)(0x704706862BE9849CL ^ l))] = CoffeePlaceholderExpansion.a("y", (int)22944, (long)(0x72FD80CB007BFAAEL ^ l));
        stringArray[CoffeePlaceholderExpansion.b("d", (int)11390, (long)(0x1F1C21405EA61913L ^ l))] = CoffeePlaceholderExpansion.a("y", (int)11157, (long)(0x5C0CDE9707698899L ^ l));
        stringArray[CoffeePlaceholderExpansion.b("d", (int)10639, (long)(0x53EB9AF2EADC9CE7L ^ l))] = CoffeePlaceholderExpansion.a("y", (int)31100, (long)(0x24A3BBA24475DA74L ^ l));
        stringArray[CoffeePlaceholderExpansion.b("d", (int)26795, (long)(0x799995970A67DDCCL ^ l))] = CoffeePlaceholderExpansion.a("y", (int)11347, (long)(0x2A6A564EB7768F56L ^ l));
        stringArray[CoffeePlaceholderExpansion.b("d", (int)27513, (long)(0x2FED7D2CDE1B5E1CL ^ l))] = CoffeePlaceholderExpansion.a("y", (int)3749, (long)(0xEB3C19EB43F2DB8L ^ l));
        this.CP_e = new ArrayList<String>(Arrays.asList(stringArray));
        boolean bl2 = bl;
        if (bl2) {
            PacketWrapper.CP_e(new int[5]);
        }
    }

    public void initialize() {
        long l = a ^ 0x2AE508010987L;
        boolean bl = CP_PA.CP_y();
        boolean bl2 = CP_Oq.DISABLE_VANILLA_ANTICHEAT_LOGGING.CP_t();
        if (!bl && bl2) {
            bl2 = this.CP_e.add((String)((Object)CoffeePlaceholderExpansion.a("y", (int)17379, (long)(0x31C301743BB9F0A9L ^ l))));
        }
        Logger logger = (Logger)LogManager.getRootLogger();
        logger.addFilter((org.apache.logging.log4j.core.Filter)this);
    }

    public void start() {
    }

    public void stop() {
    }

    public Filter.Result filter(LogEvent logEvent) {
        long l = a ^ 0xA1EA9C4C3D2L;
        return logEvent == null ? Filter.Result.NEUTRAL : this.CP_h(logEvent.getMessage().getFormattedMessage());
    }

    public Filter.Result filter(Logger logger, Level level, Marker marker, Message message, Throwable throwable) {
        return this.CP_h(message.getFormattedMessage());
    }

    public Filter.Result getOnMismatch() {
        return Filter.Result.NEUTRAL;
    }

    public Filter.Result getOnMatch() {
        return Filter.Result.NEUTRAL;
    }

    public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object ... objectArray) {
        return this.CP_h(string);
    }

    public Filter.Result filter(Logger logger, Level level, Marker marker, Object object, Throwable throwable) {
        return this.CP_h(object.toString());
    }

    public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object) {
        return this.CP_h(string);
    }

    public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object, Object object2) {
        return this.CP_h(string);
    }

    public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object, Object object2, Object object3) {
        return this.CP_h(string);
    }

    public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4) {
        return this.CP_h(string);
    }

    public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5) {
        return this.CP_h(string);
    }

    public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        return this.CP_h(string);
    }

    public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
        return this.CP_h(string);
    }

    public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        return this.CP_h(string);
    }

    public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        return this.CP_h(string);
    }

    public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        return this.CP_h(string);
    }

    public boolean isStarted() {
        return true;
    }

    public boolean isStopped() {
        return false;
    }

    public LifeCycle.State getState() {
        try {
            return LifeCycle.State.STARTED;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public Filter.Result filter(Logger logger, Level level, Marker marker, String string) {
        return this.CP_h(string);
    }

    private Filter.Result CP_h(String string) {
        long l = a ^ 0x7CFABDC5CC7BL;
        boolean bl = CP_PA.CP_f();
        String string2 = string;
        if (bl) {
            if (string2 == null) {
                return Filter.Result.NEUTRAL;
            }
            string2 = string;
        }
        return CP_Li.CP_y(string2, this.CP_e) ? Filter.Result.DENY : Filter.Result.NEUTRAL;
    }

    @Override
    public boolean isLoggable(LogRecord logRecord) {
        long l = a ^ 0x3A541AB5DF74L;
        boolean bl = CP_PA.CP_f();
        boolean bl2 = CP_Li.CP_y(logRecord.getMessage(), this.CP_e);
        if (bl) {
            bl2 = !bl2;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CoffeePlaceholderExpansion.a = CP_s.a(6004411483553951133L, -6334509397176540848L, MethodHandles.lookup().lookupClass()).a(245492548466631L);
                        CoffeePlaceholderExpansion.d = new HashMap<K, V>(13);
                        var11 = CoffeePlaceholderExpansion.a ^ 124314898624054L;
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[25];
                        var18_4 = 0;
                        var17_5 = "\u0090\u0097\u0099\t0>y)/\u00bd\u008c\u00a83\u00c19\u0088T\u00d8A\u0094Q=9\u00a3\u00c4\u00fb\u000e4X|\u00a8bG\u008f\u0005z?\u00a3\u00a2I\u00de\u00ff\u0081\u00e6\u001b\u00c0U|\u00c5\u00fe\u00b0\b\u00bc)\u00a9}\u0080\u00d38\u00ff\u0007\u00047<\u00df\u00a2~(\u00e3/\u00cc>3 \u00f8\u008elx\u00df\u00ae\u000e\u00aa\u0091C\u0004\u00c7F^.\u0003y\u00d3\u009aH\u00d4\u00bb\u0084\u00ac\u0013\u001c\u00c5+\u008a\u00b6dE\u00f8\u0089\u00af\u00d3P\u00f1\u00d2\u00f2W\u00d5A{\u0083\u00d6 \u00abR\u00a0\u00e7\u00f5\u0017\u00bc#\u0015\u00ee\u00dc\u0003\u0098?y\u0003\u00b8a\u00b1\u00a2\u001d\u00c8b\u00b3+a\u0005Y;\u00e4W\u0099\u0004\u00d9\u00d3\u00a6\u00c2l\u00d7$z\u00e5(9RM$\t\u00b2=L\u00fd\u0097\u00c2Wp9\u00d7v\u00a1\u00f7\u00e6\u00dbIH\u00cf\u00e1\u00ce5\u00ed\u0098N\u0094\u008c\u0080Fs\u00da\u00b1T.\u001c\u00a7\u00c9\u00a3\u00e6RI\u008b:\u00f2\u001c\u00bc:\u00cecG)\u00a3\u00d1X\u008c\u0019\\\u00cb\u00cbf}\u000f\u00e1\u00c4\u0097\u0007M\u00d4\u00a4;@%\u00ac\u008dZ\u0000,W\u00a6\u00a5\u0013f\u00f4VH\u008eA#l\u00c8(/\u0001\u00c9\u00e6\u00df0\u0088\u00c2\u00eb\u0089\u00a1\u00c9{M\u000b\u00b1\u00e4\u00f0r\u00cc\u00dc+\u00d1\u0013R\u00beP\u00cds\u00fcS\u0082\u0087s\u0090\u0012\u00d4\u001a+t8\u00e2.\u00edxvUf\u0006R\u00ad\u00fd\u0014\u00c2\u00e0\b0\u0090\u009eq\u0011\u00f3\u008fYRg\u0094\u007f\u00c6\u00a9\u001d\u00f7m\u00b4\u0004\u00df\u0018\u00eblsI\u00bb\u00d5JF\u0085je\u00be\u00bf#%\u0017h;^\u0082\u0018\u0080\u0090\u0080\u00e7\u0080\u00cb\u0099\u00ed\u00b3/\u007fa\u00d7\u008d\u0087\u0010\u00f1s\u00f6\u0017\u0092h\u001f\u00f5@V\u00d6\u00f4\u00a5\u00ca\f\u007f\"27\u00f8\u00af\u00fa\u00eb\b\u008c\u0096\u0096\u0083\u000bW\u00e5\u0015X\"\u00f7Dx\u00bc\u0001\u001e\u009cjHk\u0092\u00f2A\u00ea\u00fa\u00d2\u00cc\u00a6\u00f0\u0093(\u0015\u00aa\u000e\u00c0\u00f8\u00db[\u0006\u0091\u00a9\u0004t\u00cb\u00c51\u0080I\u0090@\u0083X\u001e\u00f7%\u0010\u00db\u00a4.\u00fa\u0098.\u00d2X/@\u00a4\u00f8\u00b5\u00db@\u00ef\u0083<\u00c8\u00ac\u00c4\u0017\u00ff\u00fa\u0002\u009bN5\u0010qb\u00ef\u00a7x\u0083;\u00b8P\u0083D6\u00e4\u00d3\u00d2\u0098\u00ad\u00fa\t\u00a0?\u00ddS\u00c2\u00f9\u00abv\u00ab\u00828\u007fo\u00b4\u00e9\u0084\u0098J\u0002P\u00e4\u00d2@\u00db\u0083\u0019\u00d8\u0088\u0083\u001e\u008cB\u0081\u0080A(~\u0082\u00abE\u00d3\u00c8\u00aa\u00ebp!\u00c4.\u0018\u00c8\u0087D\u008b\u0098|\u009d[\u0086BC\u0018z\u00c0S6$\u00c9 @\u009a\f\u00b6\u00b6\u00d0\u00b2O\u00ba[8A\u00fb\u0004\u00bfY\u00eb]\u00ca<xws\u00a9K\u00be\u00f8@\u00f4!\u00e3\u00cd@>\u0085\u008a2|\u00d5\u009c7w\u00aax\u00d6S\u00ca\u00c6O\u00ec\u00e2KM\u00f1\u00c4E\u0001$\f\u00f9e\u000e\u008aY\u00db\u00f9/zQ\u00e5\u00c0\u00c8\u0003\u0086(\u00ad'\u00f0@B\u0005\u008a\f1\u00a5\t\u0000\u00cd\u00ce\u0098\u00e2\u00fd\u000e!\u00d2P\u00ab0\u00a3w\u000b6\u00f7\u00d4\u00b2\u001f\u0010\u00dd4\u0099\u00d6\u00ca\u0083\u00de\u00a6%?\u008ec\\\u009a\u0019\u00cb8k\u009e7\u00e4\u00ef^\u00f5)YB\u0083\u001c-\u00ac\u00a0\u00b2\u00f6Kh\u00a8]\u00fah\u00de\u0084h\u0084\u0013:\"\u00b23\u00bdL\u00d0\"\u0096\u00ff\u00f1\u0087\u00a7`;\u00ba\u00e3\u008e\u0082\u0086\u00a5\u0005\u00bb\u00b1v\u00b8\u00ea\u0097\u008a\u008d~\u00a4\u00b0\u00f3\u00e1D\u00c5\u00bf\u00c2\u009b8\u00fa\u00a9X\u0012e\u00da\u00f8\u00a1\u00fe\u0004\u00d5\u00b10\u0097\u00f9\u0018\u0004\u00a9\u008e\u0018x\u0092\u00c9\u00bbq\u0001|\bN;t*\u00c8\u00df\u008a\u00c5\u00ae\u00c7\u00e1A\u0004\u00d3I&\u00b8x\u00bc\"l.\u00c3K;\u00d0\u00cf\u00fe\u00df' \u00e3E\u00af\u00b2\u00f6\u001cL\u00b4\u00e2\u0087\u0090i\u00f7\u0004\u00bbL\u0098\u00a3\u001dcL\u0007\u00c9L\u00c3,Rw&f(\u0084(%\u00f2\u00f9\u00cfV\u0010\u0096\u00bc,\u00ca \t\u007fx\u008a\u00a4k\u009e\u00c2n\u00f5\u00f8\u008a?\u0002\u00dd\u0003o\u00eeQ\u0089J\u00cd\u0085R7w\u0092\u00be\u00b6(\u00a9t\u0014\u0005g\u00a5\u009e\u0007Xb\u0082R\u00ad[2\u00c1kY\u0080G/\u00b8\u00feSu\u00dc\u00f1\u00caQ`\u0088\u0093W\u008c\u001b\u00fcZbP\u00fb( ,|_\u008c2\u00a8\u0001=>~(\u00d4^\u0098\u0096\u0084\u00823\u001e{\u00f1\u00ae\u00b7Hwa\u008c\u0004\u00c6T\u00e6\u00fb\u0091\u001eO\u00b8\u0085\u009e\u00ed(\u00c8\u00f5\u009b*\u0089t\u00cb\u00a0\u0003m\u00a5f)\u0006\u0084\u00bd\u000b\u0005\u00df\u00d9\u00af\u00adq\u00db\u00e6\u0088\u00d6\u00ab\u00d7P\u00cf\u00d5\u007fR\u00a2\u0090$\u00b4\u0095\u00d7HMrO\u0095\u00a4D\u00a81\u00bcK\u00f2D\u008d\u00fd\u00af\u0097\u00da5\u0085\u00e0D\u00ecf\u001dW\u0000]5Ye\u00fb\u00cc\u008bb\u001c\\\u009fJ}\u0086/r\u0096\u0016\u00ee\u00a3MC\u00ce\u00c0\u008b\\\u00ee\u00f2\u00be\u000el5\u0087\u00c8\"\u00adV\u0018\u001c0\u00ad\u0082%+\u00eeWP\u00d3BQ\u0002'\u00f6\u00e5u\u008fi\b\u00c6x\u00d8F\u0007\u0083F$\u001a\u0005\u00a1\u00f7\u001e\u00a2\u00a9\u00bb\u0018A\u00c3#]\u00e2\u00fd\u0015\u0007S\u009f\u0018\u0013d\u001e@7\u00baf\u00d5u\u00d5\u00c8\u00d7\u001bb7c\u00feW\u0089\u001f\u00e47\u00ec\u00ef\u00f9\u00c3\u0097\u00cd+\u00be!\u0087\u0085\u00d6\u00a4b\u0006]\u00bf\u00eb\u00fbHK\u00c2\u0017U\u00cf\u00c9\u00cf\u00c9\u00efT\u0018\u00acpkDSvt\u00e3\u00d2\u00fb\u001aN\u00df\u0099iy\u00e5T\u00a7\u00bf\u0083N\u00bb\u00eej\u0088\u008c\u00ec\u00ee\u00dbwF \u00b3J\u00e5\u00dd\u0087Bw\u00a7\"\u00a8\u00130\u00d7#nAC\u00faU:\u00f2\u00ed\u00f2J\u00ea\u00b7\u008e\u0081(v\u00ef?\u00e4RZ\u00ad\u00bc\u00d3`k\u00f6.bD\u0092q\u0006\u00a7 \u00b2c\u00e1l:\u00b19.A\u00af\u0089W\u0001\u008dK\u00b1X\u0089\u00d3\u00ec(\u00ac>\u00efT\u00d6F\u0097\u009f\u008c2\u00ccY\u001b\u00be\u0096\n\u00e3\u0019\u00b5\u0093\u00cb\u008d\u00c6\u00f9\u00ad`\u00ecU\u00c9\u008cB>\u009a?\u0018q\u008b\u00d0\u00a0\u001f";
                        var19_6 = "\u0090\u0097\u0099\t0>y)/\u00bd\u008c\u00a83\u00c19\u0088T\u00d8A\u0094Q=9\u00a3\u00c4\u00fb\u000e4X|\u00a8bG\u008f\u0005z?\u00a3\u00a2I\u00de\u00ff\u0081\u00e6\u001b\u00c0U|\u00c5\u00fe\u00b0\b\u00bc)\u00a9}\u0080\u00d38\u00ff\u0007\u00047<\u00df\u00a2~(\u00e3/\u00cc>3 \u00f8\u008elx\u00df\u00ae\u000e\u00aa\u0091C\u0004\u00c7F^.\u0003y\u00d3\u009aH\u00d4\u00bb\u0084\u00ac\u0013\u001c\u00c5+\u008a\u00b6dE\u00f8\u0089\u00af\u00d3P\u00f1\u00d2\u00f2W\u00d5A{\u0083\u00d6 \u00abR\u00a0\u00e7\u00f5\u0017\u00bc#\u0015\u00ee\u00dc\u0003\u0098?y\u0003\u00b8a\u00b1\u00a2\u001d\u00c8b\u00b3+a\u0005Y;\u00e4W\u0099\u0004\u00d9\u00d3\u00a6\u00c2l\u00d7$z\u00e5(9RM$\t\u00b2=L\u00fd\u0097\u00c2Wp9\u00d7v\u00a1\u00f7\u00e6\u00dbIH\u00cf\u00e1\u00ce5\u00ed\u0098N\u0094\u008c\u0080Fs\u00da\u00b1T.\u001c\u00a7\u00c9\u00a3\u00e6RI\u008b:\u00f2\u001c\u00bc:\u00cecG)\u00a3\u00d1X\u008c\u0019\\\u00cb\u00cbf}\u000f\u00e1\u00c4\u0097\u0007M\u00d4\u00a4;@%\u00ac\u008dZ\u0000,W\u00a6\u00a5\u0013f\u00f4VH\u008eA#l\u00c8(/\u0001\u00c9\u00e6\u00df0\u0088\u00c2\u00eb\u0089\u00a1\u00c9{M\u000b\u00b1\u00e4\u00f0r\u00cc\u00dc+\u00d1\u0013R\u00beP\u00cds\u00fcS\u0082\u0087s\u0090\u0012\u00d4\u001a+t8\u00e2.\u00edxvUf\u0006R\u00ad\u00fd\u0014\u00c2\u00e0\b0\u0090\u009eq\u0011\u00f3\u008fYRg\u0094\u007f\u00c6\u00a9\u001d\u00f7m\u00b4\u0004\u00df\u0018\u00eblsI\u00bb\u00d5JF\u0085je\u00be\u00bf#%\u0017h;^\u0082\u0018\u0080\u0090\u0080\u00e7\u0080\u00cb\u0099\u00ed\u00b3/\u007fa\u00d7\u008d\u0087\u0010\u00f1s\u00f6\u0017\u0092h\u001f\u00f5@V\u00d6\u00f4\u00a5\u00ca\f\u007f\"27\u00f8\u00af\u00fa\u00eb\b\u008c\u0096\u0096\u0083\u000bW\u00e5\u0015X\"\u00f7Dx\u00bc\u0001\u001e\u009cjHk\u0092\u00f2A\u00ea\u00fa\u00d2\u00cc\u00a6\u00f0\u0093(\u0015\u00aa\u000e\u00c0\u00f8\u00db[\u0006\u0091\u00a9\u0004t\u00cb\u00c51\u0080I\u0090@\u0083X\u001e\u00f7%\u0010\u00db\u00a4.\u00fa\u0098.\u00d2X/@\u00a4\u00f8\u00b5\u00db@\u00ef\u0083<\u00c8\u00ac\u00c4\u0017\u00ff\u00fa\u0002\u009bN5\u0010qb\u00ef\u00a7x\u0083;\u00b8P\u0083D6\u00e4\u00d3\u00d2\u0098\u00ad\u00fa\t\u00a0?\u00ddS\u00c2\u00f9\u00abv\u00ab\u00828\u007fo\u00b4\u00e9\u0084\u0098J\u0002P\u00e4\u00d2@\u00db\u0083\u0019\u00d8\u0088\u0083\u001e\u008cB\u0081\u0080A(~\u0082\u00abE\u00d3\u00c8\u00aa\u00ebp!\u00c4.\u0018\u00c8\u0087D\u008b\u0098|\u009d[\u0086BC\u0018z\u00c0S6$\u00c9 @\u009a\f\u00b6\u00b6\u00d0\u00b2O\u00ba[8A\u00fb\u0004\u00bfY\u00eb]\u00ca<xws\u00a9K\u00be\u00f8@\u00f4!\u00e3\u00cd@>\u0085\u008a2|\u00d5\u009c7w\u00aax\u00d6S\u00ca\u00c6O\u00ec\u00e2KM\u00f1\u00c4E\u0001$\f\u00f9e\u000e\u008aY\u00db\u00f9/zQ\u00e5\u00c0\u00c8\u0003\u0086(\u00ad'\u00f0@B\u0005\u008a\f1\u00a5\t\u0000\u00cd\u00ce\u0098\u00e2\u00fd\u000e!\u00d2P\u00ab0\u00a3w\u000b6\u00f7\u00d4\u00b2\u001f\u0010\u00dd4\u0099\u00d6\u00ca\u0083\u00de\u00a6%?\u008ec\\\u009a\u0019\u00cb8k\u009e7\u00e4\u00ef^\u00f5)YB\u0083\u001c-\u00ac\u00a0\u00b2\u00f6Kh\u00a8]\u00fah\u00de\u0084h\u0084\u0013:\"\u00b23\u00bdL\u00d0\"\u0096\u00ff\u00f1\u0087\u00a7`;\u00ba\u00e3\u008e\u0082\u0086\u00a5\u0005\u00bb\u00b1v\u00b8\u00ea\u0097\u008a\u008d~\u00a4\u00b0\u00f3\u00e1D\u00c5\u00bf\u00c2\u009b8\u00fa\u00a9X\u0012e\u00da\u00f8\u00a1\u00fe\u0004\u00d5\u00b10\u0097\u00f9\u0018\u0004\u00a9\u008e\u0018x\u0092\u00c9\u00bbq\u0001|\bN;t*\u00c8\u00df\u008a\u00c5\u00ae\u00c7\u00e1A\u0004\u00d3I&\u00b8x\u00bc\"l.\u00c3K;\u00d0\u00cf\u00fe\u00df' \u00e3E\u00af\u00b2\u00f6\u001cL\u00b4\u00e2\u0087\u0090i\u00f7\u0004\u00bbL\u0098\u00a3\u001dcL\u0007\u00c9L\u00c3,Rw&f(\u0084(%\u00f2\u00f9\u00cfV\u0010\u0096\u00bc,\u00ca \t\u007fx\u008a\u00a4k\u009e\u00c2n\u00f5\u00f8\u008a?\u0002\u00dd\u0003o\u00eeQ\u0089J\u00cd\u0085R7w\u0092\u00be\u00b6(\u00a9t\u0014\u0005g\u00a5\u009e\u0007Xb\u0082R\u00ad[2\u00c1kY\u0080G/\u00b8\u00feSu\u00dc\u00f1\u00caQ`\u0088\u0093W\u008c\u001b\u00fcZbP\u00fb( ,|_\u008c2\u00a8\u0001=>~(\u00d4^\u0098\u0096\u0084\u00823\u001e{\u00f1\u00ae\u00b7Hwa\u008c\u0004\u00c6T\u00e6\u00fb\u0091\u001eO\u00b8\u0085\u009e\u00ed(\u00c8\u00f5\u009b*\u0089t\u00cb\u00a0\u0003m\u00a5f)\u0006\u0084\u00bd\u000b\u0005\u00df\u00d9\u00af\u00adq\u00db\u00e6\u0088\u00d6\u00ab\u00d7P\u00cf\u00d5\u007fR\u00a2\u0090$\u00b4\u0095\u00d7HMrO\u0095\u00a4D\u00a81\u00bcK\u00f2D\u008d\u00fd\u00af\u0097\u00da5\u0085\u00e0D\u00ecf\u001dW\u0000]5Ye\u00fb\u00cc\u008bb\u001c\\\u009fJ}\u0086/r\u0096\u0016\u00ee\u00a3MC\u00ce\u00c0\u008b\\\u00ee\u00f2\u00be\u000el5\u0087\u00c8\"\u00adV\u0018\u001c0\u00ad\u0082%+\u00eeWP\u00d3BQ\u0002'\u00f6\u00e5u\u008fi\b\u00c6x\u00d8F\u0007\u0083F$\u001a\u0005\u00a1\u00f7\u001e\u00a2\u00a9\u00bb\u0018A\u00c3#]\u00e2\u00fd\u0015\u0007S\u009f\u0018\u0013d\u001e@7\u00baf\u00d5u\u00d5\u00c8\u00d7\u001bb7c\u00feW\u0089\u001f\u00e47\u00ec\u00ef\u00f9\u00c3\u0097\u00cd+\u00be!\u0087\u0085\u00d6\u00a4b\u0006]\u00bf\u00eb\u00fbHK\u00c2\u0017U\u00cf\u00c9\u00cf\u00c9\u00efT\u0018\u00acpkDSvt\u00e3\u00d2\u00fb\u001aN\u00df\u0099iy\u00e5T\u00a7\u00bf\u0083N\u00bb\u00eej\u0088\u008c\u00ec\u00ee\u00dbwF \u00b3J\u00e5\u00dd\u0087Bw\u00a7\"\u00a8\u00130\u00d7#nAC\u00faU:\u00f2\u00ed\u00f2J\u00ea\u00b7\u008e\u0081(v\u00ef?\u00e4RZ\u00ad\u00bc\u00d3`k\u00f6.bD\u0092q\u0006\u00a7 \u00b2c\u00e1l:\u00b19.A\u00af\u0089W\u0001\u008dK\u00b1X\u0089\u00d3\u00ec(\u00ac>\u00efT\u00d6F\u0097\u009f\u008c2\u00ccY\u001b\u00be\u0096\n\u00e3\u0019\u00b5\u0093\u00cb\u008d\u00c6\u00f9\u00ad`\u00ecU\u00c9\u008cB>\u009a?\u0018q\u008b\u00d0\u00a0\u001f".length();
                        var16_7 = 56;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = CoffeePlaceholderExpansion.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00f2\u0094\u00b2\u0013\u00b5\u00be\u0093^\u00e0f\u00f6\u0086\u0005V\u00d5\u00ad\u00e4\u00f5\u00c5\u00aa\u00f5i5U\f\u009ep\u0016\u0011f\u00a9\u0099\u00a9W\bY\u00baW\u0014jHh\u0092\u00e9\u001d\u00dcl\u00a5\u00ed\u0089\u0001\u0013.\u00fe\u001a\u0011\u00d6\u00cf?\u00dd\u008b\u00a5\u009cV\u0013b\u0012\u0093P\u0010c\u00c6\u00cc<\u0081\u0095UA\u00fcIOh\u00dfs\u00feO\u0099=u\u009d]\u0019\u00aa\u00bc\u000bX\u0017\u00d5\u00a7\u00d5\u00a0/u\u00c7\u0089\u0089)D\u00e7\u00bfx\u0001}";
                            var19_6 = "\u00f2\u0094\u00b2\u0013\u00b5\u00be\u0093^\u00e0f\u00f6\u0086\u0005V\u00d5\u00ad\u00e4\u00f5\u00c5\u00aa\u00f5i5U\f\u009ep\u0016\u0011f\u00a9\u0099\u00a9W\bY\u00baW\u0014jHh\u0092\u00e9\u001d\u00dcl\u00a5\u00ed\u0089\u0001\u0013.\u00fe\u001a\u0011\u00d6\u00cf?\u00dd\u008b\u00a5\u009cV\u0013b\u0012\u0093P\u0010c\u00c6\u00cc<\u0081\u0095UA\u00fcIOh\u00dfs\u00feO\u0099=u\u009d]\u0019\u00aa\u00bc\u000bX\u0017\u00d5\u00a7\u00d5\u00a0/u\u00c7\u0089\u0089)D\u00e7\u00bfx\u0001}".length();
                            var16_7 = 40;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = CoffeePlaceholderExpansion.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                CoffeePlaceholderExpansion.b = var20_3;
                CoffeePlaceholderExpansion.c = new String[25];
                CoffeePlaceholderExpansion.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[19];
                var3_13 = 0;
                var4_14 = "\u00c0\u0080\u00b5\u00df\u0019i\u00d3\u0013\u0010c\u00be\u009f:G\u0011\"\u00f9\u000bq\u00e0\u00d0C\u00cc\u00c0.\u0086\u00ccm\u0018- 3\u00e2\u0092\u001d1\u00aat&\u00fe\u00a2\u001a\u00af\u00f7\u00c8E\u00f8\u00c9,\u0080h\u00cbWwq\u00f0*\u00f9\u00c1-\u0018\u00ff\u00ed\u00b8\u00d0\u009b\u0087@\u008bx\u00d6w\u008e+G\u0015\u0007b\u00e23QD\u00da\u00fcqP6\u001c\u009d\u0098\u008c\u009a \u00a1\u00be\u00b6/\u00a0\u009a\u00fd7\u00d5\r#\u00a4\"\u00d3\u0091\u00155R\u0085\u00dcM\u008a\nMo\u00a0\u008d\u00f8\u00be-\u00f5\u000e9:\u0007?\u00dd\u00a5n\u00ea+\u00d6\u00d0";
                var5_15 = "\u00c0\u0080\u00b5\u00df\u0019i\u00d3\u0013\u0010c\u00be\u009f:G\u0011\"\u00f9\u000bq\u00e0\u00d0C\u00cc\u00c0.\u0086\u00ccm\u0018- 3\u00e2\u0092\u001d1\u00aat&\u00fe\u00a2\u001a\u00af\u00f7\u00c8E\u00f8\u00c9,\u0080h\u00cbWwq\u00f0*\u00f9\u00c1-\u0018\u00ff\u00ed\u00b8\u00d0\u009b\u0087@\u008bx\u00d6w\u008e+G\u0015\u0007b\u00e23QD\u00da\u00fcqP6\u001c\u009d\u0098\u008c\u009a \u00a1\u00be\u00b6/\u00a0\u009a\u00fd7\u00d5\r#\u00a4\"\u00d3\u0091\u00155R\u0085\u00dcM\u008a\nMo\u00a0\u008d\u00f8\u00be-\u00f5\u000e9:\u0007?\u00dd\u00a5n\u00ea+\u00d6\u00d0".length();
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
lbl78:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00b4\u00f3T\u001e\u00f3?\u0003\b\u00e6\u00ec\u009d<y\u001c[_";
                    var5_15 = "\u00b4\u00f3T\u001e\u00f3?\u0003\b\u00e6\u00ec\u009d<y\u001c[_".length();
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
lbl91:
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
lbl104:
                // 1 sources

                ** continue;
            }
        }
        CoffeePlaceholderExpansion.e = var6_12;
        CoffeePlaceholderExpansion.f = new Integer[19];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7DEF;
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
                throw new RuntimeException("me/nik/coffeeprotect/CoffeePlaceholderExpansion", exception);
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
            CoffeePlaceholderExpansion.c[n2] = CoffeePlaceholderExpansion.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CoffeePlaceholderExpansion.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CoffeePlaceholderExpansion" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6B82;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/CoffeePlaceholderExpansion", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CoffeePlaceholderExpansion.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CoffeePlaceholderExpansion.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CoffeePlaceholderExpansion" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CoffeePlaceholderExpansion.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CoffeePlaceholderExpansion.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
