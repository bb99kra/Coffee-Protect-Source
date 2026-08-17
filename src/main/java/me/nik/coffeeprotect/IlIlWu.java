/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.serializer.SequentialNBTReader
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 */
package me.nik.coffeeprotect;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
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
import me.nik.coffeeprotect.IlIlWa;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.IlIlvn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.serializer.SequentialNBTReader;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlWu
extends IlIlWa {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Long[] f;
    private static final Map g;
    private static transient /* synthetic */ String YsrUJvDNzb = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlWu(CoffeeProtect coffeeProtect) {
        super(coffeeProtect);
    }

    @Override
    public void IlIlE() {
        CompletableFuture.runAsync(() -> {
            block15: {
                long l = a ^ 0x2B135D33FBC6L;
                String[] stringArray = SequentialNBTReader.IlIli();
                try {
                    int n;
                    String string;
                    File file;
                    block12: {
                        block13: {
                            file = this.IlIlK.getDataFolder();
                            if (stringArray != null) break block12;
                            try {
                                block16: {
                                    if (file.exists()) break block13;
                                    break block16;
                                    catch (ParseException parseException) {
                                        throw IlIlWu.a(parseException);
                                    }
                                }
                                this.IlIlK.getDataFolder().mkdir();
                            }
                            catch (ParseException parseException) {
                                throw IlIlWu.a(parseException);
                            }
                        }
                        file = new File(this.IlIlK.getDataFolder(), (String)((Object)IlIlWu.a("y", (int)26982, (long)(0x4BFFC7955F538844L ^ l))));
                    }
                    File file2 = file;
                    file2.createNewFile();
                    File file3 = new File(this.IlIlK.getDataFolder(), (String)((Object)IlIlWu.a("y", (int)8500, (long)(0xDD5A5A4FC62C011L ^ l))));
                    file3.createNewFile();
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file2));
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file3));
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String)((Object)IlIlWu.a("y", (int)31508, (long)(0x646F471BD901A30L ^ l))));
                    Date date = new Date(System.currentTimeMillis());
                    while ((string = bufferedReader.readLine()) != null) {
                        block14: {
                            String[] stringArray2 = string.split(",");
                            if (stringArray != null) break block14;
                            try {
                                block17: {
                                    long l2 = Math.abs(simpleDateFormat.parse(stringArray2[5]).getTime() - date.getTime()) - IlIlC;
                                    n = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                                    if (stringArray != null) break block15;
                                    break block17;
                                    catch (ParseException parseException) {
                                        throw IlIlWu.a(parseException);
                                    }
                                }
                                if (n > 0) {
                                    continue;
                                }
                            }
                            catch (ParseException parseException) {
                                throw IlIlWu.a(parseException);
                            }
                            bufferedWriter.write(string + System.lineSeparator());
                        }
                        if (stringArray == null) continue;
                    }
                    bufferedWriter.close();
                    bufferedReader.close();
                    file2.delete();
                    n = file3.renameTo(file2);
                }
                catch (IOException | ParseException exception) {
                    exception.printStackTrace();
                }
            }
        });
    }

    @Override
    public void IlIlk() {
    }

    /*
     * Loose catch block
     */
    @Override
    public void IlIly(Collection<IlIlvn> collection) {
        block11: {
            long l = a ^ 0x1202BA982F2DL;
            String[] stringArray = SequentialNBTReader.IlIli();
            try {
                File file;
                block10: {
                    file = new File(this.IlIlK.getDataFolder(), (String)((Object)IlIlWu.a("y", (int)31547, (long)(0x7EDBF42903ABCEF7L ^ l))));
                    boolean bl = file.exists();
                    if (stringArray != null) break block10;
                    try {
                        block12: {
                            if (bl) break block10;
                            break block12;
                            catch (IOException iOException) {
                                throw IlIlWu.a(iOException);
                            }
                        }
                        bl = file.createNewFile();
                    }
                    catch (IOException iOException) {
                        throw IlIlWu.a(iOException);
                    }
                }
                FileWriter fileWriter = new FileWriter(file, true);
                PrintWriter printWriter = new PrintWriter(fileWriter);
                for (IlIlvn ilIlvn : collection) {
                    try {
                        printWriter.println(ilIlvn.toString());
                        if (stringArray == null) {
                            if (stringArray == null) continue;
                            break;
                        }
                        break block11;
                    }
                    catch (IOException iOException) {
                        throw IlIlWu.a(iOException);
                    }
                }
                printWriter.flush();
                printWriter.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    @Override
    public void IlIlE(IlIlvn ilIlvn) {
        long l = a ^ 0x7CDC17F3DD2EL;
        try {
            File file = new File(this.IlIlK.getDataFolder(), (String)((Object)IlIlWu.a("y", (int)26982, (long)(0x4BFF905A1593AEACL ^ l))));
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(ilIlvn.toString());
            printWriter.flush();
            printWriter.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    /*
     * Loose catch block
     */
    @Override
    public List<IlIlvn> IlIlz() {
        File file;
        long l;
        block9: {
            File file2;
            block10: {
                l = a ^ 0x76F9D61F3DC0L;
                file2 = new File(this.IlIlK.getDataFolder(), (String)((Object)IlIlWu.a("y", (int)26982, (long)(0x4BFF9A7FD47F4E42L ^ l))));
                String[] stringArray = SequentialNBTReader.IlIli();
                file = file2;
                if (stringArray != null) break block9;
                try {
                    block11: {
                        if (file.exists()) break block10;
                        break block11;
                        catch (InterruptedException interruptedException) {
                            throw IlIlWu.a(interruptedException);
                        }
                    }
                    return new ArrayList<IlIlvn>();
                }
                catch (InterruptedException interruptedException) {
                    throw IlIlWu.a(interruptedException);
                }
            }
            file = file2;
        }
        CompletableFuture<List> completableFuture = CompletableFuture.supplyAsync(() -> {
            long l = a ^ 0x3585EE8F4981L;
            ArrayList<IlIlvn> arrayList = new ArrayList<IlIlvn>();
            String[] stringArray = SequentialNBTReader.IlIli();
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));){
                String string;
                while ((string = bufferedReader.readLine()) != null) {
                    String[] stringArray2 = string.split(",");
                    try {
                        arrayList.add(new IlIlvn(stringArray2[0], stringArray2[1], stringArray2[2], stringArray2[3], stringArray2[4], stringArray2[5]));
                        if (stringArray != null) return arrayList;
                        if (stringArray == null) continue;
                        return arrayList;
                    }
                    catch (Throwable throwable) {
                        throw IlIlWu.a(throwable);
                        return arrayList;
                    }
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            return arrayList;
        });
        try {
            return completableFuture.get((long)IlIlWu.b("g", (int)23654, (long)(0x176D610888B603DEL ^ l)), TimeUnit.SECONDS);
        }
        catch (InterruptedException | ExecutionException | TimeoutException exception) {
            ArrayList<IlIlvn> arrayList;
            try {
                IlIlrW.IlIlU(new String[]{IlIlWu.a("y", (int)26416, (long)(0x787240761863C010L ^ l))});
                exception.printStackTrace();
                arrayList = new ArrayList<IlIlvn>();
                if (PacketWrapper.IlIlz() == null) {
                    SequentialNBTReader.IlIls((String[])new String[1]);
                }
            }
            catch (InterruptedException interruptedException) {
                throw IlIlWu.a(interruptedException);
            }
            return arrayList;
        }
    }

    /*
     * Loose catch block
     */
    @Override
    public List<IlIlvn> IlIlV(String string) {
        File file;
        String[] stringArray;
        long l;
        block9: {
            File file2;
            block10: {
                l = a ^ 0x50DFE6C91E01L;
                file2 = new File(this.IlIlK.getDataFolder(), (String)((Object)IlIlWu.a("y", (int)26982, (long)(0x4BFFBC59E4A96D83L ^ l))));
                stringArray = SequentialNBTReader.IlIli();
                file = file2;
                if (stringArray != null) break block9;
                try {
                    block11: {
                        if (file.exists()) break block10;
                        break block11;
                        catch (InterruptedException interruptedException) {
                            throw IlIlWu.a(interruptedException);
                        }
                    }
                    return new ArrayList<IlIlvn>();
                }
                catch (InterruptedException interruptedException) {
                    throw IlIlWu.a(interruptedException);
                }
            }
            file = file2;
        }
        CompletableFuture<List> completableFuture = CompletableFuture.supplyAsync(() -> {
            ArrayList<IlIlvn> arrayList;
            block13: {
                long l = a ^ 0x1F807ED6FD7L;
                arrayList = new ArrayList<IlIlvn>();
                String[] stringArray = SequentialNBTReader.IlIli();
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));){
                    String string2;
                    while ((string2 = bufferedReader.readLine()) != null) {
                        block14: {
                            boolean bl;
                            String[] stringArray2 = string2.split(",");
                            if (stringArray != null) break block13;
                            try {
                                block15: {
                                    bl = stringArray2[1].equalsIgnoreCase(string);
                                    if (stringArray != null) break block14;
                                    break block15;
                                    catch (Throwable throwable) {
                                        throw IlIlWu.a(throwable);
                                    }
                                }
                                if (!bl) {
                                    continue;
                                }
                            }
                            catch (Throwable throwable) {
                                throw IlIlWu.a(throwable);
                            }
                            bl = arrayList.add(new IlIlvn(stringArray2[0], stringArray2[1], stringArray2[2], stringArray2[3], stringArray2[4], stringArray2[5]));
                        }
                        if (stringArray == null) continue;
                        break;
                    }
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
            return arrayList;
        });
        try {
            return completableFuture.get((long)IlIlWu.b("g", (int)26629, (long)(0x7DF8D13CE94F947DL ^ l)), TimeUnit.SECONDS);
        }
        catch (InterruptedException | ExecutionException | TimeoutException exception) {
            ArrayList<IlIlvn> arrayList;
            try {
                IlIlrW.IlIlU(new String[]{IlIlWu.a("y", (int)9848, (long)(0x7F38CFB0A454229CL ^ l))});
                exception.printStackTrace();
                arrayList = new ArrayList<IlIlvn>();
                if (stringArray != null) {
                    PacketWrapper.IlIle((int[])new int[3]);
                }
            }
            catch (InterruptedException interruptedException) {
                throw IlIlWu.a(interruptedException);
            }
            return arrayList;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        IlIlWu.a = IlIls.a((long)9172830593291593813L, (long)-8865949411201800308L, MethodHandles.lookup().lookupClass()).a(204359881912172L);
                        IlIlWu.d = new HashMap<K, V>(13);
                        var11 = IlIlWu.a ^ 128386288670992L;
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
                        var20_3 = new String[6];
                        var18_4 = 0;
                        var17_5 = "\u00ec\b\u0015\u00a7\u001b\u0096E\u00c4\u00a6\u00d6?\"\u00e1^YI\u00e5c90\u001d\u0017\u00b2=X\u00ed\u00e6\u0082Vn;\u0019\u00f1\u00c3f\u0011\u00e8\u0002\u00e7V\u00f6\u00f3\u00ef\u00ab\u0005\u00c9C\u00d9\u00cdK\u009e\u00f9\u0090M\u00a9\u00d2D\u00a3)/\u0004;\u00d3\u00e8b\u000e\u007f\u00c4\u0084\u00e5#O\u00eafN\u00a7\u00cc\u00e2\u000fhs}:\u00d31\u008d\u00aaX\u00ac\u00d0\u008a#\u0019W\u00caV}H\u0083\u00fe\u008dQ\u00e5\u00c2%\u0084\u00d4Y\u00e3\u0098\u00cfi@ \u00e0\u0086\u00b10\u00ba}\u00a8%\b\u0098\u00a9\u00a1Jt$\u00f9\u00c5%\u00bcf\u0007I\u00f7'\u00bf7%\u00c3\u00aah\u0081\u00e5(\u0084\u00dc@2 \u00a45i\u001e\u00f30U\u001ez\u001f%qt\u00c6>`\u00b8.\u00a6c\u00e6\u00e5\u008b{%n\u00b6KL?\u00e8\u00a1KWW";
                        var19_6 = "\u00ec\b\u0015\u00a7\u001b\u0096E\u00c4\u00a6\u00d6?\"\u00e1^YI\u00e5c90\u001d\u0017\u00b2=X\u00ed\u00e6\u0082Vn;\u0019\u00f1\u00c3f\u0011\u00e8\u0002\u00e7V\u00f6\u00f3\u00ef\u00ab\u0005\u00c9C\u00d9\u00cdK\u009e\u00f9\u0090M\u00a9\u00d2D\u00a3)/\u0004;\u00d3\u00e8b\u000e\u007f\u00c4\u0084\u00e5#O\u00eafN\u00a7\u00cc\u00e2\u000fhs}:\u00d31\u008d\u00aaX\u00ac\u00d0\u008a#\u0019W\u00caV}H\u0083\u00fe\u008dQ\u00e5\u00c2%\u0084\u00d4Y\u00e3\u0098\u00cfi@ \u00e0\u0086\u00b10\u00ba}\u00a8%\b\u0098\u00a9\u00a1Jt$\u00f9\u00c5%\u00bcf\u0007I\u00f7'\u00bf7%\u00c3\u00aah\u0081\u00e5(\u0084\u00dc@2 \u00a45i\u001e\u00f30U\u001ez\u001f%qt\u00c6>`\u00b8.\u00a6c\u00e6\u00e5\u008b{%n\u00b6KL?\u00e8\u00a1KWW".length();
                        var16_7 = 24;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = IlIlWu.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "pH\u00ea\u00cf[\u00ba;\u00e2\u00ec\u00c68STC\u0093}\u00b2\u00ed$\u00cb\u00fflT\u0017\u00c18\u00ad\u00f2aI2V\u0099_\u00ca\u00959\u00f8T*\u0092\u00c2eI\u00ca\f\u00a2\u0004\u00ca\u0014\u00c1\u0090\u00b8\u00a4Y\u00f7\u009di\u00c9\u00af\u00f6\u008e\u001d\u000b\u00bbK\u00cc=\u0010\u00ab\u00ce\u009aA\u00f7\u0087\u0003Io\u00dc\u00fe\u00c6\"(\u00d6\u0090\u00d08\u0091\u0018?\u00d7&$\u00dd\u00ebS\u00fe\u0089Ozn\u00cbc\u00dc\u009c+o\u00e3d\u00d8T4{";
                            var19_6 = "pH\u00ea\u00cf[\u00ba;\u00e2\u00ec\u00c68STC\u0093}\u00b2\u00ed$\u00cb\u00fflT\u0017\u00c18\u00ad\u00f2aI2V\u0099_\u00ca\u00959\u00f8T*\u0092\u00c2eI\u00ca\f\u00a2\u0004\u00ca\u0014\u00c1\u0090\u00b8\u00a4Y\u00f7\u009di\u00c9\u00af\u00f6\u008e\u001d\u000b\u00bbK\u00cc=\u0010\u00ab\u00ce\u009aA\u00f7\u0087\u0003Io\u00dc\u00fe\u00c6\"(\u00d6\u0090\u00d08\u0091\u0018?\u00d7&$\u00dd\u00ebS\u00fe\u0089Ozn\u00cbc\u00dc\u009c+o\u00e3d\u00d8T4{".length();
                            var16_7 = 88;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = IlIlWu.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block14;
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
                IlIlWu.b = var20_3;
                IlIlWu.c = new String[6];
                IlIlWu.g = new HashMap<K, V>(13);
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
                var6_12 = new long[2];
                var3_13 = 0;
                var4_14 = "\u00b7\u009e\u0091\u00bb_P\u0099\u009ca\u0082\u0001F\u000e\u009f\u00c2U";
                var5_15 = "\u00b7\u009e\u0091\u00bb_P\u0099\u009ca\u0082\u0001F\u000e\u009f\u00c2U".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl73:
                // 1 sources

                while (true) {
                    var6_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var2_16 < var5_15) ** continue;
                    break block16;
                    break;
                }
            }
            var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
            v10 = var3_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        IlIlWu.e = var6_12;
        IlIlWu.f = new Long[2];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x790;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlWu", exception);
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
            IlIlWu.c[n2] = IlIlWu.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlWu.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlWu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7F09;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlWu", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            IlIlWu.f[n2] = l4;
        }
        return f[n2];
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = IlIlWu.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIlWu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlWu.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(IlIlWu.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

