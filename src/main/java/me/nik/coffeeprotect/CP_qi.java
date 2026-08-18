/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.boss.BarColor
 *  org.bukkit.boss.BarStyle
 *  org.bukkit.entity.Player
 *  org.bukkit.util.Vector
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CP_fj;
import me.nik.coffeeprotect.CP_qb;
import me.nik.coffeeprotect.CP_rW;
import me.nik.coffeeprotect.CP_uh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class CP_qi
implements CP_fj {
    private static final Map<UUID, CP_uh> CP_g;
    private String CP_P;
    private Player CP_Y;
    private float CP_z = 100.0f;
    private static int[] CP_K;
    private static final long a;
    private static final String b;
    private static final long c;
    private static transient /* synthetic */ String lKFCFoXTtc = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private static Object CP_a(World world) {
        long l = a ^ 0x97ACCBBF8A7L;
        Object object = null;
        Method method = CP_qb.CP_r(world.getClass(), b, new Class[0]);
        try {
            object = method.invoke((Object)world, new Object[0]);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return object;
    }

    @Override
    public void CP_q(String string) {
        this.CP_P = string;
    }

    @Override
    public void CP_y(Player player) {
        this.CP_Y = player;
    }

    @Override
    public void CP_e(float f) {
        this.CP_z = f;
    }

    @Override
    public void CP_g(BarStyle barStyle) {
    }

    @Override
    public void CP_a(BarColor barColor) {
    }

    /*
     * Loose catch block
     */
    @Override
    public void CP_r() {
        long l = a ^ 0x3D026D7F2062L;
        int[] nArray = CP_qi.CP_W();
        try {
            Object object;
            CP_uh ilIluh;
            Location location;
            block7: {
                UUID uUID;
                block6: {
                    UUID uUID2;
                    Map<UUID, CP_uh> map;
                    block8: {
                        uUID = this.CP_Y.getUniqueId();
                        Vector vector = this.CP_Y.getLocation().getDirection().normalize().multiply((int)c);
                        location = this.CP_Y.getLocation().add(vector);
                        map = CP_g;
                        uUID2 = uUID;
                        if (nArray != null) break block8;
                        try {
                            block9: {
                                if (!map.containsKey(uUID2)) break block6;
                                break block9;
                                catch (InstantiationException instantiationException) {
                                    throw CP_qi.a(instantiationException);
                                }
                            }
                            map = CP_g;
                            uUID2 = uUID;
                        }
                        catch (InstantiationException instantiationException) {
                            throw CP_qi.a(instantiationException);
                        }
                    }
                    ilIluh = map.get(uUID2);
                    if (nArray == null) break block7;
                }
                ilIluh = new CP_uh(CP_rW.CP_W(this.CP_P), location, this.CP_z);
                object = ilIluh.CP_w();
                CP_qb.CP_M(this.CP_Y, object);
                CP_g.put(uUID, ilIluh);
            }
            ilIluh.CP_d(CP_rW.CP_W(this.CP_P));
            ilIluh.CP_U(this.CP_z);
            object = ilIluh.CP_x(ilIluh.CP_x());
            Object object2 = ilIluh.CP_p(location);
            CP_qb.CP_M(this.CP_Y, object);
            CP_qb.CP_M(this.CP_Y, object2);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
        }
    }

    /*
     * Loose catch block
     */
    @Override
    public void CP_E() {
        block6: {
            block7: {
                long l = a ^ 0x7CA5A3B195L;
                int[] nArray = CP_qi.CP_W();
                if (nArray != null) break block6;
                try {
                    block8: {
                        if (CP_g.containsKey(this.CP_Y.getUniqueId())) break block7;
                        break block8;
                        catch (InstantiationException instantiationException) {
                            throw CP_qi.a(instantiationException);
                        }
                    }
                    return;
                }
                catch (InstantiationException instantiationException) {
                    throw CP_qi.a(instantiationException);
                }
            }
            try {
                CP_qb.CP_M(this.CP_Y, CP_g.get(this.CP_Y.getUniqueId()).CP_f());
            }
            catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
                reflectiveOperationException.printStackTrace();
            }
        }
        CP_g.remove(this.CP_Y.getUniqueId());
    }

    static /* synthetic */ Object CP_N(World world) {
        return CP_qi.CP_a(world);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(1816178730575683160L, 2458545752890161912L, MethodHandles.lookup().lookupClass()).a(219445909100459L);
        long l = a ^ 0xEC725CD7C33L;
        CP_qi.CP_b(null);
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
        byte[] byArray3 = cipher.doFinal("$\u00ac\u00ab\u00ce\u008a\u0084[\u008dP\u009c\u0098\u00e9\u00c8\u0006a\u00c3".getBytes("ISO-8859-1"));
        b = CP_qi.a(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = 5501205932522481903L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                c = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                CP_g = new HashMap<UUID, CP_uh>();
                return;
            }
            byArray5 = byArray5;
            byArray5[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public static void CP_b(int[] nArray) {
        CP_K = nArray;
    }

    public static int[] CP_W() {
        return CP_K;
    }

    private static InstantiationException a(InstantiationException instantiationException) {
        return instantiationException;
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
}
