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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public class NBTEnd
extends NBT {
    public static final NBTEnd INSTANCE;
    private static final long b;
    private static final String f;
    private static transient /* synthetic */ String xwHsvgAkmO = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Z1<NBTEnd> getType() {
        return CP_Z1.CP_S;
    }

    @Override
    public boolean equals(@Nullable Object object) {
        long l = b ^ 0x1F9CF3A9753EL;
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
        return this.getClass() == object.getClass();
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public NBTEnd copy() {
        return this;
    }

    @Override
    public String toString() {
        long l = b ^ 0x6333303ECD17L;
        return f;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = CP_s.a(-2123492017108301306L, -1860153500194447455L, MethodHandles.lookup().lookupClass()).a(244206205714605L);
        long l = b ^ 0x7EF641BB0E3BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("v\u00a3$\u00c7\u00ca\u00d5\u001fS".getBytes("ISO-8859-1"));
                f = NBTEnd.b(byArray3).intern();
                INSTANCE = new NBTEnd();
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

