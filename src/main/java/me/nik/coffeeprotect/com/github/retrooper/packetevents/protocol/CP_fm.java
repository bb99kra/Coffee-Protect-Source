/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_fC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public class CP_fm
extends CP_fC {
    private final PacketWrapper<?> CP_a;
    private static transient /* synthetic */ String hKUCXlKAkK = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_fm(PacketWrapper<?> packetWrapper) {
        super(null);
        this.CP_a = packetWrapper;
    }

    @Override
    public int read() {
        return this.CP_a.CP_P();
    }

    @Override
    public int read(byte[] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int read(byte[] byArray, int n, int n2) {
        int n3 = ByteBufHelper.readerIndex(this.CP_a.CP_S);
        ByteBufHelper.CP_S(this.CP_a.CP_S, byArray, n, n2);
        return ByteBufHelper.readerIndex(this.CP_a.CP_S) - n3;
    }

    @Override
    public long skip(long l) {
        int n = ByteBufHelper.readerIndex(this.CP_a.CP_S);
        ByteBufHelper.CP_J(this.CP_a.CP_S, (int)l);
        return ByteBufHelper.readerIndex(this.CP_a.CP_S) - n;
    }

    @Override
    public int available() {
        return ByteBufHelper.CP_H(this.CP_a.CP_S);
    }

    @Override
    public void close() {
    }

    @Override
    public void mark(int n) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    public PacketWrapper<?> CP_Z() {
        return this.CP_a;
    }
}

