/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CheckException;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_l;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public final class CP_qb {
    private static String CP_u;
    private static int CP_c;
    private static String[] CP_b;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static transient /* synthetic */ String HwHbvoguDm = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_qb() {
    }

    private static String CP_u() {
        String string;
        block4: {
            block5: {
                long l = a ^ 0x7C31CE09C580L;
                String[] stringArray = CP_qb.CP_t();
                try {
                    try {
                        string = CP_u;
                        if (stringArray == null) break block4;
                        if (string != null) break block5;
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        throw CP_qb.a(arrayIndexOutOfBoundsException);
                    }
                    CP_u = Bukkit.getServer().getClass().getName().split((String)((Object)CP_qb.a("n", (int)14180, (long)(0x603AA96D0DA7FBCFL ^ l))))[3];
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw CP_qb.a(arrayIndexOutOfBoundsException);
                }
            }
            string = CP_u;
        }
        return string;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static int CP_c() {
        var0 = CP_qb.a ^ 26139065612240L;
        var2_1 = CP_qb.CP_t();
        try {
            v0 = CP_qb.CP_c;
            if (var2_1 == null) ** GOTO lbl10
            ** GOTO lbl13
        }
        catch (ArrayIndexOutOfBoundsException v1) {
            try {
                block9: {
                    throw CP_qb.a(v1);
lbl10:
                    // 1 sources

                    return v0;
lbl13:
                    // 2 sources

                    if (v0 == -1) break block9;
lbl14:
                    // 3 sources

                    while (true) {
                        v0 = CP_qb.CP_c;
                        return v0;
                    }
                }
                try {}
                catch (ArrayIndexOutOfBoundsException var3_2) {
                    // empty catch block
                    ** GOTO lbl14
                }
            }
            catch (CheckException v2) {
                throw CP_qb.a(v2);
            }
        }
        CP_qb.CP_c = Integer.parseInt(CP_qb.CP_u().split("_")[1]);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static Object CP_Q(Player var0) {
        block5: {
            var1_1 = CP_qb.a ^ 11238119870472L;
            var4_2 = CP_qb.CP_r(var0.getClass(), (String)CP_qb.a("n", (int)25329, (long)(7134140484868013011L ^ var1_1)), new Class[0]);
            var3_3 = CP_qb.CP_t();
            try {
                v0 = var4_2;
                if (var3_3 != null) {
                    if (v0 == null) break block5;
                }
                ** GOTO lbl14
            }
            catch (Exception v1) {
                throw CP_qb.a(v1);
            }
            try {
                v0 = var4_2.invoke((Object)var0, new Object[0]);
lbl14:
                // 2 sources

                var5_4 = v0;
                var6_6 = CP_qb.CP_k(var5_4.getClass(), (String)CP_qb.a("n", (int)8804, (long)(5502356480332249924L ^ var1_1)));
                return var6_6.get(var5_4);
            }
            catch (Exception var5_5) {
                var5_5.printStackTrace();
            }
        }
        return null;
    }

    public static void CP_M(Player player, Object object) {
        block8: {
            Object object2;
            Object object3;
            String[] stringArray;
            Object object4;
            long l;
            block6: {
                block7: {
                    l = a ^ 0xBED7462EDB7L;
                    object4 = CP_qb.CP_Q(player);
                    stringArray = CP_qb.CP_t();
                    try {
                        object3 = object4;
                        if (stringArray == null) break block6;
                        if (object3 != null) break block7;
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        throw CP_qb.a(illegalAccessException);
                    }
                    return;
                }
                object3 = object4;
            }
            Method method = CP_qb.CP_r(object3.getClass(), (String)((Object)CP_qb.a("n", (int)26437, (long)(0x647F7288B2CB03DCL ^ l))), CP_qb.CP_p((String)((Object)CP_qb.a("n", (int)25667, (long)(0x3DE39CE97E7780D5L ^ l)))));
            try {
                object2 = method;
                if (stringArray == null) break block8;
                if (object2 == null) break block8;
            }
            catch (IllegalAccessException illegalAccessException) {
                throw CP_qb.a(illegalAccessException);
            }
            try {
                object2 = method.invoke(object4, object);
            }
            catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
                reflectiveOperationException.printStackTrace();
            }
        }
    }

    public static Class<?> CP_o(String string, String string2) {
        Class<?> clazz;
        Object object;
        StringBuilder stringBuilder;
        String[] stringArray;
        long l;
        block7: {
            block8: {
                l = a ^ 0x3FF90FEE9DFFL;
                stringArray = CP_qb.CP_t();
                try {
                    try {
                        stringBuilder = new StringBuilder();
                        object = CP_qb.a("n", (int)8204, (long)(0x3E11F295A32134DFL ^ l));
                        if (stringArray == null) break block7;
                        stringBuilder = stringBuilder.append((String)object);
                        if (CP_qb.CP_c() < CP_qb.b("g", (int)8251, (long)(0x4FA4FB71121D024L ^ l))) break block8;
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        throw CP_qb.a(arrayIndexOutOfBoundsException);
                    }
                    object = string2;
                    break block7;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw CP_qb.a(arrayIndexOutOfBoundsException);
                }
            }
            object = (String)((Object)CP_qb.a("n", (int)10289, (long)(0x64E84ACDB706BCE3L ^ l))) + CP_qb.CP_u();
        }
        try {
            clazz = CP_qb.CP_T(stringBuilder.append((String)object).append((char)CP_qb.b("g", (int)7170, (long)(0x1AFA3BF5926CEC1CL ^ l))).append(string).toString());
            if (stringArray == null) {
                PacketWrapper.CP_e(new int[1]);
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw CP_qb.a(arrayIndexOutOfBoundsException);
        }
        return clazz;
    }

    public static Class<?> CP_p(String string) {
        long l = a ^ 0x50302C32693BL;
        return CP_qb.CP_T((String)((Object)CP_qb.a("n", (int)28298, (long)(0x4CFB8F97C738E9EL ^ l))) + CP_qb.CP_u() + "." + string);
    }

    public static Class<?> CP_e(String string) {
        Class<?> clazz;
        long l = a ^ 0x3D56884C031BL;
        String[] stringArray = CP_qb.CP_t();
        try {
            clazz = CP_qb.CP_T((String)((Object)CP_qb.a("n", (int)9725, (long)(0x58E56FDD62CD2FC5L ^ l))) + CP_qb.CP_u() + "." + string);
            if (PacketWrapper.CP_z() == null) {
                CP_qb.CP_x(new String[2]);
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw CP_qb.a(arrayIndexOutOfBoundsException);
        }
        return clazz;
    }

    public static Class<?> CP_T(String string) {
        try {
            return Class.forName(CP_l.a(string));
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static Method CP_r(Class<?> var0, String var1_1, Class<?> ... var2_2) {
        block5: {
            var3_3 = CP_qb.a ^ 102676389831443L;
            var5_4 = CP_qb.CP_t();
            try {
                v0 = var0;
                if (var5_4 != null) {
                    if (v0 == null) break block5;
                }
                ** GOTO lbl13
            }
            catch (NoSuchMethodException v1) {
                throw CP_qb.a(v1);
            }
            try {
                v0 = var0;
lbl13:
                // 2 sources

                v2 = var2_2;
                return v0.getMethod(CP_l.b(var1_1, v0, v2), v2);
            }
            catch (NoSuchMethodException var6_5) {
                // empty catch block
            }
        }
        return null;
    }

    public static Method CP_C(Class<?> clazz, Class<?> clazz2) {
        block10: {
            Class<?> clazz3;
            String[] stringArray;
            block9: {
                long l = a ^ 0x188D70DA90EDL;
                stringArray = CP_qb.CP_t();
                try {
                    clazz3 = clazz;
                    if (stringArray == null) break block9;
                    if (clazz3 == null) break block10;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw CP_qb.a(arrayIndexOutOfBoundsException);
                }
                clazz3 = clazz;
            }
            for (Method method : clazz3.getDeclaredMethods()) {
                block11: {
                    try {
                        block12: {
                            try {
                                try {
                                    if (stringArray == null) break block11;
                                    if (clazz2.equals(method.getReturnType())) break block12;
                                }
                                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                    throw CP_qb.a(arrayIndexOutOfBoundsException);
                                }
                                if (!clazz2.isAssignableFrom(method.getReturnType())) continue;
                            }
                            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                throw CP_qb.a(arrayIndexOutOfBoundsException);
                            }
                        }
                        method.setAccessible(true);
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        throw CP_qb.a(arrayIndexOutOfBoundsException);
                    }
                }
                return method;
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static Field CP_k(Class<?> clazz, String string) {
        Class<?> clazz2;
        long l = a ^ 0x7C30A0B91640L;
        String[] stringArray = CP_qb.CP_t();
        try {
            clazz2 = clazz;
            if (stringArray == null) return clazz2.getField(CP_l.c(clazz2, string));
            if (clazz2 == null) return null;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw CP_qb.a(noSuchFieldException);
        }
        try {
            clazz2 = clazz;
            return clazz2.getField(CP_l.c(clazz2, string));
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        return null;
    }

    public static Field CP_c(Class<?> clazz, Class<?> clazz2) {
        block10: {
            Class<?> clazz3;
            String[] stringArray;
            block9: {
                long l = a ^ 0x489DCD8352DEL;
                stringArray = CP_qb.CP_t();
                try {
                    clazz3 = clazz;
                    if (stringArray == null) break block9;
                    if (clazz3 == null) break block10;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw CP_qb.a(arrayIndexOutOfBoundsException);
                }
                clazz3 = clazz;
            }
            for (Field field : clazz3.getDeclaredFields()) {
                block11: {
                    try {
                        block12: {
                            try {
                                try {
                                    if (stringArray == null) break block11;
                                    if (clazz2.equals(field.getType())) break block12;
                                }
                                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                    throw CP_qb.a(arrayIndexOutOfBoundsException);
                                }
                                if (!clazz2.isAssignableFrom(field.getType())) continue;
                            }
                            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                throw CP_qb.a(arrayIndexOutOfBoundsException);
                            }
                        }
                        field.setAccessible(true);
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        throw CP_qb.a(arrayIndexOutOfBoundsException);
                    }
                }
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public static Method CP_L(Class<?> var0, Class<?> ... var1_1) {
        block5: {
            var2_2 = CP_qb.a ^ 80143521682031L;
            var4_3 = CP_qb.CP_t();
            try {
                v0 = var0;
                if (var4_3 != null) {
                    if (v0 == null) break block5;
                }
                ** GOTO lbl14
            }
            catch (ReflectiveOperationException v1) {
                throw CP_qb.a(v1);
            }
            try {
                v0 = var0;
lbl14:
                // 2 sources

                var5_4 = v0.getDeclaredMethod(CP_l.b((String)CP_qb.a("n", (int)5517, (long)(2915871585188744896L ^ var2_2)), v0, var1_1), var1_1);
                var5_4.setAccessible(true);
                return var5_4;
            }
            catch (ReflectiveOperationException var5_5) {
                // empty catch block
            }
        }
        return null;
    }

    public static Constructor<?> CP_N(Class<?> clazz, Class<?> ... classArray) {
        try {
            return clazz.getConstructor(classArray);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
    }

    public static void CP_p() {
        long l = a ^ 0x60F235AA889AL;
        try {
            Class[] classArray = new Class[]{Plugin.class};
            Class clazz = Bukkit.getPluginManager().getClass();
            Method method = clazz.getMethod(CP_l.b((String)((Object)CP_qb.a("n", (int)5285, (long)(0x2B69D5F550F1951FL ^ l))), clazz, classArray), classArray);
            method.invoke((Object)Bukkit.getPluginManager(), new Object[]{CoffeeProtect.CP_J()});
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            throw new CheckException((String)((Object)CP_qb.a("n", (int)9201, (long)(0x3C04F04D1794A242L ^ l))) + reflectiveOperationException.getLocalizedMessage());
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
                        CP_qb.a = CP_s.a(-405204590271000971L, 5376183334798735545L, MethodHandles.lookup().lookupClass()).a(35604887288511L);
                        CP_qb.d = new HashMap<K, V>(13);
                        var11 = CP_qb.a ^ 68711458153437L;
                        CP_qb.CP_x(new String[4]);
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
                        var20_3 = new String[12];
                        var18_4 = 0;
                        var17_5 = "\u00f9\u00c3>#\u00a9\u0092Or|\u00ca\u000f6\u00ed\u0093\u0007\u00a39O\"\u00e4\u00ca\u0098W\u00dc\u0082@\u00cb\u00987\u00d2\u0097\u00b4\u0010;\u0015\u00a6\u001b\u0090\u008d\u0002L\u00ce\u0017\u00a9\u00b1]\u0081\f\u00de(\u00a8\u00f8}\u00a7F|\"[\u00db\u0091\u00ab\u00bfe\u0011\u008c\u00f7B\"\\\u009b'%\u00e5Fd=\u00f9\u000e\u00f0!\u008f7\u0002\u00bb}\u000e\u0006I\u00e7|0\n\u00cbs\u000e\u00851\u001f\u0006\u00cc@\u00ae+\u00a9\u0086\u009cr\u00e1a\u007f\u00f8~\u00f8\u00fb\u00f9A\u00d8\u00ee\u00b7\u00f4l\u00c7\u00d2G\u00bd/\u0005k\u0004\u0086*\u00ce\u00b0\u0085_U\u00db\u00df\u00a9 \u0012\u00bf\u00a7\u00d7\u00a9\u00a7\u009b\b\u00e2H\u0088\u0092kD\u0098\u001fi~\u00fai\u0014S6E~\u0011E\u00a7\u00edu\u000f\u001e(\u00f4NT?\u000f11D\u00f1\"\u00e5\u00afL\u0082\u00c1cK\u0003-\u00e8\u0086\u00fc\u007fG\u0005$W\u008d\u00fc\u00b1\u00a8\u0007\u0019\u009db-\u00d2\u00c5\u00c5*\u0018`\u00acq\u00a98'sN\u00a9\u00d8V\u0088\u00b2\u00a3\u009c7\u0012\u00e3\f\u00b8i\u0018\u00c1\u001b\u0010\u0005\u0014\u009d\u0016\u00ad\u00bc\u00c2\u00c6o\u00d9\u00877\u00e7-\u00b8\u00f5 K`\u00c7\u00d1\u008d\u00f9\u00b0\u0096\u00d2\u00a1\u00a3\u00c5\u00bb\u00a3lyQ\u0088\u00b6\u008a\u00d8}\u008a\u00f2\u00fd\u0017\u00bc\u001e:\u00f9\u00a2&(sH\u0098\u0099\u00b1j\u00b0\u00bf\u00e1\u0097f\u0017\u009f\u00fb\u0083\u00b5\u00d8s'OVdS\u0001\u00bef\u009f\u00dd\u0099\u00d7\u008d\u00b3n\u00984\u00e1\u001a\u00ebz\u00e2";
                        var19_6 = "\u00f9\u00c3>#\u00a9\u0092Or|\u00ca\u000f6\u00ed\u0093\u0007\u00a39O\"\u00e4\u00ca\u0098W\u00dc\u0082@\u00cb\u00987\u00d2\u0097\u00b4\u0010;\u0015\u00a6\u001b\u0090\u008d\u0002L\u00ce\u0017\u00a9\u00b1]\u0081\f\u00de(\u00a8\u00f8}\u00a7F|\"[\u00db\u0091\u00ab\u00bfe\u0011\u008c\u00f7B\"\\\u009b'%\u00e5Fd=\u00f9\u000e\u00f0!\u008f7\u0002\u00bb}\u000e\u0006I\u00e7|0\n\u00cbs\u000e\u00851\u001f\u0006\u00cc@\u00ae+\u00a9\u0086\u009cr\u00e1a\u007f\u00f8~\u00f8\u00fb\u00f9A\u00d8\u00ee\u00b7\u00f4l\u00c7\u00d2G\u00bd/\u0005k\u0004\u0086*\u00ce\u00b0\u0085_U\u00db\u00df\u00a9 \u0012\u00bf\u00a7\u00d7\u00a9\u00a7\u009b\b\u00e2H\u0088\u0092kD\u0098\u001fi~\u00fai\u0014S6E~\u0011E\u00a7\u00edu\u000f\u001e(\u00f4NT?\u000f11D\u00f1\"\u00e5\u00afL\u0082\u00c1cK\u0003-\u00e8\u0086\u00fc\u007fG\u0005$W\u008d\u00fc\u00b1\u00a8\u0007\u0019\u009db-\u00d2\u00c5\u00c5*\u0018`\u00acq\u00a98'sN\u00a9\u00d8V\u0088\u00b2\u00a3\u009c7\u0012\u00e3\f\u00b8i\u0018\u00c1\u001b\u0010\u0005\u0014\u009d\u0016\u00ad\u00bc\u00c2\u00c6o\u00d9\u00877\u00e7-\u00b8\u00f5 K`\u00c7\u00d1\u008d\u00f9\u00b0\u0096\u00d2\u00a1\u00a3\u00c5\u00bb\u00a3lyQ\u0088\u00b6\u008a\u00d8}\u008a\u00f2\u00fd\u0017\u00bc\u001e:\u00f9\u00a2&(sH\u0098\u0099\u00b1j\u00b0\u00bf\u00e1\u0097f\u0017\u009f\u00fb\u0083\u00b5\u00d8s'OVdS\u0001\u00bef\u009f\u00dd\u0099\u00d7\u008d\u00b3n\u00984\u00e1\u001a\u00ebz\u00e2".length();
                        var16_7 = 32;
                        var15_8 = -1;
lbl21:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = CP_qb.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u0005G\u00ab>\u00fc\u00c4\u00f8&VQl\u0091\u00d2\u00e6\u00a6m&\u00a6\u00c5\u00034\u00a8\u00f9\u00d2\u00ce\u00a0\u0085L\u008eRO\u00ff\u0010a,\u00e7\u00a3-\u00d1e\u00d3<\u0010\u0080\u00b1\u00f3\u00cb\u00f6\u000b";
                            var19_6 = "\u0005G\u00ab>\u00fc\u00c4\u00f8&VQl\u0091\u00d2\u00e6\u00a6m&\u00a6\u00c5\u00034\u00a8\u00f9\u00d2\u00ce\u00a0\u0085L\u008eRO\u00ff\u0010a,\u00e7\u00a3-\u00d1e\u00d3<\u0010\u0080\u00b1\u00f3\u00cb\u00f6\u000b".length();
                            var16_7 = 32;
                            var15_8 = -1;
lbl35:
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
lbl40:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = CP_qb.a(var21_9).intern();
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
lbl52:
                        // 1 sources

                        ** continue;
                    }
                }
                CP_qb.b = var20_3;
                CP_qb.c = new String[12];
                CP_qb.g = new HashMap<K, V>(13);
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
                var4_14 = "R\u00e1\u009c\u0086\u0096\u00f0L\u00a9\u009d\u00c5\u00b1\u000b\u00b0^ \r";
                var5_15 = "R\u00e1\u009c\u0086\u0096\u00f0L\u00a9\u009d\u00c5\u00b1\u000b\u00b0^ \r".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl74:
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
        CP_qb.e = var6_12;
        CP_qb.f = new Integer[2];
        CP_qb.CP_c = -1;
    }

    public static void CP_x(String[] stringArray) {
        CP_b = stringArray;
    }

    public static String[] CP_t() {
        return CP_b;
    }

    private static Exception a(Exception exception) {
        return exception;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x33C0;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_qb", exception);
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
            CP_qb.c[n2] = CP_qb.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_qb.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_qb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x570B;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_qb", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_qb.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_qb.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_qb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_qb.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_qb.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
