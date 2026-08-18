/*
 * Decompiled with CFR 0.152.
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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_Wa;
import me.nik.coffeeprotect.CP_rW;
import me.nik.coffeeprotect.CP_vn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.serializer.SequentialNBTReader;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public class CP_Wy
extends CP_Wa {
    private Connection CP_T;
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
    private static transient /* synthetic */ String vEmFavAEVH = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Wy(CoffeeProtect coffeeProtect) {
        super(coffeeProtect);
    }

    @Override
    public void CP_E() {
        CompletableFuture.runAsync(() -> {
            block11: {
                long l = a ^ 0x1D71206C578DL;
                String[] stringArray = SequentialNBTReader.CP_i();
                try {
                    block9: {
                        File file;
                        block10: {
                            file = new File(this.CP_K.getDataFolder(), (String)((Object)CP_Wy.a("a", (int)20748, (long)(0x22642775F6BD2573L ^ l))));
                            if (stringArray != null) break block9;
                            try {
                                block13: {
                                    if (file.exists()) break block10;
                                    break block13;
                                    catch (SQLException sQLException) {
                                        throw CP_Wy.a(sQLException);
                                    }
                                }
                                file.createNewFile();
                            }
                            catch (SQLException sQLException) {
                                throw CP_Wy.a(sQLException);
                            }
                        }
                        Class.forName((String)((Object)CP_Wy.a("a", (int)22241, (long)(0x54E2E2CDDB1E2293L ^ l))));
                        this.CP_T = DriverManager.getConnection((String)((Object)CP_Wy.a("a", (int)27603, (long)(0x5DFB2F96029C9FA9L ^ l))) + file);
                    }
                    PreparedStatement preparedStatement = this.CP_T.prepareStatement((String)((Object)CP_Wy.a("a", (int)31589, (long)(0x25DB8F03CD5E8F00L ^ l))));
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    PreparedStatement preparedStatement2 = this.CP_l().prepareStatement((String)((Object)CP_Wy.a("a", (int)22776, (long)(0xE66D33952212C9BL ^ l))));
                    ResultSet resultSet = preparedStatement2.executeQuery();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String)((Object)CP_Wy.a("a", (int)13245, (long)(0x459DC47AAD2D47C4L ^ l))));
                    Date date = new Date(System.currentTimeMillis());
                    while (resultSet.next()) {
                        block12: {
                            long l2 = Math.abs(simpleDateFormat.parse(resultSet.getString((String)((Object)CP_Wy.a("a", (int)28334, (long)(0x727CBFFC2F2D9ADDL ^ l))))).getTime() - date.getTime());
                            try {
                                if (stringArray != null) break block11;
                                if (l2 <= CP_C) break block12;
                            }
                            catch (SQLException sQLException) {
                                throw CP_Wy.a(sQLException);
                            }
                            PreparedStatement preparedStatement3 = this.CP_l().prepareStatement((String)((Object)CP_Wy.a("a", (int)5471, (long)(0xC23A059415E612AL ^ l))));
                            preparedStatement3.setInt(1, resultSet.getInt((String)((Object)CP_Wy.a("a", (int)20215, (long)(0x2CEAF728F554BA96L ^ l)))));
                            preparedStatement3.executeUpdate();
                        }
                        if (stringArray == null) continue;
                    }
                    resultSet.close();
                }
                catch (IOException | ClassNotFoundException | SQLException | ParseException exception) {
                    CP_rW.CP_U(new String[]{CP_Wy.a("a", (int)26463, (long)(0x59E0541056159329L ^ l))});
                    exception.printStackTrace();
                }
            }
        });
    }

    public boolean CP_F() {
        long l = a ^ 0x47C37A4D7D4L;
        return this.CP_T != null;
    }

    public Connection CP_l() {
        return this.CP_T;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void CP_k() {
        block6: {
            var1_1 = CP_Wy.a ^ 31815744851028L;
            var3_2 = SequentialNBTReader.CP_i();
            v0 = this;
            if (var3_2 != null) ** GOTO lbl18
            try {
                block7: {
                    if (v0.CP_F()) break block6;
                    break block7;
                    catch (SQLException v1) {
                        throw CP_Wy.a(v1);
                    }
                }
                return;
            }
            catch (SQLException v2) {
                throw CP_Wy.a(v2);
            }
        }
        try {
            v0 = this;
lbl18:
            // 2 sources

            v0.CP_T.close();
        }
        catch (SQLException var4_3) {
            var4_3.printStackTrace();
        }
    }

    @Override
    public void CP_y(Collection<CP_vn> collection) {
        block6: {
            long l = a ^ 0x277ED2573FFBL;
            String[] stringArray = SequentialNBTReader.CP_i();
            try {
                PreparedStatement preparedStatement = this.CP_l().prepareStatement((String)((Object)CP_Wy.a("a", (int)25551, (long)(0x4C35A4C453657FC1L ^ l))));
                for (CP_vn ilIlvn : collection) {
                    try {
                        preparedStatement.setString(1, ilIlvn.CP_d());
                        preparedStatement.setString(2, ilIlvn.CP_i());
                        preparedStatement.setString(3, ilIlvn.CP_Y());
                        preparedStatement.setString(4, ilIlvn.CP_j());
                        preparedStatement.setString(5, ilIlvn.CP_J());
                        preparedStatement.setString((int)CP_Wy.b("x", (int)18925, (long)(0x237EC36B3A969543L ^ l)), ilIlvn.CP_L());
                        preparedStatement.addBatch();
                        if (stringArray == null) {
                            if (stringArray == null) continue;
                            break;
                        }
                        break block6;
                    }
                    catch (SQLException sQLException) {
                        throw CP_Wy.a(sQLException);
                    }
                }
                preparedStatement.executeBatch();
                preparedStatement.close();
                preparedStatement.getConnection().close();
            }
            catch (SQLException sQLException) {
                sQLException.printStackTrace();
            }
        }
    }

    @Override
    public void CP_E(CP_vn ilIlvn) {
        long l = a ^ 0x49A07F3CCDF8L;
        String string = ilIlvn.CP_d();
        String string2 = ilIlvn.CP_i();
        String string3 = ilIlvn.CP_Y();
        String string4 = ilIlvn.CP_j();
        String string5 = ilIlvn.CP_J();
        String string6 = ilIlvn.CP_L();
        try {
            PreparedStatement preparedStatement = this.CP_l().prepareStatement((String)((Object)CP_Wy.a("a", (int)23092, (long)(0x32AC0D529639B423L ^ l))));
            preparedStatement.setString(1, string);
            preparedStatement.setString(2, string2);
            preparedStatement.setString(3, string3);
            preparedStatement.setString(4, string4);
            preparedStatement.setString(5, string5);
            preparedStatement.setString((int)CP_Wy.b("x", (int)22272, (long)(0x27E457A342EE79ACL ^ l)), string6);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }
        catch (SQLException sQLException) {
            sQLException.printStackTrace();
        }
    }

    @Override
    public List<CP_vn> CP_z() {
        long l = a ^ 0x4385BED02D16L;
        CompletableFuture<List> completableFuture = CompletableFuture.supplyAsync(() -> {
            long l = a ^ 0x3A3AC461C609L;
            String[] stringArray = SequentialNBTReader.CP_i();
            try {
                ArrayList<CP_vn> arrayList;
                block6: {
                    ArrayList<CP_vn> arrayList2 = new ArrayList<CP_vn>();
                    PreparedStatement preparedStatement = this.CP_l().prepareStatement((String)((Object)CP_Wy.a("a", (int)1516, (long)(0x49F2B286B70FE00EL ^ l))));
                    ResultSet resultSet = preparedStatement.executeQuery();
                    while (resultSet.next()) {
                        try {
                            arrayList = arrayList2;
                            if (stringArray == null) {
                                arrayList.add(new CP_vn(resultSet.getString((String)((Object)CP_Wy.a("a", (int)20290, (long)(0x55DF3044F7792ABAL ^ l)))), resultSet.getString((String)((Object)CP_Wy.a("a", (int)23268, (long)(0x2B0A5E10A6C2BF00L ^ l)))), resultSet.getString((String)((Object)CP_Wy.a("a", (int)4373, (long)(0x45DED2C546AB74E1L ^ l)))), resultSet.getString((String)((Object)CP_Wy.a("a", (int)27199, (long)(0x1E2A42243D130FCAL ^ l)))), resultSet.getString((String)((Object)CP_Wy.a("a", (int)15818, (long)(0x663BC32625AED835L ^ l)))), resultSet.getString((String)((Object)CP_Wy.a("a", (int)29862, (long)(0x4967AB766EBA115CL ^ l))))));
                                if (stringArray == null) continue;
                                break;
                            }
                            break block6;
                        }
                        catch (SQLException sQLException) {
                            throw CP_Wy.a(sQLException);
                        }
                    }
                    arrayList = arrayList2;
                }
                return arrayList;
            }
            catch (SQLException sQLException) {
                sQLException.printStackTrace();
                return new ArrayList();
            }
        });
        try {
            return completableFuture.get((long)CP_Wy.c("k", (int)29893, (long)(0x659D868F59C1F5ECL ^ l)), TimeUnit.SECONDS);
        }
        catch (InterruptedException | ExecutionException | TimeoutException exception) {
            CP_rW.CP_U(new String[]{CP_Wy.a("a", (int)15860, (long)(0x6D08ECEBB4373305L ^ l))});
            exception.printStackTrace();
            return new ArrayList<CP_vn>();
        }
    }

    @Override
    public List<CP_vn> CP_V(String string) {
        long l = a ^ 0x65A38E060ED7L;
        CompletableFuture<List> completableFuture = CompletableFuture.supplyAsync(() -> {
            long l = a ^ 0x788E3B06752DL;
            String[] stringArray = SequentialNBTReader.CP_i();
            try {
                ArrayList<CP_vn> arrayList;
                block6: {
                    ArrayList<CP_vn> arrayList2 = new ArrayList<CP_vn>();
                    PreparedStatement preparedStatement = this.CP_l().prepareStatement((String)((Object)CP_Wy.a("a", (int)27758, (long)(0x25DF729FB5ACBABAL ^ l))));
                    preparedStatement.setString(1, string);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    while (resultSet.next()) {
                        try {
                            arrayList = arrayList2;
                            if (stringArray == null) {
                                arrayList.add(new CP_vn(resultSet.getString((String)((Object)CP_Wy.a("a", (int)20938, (long)(0x2FF212FA83130703L ^ l)))), resultSet.getString((String)((Object)CP_Wy.a("a", (int)29736, (long)(0x1502A1B3AF7C22EFL ^ l)))), resultSet.getString((String)((Object)CP_Wy.a("a", (int)31679, (long)(0x5C9CDD2D482E2D77L ^ l)))), resultSet.getString((String)((Object)CP_Wy.a("a", (int)8217, (long)(0x459805286DF8F6C4L ^ l)))), resultSet.getString((String)((Object)CP_Wy.a("a", (int)17267, (long)(0x3C9AD3766B6695B7L ^ l)))), resultSet.getString((String)((Object)CP_Wy.a("a", (int)28334, (long)(0x727CDA033447B87DL ^ l))))));
                                if (stringArray == null) continue;
                                break;
                            }
                            break block6;
                        }
                        catch (SQLException sQLException) {
                            throw CP_Wy.a(sQLException);
                        }
                    }
                    arrayList = arrayList2;
                }
                return arrayList;
            }
            catch (SQLException sQLException) {
                sQLException.printStackTrace();
                return new ArrayList();
            }
        });
        try {
            return completableFuture.get((long)CP_Wy.c("k", (int)15135, (long)(0x65666511454C19F6L ^ l)), TimeUnit.SECONDS);
        }
        catch (InterruptedException | ExecutionException | TimeoutException exception) {
            CP_rW.CP_U(new String[]{CP_Wy.a("a", (int)9429, (long)(0x7D541D4D9A2C89F8L ^ l))});
            exception.printStackTrace();
            return new ArrayList<CP_vn>();
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
                        block17: {
                            block16: {
                                CP_Wy.a = CP_s.a(-5114933899683678939L, -1261896619791762339L, MethodHandles.lookup().lookupClass()).a(280309320847248L);
                                CP_Wy.d = new HashMap<K, V>(13);
                                var22 = CP_Wy.a ^ 120156984133560L;
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
                                var31_3 = new String[27];
                                var29_4 = 0;
                                var28_5 = "\u0099\u0084\u0005\u00ac\u00f6\u00bc\u00bb\u009b\u001a\u0007\u009a\u00a4i\u00f5X\u00e4\u00186Y\u00b8\u0090*\u0099\u000eX\u00ffT^\u00cb\u008a1X\u0012\t\u0099\u001a\u00fe\u00f7\u0004b\u00ec f\u00db\u008flN\u00b6\"\u001e\u00ea\u00e6H\u00f5`\u00ea\u009b@\u00a2\u008a\u0004\u0011M-\u00b6\u0081\u00b2\u0086\u0087\u00a4B\u00e0,t\u0018^\u00fd\u0018[\u00cd\u00a8\u00d8\u0002h8\n}\u0010\u00d61\u00f0\u0095\u001bR\u00c0~\u00f6\u00c8\u001bHs\u00e6;5E\u00a0fHc\n\u00a8\u00c9K\u0011\u00d3\u0091\u0013\u001ez\u00c1\u00e2\u00fd\u00cf\u00d6\u00a5\u00ff\u001b\u001e\u00f6\u00f0+\u0010\u00d6+\u008aE\u0010\u00da\u0003a\u00fc\u00cc\b\u00ef\u00dc\u00ce\u00fd\u00e3u/`\u008b\u00a0F\u0083\u007f\u00d9\u007f\u00e9\u00f7`\\E\u0087\u0007E\u00be\u00e22N,8P'=\u0015\u00ff\u00dee\u000f\u00afo\u0018\u007f\"\u00b8\u008dnkkF\u00f7\u001c\u00eb\u0090\u0011Ap\u00a8\u00b5\u00d0\u00d1`\u00ac[\u00b1=\u00dcW\u008e\u00e4d\u00b5\u001aCvw\u00f4\u0099XQ\u0017\u00eb`s\u00bc\u000fn9\u00a8C.\u00c0\u00f8c*f\u001b\u009cEH\u00e1j\u00f9\u00d5_4|ZG\u00bf\u00fb\u00c40.t\u0084<}LZ\u0097b\u0081\u0010z\u00e5-\u00f1\u00d1\u00be<7\u00aa9\u0095\u0014\u0010XO\u001b\u00eey\u00e7\u001b\u00f4\"z(\u00f83g\u00d0\u000bD\u0002\u00ceZ\u0010\u00d6}\u00d5X\u00f3\u00b6\u00a8$\u0014\u00ba`\u0012\u00d11\u00a35}3u\u001d\u00ca\rD\u00cb\u00fc&YG\u00cde\u00a8iVD\u00e38\u00d6\u00a9\b\u00f8\u0098\u00a3\u00a2h=\u000b;\u0088\u00c7\u00f6\u001ckvN('G\u00dcL\u00deW\u00d3ME\u00fc]yHw\u00ee\u00887I\u00c5{\u001ah\u001e\u00cc\u00fa\u0014f\u00959\u00b6`\u00c3$\u0012\u008c\u000f&\u00c0L\u009e\u0018\u00bf\u001f-\u00b5h\u00c1\u00d7\u0015\u00ee+]t\u0094e\u00f8\u00d2]\u00f6\u00cb\u0000g\u00d5\u00ae\u00f6\u001ex\u00ba\u0080j\u0093\u00051\u009a\u00e3\u0014p\u00bc\u009c\u00b6%tb$\u00a3_\u0004\u00d5\u00de\t\u0089V\u00d4\u0000\u009d\u00c4\u008d\u009d[A]\u00102_*-)\u00eapn\u00dc\u0094V\u00a7x$\u009e\u0007\u0006=\u0012\u00b4q\u008ai\u00e2\u009a[[vx\u00c1V\u00feC%\u009eD\n\u00064\u0085\u0006+\u009c\u0017\fQ\u00ec\u00fbs\u0011\u00bc\u0095X\u00a9\u0010\u00f8~&\u00a0\u00f9G\u00c6\u00af\u0083\u00ba\u00cf\u0011\u008f\r\u00b4\u00a9\u00f0\f\u00f8\u0003+\u008f~\u00c7\u00ca\u00e2j\u00e3\u0013\u0012\u0094W\u008f\u0097\u0093\u00e1\u00a1\u0081W\u00db\u00ec\u00dbM\u009f0\u000bO\u00fd\u00ed\u00d4\u00dfh5Gr1u\u00b9\u008f\u001f=\u00c3\u00ec*5\u009a$\u0003\u00fb\u0011x\u00f05(\u00f9\u00dcK\u00f0\u0085\u00d7s\u00dd\u00da\u00f0\u00c1,j<\u00c6\u00e1q\u0089\u00c4\u00f0\u0011\u00b7\u00a1\u009e\u0011x\u00e43\u008b\u00d2\u00b2\u00df\u00b2\u00f0}V\u0089k\u00cd\u00bc\u0018\u00f2j\u00a5\u00cb\u0096\u00be\u001a\u00d7\u00e0`I\u00f1\u00c9fN\u00f6'\u00b9]B\u0088\u00f1qb\u0018\u00d7T\u000f\u00b7\u00fa\r|u~W\u00e0i\u00f2\u0017\u00b2\u00e7\u00ae\u00c73\u00da\"\b3C\u0010\u007f\u00c4\u00d8~}\u00db\"\u00bb\u00f5\u00de\u008e\u0084\u00c6\u00f8\u00fb\u00d6 \u00b4o\u00fc\u0097\u00b4\u00dc\u009b&\u00f2\u00e9\u0001\u008e\u00ab+\u00ac\u000b\u001c\u000b\u00ec\u00fa+%\u001bdZ\u00a0\u00a9\u00ba2S\u00ba\u0098 \u00ff\u00dbd\u00e2\u008e\u0089\u00de\u00e04F\u00a8g\u00df)\u00db\u00de\u00ebm3\u000f!\u00de\u00ed0<\u009af}g\u00d8\u008c\u00c5\u0010\u00a3\u00151'\u000bS\u00c3;\u00eb!\u00e6\u00fc\u00dd\u00a7|\u00cc\u0010\u00a4\u00f8\u00a7V\u001bl\u00e0\u00f8\u00aa+\u00dc[\u00f0\u008d\u009f\u00dc\u0010\u0004\u00ea\u009dc@\u00cc\u009c\u00c1\u00a7?&c\u0011f\u00d8\u00c8\u00b8i\u00b7\u00d7X\u00a6\u00c3\u00e7f\u00b5#\u00af\u00c5%\u0003?\u00b8U\u0092\u0002\u0017\u00e7g`[Q8\u00f8\u0006\u00b2\u00c8\u00f0TQ\u00b4q\u009bX\u00baK\u0018\u00b8\u0016\u00fb\u00f2.1]\u00bd\u001c+\u0091\u008b\u00d5#\u00d0!GH\u00cf\u00c0\u00a3\u00c1t\u00f9\u00e2$&\u00fb_IM\u00ec\u00bc}K\u00d9X\u000bi\u00b0v\u00b2\u00fc'\u00d8C\u00cd\u00ba\u000b\u001a\u00f1\u008dJQ|g\u0004b\u0092#A`\u00cf\u00db\u00dd/J\u009by\u00bd\u00eddw\u0019%r\u00e1\u00bee\u00efL\u00e3\u0089\u0001\u00cb3)\u0090@\u00eb\u0006{s\u0083\u00a2\u00c7\u00e1;i\u00bc\u0019\u00ba\u0092\u009b\u00fbh\u00a6R?@\u00c0\u0083\u0011\u0006\u0086\u00d9\u0097H\u0015\u00fa&\u0013\u0086\u00b4\u00ba`w\u0081\u00e8\u0012\u009f\u00a9\u00fdY\u00dbk\u00ab\u00d9\u0011.\u00c8\u00d0\u00d3]@\u008dp\u00d06H\u00c5m\u00b3\u00ca\u00db\u00f8y\u008f\u0080;\u00e3N\u0093\u00b1\u0016\u00d6i\u00f0\n\u00b7\u00f5\u0099\u0016_\u007f\u000e\u00c0\u00f5\u001c\u00ae0!,\u00f6\u00de0\u00daC@\u00aa\u00b9\u0087b\u001b\u00aeS\u0090\u00e9\u0004#\u0085]\u0000\u0002\u00d5\\\u00ca\u00e6\u00f7 \u00a6h\n\u00bb\u000eAo+\u00e1\u00b4\u00a3o\u000b\u00ec\b\u00d1\u00937X\u00f4O\u00df\u009a\u009c\u00c0l\u00eb\u001a\u0012x\u00aft\u0148\u00f791\u00c1l\u0090v\u001aS!ya\u008b\u0089\u0019\u00f3\u00ba\u001e.n\u00ed]\u00fb#\"\u0080\u00b8\u00c1s\u00c8X\u00baS9q\u00a8\u00a9\u00ecEG\u00ba/\u00d5q\u00d0\u00bf\u007f\u00ff\u0016\u0013!\u0014nr\u00eb8\u00ceS\u00be\u0000\u00eaI{O\u0000\u00bf\u00f4\u00ce2\u00a6)Q\u00c9\u0002G\u00ef\u00ad\u00eb\u000e|;\u00ecP\u00f3`\u00db\u0086 \u00eaV\u008c,f\u0012-I\u00f2Q\u00a0\u00d8\u00a3\u00a2\u00b7\u009f7\u0086\u00c1\u00fd\u00d8\u0016\u00dd\u00d5.!;-J\u00b41\u00e6#\u0082kj\u00bb\u00c6M\u0006M\tp\u00c8\u00ed\u0091\u00e3\u009e\u001bC0\u00d0\u007f\u00e9\u0080\u008b\u00d2\u00c34H\u00bf\u00bd\u0002\u00a2?\u00cf\u001d*\u00da\u00fa\u0091:6r\u00b3\u0000\"\u00f3\u009e\u008ey\u00f3\u008e\u00f3\u00df\u0097\u00c3J\u00bb\u00be\u00c9\u0012 \u00f8<z5\u00f6\u0091k\u00da\n\b\u00a3\u00a8LJ\u00d7\u00ac\u008a\u00c5\u00e5Cn\u001f\u009f\u008b\u0091v \t\u00a1\b\u00a5\u00e6cTay\u00a0,\u00bed\u008b\b$\u00ba<\u0091\u0094\u0091i\u009a\u00fb\u0094\u009bD\u00ab\u00d0\u00e1\t\u00e3\u00a6U\u00f5\t\u00d1\u0018\u00c2\u00c7\u0006\u00bf:#`\u00d6\u0015a\u00eeq^3o+\u00af\u00c7\u00e7\u0092\u00b33P4\u00a2\u00f2\u0006-\n2\u00c4_\u0091\u00ba\u00b8\u0094$\u00dal\u00f3\u0094p\n\u001fh}d\u00a5\u00ed\u00f9\u008a\u0091x\u00b7\u00eaV\u00c0\u008b\u0012z\u00f5<\f%U\u0092P\u00cf!\u008c\u00ed\u00a6\u00c3u\u00ecC2\u00f6\u009a\u00fasU@\u0090\u00aa\u0001\u00ed\u00a7\u00d7-\u0006\u00a3\u0098\u0017\u008d8\u0019\u00b1\u007f\u00fd\u00d6G\u00a2\u000b\u0001;\u0094\u0016\u0006S;?\u0089Ii\u00a3\u009d\u001e\u00d6\u00bc\u009f\u0091by8s\u0086{\u0096\u00db\u00e4\u00c6oL\u00a1\u0001\u00fb\f\u00d8|\u00b9\u001e#\u009cR\u0002\u00ea\u0010\u00d39\u001d\u009f*\u00ff\u00a74\u00b4\u00bb?\u007f[%X\u00ec\u0010\u001f\u00f3\u00d9c\u0017\u00f9$\u00d3\u0095-\u00ad\u0005\u00e6\u00af~>";
                                var30_6 = "\u0099\u0084\u0005\u00ac\u00f6\u00bc\u00bb\u009b\u001a\u0007\u009a\u00a4i\u00f5X\u00e4\u00186Y\u00b8\u0090*\u0099\u000eX\u00ffT^\u00cb\u008a1X\u0012\t\u0099\u001a\u00fe\u00f7\u0004b\u00ec f\u00db\u008flN\u00b6\"\u001e\u00ea\u00e6H\u00f5`\u00ea\u009b@\u00a2\u008a\u0004\u0011M-\u00b6\u0081\u00b2\u0086\u0087\u00a4B\u00e0,t\u0018^\u00fd\u0018[\u00cd\u00a8\u00d8\u0002h8\n}\u0010\u00d61\u00f0\u0095\u001bR\u00c0~\u00f6\u00c8\u001bHs\u00e6;5E\u00a0fHc\n\u00a8\u00c9K\u0011\u00d3\u0091\u0013\u001ez\u00c1\u00e2\u00fd\u00cf\u00d6\u00a5\u00ff\u001b\u001e\u00f6\u00f0+\u0010\u00d6+\u008aE\u0010\u00da\u0003a\u00fc\u00cc\b\u00ef\u00dc\u00ce\u00fd\u00e3u/`\u008b\u00a0F\u0083\u007f\u00d9\u007f\u00e9\u00f7`\\E\u0087\u0007E\u00be\u00e22N,8P'=\u0015\u00ff\u00dee\u000f\u00afo\u0018\u007f\"\u00b8\u008dnkkF\u00f7\u001c\u00eb\u0090\u0011Ap\u00a8\u00b5\u00d0\u00d1`\u00ac[\u00b1=\u00dcW\u008e\u00e4d\u00b5\u001aCvw\u00f4\u0099XQ\u0017\u00eb`s\u00bc\u000fn9\u00a8C.\u00c0\u00f8c*f\u001b\u009cEH\u00e1j\u00f9\u00d5_4|ZG\u00bf\u00fb\u00c40.t\u0084<}LZ\u0097b\u0081\u0010z\u00e5-\u00f1\u00d1\u00be<7\u00aa9\u0095\u0014\u0010XO\u001b\u00eey\u00e7\u001b\u00f4\"z(\u00f83g\u00d0\u000bD\u0002\u00ceZ\u0010\u00d6}\u00d5X\u00f3\u00b6\u00a8$\u0014\u00ba`\u0012\u00d11\u00a35}3u\u001d\u00ca\rD\u00cb\u00fc&YG\u00cde\u00a8iVD\u00e38\u00d6\u00a9\b\u00f8\u0098\u00a3\u00a2h=\u000b;\u0088\u00c7\u00f6\u001ckvN('G\u00dcL\u00deW\u00d3ME\u00fc]yHw\u00ee\u00887I\u00c5{\u001ah\u001e\u00cc\u00fa\u0014f\u00959\u00b6`\u00c3$\u0012\u008c\u000f&\u00c0L\u009e\u0018\u00bf\u001f-\u00b5h\u00c1\u00d7\u0015\u00ee+]t\u0094e\u00f8\u00d2]\u00f6\u00cb\u0000g\u00d5\u00ae\u00f6\u001ex\u00ba\u0080j\u0093\u00051\u009a\u00e3\u0014p\u00bc\u009c\u00b6%tb$\u00a3_\u0004\u00d5\u00de\t\u0089V\u00d4\u0000\u009d\u00c4\u008d\u009d[A]\u00102_*-)\u00eapn\u00dc\u0094V\u00a7x$\u009e\u0007\u0006=\u0012\u00b4q\u008ai\u00e2\u009a[[vx\u00c1V\u00feC%\u009eD\n\u00064\u0085\u0006+\u009c\u0017\fQ\u00ec\u00fbs\u0011\u00bc\u0095X\u00a9\u0010\u00f8~&\u00a0\u00f9G\u00c6\u00af\u0083\u00ba\u00cf\u0011\u008f\r\u00b4\u00a9\u00f0\f\u00f8\u0003+\u008f~\u00c7\u00ca\u00e2j\u00e3\u0013\u0012\u0094W\u008f\u0097\u0093\u00e1\u00a1\u0081W\u00db\u00ec\u00dbM\u009f0\u000bO\u00fd\u00ed\u00d4\u00dfh5Gr1u\u00b9\u008f\u001f=\u00c3\u00ec*5\u009a$\u0003\u00fb\u0011x\u00f05(\u00f9\u00dcK\u00f0\u0085\u00d7s\u00dd\u00da\u00f0\u00c1,j<\u00c6\u00e1q\u0089\u00c4\u00f0\u0011\u00b7\u00a1\u009e\u0011x\u00e43\u008b\u00d2\u00b2\u00df\u00b2\u00f0}V\u0089k\u00cd\u00bc\u0018\u00f2j\u00a5\u00cb\u0096\u00be\u001a\u00d7\u00e0`I\u00f1\u00c9fN\u00f6'\u00b9]B\u0088\u00f1qb\u0018\u00d7T\u000f\u00b7\u00fa\r|u~W\u00e0i\u00f2\u0017\u00b2\u00e7\u00ae\u00c73\u00da\"\b3C\u0010\u007f\u00c4\u00d8~}\u00db\"\u00bb\u00f5\u00de\u008e\u0084\u00c6\u00f8\u00fb\u00d6 \u00b4o\u00fc\u0097\u00b4\u00dc\u009b&\u00f2\u00e9\u0001\u008e\u00ab+\u00ac\u000b\u001c\u000b\u00ec\u00fa+%\u001bdZ\u00a0\u00a9\u00ba2S\u00ba\u0098 \u00ff\u00dbd\u00e2\u008e\u0089\u00de\u00e04F\u00a8g\u00df)\u00db\u00de\u00ebm3\u000f!\u00de\u00ed0<\u009af}g\u00d8\u008c\u00c5\u0010\u00a3\u00151'\u000bS\u00c3;\u00eb!\u00e6\u00fc\u00dd\u00a7|\u00cc\u0010\u00a4\u00f8\u00a7V\u001bl\u00e0\u00f8\u00aa+\u00dc[\u00f0\u008d\u009f\u00dc\u0010\u0004\u00ea\u009dc@\u00cc\u009c\u00c1\u00a7?&c\u0011f\u00d8\u00c8\u00b8i\u00b7\u00d7X\u00a6\u00c3\u00e7f\u00b5#\u00af\u00c5%\u0003?\u00b8U\u0092\u0002\u0017\u00e7g`[Q8\u00f8\u0006\u00b2\u00c8\u00f0TQ\u00b4q\u009bX\u00baK\u0018\u00b8\u0016\u00fb\u00f2.1]\u00bd\u001c+\u0091\u008b\u00d5#\u00d0!GH\u00cf\u00c0\u00a3\u00c1t\u00f9\u00e2$&\u00fb_IM\u00ec\u00bc}K\u00d9X\u000bi\u00b0v\u00b2\u00fc'\u00d8C\u00cd\u00ba\u000b\u001a\u00f1\u008dJQ|g\u0004b\u0092#A`\u00cf\u00db\u00dd/J\u009by\u00bd\u00eddw\u0019%r\u00e1\u00bee\u00efL\u00e3\u0089\u0001\u00cb3)\u0090@\u00eb\u0006{s\u0083\u00a2\u00c7\u00e1;i\u00bc\u0019\u00ba\u0092\u009b\u00fbh\u00a6R?@\u00c0\u0083\u0011\u0006\u0086\u00d9\u0097H\u0015\u00fa&\u0013\u0086\u00b4\u00ba`w\u0081\u00e8\u0012\u009f\u00a9\u00fdY\u00dbk\u00ab\u00d9\u0011.\u00c8\u00d0\u00d3]@\u008dp\u00d06H\u00c5m\u00b3\u00ca\u00db\u00f8y\u008f\u0080;\u00e3N\u0093\u00b1\u0016\u00d6i\u00f0\n\u00b7\u00f5\u0099\u0016_\u007f\u000e\u00c0\u00f5\u001c\u00ae0!,\u00f6\u00de0\u00daC@\u00aa\u00b9\u0087b\u001b\u00aeS\u0090\u00e9\u0004#\u0085]\u0000\u0002\u00d5\\\u00ca\u00e6\u00f7 \u00a6h\n\u00bb\u000eAo+\u00e1\u00b4\u00a3o\u000b\u00ec\b\u00d1\u00937X\u00f4O\u00df\u009a\u009c\u00c0l\u00eb\u001a\u0012x\u00aft\u0148\u00f791\u00c1l\u0090v\u001aS!ya\u008b\u0089\u0019\u00f3\u00ba\u001e.n\u00ed]\u00fb#\"\u0080\u00b8\u00c1s\u00c8X\u00baS9q\u00a8\u00a9\u00ecEG\u00ba/\u00d5q\u00d0\u00bf\u007f\u00ff\u0016\u0013!\u0014nr\u00eb8\u00ceS\u00be\u0000\u00eaI{O\u0000\u00bf\u00f4\u00ce2\u00a6)Q\u00c9\u0002G\u00ef\u00ad\u00eb\u000e|;\u00ecP\u00f3`\u00db\u0086 \u00eaV\u008c,f\u0012-I\u00f2Q\u00a0\u00d8\u00a3\u00a2\u00b7\u009f7\u0086\u00c1\u00fd\u00d8\u0016\u00dd\u00d5.!;-J\u00b41\u00e6#\u0082kj\u00bb\u00c6M\u0006M\tp\u00c8\u00ed\u0091\u00e3\u009e\u001bC0\u00d0\u007f\u00e9\u0080\u008b\u00d2\u00c34H\u00bf\u00bd\u0002\u00a2?\u00cf\u001d*\u00da\u00fa\u0091:6r\u00b3\u0000\"\u00f3\u009e\u008ey\u00f3\u008e\u00f3\u00df\u0097\u00c3J\u00bb\u00be\u00c9\u0012 \u00f8<z5\u00f6\u0091k\u00da\n\b\u00a3\u00a8LJ\u00d7\u00ac\u008a\u00c5\u00e5Cn\u001f\u009f\u008b\u0091v \t\u00a1\b\u00a5\u00e6cTay\u00a0,\u00bed\u008b\b$\u00ba<\u0091\u0094\u0091i\u009a\u00fb\u0094\u009bD\u00ab\u00d0\u00e1\t\u00e3\u00a6U\u00f5\t\u00d1\u0018\u00c2\u00c7\u0006\u00bf:#`\u00d6\u0015a\u00eeq^3o+\u00af\u00c7\u00e7\u0092\u00b33P4\u00a2\u00f2\u0006-\n2\u00c4_\u0091\u00ba\u00b8\u0094$\u00dal\u00f3\u0094p\n\u001fh}d\u00a5\u00ed\u00f9\u008a\u0091x\u00b7\u00eaV\u00c0\u008b\u0012z\u00f5<\f%U\u0092P\u00cf!\u008c\u00ed\u00a6\u00c3u\u00ecC2\u00f6\u009a\u00fasU@\u0090\u00aa\u0001\u00ed\u00a7\u00d7-\u0006\u00a3\u0098\u0017\u008d8\u0019\u00b1\u007f\u00fd\u00d6G\u00a2\u000b\u0001;\u0094\u0016\u0006S;?\u0089Ii\u00a3\u009d\u001e\u00d6\u00bc\u009f\u0091by8s\u0086{\u0096\u00db\u00e4\u00c6oL\u00a1\u0001\u00fb\f\u00d8|\u00b9\u001e#\u009cR\u0002\u00ea\u0010\u00d39\u001d\u009f*\u00ff\u00a74\u00b4\u00bb?\u007f[%X\u00ec\u0010\u001f\u00f3\u00d9c\u0017\u00f9$\u00d3\u0095-\u00ad\u0005\u00e6\u00af~>".length();
                                var27_7 = 16;
                                var26_8 = -1;
lbl20:
                                // 2 sources

                                while (true) {
                                    v3 = ++var26_8;
                                    v4 = var28_5.substring(v3, v3 + var27_7);
                                    v5 = -1;
                                    break block16;
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = CP_Wy.a(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "\u000e\u00d2\u0000\u000ft\u0092|\u0014z\u00b3\u009fQ5/$+XE\u009a\u00e5\u00aeE|&\u00cc\u0019\u00ff\u00e5\u0080y\u00daF\u00957\u0082\u00cf\u00c2\u00edh,\u00af\f\tf\u00far\u00ab\u00c5\u0080\u00cd\u00e7\u0006\\\u0018Ke\u009ay\u00e2\u00faI\u00e4hT\u00d5\u00edmy\u00d1\u0080\u0093\u0002\u0015\u007fY\u0084\rj\u00d4\u0088\u00ed^\u00a3,\u00f3tB\u00e8\u00a0\u00bb\u0011\u00a7X\u0098\u0002\u0010\u00deK\u00e5\u00a8\u00d1\u00ec\u00f7V\u00a0";
                                    var30_6 = "\u000e\u00d2\u0000\u000ft\u0092|\u0014z\u00b3\u009fQ5/$+XE\u009a\u00e5\u00aeE|&\u00cc\u0019\u00ff\u00e5\u0080y\u00daF\u00957\u0082\u00cf\u00c2\u00edh,\u00af\f\tf\u00far\u00ab\u00c5\u0080\u00cd\u00e7\u0006\\\u0018Ke\u009ay\u00e2\u00faI\u00e4hT\u00d5\u00edmy\u00d1\u0080\u0093\u0002\u0015\u007fY\u0084\rj\u00d4\u0088\u00ed^\u00a3,\u00f3tB\u00e8\u00a0\u00bb\u0011\u00a7X\u0098\u0002\u0010\u00deK\u00e5\u00a8\u00d1\u00ec\u00f7V\u00a0".length();
                                    var27_7 = 16;
                                    var26_8 = -1;
lbl34:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var26_8;
                                        v4 = var28_5.substring(v6, v6 + var27_7);
                                        v5 = 0;
                                        break block16;
                                        break;
                                    }
                                    break;
                                }
lbl39:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = CP_Wy.a(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    break block17;
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
                        CP_Wy.b = var31_3;
                        CP_Wy.c = new String[27];
                        CP_Wy.g = new HashMap<K, V>(13);
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
                        var17_12 = new long[2];
                        var14_13 = 0;
                        var15_14 = "\u00fcw\u00c7\u00bby\"\u00e0\u008fb\u0016\u001aj\u00d30\u0017>";
                        var16_15 = "\u00fcw\u00c7\u00bby\"\u00e0\u008fb\u0016\u001aj\u00d30\u0017>".length();
                        var13_16 = 0;
                        while (true) {
                            break block18;
                            break;
                        }
lbl73:
                        // 1 sources

                        while (true) {
                            var17_12[v10] = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
                            if (var13_16 < var16_15) ** continue;
                            break block19;
                            break;
                        }
                    }
                    var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                    v10 = var14_13++;
                    var19_18 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    ** while (true)
                }
                CP_Wy.e = var17_12;
                CP_Wy.f = new Integer[2];
                CP_Wy.j = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v11 = SecretKeyFactory.getInstance("DES");
                v12 = new byte[8];
                v13 = v12;
                v12[0] = (byte)(var22 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v13 = v13;
                    v13[var1_21] = (byte)(var22 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v11.generateSecret(new DESKeySpec(v13)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[2];
                var3_23 = 0;
                var4_24 = "\u0019\u0089\u0016\u00ce:\u00ce\u0088\u009f\u00b0G\u00ebR=TD\u008f";
                var5_25 = "\u0019\u0089\u0016\u00ce:\u00ce\u0088\u009f\u00b0G\u00ebR=TD\u008f".length();
                var2_26 = 0;
                while (true) {
                    break block20;
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    var6_22[v14] = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
                    if (var2_26 < var5_25) ** continue;
                    break block21;
                    break;
                }
            }
            var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
            v14 = var3_23++;
            var8_28 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            ** while (true)
        }
        CP_Wy.h = var6_22;
        CP_Wy.i = new Long[2];
    }

    private static SQLException a(SQLException sQLException) {
        return sQLException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2E5A;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_Wy", exception);
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
            CP_Wy.c[n2] = CP_Wy.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_Wy.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_Wy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6EF3;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_Wy", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Wy.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Wy.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_Wy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2199;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_Wy", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            CP_Wy.i[n2] = l4;
        }
        return i[n2];
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = CP_Wy.c(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_Wy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Wy.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_Wy.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CP_Wy.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
