/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelPipeline
 *  io.netty.util.internal.logging.InternalLogger
 *  io.netty.util.internal.logging.InternalLoggerFactory
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_rk;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_Wg;

public class CP_rz
extends ChannelInboundHandlerAdapter {
    private static final InternalLogger CP_b;
    private static final long a;
    private static final String b;
    private static transient /* synthetic */ String lwqrVTbkBC = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Loose catch block
     */
    public void channelRegistered(ChannelHandlerContext channelHandlerContext) {
        block17: {
            CP_rz ilIlrz;
            ChannelPipeline channelPipeline;
            int[] nArray;
            block16: {
                long l = a ^ 0x432E1253DCE4L;
                nArray = CP_Wg.CP_R();
                CP_Wg.CP_q(channelHandlerContext.channel(), CP_rk.HANDSHAKING);
                ChannelPipeline channelPipeline2 = channelHandlerContext.pipeline();
                channelPipeline = channelPipeline2;
                ilIlrz = this;
                if (nArray == null) break block16;
                try {
                    block21: {
                        if (channelPipeline.context((ChannelHandler)ilIlrz) == null) break block17;
                        break block21;
                        catch (Throwable throwable) {
                            throw CP_rz.a(throwable);
                        }
                    }
                    channelPipeline = channelPipeline2;
                    ilIlrz = this;
                }
                catch (Throwable throwable) {
                    throw CP_rz.a(throwable);
                }
            }
            channelPipeline.remove((ChannelHandler)ilIlrz);
            break block17;
            catch (Throwable throwable) {
                CP_rz ilIlrz2;
                ChannelPipeline channelPipeline3;
                block18: {
                    try {
                        this.exceptionCaught(channelHandlerContext, throwable);
                    }
                    catch (Throwable throwable2) {
                        block20: {
                            CP_rz ilIlrz3;
                            ChannelPipeline channelPipeline4;
                            block19: {
                                ChannelPipeline channelPipeline5 = channelHandlerContext.pipeline();
                                try {
                                    try {
                                        channelPipeline4 = channelPipeline5;
                                        ilIlrz3 = this;
                                        if (nArray == null) break block19;
                                        if (channelPipeline4.context((ChannelHandler)ilIlrz3) == null) break block20;
                                    }
                                    catch (Throwable throwable3) {
                                        throw CP_rz.a(throwable3);
                                    }
                                    channelPipeline4 = channelPipeline5;
                                    ilIlrz3 = this;
                                }
                                catch (Throwable throwable4) {
                                    throw CP_rz.a(throwable4);
                                }
                            }
                            channelPipeline4.remove((ChannelHandler)ilIlrz3);
                        }
                        throw throwable2;
                    }
                    ChannelPipeline channelPipeline6 = channelHandlerContext.pipeline();
                    try {
                        try {
                            channelPipeline3 = channelPipeline6;
                            ilIlrz2 = this;
                            if (nArray == null) break block18;
                            if (channelPipeline3.context((ChannelHandler)ilIlrz2) == null) break block17;
                        }
                        catch (Throwable throwable5) {
                            throw CP_rz.a(throwable5);
                        }
                        channelPipeline3 = channelPipeline6;
                        ilIlrz2 = this;
                    }
                    catch (Throwable throwable6) {
                        throw CP_rz.a(throwable6);
                    }
                }
                channelPipeline3.remove((ChannelHandler)ilIlrz2);
            }
        }
        channelHandlerContext.pipeline().fireChannelRegistered();
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        long l = a ^ 0x4BA9C0C9FB07L;
        CP_b.warn(b + channelHandlerContext.channel(), throwable);
        channelHandlerContext.close();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(7972213813962596676L, 8522512304716872861L, MethodHandles.lookup().lookupClass()).a(20536452484338L);
        long l = a ^ 0x731CA431C182L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00a7\u0001\u00f8\u0014\u008cd\u0019\u008b\u00a2F\u00b5\u00eeL\u00d8\u0092\u0092J\u0086\u00d0\u00fe\u0014:\u00e0\u00e3\u001d\n\u00fbP\u00f0\u0017\u00fa\u007f\u00f0\u009bw\u00b0\u00b5\u0082\u00a0\u0002\u00da\u001e=\u00c1\u0010I\u0096S".getBytes("ISO-8859-1"));
                b = CP_rz.a(byArray3).intern();
                CP_b = InternalLoggerFactory.getInstance(ChannelInitializer.class);
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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

