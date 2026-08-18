/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.io.DataOutput;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_xI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public class CP_qI {
    public static final CP_qI CP_I;
    private final List<CP_xI> CP_m;
    private static int CP_R;
    private static final long a;
    private static final long b;
    private static transient /* synthetic */ String azKAWaKvbq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_qI(List<CP_xI> list) {
        this.CP_m = list;
    }

    public void CP_c(DataOutput dataOutput) throws IOException {
        long l = a ^ 0xE6F1BB92643L;
        Iterator<CP_xI> iterator = this.CP_m.iterator();
        int n = CP_qI.CP_Y();
        while (iterator.hasNext()) {
            CP_xI ilIlxI = iterator.next();
            UUID uUID = ilIlxI.CP_k();
            byte[] byArray = ilIlxI.CP_m();
            dataOutput.writeByte((int)b);
            dataOutput.writeLong(uUID.getMostSignificantBits());
            dataOutput.writeLong(uUID.getLeastSignificantBits());
            dataOutput.write(byArray);
            if (n != 0) continue;
        }
    }

    public List<CP_xI> CP_t() {
        return this.CP_m;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(6748635544533956957L, 6737095129603059940L, MethodHandles.lookup().lookupClass()).a(196613580681299L);
        long l = a ^ 0x67418E0AC726L;
        CP_qI.CP_e(56);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -8482857669694338611L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                CP_I = new CP_qI(new ArrayList<CP_xI>());
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public static void CP_e(int n) {
        CP_R = n;
    }

    public static int CP_Y() {
        return CP_R;
    }

    public static int CP_Q() {
        int n = CP_qI.CP_Y();
        if (n == 0) {
            return 94;
        }
        return 0;
    }
}

