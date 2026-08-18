/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import io.netty.buffer.ByteBuf;
import java.nio.charset.Charset;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.CP_Ge;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_X
implements CP_Ge {
    private static boolean CP_N;
    private static transient /* synthetic */ String NFfbZGeZwD = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Override
    public int CP_V(Object object) {
        return ((ByteBuf)object).capacity();
    }

    @Override
    public Object CP_u(Object object, int n) {
        return ((ByteBuf)object).capacity(n);
    }

    @Override
    public int CP_v(Object object) {
        return ((ByteBuf)object).readerIndex();
    }

    @Override
    public Object CP_A(Object object, int n) {
        return ((ByteBuf)object).readerIndex(n);
    }

    @Override
    public int CP_k(Object object) {
        return ((ByteBuf)object).writerIndex();
    }

    @Override
    public Object CP_y(Object object, int n) {
        return ((ByteBuf)object).writerIndex(n);
    }

    @Override
    public int CP_o(Object object) {
        return ((ByteBuf)object).readableBytes();
    }

    @Override
    public int CP_A(Object object) {
        return ((ByteBuf)object).writableBytes();
    }

    @Override
    public Object CP_J(Object object) {
        return ((ByteBuf)object).clear();
    }

    @Override
    public byte CP_j(Object object) {
        return ((ByteBuf)object).readByte();
    }

    @Override
    public short CP_U(Object object) {
        return ((ByteBuf)object).readShort();
    }

    @Override
    public int CP_Q(Object object) {
        return ((ByteBuf)object).readMedium();
    }

    @Override
    public int CP_D(Object object) {
        return ((ByteBuf)object).readInt();
    }

    @Override
    public long CP_D(Object object) {
        return ((ByteBuf)object).readUnsignedInt();
    }

    @Override
    public long CP_k(Object object) {
        return ((ByteBuf)object).readLong();
    }

    @Override
    public void CP_J(Object object, int n) {
        ((ByteBuf)object).writeByte(n);
    }

    @Override
    public void CP_a(Object object, int n) {
        ((ByteBuf)object).writeShort(n);
    }

    @Override
    public void CP_Y(Object object, int n) {
        ((ByteBuf)object).writeShortLE(n);
    }

    @Override
    public void CP_Q(Object object, int n) {
        ((ByteBuf)object).writeMedium(n);
    }

    @Override
    public void CP_V(Object object, int n) {
        ((ByteBuf)object).writeInt(n);
    }

    @Override
    public void CP_t(Object object, long l) {
        ((ByteBuf)object).writeLong(l);
    }

    @Override
    public Object CP_g(Object object, int n, byte[] byArray) {
        return ((ByteBuf)object).getBytes(n, byArray);
    }

    @Override
    public short CP_W(Object object, int n) {
        return ((ByteBuf)object).getUnsignedByte(n);
    }

    @Override
    public boolean CP_G(Object object) {
        return ((ByteBuf)object).isReadable();
    }

    @Override
    public Object CP_I(Object object) {
        return ((ByteBuf)object).copy();
    }

    @Override
    public Object CP_D(Object object) {
        return ((ByteBuf)object).duplicate();
    }

    @Override
    public boolean CP_o(Object object) {
        return ((ByteBuf)object).hasArray();
    }

    @Override
    public byte[] CP_j(Object object) {
        return ((ByteBuf)object).array();
    }

    @Override
    public Object CP_X(Object object) {
        return ((ByteBuf)object).retain();
    }

    @Override
    public Object CP_R(Object object) {
        return ((ByteBuf)object).retainedDuplicate();
    }

    @Override
    public Object CP_N(Object object, int n) {
        return ((ByteBuf)object).readSlice(n);
    }

    @Override
    public Object CP_f(Object object, byte[] byArray, int n, int n2) {
        return ((ByteBuf)object).readBytes(byArray, n, n2);
    }

    @Override
    public Object CP_K(Object object, int n) {
        return ((ByteBuf)object).readBytes(n);
    }

    @Override
    public Object CP_C(Object object, Object object2) {
        return ((ByteBuf)object).writeBytes((ByteBuf)object2);
    }

    @Override
    public Object CP_H(Object object, byte[] byArray) {
        return ((ByteBuf)object).writeBytes(byArray);
    }

    @Override
    public Object CP_w(Object object, byte[] byArray, int n, int n2) {
        return ((ByteBuf)object).writeBytes(byArray, n, n2);
    }

    @Override
    public void CP_A(Object object, byte[] byArray) {
        ((ByteBuf)object).readBytes(byArray);
    }

    @Override
    public boolean CP_N(Object object) {
        return ((ByteBuf)object).release();
    }

    @Override
    public int CP_S(Object object) {
        return ((ByteBuf)object).refCnt();
    }

    @Override
    public Object CP_s(Object object, int n) {
        return ((ByteBuf)object).skipBytes(n);
    }

    @Override
    public String CP_t(Object object, int n, int n2, Charset charset) {
        return ((ByteBuf)object).toString(n, n2, charset);
    }

    @Override
    public Object CP_F(Object object) {
        return ((ByteBuf)object).markReaderIndex();
    }

    @Override
    public Object CP_y(Object object) {
        return ((ByteBuf)object).resetReaderIndex();
    }

    @Override
    public Object CP_M(Object object) {
        return ((ByteBuf)object).markWriterIndex();
    }

    @Override
    public Object CP_W(Object object) {
        return ((ByteBuf)object).resetWriterIndex();
    }

    @Override
    public Object CP_j(Object object) {
        return ((ByteBuf)object).alloc().buffer();
    }

    public static void CP_T(boolean bl) {
        CP_N = bl;
    }

    public static boolean CP_b() {
        return CP_N;
    }

    public static boolean CP_d() {
        boolean bl = CP_X.CP_b();
        return !bl;
    }

    static {
        if (!CP_X.CP_d()) {
            CP_X.CP_T(true);
        }
    }
}

