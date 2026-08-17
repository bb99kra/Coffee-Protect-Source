/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 *  org.bukkit.configuration.file.FileConfiguration
 *  org.bukkit.plugin.java.JavaPlugin
 */
package me.nik.coffeeprotect;

import java.io.File;
import java.io.IOException;
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
import me.nik.coffeeprotect.IlIlGT;
import me.nik.coffeeprotect.IlIlLi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class IlIlfJ {
    private File IlIlf;
    private FileConfiguration IlIlY;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static transient /* synthetic */ String BsEnAhzRWB = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public void IlIlp(JavaPlugin javaPlugin) {
        IlIlfJ ilIlfJ;
        block4: {
            block5: {
                long l = a ^ 0x4B76D08AB63BL;
                this.IlIlf = new File(javaPlugin.getDataFolder(), (String)((Object)IlIlfJ.a("c", (int)6772, (long)(0x6F8562CB26FF1F19L ^ l))));
                PacketWrapper[] packetWrapperArray = IlIlGT.IlIlh();
                try {
                    ilIlfJ = this;
                    if (packetWrapperArray == null) break block4;
                    if (ilIlfJ.IlIlf.exists()) break block5;
                }
                catch (IOException iOException) {
                    throw IlIlfJ.a(iOException);
                }
                try {
                    this.IlIlf.createNewFile();
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
            ilIlfJ = this;
        }
        ilIlfJ.IlIld();
    }

    public FileConfiguration IlIln() {
        return this.IlIlY;
    }

    public void IlIlE() {
        try {
            this.IlIlY.save(this.IlIlf);
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public void IlIld() {
        this.IlIlY = IlIlLi.IlIly(this.IlIlf);
    }

    public void IlIl_() {
        long l = a ^ 0x5A7C40B29A72L;
        this.IlIln().addDefault((String)((Object)IlIlfJ.a("c", (int)26216, (long)(0x2D163C12BC994F47L ^ l))), (Object)IlIlfJ.a("c", (int)16648, (long)(0x171C3D9DD7AE6830L ^ l)));
        this.IlIln().addDefault((String)((Object)IlIlfJ.a("c", (int)4445, (long)(0x108726718C4DB87CL ^ l))), (Object)IlIlfJ.a("c", (int)29006, (long)(0x4C1352B56CFA5878L ^ l)));
        this.IlIln().addDefault((String)((Object)IlIlfJ.a("c", (int)31942, (long)(0x5CDC25A79EA355F7L ^ l))), (Object)IlIlfJ.a("c", (int)3548, (long)(0x199673D1D1F424F5L ^ l)));
        this.IlIln().addDefault((String)((Object)IlIlfJ.a("c", (int)6845, (long)(0x73D384D7EA3B38DL ^ l))), (Object)IlIlfJ.a("c", (int)5813, (long)(0x4D89CFC334D7BF99L ^ l)));
        this.IlIln().addDefault((String)((Object)IlIlfJ.a("c", (int)2906, (long)(0x6818CED7BCB5224AL ^ l))), (Object)IlIlfJ.a("c", (int)14284, (long)(0x65DB3642602E9EE1L ^ l)));
        this.IlIln().addDefault((String)((Object)IlIlfJ.a("c", (int)1602, (long)(0x6233BDC5A7332F65L ^ l))), (Object)IlIlfJ.a("c", (int)3941, (long)(0x68E1B2CF49CA670L ^ l)));
        this.IlIln().addDefault((String)((Object)IlIlfJ.a("c", (int)8705, (long)(0x12D9B1393AD80B10L ^ l))), (Object)IlIlfJ.a("c", (int)5412, (long)(0x61D4488B4E04BC1EL ^ l)));
        this.IlIln().addDefault((String)((Object)IlIlfJ.a("c", (int)610, (long)(0x1D578085F0112B5EL ^ l))), (Object)IlIlfJ.a("c", (int)5591, (long)(0x72490B4282A23CF9L ^ l)));
        this.IlIln().addDefault((String)((Object)IlIlfJ.a("c", (int)12332, (long)(0x554764A24DC6191BL ^ l))), (Object)IlIlfJ.a("c", (int)21797, (long)(0x66A990B2F6397C0FL ^ l)));
        PacketWrapper[] packetWrapperArray = IlIlGT.IlIlh();
        this.IlIln().addDefault((String)((Object)IlIlfJ.a("c", (int)29417, (long)(0x70AA49479204DBD4L ^ l))), (Object)IlIlfJ.a("c", (int)17578, (long)(0x6D7966574909ED81L ^ l)));
        this.IlIln().addDefault((String)((Object)IlIlfJ.a("c", (int)24120, (long)(0x236AC904D467F701L ^ l))), (Object)IlIlfJ.a("c", (int)7635, (long)(0x29076AF1DF1DB4ECL ^ l)));
        this.IlIln().addDefault((String)((Object)IlIlfJ.a("c", (int)3205, (long)(0x7B08BEFC9FE8A5A7L ^ l))), (Object)IlIlfJ.a("c", (int)1152, (long)(0x147FD37EFC392D94L ^ l)));
        String[] stringArray = new String[IlIlfJ.b("i", (int)27077, (long)(0x26F3FC65C951092BL ^ l))];
        stringArray[0] = IlIlfJ.a("c", (int)21756, (long)(0x3E1FF855CF18FDC8L ^ l));
        stringArray[1] = IlIlfJ.a("c", (int)14501, (long)(0x2C5EC443BF72919BL ^ l));
        stringArray[2] = "";
        stringArray[3] = IlIlfJ.a("c", (int)21316, (long)(0x37E22AA6D2F77A6CL ^ l));
        stringArray[4] = IlIlfJ.a("c", (int)15163, (long)(0x4B67A68537A69228L ^ l));
        stringArray[5] = "";
        stringArray[IlIlfJ.b("i", (int)30620, (long)(0x68FF93C603329770L ^ l))] = IlIlfJ.a("c", (int)6499, (long)(0x66BF65E54660B040L ^ l));
        this.IlIln().addDefault((String)((Object)IlIlfJ.a("c", (int)32655, (long)(0x5E097EA94A27D6AFL ^ l))), Arrays.asList(stringArray));
        PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
        String[] stringArray2 = new String[IlIlfJ.b("i", (int)865, (long)(0x2E9DE8DE0315E38BL ^ l))];
        stringArray2[0] = "";
        stringArray2[1] = IlIlfJ.a("c", (int)23339, (long)(0x72D454AD3E0DF239L ^ l));
        stringArray2[2] = "";
        stringArray2[3] = IlIlfJ.a("c", (int)20708, (long)(0x4A67911D3B82F9D7L ^ l));
        stringArray2[4] = IlIlfJ.a("c", (int)2591, (long)(0xBEB37DBBE9FA324L ^ l));
        stringArray2[5] = IlIlfJ.a("c", (int)14010, (long)(0x2EF8288D3DF09F8FL ^ l));
        stringArray2[IlIlfJ.b("i", (int)262, (long)(0x3879BD4186EBE1E9L ^ l))] = IlIlfJ.a("c", (int)779, (long)(0x4CDEBDE8EF2DAA2DL ^ l));
        stringArray2[IlIlfJ.b("i", (int)556, (long)(0x751C57B3C100E2C1L ^ l))] = IlIlfJ.a("c", (int)14211, (long)(0x96A2EE53FE9EA6L ^ l));
        stringArray2[IlIlfJ.b("i", (int)22009, (long)(0x7E0306C72E21B512L ^ l))] = "";
        this.IlIln().addDefault((String)((Object)IlIlfJ.a("c", (int)31847, (long)(0x14ECFD4CF55B5555L ^ l))), Arrays.asList(stringArray2));
        if (packetWrapperArray2 == null) {
            PacketWrapper.IlIle((int[])new int[1]);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        IlIlfJ.a = IlIls.a((long)-3650188064170332288L, (long)8806012153270876929L, MethodHandles.lookup().lookupClass()).a(21006709283251L);
                        IlIlfJ.d = new HashMap<K, V>(13);
                        var11 = IlIlfJ.a ^ 129897697723200L;
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
                        var20_3 = new String[38];
                        var18_4 = 0;
                        var17_5 = "\u00ee\u0082\u0014\u00be\u0091\u00e1B\u0019\u00c1\u0019u\u00ed\u00ed\u0084\u00f1O\u00ef\u0005A\u0013,R*\u0094\u00b8w\r(h\u0011^\u0012\u00f9\u00f1\u00b0\u00b4\u00b2\u00836\u00bb\u0010\u00ee2\u00e2\u00bc\u00f6f\u000fhPxm\u009c\u0088Iq=0\\\u00048\u00c2\u008ff\u00f2\u0096M\u00da%\r >\u0087X\u0019e\u00ef\u00ed\u00e5\u00ba7\u0002\u00e5\u009bv\u00ac\u0085]\u0085\u00fd<1\u00af\u008c\u00ec\bU\u0083\u0093\u0002Z\u0099x\u00ac\u00d6\u00d8 (\u00aa\u00a4\u00a4c\u00f6\u00da\u00b7U-\u00b0'(\u00f4\u00c7\u0007\u009a*#_\"\u00a3\u00bc\u00f6\u00c0\u0016\u00d3m&\u00a7\u00d3\u00030\u001c\u00deZ\u0095\u0006\u0004m\u00abC\u0019\u009e7\u0096\u00c6\u000b\u00d0\u00b2\u00b9{f,\u00d7\u008eNF\u0097\u0090\u00a9\u00fb8\u00db\u00b2z\u0086\u00f6\u00a5X\u00caL#h\u00c00\u0094\u00a8?\u00dfe(q7W\u00e6&\u0014\u0018wA;,\u00ad-\r\u00c0 \u008c\u001c\u0018-\u001f]\b\u00cca\u00b9\u0096\u000f\u0096\u0098'$\u00d5Cq\u0084\u0014M\u0099\u00da\u0010h_1\u00aa\u00b9E\u00bd@\r\t\u00eec\r6\u0004\u008f\u0088\u00ee\u00c4X\u0085\u00a5\u00d32\u00b5\u00df\u00b29{\b\u0010^O\u00ed\u00d1Jm\u0019\fH\u00a1\u00ee\u0092Kxk\u00cb\u0097xV$h\u00be\u00a3\u00aeg\u009au\u0013\u00d1?\u00175@\u00cf.\u00c4\"\u00e9\u0004\u00c0}\u00f4J\u00aa\u00de\u0099J\u00ca\u00de\u00e8,(\u0097O\u00ab\u0082\u0084\u00d0\u0096x\u00bat\u00e4`\u00e4\u00e4[-4n\u008e\u00974\u00da\u00c9\u0012\u00ef\u008e\u000e\u00aeLH\u00e5\u0012|\u0083\u00c8\u00ed3\u00b7\u0080\u00f6\u0015Y~\u00fa\u00b8\u00fc\u00fb\u00b82 \u00e6\u00f7\u009a\u00acs\u00d59\u00aa\u000b\u00bc/%P\u00c4,\u00fe=\u00b0\u00b5\u00f2 6T\u0014\u00b1*\u00e1\u0089<\u008d\u0097\u001c\u00d0\u00c7e0\u00a6\u00a1~\u00c4\u0007\u009c\u00e6\u007f\u00f8q\u00cb\b\f\u00f4\u0006_\u0002@\u00ef\u00b8\u00ed\u00c9\u00a4\u0001l\u00fcb\u00daG\u00c2\u00e6\u00b3C\u0001\u00b8o\u00e6\u00f9u\u001b\u0011Sp~\u00ce\u001e\u00e6F\u00ea'\u00a2Q\u00d4\u00a4r[\u0080_\u00d1\u00a5\u0089\u00f9\u00c4\u0002\u00b9\u0016\u00a7uJK\u0082\u0085f\u00b35\u008e\u00a1:U\u0090y\u00a9@\u00adQ\bu\u00048?O\u0012\u001d)A+\u00f342\u0014\u00d6*\u00d7)\u00cf\u00b5\u00bc\u0005\u00cd\u00dbt:K\u00bf\u001e08q\u0013`6[\u00dbJ\u001b\u0013w\u00d5}\u00fb\u00c4\u0088M\u00f85O\u00ac\u00ff#iC\u00ba\u00ccj\u00cc3uXWM\u00faN\u001f\u00c2\u00b4\u00b7qi\u00c5\u00ee\u00a4\u00e5\u000f\u00e7\n\u0088\u00bdnPg\u007f\u000b\\\u0094\u009e\u00b1&|\u0097c\u00b8\u00a1i\u0001\u0097@\u009d\t\u00a5\u00cd\u009f\u00be\u00ce\u00d1\u00a1u\u00e2\u00a3N\u0095\u008a\u001eSK\"\u008d\u00b9\u001ac\u00cb\u008c\u0087=\u00db\u00df6C-J\u0090\u00c3\u00e8h\u00c2!\u0090\u00d1t\u008d\u0087\u00e6\u00c9\u00b5\u00a5\u0082\u00a5\u0018\u00c7L\u00f7\u00ba\u00eb!\u00e5\u00e8\u0018\u008d0=\u00c6~On\u00ec\u00cf\u00c8\u0090i\u008b\u00e9T 8\u00b4\u0003\u00f7\u00ab\u00a6k\u00bbJ5\u001c\u00c0\u0013\u0081\u0092\t\u00ba\u00f7\u00d0X\u009bAl2\u00a1\u00fe\u0019=\u0006\u00c4\u008d\u00ab0\u00901v\u0099D\u00b4\u00f1\u00e2o\u0007\u001e\u009cO!+O{\u00a8]&\u00ab\u0005\u007f2p\u00b4\u00ba\u008f\u00b9\u00ce-\u00df\u00a7\u00eb\u0017-\u00ea\u0001\u0086;\u00b3\u001a\u0016;a0\u00b1\u0011 ]\u0088\u00bdNB\u00d4\u000b\u00c1\u008f\u00e4|~\u00d7\u00b3\u00ba8\u00cd\u009c\u00bd\u00cauq\u00d4\u00ea\r\u00d2\u0099\u00a51\u00ac\u001d\u00ce \u0084\u00fbl\u00af\u00f4}\u00bf\u00dfQ\u00fc\u0001\u0086\u000e\u0010\u00cc\u0095\u0002M\u00b0\u00b8g\u0011\u00d8\u00fe\u00f7\u00d1i2\u00d2\u0007s\u0005 ~\u00ab\u009b\u0082Mg\u00e2J1\u0087\u00fe\u0012\u00b7\u0080\u00f8}EO\u00a2<\u00a8A6\u00a2\u00ab\u0005=\u00f2\u00d1;\u00a3\u008d(E\u008a\u00e1\u00f2\u0016\u00a3\u0085\u00c0%\u00ce\u00c8\u0086\blM\u00b7.\u000b\u001b\u0003\u00d6\u0001c\u007f\u008dz\u00de\u00b0\u00a3\u00f3\u00f4#8<_\u009b\u00dc\u00c3\u001c\u00de \u00cex\u00a4\u00fd\u0011\u0017\u0097vt\u00e495\u00a9W\u0085\u00fcNx9\u009fO\u00983\u00f6\u0018\u009a\u00a5\u00d4\u0086\u00d6\u00ce,@\u0003B\u009f\u001c\u00c4i\u0093\u0083\u00c5kn\u00c8\bPH\u00aa\u00c7t\u0092\u00186%\u00a6\u009b\u00f5\u0003?r\u00b3\u00be1\u00c3\u001d\u00d2M\u00c9\u009cV\u00ad\u008c\u00d5m\u00few\u00e4\u00f9\u00fd\u008e\u00a6fL\u0099%\u0083\u00a2\u0085\u0089Y`.\u0012\u00f2\u00de\u009c \u0000\u009e\u00d4\u00a1\u00b7\u000ei/@\u00a1\u0097\u00f1\u00de\u0003U\u00a0\u00b8u\u00ffyS@k\u00e1\\\u00fe\u0006\u00dfJ\u009dns(\u00cb\u00af\u00d9hJ\u001a\u00f6\u00e7BJ\u00b3\u008e0\u00f1 \u009fZ\u00e3T\u00e75\u00c9m\u00b2B\u00a4\u00c9\u00f0nn\u008e\u00cdg\u00bb\u00dd\u00df\"Jx\u00008\u00ed\u009a\u00f9\u009ez\u00b5\u00a0y\u00ben\u0088\u00de\u007f2\u0004\u00ff\u008b\u00fa\u00dd\u00f5k\u00ffC\u00dda\u008e\u0005\u00fc\u00c7\u009b\u00e8\u009f\u00fd\u009a+(\u00e4Q6\u0015\u00e2tot\u00c0\u0085\u00c7\u00afue\u00d98,\u00cb-\u00d9`\n\u00af\u000f\u00e3\u00bd\u009a\u00f1k\u00d3\u00d8\u00e7X\u00e4K~92\u00c4\u00b5\u00ae!\bX\u00e7A\u009a>\u00c8\u0006\u00cc\u0006c\u0016@\u0019\u001d\u00c3\u0097\u00b8\u00fa;\u00e8\u00d0\u001dlU\u009b\u00b2\u00d3(\u0098\u00ac\u00e9\u009er\u0094\u0016\fU\u00d3}E\u00a2\u00dd&en&)R\u00ca\u00ffk\\\u00ba\u0099\u00c3\u00ed\u00da9\u00aa\u00b7\u00c2a\u00ad\t\u00b3\u008b\u00d2\u00cc\u00a6|<\u0000u\u001f(\u009e\u00f9\u0014\u00de\u000e\u00df\u0017\u0098[U\u00b5<w\u00e4\u0095\u00c1:R\u00d7Wq8\u00c7\u00d9h\u0091\u00c1\u00a7\u00c2\u0085\u009e\u00ae\u0018jeg~:e\u00878\u0016?\u00d1\u00a7@\u0010\u00138EF\u0089\u00af.E\u00c7C\u009b\u008a\u0084\u00cc\n\u00fd\u00d9\u0093e\u00cbF\u00ff:r\u0090\u00036 \b\\lqe\u00af\u0000c\u00c8\u00cd\u00eb\u00f0\u00b2\b\u00eb\u000b;x\u00favC-Xjkk\u009eM\u00afv)\u00c7\u00bb\u00ebk\u00c4>\u00e2\u007fGu\u0013O\u0010k\u001ct\u00c9\u0089\u001c\u009eX\u00e6\u0082\u00e3,\u00889\u00a4\u00c2\u00c7\u0011\u00e7\u0018\u009d\u00bd1\u008d[\u00d8a%\u00e8\u009d\u00cc\b\u00bc\u0084\u000bX\u009a\u00e7\u00ea+\u009e\u00d5\u001d\u00e9\u000f\u0011W0\u00f1\u00eaS\u0002 t\u0093\u00b0f\u0094\u00f2\u00ce\u00ff\u00b3^!\u009c\u00f0\bH\u009b\u0092\u00bc\u00da\u00de@\u00beZ \u00ce9\u00fa\u0095a\u00fd\u00a6C\u0004\u008e\u0015\u00e0\u00b9\u00eaw8\u00eaY\u001b\u008f\u00dd\u00ad\u00eb\u00af\bmn\u00c3\u0094\u0088O\u00bd\u00ecl\u0017m\u00d1V^\u00ad\u008d\u0084V\u00a7S\u0096\rY\u00ea\u00d4B1\u00d6&\u00da\u00aeP\u00f8\u00c27v\u00f1-HV\fE\u00d3}\u00f0\u0082v-9\u00b4a\u00f5f+~\u00d2\u0081\u00ca\u0014\u0011?\u00acv\u00e0\u00b0\u009d\u00d4\u008a\u00f1lJ\u00f5\t\u00a4R&\u00c16\u009cP\u0004\u00f1\u00c8\u0007\"*\u009e\u001f\u00aa`\u0003\u00d4\u0001\u00f4t\u00aa\u0083I>C \u0084\u0004\u00cd\\:\u001f\u00c1L\t\u0014\u0010\u00e9\n\u0087\u001b\u00e1\u00e4\u001f~1T\u00ebg\u00beA\u00dc\u0015P\u00c5\u0017o\u00ea\u0017#\u00bcV\u009f0\u00d4rC\u00dd\u00f2\u00aa\u00a1\u00eb\u0091\b\u0014/\u00c1'\"\u008a\u00f1\u0084\u00b8\u00e5\r\u008d\u00b7\u00f5W\u008b\u009a5\u009d\u00a7\u0098>w\u00aeO\u00e3\u00ba\u0018\u0007W\u00c5\u00f1\u0000@\u00a1\u00d1\u001dKvz\u00c4\r\u00a8t\u0082$t\u001cr\u00bc\u00ee\u00b1\u00a5:\u00e6\u009e\u009fy{\u00e1\u0018X\u001a%\u00fe\u00a6\u001cx\u00b1\u00be\u001e\u0006\u0003<N\u0091\u00cf\u00aeXvIX;\u00ec\t \u0013\u0082\u0000\u00fa\u00f9[\u00e8\u0082#2|\u00b6I,\u00ff\u00e3\u001a\u00e6nn\u00c8q|\u00ba\u00ef0J\u00f1\u00a7)w\u0010 \u00e2a\rO5\u00b3\n\u00d4\u00c2+\u00c3\u0086\u00d3\u0096D\u00bbO\u00f7\u0080\u00d1\u0010\u009a]\u0007eG\u00cc\\P\u00e1[^ k\u00d8\u00e2\u00af\u00b2\u00b9\u007f\u00fc\u00be@\u00cfa\u008d\u00e3f\u0018u\u00de\u00b1\u00a3QP\u0093\u00ef\t\u0085\u0094\u00b6\u00d4\u00a8\u00b5\u00b2";
                        var19_6 = "\u00ee\u0082\u0014\u00be\u0091\u00e1B\u0019\u00c1\u0019u\u00ed\u00ed\u0084\u00f1O\u00ef\u0005A\u0013,R*\u0094\u00b8w\r(h\u0011^\u0012\u00f9\u00f1\u00b0\u00b4\u00b2\u00836\u00bb\u0010\u00ee2\u00e2\u00bc\u00f6f\u000fhPxm\u009c\u0088Iq=0\\\u00048\u00c2\u008ff\u00f2\u0096M\u00da%\r >\u0087X\u0019e\u00ef\u00ed\u00e5\u00ba7\u0002\u00e5\u009bv\u00ac\u0085]\u0085\u00fd<1\u00af\u008c\u00ec\bU\u0083\u0093\u0002Z\u0099x\u00ac\u00d6\u00d8 (\u00aa\u00a4\u00a4c\u00f6\u00da\u00b7U-\u00b0'(\u00f4\u00c7\u0007\u009a*#_\"\u00a3\u00bc\u00f6\u00c0\u0016\u00d3m&\u00a7\u00d3\u00030\u001c\u00deZ\u0095\u0006\u0004m\u00abC\u0019\u009e7\u0096\u00c6\u000b\u00d0\u00b2\u00b9{f,\u00d7\u008eNF\u0097\u0090\u00a9\u00fb8\u00db\u00b2z\u0086\u00f6\u00a5X\u00caL#h\u00c00\u0094\u00a8?\u00dfe(q7W\u00e6&\u0014\u0018wA;,\u00ad-\r\u00c0 \u008c\u001c\u0018-\u001f]\b\u00cca\u00b9\u0096\u000f\u0096\u0098'$\u00d5Cq\u0084\u0014M\u0099\u00da\u0010h_1\u00aa\u00b9E\u00bd@\r\t\u00eec\r6\u0004\u008f\u0088\u00ee\u00c4X\u0085\u00a5\u00d32\u00b5\u00df\u00b29{\b\u0010^O\u00ed\u00d1Jm\u0019\fH\u00a1\u00ee\u0092Kxk\u00cb\u0097xV$h\u00be\u00a3\u00aeg\u009au\u0013\u00d1?\u00175@\u00cf.\u00c4\"\u00e9\u0004\u00c0}\u00f4J\u00aa\u00de\u0099J\u00ca\u00de\u00e8,(\u0097O\u00ab\u0082\u0084\u00d0\u0096x\u00bat\u00e4`\u00e4\u00e4[-4n\u008e\u00974\u00da\u00c9\u0012\u00ef\u008e\u000e\u00aeLH\u00e5\u0012|\u0083\u00c8\u00ed3\u00b7\u0080\u00f6\u0015Y~\u00fa\u00b8\u00fc\u00fb\u00b82 \u00e6\u00f7\u009a\u00acs\u00d59\u00aa\u000b\u00bc/%P\u00c4,\u00fe=\u00b0\u00b5\u00f2 6T\u0014\u00b1*\u00e1\u0089<\u008d\u0097\u001c\u00d0\u00c7e0\u00a6\u00a1~\u00c4\u0007\u009c\u00e6\u007f\u00f8q\u00cb\b\f\u00f4\u0006_\u0002@\u00ef\u00b8\u00ed\u00c9\u00a4\u0001l\u00fcb\u00daG\u00c2\u00e6\u00b3C\u0001\u00b8o\u00e6\u00f9u\u001b\u0011Sp~\u00ce\u001e\u00e6F\u00ea'\u00a2Q\u00d4\u00a4r[\u0080_\u00d1\u00a5\u0089\u00f9\u00c4\u0002\u00b9\u0016\u00a7uJK\u0082\u0085f\u00b35\u008e\u00a1:U\u0090y\u00a9@\u00adQ\bu\u00048?O\u0012\u001d)A+\u00f342\u0014\u00d6*\u00d7)\u00cf\u00b5\u00bc\u0005\u00cd\u00dbt:K\u00bf\u001e08q\u0013`6[\u00dbJ\u001b\u0013w\u00d5}\u00fb\u00c4\u0088M\u00f85O\u00ac\u00ff#iC\u00ba\u00ccj\u00cc3uXWM\u00faN\u001f\u00c2\u00b4\u00b7qi\u00c5\u00ee\u00a4\u00e5\u000f\u00e7\n\u0088\u00bdnPg\u007f\u000b\\\u0094\u009e\u00b1&|\u0097c\u00b8\u00a1i\u0001\u0097@\u009d\t\u00a5\u00cd\u009f\u00be\u00ce\u00d1\u00a1u\u00e2\u00a3N\u0095\u008a\u001eSK\"\u008d\u00b9\u001ac\u00cb\u008c\u0087=\u00db\u00df6C-J\u0090\u00c3\u00e8h\u00c2!\u0090\u00d1t\u008d\u0087\u00e6\u00c9\u00b5\u00a5\u0082\u00a5\u0018\u00c7L\u00f7\u00ba\u00eb!\u00e5\u00e8\u0018\u008d0=\u00c6~On\u00ec\u00cf\u00c8\u0090i\u008b\u00e9T 8\u00b4\u0003\u00f7\u00ab\u00a6k\u00bbJ5\u001c\u00c0\u0013\u0081\u0092\t\u00ba\u00f7\u00d0X\u009bAl2\u00a1\u00fe\u0019=\u0006\u00c4\u008d\u00ab0\u00901v\u0099D\u00b4\u00f1\u00e2o\u0007\u001e\u009cO!+O{\u00a8]&\u00ab\u0005\u007f2p\u00b4\u00ba\u008f\u00b9\u00ce-\u00df\u00a7\u00eb\u0017-\u00ea\u0001\u0086;\u00b3\u001a\u0016;a0\u00b1\u0011 ]\u0088\u00bdNB\u00d4\u000b\u00c1\u008f\u00e4|~\u00d7\u00b3\u00ba8\u00cd\u009c\u00bd\u00cauq\u00d4\u00ea\r\u00d2\u0099\u00a51\u00ac\u001d\u00ce \u0084\u00fbl\u00af\u00f4}\u00bf\u00dfQ\u00fc\u0001\u0086\u000e\u0010\u00cc\u0095\u0002M\u00b0\u00b8g\u0011\u00d8\u00fe\u00f7\u00d1i2\u00d2\u0007s\u0005 ~\u00ab\u009b\u0082Mg\u00e2J1\u0087\u00fe\u0012\u00b7\u0080\u00f8}EO\u00a2<\u00a8A6\u00a2\u00ab\u0005=\u00f2\u00d1;\u00a3\u008d(E\u008a\u00e1\u00f2\u0016\u00a3\u0085\u00c0%\u00ce\u00c8\u0086\blM\u00b7.\u000b\u001b\u0003\u00d6\u0001c\u007f\u008dz\u00de\u00b0\u00a3\u00f3\u00f4#8<_\u009b\u00dc\u00c3\u001c\u00de \u00cex\u00a4\u00fd\u0011\u0017\u0097vt\u00e495\u00a9W\u0085\u00fcNx9\u009fO\u00983\u00f6\u0018\u009a\u00a5\u00d4\u0086\u00d6\u00ce,@\u0003B\u009f\u001c\u00c4i\u0093\u0083\u00c5kn\u00c8\bPH\u00aa\u00c7t\u0092\u00186%\u00a6\u009b\u00f5\u0003?r\u00b3\u00be1\u00c3\u001d\u00d2M\u00c9\u009cV\u00ad\u008c\u00d5m\u00few\u00e4\u00f9\u00fd\u008e\u00a6fL\u0099%\u0083\u00a2\u0085\u0089Y`.\u0012\u00f2\u00de\u009c \u0000\u009e\u00d4\u00a1\u00b7\u000ei/@\u00a1\u0097\u00f1\u00de\u0003U\u00a0\u00b8u\u00ffyS@k\u00e1\\\u00fe\u0006\u00dfJ\u009dns(\u00cb\u00af\u00d9hJ\u001a\u00f6\u00e7BJ\u00b3\u008e0\u00f1 \u009fZ\u00e3T\u00e75\u00c9m\u00b2B\u00a4\u00c9\u00f0nn\u008e\u00cdg\u00bb\u00dd\u00df\"Jx\u00008\u00ed\u009a\u00f9\u009ez\u00b5\u00a0y\u00ben\u0088\u00de\u007f2\u0004\u00ff\u008b\u00fa\u00dd\u00f5k\u00ffC\u00dda\u008e\u0005\u00fc\u00c7\u009b\u00e8\u009f\u00fd\u009a+(\u00e4Q6\u0015\u00e2tot\u00c0\u0085\u00c7\u00afue\u00d98,\u00cb-\u00d9`\n\u00af\u000f\u00e3\u00bd\u009a\u00f1k\u00d3\u00d8\u00e7X\u00e4K~92\u00c4\u00b5\u00ae!\bX\u00e7A\u009a>\u00c8\u0006\u00cc\u0006c\u0016@\u0019\u001d\u00c3\u0097\u00b8\u00fa;\u00e8\u00d0\u001dlU\u009b\u00b2\u00d3(\u0098\u00ac\u00e9\u009er\u0094\u0016\fU\u00d3}E\u00a2\u00dd&en&)R\u00ca\u00ffk\\\u00ba\u0099\u00c3\u00ed\u00da9\u00aa\u00b7\u00c2a\u00ad\t\u00b3\u008b\u00d2\u00cc\u00a6|<\u0000u\u001f(\u009e\u00f9\u0014\u00de\u000e\u00df\u0017\u0098[U\u00b5<w\u00e4\u0095\u00c1:R\u00d7Wq8\u00c7\u00d9h\u0091\u00c1\u00a7\u00c2\u0085\u009e\u00ae\u0018jeg~:e\u00878\u0016?\u00d1\u00a7@\u0010\u00138EF\u0089\u00af.E\u00c7C\u009b\u008a\u0084\u00cc\n\u00fd\u00d9\u0093e\u00cbF\u00ff:r\u0090\u00036 \b\\lqe\u00af\u0000c\u00c8\u00cd\u00eb\u00f0\u00b2\b\u00eb\u000b;x\u00favC-Xjkk\u009eM\u00afv)\u00c7\u00bb\u00ebk\u00c4>\u00e2\u007fGu\u0013O\u0010k\u001ct\u00c9\u0089\u001c\u009eX\u00e6\u0082\u00e3,\u00889\u00a4\u00c2\u00c7\u0011\u00e7\u0018\u009d\u00bd1\u008d[\u00d8a%\u00e8\u009d\u00cc\b\u00bc\u0084\u000bX\u009a\u00e7\u00ea+\u009e\u00d5\u001d\u00e9\u000f\u0011W0\u00f1\u00eaS\u0002 t\u0093\u00b0f\u0094\u00f2\u00ce\u00ff\u00b3^!\u009c\u00f0\bH\u009b\u0092\u00bc\u00da\u00de@\u00beZ \u00ce9\u00fa\u0095a\u00fd\u00a6C\u0004\u008e\u0015\u00e0\u00b9\u00eaw8\u00eaY\u001b\u008f\u00dd\u00ad\u00eb\u00af\bmn\u00c3\u0094\u0088O\u00bd\u00ecl\u0017m\u00d1V^\u00ad\u008d\u0084V\u00a7S\u0096\rY\u00ea\u00d4B1\u00d6&\u00da\u00aeP\u00f8\u00c27v\u00f1-HV\fE\u00d3}\u00f0\u0082v-9\u00b4a\u00f5f+~\u00d2\u0081\u00ca\u0014\u0011?\u00acv\u00e0\u00b0\u009d\u00d4\u008a\u00f1lJ\u00f5\t\u00a4R&\u00c16\u009cP\u0004\u00f1\u00c8\u0007\"*\u009e\u001f\u00aa`\u0003\u00d4\u0001\u00f4t\u00aa\u0083I>C \u0084\u0004\u00cd\\:\u001f\u00c1L\t\u0014\u0010\u00e9\n\u0087\u001b\u00e1\u00e4\u001f~1T\u00ebg\u00beA\u00dc\u0015P\u00c5\u0017o\u00ea\u0017#\u00bcV\u009f0\u00d4rC\u00dd\u00f2\u00aa\u00a1\u00eb\u0091\b\u0014/\u00c1'\"\u008a\u00f1\u0084\u00b8\u00e5\r\u008d\u00b7\u00f5W\u008b\u009a5\u009d\u00a7\u0098>w\u00aeO\u00e3\u00ba\u0018\u0007W\u00c5\u00f1\u0000@\u00a1\u00d1\u001dKvz\u00c4\r\u00a8t\u0082$t\u001cr\u00bc\u00ee\u00b1\u00a5:\u00e6\u009e\u009fy{\u00e1\u0018X\u001a%\u00fe\u00a6\u001cx\u00b1\u00be\u001e\u0006\u0003<N\u0091\u00cf\u00aeXvIX;\u00ec\t \u0013\u0082\u0000\u00fa\u00f9[\u00e8\u0082#2|\u00b6I,\u00ff\u00e3\u001a\u00e6nn\u00c8q|\u00ba\u00ef0J\u00f1\u00a7)w\u0010 \u00e2a\rO5\u00b3\n\u00d4\u00c2+\u00c3\u0086\u00d3\u0096D\u00bbO\u00f7\u0080\u00d1\u0010\u009a]\u0007eG\u00cc\\P\u00e1[^ k\u00d8\u00e2\u00af\u00b2\u00b9\u007f\u00fc\u00be@\u00cfa\u008d\u00e3f\u0018u\u00de\u00b1\u00a3QP\u0093\u00ef\t\u0085\u0094\u00b6\u00d4\u00a8\u00b5\u00b2".length();
                        var16_7 = 40;
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
                            var20_3[var18_4++] = IlIlfJ.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00f7\u0016(\u009aPv,\u001c\u0018F\u00d3\u001b\\\u00dfh\u00f6\u008cs\u0003\u0099\f3b\u00aad\u00b5\u00f4\u00d4\u009f\u0002\u001b\u00fd\u0007\u00d4Y\u00f8'\u00f2tB\u00b8xA\u00c0\u00cc\u0088^\u00c0\u00f2\u009c\u00e7\u00f2\u00f4\u00e9\u009c\u00d1\u0014\u00caX\u0099\u000f\u00da\u00b4\u00b3sM8o.,\u00897g\u00f9\u0015\u00cfx\u00df\u00c3b\u0082\u0089b\u00e6\u00a5*\u0097\u00c1H\u00d0\u00ddXJ>\u00ce)\u00b1\u00f1\u00e4\u0006\u001c\u00ca\u00e8Ip\u00aa\u009fk\u0087\u00a2X\u00e25_}=\u00a6hk`a\u0087\u00dc\u00b8\u00e47\u0002\u0006\u0003\\\u00a5\u00c2\u00daY\u009e\u0000\u008c\u00e3qe`\u0015\u001fF\u00f9d\u00f1L\u00e1\u00e2\u00fa{\u0098\u001c\u0093\n\u00dc\u0007\u00ac\u00d2\u00ab";
                            var19_6 = "\u00f7\u0016(\u009aPv,\u001c\u0018F\u00d3\u001b\\\u00dfh\u00f6\u008cs\u0003\u0099\f3b\u00aad\u00b5\u00f4\u00d4\u009f\u0002\u001b\u00fd\u0007\u00d4Y\u00f8'\u00f2tB\u00b8xA\u00c0\u00cc\u0088^\u00c0\u00f2\u009c\u00e7\u00f2\u00f4\u00e9\u009c\u00d1\u0014\u00caX\u0099\u000f\u00da\u00b4\u00b3sM8o.,\u00897g\u00f9\u0015\u00cfx\u00df\u00c3b\u0082\u0089b\u00e6\u00a5*\u0097\u00c1H\u00d0\u00ddXJ>\u00ce)\u00b1\u00f1\u00e4\u0006\u001c\u00ca\u00e8Ip\u00aa\u009fk\u0087\u00a2X\u00e25_}=\u00a6hk`a\u0087\u00dc\u00b8\u00e47\u0002\u0006\u0003\\\u00a5\u00c2\u00daY\u009e\u0000\u008c\u00e3qe`\u0015\u001fF\u00f9d\u00f1L\u00e1\u00e2\u00fa{\u0098\u001c\u0093\n\u00dc\u0007\u00ac\u00d2\u00ab".length();
                            var16_7 = 88;
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
                            var20_3[var18_4++] = IlIlfJ.a(var21_9).intern();
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
                IlIlfJ.b = var20_3;
                IlIlfJ.c = new String[38];
                IlIlfJ.g = new HashMap<K, V>(13);
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
                var6_12 = new long[6];
                var3_13 = 0;
                var4_14 = "}\u0081\u00c6\u00b5Z\u00daf?6\u00d1s\u00da\u0014\r\t\u00fb\u00b6~\u0094wV\u00be3\u00b6\u00a2\u0007\u00e6\u0017\u00bd7\t\u00af";
                var5_15 = "}\u0081\u00c6\u00b5Z\u00daf?6\u00d1s\u00da\u0014\r\t\u00fb\u00b6~\u0094wV\u00be3\u00b6\u00a2\u0007\u00e6\u0017\u00bd7\t\u00af".length();
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
                    var4_14 = "'\u00f3\u00e7\u008am\u00da\u00db+\u00ec\u0094\u00f4>\u000f7f\u00bb";
                    var5_15 = "'\u00f3\u00e7\u008am\u00da\u00db+\u00ec\u0094\u00f4>\u000f7f\u00bb".length();
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
        IlIlfJ.e = var6_12;
        IlIlfJ.f = new Integer[6];
    }

    private static IOException a(IOException iOException) {
        return iOException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x72F6;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlfJ", exception);
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
            IlIlfJ.c[n2] = IlIlfJ.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlfJ.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIlfJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3B28;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlfJ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlfJ.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlfJ.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIlfJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlfJ.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(IlIlfJ.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

