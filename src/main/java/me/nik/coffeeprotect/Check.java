/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
import me.nik.coffeeprotect.UserData;
import me.nik.coffeeprotect.CheckResult;
import me.nik.coffeeprotect.CheckException;
import me.nik.coffeeprotect.CheckInfo;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Check {
    protected final UserData CP_w;
    private final boolean CP_H;
    private final String CP_U;
    private final String CP_I;
    private static PacketWrapper[] CP_Q;
    private static final long a;
    private static final String c;

    public Check(UserData ilIlTM, boolean bl) {
        long l = a ^ 0x5FBDCF55BD59L;
        this.CP_w = ilIlTM;
        this.CP_H = bl;
        CheckInfo ilIljl = this.getClass().getAnnotation(CheckInfo.class);
        try {
            if (ilIljl == null) {
                Bukkit.getPluginManager().disablePlugin((Plugin)CoffeeProtect.CP_J());
                throw new CheckException(c + this.getClass().getSimpleName() + ".");
            }
        }
        catch (CheckException ilIlfF) {
            throw Check.a(ilIlfF);
        }
        this.CP_U = ilIljl.CP_J();
        this.CP_I = ilIljl.CP_M();
    }

    public abstract CheckResult CP_h(PacketReceiveEvent var1);

    public boolean CP_b() {
        return this.CP_H;
    }

    public String CP_Q() {
        return this.CP_U;
    }

    public String CP_B() {
        return this.CP_I;
    }

    public static void CP_x(PacketWrapper[] packetWrapperArray) {
        CP_Q = packetWrapperArray;
    }

    public static PacketWrapper[] CP_Q() {
        return CP_Q;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(-5547429262233922983L, -172339050184195364L, MethodHandles.lookup().lookupClass()).a(263770691976549L);
        long l = a ^ 0x258009ACD697L;
        Check.CP_x(null);
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
                c = Check.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static CheckException a(CheckException ilIlfF) {
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
