/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_ql {
    private final File CP_p;
    private final boolean CP_A;
    private String CP_C;
    private boolean CP_T;
    private boolean CP_R;
    private boolean CP_W;
    private boolean CP_N;
    private boolean CP_y;
    private static PacketWrapper[] CP_O;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String enBozdHCas = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_ql(File file, boolean bl) throws IOException {
        long l = a ^ 0x6E08C2FBDC7CL;
        PacketWrapper[] packetWrapperArray = CP_ql.CP_b();
        this.CP_y = true;
        this.CP_p = file;
        this.CP_A = bl;
        this.CP_L();
        PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
        try {
            if (packetWrapperArray2 == null) {
                PacketWrapper.CP_e(new int[2]);
            }
        }
        catch (IOException iOException) {
            throw CP_ql.a(iOException);
        }
    }

    public String CP_T() {
        return this.CP_C;
    }

    public boolean CP_p() {
        return this.CP_T;
    }

    public boolean CP_u() {
        return this.CP_R;
    }

    public boolean CP_c() {
        return this.CP_W;
    }

    public boolean CP_l() {
        return this.CP_N;
    }

    public boolean CP_UnderScore() {
        return this.CP_y;
    }

    private void CP_L() throws IOException {
        block11: {
            CP_ql ilIlql;
            block10: {
                PacketWrapper[] packetWrapperArray;
                block8: {
                    block9: {
                        long l = a ^ 0x45B00DE6BAFL;
                        packetWrapperArray = CP_ql.CP_b();
                        try {
                            try {
                                ilIlql = this;
                                if (packetWrapperArray == null) break block8;
                                if (ilIlql.CP_p.exists()) break block9;
                            }
                            catch (IOException iOException) {
                                throw CP_ql.a(iOException);
                            }
                            this.CP_y = false;
                            this.CP_N();
                        }
                        catch (IOException iOException) {
                            throw CP_ql.a(iOException);
                        }
                    }
                    this.CP_UnderScore();
                    ilIlql = this;
                }
                try {
                    try {
                        if (packetWrapperArray == null) break block10;
                        if (ilIlql.CP_C != null) break block11;
                    }
                    catch (IOException iOException) {
                        throw CP_ql.a(iOException);
                    }
                    this.CP_N();
                    ilIlql = this;
                }
                catch (IOException iOException) {
                    throw CP_ql.a(iOException);
                }
            }
            ilIlql.CP_UnderScore();
        }
    }

    private void CP_N() throws IOException {
        long l = a ^ 0x12C2C502D8B1L;
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add((String)((Object)CP_ql.a("a", (int)8453, (long)(0x23284CBD55EDCAEEL ^ l))));
        arrayList.add((String)((Object)CP_ql.a("a", (int)7468, (long)(0x307B116C5002F6C1L ^ l))));
        arrayList.add((String)((Object)CP_ql.a("a", (int)20447, (long)(0x4BE6CF8FF718243BL ^ l))));
        arrayList.add((String)((Object)CP_ql.a("a", (int)21200, (long)(0x21E81E9ABF0AB92DL ^ l))));
        arrayList.add((String)((Object)CP_ql.a("a", (int)20743, (long)(0x371A55854D02BAE4L ^ l))));
        arrayList.add((String)((Object)CP_ql.a("a", (int)24118, (long)(0x16584D90CBCC35D7L ^ l))) + this.CP_A);
        arrayList.add((String)((Object)CP_ql.a("a", (int)3292, (long)(0x1F735AC63538673CL ^ l))) + UUID.randomUUID().toString());
        arrayList.add((String)((Object)CP_ql.a("a", (int)6734, (long)(0x7CC8E34C30AFF1A9L ^ l))));
        arrayList.add((String)((Object)CP_ql.a("a", (int)11709, (long)(0x6053BDA27E47C657L ^ l))));
        arrayList.add((String)((Object)CP_ql.a("a", (int)18786, (long)(0x42BE7B53ACC82280L ^ l))));
        this.CP_UnderScore(this.CP_p, arrayList);
    }

    private void CP_UnderScore() throws IOException {
        block4: {
            List<String> list;
            long l;
            block5: {
                l = a ^ 0x2353C117D6DBL;
                list = this.CP_t(this.CP_p);
                PacketWrapper[] packetWrapperArray = CP_ql.CP_b();
                try {
                    try {
                        if (packetWrapperArray == null) break block4;
                        if (list != null) break block5;
                    }
                    catch (IOException iOException) {
                        throw CP_ql.a(iOException);
                    }
                    throw new AssertionError(CP_ql.a("a", (int)22060, (long)(0x2A223C80519DB3A3L ^ l)));
                }
                catch (IOException iOException) {
                    throw CP_ql.a(iOException);
                }
            }
            this.CP_T = this.CP_B((String)((Object)CP_ql.a("a", (int)32629, (long)(0x44EBAA0878609AF3L ^ l))), list).map(((String)((Object)CP_ql.a("a", (int)27669, (long)(0x72A03CC29A38999L ^ l))))::equals).orElse(true);
            this.CP_C = this.CP_B((String)((Object)CP_ql.a("a", (int)21629, (long)(0x366B6CA1338DB1F9L ^ l))), list).orElse(null);
            this.CP_R = this.CP_B((String)((Object)CP_ql.a("a", (int)23706, (long)(0x980EF8561A33919L ^ l))), list).map(((String)((Object)CP_ql.a("a", (int)10521, (long)(0x523BC249E7824C9CL ^ l))))::equals).orElse(false);
            this.CP_W = this.CP_B((String)((Object)CP_ql.a("a", (int)24204, (long)(0x4D7F8D2AAEB43B0EL ^ l))), list).map(((String)((Object)CP_ql.a("a", (int)10521, (long)(0x523BC249E7824C9CL ^ l))))::equals).orElse(false);
            this.CP_N = this.CP_B((String)((Object)CP_ql.a("a", (int)26006, (long)(0x331B116F4E238000L ^ l))), list).map(((String)((Object)CP_ql.a("a", (int)10521, (long)(0x523BC249E7824C9CL ^ l))))::equals).orElse(false);
        }
    }

    private Optional<String> CP_B(String string, List<String> list) {
        return list.stream().filter(string2 -> string2.startsWith(string + "=")).map(string2 -> string2.replaceFirst(Pattern.quote(string + "="), "")).findFirst();
    }

    private List<String> CP_t(File file) throws IOException {
        long l = a ^ 0x597395BFE313L;
        try {
            if (!file.exists()) {
                return null;
            }
        }
        catch (Throwable throwable) {
            throw CP_ql.a(throwable);
        }
        try (FileReader fileReader = new FileReader(file);){
            List<String> list;
            try (BufferedReader bufferedReader = new BufferedReader(fileReader);){
                list = bufferedReader.lines().collect(Collectors.toList());
            }
            return list;
        }
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void CP_UnderScore(File file, List<String> list) throws IOException {
        PacketWrapper[] packetWrapperArray;
        block18: {
            long l = a ^ 0x4CA3C90A8BF1L;
            packetWrapperArray = CP_ql.CP_b();
            boolean bl = file.exists();
            if (packetWrapperArray == null) break block18;
            try {
                block19: {
                    if (bl) break block18;
                    break block19;
                    catch (Throwable throwable) {
                        throw CP_ql.a(throwable);
                    }
                }
                file.getParentFile().mkdirs();
                bl = file.createNewFile();
            }
            catch (Throwable throwable) {
                throw CP_ql.a(throwable);
            }
        }
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);){
            for (String string : list) {
                try {
                    bufferedWriter.write(string);
                    bufferedWriter.newLine();
                    if (packetWrapperArray == null) return;
                    if (packetWrapperArray != null) continue;
                    return;
                }
                catch (Throwable throwable) {
                    throw CP_ql.a(throwable);
                    return;
                }
            }
        }
    }

    public static void CP_F(PacketWrapper[] packetWrapperArray) {
        CP_O = packetWrapperArray;
    }

    public static PacketWrapper[] CP_b() {
        return CP_O;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_ql.a = CP_s.a(554667445120383317L, 1686005552424248097L, MethodHandles.lookup().lookupClass()).a(47322024235586L);
                CP_ql.d = new HashMap<K, V>(13);
                CP_ql.CP_F(new PacketWrapper[3]);
                var0 = CP_ql.a ^ 45915994120449L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[18];
                var7_4 = 0;
                var6_5 = "3H\u00a6 MO:\u0004'SY4\u00a8\u0015\u009dJ\u0090\u00ed\u00eex\n\u00af\u0097\t\u00d4\u009a\u00d9S\u0082\u00dc8l)\u00e7\u00d9\u00aa\u00fd\u008a\u0085O\u001fzT\u00d1\u00fa\u00ad\u00acL\u00f1\u00eb\u001a\u00a4\u0015\u00e3\u008a\u0015\n;)&\u00d7\u00c8\u00cfZ\u0087w\u00b2(\u00f5\u0017E\u0007\u0012G\u0091\u0000\u0092v\u00d9\u00b1\u000b\u000e\u0014\u0086[\u0013\u00bb_\u00a5=/>\u0089\u0094Mt)n\u0000x\u0091d\u00b7r\u00f5N\u009f\u0095pv\u00be\u00c1zpiv\u00fa\u000f\u00f39\u00af\u00ee9P\u00e8\u0089\u00cd\u00d6\u00a7\u00e5\u00c5\u00ea\u00a3\u00e3\u008dr\u0006\u00day\u0090\\Q\u00aa\u00cb\u007fB\u0006\u0014\u00c7\u0080\u0013\u00f4\u00ed\u00a9\b\u008f\u0095\u00c6Pn\u00bb V\u00cd\u0010\u00f6\u0094\u0015\u0019\u00af\u00e4H\u00cb\u00d4\u00fb\u00ce\u00d9\u0080FD9\u0005\u00dci\n\u00af\u0018\u00ba\u0012\u00e7\u0080\u00fdo\u000e\u0010!&\u0083\u00cfy\u00fb?\f\u00a6\u0084\u00a1q5\u0081\u00ef\u0016\u00184\u00cacpD]\u00a0@ \u00ceW\u00ac_^\u001b\u00cfn\u000e\u00e3\u00b2 \u0000\u001e\u00b9 \u00841\u00b8|\u00fcV\u00e8\u0016\u00a5\t\nGSh\u009a\u0004\u00a0\u0000t\u00b0\u00c2h\u00dbnQ:%w:1\u00d2b0}\u00e5\u00ed\u00c1\u00f2\u0092N4\u00d1\u00d9ku\u0006\u009c\u00fe|\u00b5\u0088;\u00e6\u00f12!\u001e\u0017zZe\u0083N5\u00d5\u00cc\u00dd \u000f\u00ben\u00f4;\u00c0XA\u0007\u008e\u00ca\u0089\u00d5\u0098\u0092\u0016\u00b5\u00e9\u00ab-\u0016\u0090\u00a3\u00ed\u001a\u0012<'C\u00e7\u0084\u00d0\u00d8Q\u00a1\u0095\u000e\u00a7\u00ad\u00d4:\u00dd\u00b6a#\u0087\u0088vV\u00f8\u009a\u00c7\u00f1\u00c5\u00d9\tf\u00ba\u00b9\u00b9E\u00dd\u00c3\u00e3\u00e3\u00fe\u0090\u00ab\u0007\u00c6\u0003Yq<M\u00b9\u00ec\u00fa\t\u001b\u00b4\\t\u00a0{UG\u00ce\u00ae\u00f7\u000e\u00cb\u00d0\u00ad\u0007\u00f7\u00aej\u00f8\u0080nC*\u00f9\u00f3\u00af\u001dB\u0090S\u00f8\u00d8\u00f8\u009b\u0093g\u00a2*6\n\u00ae-\u00a3\u00cap\u00fe\u0094\u00a3\u00d6\u000bz\u00c1\u00c7\u00ec\u00b1\u00bf\u00951\u0086\u00ff\u00dd\u00d4\u009f\u0096\u0091\u0096m\u00eb\u00d9\u0081\u0088\u0007\u00c4{\u0099\u00a1c^\u001bN|\u00cf\u0095@,N\u0098\u00bf\u00bb\n\u00fez\u00ac\u00b9u\u0016\u00fc\u00a5\u00fds\u00bd\u009f\u00f5\u00ebX&\u00e7\u00cb\u00b8\u0086\u0019He\u00d6\u0003\u00b7\u0010\u00b5K\t\u00c6X\u00d2\u00a5\u00de\u00e2\u00c72\u00b0\u00b3\u00fe\u00e5\u0088\u009e<a\u00efZ7\u00a5\u00eb|\u0092\u00e4\u0095\u00e7\u008d\u00ea,ih\u001b\u00d6\u00d0\u00f6\u00ba!\u00a5dlMO\u00d7\u009f9\u0096\u00b0lI\u00a6\u00f1>\u00ae\u00e6\u000e \u001a\u00b6\u001f\u009bVf\u0017\u009f\u00c6\f\u0092A\u00bd\u0093+\u008f\u00d1q\u001f\u001b\u00ad\u00efo\u00a2\u00f9\u00f0r\f\u0017{\u00d8\u0095\u00c4\u00e3\u00e2y\u0007\u00a7\u00e7\u0019Mj\u00c3\u00a1 \u0018\u00dd\u001b/b\u00b8\u00fe\u00e14\u0082Z\u0006\u00daS\u00e2\u0096\u00de\u00af@\u00b1\u00c5\u00f2\u001a5a0\u00b1\u00fe\u001d\u00e0\u00f1^\u00d0\u00a4\u0005\u00cd\u007f\u00f1\u0007g\u00fc\u00e77\u00fe\u0094\u00b7\u00ff\u00c7\u00cc\u00e6Q\u00dc\u00c7\u00e1\u00a6-\u00a8\u00a3\u00a4~5\u00b1\u008bH4\u00eb\u00fdx!\u00d8J\u00da\u00a0K\u00e2H\u009dC\u00ca\t\u00c8\u00a1\u00ac\u0010\u0080\u0093\u008d\u00a2\u0014\u00ad\u00f7l\u00be\u009b\u0019\u00c1PO\u00e0\u00cf(\u00e5[\u00deU\u00ca\u00fa\u00e1c\u00fa\u00fch\u0014\u001f\u00b1\u00deQ\u0095\u00e9>1\u00cc\u0010\u00f1\u00a5W\u00e2\u00bc\u0092oa4\u00ef\u00baO\u00b7\u00f5\u00d5$\u0099$ \u0000\u00d8\u00a01\u0010\u0001?\u0089\u00b5'\u00d1\u00bbJ'\u00a4\u000027\u00fd\u001a\u00a3\u00e7\u0017\u00e2\u001598\u00fe\u00e2\u00cd;] \u00f1}\u009a\u001c\u0085\u0086\u00e8\u0004\u0000Kp\u00a6K\u00f9\u0005v\u000e\u001a\u00a7\u00c4\u008b2\u00a4\u0006\u00c8a\u001fq\u0017\u0099&\u009a8\u00f8bQ&\u009b=3\u00fc\u00b3l\u00d6,\u0014e\u00f9\u00dc\u009dQ)3\u00f0k{A\u00dd\u0013\u00e8\u00ef\u00c2DfN\u00f2\u00a2\u00e6\u0094\u00d6\u00ffg\u0010\u00fa6\u00f23\u00ac\u00d7\u00e4\u00e7\u00a5\u00d3\u00f9\u001d\u00fc\u00c3\u00aa\u00108\u0080\u00d1D\u008e\u00eel\u00bb3\b|Bv\b\u00f8\u00d3\u00c9~\u00cf\rT\u0082\u001f\u00ae\u0010\u00b38\u001av2\n\u00a4\u0095\u008bjd$\u0002\u0081*\u00c0\u00cb\u00a3V\u00a4\u00ed\u0018\u0093{\r\u00e2jL.\u00df;\u00eb";
                var8_6 = "3H\u00a6 MO:\u0004'SY4\u00a8\u0015\u009dJ\u0090\u00ed\u00eex\n\u00af\u0097\t\u00d4\u009a\u00d9S\u0082\u00dc8l)\u00e7\u00d9\u00aa\u00fd\u008a\u0085O\u001fzT\u00d1\u00fa\u00ad\u00acL\u00f1\u00eb\u001a\u00a4\u0015\u00e3\u008a\u0015\n;)&\u00d7\u00c8\u00cfZ\u0087w\u00b2(\u00f5\u0017E\u0007\u0012G\u0091\u0000\u0092v\u00d9\u00b1\u000b\u000e\u0014\u0086[\u0013\u00bb_\u00a5=/>\u0089\u0094Mt)n\u0000x\u0091d\u00b7r\u00f5N\u009f\u0095pv\u00be\u00c1zpiv\u00fa\u000f\u00f39\u00af\u00ee9P\u00e8\u0089\u00cd\u00d6\u00a7\u00e5\u00c5\u00ea\u00a3\u00e3\u008dr\u0006\u00day\u0090\\Q\u00aa\u00cb\u007fB\u0006\u0014\u00c7\u0080\u0013\u00f4\u00ed\u00a9\b\u008f\u0095\u00c6Pn\u00bb V\u00cd\u0010\u00f6\u0094\u0015\u0019\u00af\u00e4H\u00cb\u00d4\u00fb\u00ce\u00d9\u0080FD9\u0005\u00dci\n\u00af\u0018\u00ba\u0012\u00e7\u0080\u00fdo\u000e\u0010!&\u0083\u00cfy\u00fb?\f\u00a6\u0084\u00a1q5\u0081\u00ef\u0016\u00184\u00cacpD]\u00a0@ \u00ceW\u00ac_^\u001b\u00cfn\u000e\u00e3\u00b2 \u0000\u001e\u00b9 \u00841\u00b8|\u00fcV\u00e8\u0016\u00a5\t\nGSh\u009a\u0004\u00a0\u0000t\u00b0\u00c2h\u00dbnQ:%w:1\u00d2b0}\u00e5\u00ed\u00c1\u00f2\u0092N4\u00d1\u00d9ku\u0006\u009c\u00fe|\u00b5\u0088;\u00e6\u00f12!\u001e\u0017zZe\u0083N5\u00d5\u00cc\u00dd \u000f\u00ben\u00f4;\u00c0XA\u0007\u008e\u00ca\u0089\u00d5\u0098\u0092\u0016\u00b5\u00e9\u00ab-\u0016\u0090\u00a3\u00ed\u001a\u0012<'C\u00e7\u0084\u00d0\u00d8Q\u00a1\u0095\u000e\u00a7\u00ad\u00d4:\u00dd\u00b6a#\u0087\u0088vV\u00f8\u009a\u00c7\u00f1\u00c5\u00d9\tf\u00ba\u00b9\u00b9E\u00dd\u00c3\u00e3\u00e3\u00fe\u0090\u00ab\u0007\u00c6\u0003Yq<M\u00b9\u00ec\u00fa\t\u001b\u00b4\\t\u00a0{UG\u00ce\u00ae\u00f7\u000e\u00cb\u00d0\u00ad\u0007\u00f7\u00aej\u00f8\u0080nC*\u00f9\u00f3\u00af\u001dB\u0090S\u00f8\u00d8\u00f8\u009b\u0093g\u00a2*6\n\u00ae-\u00a3\u00cap\u00fe\u0094\u00a3\u00d6\u000bz\u00c1\u00c7\u00ec\u00b1\u00bf\u00951\u0086\u00ff\u00dd\u00d4\u009f\u0096\u0091\u0096m\u00eb\u00d9\u0081\u0088\u0007\u00c4{\u0099\u00a1c^\u001bN|\u00cf\u0095@,N\u0098\u00bf\u00bb\n\u00fez\u00ac\u00b9u\u0016\u00fc\u00a5\u00fds\u00bd\u009f\u00f5\u00ebX&\u00e7\u00cb\u00b8\u0086\u0019He\u00d6\u0003\u00b7\u0010\u00b5K\t\u00c6X\u00d2\u00a5\u00de\u00e2\u00c72\u00b0\u00b3\u00fe\u00e5\u0088\u009e<a\u00efZ7\u00a5\u00eb|\u0092\u00e4\u0095\u00e7\u008d\u00ea,ih\u001b\u00d6\u00d0\u00f6\u00ba!\u00a5dlMO\u00d7\u009f9\u0096\u00b0lI\u00a6\u00f1>\u00ae\u00e6\u000e \u001a\u00b6\u001f\u009bVf\u0017\u009f\u00c6\f\u0092A\u00bd\u0093+\u008f\u00d1q\u001f\u001b\u00ad\u00efo\u00a2\u00f9\u00f0r\f\u0017{\u00d8\u0095\u00c4\u00e3\u00e2y\u0007\u00a7\u00e7\u0019Mj\u00c3\u00a1 \u0018\u00dd\u001b/b\u00b8\u00fe\u00e14\u0082Z\u0006\u00daS\u00e2\u0096\u00de\u00af@\u00b1\u00c5\u00f2\u001a5a0\u00b1\u00fe\u001d\u00e0\u00f1^\u00d0\u00a4\u0005\u00cd\u007f\u00f1\u0007g\u00fc\u00e77\u00fe\u0094\u00b7\u00ff\u00c7\u00cc\u00e6Q\u00dc\u00c7\u00e1\u00a6-\u00a8\u00a3\u00a4~5\u00b1\u008bH4\u00eb\u00fdx!\u00d8J\u00da\u00a0K\u00e2H\u009dC\u00ca\t\u00c8\u00a1\u00ac\u0010\u0080\u0093\u008d\u00a2\u0014\u00ad\u00f7l\u00be\u009b\u0019\u00c1PO\u00e0\u00cf(\u00e5[\u00deU\u00ca\u00fa\u00e1c\u00fa\u00fch\u0014\u001f\u00b1\u00deQ\u0095\u00e9>1\u00cc\u0010\u00f1\u00a5W\u00e2\u00bc\u0092oa4\u00ef\u00baO\u00b7\u00f5\u00d5$\u0099$ \u0000\u00d8\u00a01\u0010\u0001?\u0089\u00b5'\u00d1\u00bbJ'\u00a4\u000027\u00fd\u001a\u00a3\u00e7\u0017\u00e2\u001598\u00fe\u00e2\u00cd;] \u00f1}\u009a\u001c\u0085\u0086\u00e8\u0004\u0000Kp\u00a6K\u00f9\u0005v\u000e\u001a\u00a7\u00c4\u008b2\u00a4\u0006\u00c8a\u001fq\u0017\u0099&\u009a8\u00f8bQ&\u009b=3\u00fc\u00b3l\u00d6,\u0014e\u00f9\u00dc\u009dQ)3\u00f0k{A\u00dd\u0013\u00e8\u00ef\u00c2DfN\u00f2\u00a2\u00e6\u0094\u00d6\u00ffg\u0010\u00fa6\u00f23\u00ac\u00d7\u00e4\u00e7\u00a5\u00d3\u00f9\u001d\u00fc\u00c3\u00aa\u00108\u0080\u00d1D\u008e\u00eel\u00bb3\b|Bv\b\u00f8\u00d3\u00c9~\u00cf\rT\u0082\u001f\u00ae\u0010\u00b38\u001av2\n\u00a4\u0095\u008bjd$\u0002\u0081*\u00c0\u00cb\u00a3V\u00a4\u00ed\u0018\u0093{\r\u00e2jL.\u00df;\u00eb".length();
                var5_7 = 16;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = CP_ql.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "L\u00e3\u00e4\u0095\u00c7ra\u00ec\u00e7\u00ad\u00ed\u00bbIn\u0081\u00d8\u0007}\u00a9\u00e1\u00a5\u001c,n\u00f1/\u001c\u00d9\u0001n+\nJ\u00d6\u0000\u0095bHK/\u008f\u00b4\u001eh\u00c5\u00d5\u00a5p\u0090w\u0013\n[\u0096\u00e3x\u00d4[2#\u00eeA\u00c4\u0082v\u001e\u00c8A\u009e\u0098\u00a6\u000b\u00d6\u008c\u0005D+\u00fa\u0016\u0016\u00e8\t\u0014\u0091Q\u0013\u00c1\u00ae\u0015\\<\u0002\u008f\u0015\u0006^\u00a6\u00cbm\u00e3\u00e3\u00b8\u00fau1\u0081\u00f0>\u0082\u001eo\u0003\t\u00a6\u00d4\u0089Z\u008alAM6\u000f\u00e4\u00c6\u008c\u00c7\u00df{uQ\u00eb|^\u00e0\u00b0+\u0080\u0016\u00e4!\u00a8\u00ac;c\u00c4\u00d1\u00ebc\u0006\u0099kX/qb\u00e9\u00c4\u0001o\u00bbsa\u00d1T\u00a3\u00f9\u007f6%D\u0013\u00d1\u00e5\u0088D\fj\u00a2\u00e3\u00cd<J\u00ce\u0089\u00e5\u00e8K\u00c7\u00d5\u00fbB\u0082";
                    var8_6 = "L\u00e3\u00e4\u0095\u00c7ra\u00ec\u00e7\u00ad\u00ed\u00bbIn\u0081\u00d8\u0007}\u00a9\u00e1\u00a5\u001c,n\u00f1/\u001c\u00d9\u0001n+\nJ\u00d6\u0000\u0095bHK/\u008f\u00b4\u001eh\u00c5\u00d5\u00a5p\u0090w\u0013\n[\u0096\u00e3x\u00d4[2#\u00eeA\u00c4\u0082v\u001e\u00c8A\u009e\u0098\u00a6\u000b\u00d6\u008c\u0005D+\u00fa\u0016\u0016\u00e8\t\u0014\u0091Q\u0013\u00c1\u00ae\u0015\\<\u0002\u008f\u0015\u0006^\u00a6\u00cbm\u00e3\u00e3\u00b8\u00fau1\u0081\u00f0>\u0082\u001eo\u0003\t\u00a6\u00d4\u0089Z\u008alAM6\u000f\u00e4\u00c6\u008c\u00c7\u00df{uQ\u00eb|^\u00e0\u00b0+\u0080\u0016\u00e4!\u00a8\u00ac;c\u00c4\u00d1\u00ebc\u0006\u0099kX/qb\u00e9\u00c4\u0001o\u00bbsa\u00d1T\u00a3\u00f9\u007f6%D\u0013\u00d1\u00e5\u0088D\fj\u00a2\u00e3\u00cd<J\u00ce\u0089\u00e5\u00e8K\u00c7\u00d5\u00fbB\u0082".length();
                    var5_7 = 48;
                    var4_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = CP_ql.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        CP_ql.b = var9_3;
        CP_ql.c = new String[18];
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4786;
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
                throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/CP_ql", exception);
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
            CP_ql.c[n2] = CP_ql.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_ql.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/CP_ql" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_ql.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

