/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
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
import me.nik.coffeeprotect.IlIlfj;
import me.nik.coffeeprotect.IlIlqb;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.IlIluh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class IlIlqi
implements IlIlfj {
    private static final Map<UUID, IlIluh> IlIlg;
    private String IlIlP;
    private Player IlIlY;
    private float IlIlz = 100.0f;
    private static int[] IlIlK;
    private static final long a;
    private static final String b;
    private static final long c;
    private static transient /* synthetic */ String lKFCFoXTtc = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private static Object IlIla(World world) {
        long l = a ^ 0x97ACCBBF8A7L;
        Object object = null;
        Method method = IlIlqb.IlIlr(world.getClass(), b, new Class[0]);
        try {
            object = method.invoke(world, new Object[0]);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return object;
    }

    @Override
    public void IlIlq(String string) {
        this.IlIlP = string;
    }

    @Override
    public void IlIly(Player player) {
        this.IlIlY = player;
    }

    @Override
    public void IlIle(float f) {
        this.IlIlz = f;
    }

    @Override
    public void IlIlg(BarStyle barStyle) {
    }

    @Override
    public void IlIla(BarColor barColor) {
    }

    /*
     * Loose catch block
     */
    @Override
    public void IlIlr() {
        long l = a ^ 0x3D026D7F2062L;
        int[] nArray = IlIlqi.IlIlW();
        try {
            Object object;
            IlIluh ilIluh;
            Location location;
            block7: {
                UUID uUID;
                block6: {
                    UUID uUID2;
                    Map<UUID, IlIluh> map;
                    block8: {
                        uUID = this.IlIlY.getUniqueId();
                        Vector vector = this.IlIlY.getLocation().getDirection().normalize().multiply((int)c);
                        location = this.IlIlY.getLocation().add(vector);
                        map = IlIlg;
                        uUID2 = uUID;
                        if (nArray != null) break block8;
                        try {
                            block9: {
                                if (!map.containsKey(uUID2)) break block6;
                                break block9;
                                catch (InstantiationException instantiationException) {
                                    throw IlIlqi.a(instantiationException);
                                }
                            }
                            map = IlIlg;
                            uUID2 = uUID;
                        }
                        catch (InstantiationException instantiationException) {
                            throw IlIlqi.a(instantiationException);
                        }
                    }
                    ilIluh = map.get(uUID2);
                    if (nArray == null) break block7;
                }
                ilIluh = new IlIluh(IlIlrW.IlIlW(this.IlIlP), location, this.IlIlz);
                object = ilIluh.IlIlw();
                IlIlqb.IlIlM(this.IlIlY, object);
                IlIlg.put(uUID, ilIluh);
            }
            ilIluh.IlIld(IlIlrW.IlIlW(this.IlIlP));
            ilIluh.IlIlU(this.IlIlz);
            object = ilIluh.IlIlx(ilIluh.IlIlx());
            Object object2 = ilIluh.IlIlp(location);
            IlIlqb.IlIlM(this.IlIlY, object);
            IlIlqb.IlIlM(this.IlIlY, object2);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
        }
    }

    /*
     * Loose catch block
     */
    @Override
    public void IlIlE() {
        block6: {
            block7: {
                long l = a ^ 0x7CA5A3B195L;
                int[] nArray = IlIlqi.IlIlW();
                if (nArray != null) break block6;
                try {
                    block8: {
                        if (IlIlg.containsKey(this.IlIlY.getUniqueId())) break block7;
                        break block8;
                        catch (InstantiationException instantiationException) {
                            throw IlIlqi.a(instantiationException);
                        }
                    }
                    return;
                }
                catch (InstantiationException instantiationException) {
                    throw IlIlqi.a(instantiationException);
                }
            }
            try {
                IlIlqb.IlIlM(this.IlIlY, IlIlg.get(this.IlIlY.getUniqueId()).IlIlf());
            }
            catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
                reflectiveOperationException.printStackTrace();
            }
        }
        IlIlg.remove(this.IlIlY.getUniqueId());
    }

    static /* synthetic */ Object IlIlN(World world) {
        return IlIlqi.IlIla(world);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = IlIls.a((long)1816178730575683160L, (long)2458545752890161912L, MethodHandles.lookup().lookupClass()).a(219445909100459L);
        long l = a ^ 0xEC725CD7C33L;
        IlIlqi.IlIlb(null);
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
        b = IlIlqi.a(byArray3).intern();
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
                IlIlg = new HashMap<UUID, IlIluh>();
                return;
            }
            byArray5 = byArray5;
            byArray5[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public static void IlIlb(int[] nArray) {
        IlIlK = nArray;
    }

    public static int[] IlIlW() {
        return IlIlK;
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

