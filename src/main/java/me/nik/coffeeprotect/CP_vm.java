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
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.CP_Wa;
import me.nik.coffeeprotect.CP_Wk;
import me.nik.coffeeprotect.CP_Wu;
import me.nik.coffeeprotect.CP_Wy;
import me.nik.coffeeprotect.CP_jR;
import me.nik.coffeeprotect.CP_vn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public class CP_vm
implements CP_jR {
    private final Queue<CP_vn> CP_S = new ConcurrentLinkedQueue<CP_vn>();
    private CP_Wa CP_i;
    private final CoffeeProtect CP_B;
    private boolean CP_E;
    private static int[] CP_n;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String vOafSRxacR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_vm(CoffeeProtect coffeeProtect) {
        this.CP_B = coffeeProtect;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void CP_C() {
        int n;
        int[] nArray;
        block9: {
            long l = a ^ 0x3763A203D94CL;
            String string = CP_Oq.LOGS_TYPE.CP_d().toLowerCase();
            nArray = CP_vm.CP_f();
            int n2 = -1;
            n = string.hashCode();
            if (nArray == null) break block9;
            switch (n) {
                case 104382626: {
                    n = string.equals(CP_vm.a("d", (int)13859, (long)(0x524F06AFE7BAE199L ^ l))) ? 1 : 0;
                    if (nArray != null) {
                        if (n == 0) break;
                        n2 = 0;
                        if (nArray != null) break;
                    }
                    break block9;
                }
                case -894935028: {
                    n = string.equals(CP_vm.a("d", (int)29833, (long)(0x17E328971F21A332L ^ l))) ? 1 : 0;
                    if (nArray == null) break block9;
                    if (n == 0) break;
                    n2 = 1;
                }
            }
            n = n2;
        }
        switch (n) {
            case 0: {
                this.CP_i = new CP_Wk(this.CP_B);
                if (nArray != null) break;
            }
            case 1: {
                this.CP_i = new CP_Wy(this.CP_B);
                if (nArray != null) break;
            }
            default: {
                this.CP_i = new CP_Wu(this.CP_B);
            }
        }
        this.CP_i.CP_E();
    }

    public Queue<CP_vn> CP_G() {
        return this.CP_S;
    }

    public void CP_k(CP_vn ilIlvn) {
        long l = a ^ 0x1EB66C98219DL;
        int[] nArray = CP_vm.CP_f();
        boolean bl = CP_Oq.LOGS_ENABLED.CP_t();
        if (nArray != null) {
            if (!bl) {
                return;
            }
            bl = this.CP_S.add(ilIlvn);
        }
    }

    public void CP_j() {
        this.CP_S.clear();
    }

    public CP_Wa CP_E() {
        return this.CP_i;
    }

    public boolean CP_D() {
        return this.CP_E;
    }

    public void CP_Z(boolean bl) {
        this.CP_E = bl;
    }

    @Override
    public void CP_y() {
        this.CP_S.clear();
        this.CP_i.CP_k();
    }

    public static void CP_Q(int[] nArray) {
        CP_n = nArray;
    }

    public static int[] CP_f() {
        return CP_n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(-7117541135591449591L, -7385734332546418096L, MethodHandles.lookup().lookupClass()).a(135538223695792L);
        d = new HashMap(13);
        CP_vm.CP_Q(new int[4]);
        long l = a ^ 0x61106D34C770L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "%\u00ca\u001d\u00e2\u007f\u00adBO.\u00f7<f\u0001\u00a7\u0015\u0096\u0010\u0007\u00e5\u0003\u00d7M\u00f5\u00f5\u007f\u00f5\u0081\u00fa\u0086.\u00f1:\b";
        int n2 = "%\u00ca\u001d\u00e2\u007f\u00adBO.\u00f7<f\u0001\u00a7\u0015\u0096\u0010\u0007\u00e5\u0003\u00d7M\u00f5\u00f5\u007f\u00f5\u0081\u00fa\u0086.\u00f1:\b".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_vm.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6FAD;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_vm", exception);
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
            CP_vm.c[n2] = CP_vm.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_vm.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_vm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_vm.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
