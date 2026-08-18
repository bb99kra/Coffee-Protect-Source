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
public class NBTInt
extends NBTNumber {
    protected final int value;
    private static String[] CP_a;
    private static final long b;
    private static final String f;
    private static transient /* synthetic */ String hapBGUIXYi = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public NBTInt(int n) {
        this.value = n;
    }

    public CP_Z1<NBTInt> getType() {
        return CP_Z1.CP_W;
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
        return this.value;
    }

    @Override
    public long getAsLong() {
        return this.value;
    }

    @Override
    public float getAsFloat() {
        return this.value;
    }

    @Override
    public double getAsDouble() {
        return this.value;
    }

    @Override
    public boolean equals(@Nullable Object object) {
        long l = b ^ 0x26C36696017FL;
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
        NBTInt nBTInt = (NBTInt)object3;
        int n = this.value;
        if (stringArray != null) {
            n = n == nBTInt.value ? 1 : 0;
        }
        return n != 0;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    @Override
    public NBTInt copy() {
        return this;
    }

    @Override
    public String toString() {
        long l = b ^ 0x3BE97A1899B4L;
        return f + this.value + ")";
    }

    public static void CP_b(String[] stringArray) {
        CP_a = stringArray;
    }

    public static String[] CP_H() {
        return CP_a;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = CP_s.a(-5631819824693209964L, -9097466265611345740L, MethodHandles.lookup().lookupClass()).a(93836299555492L);
        long l = b ^ 0x6D2D7FF9EE5DL;
        NBTInt.CP_b(new String[4]);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00ee>\u00aa\u00bd\u00da5*c".getBytes("ISO-8859-1"));
                f = NBTInt.b(byArray3).intern();
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

