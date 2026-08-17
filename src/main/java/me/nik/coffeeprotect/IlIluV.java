/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 *  org.bukkit.Bukkit
 *  org.bukkit.plugin.Plugin
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlTM;
import me.nik.coffeeprotect.IlIlTV;
import me.nik.coffeeprotect.IlIlfF;
import me.nik.coffeeprotect.IlIljl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class IlIluV {
    protected final IlIlTM IlIlw;
    private final boolean IlIlH;
    private final String IlIlU;
    private final String IlIlI;
    private static PacketWrapper[] IlIlQ;
    private static final long a;
    private static final String c;

    public IlIluV(IlIlTM ilIlTM, boolean bl) {
        long l = a ^ 0x5FBDCF55BD59L;
        this.IlIlw = ilIlTM;
        this.IlIlH = bl;
        IlIljl ilIljl = this.getClass().getAnnotation(IlIljl.class);
        try {
            if (ilIljl == null) {
                Bukkit.getPluginManager().disablePlugin((Plugin)CoffeeProtect.IlIlJ());
                throw new IlIlfF(c + this.getClass().getSimpleName() + ".");
            }
        }
        catch (IlIlfF ilIlfF) {
            throw IlIluV.a(ilIlfF);
        }
        this.IlIlU = ilIljl.IlIlJ();
        this.IlIlI = ilIljl.IlIlM();
    }

    public abstract IlIlTV IlIlh(PacketReceiveEvent var1);

    public boolean IlIlb() {
        return this.IlIlH;
    }

    public String IlIlQ() {
        return this.IlIlU;
    }

    public String IlIlB() {
        return this.IlIlI;
    }

    public static void IlIlx(PacketWrapper[] packetWrapperArray) {
        IlIlQ = packetWrapperArray;
    }

    public static PacketWrapper[] IlIlQ() {
        return IlIlQ;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = IlIls.a((long)-5547429262233922983L, (long)-172339050184195364L, MethodHandles.lookup().lookupClass()).a(263770691976549L);
        long l = a ^ 0x258009ACD697L;
        IlIluV.IlIlx(null);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0098\u00fan\u0089\u00afw/C\u0095\u0011\u00c6|o\u0012\u00bdN\"\u00a9kq\u00a9\u009c\u0012P'\u00c3~\u0006\u001a:'\t\u00fe\u00a1\u00a0\u00b0\u0004\u0013\u00f8\u0083<K\u00dc1\u00db\u00c6V\t".getBytes("ISO-8859-1"));
                c = IlIluV.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static IlIlfF a(IlIlfF ilIlfF) {
        return ilIlfF;
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

