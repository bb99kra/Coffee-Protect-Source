/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.scheduler.BukkitRunnable
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CP_Xi;
import me.nik.coffeeprotect.CP_Zv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.scheduler.BukkitRunnable;

class CP_OR
extends BukkitRunnable {
    final CP_Xi CP_C;
    private static final long a = CP_s.a(-812823474325251391L, 7580950949408138889L, MethodHandles.lookup().lookupClass()).a(17137668451741L);
    private static final long b;
    private static transient /* synthetic */ String kAimbvrnif = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_OR(CP_Xi ilIlXi) {
        this.CP_C = ilIlXi;
    }

    public void run() {
        block3: {
            block2: {
                long l = a ^ 0x3C17C8F37D0EL;
                String string = CP_Zv.CP_X();
                int n = CP_Xi.CP_j(this.CP_C);
                if (string != null) break block2;
                if (n <= (int)b) break block3;
                n = CP_Xi.CP_G(this.CP_C, 0);
            }
            this.CP_C.CP_f();
            this.cancel();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x1025BA183477L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 1986950662697697856L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }
}
