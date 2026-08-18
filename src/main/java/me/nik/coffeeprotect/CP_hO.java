/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CP_Li;
import me.nik.coffeeprotect.CP_QU;
import me.nik.coffeeprotect.CP_Z6;
import me.nik.coffeeprotect.CP_f8;
import me.nik.coffeeprotect.CP_fc;
import me.nik.coffeeprotect.CP_fj;
import me.nik.coffeeprotect.CP_jC;
import me.nik.coffeeprotect.CP_qi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class CP_hO
implements Runnable {
    private final CP_fj CP_X;
    private final ThreadMXBean CP_W;
    private UUID CP_v;
    private ScheduledExecutorService CP_A;
    private final Map<Long, Long> CP_q;
    private final Map<Long, Double> CP_L;
    private final Queue<Long> CP_P;
    private long CP_R;
    private long CP_i;
    private int CP_p;
    private int CP_n;
    private int CP_g;
    private double CP_z;
    private long CP_b;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final long[] h;
    private static final Long[] i;
    private static final Map j;
    private static transient /* synthetic */ String RWmGSVVext = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_hO() {
        block5: {
            ThreadMXBean threadMXBean;
            block4: {
                long l = a ^ 0x61DF73A7DF23L;
                this.CP_q = new ConcurrentHashMap<Long, Long>();
                this.CP_L = new ConcurrentHashMap<Long, Double>();
                this.CP_P = new ConcurrentLinkedQueue<Long>();
                this.CP_p = (int)CP_hO.b("c", (int)17317, (long)(0x452EE5E3F1179E22L ^ l));
                PacketWrapper[] packetWrapperArray = CP_f8.CP_n();
                this.CP_n = 0;
                this.CP_g = 0;
                this.CP_z = 20.0;
                this.CP_b = System.nanoTime();
                this.CP_X = CP_jC.CP_Z().CP_R(CP_jC.v1_8_R3) ? new CP_fc() : new CP_qi();
                threadMXBean = this.CP_W = ManagementFactory.getThreadMXBean();
                if (packetWrapperArray != null) break block4;
                if (threadMXBean.isThreadCpuTimeEnabled()) break block5;
                threadMXBean = this.CP_W;
            }
            threadMXBean.setThreadCpuTimeEnabled(true);
        }
        if (PacketWrapper.CP_z() == null) {
            CP_f8.CP_z(new PacketWrapper[2]);
        }
    }

    public CP_f8 CP_L(UUID uUID) {
        long l = a ^ 0x121C58002671L;
        PacketWrapper[] packetWrapperArray = CP_f8.CP_n();
        CP_hO ilIlhO = this;
        if (packetWrapperArray == null) {
            if (ilIlhO.CP_n()) {
                return CP_f8.ALREADY_RUNNING;
            }
            this.CP_v = uUID;
            this.CP_q.clear();
            this.CP_L.clear();
            this.CP_A = Executors.newSingleThreadScheduledExecutor();
            this.CP_A.scheduleAtFixedRate(this, (long)CP_hO.c("f", (int)18179, (long)(0x12239430C02174DAL ^ l)), (long)CP_hO.c("f", (int)19600, (long)(0x424AF64A6E0DFF4BL ^ l)), TimeUnit.MILLISECONDS);
            ilIlhO = this;
        }
        this.CP_g = 0;
        ilIlhO.CP_n = 0;
        return CP_f8.START_SUCCESS;
    }

    public CP_f8 CP_u() {
        long l = a ^ 0x24B44094EFE2L;
        PacketWrapper[] packetWrapperArray = CP_f8.CP_n();
        CP_hO ilIlhO = this;
        if (packetWrapperArray == null) {
            if (!ilIlhO.CP_n()) {
                return CP_f8.NOT_RUNNING;
            }
            this.CP_X.CP_E();
            this.CP_v = null;
            this.CP_A.shutdown();
            this.CP_A = null;
            this.CP_q.clear();
            this.CP_L.clear();
            this.CP_P.clear();
            ilIlhO = this;
        }
        this.CP_g = 0;
        ilIlhO.CP_n = 0;
        return CP_f8.STOP_SUCCESS;
    }

    private boolean CP_n() {
        long l = a ^ 0x5DFFDD76CE79L;
        return this.CP_A != null;
    }

    @Override
    public void run() {
        block22: {
            Object object;
            Player player;
            Object object2;
            block27: {
                long l;
                long l2;
                block24: {
                    PacketWrapper[] packetWrapperArray;
                    block30: {
                        CallSite callSite;
                        int n;
                        block28: {
                            block29: {
                                block25: {
                                    block26: {
                                        block23: {
                                            block20: {
                                                block21: {
                                                    block18: {
                                                        block19: {
                                                            block17: {
                                                                block15: {
                                                                    CP_hO ilIlhO;
                                                                    long l3;
                                                                    block16: {
                                                                        l2 = a ^ 0x2C9DBDB5F4C7L;
                                                                        long l4 = System.currentTimeMillis();
                                                                        l = l4 - this.CP_R;
                                                                        this.CP_R = l4;
                                                                        packetWrapperArray = CP_f8.CP_n();
                                                                        l3 = l4 / CP_hO.c("f", (int)23499, (long)(0x3CF18FAF4C13AA7L ^ l2));
                                                                        ilIlhO = this;
                                                                        if (packetWrapperArray != null) break block15;
                                                                        if (ilIlhO.CP_i != l3) break block16;
                                                                        ++this.CP_p;
                                                                        if (packetWrapperArray == null) break block17;
                                                                        PacketWrapper.CP_e(new int[2]);
                                                                    }
                                                                    this.CP_i = l3;
                                                                    this.CP_z = Math.min(CP_Li.CP_s((this.CP_z + (double)this.CP_p) / 2.0, 2), 20.0);
                                                                    ilIlhO = this;
                                                                }
                                                                ilIlhO.CP_p = 1;
                                                            }
                                                            long l5 = System.nanoTime();
                                                            long l6 = l5 - this.CP_b;
                                                            this.CP_b = l5;
                                                            CP_hO ilIlhO = this;
                                                            if (packetWrapperArray == null) {
                                                                if (ilIlhO.CP_g++ > CP_hO.b("c", (int)22702, (long)(0x33C286AFF99DAEC8L ^ l2))) {
                                                                    this.CP_g = 0;
                                                                    object2 = this.CP_W.dumpAllThreads(false, false);
                                                                    int n2 = ((ThreadInfo[])object2).length;
                                                                    for (int i = 0; i < n2; ++i) {
                                                                        ThreadInfo threadInfo;
                                                                        ThreadInfo threadInfo2 = threadInfo = object2[i];
                                                                        if (packetWrapperArray == null) {
                                                                            if (!threadInfo2.getThreadName().startsWith((String)((Object)CP_hO.a("l", (int)15257, (long)(0x1BA69A97B74B161DL ^ l2))))) {
                                                                                threadInfo2 = threadInfo;
                                                                                if (packetWrapperArray == null) {
                                                                                    if (!CP_Z6.CP_a(threadInfo2.getStackTrace(), stackTraceElement -> {
                                                                                        long l = a ^ 0x7A84159332D1L;
                                                                                        return stackTraceElement.getClassName().startsWith((String)((Object)CP_hO.a("l", (int)29304, (long)(0x3E55127E90AE99E6L ^ l))));
                                                                                    })) continue;
                                                                                }
                                                                            } else {
                                                                                threadInfo2 = threadInfo;
                                                                            }
                                                                        }
                                                                        long l7 = threadInfo2.getThreadId();
                                                                        long l8 = this.CP_W.getThreadCpuTime(l7);
                                                                        long l9 = this.CP_q.getOrDefault(l7, l8);
                                                                        long l10 = l8 - l9;
                                                                        this.CP_q.put(l7, l8);
                                                                        double d = Math.min((double)l10 / (double)l6 * 100.0, 100.0);
                                                                        this.CP_L.put(l7, d);
                                                                        if (packetWrapperArray == null) continue;
                                                                    }
                                                                }
                                                                ilIlhO = this;
                                                            }
                                                            player = Bukkit.getPlayer((UUID)ilIlhO.CP_v);
                                                            if (packetWrapperArray != null) break block18;
                                                            if (player == null) break block19;
                                                            n = player.isOnline();
                                                            if (packetWrapperArray != null) break block20;
                                                            if (n != 0) break block21;
                                                        }
                                                        this.CP_u();
                                                    }
                                                    if (packetWrapperArray == null) break block22;
                                                }
                                                int n3 = this.CP_n;
                                                n = n3;
                                                this.CP_n = n3 + 1;
                                            }
                                            callSite = CP_hO.b("c", (int)26983, (long)(0x5AA29C6CCBD59F06L ^ l2));
                                            if (packetWrapperArray != null) break block23;
                                            if (n >= callSite) break block24;
                                            n = this.CP_n;
                                            callSite = CP_hO.b("c", (int)24584, (long)(0x5091E15B65151668L ^ l2));
                                        }
                                        if (packetWrapperArray != null) break block25;
                                        if (n > callSite) break block26;
                                        object2 = CP_hO.a("l", (int)3127, (long)(0x4C6481C5109221B0L ^ l2));
                                        object = object2;
                                        if (packetWrapperArray == null) break block27;
                                    }
                                    n = this.CP_n;
                                    callSite = CP_hO.b("c", (int)12279, (long)(0x40C3A86BB0E5D995L ^ l2));
                                }
                                if (packetWrapperArray != null) break block28;
                                if (n > callSite) break block29;
                                object2 = CP_hO.a("l", (int)8362, (long)(0x628A92424B1E8D2FL ^ l2));
                                object = object2;
                                if (packetWrapperArray == null) break block27;
                            }
                            n = this.CP_n;
                            callSite = CP_hO.b("c", (int)1688, (long)(0x61D72B01477D70FFL ^ l2));
                        }
                        if (n >= callSite) break block30;
                        object2 = CP_hO.a("l", (int)6501, (long)(0x67A93687D803B4EFL ^ l2));
                        object = object2;
                        if (packetWrapperArray == null) break block27;
                    }
                    object2 = CP_hO.a("l", (int)15077, (long)(0x3407ED1C4B289763L ^ l2));
                    object = object2;
                    if (packetWrapperArray == null) break block27;
                }
                object = (String)((Object)CP_hO.a("l", (int)29592, (long)(0x326E3FAC9EE4DE18L ^ l2))) + CP_Li.CP_s(this.CP_L.values().stream().mapToDouble(Double::doubleValue).sum(), 2) + "%" + (String)((Object)CP_hO.a("l", (int)7077, (long)(0x303868CA9B57B62CL ^ l2))) + this.CP_z + (String)((Object)CP_hO.a("l", (int)7340, (long)(0x4AF5B8C798A7B12DL ^ l2))) + l;
                Runtime runtime = Runtime.getRuntime();
                object2 = (String)((Object)CP_hO.a("l", (int)25854, (long)(0x59D60CE03C33497DL ^ l2))) + this.CP_q(runtime.totalMemory() - runtime.freeMemory()) + (String)((Object)CP_hO.a("l", (int)6329, (long)(0x7DB903D61633353BL ^ l2))) + CP_Z6.CP_R(this.CP_P) + (String)((Object)CP_hO.a("l", (int)17704, (long)(0x35A2FEBD7283E8A3L ^ l2)));
            }
            this.CP_X.CP_y(player);
            this.CP_X.CP_q((String)object);
            this.CP_X.CP_E();
            this.CP_X.CP_r();
            CP_QU.CP_Y(player, (String)object2);
        }
    }

    public void CP_F(long l) {
        long l2 = a ^ 0x3F8075F80028L;
        PacketWrapper[] packetWrapperArray = CP_f8.CP_n();
        boolean bl = this.CP_n();
        if (packetWrapperArray == null && bl) {
            bl = this.CP_P.add(l);
        }
    }

    private long CP_q(long l) {
        long l2 = a ^ 0x7654CAD55B92L;
        return l / CP_hO.c("f", (int)27452, (long)(0x47A4D9DC4E0E2507L ^ l2));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            block26: {
                                CP_hO.a = CP_s.a(-4853751772870718948L, -6129170638615470183L, MethodHandles.lookup().lookupClass()).a(231472015804181L);
                                CP_hO.d = new HashMap<K, V>(13);
                                var22 = CP_hO.a ^ 39537163803013L;
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
                                var31_3 = new String[12];
                                var29_4 = 0;
                                var28_5 = "b\u0083\u00fbG$\u008d\u009a+\u00f9\u00b2xc<\u00ac\u00d3Bo\u0019x\u00e0\u00e7\n\u000f\u001e\u00f8\u00e3Tb\u0086\u00e9vd\u00ceM70$Z\u0093\u008d\u00cfG \u0092\u0018\u007fCA(\u00af\u00f7\u000f\u00ab;\u000f\u0098\u00af3\u00041M\u0007\u00c7\u000e\u00ab\u00e2\u00fc\u0002\u00fc2y\u0019\u009f\u001eS\u001c\u00e4GpE\u00d3>\u0084z\u00ab9d\u0004\u00e20\u009c\u00d1\u0018\u00deS\u008c\u00f6\u0081\u00c5\u00a2\u00adk\u0094#\u00ee\u00dd+J_\u00d93X!@\u00d0\u00f0\u001f\u00824\u00df\u0094w\u008f>F{\u00e7\u008cq>\u0098\u00b0r)\u009ec\u00d1\u00c4(\u0094C\u0089\u00beU\u0007\u00e1\u00a1nzXCs]'\u0016\u0088\b\u00af'\u0093%\u00ce^\u0087\u00e7/(h!\u00c2\u00a1\u00e4f\u009a@`NZ\u00a4\u0010\u00d6\u0082{\u0096S\u000b\u00181\u00d4f\u00df\u00fa\u00b6/\u00bdm x1q\u0013\u00e4\u0091\u00ae\u00a1\u00d3\u00fc\u00d9\u00fa\u0089`\u00e7Z\u0086\u00fd\u00e0\u00df\u00dd\u00a9\u0081\u00d8\u00d8J\u00a7\u00076]\u0019\u00bc\u0018J\u00a3\u00af\u00ca\u000b\u0012\u00b6.HD\u00e5\u00d5\u00af&!jK\u000b%\u00bf\u00deO\r( X\f\u007f\u00b8>f4X\u00ea\u00c5\u00c9.\u00d1M\u00b1T\u00b1\u00e1Z\u0015\u00102\u00fc\u00ba\u00ca\u0086L$*\u00e3\u00af\u009a \u0011\u0098\u00b4/{-y\u00c4\u008c\u00d6\u0089\u00ad\r\u00e8\u001f\u00f3\u0083\u00a5\u00c4W\u0094\u008d\u00df\u00b3x\u00aa\u0005\u0015\u0095\u009f\u00a9\u0004\u0018\u00cc\u00b1\u00b2\u00fc\u00c6=\u00ba&\u008f\u00cf 8\u00ac\u00c2\u00c0\u00e7h\u00b9\u00a3\u00bb\u00ff\u00ad\u00a1\u00d9";
                                var30_6 = "b\u0083\u00fbG$\u008d\u009a+\u00f9\u00b2xc<\u00ac\u00d3Bo\u0019x\u00e0\u00e7\n\u000f\u001e\u00f8\u00e3Tb\u0086\u00e9vd\u00ceM70$Z\u0093\u008d\u00cfG \u0092\u0018\u007fCA(\u00af\u00f7\u000f\u00ab;\u000f\u0098\u00af3\u00041M\u0007\u00c7\u000e\u00ab\u00e2\u00fc\u0002\u00fc2y\u0019\u009f\u001eS\u001c\u00e4GpE\u00d3>\u0084z\u00ab9d\u0004\u00e20\u009c\u00d1\u0018\u00deS\u008c\u00f6\u0081\u00c5\u00a2\u00adk\u0094#\u00ee\u00dd+J_\u00d93X!@\u00d0\u00f0\u001f\u00824\u00df\u0094w\u008f>F{\u00e7\u008cq>\u0098\u00b0r)\u009ec\u00d1\u00c4(\u0094C\u0089\u00beU\u0007\u00e1\u00a1nzXCs]'\u0016\u0088\b\u00af'\u0093%\u00ce^\u0087\u00e7/(h!\u00c2\u00a1\u00e4f\u009a@`NZ\u00a4\u0010\u00d6\u0082{\u0096S\u000b\u00181\u00d4f\u00df\u00fa\u00b6/\u00bdm x1q\u0013\u00e4\u0091\u00ae\u00a1\u00d3\u00fc\u00d9\u00fa\u0089`\u00e7Z\u0086\u00fd\u00e0\u00df\u00dd\u00a9\u0081\u00d8\u00d8J\u00a7\u00076]\u0019\u00bc\u0018J\u00a3\u00af\u00ca\u000b\u0012\u00b6.HD\u00e5\u00d5\u00af&!jK\u000b%\u00bf\u00deO\r( X\f\u007f\u00b8>f4X\u00ea\u00c5\u00c9.\u00d1M\u00b1T\u00b1\u00e1Z\u0015\u00102\u00fc\u00ba\u00ca\u0086L$*\u00e3\u00af\u009a \u0011\u0098\u00b4/{-y\u00c4\u008c\u00d6\u0089\u00ad\r\u00e8\u001f\u00f3\u0083\u00a5\u00c4W\u0094\u008d\u00df\u00b3x\u00aa\u0005\u0015\u0095\u009f\u00a9\u0004\u0018\u00cc\u00b1\u00b2\u00fc\u00c6=\u00ba&\u008f\u00cf 8\u00ac\u00c2\u00c0\u00e7h\u00b9\u00a3\u00bb\u00ff\u00ad\u00a1\u00d9".length();
                                var27_7 = 48;
                                var26_8 = -1;
lbl20:
                                // 2 sources

                                while (true) {
                                    v3 = ++var26_8;
                                    v4 = var28_5.substring(v3, v3 + var27_7);
                                    v5 = -1;
                                    break block26;
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = CP_hO.a(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "\u00d9a\u00b7.\"\u00a5\u00c7\u00e3\b\u00a4\u00f6QW\u0003=D\u0081\u0099V\u00bd/_\u0001\u00f0\u001d\u0082K\u00b0\u0093\u0090\u00ee\u00af\u0010\u0015M\u00e9\u00a8I\u00fbr\u00ab\u00f0\u00e1[\u00d3\"H\u00dbn";
                                    var30_6 = "\u00d9a\u00b7.\"\u00a5\u00c7\u00e3\b\u00a4\u00f6QW\u0003=D\u0081\u0099V\u00bd/_\u0001\u00f0\u001d\u0082K\u00b0\u0093\u0090\u00ee\u00af\u0010\u0015M\u00e9\u00a8I\u00fbr\u00ab\u00f0\u00e1[\u00d3\"H\u00dbn".length();
                                    var27_7 = 32;
                                    var26_8 = -1;
lbl34:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var26_8;
                                        v4 = var28_5.substring(v6, v6 + var27_7);
                                        v5 = 0;
                                        break block26;
                                        break;
                                    }
                                    break;
                                }
lbl39:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = CP_hO.a(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    break block27;
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
                        CP_hO.b = var31_3;
                        CP_hO.c = new String[12];
                        CP_hO.g = new HashMap<K, V>(13);
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
                        var17_12 = new long[6];
                        var14_13 = 0;
                        var15_14 = "\u0099`\u0088\u0004\u00b6b\u000f\u0083\u008a\u001f\u00b8\r\u001e\u001dm1M\u00eb\u001f\u0007\u00f0\u007fd\u0090\u00e0aO1ul|\u00ca";
                        var16_15 = "\u0099`\u0088\u0004\u00b6b\u000f\u0083\u008a\u001f\u00b8\r\u001e\u001dm1M\u00eb\u001f\u0007\u00f0\u007fd\u0090\u00e0aO1ul|\u00ca".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v10 = var17_12;
                            v11 = var14_13++;
                            v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v13 = -1;
                            break block28;
                            break;
                        }
lbl78:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "\u00f0\nI\u009b\u0094!\u00c6\u00c1\u00a1/d\u00f3\u0019\u00admF";
                            var16_15 = "\u00f0\nI\u009b\u0094!\u00c6\u00c1\u00a1/d\u00f3\u0019\u00admF".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v10 = var17_12;
                                v11 = var14_13++;
                                v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v13 = 0;
                                break block28;
                                break;
                            }
                            break;
                        }
lbl91:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            break block29;
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
                CP_hO.e = var17_12;
                CP_hO.f = new Integer[6];
                CP_hO.j = new HashMap<K, V>(13);
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
                var6_22 = new long[4];
                var3_23 = 0;
                var4_24 = ")e[`\u00ae7\u0095\u0097\u00f4\u00f8t\t\u00a4\u00dcF\u008c";
                var5_25 = ")e[`\u00ae7\u0095\u0097\u00f4\u00f8t\t\u00a4\u00dcF\u008c".length();
                var2_26 = 0;
                while (true) {
                    var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
                    v18 = var6_22;
                    v19 = var3_23++;
                    v20 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
                    v21 = -1;
                    break block30;
                    break;
                }
lbl131:
                // 1 sources

                while (true) {
                    v18[v19] = v22;
                    if (var2_26 < var5_25) ** continue;
                    var4_24 = "\u00ca\u00b9\u00eb\u0082n\u00e3\u00f7,\u00e1{0\u00c4j\u0098J\u00e2";
                    var5_25 = "\u00ca\u00b9\u00eb\u0082n\u00e3\u00f7,\u00e1{0\u00c4j\u0098J\u00e2".length();
                    var2_26 = 0;
                    while (true) {
                        var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
                        v18 = var6_22;
                        v19 = var3_23++;
                        v20 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
                        v21 = 0;
                        break block30;
                        break;
                    }
                    break;
                }
lbl144:
                // 1 sources

                while (true) {
                    v18[v19] = v22;
                    if (var2_26 < var5_25) ** continue;
                    break block31;
                    break;
                }
            }
            var8_28 = v20;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            v22 = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
            switch (v21) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl157:
                // 1 sources

                ** continue;
            }
        }
        CP_hO.h = var6_22;
        CP_hO.i = new Long[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1529;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_hO", exception);
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
            CP_hO.c[n2] = CP_hO.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_hO.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_hO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4ECB;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_hO", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_hO.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_hO.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_hO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x59C4;
        if (i[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/CP_hO", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            CP_hO.i[n2] = l4;
        }
        return i[n2];
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = CP_hO.c(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_hO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_hO.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_hO.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CP_hO.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
