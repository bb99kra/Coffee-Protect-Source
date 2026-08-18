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
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_OI;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_Zb;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_is;

public class CP_iw
extends CP_is {
    private final Callable<Map<String, int[]>> CP_U;
    private static final long a = CP_s.a(2161330130299528854L, -8628110990753286432L, MethodHandles.lookup().lookupClass()).a(109671068974058L);
    private static final String f;
    private static transient /* synthetic */ String IUtRGNYdzb = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_iw(String string, Callable<Map<String, int[]>> callable) {
        super(string);
        this.CP_U = callable;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected CP_OI CP_S() throws Exception {
        int n;
        CP_Zb ilIlZb;
        block18: {
            void var6_6;
            boolean bl;
            int n2;
            Map<String, int[]> map;
            block16: {
                block17: {
                    Map<String, int[]> map2;
                    block15: {
                        long l = a ^ 0x48AAA1C29AF7L;
                        ilIlZb = new CP_Zb();
                        map = this.CP_U.call();
                        n2 = CP_is.CP_q();
                        try {
                            map2 = map;
                            if (n2 == 0) break block15;
                            if (map2 == null) return null;
                        }
                        catch (Exception exception) {
                            throw CP_iw.a(exception);
                        }
                        map2 = map;
                    }
                    try {
                        try {
                            bl = map2.isEmpty();
                            if (n2 == 0) break block16;
                            if (!bl) break block17;
                            return null;
                        }
                        catch (Exception exception) {
                            throw CP_iw.a(exception);
                        }
                    }
                    catch (Exception exception) {
                        throw CP_iw.a(exception);
                    }
                }
                bl = true;
            }
            boolean bl2 = bl;
            for (Map.Entry<String, int[]> entry : map.entrySet()) {
                boolean bl3;
                block19: {
                    block20: {
                        try {
                            try {
                                try {
                                    n = entry.getValue().length;
                                    if (n2 == 0) break block18;
                                    if (n2 == 0) break block19;
                                }
                                catch (Exception exception) {
                                    throw CP_iw.a(exception);
                                }
                                if (n != 0) break block20;
                            }
                            catch (Exception exception) {
                                throw CP_iw.a(exception);
                            }
                            if (n2 != 0) continue;
                        }
                        catch (Exception exception) {
                            throw CP_iw.a(exception);
                        }
                    }
                    bl3 = false;
                }
                var6_6 = bl3;
                ilIlZb.CP_J(entry.getKey(), entry.getValue());
                if (n2 != 0) continue;
            }
            n = var6_6;
        }
        try {
            if (n == false) return new CP_Zb().CP_S(f, ilIlZb.CP_d()).CP_d();
            return null;
        }
        catch (Exception exception) {
            throw CP_iw.a(exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x41D2EEF372B6L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00d4\u008a\u00bc\u0081!\u00a5\u00cdM".getBytes("ISO-8859-1"));
                f = CP_iw.b(byArray3).intern();
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

