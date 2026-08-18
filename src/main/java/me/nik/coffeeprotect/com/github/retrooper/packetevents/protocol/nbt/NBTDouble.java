/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.CP_Z1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTNumber;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public class NBTDouble
extends NBTNumber {
    protected final double value;
    private static final long b = CP_s.a(3030944096837144329L, 5818242630213841680L, MethodHandles.lookup().lookupClass()).a(178260601140316L);
    private static final String f;
    private static transient /* synthetic */ String oJlCJvLhBW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public NBTDouble(double d) {
        this.value = d;
    }

    public CP_Z1<NBTDouble> getType() {
        return CP_Z1.CP_i;
    }

    @Override
    public Number getAsNumber() {
        return this.value;
    }

    @Override
    public byte getAsByte() {
        return (byte)this.value;
    }

    @Override
    public short getAsShort() {
        return (short)this.value;
    }

    @Override
    public int getAsInt() {
        return (int)this.value;
    }

    @Override
    public long getAsLong() {
        return (long)this.value;
    }

    @Override
    public float getAsFloat() {
        return (float)this.value;
    }

    @Override
    public double getAsDouble() {
        return this.value;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(this.value);
    }

    @Override
    public boolean equals(@Nullable Object object) {
        long l = b ^ 0x43B351FEB01AL;
        String[] stringArray = NBT.CP_s();
        Object object2 = this;
        if (stringArray != null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (object2 == null) {
            return false;
        }
        Object object3 = this.getClass();
        if (stringArray != null) {
            if (object3 != object.getClass()) {
                return false;
            }
            object3 = object;
        }
        NBTDouble nBTDouble = (NBTDouble)object3;
        long l2 = Double.doubleToLongBits(this.value) - Double.doubleToLongBits(nBTDouble.value);
        long l3 = l2 == 0L ? (byte)0 : (l2 < 0L ? (byte)-1 : 1);
        if (stringArray != null) {
            l3 = l3 == false ? (long)1 : (long)0;
        }
        return (boolean)l3;
    }

    @Override
    public NBTDouble copy() {
        return this;
    }

    @Override
    public String toString() {
        long l = b ^ 0x7E4F3426B382L;
        return f + this.value + ")";
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x6DA88F8167D5L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\n\u0004\u00ed\u00ca\u0015\u00ec\u00df\u00a0".getBytes("ISO-8859-1"));
                f = NBTDouble.b(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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

