/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.plugin.Plugin
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_OR;
import me.nik.coffeeprotect.CP_Zv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class CP_Xi {
    private final Map<String, String> CP_f;
    private final String CP_n;
    private final String CP_I;
    private final int CP_P;
    private final int CP_b;
    private final int CP_UnderScore;
    private final int CP_K;
    private final int CP_x;
    private boolean CP_k;
    private boolean CP_c;
    private int CP_m;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final long[] e;
    private static final Long[] f;
    private static final Map g;
    private static transient /* synthetic */ String YDKQmsTzQE = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Xi() {
        long l = a ^ 0x492C89E868CDL;
        this.CP_f = new LinkedHashMap<String, String>();
        this.CP_n = this.CP_p();
        this.CP_I = this.CP_b();
        this.CP_P = ThreadLocalRandom.current().nextInt(3);
        this.CP_b = ThreadLocalRandom.current().nextInt(3);
        this.CP_UnderScore = ThreadLocalRandom.current().nextInt(3);
        String string = CP_Zv.CP_X();
        this.CP_K = ThreadLocalRandom.current().nextInt(3);
        this.CP_x = ThreadLocalRandom.current().nextInt(3);
        this.CP_m = 0;
        if (PacketWrapper.CP_z() == null) {
            CP_Zv.CP_O("Uh9yjc");
        }
    }

    void CP_J() {
        block4: {
            long l;
            block3: {
                String string;
                block2: {
                    l = a ^ 0x221C5859834EL;
                    string = CP_Zv.CP_X();
                    if (string != null) break block2;
                    if (!CoffeeProtect.CP_J().CP_i()) break block3;
                    Bukkit.getGlobalRegionScheduler().runAtFixedRate((Plugin)CoffeeProtect.CP_J(), scheduledTask -> {
                        block3: {
                            int n;
                            block2: {
                                long l = a ^ 0x5382B84A37D1L;
                                String string = CP_Zv.CP_X();
                                CP_Xi ilIlXi = this;
                                CP_Xi ilIlXi2 = ilIlXi;
                                n = ilIlXi.CP_m;
                                if (string != null) break block2;
                                ilIlXi2.CP_m = n + 1;
                                if (n <= CP_Xi.a("e", (int)13622, (long)(0x5C0B3285692482EL ^ l))) break block3;
                                ilIlXi2 = this;
                                n = 0;
                            }
                            ilIlXi2.CP_m = n;
                            this.CP_f();
                            scheduledTask.cancel();
                        }
                    }, (long)CP_Xi.b("s", (int)10197, (long)(0x5A6AC8B64ED54E27L ^ l)), (long)CP_Xi.b("s", (int)6267, (long)(0x60C4EC8A313A7188L ^ l)));
                }
                if (string == null) break block4;
            }
            new CP_OR(this).runTaskTimerAsynchronously((Plugin)CoffeeProtect.CP_J(), (long)CP_Xi.b("s", (int)6267, (long)(0x60C4EC8A313A7188L ^ l)), (long)CP_Xi.b("s", (int)6267, (long)(0x60C4EC8A313A7188L ^ l)));
        }
    }

    public boolean CP_n() {
        return this.CP_c;
    }

    public boolean CP_S() {
        return this.CP_k;
    }

    public void CP_d() {
        block2: {
            long l = a ^ 0xE7679F54261L;
            String string = CP_Zv.CP_X();
            for (int i = 0; i < CP_Xi.a("e", (int)6649, (long)(0x45D3549746D99037L ^ l)); ++i) {
                this.CP_L(i);
                if (string == null) {
                    if (string == null) continue;
                }
                break block2;
            }
            this.CP_J();
            this.CP_c = true;
        }
    }

    void CP_f() {
        int n;
        int n2;
        String string;
        block8: {
            AtomicInteger atomicInteger;
            block9: {
                int n3;
                block6: {
                    block7: {
                        long l = a ^ 0x5566F89B3FC0L;
                        atomicInteger = new AtomicInteger();
                        string = CP_Zv.CP_X();
                        AtomicInteger atomicInteger2 = new AtomicInteger();
                        this.CP_f.forEach((var3_3, var4_4) -> {
                            /*
                             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                             * 
                             * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
                             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
                             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
                             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
                             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
                             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
                             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
                             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
                             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
                             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
                             *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
                             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
                             *     at org.benf.cfr.reader.Main.main(Main.java:54)
                             */
                            throw new IllegalStateException("Decompilation failed");
                        });
                        this.CP_f.clear();
                        n2 = 0;
                        n3 = atomicInteger2.get();
                        if (string != null) break block6;
                        if (n3 == atomicInteger.get()) break block7;
                        n = atomicInteger2.get();
                        if (string != null) break block8;
                        if (n != 0) break block9;
                    }
                    n3 = 1;
                }
                n2 = n3;
            }
            n = atomicInteger.get();
        }
        if (string == null) {
            if (n > 0) {
                n2 = 1;
            }
            n = n2;
        }
        if (n != 0) {
            this.CP_k = true;
        }
    }

    void CP_L(int n) {
        String string;
        block6: {
            String string2;
            int n2;
            String string3;
            String string4;
            block8: {
                block7: {
                    String string5;
                    String string6;
                    String string7;
                    block5: {
                        long l = a ^ 0x124251EBC94BL;
                        int n3 = n + 5 + 5 + CP_Xi.a("e", (int)3392, (long)(0x48FD76D13FE10E7BL ^ l)) + CP_Xi.a("e", (int)7087, (long)(0x377FFC9756D498C2L ^ l)) + CP_Xi.a("e", (int)23694, (long)(0x2F21DE20939DDF04L ^ l)) + 1 + 5 + CP_Xi.a("e", (int)23694, (long)(0x2F21DE20939DDF04L ^ l)) + CP_Xi.a("e", (int)23694, (long)(0x2F21DE20939DDF04L ^ l)) + CP_Xi.a("e", (int)10888, (long)(0x138F6A357361298FL ^ l)) + this.CP_x + this.CP_K + this.CP_UnderScore + this.CP_b + this.CP_P;
                        string = CP_Zv.CP_X();
                        string6 = string7 = this.CP_f(n3 -= CP_Xi.a("e", (int)19566, (long)(0x4FB02FB161FB4F62L ^ l)) + this.CP_x + this.CP_K + this.CP_UnderScore + this.CP_b + this.CP_P);
                        string5 = this.CP_n;
                        if (string != null) break block5;
                        if (!string6.contains(string5)) break block6;
                        string6 = string7;
                        string5 = ":";
                    }
                    string4 = string6.split(string5)[0];
                    string3 = string7.split(":")[1];
                    n2 = string4.length();
                    if (string != null) break block7;
                    if (n2 <= 0) break block6;
                    n2 = string3.length();
                }
                if (string != null) break block8;
                if (n2 <= 0) break block6;
                string2 = string3;
                if (string != null) break block6;
                n2 = string2.contains(this.CP_I) ? 1 : 0;
            }
            if (n2 != 0) {
                string4 = Base64.getEncoder().encodeToString(string4.getBytes(StandardCharsets.UTF_8));
                string3 = Base64.getEncoder().encodeToString(string3.getBytes(StandardCharsets.UTF_8));
                string4 = new String(this.CP_G(string4.getBytes(StandardCharsets.UTF_8)));
                string3 = new String(this.CP_G(string3.getBytes(StandardCharsets.UTF_8)));
                string2 = this.CP_f.put(string4, string3);
            }
        }
        if (string != null) {
            PacketWrapper.CP_e(new int[3]);
        }
    }

    byte[] CP_P(byte[] byArray) {
        byte[] byArray2;
        block2: {
            long l = a ^ 0x29A1E28B7C19L;
            int n = 2;
            String string = CP_Zv.CP_X();
            byte[] byArray3 = new byte[byArray.length];
            for (int i = 0; i < byArray.length; ++i) {
                byArray2 = byArray3;
                if (string == null) {
                    byArray2[i] = (byte)(byArray[i] - n);
                    if (string == null) continue;
                }
                break block2;
            }
            byArray2 = byArray3;
        }
        return byArray2;
    }

    byte[] CP_G(byte[] byArray) {
        byte[] byArray2;
        block2: {
            long l = a ^ 0x7A100C86D63BL;
            int n = 2;
            String string = CP_Zv.CP_X();
            byte[] byArray3 = new byte[byArray.length];
            for (int i = 0; i < byArray.length; ++i) {
                byArray2 = byArray3;
                if (string == null) {
                    byArray2[i] = (byte)(byArray[i] + n);
                    if (string == null) continue;
                }
                break block2;
            }
            byArray2 = byArray3;
        }
        return byArray2;
    }

    private String CP_b() {
        String string;
        int n;
        byte[] byArray;
        ArrayList<Byte> arrayList;
        block3: {
            long l = a ^ 0x5D67E0ED69AFL;
            CallSite callSite = CP_Xi.a("e", (int)27963, (long)(0x42621DC1B6B04E3AL ^ l));
            byte[] byArray2 = new byte[]{(byte)CP_Xi.a("e", (int)10205, (long)(0x3428069F98BF847CL ^ l))};
            arrayList = new ArrayList<Byte>();
            byArray = byArray2;
            n = byArray.length;
            string = CP_Zv.CP_X();
            for (int i = 0; i < n; ++i) {
                byte by = byArray[i];
                arrayList.add((byte)(by + callSite * callSite / 5));
                if (string == null) {
                    if (string == null) continue;
                }
                break block3;
            }
            byArray = new byte[arrayList.size()];
        }
        for (n = 0; n < arrayList.size(); ++n) {
            byArray[n] = (Byte)arrayList.get(n);
            if (string == null) continue;
        }
        return new String(byArray);
    }

    private String CP_p() {
        String string;
        int n;
        byte[] byArray;
        ArrayList<Byte> arrayList;
        block3: {
            long l = a ^ 0x167641A67523L;
            CallSite callSite = CP_Xi.a("e", (int)22177, (long)(0x7B216C671DB4E83EL ^ l));
            byte[] byArray2 = new byte[]{(byte)CP_Xi.a("e", (int)15981, (long)(0x4E21557B8C9781ADL ^ l))};
            arrayList = new ArrayList<Byte>();
            byArray = byArray2;
            n = byArray.length;
            string = CP_Zv.CP_X();
            for (int i = 0; i < n; ++i) {
                byte by = byArray[i];
                arrayList.add((byte)(by + callSite * callSite / 5));
                if (string == null) {
                    if (string == null) continue;
                }
                break block3;
            }
            byArray = new byte[arrayList.size()];
        }
        for (n = 0; n < arrayList.size(); ++n) {
            byArray[n] = (Byte)arrayList.get(n);
            if (string == null) continue;
        }
        return new String(byArray);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String CP_f(int var1_1) {
        var2_2 = CP_Xi.a ^ 124177233322049L;
        var4_3 = CP_Zv.CP_X();
        v0 /* !! */  = var1_1;
        if (var4_3 != null) ** GOTO lbl8
        switch (v0 /* !! */ ) {
            case 0: {
                v0 /* !! */  = (int)CP_Xi.a("e", (int)1339, (long)(8905509145124007744L ^ var2_2));
lbl8:
                // 2 sources

                var5_4 = v0 /* !! */ ;
                v1 = new byte[CP_Xi.a("e", (int)12100, (long)(7544656220837594399L ^ var2_2))];
                v1[0] = (byte)CP_Xi.a("e", (int)21318, (long)(4639476570824226993L ^ var2_2));
                v1[1] = (byte)CP_Xi.a("e", (int)15350, (long)(2263642940862353839L ^ var2_2));
                v1[2] = (byte)CP_Xi.a("e", (int)23500, (long)(8973155235558306258L ^ var2_2));
                v1[3] = (byte)CP_Xi.a("e", (int)7685, (long)(5151371375835641030L ^ var2_2));
                v1[4] = (byte)CP_Xi.a("e", (int)13751, (long)(5217026120874516427L ^ var2_2));
                v1[5] = (byte)CP_Xi.a("e", (int)2264, (long)(2756554714797794099L ^ var2_2));
                v1[CP_Xi.a("e", (int)30679, (long)(4520178309656026436L ^ var2_2))] = (byte)CP_Xi.a("e", (int)17517, (long)(6102633701093912094L ^ var2_2));
                v1[CP_Xi.a("e", (int)20013, (long)(5725688573597918217L ^ var2_2))] = (byte)CP_Xi.a("e", (int)16939, (long)(4484502911560198225L ^ var2_2));
                v1[CP_Xi.a("e", (int)1805, (long)(7936888867678940633L ^ var2_2))] = (byte)CP_Xi.a("e", (int)32361, (long)(8755366223448413606L ^ var2_2));
                v1[CP_Xi.a("e", (int)32048, (long)(3341885476802860933L ^ var2_2))] = (byte)CP_Xi.a("e", (int)16753, (long)(3999740803157568490L ^ var2_2));
                v1[CP_Xi.a("e", (int)14436, (long)(966271959922922163L ^ var2_2))] = (byte)CP_Xi.a("e", (int)23494, (long)(1162396287536443835L ^ var2_2));
                v1[CP_Xi.a("e", (int)16428, (long)(1666839096199162840L ^ var2_2))] = (byte)CP_Xi.a("e", (int)29789, (long)(6677507387990842992L ^ var2_2));
                v1[CP_Xi.a("e", (int)15315, (long)(1570722512100250035L ^ var2_2))] = (byte)CP_Xi.a("e", (int)15884, (long)(5206813718315816176L ^ var2_2));
                v1[CP_Xi.a("e", (int)3347, (long)(1675315329269032864L ^ var2_2))] = (byte)CP_Xi.a("e", (int)1022, (long)(2342306431968668055L ^ var2_2));
                v1[CP_Xi.a("e", (int)14206, (long)(1708498280216780033L ^ var2_2))] = (byte)CP_Xi.a("e", (int)22177, (long)(7072470690103278781L ^ var2_2));
                v1[CP_Xi.a("e", (int)29938, (long)(529051802656448264L ^ var2_2))] = (byte)CP_Xi.a("e", (int)1939, (long)(6497107706827861119L ^ var2_2));
                v1[CP_Xi.a("e", (int)24599, (long)(4369643776743148180L ^ var2_2))] = (byte)CP_Xi.a("e", (int)5223, (long)(2922478151366409978L ^ var2_2));
                v1[CP_Xi.a("e", (int)14267, (long)(4273172394617494842L ^ var2_2))] = (byte)CP_Xi.a("e", (int)20138, (long)(1414904704553853958L ^ var2_2));
                v1[CP_Xi.a("e", (int)32704, (long)(3480465730995426595L ^ var2_2))] = (byte)CP_Xi.a("e", (int)5223, (long)(2922478151366409978L ^ var2_2));
                v1[CP_Xi.a("e", (int)10427, (long)(2294656686262305291L ^ var2_2))] = (byte)CP_Xi.a("e", (int)20138, (long)(1414904704553853958L ^ var2_2));
                v1[CP_Xi.a("e", (int)23694, (long)(3396202931439515150L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25026, (long)(2805125097151794040L ^ var2_2));
                v1[CP_Xi.a("e", (int)13805, (long)(1716003475762110274L ^ var2_2))] = (byte)CP_Xi.a("e", (int)16083, (long)(8763273385202799619L ^ var2_2));
                v1[CP_Xi.a("e", (int)7259, (long)(4066001279147144720L ^ var2_2))] = (byte)CP_Xi.a("e", (int)13751, (long)(5217026120874516427L ^ var2_2));
                v1[CP_Xi.a("e", (int)5462, (long)(6682820583792443294L ^ var2_2))] = (byte)CP_Xi.a("e", (int)16083, (long)(8763273385202799619L ^ var2_2));
                v1[CP_Xi.a("e", (int)16783, (long)(5065077191041395306L ^ var2_2))] = (byte)CP_Xi.a("e", (int)24311, (long)(941814416870913158L ^ var2_2));
                v1[CP_Xi.a("e", (int)14788, (long)(1086577705901904699L ^ var2_2))] = (byte)CP_Xi.a("e", (int)20138, (long)(1414904704553853958L ^ var2_2));
                v1[CP_Xi.a("e", (int)3680, (long)(4855180409723544769L ^ var2_2))] = (byte)CP_Xi.a("e", (int)1022, (long)(2342306431968668055L ^ var2_2));
                v1[CP_Xi.a("e", (int)15618, (long)(5530057410829998020L ^ var2_2))] = (byte)CP_Xi.a("e", (int)17373, (long)(976742352168528223L ^ var2_2));
                v1[CP_Xi.a("e", (int)24389, (long)(469402361011582341L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25026, (long)(2805125097151794040L ^ var2_2));
                v1[CP_Xi.a("e", (int)1358, (long)(2053334683461938877L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25026, (long)(2805125097151794040L ^ var2_2));
                v1[CP_Xi.a("e", (int)30261, (long)(1238864599455374474L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25026, (long)(2805125097151794040L ^ var2_2));
                v1[CP_Xi.a("e", (int)14233, (long)(8473674501405990278L ^ var2_2))] = (byte)CP_Xi.a("e", (int)16083, (long)(8763273385202799619L ^ var2_2));
                v1[CP_Xi.a("e", (int)25236, (long)(8717292595085838572L ^ var2_2))] = (byte)CP_Xi.a("e", (int)12787, (long)(6376967824259930934L ^ var2_2));
                v1[CP_Xi.a("e", (int)7059, (long)(3388030442887901560L ^ var2_2))] = (byte)CP_Xi.a("e", (int)24110, (long)(7176459331405460574L ^ var2_2));
                v1[CP_Xi.a("e", (int)12421, (long)(602993935719684809L ^ var2_2))] = (byte)CP_Xi.a("e", (int)6576, (long)(2566031689812177703L ^ var2_2));
                v1[CP_Xi.a("e", (int)831, (long)(2407143559633693129L ^ var2_2))] = (byte)CP_Xi.a("e", (int)9517, (long)(1843998148377038629L ^ var2_2));
                v1[CP_Xi.a("e", (int)8008, (long)(6997980582933525876L ^ var2_2))] = (byte)CP_Xi.a("e", (int)9052, (long)(128161799533316466L ^ var2_2));
                v1[CP_Xi.a("e", (int)18996, (long)(1545799954469494938L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25867, (long)(8230156300785029026L ^ var2_2));
                v1[CP_Xi.a("e", (int)27765, (long)(8147735706647070349L ^ var2_2))] = (byte)CP_Xi.a("e", (int)12230, (long)(9131369762075887022L ^ var2_2));
                v1[CP_Xi.a("e", (int)16438, (long)(4789661735059565211L ^ var2_2))] = (byte)CP_Xi.a("e", (int)29896, (long)(8973696440047902294L ^ var2_2));
                v1[CP_Xi.a("e", (int)4936, (long)(6793431796361361727L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2264, (long)(2756554714797794099L ^ var2_2));
                v1[CP_Xi.a("e", (int)16503, (long)(829371286028692065L ^ var2_2))] = (byte)CP_Xi.a("e", (int)24311, (long)(941814416870913158L ^ var2_2));
                v1[CP_Xi.a("e", (int)8252, (long)(4522820608438323841L ^ var2_2))] = (byte)CP_Xi.a("e", (int)18781, (long)(4462576225101489124L ^ var2_2));
                v1[CP_Xi.a("e", (int)8667, (long)(6297878398013066238L ^ var2_2))] = (byte)CP_Xi.a("e", (int)13376, (long)(3676458177572429554L ^ var2_2));
                v1[CP_Xi.a("e", (int)24062, (long)(2699700189009000423L ^ var2_2))] = (byte)CP_Xi.a("e", (int)7519, (long)(5063812193351595948L ^ var2_2));
                v1[CP_Xi.a("e", (int)15328, (long)(5001042571804660152L ^ var2_2))] = (byte)CP_Xi.a("e", (int)24311, (long)(941814416870913158L ^ var2_2));
                v1[CP_Xi.a("e", (int)11452, (long)(6236344811285595971L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4256, (long)(1287225134592588294L ^ var2_2));
                v1[CP_Xi.a("e", (int)232, (long)(7656947326982580750L ^ var2_2))] = (byte)CP_Xi.a("e", (int)7379, (long)(1470898579754972889L ^ var2_2));
                v1[CP_Xi.a("e", (int)8792, (long)(39576645142726770L ^ var2_2))] = (byte)CP_Xi.a("e", (int)29896, (long)(8973696440047902294L ^ var2_2));
                v1[CP_Xi.a("e", (int)18633, (long)(7563383581624771266L ^ var2_2))] = (byte)CP_Xi.a("e", (int)31497, (long)(6012900225328156987L ^ var2_2));
                v1[CP_Xi.a("e", (int)29995, (long)(6409096671702294237L ^ var2_2))] = (byte)CP_Xi.a("e", (int)24311, (long)(941814416870913158L ^ var2_2));
                v1[CP_Xi.a("e", (int)12863, (long)(1304339513564158167L ^ var2_2))] = (byte)CP_Xi.a("e", (int)19555, (long)(9133096413728024113L ^ var2_2));
                v1[CP_Xi.a("e", (int)18493, (long)(777555836720030304L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4256, (long)(1287225134592588294L ^ var2_2));
                v1[CP_Xi.a("e", (int)10579, (long)(325643455808619271L ^ var2_2))] = (byte)CP_Xi.a("e", (int)18931, (long)(3381375355534713620L ^ var2_2));
                v1[CP_Xi.a("e", (int)11958, (long)(7973002014862361600L ^ var2_2))] = (byte)CP_Xi.a("e", (int)24311, (long)(941814416870913158L ^ var2_2));
                v1[CP_Xi.a("e", (int)19968, (long)(8401803988226450470L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4256, (long)(1287225134592588294L ^ var2_2));
                v1[CP_Xi.a("e", (int)11, (long)(7361912776168237814L ^ var2_2))] = (byte)CP_Xi.a("e", (int)29917, (long)(540109195859009258L ^ var2_2));
                var6_11 = v1;
                var7_18 = new ArrayList<Byte>();
                var8_25 = var6_11;
                var9_32 = var8_25.length;
                for (var10_39 = 0; var10_39 < var9_32; ++var10_39) {
                    var11_46 = var8_25[var10_39];
                    var7_18.add((byte)(var11_46 + var5_4 * var5_4 / 5));
                    if (var4_3 == null) {
                        if (var4_3 == null) continue;
                    }
                    ** GOTO lbl79
                }
                var8_25 = new byte[var7_18.size()];
lbl79:
                // 3 sources

                for (var9_32 = 0; var9_32 < var7_18.size(); ++var9_32) {
                    var8_25[var9_32] = (Byte)var7_18.get(var9_32);
                    if (var4_3 == null) continue;
                }
                return new String(var8_25);
            }
            case 1: {
                var5_5 = CP_Xi.a("e", (int)15020, (long)(8291935576574677081L ^ var2_2));
                v2 = new byte[CP_Xi.a("e", (int)17115, (long)(7353793813743872250L ^ var2_2))];
                v2[0] = (byte)CP_Xi.a("e", (int)818, (long)(2394599142180481517L ^ var2_2));
                v2[1] = (byte)CP_Xi.a("e", (int)24500, (long)(1477264840314140127L ^ var2_2));
                v2[2] = (byte)CP_Xi.a("e", (int)32624, (long)(4042931064312108189L ^ var2_2));
                v2[3] = (byte)CP_Xi.a("e", (int)23156, (long)(4872509025841393850L ^ var2_2));
                v2[4] = (byte)CP_Xi.a("e", (int)7473, (long)(5673898401117271936L ^ var2_2));
                v2[5] = (byte)CP_Xi.a("e", (int)8139, (long)(6088742968603440396L ^ var2_2));
                v2[CP_Xi.a("e", (int)25742, (long)(6169353394711727998L ^ var2_2))] = (byte)CP_Xi.a("e", (int)28973, (long)(1492844413883718621L ^ var2_2));
                v2[CP_Xi.a("e", (int)6649, (long)(5031411463299625495L ^ var2_2))] = (byte)CP_Xi.a("e", (int)1660, (long)(8094373263157324944L ^ var2_2));
                v2[CP_Xi.a("e", (int)6203, (long)(4965675306903368336L ^ var2_2))] = (byte)CP_Xi.a("e", (int)8414, (long)(5629024755613420211L ^ var2_2));
                v2[CP_Xi.a("e", (int)12667, (long)(3763243393084087180L ^ var2_2))] = (byte)CP_Xi.a("e", (int)22934, (long)(6811579847861941204L ^ var2_2));
                v2[CP_Xi.a("e", (int)20405, (long)(1598304216413906399L ^ var2_2))] = (byte)CP_Xi.a("e", (int)8139, (long)(6088742968603440396L ^ var2_2));
                v2[CP_Xi.a("e", (int)21250, (long)(3106236148750465491L ^ var2_2))] = (byte)CP_Xi.a("e", (int)7473, (long)(5673898401117271936L ^ var2_2));
                v2[CP_Xi.a("e", (int)7764, (long)(1246707686798750790L ^ var2_2))] = (byte)CP_Xi.a("e", (int)7473, (long)(5673898401117271936L ^ var2_2));
                v2[CP_Xi.a("e", (int)18410, (long)(1345759717078642108L ^ var2_2))] = (byte)CP_Xi.a("e", (int)22546, (long)(6305861902167978704L ^ var2_2));
                v2[CP_Xi.a("e", (int)14081, (long)(6466883634968419726L ^ var2_2))] = (byte)CP_Xi.a("e", (int)18237, (long)(8923408986624044385L ^ var2_2));
                v2[CP_Xi.a("e", (int)29938, (long)(529051802656448264L ^ var2_2))] = (byte)CP_Xi.a("e", (int)29652, (long)(2261475518088386989L ^ var2_2));
                v2[CP_Xi.a("e", (int)30680, (long)(3989335127609580594L ^ var2_2))] = (byte)CP_Xi.a("e", (int)22934, (long)(6811579847861941204L ^ var2_2));
                v2[CP_Xi.a("e", (int)12167, (long)(6746034038308062331L ^ var2_2))] = (byte)CP_Xi.a("e", (int)29652, (long)(2261475518088386989L ^ var2_2));
                v2[CP_Xi.a("e", (int)28713, (long)(7726598599955782204L ^ var2_2))] = (byte)CP_Xi.a("e", (int)22934, (long)(6811579847861941204L ^ var2_2));
                v2[CP_Xi.a("e", (int)30694, (long)(4503521450985135411L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4873, (long)(8947210580319107389L ^ var2_2));
                v2[CP_Xi.a("e", (int)23694, (long)(3396202931439515150L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21337, (long)(7378335956741241295L ^ var2_2));
                v2[CP_Xi.a("e", (int)6809, (long)(4896684482828464248L ^ var2_2))] = (byte)CP_Xi.a("e", (int)17721, (long)(4310479101950832375L ^ var2_2));
                v2[CP_Xi.a("e", (int)20595, (long)(971473643595545314L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21337, (long)(7378335956741241295L ^ var2_2));
                v2[CP_Xi.a("e", (int)23497, (long)(444717945090355555L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25198, (long)(2638113847378479173L ^ var2_2));
                v2[CP_Xi.a("e", (int)13704, (long)(4675079900173688680L ^ var2_2))] = (byte)CP_Xi.a("e", (int)22934, (long)(6811579847861941204L ^ var2_2));
                v2[CP_Xi.a("e", (int)1065, (long)(3464200785447317202L ^ var2_2))] = (byte)CP_Xi.a("e", (int)7473, (long)(5673898401117271936L ^ var2_2));
                v2[CP_Xi.a("e", (int)21383, (long)(6452534191985998137L ^ var2_2))] = (byte)CP_Xi.a("e", (int)31755, (long)(2508349624614688322L ^ var2_2));
                v2[CP_Xi.a("e", (int)18342, (long)(2080533931275562406L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2080, (long)(7959527522082677419L ^ var2_2));
                v2[CP_Xi.a("e", (int)4331, (long)(2564274401389607597L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2080, (long)(7959527522082677419L ^ var2_2));
                v2[CP_Xi.a("e", (int)14876, (long)(1793437122784776265L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2080, (long)(7959527522082677419L ^ var2_2));
                v2[CP_Xi.a("e", (int)15530, (long)(5217825419847325278L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21337, (long)(7378335956741241295L ^ var2_2));
                v2[CP_Xi.a("e", (int)4575, (long)(7311996423586544524L ^ var2_2))] = (byte)CP_Xi.a("e", (int)19883, (long)(3795472672110028701L ^ var2_2));
                v2[CP_Xi.a("e", (int)31219, (long)(2900613318267802484L ^ var2_2))] = (byte)CP_Xi.a("e", (int)5223, (long)(2922478151366409978L ^ var2_2));
                v2[CP_Xi.a("e", (int)15950, (long)(6832065587104863322L ^ var2_2))] = (byte)CP_Xi.a("e", (int)22546, (long)(6305861902167978704L ^ var2_2));
                v2[CP_Xi.a("e", (int)15667, (long)(7441457365004539706L ^ var2_2))] = (byte)CP_Xi.a("e", (int)13594, (long)(5779967959575093027L ^ var2_2));
                v2[CP_Xi.a("e", (int)31022, (long)(1019582571207332625L ^ var2_2))] = (byte)CP_Xi.a("e", (int)20138, (long)(1414904704553853958L ^ var2_2));
                v2[CP_Xi.a("e", (int)2581, (long)(6292447044134658147L ^ var2_2))] = (byte)CP_Xi.a("e", (int)17859, (long)(5158702844408016727L ^ var2_2));
                v2[CP_Xi.a("e", (int)11465, (long)(4955947899353974377L ^ var2_2))] = (byte)CP_Xi.a("e", (int)16589, (long)(8000875821901621776L ^ var2_2));
                v2[CP_Xi.a("e", (int)690, (long)(5626294806279481430L ^ var2_2))] = (byte)CP_Xi.a("e", (int)7975, (long)(2636036213486253348L ^ var2_2));
                v2[CP_Xi.a("e", (int)32532, (long)(4111155897841292531L ^ var2_2))] = (byte)CP_Xi.a("e", (int)6282, (long)(3299153748954477192L ^ var2_2));
                v2[CP_Xi.a("e", (int)8553, (long)(1717682320451947346L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25198, (long)(2638113847378479173L ^ var2_2));
                v2[CP_Xi.a("e", (int)7427, (long)(8305613804252985181L ^ var2_2))] = (byte)CP_Xi.a("e", (int)29917, (long)(540109195859009258L ^ var2_2));
                v2[CP_Xi.a("e", (int)12322, (long)(4089120494539594351L ^ var2_2))] = (byte)CP_Xi.a("e", (int)30869, (long)(8140389748580323948L ^ var2_2));
                v2[CP_Xi.a("e", (int)14537, (long)(3216148020673401370L ^ var2_2))] = (byte)CP_Xi.a("e", (int)5223, (long)(2922478151366409978L ^ var2_2));
                v2[CP_Xi.a("e", (int)12293, (long)(6011912964253407900L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25198, (long)(2638113847378479173L ^ var2_2));
                v2[CP_Xi.a("e", (int)12058, (long)(659918460909667677L ^ var2_2))] = (byte)CP_Xi.a("e", (int)30869, (long)(8140389748580323948L ^ var2_2));
                v2[CP_Xi.a("e", (int)4337, (long)(5901434537836182209L ^ var2_2))] = (byte)CP_Xi.a("e", (int)14058, (long)(8049929947791744283L ^ var2_2));
                v2[CP_Xi.a("e", (int)29332, (long)(2906568968768002083L ^ var2_2))] = (byte)CP_Xi.a("e", (int)7975, (long)(2636036213486253348L ^ var2_2));
                v2[CP_Xi.a("e", (int)20959, (long)(3189846586861435767L ^ var2_2))] = (byte)CP_Xi.a("e", (int)3490, (long)(5123908466579859356L ^ var2_2));
                v2[CP_Xi.a("e", (int)14485, (long)(4234921805090509435L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25198, (long)(2638113847378479173L ^ var2_2));
                v2[CP_Xi.a("e", (int)28282, (long)(8694723165754131544L ^ var2_2))] = (byte)CP_Xi.a("e", (int)29917, (long)(540109195859009258L ^ var2_2));
                v2[CP_Xi.a("e", (int)23622, (long)(4065111601848661509L ^ var2_2))] = (byte)CP_Xi.a("e", (int)30869, (long)(8140389748580323948L ^ var2_2));
                v2[CP_Xi.a("e", (int)6461, (long)(4415416364193444843L ^ var2_2))] = (byte)CP_Xi.a("e", (int)3846, (long)(6530956993917740527L ^ var2_2));
                v2[CP_Xi.a("e", (int)29547, (long)(1582269169266104648L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25198, (long)(2638113847378479173L ^ var2_2));
                v2[CP_Xi.a("e", (int)3784, (long)(6782085024847422663L ^ var2_2))] = (byte)CP_Xi.a("e", (int)30869, (long)(8140389748580323948L ^ var2_2));
                v2[CP_Xi.a("e", (int)19968, (long)(8401803988226450470L ^ var2_2))] = (byte)CP_Xi.a("e", (int)11557, (long)(676428517518165890L ^ var2_2));
                var6_12 = v2;
                var7_19 = new ArrayList<Byte>();
                var8_26 = var6_12;
                var9_33 = var8_26.length;
                for (var10_40 = 0; var10_40 < var9_33; ++var10_40) {
                    var11_47 = var8_26[var10_40];
                    var7_19.add((byte)(var11_47 + var5_5 * var5_5 / 5));
                    if (var4_3 == null) {
                        if (var4_3 == null) continue;
                    }
                    ** GOTO lbl154
                }
                var8_26 = new byte[var7_19.size()];
lbl154:
                // 3 sources

                for (var9_33 = 0; var9_33 < var7_19.size(); ++var9_33) {
                    var8_26[var9_33] = (Byte)var7_19.get(var9_33);
                    if (var4_3 == null) continue;
                }
                return new String(var8_26);
            }
            case 2: {
                var5_6 = CP_Xi.a("e", (int)23960, (long)(1348795716117968684L ^ var2_2));
                v3 = new byte[CP_Xi.a("e", (int)17115, (long)(7353793813743872250L ^ var2_2))];
                v3[0] = (byte)CP_Xi.a("e", (int)2865, (long)(8557859030141853977L ^ var2_2));
                v3[1] = (byte)CP_Xi.a("e", (int)14059, (long)(2504517133266771105L ^ var2_2));
                v3[2] = (byte)CP_Xi.a("e", (int)26498, (long)(2831938669244812632L ^ var2_2));
                v3[3] = (byte)CP_Xi.a("e", (int)2945, (long)(6093615793116012908L ^ var2_2));
                v3[4] = (byte)CP_Xi.a("e", (int)18090, (long)(476698705808239688L ^ var2_2));
                v3[5] = (byte)CP_Xi.a("e", (int)5384, (long)(7812846714019348442L ^ var2_2));
                v3[CP_Xi.a("e", (int)25742, (long)(6169353394711727998L ^ var2_2))] = (byte)CP_Xi.a("e", (int)6833, (long)(8787147990958338152L ^ var2_2));
                v3[CP_Xi.a("e", (int)6649, (long)(5031411463299625495L ^ var2_2))] = (byte)CP_Xi.a("e", (int)20483, (long)(8119261258052155966L ^ var2_2));
                v3[CP_Xi.a("e", (int)6203, (long)(4965675306903368336L ^ var2_2))] = (byte)CP_Xi.a("e", (int)30869, (long)(8140389748580323948L ^ var2_2));
                v3[CP_Xi.a("e", (int)12667, (long)(3763243393084087180L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25741, (long)(616971083874569948L ^ var2_2));
                v3[CP_Xi.a("e", (int)20405, (long)(1598304216413906399L ^ var2_2))] = (byte)CP_Xi.a("e", (int)7519, (long)(5063812193351595948L ^ var2_2));
                v3[CP_Xi.a("e", (int)21250, (long)(3106236148750465491L ^ var2_2))] = (byte)CP_Xi.a("e", (int)29917, (long)(540109195859009258L ^ var2_2));
                v3[CP_Xi.a("e", (int)7764, (long)(1246707686798750790L ^ var2_2))] = (byte)CP_Xi.a("e", (int)29917, (long)(540109195859009258L ^ var2_2));
                v3[CP_Xi.a("e", (int)18410, (long)(1345759717078642108L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2542, (long)(7888619558497149902L ^ var2_2));
                v3[CP_Xi.a("e", (int)14081, (long)(6466883634968419726L ^ var2_2))] = (byte)CP_Xi.a("e", (int)19696, (long)(5369974458501670496L ^ var2_2));
                v3[CP_Xi.a("e", (int)29938, (long)(529051802656448264L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25193, (long)(7883911976993982547L ^ var2_2));
                v3[CP_Xi.a("e", (int)30680, (long)(3989335127609580594L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4314, (long)(1245286444249447117L ^ var2_2));
                v3[CP_Xi.a("e", (int)12167, (long)(6746034038308062331L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25193, (long)(7883911976993982547L ^ var2_2));
                v3[CP_Xi.a("e", (int)28713, (long)(7726598599955782204L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4314, (long)(1245286444249447117L ^ var2_2));
                v3[CP_Xi.a("e", (int)30694, (long)(4503521450985135411L ^ var2_2))] = (byte)CP_Xi.a("e", (int)28242, (long)(3380347835668759995L ^ var2_2));
                v3[CP_Xi.a("e", (int)23694, (long)(3396202931439515150L ^ var2_2))] = (byte)CP_Xi.a("e", (int)30869, (long)(8140389748580323948L ^ var2_2));
                v3[CP_Xi.a("e", (int)6809, (long)(4896684482828464248L ^ var2_2))] = (byte)CP_Xi.a("e", (int)26498, (long)(2831938669244812632L ^ var2_2));
                v3[CP_Xi.a("e", (int)20595, (long)(971473643595545314L ^ var2_2))] = (byte)CP_Xi.a("e", (int)30869, (long)(8140389748580323948L ^ var2_2));
                v3[CP_Xi.a("e", (int)23497, (long)(444717945090355555L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21163, (long)(1137461206668392779L ^ var2_2));
                v3[CP_Xi.a("e", (int)13704, (long)(4675079900173688680L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4314, (long)(1245286444249447117L ^ var2_2));
                v3[CP_Xi.a("e", (int)1065, (long)(3464200785447317202L ^ var2_2))] = (byte)CP_Xi.a("e", (int)29917, (long)(540109195859009258L ^ var2_2));
                v3[CP_Xi.a("e", (int)21383, (long)(6452534191985998137L ^ var2_2))] = (byte)CP_Xi.a("e", (int)5029, (long)(911361319731001730L ^ var2_2));
                v3[CP_Xi.a("e", (int)18342, (long)(2080533931275562406L ^ var2_2))] = (byte)CP_Xi.a("e", (int)28242, (long)(3380347835668759995L ^ var2_2));
                v3[CP_Xi.a("e", (int)4331, (long)(2564274401389607597L ^ var2_2))] = (byte)CP_Xi.a("e", (int)28242, (long)(3380347835668759995L ^ var2_2));
                v3[CP_Xi.a("e", (int)14876, (long)(1793437122784776265L ^ var2_2))] = (byte)CP_Xi.a("e", (int)28242, (long)(3380347835668759995L ^ var2_2));
                v3[CP_Xi.a("e", (int)15530, (long)(5217825419847325278L ^ var2_2))] = (byte)CP_Xi.a("e", (int)30869, (long)(8140389748580323948L ^ var2_2));
                v3[CP_Xi.a("e", (int)4575, (long)(7311996423586544524L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25989, (long)(6339115887013891913L ^ var2_2));
                v3[CP_Xi.a("e", (int)31219, (long)(2900613318267802484L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2344, (long)(6112163352165377011L ^ var2_2));
                v3[CP_Xi.a("e", (int)15950, (long)(6832065587104863322L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2542, (long)(7888619558497149902L ^ var2_2));
                v3[CP_Xi.a("e", (int)15667, (long)(7441457365004539706L ^ var2_2))] = (byte)CP_Xi.a("e", (int)6576, (long)(2566031689812177703L ^ var2_2));
                v3[CP_Xi.a("e", (int)31022, (long)(1019582571207332625L ^ var2_2))] = (byte)CP_Xi.a("e", (int)8391, (long)(2430649804415552067L ^ var2_2));
                v3[CP_Xi.a("e", (int)2581, (long)(6292447044134658147L ^ var2_2))] = (byte)CP_Xi.a("e", (int)29902, (long)(1022541809036271362L ^ var2_2));
                v3[CP_Xi.a("e", (int)11465, (long)(4955947899353974377L ^ var2_2))] = (byte)CP_Xi.a("e", (int)22223, (long)(5851188702993628202L ^ var2_2));
                v3[CP_Xi.a("e", (int)690, (long)(5626294806279481430L ^ var2_2))] = (byte)CP_Xi.a("e", (int)6576, (long)(2566031689812177703L ^ var2_2));
                v3[CP_Xi.a("e", (int)32532, (long)(4111155897841292531L ^ var2_2))] = (byte)CP_Xi.a("e", (int)14678, (long)(2014886689534170062L ^ var2_2));
                v3[CP_Xi.a("e", (int)8553, (long)(1717682320451947346L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21163, (long)(1137461206668392779L ^ var2_2));
                v3[CP_Xi.a("e", (int)7427, (long)(8305613804252985181L ^ var2_2))] = (byte)CP_Xi.a("e", (int)11218, (long)(4590510445138624800L ^ var2_2));
                v3[CP_Xi.a("e", (int)12322, (long)(4089120494539594351L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2590, (long)(6041225864606736457L ^ var2_2));
                v3[CP_Xi.a("e", (int)14537, (long)(3216148020673401370L ^ var2_2))] = (byte)CP_Xi.a("e", (int)7984, (long)(5344252754730874065L ^ var2_2));
                v3[CP_Xi.a("e", (int)12293, (long)(6011912964253407900L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21163, (long)(1137461206668392779L ^ var2_2));
                v3[CP_Xi.a("e", (int)12058, (long)(659918460909667677L ^ var2_2))] = (byte)CP_Xi.a("e", (int)22563, (long)(1544984985624818238L ^ var2_2));
                v3[CP_Xi.a("e", (int)4337, (long)(5901434537836182209L ^ var2_2))] = (byte)CP_Xi.a("e", (int)15250, (long)(5378691188320063985L ^ var2_2));
                v3[CP_Xi.a("e", (int)29332, (long)(2906568968768002083L ^ var2_2))] = (byte)CP_Xi.a("e", (int)6576, (long)(2566031689812177703L ^ var2_2));
                v3[CP_Xi.a("e", (int)20959, (long)(3189846586861435767L ^ var2_2))] = (byte)CP_Xi.a("e", (int)10801, (long)(4295343214422737069L ^ var2_2));
                v3[CP_Xi.a("e", (int)14485, (long)(4234921805090509435L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21163, (long)(1137461206668392779L ^ var2_2));
                v3[CP_Xi.a("e", (int)28282, (long)(8694723165754131544L ^ var2_2))] = (byte)CP_Xi.a("e", (int)27323, (long)(5598502875150287193L ^ var2_2));
                v3[CP_Xi.a("e", (int)23622, (long)(4065111601848661509L ^ var2_2))] = (byte)CP_Xi.a("e", (int)22563, (long)(1544984985624818238L ^ var2_2));
                v3[CP_Xi.a("e", (int)6461, (long)(4415416364193444843L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4474, (long)(4929061391532358579L ^ var2_2));
                v3[CP_Xi.a("e", (int)29547, (long)(1582269169266104648L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21163, (long)(1137461206668392779L ^ var2_2));
                v3[CP_Xi.a("e", (int)3784, (long)(6782085024847422663L ^ var2_2))] = (byte)CP_Xi.a("e", (int)22563, (long)(1544984985624818238L ^ var2_2));
                v3[CP_Xi.a("e", (int)19968, (long)(8401803988226450470L ^ var2_2))] = (byte)CP_Xi.a("e", (int)26990, (long)(1069805649466393442L ^ var2_2));
                var6_13 = v3;
                var7_20 = new ArrayList<Byte>();
                var8_27 = var6_13;
                var9_34 = var8_27.length;
                for (var10_41 = 0; var10_41 < var9_34; ++var10_41) {
                    var11_48 = var8_27[var10_41];
                    var7_20.add((byte)(var11_48 + var5_6 * var5_6 / 5));
                    if (var4_3 == null) {
                        if (var4_3 == null) continue;
                    }
                    ** GOTO lbl229
                }
                var8_27 = new byte[var7_20.size()];
lbl229:
                // 3 sources

                for (var9_34 = 0; var9_34 < var7_20.size(); ++var9_34) {
                    var8_27[var9_34] = (Byte)var7_20.get(var9_34);
                    if (var4_3 == null) continue;
                }
                return new String(var8_27);
            }
            case 3: {
                var5_7 = CP_Xi.a("e", (int)20569, (long)(3622142899861568442L ^ var2_2));
                v4 = new byte[CP_Xi.a("e", (int)17115, (long)(7353793813743872250L ^ var2_2))];
                v4[0] = (byte)CP_Xi.a("e", (int)5029, (long)(911361319731001730L ^ var2_2));
                v4[1] = (byte)CP_Xi.a("e", (int)26078, (long)(5770006618971049511L ^ var2_2));
                v4[2] = (byte)CP_Xi.a("e", (int)26078, (long)(5770006618971049511L ^ var2_2));
                v4[3] = (byte)CP_Xi.a("e", (int)13751, (long)(5217026120874516427L ^ var2_2));
                v4[4] = (byte)CP_Xi.a("e", (int)13751, (long)(5217026120874516427L ^ var2_2));
                v4[5] = (byte)CP_Xi.a("e", (int)9228, (long)(9126403188295290440L ^ var2_2));
                v4[CP_Xi.a("e", (int)25742, (long)(6169353394711727998L ^ var2_2))] = (byte)CP_Xi.a("e", (int)16939, (long)(4484502911560198225L ^ var2_2));
                v4[CP_Xi.a("e", (int)6649, (long)(5031411463299625495L ^ var2_2))] = (byte)CP_Xi.a("e", (int)6576, (long)(2566031689812177703L ^ var2_2));
                v4[CP_Xi.a("e", (int)6203, (long)(4965675306903368336L ^ var2_2))] = (byte)CP_Xi.a("e", (int)16939, (long)(4484502911560198225L ^ var2_2));
                v4[CP_Xi.a("e", (int)12667, (long)(3763243393084087180L ^ var2_2))] = (byte)CP_Xi.a("e", (int)28242, (long)(3380347835668759995L ^ var2_2));
                v4[CP_Xi.a("e", (int)20405, (long)(1598304216413906399L ^ var2_2))] = (byte)CP_Xi.a("e", (int)10417, (long)(5669419758734787402L ^ var2_2));
                v4[CP_Xi.a("e", (int)21250, (long)(3106236148750465491L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21479, (long)(1665077061299026323L ^ var2_2));
                v4[CP_Xi.a("e", (int)7764, (long)(1246707686798750790L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21479, (long)(1665077061299026323L ^ var2_2));
                v4[CP_Xi.a("e", (int)18410, (long)(1345759717078642108L ^ var2_2))] = (byte)CP_Xi.a("e", (int)30869, (long)(8140389748580323948L ^ var2_2));
                v4[CP_Xi.a("e", (int)14081, (long)(6466883634968419726L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2264, (long)(2756554714797794099L ^ var2_2));
                v4[CP_Xi.a("e", (int)29938, (long)(529051802656448264L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2264, (long)(2756554714797794099L ^ var2_2));
                v4[CP_Xi.a("e", (int)30680, (long)(3989335127609580594L ^ var2_2))] = (byte)CP_Xi.a("e", (int)28242, (long)(3380347835668759995L ^ var2_2));
                v4[CP_Xi.a("e", (int)12167, (long)(6746034038308062331L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2264, (long)(2756554714797794099L ^ var2_2));
                v4[CP_Xi.a("e", (int)28713, (long)(7726598599955782204L ^ var2_2))] = (byte)CP_Xi.a("e", (int)28242, (long)(3380347835668759995L ^ var2_2));
                v4[CP_Xi.a("e", (int)30694, (long)(4503521450985135411L ^ var2_2))] = (byte)CP_Xi.a("e", (int)13751, (long)(5217026120874516427L ^ var2_2));
                v4[CP_Xi.a("e", (int)23694, (long)(3396202931439515150L ^ var2_2))] = (byte)CP_Xi.a("e", (int)16939, (long)(4484502911560198225L ^ var2_2));
                v4[CP_Xi.a("e", (int)6809, (long)(4896684482828464248L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2253, (long)(303432539111711486L ^ var2_2));
                v4[CP_Xi.a("e", (int)20595, (long)(971473643595545314L ^ var2_2))] = (byte)CP_Xi.a("e", (int)16939, (long)(4484502911560198225L ^ var2_2));
                v4[CP_Xi.a("e", (int)23497, (long)(444717945090355555L ^ var2_2))] = (byte)CP_Xi.a("e", (int)6576, (long)(2566031689812177703L ^ var2_2));
                v4[CP_Xi.a("e", (int)13704, (long)(4675079900173688680L ^ var2_2))] = (byte)CP_Xi.a("e", (int)28242, (long)(3380347835668759995L ^ var2_2));
                v4[CP_Xi.a("e", (int)1065, (long)(3464200785447317202L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21479, (long)(1665077061299026323L ^ var2_2));
                v4[CP_Xi.a("e", (int)21383, (long)(6452534191985998137L ^ var2_2))] = (byte)CP_Xi.a("e", (int)26078, (long)(5770006618971049511L ^ var2_2));
                v4[CP_Xi.a("e", (int)18342, (long)(2080533931275562406L ^ var2_2))] = (byte)CP_Xi.a("e", (int)13751, (long)(5217026120874516427L ^ var2_2));
                v4[CP_Xi.a("e", (int)4331, (long)(2564274401389607597L ^ var2_2))] = (byte)CP_Xi.a("e", (int)13751, (long)(5217026120874516427L ^ var2_2));
                v4[CP_Xi.a("e", (int)14876, (long)(1793437122784776265L ^ var2_2))] = (byte)CP_Xi.a("e", (int)13751, (long)(5217026120874516427L ^ var2_2));
                v4[CP_Xi.a("e", (int)15530, (long)(5217825419847325278L ^ var2_2))] = (byte)CP_Xi.a("e", (int)16939, (long)(4484502911560198225L ^ var2_2));
                v4[CP_Xi.a("e", (int)4575, (long)(7311996423586544524L ^ var2_2))] = (byte)CP_Xi.a("e", (int)28398, (long)(6230745872819586247L ^ var2_2));
                v4[CP_Xi.a("e", (int)31219, (long)(2900613318267802484L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4157, (long)(3337220174692121167L ^ var2_2));
                v4[CP_Xi.a("e", (int)15950, (long)(6832065587104863322L ^ var2_2))] = (byte)CP_Xi.a("e", (int)30869, (long)(8140389748580323948L ^ var2_2));
                v4[CP_Xi.a("e", (int)15667, (long)(7441457365004539706L ^ var2_2))] = (byte)CP_Xi.a("e", (int)16083, (long)(8763273385202799619L ^ var2_2));
                v4[CP_Xi.a("e", (int)31022, (long)(1019582571207332625L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25589, (long)(3694178004220512754L ^ var2_2));
                v4[CP_Xi.a("e", (int)2581, (long)(6292447044134658147L ^ var2_2))] = (byte)CP_Xi.a("e", (int)7519, (long)(5063812193351595948L ^ var2_2));
                v4[CP_Xi.a("e", (int)11465, (long)(4955947899353974377L ^ var2_2))] = (byte)CP_Xi.a("e", (int)18418, (long)(668750048608759272L ^ var2_2));
                v4[CP_Xi.a("e", (int)690, (long)(5626294806279481430L ^ var2_2))] = (byte)CP_Xi.a("e", (int)16083, (long)(8763273385202799619L ^ var2_2));
                v4[CP_Xi.a("e", (int)32532, (long)(4111155897841292531L ^ var2_2))] = (byte)CP_Xi.a("e", (int)5029, (long)(911361319731001730L ^ var2_2));
                v4[CP_Xi.a("e", (int)8553, (long)(1717682320451947346L ^ var2_2))] = (byte)CP_Xi.a("e", (int)6576, (long)(2566031689812177703L ^ var2_2));
                v4[CP_Xi.a("e", (int)7427, (long)(8305613804252985181L ^ var2_2))] = (byte)CP_Xi.a("e", (int)13270, (long)(2401144369206516060L ^ var2_2));
                v4[CP_Xi.a("e", (int)12322, (long)(4089120494539594351L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25958, (long)(4095241742826934024L ^ var2_2));
                v4[CP_Xi.a("e", (int)14537, (long)(3216148020673401370L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4157, (long)(3337220174692121167L ^ var2_2));
                v4[CP_Xi.a("e", (int)12293, (long)(6011912964253407900L ^ var2_2))] = (byte)CP_Xi.a("e", (int)6576, (long)(2566031689812177703L ^ var2_2));
                v4[CP_Xi.a("e", (int)12058, (long)(659918460909667677L ^ var2_2))] = (byte)CP_Xi.a("e", (int)23277, (long)(8981800604132323471L ^ var2_2));
                v4[CP_Xi.a("e", (int)4337, (long)(5901434537836182209L ^ var2_2))] = (byte)CP_Xi.a("e", (int)314, (long)(5428412444774329248L ^ var2_2));
                v4[CP_Xi.a("e", (int)29332, (long)(2906568968768002083L ^ var2_2))] = (byte)CP_Xi.a("e", (int)16083, (long)(8763273385202799619L ^ var2_2));
                v4[CP_Xi.a("e", (int)20959, (long)(3189846586861435767L ^ var2_2))] = (byte)CP_Xi.a("e", (int)31520, (long)(5254721224708657581L ^ var2_2));
                v4[CP_Xi.a("e", (int)14485, (long)(4234921805090509435L ^ var2_2))] = (byte)CP_Xi.a("e", (int)6576, (long)(2566031689812177703L ^ var2_2));
                v4[CP_Xi.a("e", (int)28282, (long)(8694723165754131544L ^ var2_2))] = (byte)CP_Xi.a("e", (int)15789, (long)(1758066520330852110L ^ var2_2));
                v4[CP_Xi.a("e", (int)23622, (long)(4065111601848661509L ^ var2_2))] = (byte)CP_Xi.a("e", (int)23277, (long)(8981800604132323471L ^ var2_2));
                v4[CP_Xi.a("e", (int)6461, (long)(4415416364193444843L ^ var2_2))] = (byte)CP_Xi.a("e", (int)15660, (long)(8615645502015952865L ^ var2_2));
                v4[CP_Xi.a("e", (int)29547, (long)(1582269169266104648L ^ var2_2))] = (byte)CP_Xi.a("e", (int)6576, (long)(2566031689812177703L ^ var2_2));
                v4[CP_Xi.a("e", (int)3784, (long)(6782085024847422663L ^ var2_2))] = (byte)CP_Xi.a("e", (int)23277, (long)(8981800604132323471L ^ var2_2));
                v4[CP_Xi.a("e", (int)19968, (long)(8401803988226450470L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21116, (long)(7092034834289440984L ^ var2_2));
                var6_14 = v4;
                var7_21 = new ArrayList<Byte>();
                var8_28 = var6_14;
                var9_35 = var8_28.length;
                for (var10_42 = 0; var10_42 < var9_35; ++var10_42) {
                    var11_49 = var8_28[var10_42];
                    var7_21.add((byte)(var11_49 + var5_7 * var5_7 / 5));
                    if (var4_3 == null) {
                        if (var4_3 == null) continue;
                    }
                    ** GOTO lbl304
                }
                var8_28 = new byte[var7_21.size()];
lbl304:
                // 3 sources

                for (var9_35 = 0; var9_35 < var7_21.size(); ++var9_35) {
                    var8_28[var9_35] = (Byte)var7_21.get(var9_35);
                    if (var4_3 == null) continue;
                }
                return new String(var8_28);
            }
            case 4: {
                var5_8 = CP_Xi.a("e", (int)25537, (long)(6468482334682122292L ^ var2_2));
                v5 = new byte[CP_Xi.a("e", (int)8870, (long)(882607154389829824L ^ var2_2))];
                v5[0] = (byte)CP_Xi.a("e", (int)28488, (long)(8856718704902276502L ^ var2_2));
                v5[1] = (byte)CP_Xi.a("e", (int)23622, (long)(4065111601848661509L ^ var2_2));
                v5[2] = (byte)CP_Xi.a("e", (int)29547, (long)(1582269169266104648L ^ var2_2));
                v5[3] = (byte)CP_Xi.a("e", (int)3784, (long)(6782085024847422663L ^ var2_2));
                v5[4] = (byte)CP_Xi.a("e", (int)22030, (long)(5568158356088765695L ^ var2_2));
                v5[5] = (byte)CP_Xi.a("e", (int)28282, (long)(8694723165754131544L ^ var2_2));
                v5[CP_Xi.a("e", (int)25742, (long)(6169353394711727998L ^ var2_2))] = (byte)CP_Xi.a("e", (int)29466, (long)(197009262299814306L ^ var2_2));
                v5[CP_Xi.a("e", (int)6649, (long)(5031411463299625495L ^ var2_2))] = (byte)CP_Xi.a("e", (int)3784, (long)(6782085024847422663L ^ var2_2));
                v5[CP_Xi.a("e", (int)6203, (long)(4965675306903368336L ^ var2_2))] = (byte)CP_Xi.a("e", (int)14485, (long)(4234921805090509435L ^ var2_2));
                v5[CP_Xi.a("e", (int)12667, (long)(3763243393084087180L ^ var2_2))] = (byte)CP_Xi.a("e", (int)14485, (long)(4234921805090509435L ^ var2_2));
                v5[CP_Xi.a("e", (int)20405, (long)(1598304216413906399L ^ var2_2))] = (byte)CP_Xi.a("e", (int)5545, (long)(5082526519509352370L ^ var2_2));
                v5[CP_Xi.a("e", (int)21250, (long)(3106236148750465491L ^ var2_2))] = (byte)CP_Xi.a("e", (int)26560, (long)(9122942670520782234L ^ var2_2));
                v5[CP_Xi.a("e", (int)7764, (long)(1246707686798750790L ^ var2_2))] = (byte)CP_Xi.a("e", (int)3745, (long)(4740374598172337497L ^ var2_2));
                v5[CP_Xi.a("e", (int)18410, (long)(1345759717078642108L ^ var2_2))] = (byte)CP_Xi.a("e", (int)29466, (long)(197009262299814306L ^ var2_2));
                v5[CP_Xi.a("e", (int)14081, (long)(6466883634968419726L ^ var2_2))] = (byte)CP_Xi.a("e", (int)3745, (long)(4740374598172337497L ^ var2_2));
                v5[CP_Xi.a("e", (int)29938, (long)(529051802656448264L ^ var2_2))] = (byte)CP_Xi.a("e", (int)29466, (long)(197009262299814306L ^ var2_2));
                v5[CP_Xi.a("e", (int)30680, (long)(3989335127609580594L ^ var2_2))] = (byte)CP_Xi.a("e", (int)20959, (long)(3189846586861435767L ^ var2_2));
                v5[CP_Xi.a("e", (int)12167, (long)(6746034038308062331L ^ var2_2))] = (byte)CP_Xi.a("e", (int)28282, (long)(8694723165754131544L ^ var2_2));
                v5[CP_Xi.a("e", (int)28713, (long)(7726598599955782204L ^ var2_2))] = (byte)CP_Xi.a("e", (int)6461, (long)(4415416364193444843L ^ var2_2));
                v5[CP_Xi.a("e", (int)30694, (long)(4503521450985135411L ^ var2_2))] = (byte)CP_Xi.a("e", (int)28282, (long)(8694723165754131544L ^ var2_2));
                v5[CP_Xi.a("e", (int)23694, (long)(3396202931439515150L ^ var2_2))] = (byte)CP_Xi.a("e", (int)30180, (long)(5137414870813089631L ^ var2_2));
                v5[CP_Xi.a("e", (int)6809, (long)(4896684482828464248L ^ var2_2))] = (byte)CP_Xi.a("e", (int)29466, (long)(197009262299814306L ^ var2_2));
                v5[CP_Xi.a("e", (int)20595, (long)(971473643595545314L ^ var2_2))] = (byte)CP_Xi.a("e", (int)14485, (long)(4234921805090509435L ^ var2_2));
                v5[CP_Xi.a("e", (int)23497, (long)(444717945090355555L ^ var2_2))] = (byte)CP_Xi.a("e", (int)23622, (long)(4065111601848661509L ^ var2_2));
                v5[CP_Xi.a("e", (int)13704, (long)(4675079900173688680L ^ var2_2))] = (byte)CP_Xi.a("e", (int)20959, (long)(3189846586861435767L ^ var2_2));
                v5[CP_Xi.a("e", (int)1065, (long)(3464200785447317202L ^ var2_2))] = (byte)CP_Xi.a("e", (int)20959, (long)(3189846586861435767L ^ var2_2));
                v5[CP_Xi.a("e", (int)21383, (long)(6452534191985998137L ^ var2_2))] = (byte)CP_Xi.a("e", (int)20959, (long)(3189846586861435767L ^ var2_2));
                v5[CP_Xi.a("e", (int)18342, (long)(2080533931275562406L ^ var2_2))] = (byte)CP_Xi.a("e", (int)28282, (long)(8694723165754131544L ^ var2_2));
                v5[CP_Xi.a("e", (int)4331, (long)(2564274401389607597L ^ var2_2))] = (byte)CP_Xi.a("e", (int)28182, (long)(1983252716589941970L ^ var2_2));
                v5[CP_Xi.a("e", (int)14876, (long)(1793437122784776265L ^ var2_2))] = (byte)CP_Xi.a("e", (int)10285, (long)(5169468941452722729L ^ var2_2));
                v5[CP_Xi.a("e", (int)15530, (long)(5217825419847325278L ^ var2_2))] = (byte)CP_Xi.a("e", (int)5463, (long)(549279686141771429L ^ var2_2));
                v5[CP_Xi.a("e", (int)4575, (long)(7311996423586544524L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4337, (long)(5901434537836182209L ^ var2_2));
                v5[CP_Xi.a("e", (int)31219, (long)(2900613318267802484L ^ var2_2))] = (byte)CP_Xi.a("e", (int)16616, (long)(5814566714016377540L ^ var2_2));
                v5[CP_Xi.a("e", (int)15950, (long)(6832065587104863322L ^ var2_2))] = (byte)CP_Xi.a("e", (int)23368, (long)(8815387560797319515L ^ var2_2));
                v5[CP_Xi.a("e", (int)15667, (long)(7441457365004539706L ^ var2_2))] = (byte)CP_Xi.a("e", (int)20462, (long)(4969913704016029026L ^ var2_2));
                v5[CP_Xi.a("e", (int)31022, (long)(1019582571207332625L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4337, (long)(5901434537836182209L ^ var2_2));
                v5[CP_Xi.a("e", (int)2581, (long)(6292447044134658147L ^ var2_2))] = (byte)CP_Xi.a("e", (int)12357, (long)(3853204267795274382L ^ var2_2));
                v5[CP_Xi.a("e", (int)11465, (long)(4955947899353974377L ^ var2_2))] = (byte)CP_Xi.a("e", (int)30180, (long)(5137414870813089631L ^ var2_2));
                v5[CP_Xi.a("e", (int)690, (long)(5626294806279481430L ^ var2_2))] = (byte)CP_Xi.a("e", (int)31159, (long)(166044399857505218L ^ var2_2));
                v5[CP_Xi.a("e", (int)32532, (long)(4111155897841292531L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2080, (long)(7959527522082677419L ^ var2_2));
                v5[CP_Xi.a("e", (int)8553, (long)(1717682320451947346L ^ var2_2))] = (byte)CP_Xi.a("e", (int)9292, (long)(8653726563933572819L ^ var2_2));
                v5[CP_Xi.a("e", (int)7427, (long)(8305613804252985181L ^ var2_2))] = (byte)CP_Xi.a("e", (int)30180, (long)(5137414870813089631L ^ var2_2));
                v5[CP_Xi.a("e", (int)12322, (long)(4089120494539594351L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2080, (long)(7959527522082677419L ^ var2_2));
                v5[CP_Xi.a("e", (int)14537, (long)(3216148020673401370L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25444, (long)(6969411035556284909L ^ var2_2));
                v5[CP_Xi.a("e", (int)12293, (long)(6011912964253407900L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4337, (long)(5901434537836182209L ^ var2_2));
                v5[CP_Xi.a("e", (int)12058, (long)(659918460909667677L ^ var2_2))] = (byte)CP_Xi.a("e", (int)22876, (long)(656597332116517732L ^ var2_2));
                v5[CP_Xi.a("e", (int)4337, (long)(5901434537836182209L ^ var2_2))] = (byte)CP_Xi.a("e", (int)7473, (long)(5673898401117271936L ^ var2_2));
                v5[CP_Xi.a("e", (int)29332, (long)(2906568968768002083L ^ var2_2))] = (byte)CP_Xi.a("e", (int)9292, (long)(8653726563933572819L ^ var2_2));
                v5[CP_Xi.a("e", (int)20959, (long)(3189846586861435767L ^ var2_2))] = (byte)CP_Xi.a("e", (int)3745, (long)(4740374598172337497L ^ var2_2));
                v5[CP_Xi.a("e", (int)14485, (long)(4234921805090509435L ^ var2_2))] = (byte)CP_Xi.a("e", (int)5463, (long)(549279686141771429L ^ var2_2));
                v5[CP_Xi.a("e", (int)28282, (long)(8694723165754131544L ^ var2_2))] = (byte)CP_Xi.a("e", (int)7975, (long)(2636036213486253348L ^ var2_2));
                v5[CP_Xi.a("e", (int)23622, (long)(4065111601848661509L ^ var2_2))] = (byte)CP_Xi.a("e", (int)22990, (long)(6762694816586445569L ^ var2_2));
                v5[CP_Xi.a("e", (int)6461, (long)(4415416364193444843L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4950, (long)(6346995393325103603L ^ var2_2));
                v5[CP_Xi.a("e", (int)29547, (long)(1582269169266104648L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2080, (long)(7959527522082677419L ^ var2_2));
                v5[CP_Xi.a("e", (int)3784, (long)(6782085024847422663L ^ var2_2))] = (byte)CP_Xi.a("e", (int)10753, (long)(6639782857154379841L ^ var2_2));
                v5[CP_Xi.a("e", (int)19968, (long)(8401803988226450470L ^ var2_2))] = (byte)CP_Xi.a("e", (int)27964, (long)(1602657110192621440L ^ var2_2));
                v5[CP_Xi.a("e", (int)17115, (long)(7353793813743872250L ^ var2_2))] = (byte)CP_Xi.a("e", (int)22990, (long)(6762694816586445569L ^ var2_2));
                var6_15 = v5;
                var7_22 = new ArrayList<Byte>();
                var8_29 = var6_15;
                var9_36 = var8_29.length;
                for (var10_43 = 0; var10_43 < var9_36; ++var10_43) {
                    var11_50 = var8_29[var10_43];
                    var7_22.add((byte)(var11_50 + var5_8 * var5_8 / 5));
                    if (var4_3 == null) {
                        if (var4_3 == null) continue;
                    }
                    ** GOTO lbl380
                }
                var8_29 = new byte[var7_22.size()];
lbl380:
                // 3 sources

                for (var9_36 = 0; var9_36 < var7_22.size(); ++var9_36) {
                    var8_29[var9_36] = (Byte)var7_22.get(var9_36);
                    if (var4_3 == null) continue;
                }
                return new String(var8_29);
            }
            case 5: {
                var5_9 = CP_Xi.a("e", (int)6639, (long)(4649643829837460355L ^ var2_2));
                v6 = new byte[CP_Xi.a("e", (int)7634, (long)(4414581421419591443L ^ var2_2))];
                v6[0] = (byte)CP_Xi.a("e", (int)14876, (long)(1793437122784776265L ^ var2_2));
                v6[1] = (byte)CP_Xi.a("e", (int)19059, (long)(8178304132454555773L ^ var2_2));
                v6[2] = (byte)CP_Xi.a("e", (int)13937, (long)(5230137501514685503L ^ var2_2));
                v6[3] = (byte)CP_Xi.a("e", (int)18342, (long)(2080533931275562406L ^ var2_2));
                v6[4] = (byte)CP_Xi.a("e", (int)4314, (long)(1245286444249447117L ^ var2_2));
                v6[5] = (byte)CP_Xi.a("e", (int)18979, (long)(7354663219081355515L ^ var2_2));
                v6[CP_Xi.a("e", (int)25742, (long)(6169353394711727998L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21383, (long)(6452534191985998137L ^ var2_2));
                v6[CP_Xi.a("e", (int)6649, (long)(5031411463299625495L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2542, (long)(7888619558497149902L ^ var2_2));
                v6[CP_Xi.a("e", (int)6203, (long)(4965675306903368336L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4331, (long)(2564274401389607597L ^ var2_2));
                v6[CP_Xi.a("e", (int)12667, (long)(3763243393084087180L ^ var2_2))] = (byte)CP_Xi.a("e", (int)17768, (long)(3001531738371534845L ^ var2_2));
                v6[CP_Xi.a("e", (int)20405, (long)(1598304216413906399L ^ var2_2))] = (byte)CP_Xi.a("e", (int)1885, (long)(7360662213573373313L ^ var2_2));
                v6[CP_Xi.a("e", (int)21250, (long)(3106236148750465491L ^ var2_2))] = (byte)CP_Xi.a("e", (int)20060, (long)(4101869106519843891L ^ var2_2));
                v6[CP_Xi.a("e", (int)7764, (long)(1246707686798750790L ^ var2_2))] = (byte)CP_Xi.a("e", (int)15530, (long)(5217825419847325278L ^ var2_2));
                v6[CP_Xi.a("e", (int)18410, (long)(1345759717078642108L ^ var2_2))] = (byte)CP_Xi.a("e", (int)18342, (long)(2080533931275562406L ^ var2_2));
                v6[CP_Xi.a("e", (int)14081, (long)(6466883634968419726L ^ var2_2))] = (byte)CP_Xi.a("e", (int)18342, (long)(2080533931275562406L ^ var2_2));
                v6[CP_Xi.a("e", (int)29938, (long)(529051802656448264L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4331, (long)(2564274401389607597L ^ var2_2));
                v6[CP_Xi.a("e", (int)30680, (long)(3989335127609580594L ^ var2_2))] = (byte)CP_Xi.a("e", (int)18342, (long)(2080533931275562406L ^ var2_2));
                v6[CP_Xi.a("e", (int)12167, (long)(6746034038308062331L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4331, (long)(2564274401389607597L ^ var2_2));
                v6[CP_Xi.a("e", (int)28713, (long)(7726598599955782204L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4314, (long)(1245286444249447117L ^ var2_2));
                v6[CP_Xi.a("e", (int)30694, (long)(4503521450985135411L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2542, (long)(7888619558497149902L ^ var2_2));
                v6[CP_Xi.a("e", (int)23694, (long)(3396202931439515150L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2440, (long)(4384757382717989698L ^ var2_2));
                v6[CP_Xi.a("e", (int)6809, (long)(4896684482828464248L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2542, (long)(7888619558497149902L ^ var2_2));
                v6[CP_Xi.a("e", (int)20595, (long)(971473643595545314L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21383, (long)(6452534191985998137L ^ var2_2));
                v6[CP_Xi.a("e", (int)23497, (long)(444717945090355555L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4331, (long)(2564274401389607597L ^ var2_2));
                v6[CP_Xi.a("e", (int)13704, (long)(4675079900173688680L ^ var2_2))] = (byte)CP_Xi.a("e", (int)20060, (long)(4101869106519843891L ^ var2_2));
                v6[CP_Xi.a("e", (int)1065, (long)(3464200785447317202L ^ var2_2))] = (byte)CP_Xi.a("e", (int)14678, (long)(2014886689534170062L ^ var2_2));
                v6[CP_Xi.a("e", (int)21383, (long)(6452534191985998137L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4314, (long)(1245286444249447117L ^ var2_2));
                v6[CP_Xi.a("e", (int)18342, (long)(2080533931275562406L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4314, (long)(1245286444249447117L ^ var2_2));
                v6[CP_Xi.a("e", (int)4331, (long)(2564274401389607597L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4314, (long)(1245286444249447117L ^ var2_2));
                v6[CP_Xi.a("e", (int)14876, (long)(1793437122784776265L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2542, (long)(7888619558497149902L ^ var2_2));
                v6[CP_Xi.a("e", (int)15530, (long)(5217825419847325278L ^ var2_2))] = (byte)CP_Xi.a("e", (int)7984, (long)(5344252754730874065L ^ var2_2));
                v6[CP_Xi.a("e", (int)4575, (long)(7311996423586544524L ^ var2_2))] = (byte)CP_Xi.a("e", (int)690, (long)(5626294806279481430L ^ var2_2));
                v6[CP_Xi.a("e", (int)31219, (long)(2900613318267802484L ^ var2_2))] = (byte)CP_Xi.a("e", (int)15530, (long)(5217825419847325278L ^ var2_2));
                v6[CP_Xi.a("e", (int)15950, (long)(6832065587104863322L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21163, (long)(1137461206668392779L ^ var2_2));
                v6[CP_Xi.a("e", (int)15667, (long)(7441457365004539706L ^ var2_2))] = (byte)CP_Xi.a("e", (int)32532, (long)(4111155897841292531L ^ var2_2));
                v6[CP_Xi.a("e", (int)31022, (long)(1019582571207332625L ^ var2_2))] = (byte)CP_Xi.a("e", (int)15667, (long)(7441457365004539706L ^ var2_2));
                v6[CP_Xi.a("e", (int)2581, (long)(6292447044134658147L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2581, (long)(6292447044134658147L ^ var2_2));
                v6[CP_Xi.a("e", (int)11465, (long)(4955947899353974377L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21163, (long)(1137461206668392779L ^ var2_2));
                v6[CP_Xi.a("e", (int)690, (long)(5626294806279481430L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4575, (long)(7311996423586544524L ^ var2_2));
                v6[CP_Xi.a("e", (int)32532, (long)(4111155897841292531L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21383, (long)(6452534191985998137L ^ var2_2));
                v6[CP_Xi.a("e", (int)8553, (long)(1717682320451947346L ^ var2_2))] = (byte)CP_Xi.a("e", (int)12293, (long)(6011912964253407900L ^ var2_2));
                v6[CP_Xi.a("e", (int)7427, (long)(8305613804252985181L ^ var2_2))] = (byte)CP_Xi.a("e", (int)12058, (long)(659918460909667677L ^ var2_2));
                v6[CP_Xi.a("e", (int)12322, (long)(4089120494539594351L ^ var2_2))] = (byte)CP_Xi.a("e", (int)690, (long)(5626294806279481430L ^ var2_2));
                v6[CP_Xi.a("e", (int)14537, (long)(3216148020673401370L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21383, (long)(6452534191985998137L ^ var2_2));
                v6[CP_Xi.a("e", (int)12293, (long)(6011912964253407900L ^ var2_2))] = (byte)CP_Xi.a("e", (int)12058, (long)(659918460909667677L ^ var2_2));
                v6[CP_Xi.a("e", (int)12058, (long)(659918460909667677L ^ var2_2))] = (byte)CP_Xi.a("e", (int)15950, (long)(6832065587104863322L ^ var2_2));
                v6[CP_Xi.a("e", (int)4337, (long)(5901434537836182209L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21163, (long)(1137461206668392779L ^ var2_2));
                v6[CP_Xi.a("e", (int)29332, (long)(2906568968768002083L ^ var2_2))] = (byte)CP_Xi.a("e", (int)6649, (long)(5031411463299625495L ^ var2_2));
                v6[CP_Xi.a("e", (int)20959, (long)(3189846586861435767L ^ var2_2))] = (byte)CP_Xi.a("e", (int)4337, (long)(5901434537836182209L ^ var2_2));
                v6[CP_Xi.a("e", (int)14485, (long)(4234921805090509435L ^ var2_2))] = (byte)CP_Xi.a("e", (int)690, (long)(5626294806279481430L ^ var2_2));
                v6[CP_Xi.a("e", (int)28282, (long)(8694723165754131544L ^ var2_2))] = (byte)CP_Xi.a("e", (int)18342, (long)(2080533931275562406L ^ var2_2));
                v6[CP_Xi.a("e", (int)23622, (long)(4065111601848661509L ^ var2_2))] = (byte)CP_Xi.a("e", (int)15530, (long)(5217825419847325278L ^ var2_2));
                v6[CP_Xi.a("e", (int)6461, (long)(4415416364193444843L ^ var2_2))] = (byte)CP_Xi.a("e", (int)14537, (long)(3216148020673401370L ^ var2_2));
                v6[CP_Xi.a("e", (int)29547, (long)(1582269169266104648L ^ var2_2))] = (byte)CP_Xi.a("e", (int)12293, (long)(6011912964253407900L ^ var2_2));
                v6[CP_Xi.a("e", (int)3784, (long)(6782085024847422663L ^ var2_2))] = (byte)CP_Xi.a("e", (int)14081, (long)(6466883634968419726L ^ var2_2));
                v6[CP_Xi.a("e", (int)19968, (long)(8401803988226450470L ^ var2_2))] = (byte)CP_Xi.a("e", (int)12058, (long)(659918460909667677L ^ var2_2));
                v6[CP_Xi.a("e", (int)17115, (long)(7353793813743872250L ^ var2_2))] = (byte)CP_Xi.a("e", (int)15667, (long)(7441457365004539706L ^ var2_2));
                v6[CP_Xi.a("e", (int)8870, (long)(882607154389829824L ^ var2_2))] = (byte)CP_Xi.a("e", (int)11465, (long)(4955947899353974377L ^ var2_2));
                v6[CP_Xi.a("e", (int)6849, (long)(1650660386018193701L ^ var2_2))] = (byte)CP_Xi.a("e", (int)12293, (long)(6011912964253407900L ^ var2_2));
                var6_16 = v6;
                var7_23 = new ArrayList<Byte>();
                var8_30 = var6_16;
                var9_37 = var8_30.length;
                for (var10_44 = 0; var10_44 < var9_37; ++var10_44) {
                    var11_51 = var8_30[var10_44];
                    var7_23.add((byte)(var11_51 + var5_9 * var5_9 / 5));
                    if (var4_3 == null) {
                        if (var4_3 == null) continue;
                    }
                    ** GOTO lbl458
                }
                var8_30 = new byte[var7_23.size()];
lbl458:
                // 3 sources

                for (var9_37 = 0; var9_37 < var7_23.size(); ++var9_37) {
                    var8_30[var9_37] = (Byte)var7_23.get(var9_37);
                    if (var4_3 == null) continue;
                }
                return new String(var8_30);
            }
            case 6: {
                var5_10 = CP_Xi.a("e", (int)16874, (long)(6112927466026249099L ^ var2_2));
                v7 = new byte[CP_Xi.a("e", (int)4656, (long)(3870942089408608288L ^ var2_2))];
                v7[0] = (byte)CP_Xi.a("e", (int)8819, (long)(2202533583869462753L ^ var2_2));
                v7[1] = (byte)CP_Xi.a("e", (int)21300, (long)(5512529185728575851L ^ var2_2));
                v7[2] = (byte)CP_Xi.a("e", (int)12037, (long)(7240278714489128331L ^ var2_2));
                v7[3] = (byte)CP_Xi.a("e", (int)22326, (long)(4735029630443732400L ^ var2_2));
                v7[4] = (byte)CP_Xi.a("e", (int)10520, (long)(8428803794869994320L ^ var2_2));
                v7[5] = (byte)CP_Xi.a("e", (int)25648, (long)(2015329031979568689L ^ var2_2));
                v7[CP_Xi.a("e", (int)25742, (long)(6169353394711727998L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25745, (long)(8337901500990754497L ^ var2_2));
                v7[CP_Xi.a("e", (int)6649, (long)(5031411463299625495L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25850, (long)(8028216424705920767L ^ var2_2));
                v7[CP_Xi.a("e", (int)6203, (long)(4965675306903368336L ^ var2_2))] = (byte)CP_Xi.a("e", (int)27323, (long)(5598502875150287193L ^ var2_2));
                v7[CP_Xi.a("e", (int)12667, (long)(3763243393084087180L ^ var2_2))] = (byte)CP_Xi.a("e", (int)32411, (long)(3050008834436175220L ^ var2_2));
                v7[CP_Xi.a("e", (int)20405, (long)(1598304216413906399L ^ var2_2))] = (byte)CP_Xi.a("e", (int)23277, (long)(8981800604132323471L ^ var2_2));
                v7[CP_Xi.a("e", (int)21250, (long)(3106236148750465491L ^ var2_2))] = (byte)CP_Xi.a("e", (int)23277, (long)(8981800604132323471L ^ var2_2));
                v7[CP_Xi.a("e", (int)7764, (long)(1246707686798750790L ^ var2_2))] = (byte)CP_Xi.a("e", (int)19094, (long)(8710709592693317992L ^ var2_2));
                v7[CP_Xi.a("e", (int)18410, (long)(1345759717078642108L ^ var2_2))] = (byte)CP_Xi.a("e", (int)11329, (long)(4084050779344127911L ^ var2_2));
                v7[CP_Xi.a("e", (int)14081, (long)(6466883634968419726L ^ var2_2))] = (byte)CP_Xi.a("e", (int)11329, (long)(4084050779344127911L ^ var2_2));
                v7[CP_Xi.a("e", (int)29938, (long)(529051802656448264L ^ var2_2))] = (byte)CP_Xi.a("e", (int)27323, (long)(5598502875150287193L ^ var2_2));
                v7[CP_Xi.a("e", (int)30680, (long)(3989335127609580594L ^ var2_2))] = (byte)CP_Xi.a("e", (int)11329, (long)(4084050779344127911L ^ var2_2));
                v7[CP_Xi.a("e", (int)12167, (long)(6746034038308062331L ^ var2_2))] = (byte)CP_Xi.a("e", (int)27323, (long)(5598502875150287193L ^ var2_2));
                v7[CP_Xi.a("e", (int)28713, (long)(7726598599955782204L ^ var2_2))] = (byte)CP_Xi.a("e", (int)15789, (long)(1758066520330852110L ^ var2_2));
                v7[CP_Xi.a("e", (int)30694, (long)(4503521450985135411L ^ var2_2))] = (byte)CP_Xi.a("e", (int)16349, (long)(548910565162177880L ^ var2_2));
                v7[CP_Xi.a("e", (int)23694, (long)(3396202931439515150L ^ var2_2))] = (byte)CP_Xi.a("e", (int)29488, (long)(7381799645223131505L ^ var2_2));
                v7[CP_Xi.a("e", (int)6809, (long)(4896684482828464248L ^ var2_2))] = (byte)CP_Xi.a("e", (int)16349, (long)(548910565162177880L ^ var2_2));
                v7[CP_Xi.a("e", (int)20595, (long)(971473643595545314L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25745, (long)(8337901500990754497L ^ var2_2));
                v7[CP_Xi.a("e", (int)23497, (long)(444717945090355555L ^ var2_2))] = (byte)CP_Xi.a("e", (int)27323, (long)(5598502875150287193L ^ var2_2));
                v7[CP_Xi.a("e", (int)13704, (long)(4675079900173688680L ^ var2_2))] = (byte)CP_Xi.a("e", (int)23277, (long)(8981800604132323471L ^ var2_2));
                v7[CP_Xi.a("e", (int)1065, (long)(3464200785447317202L ^ var2_2))] = (byte)CP_Xi.a("e", (int)6012, (long)(8087840709757238601L ^ var2_2));
                v7[CP_Xi.a("e", (int)21383, (long)(6452534191985998137L ^ var2_2))] = (byte)CP_Xi.a("e", (int)15789, (long)(1758066520330852110L ^ var2_2));
                v7[CP_Xi.a("e", (int)18342, (long)(2080533931275562406L ^ var2_2))] = (byte)CP_Xi.a("e", (int)15789, (long)(1758066520330852110L ^ var2_2));
                v7[CP_Xi.a("e", (int)4331, (long)(2564274401389607597L ^ var2_2))] = (byte)CP_Xi.a("e", (int)15789, (long)(1758066520330852110L ^ var2_2));
                v7[CP_Xi.a("e", (int)14876, (long)(1793437122784776265L ^ var2_2))] = (byte)CP_Xi.a("e", (int)16349, (long)(548910565162177880L ^ var2_2));
                v7[CP_Xi.a("e", (int)15530, (long)(5217825419847325278L ^ var2_2))] = (byte)CP_Xi.a("e", (int)5544, (long)(1026788659140427328L ^ var2_2));
                v7[CP_Xi.a("e", (int)4575, (long)(7311996423586544524L ^ var2_2))] = 3;
                v7[CP_Xi.a("e", (int)31219, (long)(2900613318267802484L ^ var2_2))] = (byte)CP_Xi.a("e", (int)15372, (long)(1254400947301865190L ^ var2_2));
                v7[CP_Xi.a("e", (int)15950, (long)(6832065587104863322L ^ var2_2))] = (byte)CP_Xi.a("e", (int)16612, (long)(1390683980785396352L ^ var2_2));
                v7[CP_Xi.a("e", (int)15667, (long)(7441457365004539706L ^ var2_2))] = 4;
                v7[CP_Xi.a("e", (int)31022, (long)(1019582571207332625L ^ var2_2))] = -1;
                v7[CP_Xi.a("e", (int)2581, (long)(6292447044134658147L ^ var2_2))] = 1;
                v7[CP_Xi.a("e", (int)11465, (long)(4955947899353974377L ^ var2_2))] = (byte)CP_Xi.a("e", (int)886, (long)(5818295025712326963L ^ var2_2));
                v7[CP_Xi.a("e", (int)690, (long)(5626294806279481430L ^ var2_2))] = (byte)CP_Xi.a("e", (int)1705, (long)(7348786986283429068L ^ var2_2));
                v7[CP_Xi.a("e", (int)32532, (long)(4111155897841292531L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25745, (long)(8337901500990754497L ^ var2_2));
                v7[CP_Xi.a("e", (int)8553, (long)(1717682320451947346L ^ var2_2))] = (byte)CP_Xi.a("e", (int)12667, (long)(3763243393084087180L ^ var2_2));
                v7[CP_Xi.a("e", (int)7427, (long)(8305613804252985181L ^ var2_2))] = (byte)CP_Xi.a("e", (int)20405, (long)(1598304216413906399L ^ var2_2));
                v7[CP_Xi.a("e", (int)12322, (long)(4089120494539594351L ^ var2_2))] = 3;
                v7[CP_Xi.a("e", (int)14537, (long)(3216148020673401370L ^ var2_2))] = (byte)CP_Xi.a("e", (int)25745, (long)(8337901500990754497L ^ var2_2));
                v7[CP_Xi.a("e", (int)12293, (long)(6011912964253407900L ^ var2_2))] = (byte)CP_Xi.a("e", (int)20405, (long)(1598304216413906399L ^ var2_2));
                v7[CP_Xi.a("e", (int)12058, (long)(659918460909667677L ^ var2_2))] = (byte)CP_Xi.a("e", (int)5674, (long)(3925811669320301652L ^ var2_2));
                v7[CP_Xi.a("e", (int)4337, (long)(5901434537836182209L ^ var2_2))] = (byte)CP_Xi.a("e", (int)886, (long)(5818295025712326963L ^ var2_2));
                v7[CP_Xi.a("e", (int)29332, (long)(2906568968768002083L ^ var2_2))] = (byte)CP_Xi.a("e", (int)20290, (long)(5600575172985365944L ^ var2_2));
                v7[CP_Xi.a("e", (int)20959, (long)(3189846586861435767L ^ var2_2))] = (byte)CP_Xi.a("e", (int)21250, (long)(3106236148750465491L ^ var2_2));
                v7[CP_Xi.a("e", (int)14485, (long)(4234921805090509435L ^ var2_2))] = 3;
                v7[CP_Xi.a("e", (int)28282, (long)(8694723165754131544L ^ var2_2))] = (byte)CP_Xi.a("e", (int)11329, (long)(4084050779344127911L ^ var2_2));
                v7[CP_Xi.a("e", (int)23622, (long)(4065111601848661509L ^ var2_2))] = (byte)CP_Xi.a("e", (int)15372, (long)(1254400947301865190L ^ var2_2));
                v7[CP_Xi.a("e", (int)6461, (long)(4415416364193444843L ^ var2_2))] = (byte)CP_Xi.a("e", (int)6203, (long)(4965675306903368336L ^ var2_2));
                v7[CP_Xi.a("e", (int)29547, (long)(1582269169266104648L ^ var2_2))] = (byte)CP_Xi.a("e", (int)12667, (long)(3763243393084087180L ^ var2_2));
                v7[CP_Xi.a("e", (int)3784, (long)(6782085024847422663L ^ var2_2))] = (byte)CP_Xi.a("e", (int)2542, (long)(7888619558497149902L ^ var2_2));
                v7[CP_Xi.a("e", (int)19968, (long)(8401803988226450470L ^ var2_2))] = (byte)CP_Xi.a("e", (int)20405, (long)(1598304216413906399L ^ var2_2));
                v7[CP_Xi.a("e", (int)17115, (long)(7353793813743872250L ^ var2_2))] = -1;
                v7[CP_Xi.a("e", (int)8870, (long)(882607154389829824L ^ var2_2))] = 2;
                v7[CP_Xi.a("e", (int)6849, (long)(1650660386018193701L ^ var2_2))] = (byte)CP_Xi.a("e", (int)12667, (long)(3763243393084087180L ^ var2_2));
                var6_17 = v7;
                var7_24 = new ArrayList<Byte>();
                var8_31 = var6_17;
                var9_38 = var8_31.length;
                for (var10_45 = 0; var10_45 < var9_38; ++var10_45) {
                    var11_52 = var8_31[var10_45];
                    var7_24.add((byte)(var11_52 + var5_10 * var5_10 / 5));
                    if (var4_3 == null) {
                        if (var4_3 == null) continue;
                    }
                    ** GOTO lbl536
                }
                var8_31 = new byte[var7_24.size()];
lbl536:
                // 3 sources

                for (var9_38 = 0; var9_38 < var7_24.size(); ++var9_38) {
                    var8_31[var9_38] = (Byte)var7_24.get(var9_38);
                    if (var4_3 == null) continue;
                }
                return new String(var8_31);
            }
        }
        return null;
    }

    static /* synthetic */ int CP_j(CP_Xi ilIlXi) {
        return ilIlXi.CP_m++;
    }

    static /* synthetic */ int CP_G(CP_Xi ilIlXi, int n) {
        ilIlXi.CP_m = n;
        return ilIlXi.CP_m;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    block11: {
                        CP_Xi.a = CP_s.a(4762174929352856769L, -2261634204260692187L, MethodHandles.lookup().lookupClass()).a(111745084728323L);
                        CP_Xi.d = new HashMap<K, V>(13);
                        var11 = CP_Xi.a ^ 30379943277311L;
                        var13_1 = Cipher.getInstance("DES/CBC/NoPadding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var19_3 = new long[291];
                        var16_4 = 0;
                        var17_5 = "d\u00dd,\u00e1Z\u00884=*'\u0004_\u00b7u7(\u00ad\u00bb\u00d9\u000b\u00fe\u00cf\u00a9\u0089h-N7\u001a\u00d8nUOS\u00cbt\u00ee\u0012\u00de\u00ca\u00de\f\u009b\u00cc\u00aa\u00e4\u00b1Z\r\\\u0011\n\u0085\u008f\u0003\u00fcF\u001a\u00f6\u0082,Oa\b\u00de\u0099\u001d\u00e04\u00cb\u00da\u00b3n\u00eb\u00ea\u00fe\u00e2\u008b+~\u0014\u0096\u00bd\u0095^<\u00c0\u00d4\u00c7?\u00fa\u00d7W\u000f\u00b4Mt\u00bc\u00b2\u00acJ\u00bb\u00f6\u0097DS\u00a2\u0084+\u00c3\u0007\u0083\u00f7\u00bf,\u00de)\u001d\u00e5\t'a\u00c9\u0006\u00a7\u001d\u0080\t2_\u00e3w\u0010\u0085\u00e0\u00e9N\u00fc\u00c8\u001f_z\u00c7E\u00ff~SI\u00b2\u001b\u0090\u008ffE@\u00fd\u00ac\u00a8\u00a4N:\u0095\u00dbD\u00ba\u00d7\u00e18\u009d\\\u00e4\u00ecK4\u0081E\u0002\u00bd\u00eb_\u00da\u008f=\u0090\u0004\u00eb\u00b1<o`I\u00a5B\u00ac\u00cc\u00c5Cv\u0099\u00b3S\u0086g\u00db\u00d6P\u00c8\u00a2\u008a\u009eY\u009d\u00ec\u00ca/\u00b4\u00b0U\u0094\u00ea^\u00b3\u00ba}\u0087\u0081If+\u00bd!)\u00cep\u00a24xQ\u0092\u00c7\u00d9\u00e1#N\u001f\u00a7v(\u00d1>\u00daV\u00b3O\u0094\u0017\u00acjg\n\u00c7\u00dc\u00f9rjcXHMM(\u009d\u00f6+\u00b5\u00e8&\u0016\u001b\u00c7\u001e\u0081<M\u00ce\u00d3\u00c2\u00ac\u00e5\u001b\u0012\u00a2Gd\u00a1S\b\u00be\u0010`H\u00f6\u0015B\u00f5\u00b4\"\u00b1\u00adM\u001a\u009a\u00a7\u00fd\u0098\u00bc\u001f#\u000bG\u00ba\u00d7\u00ec\u0011l\u00ca#\u00e5\u00f5\u00bd\u000f6\u00e6\u00e4\u00f4\u008cbh\u00c1cN\u00df\u00a2\u00d1\u00f1\u00ec\u00a7W\u00e8\u00cd\u00bd\u0084\u00a9|\u00de\u0092z\u0015\u00f9\u0093\u00f5\u00da\u00f1nj\u00fb\u0000g\u00c06\u00d1\u008f\u00c1\u00d4\u00f7G\u00f9\u0098\u00bb(\u00a9\u00d3kR\u00d6\u00c0\u009b\u00f3\u00f9\u00e6u^\u00e3z\u00a7n\u0087\u00e3/\u00c8:\u00d7\u0092p\u008c\u00df\u00e8\u0092$\u0091Z\u0015\u008aB\u0099\u0082\u00bc\u0019\u0002\u00e7\u00e6\u00aa\u001d\u00c1<\u00ad \u00bfCJY\u0094\bJ\u001d\u00b8\u00f1\"\u00df\u00f5\u00f4\u00f2\u00b4\u001b\u00b5\u00adIU\u00ce\u0090\\m&\u00bf\u00d2\u00a7\u009fc#\u00a6\u0084\u0011\u00a1\u00f8\u00a1H^@\u00e7\u0097\u0016;\u00b8\u001e\u0092j\u0092\u00af\u00dc\u00ea\u00f7xM'\u00c4\u009cg\u00f8\u0015b\u00dd\u00c1\u00c7S\u0084\u0088\u007f\u00beE\u00fd\u00d1\u009b\u00eb\u00bf\u00ca\u00ee\u00b1\u008b\u00b5P\u00f7\u00db\u00df2D\u00eb\u009c\u0005R\u00a9\u00fa \u00c7\u00e6TS\u0097t\u00b8\u00cd\u00fd\u0085q\u00a4\u00e3LK\u00b5\u00c5Y\u00f0\u0099\u00b4\u00a4\u00f6\u00fb\u001bp\u0091\u0088\u0014\u00ab\u0007\u00e2\u0092\u00d7\u00eb\u00cf5#\u00a5\u00afV\u0089A\u009b9=\u00d8Z\u00b2\u001e\u00ee\u0018A\u00ed\u00b7\u0015\u008d'O9?)\u00a3\u0015\u00f39'\u001axhd\u0084\\\u00b5\u0096\u00eb\u00bb\u00d9\u001e\u00d9\u00b5Q\u0084;Z\u008f\u00fbz={\t\u00c5\u00da\u00da\u00e4\u008e\u00c6\u00aaj\u0006\u000e0\u00b9n\nW\u009b\u00a8\u0081J\u0089)AH\u0088\u00fdM\u00ce\u00f1\u00f0\u00d9\u00c1T\u00e7\u001d\u0091gH7\u0007,\u0010\u00e8o&\u00fc\u00a4\u0099<4\u008bR\\\u000e\u008d\u00be\u00dd\u00ed\u0012\u0014\u0014\u00dd$\u00ed \u00e4\u00b4\u00aa\u00cb\u0002\u00fc\u00e6s^O\u00ce\u00cd\u0013\u00bd\u00f0\u00a6M\u00c3`\u00d4\u0091H\u001d\u00d1\u0093`f&\u0092\u00d0\u00c3\u00f1\u00cd\u00b4\u00ba8\u0091\u0014B\u008f\u00b4\u00d3\u00de\u00c5\u001c\u0003\u008f\u00d5\u0010\u00b2h\u00fd\u00cd`00X@c\u0011\u00bb\u00f4\u00a4\u00bf\u009cY\u0012~ \u00cfy\u00d9\b@,\u00f7\u00dc\u00a1A\u0005u\u00a5e\u00fb\u00ce\u00bc]\u00a0\u00d7\u00de/E\u008c\u00e8m\u00e3c\u00cc\f\u008e\u0091^\u00e1\u001f\u00cb\u0093\u0099\u0019\u0090p\u00b3\u0003%R\u0007\u00a7@\u00a7P\u0001\u00bb\u00ee[\u00c0\u0005O\u00ff`\u00c4@i,\u009dV\u0087\f\u0002(\u00fa\u00a7\u0081\u00c1\u00fd\u00e2\u00f4S\u009c\u00cc\u007f\u0019\u00bf[[\u00a4I\u00d9\u00a0\u00e1\u00f4\u00e4\u008b\u00e39]\u00a8\u00ee\u00b4s|\u00f6Bzj=wa\u00ed,\u00c0\u00a1w\u00cb\u00e7\u00dcr\u00d82\u00ad\u00f5\u001dI\u00d90\u00a6bwF2\u00b6\u0099N\u00b7j{\u0083\u00fe\u0082\u00c7\u009e\u00ed\u00b6\u000e\u0014\u0087\u008a\u00e3\u00c8\u00eeeo\u0089\u00cf;\u00fce\u00dd\u00e8\u0080\u0010\u009d\u0086\u0003D\u00b1\u00e1\u00de}\u00ea\u009e1\u00ef79\u00d1\u00edYM\u00e3\u00d8\u00db\t\u0002\u00101\u0091%\u00d1,\u00cf7\u00e5\u00a8j@\u00ca\u0098\u0012\u00f2\u0014\u00b4\u00a2y\u008c\u001a\u008d\u00e2k\t\u00c6\u00fe\u0019#\u0006G\u00b6^\u0089\u00d1\u00af\u0004\rY\u0080z\u00f2\u00c8\u00b5\u00ab|$\u00d1\u0000\u00aa\u0090\u0004\u0082L\u0086\u0001I*\u0085%0\u0091&@\u0014d\u0084\u0094t\u00c3\u00c6\u00ed\u00ba\u00c8\u00bfwo8{\u00a5\u00bf\u00d5N\u008aU\u00d5/=N\u00c9\u00ec\u00b9\u00ef8\u0080\u00c7\u00ea\u00ddb\u0016\u0013:\u001a4\u009f\u00fb\u0003\u00c1v\u00b0\u00a3\u00cd\u00a6\u0011$\u000e-\u00fa\u00a7\u0001E\u00acU\u00c9\u008e\u00af<\u00eeYO\u0081\u00b0\u0082\u00f4\u00052d\u0000\u00bf\u00da[\u00c4\u00fdG\u00c8\u0080\u00f9\u00b6\u00ee\u0090X\u00aeWl|\u0084\nR\u0080\b0q\u008b\u00ae2\u0094\u008f\u00b4L0\u00da(B::\u00e20@r\u00ccz\u00b6H\u0097[\u0002\u0003XV\u00dcW\u0001\u00a56\u00fc\f\u00c6\u0097\u00e4\u00000 \u0015\u00dc\u000f\u00c4\u000b:\u00a0A\u00b7 3\u00eb\u00c9\u0000\u00fb}\\o\u00fd!\u00d9\u00a3:\u00e5\u009f\u00c7\u00eb\u00b9\u001f\u00da1m\u001f\u00d1%\u00d1\u00ce\u00c7\u00efM\u0013\u001dE\u00c4,Za3|\u00d0\u00cc-\u00df\u00ca\u00dd\u00c8\u00937\u0089\u001a+\u0080\u000b\u00f1I\u0097\u00d6N\u0099\u0089\u0095\u00d8D\u00f6\u0010*\u009b\u00aeNB\u0088\u00efyg\u00b5D\u00c9\u00ab\u00d9\u00e7\u00fe\u00f3\u0093\u0086\u00154#\u00fb\u00b0\u00f1\u00ca\u00ad\u009f\u00d5\u00c5S\u009e\\6\u00d1\u0014\u00e2\u00e21\u00b7+\u0090l\u0085\u00c5d\u00ea*\u00ad\u009b^\"\u00de\u0005\u00cam\u0081\u009bc\u0016sx\u001f\u00fd\t_(^\u00b80'\u0007\u00c5\u00f2i\u0006\u00d4\u00de\u00e0\u00ff\u00e1\u00c31\u008f\bJ\u00ad\u00a9\u009c\u00a9\u0088\u001a\u00eeJw\u00e3\u0084JK_\u000b\u00eaa\u00acP\u00f7f|\u00c5\u00da,\u00ef#\u00b2\u001aQ\u00be\u001a\u00ddm)\u00c0\u0081\u00c3W\u00df?C\u0002\u008e>\u00afYx\u008b\u00b2^\u00f5\u009f]cU03[8\u0097\u00a7B\u0015\u00ef}\u0002`_\u00c5\u0099)\u0004<v\u0019\u00fdf\u009dn\u00c2>\u001f\u00d2\t\u00f1[v\t\u00d3\u00a68dx\u00ebV\u000e\u0087cL\u00c0t\u0000M\u0093\u00cd\u00c1\u0013\u0098\u00f3\u00b8\u00e2%B\u0080T\u00bfH\t\rv\u00d4\u00ad7\u0084\u00a0~\u00af\u00cfZ\u00e5|q\u0000\u0084\u00a3\u00e3\u00f3\u00cf\u00bd\u00c0\n\u00a6\u0092\u0096\u00a3\u00fa\u00e3#Y\u00dd\u00b0\f\u00dad%\u00e5~\u00a0=aHnn\u00b6\u000eC1+b\u0086z\u00afw]\u00b9\u009e\u0011[\u00bb\u00b8'\u0095\u0088\u0018\u0003\u00bd\u0004\u00ea!\n\u009c\u00d1\u00da\u00ef=\u000b\u0097\u00e4\u00d5y)\u00e2\u0007r\u00a0\u00dd\u00f5\u0088\u00c7\n\u0092\u00ec\u00b9\u0015\u0000>\u0000$\u00fb\u00ba\u0084h\b\u00f5\u00c1\u0093\u00e6\u00ad\u001f\\\u00d70\u0092\u00fe>\u00aet(\u008cp\fX\u0001\u00cb\u00a9<\u00a7\u00b0Js\u00f7\u0089\u00c6%g\u00e9\u00d3$\u0011p\u00841\u0081\u00c0\u0019\u00cb\u00a7>\u00d6z\u00d7\u00c0\u0086{w\u00fe\u001d\u0019\u00f3\u00ec\u0005'\u00ff\u00b5-\u009aU\u0019}\u009d\u00c9I\u009a-fC\u0011k\u0017KQ\u0090\u00d1\u00fd\u009c\u00a2i\u007f\u0080\u001a:\u009a\u00e4\u00faEb\u00f6\u00e9\u0001\u0094)\u00dezXo6\u00fd\u00c1\u00dd\n\u007f38\u00bat\u001et\u00bc3\u00d7<\u00b0\u000e;w#\u00b8\u0012\u00e3\u00acy\t\u0003:y\u00fd\u00a3\u00ea\u001c\u00fb\u009d5\u00f5\u008b\u00e3\u00882\u00c9O\u008d{\u00c1\u0096\u0013\u0088\u00ec\u00c1\u0094\u00c6\u0017\u000e\u0093h\u00a9\u00c0\u00fd\u00b9\u00fd\u001c1}t\u00eel\u00d82\u00f5\u00b7\"\u00c5m4\u00a9\u0087h\u00c7\u00ce\u00fc\u00f8\u009aS\u0011\u008a\u00ecE%\u00ce\u0093{\u0019#\u00f4\u001fQX4\u00ce\u0007\f\u00cd\n\u009e=\u0080\u009fH\u0005\u00dd}\u00c2\u0081\u0089\u00c1i\u00a9l+\u008d}\u00cbn\u00f2\u00dd\u00e6\u00fc\u000f[\u00a63+\u0099\u00b9\u00e1X7~a\"^\u0085\u0081\u001eB\u009ej\u0096\u000fze2\u008b\u00de\u00eac\u0097\u00c2\u00f2\u00d4bn\u0093Ax\u00f3k&\u0092\u0083jX\u009f\u00f2\u008et\u0095\u0081S\u001b9\u00f2<\u00b5\u00e9\u00b7\u0083y%T\u00fd\u00c5%@\u00f9q[YC\u00e6;i)=+M6;\u00de\u0018\u00bf!\u00e8\u0085\u001c\u00ba\u00da6\u0012\u00d1\u00e6Tz\u0006\u00d9\b\u00b2\u00a5\u00d4\u0091Q\u001a\u0095\u00d8zo\u00e1\u00d1\u00f5\u0093\u00c9F\u008a\u00cdb\u0002G\u00e4\u009c^|U\u0090\u00d2O\u00a9\u0015}c_\u00e6\u00c2\u00f5R\u0081\u0010\u00fc\u00fc\u00aa\u00d9\u00d2-k\u00cd\u00ac/\u00c0\u00a0\u0089Vho~\u008d\u00eb\u00ac\u0095\u00a2\u008b\u0084[~\u0097\u0091 _\u00d5\u00cf\u00d5\u0001\u00e6X\u00a3\u0090\u00aa$E\r\u00fdI\u00bd\u00fe$\u0001\u00ce\u00cf\u007f\u0000\u00dd\u0007\u00ac\u008fz[\u0016\u0005\u00bb,p\u009d\u0094\u0004u\u00e4\u00e8]s\u00a9Cl\u0014\u0016\u0082C\u00c8\u0094\u00e2$\u00fe\u008a\u00d8\u009c\u00fa!\n[\u00c0\u008e1\u00a3\u00ac\u001d_\"4U\"\u00f5\u00b7\u00b4\"-h:\u00a7\u0080\u00dd\u0012$\u00f3\u00ff+{$\u00fa\u00eb%\u00bd\u00de\u00d7w\u00b4\u0092~\u000f}\u00a7z\u00b4\u0080w\u00a6\u0086\u00b78\u00ff9\u000b\u00aaoEL\u0014\u00d0\u00b3\"j\u001ae\u008fT\u001c\u009b8\u009f\u00a1bj5.\u00b2\u00fb$\u0087\u0015\u008f\u00db\u00cf\u0089\u00c5\u00a9\u00b3XQ-\u00d4~~\u00afb%1O\u00af\b|~3@\u0084\u00ea\u000ej\u00c8d\u00ddV\u00a0\u008e4\u0094\u00a4\u00d0V\u0096\u00b1\u00fd_\u00des>m\r\u001d\u00d6\tny~\u00fb\u00fb\u00f7\u00b5\u0013\u001e\u001c\u00d6I\u00cb\u00d4\u00f0=3\u00c0*3\u0089\u00d8\u00f37JB~l\u00ecM\u009c|a\u00b3\u009bA\u00e4\u0086\u00bet\u0012\u0085D\u001c\u0007\u009e\u0017I\u0007\u00f6\u009c4\u00ee\u00e1X\u001e\u00c4:\u00b2\u00a05,@\u00abK\u001d-\f\u00b8\u00ea\u0010\u00ea9-\u00a4\u00b6F\u00e9\u00b0\u00c2\u00deD\u007f\u009b\u00aa\u0097m\u00c6\u001a/p\u00ea$\u0006\u00adq\b\u00e3\u00ad\u00c3\u00de>\u00eb#\u00a3-E-\u00a3\u008f$\u00f2\u008f\u00e4\u00c8g\u00b8\u0081\u00de\u001e5D\u00f2\u00b4>\u00d7L]\u00c1\u00a5\u0091\u001b\u007f\u001a\u00cc\u00e8\u00d6E'\u00c40\u00da\u00beO\u0013\u00b8DH\u00cd\u00f4*\u0017\r\u00f4\u00b5\u00c8\u00bf\u00cdE\u0004\u00d1W\u00f8\u00ac\u00b1\u00cd\u00e1\u00e7\u00e3\u0091\u00bb\u00b1\u0097\u0083\u001b\u0097\u00b4\u00d0\u00b89\u00b9\u00ea\u0083\u009b\u001b\u0005\u00d0\u0092\u0081Z\u00dawU;\u0099f\u00d4\u00ce\u00bc\u00fb\u00c4\u000b\u0003\u00a3";
                        var18_6 = "d\u00dd,\u00e1Z\u00884=*'\u0004_\u00b7u7(\u00ad\u00bb\u00d9\u000b\u00fe\u00cf\u00a9\u0089h-N7\u001a\u00d8nUOS\u00cbt\u00ee\u0012\u00de\u00ca\u00de\f\u009b\u00cc\u00aa\u00e4\u00b1Z\r\\\u0011\n\u0085\u008f\u0003\u00fcF\u001a\u00f6\u0082,Oa\b\u00de\u0099\u001d\u00e04\u00cb\u00da\u00b3n\u00eb\u00ea\u00fe\u00e2\u008b+~\u0014\u0096\u00bd\u0095^<\u00c0\u00d4\u00c7?\u00fa\u00d7W\u000f\u00b4Mt\u00bc\u00b2\u00acJ\u00bb\u00f6\u0097DS\u00a2\u0084+\u00c3\u0007\u0083\u00f7\u00bf,\u00de)\u001d\u00e5\t'a\u00c9\u0006\u00a7\u001d\u0080\t2_\u00e3w\u0010\u0085\u00e0\u00e9N\u00fc\u00c8\u001f_z\u00c7E\u00ff~SI\u00b2\u001b\u0090\u008ffE@\u00fd\u00ac\u00a8\u00a4N:\u0095\u00dbD\u00ba\u00d7\u00e18\u009d\\\u00e4\u00ecK4\u0081E\u0002\u00bd\u00eb_\u00da\u008f=\u0090\u0004\u00eb\u00b1<o`I\u00a5B\u00ac\u00cc\u00c5Cv\u0099\u00b3S\u0086g\u00db\u00d6P\u00c8\u00a2\u008a\u009eY\u009d\u00ec\u00ca/\u00b4\u00b0U\u0094\u00ea^\u00b3\u00ba}\u0087\u0081If+\u00bd!)\u00cep\u00a24xQ\u0092\u00c7\u00d9\u00e1#N\u001f\u00a7v(\u00d1>\u00daV\u00b3O\u0094\u0017\u00acjg\n\u00c7\u00dc\u00f9rjcXHMM(\u009d\u00f6+\u00b5\u00e8&\u0016\u001b\u00c7\u001e\u0081<M\u00ce\u00d3\u00c2\u00ac\u00e5\u001b\u0012\u00a2Gd\u00a1S\b\u00be\u0010`H\u00f6\u0015B\u00f5\u00b4\"\u00b1\u00adM\u001a\u009a\u00a7\u00fd\u0098\u00bc\u001f#\u000bG\u00ba\u00d7\u00ec\u0011l\u00ca#\u00e5\u00f5\u00bd\u000f6\u00e6\u00e4\u00f4\u008cbh\u00c1cN\u00df\u00a2\u00d1\u00f1\u00ec\u00a7W\u00e8\u00cd\u00bd\u0084\u00a9|\u00de\u0092z\u0015\u00f9\u0093\u00f5\u00da\u00f1nj\u00fb\u0000g\u00c06\u00d1\u008f\u00c1\u00d4\u00f7G\u00f9\u0098\u00bb(\u00a9\u00d3kR\u00d6\u00c0\u009b\u00f3\u00f9\u00e6u^\u00e3z\u00a7n\u0087\u00e3/\u00c8:\u00d7\u0092p\u008c\u00df\u00e8\u0092$\u0091Z\u0015\u008aB\u0099\u0082\u00bc\u0019\u0002\u00e7\u00e6\u00aa\u001d\u00c1<\u00ad \u00bfCJY\u0094\bJ\u001d\u00b8\u00f1\"\u00df\u00f5\u00f4\u00f2\u00b4\u001b\u00b5\u00adIU\u00ce\u0090\\m&\u00bf\u00d2\u00a7\u009fc#\u00a6\u0084\u0011\u00a1\u00f8\u00a1H^@\u00e7\u0097\u0016;\u00b8\u001e\u0092j\u0092\u00af\u00dc\u00ea\u00f7xM'\u00c4\u009cg\u00f8\u0015b\u00dd\u00c1\u00c7S\u0084\u0088\u007f\u00beE\u00fd\u00d1\u009b\u00eb\u00bf\u00ca\u00ee\u00b1\u008b\u00b5P\u00f7\u00db\u00df2D\u00eb\u009c\u0005R\u00a9\u00fa \u00c7\u00e6TS\u0097t\u00b8\u00cd\u00fd\u0085q\u00a4\u00e3LK\u00b5\u00c5Y\u00f0\u0099\u00b4\u00a4\u00f6\u00fb\u001bp\u0091\u0088\u0014\u00ab\u0007\u00e2\u0092\u00d7\u00eb\u00cf5#\u00a5\u00afV\u0089A\u009b9=\u00d8Z\u00b2\u001e\u00ee\u0018A\u00ed\u00b7\u0015\u008d'O9?)\u00a3\u0015\u00f39'\u001axhd\u0084\\\u00b5\u0096\u00eb\u00bb\u00d9\u001e\u00d9\u00b5Q\u0084;Z\u008f\u00fbz={\t\u00c5\u00da\u00da\u00e4\u008e\u00c6\u00aaj\u0006\u000e0\u00b9n\nW\u009b\u00a8\u0081J\u0089)AH\u0088\u00fdM\u00ce\u00f1\u00f0\u00d9\u00c1T\u00e7\u001d\u0091gH7\u0007,\u0010\u00e8o&\u00fc\u00a4\u0099<4\u008bR\\\u000e\u008d\u00be\u00dd\u00ed\u0012\u0014\u0014\u00dd$\u00ed \u00e4\u00b4\u00aa\u00cb\u0002\u00fc\u00e6s^O\u00ce\u00cd\u0013\u00bd\u00f0\u00a6M\u00c3`\u00d4\u0091H\u001d\u00d1\u0093`f&\u0092\u00d0\u00c3\u00f1\u00cd\u00b4\u00ba8\u0091\u0014B\u008f\u00b4\u00d3\u00de\u00c5\u001c\u0003\u008f\u00d5\u0010\u00b2h\u00fd\u00cd`00X@c\u0011\u00bb\u00f4\u00a4\u00bf\u009cY\u0012~ \u00cfy\u00d9\b@,\u00f7\u00dc\u00a1A\u0005u\u00a5e\u00fb\u00ce\u00bc]\u00a0\u00d7\u00de/E\u008c\u00e8m\u00e3c\u00cc\f\u008e\u0091^\u00e1\u001f\u00cb\u0093\u0099\u0019\u0090p\u00b3\u0003%R\u0007\u00a7@\u00a7P\u0001\u00bb\u00ee[\u00c0\u0005O\u00ff`\u00c4@i,\u009dV\u0087\f\u0002(\u00fa\u00a7\u0081\u00c1\u00fd\u00e2\u00f4S\u009c\u00cc\u007f\u0019\u00bf[[\u00a4I\u00d9\u00a0\u00e1\u00f4\u00e4\u008b\u00e39]\u00a8\u00ee\u00b4s|\u00f6Bzj=wa\u00ed,\u00c0\u00a1w\u00cb\u00e7\u00dcr\u00d82\u00ad\u00f5\u001dI\u00d90\u00a6bwF2\u00b6\u0099N\u00b7j{\u0083\u00fe\u0082\u00c7\u009e\u00ed\u00b6\u000e\u0014\u0087\u008a\u00e3\u00c8\u00eeeo\u0089\u00cf;\u00fce\u00dd\u00e8\u0080\u0010\u009d\u0086\u0003D\u00b1\u00e1\u00de}\u00ea\u009e1\u00ef79\u00d1\u00edYM\u00e3\u00d8\u00db\t\u0002\u00101\u0091%\u00d1,\u00cf7\u00e5\u00a8j@\u00ca\u0098\u0012\u00f2\u0014\u00b4\u00a2y\u008c\u001a\u008d\u00e2k\t\u00c6\u00fe\u0019#\u0006G\u00b6^\u0089\u00d1\u00af\u0004\rY\u0080z\u00f2\u00c8\u00b5\u00ab|$\u00d1\u0000\u00aa\u0090\u0004\u0082L\u0086\u0001I*\u0085%0\u0091&@\u0014d\u0084\u0094t\u00c3\u00c6\u00ed\u00ba\u00c8\u00bfwo8{\u00a5\u00bf\u00d5N\u008aU\u00d5/=N\u00c9\u00ec\u00b9\u00ef8\u0080\u00c7\u00ea\u00ddb\u0016\u0013:\u001a4\u009f\u00fb\u0003\u00c1v\u00b0\u00a3\u00cd\u00a6\u0011$\u000e-\u00fa\u00a7\u0001E\u00acU\u00c9\u008e\u00af<\u00eeYO\u0081\u00b0\u0082\u00f4\u00052d\u0000\u00bf\u00da[\u00c4\u00fdG\u00c8\u0080\u00f9\u00b6\u00ee\u0090X\u00aeWl|\u0084\nR\u0080\b0q\u008b\u00ae2\u0094\u008f\u00b4L0\u00da(B::\u00e20@r\u00ccz\u00b6H\u0097[\u0002\u0003XV\u00dcW\u0001\u00a56\u00fc\f\u00c6\u0097\u00e4\u00000 \u0015\u00dc\u000f\u00c4\u000b:\u00a0A\u00b7 3\u00eb\u00c9\u0000\u00fb}\\o\u00fd!\u00d9\u00a3:\u00e5\u009f\u00c7\u00eb\u00b9\u001f\u00da1m\u001f\u00d1%\u00d1\u00ce\u00c7\u00efM\u0013\u001dE\u00c4,Za3|\u00d0\u00cc-\u00df\u00ca\u00dd\u00c8\u00937\u0089\u001a+\u0080\u000b\u00f1I\u0097\u00d6N\u0099\u0089\u0095\u00d8D\u00f6\u0010*\u009b\u00aeNB\u0088\u00efyg\u00b5D\u00c9\u00ab\u00d9\u00e7\u00fe\u00f3\u0093\u0086\u00154#\u00fb\u00b0\u00f1\u00ca\u00ad\u009f\u00d5\u00c5S\u009e\\6\u00d1\u0014\u00e2\u00e21\u00b7+\u0090l\u0085\u00c5d\u00ea*\u00ad\u009b^\"\u00de\u0005\u00cam\u0081\u009bc\u0016sx\u001f\u00fd\t_(^\u00b80'\u0007\u00c5\u00f2i\u0006\u00d4\u00de\u00e0\u00ff\u00e1\u00c31\u008f\bJ\u00ad\u00a9\u009c\u00a9\u0088\u001a\u00eeJw\u00e3\u0084JK_\u000b\u00eaa\u00acP\u00f7f|\u00c5\u00da,\u00ef#\u00b2\u001aQ\u00be\u001a\u00ddm)\u00c0\u0081\u00c3W\u00df?C\u0002\u008e>\u00afYx\u008b\u00b2^\u00f5\u009f]cU03[8\u0097\u00a7B\u0015\u00ef}\u0002`_\u00c5\u0099)\u0004<v\u0019\u00fdf\u009dn\u00c2>\u001f\u00d2\t\u00f1[v\t\u00d3\u00a68dx\u00ebV\u000e\u0087cL\u00c0t\u0000M\u0093\u00cd\u00c1\u0013\u0098\u00f3\u00b8\u00e2%B\u0080T\u00bfH\t\rv\u00d4\u00ad7\u0084\u00a0~\u00af\u00cfZ\u00e5|q\u0000\u0084\u00a3\u00e3\u00f3\u00cf\u00bd\u00c0\n\u00a6\u0092\u0096\u00a3\u00fa\u00e3#Y\u00dd\u00b0\f\u00dad%\u00e5~\u00a0=aHnn\u00b6\u000eC1+b\u0086z\u00afw]\u00b9\u009e\u0011[\u00bb\u00b8'\u0095\u0088\u0018\u0003\u00bd\u0004\u00ea!\n\u009c\u00d1\u00da\u00ef=\u000b\u0097\u00e4\u00d5y)\u00e2\u0007r\u00a0\u00dd\u00f5\u0088\u00c7\n\u0092\u00ec\u00b9\u0015\u0000>\u0000$\u00fb\u00ba\u0084h\b\u00f5\u00c1\u0093\u00e6\u00ad\u001f\\\u00d70\u0092\u00fe>\u00aet(\u008cp\fX\u0001\u00cb\u00a9<\u00a7\u00b0Js\u00f7\u0089\u00c6%g\u00e9\u00d3$\u0011p\u00841\u0081\u00c0\u0019\u00cb\u00a7>\u00d6z\u00d7\u00c0\u0086{w\u00fe\u001d\u0019\u00f3\u00ec\u0005'\u00ff\u00b5-\u009aU\u0019}\u009d\u00c9I\u009a-fC\u0011k\u0017KQ\u0090\u00d1\u00fd\u009c\u00a2i\u007f\u0080\u001a:\u009a\u00e4\u00faEb\u00f6\u00e9\u0001\u0094)\u00dezXo6\u00fd\u00c1\u00dd\n\u007f38\u00bat\u001et\u00bc3\u00d7<\u00b0\u000e;w#\u00b8\u0012\u00e3\u00acy\t\u0003:y\u00fd\u00a3\u00ea\u001c\u00fb\u009d5\u00f5\u008b\u00e3\u00882\u00c9O\u008d{\u00c1\u0096\u0013\u0088\u00ec\u00c1\u0094\u00c6\u0017\u000e\u0093h\u00a9\u00c0\u00fd\u00b9\u00fd\u001c1}t\u00eel\u00d82\u00f5\u00b7\"\u00c5m4\u00a9\u0087h\u00c7\u00ce\u00fc\u00f8\u009aS\u0011\u008a\u00ecE%\u00ce\u0093{\u0019#\u00f4\u001fQX4\u00ce\u0007\f\u00cd\n\u009e=\u0080\u009fH\u0005\u00dd}\u00c2\u0081\u0089\u00c1i\u00a9l+\u008d}\u00cbn\u00f2\u00dd\u00e6\u00fc\u000f[\u00a63+\u0099\u00b9\u00e1X7~a\"^\u0085\u0081\u001eB\u009ej\u0096\u000fze2\u008b\u00de\u00eac\u0097\u00c2\u00f2\u00d4bn\u0093Ax\u00f3k&\u0092\u0083jX\u009f\u00f2\u008et\u0095\u0081S\u001b9\u00f2<\u00b5\u00e9\u00b7\u0083y%T\u00fd\u00c5%@\u00f9q[YC\u00e6;i)=+M6;\u00de\u0018\u00bf!\u00e8\u0085\u001c\u00ba\u00da6\u0012\u00d1\u00e6Tz\u0006\u00d9\b\u00b2\u00a5\u00d4\u0091Q\u001a\u0095\u00d8zo\u00e1\u00d1\u00f5\u0093\u00c9F\u008a\u00cdb\u0002G\u00e4\u009c^|U\u0090\u00d2O\u00a9\u0015}c_\u00e6\u00c2\u00f5R\u0081\u0010\u00fc\u00fc\u00aa\u00d9\u00d2-k\u00cd\u00ac/\u00c0\u00a0\u0089Vho~\u008d\u00eb\u00ac\u0095\u00a2\u008b\u0084[~\u0097\u0091 _\u00d5\u00cf\u00d5\u0001\u00e6X\u00a3\u0090\u00aa$E\r\u00fdI\u00bd\u00fe$\u0001\u00ce\u00cf\u007f\u0000\u00dd\u0007\u00ac\u008fz[\u0016\u0005\u00bb,p\u009d\u0094\u0004u\u00e4\u00e8]s\u00a9Cl\u0014\u0016\u0082C\u00c8\u0094\u00e2$\u00fe\u008a\u00d8\u009c\u00fa!\n[\u00c0\u008e1\u00a3\u00ac\u001d_\"4U\"\u00f5\u00b7\u00b4\"-h:\u00a7\u0080\u00dd\u0012$\u00f3\u00ff+{$\u00fa\u00eb%\u00bd\u00de\u00d7w\u00b4\u0092~\u000f}\u00a7z\u00b4\u0080w\u00a6\u0086\u00b78\u00ff9\u000b\u00aaoEL\u0014\u00d0\u00b3\"j\u001ae\u008fT\u001c\u009b8\u009f\u00a1bj5.\u00b2\u00fb$\u0087\u0015\u008f\u00db\u00cf\u0089\u00c5\u00a9\u00b3XQ-\u00d4~~\u00afb%1O\u00af\b|~3@\u0084\u00ea\u000ej\u00c8d\u00ddV\u00a0\u008e4\u0094\u00a4\u00d0V\u0096\u00b1\u00fd_\u00des>m\r\u001d\u00d6\tny~\u00fb\u00fb\u00f7\u00b5\u0013\u001e\u001c\u00d6I\u00cb\u00d4\u00f0=3\u00c0*3\u0089\u00d8\u00f37JB~l\u00ecM\u009c|a\u00b3\u009bA\u00e4\u0086\u00bet\u0012\u0085D\u001c\u0007\u009e\u0017I\u0007\u00f6\u009c4\u00ee\u00e1X\u001e\u00c4:\u00b2\u00a05,@\u00abK\u001d-\f\u00b8\u00ea\u0010\u00ea9-\u00a4\u00b6F\u00e9\u00b0\u00c2\u00deD\u007f\u009b\u00aa\u0097m\u00c6\u001a/p\u00ea$\u0006\u00adq\b\u00e3\u00ad\u00c3\u00de>\u00eb#\u00a3-E-\u00a3\u008f$\u00f2\u008f\u00e4\u00c8g\u00b8\u0081\u00de\u001e5D\u00f2\u00b4>\u00d7L]\u00c1\u00a5\u0091\u001b\u007f\u001a\u00cc\u00e8\u00d6E'\u00c40\u00da\u00beO\u0013\u00b8DH\u00cd\u00f4*\u0017\r\u00f4\u00b5\u00c8\u00bf\u00cdE\u0004\u00d1W\u00f8\u00ac\u00b1\u00cd\u00e1\u00e7\u00e3\u0091\u00bb\u00b1\u0097\u0083\u001b\u0097\u00b4\u00d0\u00b89\u00b9\u00ea\u0083\u009b\u001b\u0005\u00d0\u0092\u0081Z\u00dawU;\u0099f\u00d4\u00ce\u00bc\u00fb\u00c4\u000b\u0003\u00a3".length();
                        var15_7 = 0;
                        while (true) {
                            var20_8 = var17_5.substring(var15_7, var15_7 += 8).getBytes("ISO-8859-1");
                            v3 = var19_3;
                            v4 = var16_4++;
                            v5 = ((long)var20_8[0] & 255L) << 56 | ((long)var20_8[1] & 255L) << 48 | ((long)var20_8[2] & 255L) << 40 | ((long)var20_8[3] & 255L) << 32 | ((long)var20_8[4] & 255L) << 24 | ((long)var20_8[5] & 255L) << 16 | ((long)var20_8[6] & 255L) << 8 | (long)var20_8[7] & 255L;
                            v6 = -1;
                            break block11;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            v3[v4] = v7;
                            if (var15_7 < var18_6) ** continue;
                            var17_5 = "\u00f4\u001f\u0089$[ \u00135[\u009e\u00efP\u0014\u00b9\u0006\u00b5";
                            var18_6 = "\u00f4\u001f\u0089$[ \u00135[\u009e\u00efP\u0014\u00b9\u0006\u00b5".length();
                            var15_7 = 0;
                            while (true) {
                                var20_8 = var17_5.substring(var15_7, var15_7 += 8).getBytes("ISO-8859-1");
                                v3 = var19_3;
                                v4 = var16_4++;
                                v5 = ((long)var20_8[0] & 255L) << 56 | ((long)var20_8[1] & 255L) << 48 | ((long)var20_8[2] & 255L) << 40 | ((long)var20_8[3] & 255L) << 32 | ((long)var20_8[4] & 255L) << 24 | ((long)var20_8[5] & 255L) << 16 | ((long)var20_8[6] & 255L) << 8 | (long)var20_8[7] & 255L;
                                v6 = 0;
                                break block11;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            v3[v4] = v7;
                            if (var15_7 < var18_6) ** continue;
                            break block12;
                            break;
                        }
                    }
                    var21_9 = v5;
                    var23_10 = var13_1.doFinal(new byte[]{(byte)(var21_9 >>> 56), (byte)(var21_9 >>> 48), (byte)(var21_9 >>> 40), (byte)(var21_9 >>> 32), (byte)(var21_9 >>> 24), (byte)(var21_9 >>> 16), (byte)(var21_9 >>> 8), (byte)var21_9});
                    v7 = ((long)var23_10[0] & 255L) << 56 | ((long)var23_10[1] & 255L) << 48 | ((long)var23_10[2] & 255L) << 40 | ((long)var23_10[3] & 255L) << 32 | ((long)var23_10[4] & 255L) << 24 | ((long)var23_10[5] & 255L) << 16 | ((long)var23_10[6] & 255L) << 8 | (long)var23_10[7] & 255L;
                    switch (v6) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl52:
                        // 1 sources

                        ** continue;
                    }
                }
                CP_Xi.b = var19_3;
                CP_Xi.c = new Integer[291];
                CP_Xi.g = new HashMap<K, V>(13);
                var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v8 = SecretKeyFactory.getInstance("DES");
                v9 = new byte[8];
                v10 = v9;
                v9[0] = (byte)(var11 >>> 56);
                for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                    v10 = v10;
                    v10[var1_12] = (byte)(var11 << var1_12 * 8 >>> 56);
                }
                var0_11.init(2, (Key)v8.generateSecret(new DESKeySpec(v10)), new IvParameterSpec(new byte[8]));
                var6_13 = new long[2];
                var3_14 = 0;
                var4_15 = "\u00fdl\u00f7\u00ae\t\u0096\u00a6L\n\u00861\u00fa\u00dc\u00a62\u00ff";
                var5_16 = "\u00fdl\u00f7\u00ae\t\u0096\u00a6L\n\u00861\u00fa\u00dc\u00a62\u00ff".length();
                var2_17 = 0;
                while (true) {
                    break block13;
                    break;
                }
lbl74:
                // 1 sources

                while (true) {
                    var6_13[v11] = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
                    if (var2_17 < var5_16) ** continue;
                    break block14;
                    break;
                }
            }
            var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
            v11 = var3_14++;
            var8_19 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            ** while (true)
        }
        CP_Xi.e = var6_13;
        CP_Xi.f = new Long[2];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3D26;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_Xi", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Xi.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Xi.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_Xi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1D34;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_Xi", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            CP_Xi.f[n2] = l4;
        }
        return f[n2];
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = CP_Xi.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/CP_Xi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Xi.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CP_Xi.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
