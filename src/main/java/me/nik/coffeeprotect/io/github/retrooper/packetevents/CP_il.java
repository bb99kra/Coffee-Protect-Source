/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_OI;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_Zb;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_is;

public class CP_il
extends CP_is {
    private final Callable<Map<String, Map<String, Integer>>> CP_W;
    private static final long a = CP_s.a(-3985483030127964001L, 18797071046444800L, MethodHandles.lookup().lookupClass()).a(130301091066275L);
    private static final String f;
    private static transient /* synthetic */ String ZpCusNivyi = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_il(String string, Callable<Map<String, Map<String, Integer>>> callable) {
        super(string);
        this.CP_W = callable;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public CP_OI CP_S() throws Exception {
        int n;
        CP_Zb ilIlZb;
        block21: {
            boolean bl;
            Map<String, Map<String, Integer>> map;
            block19: {
                block20: {
                    Map<String, Map<String, Integer>> map2;
                    block18: {
                        long l = a ^ 0x63BBBAD7BD18L;
                        ilIlZb = new CP_Zb();
                        n = CP_is.CP_m();
                        map = this.CP_W.call();
                        try {
                            map2 = map;
                            if (n != 0) break block18;
                            if (map2 == null) return null;
                        }
                        catch (Exception exception) {
                            throw CP_il.a(exception);
                        }
                        map2 = map;
                    }
                    try {
                        try {
                            bl = map2.isEmpty();
                            if (n != 0) break block19;
                            if (!bl) break block20;
                            return null;
                        }
                        catch (Exception exception) {
                            throw CP_il.a(exception);
                        }
                    }
                    catch (Exception exception) {
                        throw CP_il.a(exception);
                    }
                }
                bl = true;
            }
            boolean bl2 = bl;
            for (Map.Entry<String, Map<String, Integer>> entry : map.entrySet()) {
                block22: {
                    boolean bl3;
                    CP_Zb ilIlZb2;
                    block23: {
                        ilIlZb2 = new CP_Zb();
                        boolean bl4 = true;
                        if (n != 0) break block21;
                        for (Map.Entry<String, Integer> entry2 : map.get(entry.getKey()).entrySet()) {
                            ilIlZb2.CP_Q(entry2.getKey(), entry2.getValue());
                            bl4 = false;
                            try {
                                if (n == 0) {
                                    if (n == 0) continue;
                                    break;
                                }
                                break block22;
                            }
                            catch (Exception exception) {
                                throw CP_il.a(exception);
                            }
                        }
                        try {
                            bl3 = bl4;
                            if (n != 0) break block23;
                            if (bl3) break block22;
                        }
                        catch (Exception exception) {
                            throw CP_il.a(exception);
                        }
                        bl3 = false;
                    }
                    bl2 = bl3;
                    ilIlZb.CP_S(entry.getKey(), ilIlZb2.CP_d());
                }
                if (n == 0) continue;
            }
            try {
                if (bl2) {
                    return null;
                }
            }
            catch (Exception exception) {
                throw CP_il.a(exception);
            }
        }
        try {
            CP_OI ilIlOI = new CP_Zb().CP_S(f, ilIlZb.CP_d()).CP_d();
            if (PacketWrapper.CP_z() != null) return ilIlOI;
            CP_is.CP_n(++n);
            return ilIlOI;
        }
        catch (Exception exception) {
            throw CP_il.a(exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x1B1371EC41E1L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00ff[\u00a0\u00b8\u00ffi\u0014&".getBytes("ISO-8859-1"));
                f = CP_il.b(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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
}

