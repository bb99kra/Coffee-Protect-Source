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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.CP_Wa;
import me.nik.coffeeprotect.CP_rW;
import me.nik.coffeeprotect.CP_vn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.serializer.SequentialNBTReader;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public class CP_Wk
extends CP_Wa {
    private Connection CP_P;
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
    private static transient /* synthetic */ String MEqiVcixqB = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Wk(CoffeeProtect coffeeProtect) {
        super(coffeeProtect);
    }

    @Override
    public void CP_E() {
        CompletableFuture.runAsync(() -> {
            block7: {
                long l = a ^ 0x7114F7F7FA85L;
                String[] stringArray = SequentialNBTReader.CP_i();
                try {
                    this.CP_P = DriverManager.getConnection((String)((Object)CP_Wk.a("q", (int)28749, (long)(0x29C8507A8762BD22L ^ l))) + CP_Oq.MYSQL_HOST.CP_d() + ":" + CP_Oq.MYSQL_PORT.CP_j() + "/" + CP_Oq.MYSQL_DATABASE.CP_d() + (String)((Object)CP_Wk.a("q", (int)26660, (long)(0x17708ABFD2CC254DL ^ l))) + CP_Oq.MYSQL_USESSL.CP_t(), CP_Oq.MYSQL_USER.CP_d(), CP_Oq.MYSQL_PASSWORD.CP_d());
                    PreparedStatement preparedStatement = this.CP_P.prepareStatement((String)((Object)CP_Wk.a("q", (int)29069, (long)(0x34898B2D97ABBCE7L ^ l))));
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    Statement statement = this.CP_g().createStatement((int)CP_Wk.b("v", (int)18636, (long)(0x1ABD1C81DDD0956BL ^ l)), (int)CP_Wk.b("v", (int)18658, (long)(0x4FC542DDE1A11547L ^ l)));
                    CallSite callSite = CP_Wk.a("q", (int)31003, (long)(0x74F3D1690AC1B467L ^ l));
                    ResultSet resultSet = statement.executeQuery((String)((Object)CP_Wk.a("q", (int)24743, (long)(0x2558C9B8149DADC9L ^ l))));
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String)((Object)CP_Wk.a("q", (int)23399, (long)(0x5425A4ED66B91600L ^ l))));
                    Date date = new Date(System.currentTimeMillis());
                    while (resultSet.next()) {
                        block8: {
                            long l2 = Math.abs(simpleDateFormat.parse(resultSet.getString((String)((Object)CP_Wk.a("q", (int)25849, (long)(0xF94EF0C83812994L ^ l))))).getTime() - date.getTime());
                            if (stringArray != null) break block7;
                            try {
                                block9: {
                                    if (l2 <= CP_C) break block8;
                                    break block9;
                                    catch (SQLException sQLException) {
                                        throw CP_Wk.a(sQLException);
                                    }
                                }
                                resultSet.deleteRow();
                            }
                            catch (SQLException sQLException) {
                                throw CP_Wk.a(sQLException);
                            }
                        }
                        if (stringArray == null) continue;
                    }
                    resultSet.close();
                }
                catch (SQLException | ParseException exception) {
                    CP_rW.CP_U(new String[]{CP_Wk.a("q", (int)2545, (long)(0x161BB73DFDB04493L ^ l))});
                    exception.printStackTrace();
                    this.CP_k();
                }
            }
        });
    }

    public boolean CP_q() {
        long l = a ^ 0x4EBC7CF18FC4L;
        return this.CP_P != null;
    }

    public Connection CP_g() {
        return this.CP_P;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void CP_k() {
        block6: {
            var1_1 = CP_Wk.a ^ 53887030999916L;
            var3_2 = SequentialNBTReader.CP_i();
            v0 = this;
            if (var3_2 != null) ** GOTO lbl18
            try {
                block7: {
                    if (v0.CP_q()) break block6;
                    break block7;
                    catch (SQLException v1) {
                        throw CP_Wk.a(v1);
                    }
                }
                return;
            }
            catch (SQLException v2) {
                throw CP_Wk.a(v2);
            }
        }
        try {
            v0 = this;
lbl18:
            // 2 sources

            v0.CP_P.close();
        }
        catch (SQLException var4_3) {
            var4_3.printStackTrace();
        }
    }

    @Override
    public void CP_y(Collection<CP_vn> collection) {
        block6: {
            long l = a ^ 0xA93F12B88C3L;
            String[] stringArray = SequentialNBTReader.CP_i();
            try {
                PreparedStatement preparedStatement = this.CP_g().prepareStatement((String)((Object)CP_Wk.a("q", (int)21171, (long)(0x540BF0FCEB27ED8AL ^ l))));
                for (CP_vn ilIlvn : collection) {
                    try {
                        preparedStatement.setString(1, ilIlvn.CP_d());
                        preparedStatement.setString(2, ilIlvn.CP_i());
                        preparedStatement.setString(3, ilIlvn.CP_Y());
                        preparedStatement.setString(4, ilIlvn.CP_j());
                        preparedStatement.setString(5, ilIlvn.CP_J());
                        preparedStatement.setString((int)CP_Wk.b("v", (int)2781, (long)(0x3B22B05A1169253DL ^ l)), ilIlvn.CP_L());
                        preparedStatement.addBatch();
                        if (stringArray == null) {
                            if (stringArray == null) continue;
                            break;
                        }
                        break block6;
                    }
                    catch (SQLException sQLException) {
                        throw CP_Wk.a(sQLException);
                    }
                }
                preparedStatement.executeBatch();
                preparedStatement.close();
            }
            catch (SQLException sQLException) {
                sQLException.printStackTrace();
            }
        }
    }

    @Override
    public void CP_E(CP_vn ilIlvn) {
        long l = a ^ 0x644D5C407AC0L;
        String string = ilIlvn.CP_d();
        String string2 = ilIlvn.CP_i();
        String string3 = ilIlvn.CP_Y();
        String string4 = ilIlvn.CP_j();
        String string5 = ilIlvn.CP_J();
        String string6 = ilIlvn.CP_L();
        try {
            PreparedStatement preparedStatement = this.CP_g().prepareStatement((String)((Object)CP_Wk.a("q", (int)23353, (long)(0x39A7B83BF32F1618L ^ l))));
            preparedStatement.setString(1, string);
            preparedStatement.setString(2, string2);
            preparedStatement.setString(3, string3);
            preparedStatement.setString(4, string4);
            preparedStatement.setString(5, string5);
            preparedStatement.setString((int)CP_Wk.b("v", (int)1186, (long)(0x3F6E882B465BD943L ^ l)), string6);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }
        catch (SQLException sQLException) {
            sQLException.printStackTrace();
        }
    }

    @Override
    public List<CP_vn> CP_z() {
        long l = a ^ 0x6E689DAC9A2EL;
        CompletableFuture<List> completableFuture = CompletableFuture.supplyAsync(() -> {
            long l = a ^ 0x394F21247FD5L;
            String[] stringArray = SequentialNBTReader.CP_i();
            try {
                ArrayList<CP_vn> arrayList;
                block6: {
                    arrayList = new ArrayList<CP_vn>();
                    PreparedStatement preparedStatement = this.CP_g().prepareStatement((String)((Object)CP_Wk.a("q", (int)24743, (long)(0x255881E3C24E2899L ^ l))));
                    ResultSet resultSet = preparedStatement.executeQuery();
                    while (resultSet.next()) {
                        try {
                            arrayList.add(new CP_vn(resultSet.getString((String)((Object)CP_Wk.a("q", (int)11357, (long)(0x2A9044194D70E466L ^ l)))), resultSet.getString((String)((Object)CP_Wk.a("q", (int)31057, (long)(0x493217AFFC7F3161L ^ l)))), resultSet.getString((String)((Object)CP_Wk.a("q", (int)2614, (long)(0x618A9ACE33594205L ^ l)))), resultSet.getString((String)((Object)CP_Wk.a("q", (int)2349, (long)(0xCF98598A295C11CL ^ l)))), resultSet.getString((String)((Object)CP_Wk.a("q", (int)12346, (long)(0x5595A7D957CF812L ^ l)))), resultSet.getString((String)((Object)CP_Wk.a("q", (int)253, (long)(0x1F4ED7CB1D54C8C8L ^ l))))));
                            if (stringArray == null) {
                                if (stringArray == null) continue;
                                break;
                            }
                            break block6;
                        }
                        catch (SQLException sQLException) {
                            throw CP_Wk.a(sQLException);
                        }
                    }
                    resultSet.close();
                }
                return arrayList;
            }
            catch (SQLException sQLException) {
                sQLException.printStackTrace();
                return new ArrayList();
            }
        });
        try {
            return completableFuture.get((long)CP_Wk.c("t", (int)9386, (long)(0x519C7CEF0E424C8EL ^ l)), TimeUnit.SECONDS);
        }
        catch (InterruptedException | ExecutionException | TimeoutException exception) {
            CP_rW.CP_U(new String[]{CP_Wk.a("q", (int)6104, (long)(0x40C8798F9931BA0EL ^ l))});
            exception.printStackTrace();
            return new ArrayList<CP_vn>();
        }
    }

    @Override
    public List<CP_vn> CP_V(String string) {
        long l = a ^ 0x484EAD7AB9EFL;
        CompletableFuture<List> completableFuture = CompletableFuture.supplyAsync(() -> {
            long l = a ^ 0x7C1C1EF7D410L;
            String[] stringArray = SequentialNBTReader.CP_i();
            try {
                ArrayList<CP_vn> arrayList;
                block6: {
                    arrayList = new ArrayList<CP_vn>();
                    PreparedStatement preparedStatement = this.CP_g().prepareStatement((String)((Object)CP_Wk.a("q", (int)9348, (long)(0x3AD142950E15C76FL ^ l))));
                    preparedStatement.setString(1, string);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    while (resultSet.next()) {
                        try {
                            arrayList.add(new CP_vn(resultSet.getString((String)((Object)CP_Wk.a("q", (int)836, (long)(0x293B6BF3B22AE0ABL ^ l)))), resultSet.getString((String)((Object)CP_Wk.a("q", (int)11247, (long)(0x6ED76F4BEF63481CL ^ l)))), resultSet.getString((String)((Object)CP_Wk.a("q", (int)14187, (long)(0x4E4ABF5F00D5487L ^ l)))), resultSet.getString((String)((Object)CP_Wk.a("q", (int)26902, (long)(0x7E4F61553FA38AF8L ^ l)))), resultSet.getString((String)((Object)CP_Wk.a("q", (int)14122, (long)(0x508223AA6B7BD4D3L ^ l)))), resultSet.getString((String)((Object)CP_Wk.a("q", (int)253, (long)(0x1F4E92982287630DL ^ l))))));
                            if (stringArray == null) {
                                if (stringArray == null) continue;
                                break;
                            }
                            break block6;
                        }
                        catch (SQLException sQLException) {
                            throw CP_Wk.a(sQLException);
                        }
                    }
                    resultSet.close();
                }
                return arrayList;
            }
            catch (SQLException sQLException) {
                sQLException.printStackTrace();
                return new ArrayList();
            }
        });
        try {
            return completableFuture.get((long)CP_Wk.c("t", (int)24487, (long)(0x69379F1221079443L ^ l)), TimeUnit.SECONDS);
        }
        catch (InterruptedException | ExecutionException | TimeoutException exception) {
            CP_rW.CP_U(new String[]{CP_Wk.a("q", (int)14881, (long)(0x3D8494FE6FCC3423L ^ l))});
            exception.printStackTrace();
            return new ArrayList<CP_vn>();
        }
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
                                CP_Wk.a = CP_s.a(6431230284861264009L, 2543319736350245905L, MethodHandles.lookup().lookupClass()).a(261573155204647L);
                                CP_Wk.d = new HashMap<K, V>(13);
                                var22 = CP_Wk.a ^ 9838708330496L;
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
                                var31_3 = new String[24];
                                var29_4 = 0;
                                var28_5 = "\u00bd\u0092\u001c\u00e3\u00a7X\u00ea\u00f4\u00e8\u00fes\u00d2{?\u0010\u00fb\u0158\u00f7\u0095\u00b8T\u0087\t\\C(X\u00e0\u007f\u00ee\u00a1\u0084M?\u007f\u00cd\u00a2\u008e\u00c3\u00f6\u00a3\u00fc\u0087\u00056L\u0082\u008d\u00caf\u00cc\u009f\u00caE*#\u00b1#K!\u00f6[\u00e2>\u00d7\u00c6\u00b4\u0080^T\u00b7\u00c8Qt*z\u0001\u009a\u00a1\u00fc\u00ad\f\u0001,\u00d1\u00bf\u0003\u00fdR\u0094\u001b\u0084\u00d6:n\u0083\u00bcN(;0\u00ca0\u0092B\u0010\u00b1moE\u00b5{Q\u00bc\u00a7\u00e8q\u00cb\u00a8I|\u0001\reE\u009a?\r\u00ad\u00f3@T\u00aa>\u00dc,B\u00c0\u009b'}M\u00de\u0093}&\u00d46\u00afi\u00fbBL^\u00c6X3\u00cd\u00d2\u00e3\u0007\u0091\u00cf\u00b0\u001e\u00c2\u0003\u0018\u00ee\u00e6\u00a3{)\u00dc\u000b\u0097v\u00e2Q\u009b\u00cf\u00bdvDF\u00f62\u00a9\u00e2\u00e6\u00d1=\u00b9!G?\u00cbt\u00a0\t\u001bT\u008bf\fA\u00ce\u00d0\u00a2\u0003\u00a7\\\u00b3fc\u00c3\u0096\u009e\u0019\u00f8\u0082kf\u00bf\u00c1\u0099\u00d9\u0089\u008b\u00c6YR+\u0092\u0016l\u0017\u00bc.\u00d5\u00e7\u00c64\u00ac%\u00ce\u00ef\u00b1%\u00cfp\u00efw\u00da^\u00ab\u008b\u0003\u00c8nv7\r~\u008b-t\u00ca\u00ff\u00c5M\u0019\u00d0?\u00a3\u001bFe\u00eb\u00b4\u0095\u0015qHW]\u00e7}K\u0082\u00ed*]v\u00da\u00bc\u008dUj\u00ed\u00eb\u00f8\u00a7:5.N\r\u009a\u00c6TS\u00c4D\u0004&RZ|<Be\u00a6Y0\u00ab[\u00c2\u00f3|\tv\u00ab5\u0092\u00fb\u00ef\\\u0090\u00b3\u00a4\u001a\u0094V%\u00b2u\u00b8T{\u00be\u00c8\u001f\u00e2\u00d6\u00d7AM0\u009f\u000f\u0018(,\u0092z\u0092c\u0083\u00ff\u00f9\u00dc\u00df\u00d0\u00c7\t\u00b2\n\u00a0oG\u00f5\u0006\u00d9\u00d8XX\u00c3'XI\u000b>x\u00fb\u00b2\u00bed\u00f1\u001c]\u00a7\u00ff\u00a8\u00bc\u00df\u00e5\u00e6ZM\u00d7R\u00e9O-\u00ed\u00f5l\u009d\u0099\u00b4\u009dz\u0018\u00ed\u00ca?\u00d7\u00d9\u0081?\u00a4\u001d\u008a\u00aeG\u0083\u001f\u0003\u00f4\u00b1qlJ1)\u00dc\u001f%\u00b7\u00c5x:\u0003e\u0085\u00f1\u00c4\u0081\u001f[\u008d\u00b4$\u0014Q\u0091\u00b3\u00d9\u0014\u0018E\u00d1^\u0013 \u00a9)\u00b0Y\u0095\u0013\u0081\u0091\u00d5fY\u00ffc\u00c5i\u00d1A\u00a5\u0018\u0087\u001en\u0083\u00ef\u001dAER\u00bd\u001f\u00d35@:;0\\1%F\u00b3\u00e1&\u0001\u00b3T\u00d5_\u00d2\u008e\u000ee\u00e7\u00efU\u00de\u00fc1\u0097GM~\u0006\u009c`\u0081\u0016<\u000f\u0092L\u00d0\u00ee\u0083X\u00c123\u00f9\u00fc\u00d9\u0094\u00e8\u008c\u00a7&\u00a6\u0019\u0088\u0013)B\u0084\u00ab\u0014\u00ed\u00d4\u0018\u00ebH\u00f4\u00a0\u00c1\u00e7C2\u00f4,\u0016)\u00ae\u00e1\u00f4\u008d\u008a@\u0098\u00c5\u00fb\u00bcB\u00cb \u00eaBr\u0006\u0098\u00fa-\u0082\u0002\u00d4DA\u00c7\u00dac\u009d\u0018BX\u00e6\u008e/\u00f2\u0003\u00fb\u00da\u00e5\u00aeD\u0081c\u009a\u0010F\u00fe\u0011\u00c3\u0089\u00c4:q\u00b0\u00b8\"\u00a0\u009aK\u00b0&p\u00c7)\u00f1i\u00c7H\u001c\u00d9\u0097\u00df\u00db\u00b8\u00dak\u00db\u00a6\u00a7\u0088Dp\u00e6\u0096\u00a5?\u00f38)\u00916\u00108\\3\u009e\u00e0B\u00aerx\u00846+\u0085\u0094\u00a1\u00d6uc\u00f3$\u00b7\u0092\u00b5\u0015W\u0087a-\u0093\u00ce\u009fm\u00ad\b\u00b3\u00ac\u00f0\u00f3$\u00cd<\u00f6\u009avY\u00d0f>\u00c6\u008ek\u00bd\u00b3W`$\u00e6\u00f3c.&@W\u008b\u00bf\u00a8\u00ff#\u00d4\u00c3Fu\u0000\n\u008b\u009e[8\u00be\u00a6Iz J\u00e7\u00ec%\u009a\u0005\u00f6!A8l\u0011~D\u00ab(P\u0092R\u00b0\u00be\u008boi\u00df\u008d\u00da\u0092\u00e9)K\u00b1\u0010\u0099u\u0011\u0016\u00d9\u00b1;4\u008d\u00ae\u0019\u00f1\u00cfhW\u00a7($\u00ba\u001c>y\u000eO@h\t\u00ee\u00bc$/\u001e\u00a5\u0096\u00b1\u00c8\u00ee.^\u00c8\u00e3\u0085Z\u0018\u0018sV\u0094-\u00f4k\u00be<\u0098\u00b6\u009a\u0000\u0010|\u00eea\u009e\u00a1\u00ac\u000f\u00bb\u00c1N%\u00d5c\u00bao\u001a z\u00d6\u00bc\u0018\u00e7,\u00fc\u00c9Yu\u008e\u00b1~1\u00b9j\u0083LN\u00df\u0087\u00db\u001c\u0005c\u0000\u0017\u00e9\"\u00e7\n\u00f9\u00c0DU\u00e5\u0002&\u00e6\u00f5\u00d1\u00c3\u0096\u00fff\u0096\u00c1=r\u0002+.g\u00e3\u00eb\u00c27\u00e8\u0083s\u00c2\u008a\u00ca\u0010V\u0086?\u0007.V8\u00ee\u00e9PW\u00e7Fe2\u008b\u00da\t\u0000!\u00f992\u0081\u008d\u00a4\u008afq\u00a5\u00a3z\u00cb\u00be\u0016\u001ah\u00f7k\u00c4\u00f1\u008b\u00ff\u009akE\u00bcpO\u00d2H|p\u001d\u00bb\u00d1\u0091\u008b\u00e6\u0017\u00cc\fyr/F\u0092\u00ce\u00eb\u0018\u001c\u00c54\u000e\u00aa\u0017\u00b1\u0082\u008b$\u0007\u0007'\u00ba&g~\u00f8\u009e\u00c8\u00e8\u00a6\u00d4V\u0083\u00ecz5\u008b\u00b2D\u00c2\u00e6HDW3u|\u00bc*\u00b9}\u00a1\u008d\u00cb\u00e8\u00d3x7\u00985\u00a9^ ^\u00e6\u0014(\u00d0aR\u00fe\u00b2Le!e\u00f4\u00d1\u0003\"\u00e8\u00ec\u00fd\u0098\u00f4U\u0004\u00e7\u0084\u0097\u00fd\u00b8\u0099\u00e1\\\u00b0H\bq \u0090\u00c5\u00d5\u00c3HR\u00d0#\u00a7\u00d2,\u00c8\u00b1\u008a\u00c2\u0005\u00b5\u00a1~8l\u008b\u00aa\u009bB\u00c6\u00d7\u0099\u009e\u00e0\u00a6\u009b\u0010\u00ebv\u00d5\u00a4y\u00ff\u00a8x\u00a2\u00bd|\u009a\u0003\u0087\u00d1@\u0010ry\u00b6O>\u0014*9\u0083\u00d5O\\&\u00b1H\u000e A\u00f1-\u00dep\u008a:6o^\u009c\u00f5N\u0005\u0083\u0093{o\u00e2\u0090W\u00ef\u00f7\u0013\u00da\u000b\u0001!\u00b8\u00ddwa\u00c0\u00f10\u00f0\u000b\u00d7)W\u000f\u00d3(\u00f2m\u0003\u00e3t\u0011\u00a1\u0007\u00f73\u0014n\u00be\u0013W\u00df\u009d\u0011+\u0086?\u00c9K(\u00b3\"]`0\fk\u00ddS\u0006U\u001a\u00dc\u009d\u00d4w3\u0088\u00dd\u0006};N\r\u00f7\u00c0\u00d7~]\u00afD\u00f2\u00bf}\u00a1\u0005\u0003\u009c/\u00c0\f\u001f}\u0090\u001c\u00b1\u00c8\u0095\u00ce\u00bc\u001f\u00c3\u00c4\fL\u00d3?\u00b1`\u00b1#\u00c7\u0098\\\u00bc~\u00c7\u00de\u00ca\u00ead\u00b6/\u00cc\u00f2n5\u001d3\u008aL\u00b0\u00bb\b\u0007\n6\u0010\u0088\u00a9M\u00eb\u00a6g\u00c0\u00ca\u0017\u00c5\u0004?\u00b4\u00d1\u00c2\u00baVzSLA\u00eb\u00ff\u00b7\u0082-\u00ccW\u0019\u00ed\u0097aj\u00dd\u00a5JG\u0098K\u00eb\u00f7\u00e7x\u00abw\u00c8\u00ca \u00f3\u0004\u00aa\u00f3}\u00ef\u00bf\u00a3Q[\u00dc1\u001b\u0013\u009cpbHW\u00f1\u00ce\tP\u00ff\u008a\u0000N=%G\u00e2\u000f%\u001b\u00ef\u00d6\u0013\u00bb\u00aa,\u00a6-c\u0096\u0013\u00ea<\u00ff2:X=>\u0019B\u0081F\u0093g\u00e4H\u00f0\u00a4 |\u00dc\u00b3Y_A\u00cci\u0019|\"\u0083\u0005\u00a2\u001d\u008d\u00d1b/\u00f5\u00f0\u008f\u00ca(\u0091\u00ec\u009b.\u00ce\u0086\u008a\u009a\u0096\u00c5\u009b\u00b1Kf\u00f8";
                                var30_6 = "\u00bd\u0092\u001c\u00e3\u00a7X\u00ea\u00f4\u00e8\u00fes\u00d2{?\u0010\u00fb\u0158\u00f7\u0095\u00b8T\u0087\t\\C(X\u00e0\u007f\u00ee\u00a1\u0084M?\u007f\u00cd\u00a2\u008e\u00c3\u00f6\u00a3\u00fc\u0087\u00056L\u0082\u008d\u00caf\u00cc\u009f\u00caE*#\u00b1#K!\u00f6[\u00e2>\u00d7\u00c6\u00b4\u0080^T\u00b7\u00c8Qt*z\u0001\u009a\u00a1\u00fc\u00ad\f\u0001,\u00d1\u00bf\u0003\u00fdR\u0094\u001b\u0084\u00d6:n\u0083\u00bcN(;0\u00ca0\u0092B\u0010\u00b1moE\u00b5{Q\u00bc\u00a7\u00e8q\u00cb\u00a8I|\u0001\reE\u009a?\r\u00ad\u00f3@T\u00aa>\u00dc,B\u00c0\u009b'}M\u00de\u0093}&\u00d46\u00afi\u00fbBL^\u00c6X3\u00cd\u00d2\u00e3\u0007\u0091\u00cf\u00b0\u001e\u00c2\u0003\u0018\u00ee\u00e6\u00a3{)\u00dc\u000b\u0097v\u00e2Q\u009b\u00cf\u00bdvDF\u00f62\u00a9\u00e2\u00e6\u00d1=\u00b9!G?\u00cbt\u00a0\t\u001bT\u008bf\fA\u00ce\u00d0\u00a2\u0003\u00a7\\\u00b3fc\u00c3\u0096\u009e\u0019\u00f8\u0082kf\u00bf\u00c1\u0099\u00d9\u0089\u008b\u00c6YR+\u0092\u0016l\u0017\u00bc.\u00d5\u00e7\u00c64\u00ac%\u00ce\u00ef\u00b1%\u00cfp\u00efw\u00da^\u00ab\u008b\u0003\u00c8nv7\r~\u008b-t\u00ca\u00ff\u00c5M\u0019\u00d0?\u00a3\u001bFe\u00eb\u00b4\u0095\u0015qHW]\u00e7}K\u0082\u00ed*]v\u00da\u00bc\u008dUj\u00ed\u00eb\u00f8\u00a7:5.N\r\u009a\u00c6TS\u00c4D\u0004&RZ|<Be\u00a6Y0\u00ab[\u00c2\u00f3|\tv\u00ab5\u0092\u00fb\u00ef\\\u0090\u00b3\u00a4\u001a\u0094V%\u00b2u\u00b8T{\u00be\u00c8\u001f\u00e2\u00d6\u00d7AM0\u009f\u000f\u0018(,\u0092z\u0092c\u0083\u00ff\u00f9\u00dc\u00df\u00d0\u00c7\t\u00b2\n\u00a0oG\u00f5\u0006\u00d9\u00d8XX\u00c3'XI\u000b>x\u00fb\u00b2\u00bed\u00f1\u001c]\u00a7\u00ff\u00a8\u00bc\u00df\u00e5\u00e6ZM\u00d7R\u00e9O-\u00ed\u00f5l\u009d\u0099\u00b4\u009dz\u0018\u00ed\u00ca?\u00d7\u00d9\u0081?\u00a4\u001d\u008a\u00aeG\u0083\u001f\u0003\u00f4\u00b1qlJ1)\u00dc\u001f%\u00b7\u00c5x:\u0003e\u0085\u00f1\u00c4\u0081\u001f[\u008d\u00b4$\u0014Q\u0091\u00b3\u00d9\u0014\u0018E\u00d1^\u0013 \u00a9)\u00b0Y\u0095\u0013\u0081\u0091\u00d5fY\u00ffc\u00c5i\u00d1A\u00a5\u0018\u0087\u001en\u0083\u00ef\u001dAER\u00bd\u001f\u00d35@:;0\\1%F\u00b3\u00e1&\u0001\u00b3T\u00d5_\u00d2\u008e\u000ee\u00e7\u00efU\u00de\u00fc1\u0097GM~\u0006\u009c`\u0081\u0016<\u000f\u0092L\u00d0\u00ee\u0083X\u00c123\u00f9\u00fc\u00d9\u0094\u00e8\u008c\u00a7&\u00a6\u0019\u0088\u0013)B\u0084\u00ab\u0014\u00ed\u00d4\u0018\u00ebH\u00f4\u00a0\u00c1\u00e7C2\u00f4,\u0016)\u00ae\u00e1\u00f4\u008d\u008a@\u0098\u00c5\u00fb\u00bcB\u00cb \u00eaBr\u0006\u0098\u00fa-\u0082\u0002\u00d4DA\u00c7\u00dac\u009d\u0018BX\u00e6\u008e/\u00f2\u0003\u00fb\u00da\u00e5\u00aeD\u0081c\u009a\u0010F\u00fe\u0011\u00c3\u0089\u00c4:q\u00b0\u00b8\"\u00a0\u009aK\u00b0&p\u00c7)\u00f1i\u00c7H\u001c\u00d9\u0097\u00df\u00db\u00b8\u00dak\u00db\u00a6\u00a7\u0088Dp\u00e6\u0096\u00a5?\u00f38)\u00916\u00108\\3\u009e\u00e0B\u00aerx\u00846+\u0085\u0094\u00a1\u00d6uc\u00f3$\u00b7\u0092\u00b5\u0015W\u0087a-\u0093\u00ce\u009fm\u00ad\b\u00b3\u00ac\u00f0\u00f3$\u00cd<\u00f6\u009avY\u00d0f>\u00c6\u008ek\u00bd\u00b3W`$\u00e6\u00f3c.&@W\u008b\u00bf\u00a8\u00ff#\u00d4\u00c3Fu\u0000\n\u008b\u009e[8\u00be\u00a6Iz J\u00e7\u00ec%\u009a\u0005\u00f6!A8l\u0011~D\u00ab(P\u0092R\u00b0\u00be\u008boi\u00df\u008d\u00da\u0092\u00e9)K\u00b1\u0010\u0099u\u0011\u0016\u00d9\u00b1;4\u008d\u00ae\u0019\u00f1\u00cfhW\u00a7($\u00ba\u001c>y\u000eO@h\t\u00ee\u00bc$/\u001e\u00a5\u0096\u00b1\u00c8\u00ee.^\u00c8\u00e3\u0085Z\u0018\u0018sV\u0094-\u00f4k\u00be<\u0098\u00b6\u009a\u0000\u0010|\u00eea\u009e\u00a1\u00ac\u000f\u00bb\u00c1N%\u00d5c\u00bao\u001a z\u00d6\u00bc\u0018\u00e7,\u00fc\u00c9Yu\u008e\u00b1~1\u00b9j\u0083LN\u00df\u0087\u00db\u001c\u0005c\u0000\u0017\u00e9\"\u00e7\n\u00f9\u00c0DU\u00e5\u0002&\u00e6\u00f5\u00d1\u00c3\u0096\u00fff\u0096\u00c1=r\u0002+.g\u00e3\u00eb\u00c27\u00e8\u0083s\u00c2\u008a\u00ca\u0010V\u0086?\u0007.V8\u00ee\u00e9PW\u00e7Fe2\u008b\u00da\t\u0000!\u00f992\u0081\u008d\u00a4\u008afq\u00a5\u00a3z\u00cb\u00be\u0016\u001ah\u00f7k\u00c4\u00f1\u008b\u00ff\u009akE\u00bcpO\u00d2H|p\u001d\u00bb\u00d1\u0091\u008b\u00e6\u0017\u00cc\fyr/F\u0092\u00ce\u00eb\u0018\u001c\u00c54\u000e\u00aa\u0017\u00b1\u0082\u008b$\u0007\u0007'\u00ba&g~\u00f8\u009e\u00c8\u00e8\u00a6\u00d4V\u0083\u00ecz5\u008b\u00b2D\u00c2\u00e6HDW3u|\u00bc*\u00b9}\u00a1\u008d\u00cb\u00e8\u00d3x7\u00985\u00a9^ ^\u00e6\u0014(\u00d0aR\u00fe\u00b2Le!e\u00f4\u00d1\u0003\"\u00e8\u00ec\u00fd\u0098\u00f4U\u0004\u00e7\u0084\u0097\u00fd\u00b8\u0099\u00e1\\\u00b0H\bq \u0090\u00c5\u00d5\u00c3HR\u00d0#\u00a7\u00d2,\u00c8\u00b1\u008a\u00c2\u0005\u00b5\u00a1~8l\u008b\u00aa\u009bB\u00c6\u00d7\u0099\u009e\u00e0\u00a6\u009b\u0010\u00ebv\u00d5\u00a4y\u00ff\u00a8x\u00a2\u00bd|\u009a\u0003\u0087\u00d1@\u0010ry\u00b6O>\u0014*9\u0083\u00d5O\\&\u00b1H\u000e A\u00f1-\u00dep\u008a:6o^\u009c\u00f5N\u0005\u0083\u0093{o\u00e2\u0090W\u00ef\u00f7\u0013\u00da\u000b\u0001!\u00b8\u00ddwa\u00c0\u00f10\u00f0\u000b\u00d7)W\u000f\u00d3(\u00f2m\u0003\u00e3t\u0011\u00a1\u0007\u00f73\u0014n\u00be\u0013W\u00df\u009d\u0011+\u0086?\u00c9K(\u00b3\"]`0\fk\u00ddS\u0006U\u001a\u00dc\u009d\u00d4w3\u0088\u00dd\u0006};N\r\u00f7\u00c0\u00d7~]\u00afD\u00f2\u00bf}\u00a1\u0005\u0003\u009c/\u00c0\f\u001f}\u0090\u001c\u00b1\u00c8\u0095\u00ce\u00bc\u001f\u00c3\u00c4\fL\u00d3?\u00b1`\u00b1#\u00c7\u0098\\\u00bc~\u00c7\u00de\u00ca\u00ead\u00b6/\u00cc\u00f2n5\u001d3\u008aL\u00b0\u00bb\b\u0007\n6\u0010\u0088\u00a9M\u00eb\u00a6g\u00c0\u00ca\u0017\u00c5\u0004?\u00b4\u00d1\u00c2\u00baVzSLA\u00eb\u00ff\u00b7\u0082-\u00ccW\u0019\u00ed\u0097aj\u00dd\u00a5JG\u0098K\u00eb\u00f7\u00e7x\u00abw\u00c8\u00ca \u00f3\u0004\u00aa\u00f3}\u00ef\u00bf\u00a3Q[\u00dc1\u001b\u0013\u009cpbHW\u00f1\u00ce\tP\u00ff\u008a\u0000N=%G\u00e2\u000f%\u001b\u00ef\u00d6\u0013\u00bb\u00aa,\u00a6-c\u0096\u0013\u00ea<\u00ff2:X=>\u0019B\u0081F\u0093g\u00e4H\u00f0\u00a4 |\u00dc\u00b3Y_A\u00cci\u0019|\"\u0083\u0005\u00a2\u001d\u008d\u00d1b/\u00f5\u00f0\u008f\u00ca(\u0091\u00ec\u009b.\u00ce\u0086\u008a\u009a\u0096\u00c5\u009b\u00b1Kf\u00f8".length();
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
                                    var31_3[var29_4++] = CP_Wk.a(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = ",\u0003\u009a\u00da\u0012e\u009e\u00c0\u008c']\u00ee\u00e1\u00db \u00d9\u0006\u00b2\u00c8\u00c2d\u0018\u00c5\u00fd\u0012\u00e8\u00127\u00d2xi&D\u00cf?\u00d1\b\u00ad'\u00f9\u0010\u00cc\u00efz\u0012\u0099\u00fc\u00b6\u001er6\u00be\u00f5`\u00d7,\u00af\u00e5\u007f\u009a\u00e3\u00eb\u008bm\u00c2\u00c0\u00a3g\u0088\u00d8]\u00daP\u00dew\u00a6\u0014gs+\u00af\u00c6\u00bd\u00ee\u00e6\u00e8\u00a4J@\u00a7J\u00c1\u00d4\u00b5\u008ba\u0099\u00b8\u00fd\u007f\u0003?\u00c4\u00fb\u00a4.Z\u00e9\u00dd\u00f1QK\u00e0m\u0092Xe\u00c5\u0013R\r\u00eb\u0098\u007f\u00ea\u00ab\u00fa\u000e\u0013\u00d9\u00a6lR\u00a3m\u0086\u00bb\u00b7\u00e9,\u0099\u00a7~|\u00ab}G\u00c1M@OKW";
                                    var30_6 = ",\u0003\u009a\u00da\u0012e\u009e\u00c0\u008c']\u00ee\u00e1\u00db \u00d9\u0006\u00b2\u00c8\u00c2d\u0018\u00c5\u00fd\u0012\u00e8\u00127\u00d2xi&D\u00cf?\u00d1\b\u00ad'\u00f9\u0010\u00cc\u00efz\u0012\u0099\u00fc\u00b6\u001er6\u00be\u00f5`\u00d7,\u00af\u00e5\u007f\u009a\u00e3\u00eb\u008bm\u00c2\u00c0\u00a3g\u0088\u00d8]\u00daP\u00dew\u00a6\u0014gs+\u00af\u00c6\u00bd\u00ee\u00e6\u00e8\u00a4J@\u00a7J\u00c1\u00d4\u00b5\u008ba\u0099\u00b8\u00fd\u007f\u0003?\u00c4\u00fb\u00a4.Z\u00e9\u00dd\u00f1QK\u00e0m\u0092Xe\u00c5\u0013R\r\u00eb\u0098\u007f\u00ea\u00ab\u00fa\u000e\u0013\u00d9\u00a6lR\u00a3m\u0086\u00bb\u00b7\u00e9,\u0099\u00a7~|\u00ab}G\u00c1M@OKW".length();
                                    var27_7 = 88;
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
                                    var31_3[var29_4++] = CP_Wk.a(var32_9).intern();
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
                        CP_Wk.b = var31_3;
                        CP_Wk.c = new String[24];
                        CP_Wk.g = new HashMap<K, V>(13);
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
                        var17_12 = new long[4];
                        var14_13 = 0;
                        var15_14 = "\u0083]\u00b5\u00d8\u0096\u00ffz\u00c9z$\u0083\u00fb\u00edN;\u000e";
                        var16_15 = "\u0083]\u00b5\u00d8\u0096\u00ffz\u00c9z$\u0083\u00fb\u00edN;\u000e".length();
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
                            var15_14 = "\u007f\u0094\u00ca\u00c0[\u00d8$l\u00e2\u00e2U&t\u0018\u00fb5";
                            var16_15 = "\u007f\u0094\u00ca\u00c0[\u00d8$l\u00e2\u00e2U&t\u0018\u00fb5".length();
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
                CP_Wk.e = var17_12;
                CP_Wk.f = new Integer[4];
                CP_Wk.j = new HashMap<K, V>(13);
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
                var4_24 = "\u00dd\u00c7\u0091\u0006\u008d\u0099\u007f\u009a\u00d6\u007f\u00f7\u00d1\u001c\u00b9;\u00d9";
                var5_25 = "\u00dd\u00c7\u0091\u0006\u008d\u0099\u007f\u009a\u00d6\u007f\u00f7\u00d1\u001c\u00b9;\u00d9".length();
                var2_26 = 0;
                while (true) {
                    break block25;
                    break;
                }
lbl126:
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
        CP_Wk.h = var6_22;
        CP_Wk.i = new Long[2];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xD71;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_Wk", exception);
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
            CP_Wk.c[n2] = CP_Wk.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_Wk.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_Wk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1DBF;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_Wk", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Wk.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Wk.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_Wk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4895;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_Wk", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            CP_Wk.i[n2] = l4;
        }
        return i[n2];
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = CP_Wk.c(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_Wk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Wk.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_Wk.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CP_Wk.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
