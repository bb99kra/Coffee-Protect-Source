/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.positionsource;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.positionsource.CP_G;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.positionsource.CP_j6;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.positionsource.CP_xX;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.positionsource.CP_ye;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.positionsource.StaticPositionSourceType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.positionsource.builtin.BlockPositionSource;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.positionsource.builtin.EntityPositionSource;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Ow;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Q9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public final class CP_Cm {
    private static final VersionedRegistry<CP_j6<?>> CP_Z;
    public static final CP_j6<BlockPositionSource> CP_N;
    public static final CP_j6<EntityPositionSource> CP_k;
    private static transient /* synthetic */ String rTFOiiHBzw = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_Cm() {
    }

    public static VersionedRegistry<CP_j6<?>> CP_D() {
        return CP_Z;
    }

    @ApiStatus.Internal
    public static <T extends CP_G> CP_j6<T> CP_l(String string, CP_Q9<T> ilIlQ9, CP_Ow<T> ilIlOw, CP_ye<T> ilIlye, CP_xX<T> ilIlxX) {
        return CP_Z.define(string, typesBuilderData -> new StaticPositionSourceType((TypesBuilderData)typesBuilderData, ilIlQ9, ilIlOw, ilIlye, ilIlxX));
    }

    @Nullable
    public static CP_j6<?> CP_C(String string) {
        return CP_Z.getByName(string);
    }

    public static CP_j6<?> CP_C(ClientVersion clientVersion, int n) {
        return CP_Z.getById(clientVersion, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = CP_s.a(-3347348263077938944L, -6676731429487339211L, MethodHandles.lookup().lookupClass()).a(223347562708751L) ^ 0x27F51557B424L;
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "D\u00e3\u00c7\u00a1\\1\u001e\u00de\u0018\u000b\u00cd\u00ef\u00cb0\u0013\u00fbE\u00ae+\u00c8\u0004\u00af:\u00c5(E\u00dc\u001e\u00a9%l\u00a0~\b\u00f0H\u00b0\u00cc\u00e0\u0097\u0084\u0098";
        int n2 = "D\u00e3\u00c7\u00a1\\1\u001e\u00de\u0018\u000b\u00cd\u00ef\u00cb0\u0013\u00fbE\u00ae+\u00c8\u0004\u00af:\u00c5(E\u00dc\u001e\u00a9%l\u00a0~\b\u00f0H\u00b0\u00cc\u00e0\u0097\u0084\u0098".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_Cm.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                CP_Z = new VersionedRegistry(stringArray[1]);
                CP_N = CP_Cm.CP_l(stringArray[2], BlockPositionSource::read, BlockPositionSource::write, BlockPositionSource::decodeSource, BlockPositionSource::encodeSource);
                CP_k = CP_Cm.CP_l(stringArray[0], EntityPositionSource::read, EntityPositionSource::write, EntityPositionSource::decodeSource, EntityPositionSource::encodeSource);
                CP_Z.unloadMappings();
                return;
            }
            n3 = string.charAt(n4);
        }
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

