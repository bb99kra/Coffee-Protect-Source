/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.EmptyByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 *  org.bukkit.Material
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.PlayerInventory
 */
package me.nik.coffeeprotect;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.EmptyByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlCz;
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlQf;
import me.nik.coffeeprotect.IlIlhL;
import me.nik.coffeeprotect.IlIljC;
import me.nik.coffeeprotect.IlIljm;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class IlIlL0
extends ByteToMessageDecoder {
    private final Player IlIli;
    private static final int IlIlb;
    private static final Pattern IlIlj;
    private boolean IlIlw;
    private boolean IlIls;
    private boolean IlIlM;
    private float IlIlS;
    private int IlIlt;
    private final IlIljm IlIlW;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static transient /* synthetic */ String OigSBQBFXc = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlL0(Player player) {
        long l = a ^ 0x15AD18E2A545L;
        this.IlIlS = 0.0f;
        this.IlIlt = 0;
        this.IlIlW = new IlIljm();
        this.IlIli = player;
        String string = IlIlQf.IlIlC();
        if (string == null) {
            PacketWrapper.IlIle((int[])new int[3]);
        }
    }

    private void IlIlr() {
        block4: {
            Player player;
            String string;
            block3: {
                long l = a ^ 0x5FB122F57A43L;
                string = IlIlQf.IlIlC();
                player = this.IlIli;
                if (string == null) break block3;
                if (player == null) break block4;
                player = this.IlIli;
            }
            PlayerInventory playerInventory = player.getInventory();
            for (String string2 : IlIlCz.BOOK.IlIlW()) {
                Material material = Material.getMaterial((String)string2);
                if (material == null) continue;
                playerInventory.remove(material);
                if (string != null) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void IlIlT() {
        block26: {
            var1_1 = IlIlL0.a ^ 133265479644672L;
            var3_2 = IlIlQf.IlIlC();
            v0 = this;
            v1 = v0;
            v2 = v0.IlIlt;
            if (var3_2 != null) {
                v1.IlIlt = v2 + 1;
                if (v2 < 5) {
                    return;
                }
                v1 = this;
                this.IlIlM = false;
                v2 = (int)false;
                this.IlIls = false;
            }
            v1.IlIlw = v2;
            var4_3 = new ArrayList<Material>();
            var5_4 = this.IlIli.getInventory().getContents();
            var6_5 = ((ItemStack[])var5_4).length;
            var7_7 = 0;
            while (var7_7 < var6_5) {
                block27: {
                    var8_8 = var5_4[var7_7];
                    if (var3_2 == null) break block27;
                    v3 = var8_8;
                    if (var3_2 == null) ** GOTO lbl38
                    if (v3 != null) {
                        var4_3.add(var8_8.getType());
                    }
                    ++var7_7;
                }
                if (var3_2 != null) continue;
            }
            var5_4 = this.IlIli.getOpenInventory().getTopInventory().getContents();
            var6_5 = ((ItemStack[])var5_4).length;
            var7_7 = 0;
            while (var7_7 < var6_5) {
                block28: {
                    var8_8 = var5_4[var7_7];
                    if (var3_2 == null) break block28;
                    v3 = var8_8;
lbl38:
                    // 2 sources

                    if (v3 != null) {
                        var4_3.add(var8_8.getType());
                    }
                    ++var7_7;
                }
                if (var3_2 != null) continue;
            }
            var6_6 = IlIlCz.BOOK.IlIlW();
            var7_7 = var6_6.length;
            var8_9 = 0;
            while (var8_9 < var7_7) {
                block29: {
                    var9_10 = var6_6[var8_9];
                    var5_4 = Material.getMaterial((String)var9_10);
                    if (var3_2 == null) break block29;
                    v4 = var5_4;
                    if (var3_2 == null) ** GOTO lbl85
                    if (v4 != null && var4_3.contains(var5_4)) {
                        this.IlIlw = true;
                        if (var3_2 != null) break;
                    }
                    ++var8_9;
                }
                if (var3_2 != null) continue;
            }
            var6_6 = IlIlCz.SHULKER.IlIlW();
            var7_7 = var6_6.length;
            var8_9 = 0;
            while (var8_9 < var7_7) {
                block30: {
                    var9_10 = var6_6[var8_9];
                    var5_4 = Material.getMaterial((String)var9_10);
                    if (var3_2 == null) break block30;
                    v4 = var5_4;
                    if (var3_2 == null) ** GOTO lbl85
                    if (v4 != null && var4_3.contains(var5_4)) {
                        this.IlIls = true;
                        if (var3_2 != null) break;
                    }
                    ++var8_9;
                }
                if (var3_2 != null) continue;
            }
            var6_6 = IlIlCz.HEAD.IlIlW();
            var7_7 = var6_6.length;
            var8_9 = 0;
            while (var8_9 < var7_7) {
                block31: {
                    var9_10 = var6_6[var8_9];
                    var5_4 = Material.getMaterial((String)var9_10);
                    if (var3_2 == null) break block26;
                    if (var3_2 == null) break block31;
                    v4 = var5_4;
lbl85:
                    // 3 sources

                    if (v4 != null && var4_3.contains(var5_4)) {
                        this.IlIlM = true;
                        if (var3_2 != null) break;
                    }
                    ++var8_9;
                }
                if (var3_2 != null) continue;
            }
            this.IlIlt = 0;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void decode(ChannelHandlerContext var1_1, ByteBuf var2_2, List<Object> var3_3) {
        block192: {
            block193: {
                block197: {
                    block198: {
                        block191: {
                            block196: {
                                block195: {
                                    block194: {
                                        block188: {
                                            block189: {
                                                block190: {
                                                    block186: {
                                                        block187: {
                                                            block184: {
                                                                block185: {
                                                                    block181: {
                                                                        block177: {
                                                                            block178: {
                                                                                block179: {
                                                                                    block180: {
                                                                                        block176: {
                                                                                            block222: {
                                                                                                block221: {
                                                                                                    block172: {
                                                                                                        block173: {
                                                                                                            block174: {
                                                                                                                block175: {
                                                                                                                    block219: {
                                                                                                                        block168: {
                                                                                                                            block169: {
                                                                                                                                block170: {
                                                                                                                                    block171: {
                                                                                                                                        block217: {
                                                                                                                                            block216: {
                                                                                                                                                block164: {
                                                                                                                                                    block165: {
                                                                                                                                                        block166: {
                                                                                                                                                            block167: {
                                                                                                                                                                block163: {
                                                                                                                                                                    block213: {
                                                                                                                                                                        block212: {
                                                                                                                                                                            block161: {
                                                                                                                                                                                block162: {
                                                                                                                                                                                    block159: {
                                                                                                                                                                                        block160: {
                                                                                                                                                                                            block157: {
                                                                                                                                                                                                block158: {
                                                                                                                                                                                                    block154: {
                                                                                                                                                                                                        block152: {
                                                                                                                                                                                                            block153: {
                                                                                                                                                                                                                block155: {
                                                                                                                                                                                                                    block156: {
                                                                                                                                                                                                                        block210: {
                                                                                                                                                                                                                            block209: {
                                                                                                                                                                                                                                block208: {
                                                                                                                                                                                                                                    block207: {
                                                                                                                                                                                                                                        block206: {
                                                                                                                                                                                                                                            block150: {
                                                                                                                                                                                                                                                block151: {
                                                                                                                                                                                                                                                    block204: {
                                                                                                                                                                                                                                                        block203: {
                                                                                                                                                                                                                                                            block202: {
                                                                                                                                                                                                                                                                block149: {
                                                                                                                                                                                                                                                                    block200: {
                                                                                                                                                                                                                                                                        block199: {
                                                                                                                                                                                                                                                                            var4_4 = IlIlL0.a ^ 110521933147927L;
                                                                                                                                                                                                                                                                            var6_5 = IlIlQf.IlIlC();
                                                                                                                                                                                                                                                                            if (var2_2 instanceof EmptyByteBuf) ** GOTO lbl42
                                                                                                                                                                                                                                                                            if (var1_1 == null) ** GOTO lbl42
                                                                                                                                                                                                                                                                            break block199;
                                                                                                                                                                                                                                                                            catch (Exception v0) {
                                                                                                                                                                                                                                                                                throw IlIlL0.a(v0);
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        v1 = this.IlIli;
                                                                                                                                                                                                                                                                        if (var6_5 == null) break block149;
                                                                                                                                                                                                                                                                        break block200;
                                                                                                                                                                                                                                                                        catch (Exception v2) {
                                                                                                                                                                                                                                                                            throw IlIlL0.a(v2);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                        block201: {
                                                                                                                                                                                                                                                                            if (v1 == null) ** GOTO lbl42
                                                                                                                                                                                                                                                                            break block201;
                                                                                                                                                                                                                                                                            catch (Exception v3) {
                                                                                                                                                                                                                                                                                throw IlIlL0.a(v3);
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        v1 = this.IlIli;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    catch (Exception v4) {
                                                                                                                                                                                                                                                                        throw IlIlL0.a(v4);
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                if (!v1.isOnline()) ** GOTO lbl42
                                                                                                                                                                                                                                                                if (CoffeeProtect.IlIlJ() == null) ** GOTO lbl42
                                                                                                                                                                                                                                                                break block202;
                                                                                                                                                                                                                                                                catch (Exception v5) {
                                                                                                                                                                                                                                                                    throw IlIlL0.a(v5);
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            if (IlIlL0.IlIlb >= IlIlL0.b("i", (int)6235, (long)(6176376803760545797L ^ var4_4))) break block150;
                                                                                                                                                                                                                                                            break block203;
                                                                                                                                                                                                                                                            catch (Exception v6) {
                                                                                                                                                                                                                                                                throw IlIlL0.a(v6);
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        if (var3_3 == null) break block151;
                                                                                                                                                                                                                                                        break block204;
                                                                                                                                                                                                                                                        catch (Exception v7) {
                                                                                                                                                                                                                                                            throw IlIlL0.a(v7);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                        block205: {
                                                                                                                                                                                                                                                            if (var2_2 == null) break block151;
                                                                                                                                                                                                                                                            break block205;
                                                                                                                                                                                                                                                            catch (Exception v8) {
                                                                                                                                                                                                                                                                throw IlIlL0.a(v8);
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        var3_3.add(var2_2.readBytes(var2_2.readableBytes()));
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    catch (Exception v9) {
                                                                                                                                                                                                                                                        throw IlIlL0.a(v9);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                return;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            var7_6 = var1_1.channel();
                                                                                                                                                                                                                                            if (var6_5 == null) break block152;
                                                                                                                                                                                                                                            if (var7_6 == null) break block153;
                                                                                                                                                                                                                                            break block206;
                                                                                                                                                                                                                                            catch (Exception v10) {
                                                                                                                                                                                                                                                throw IlIlL0.a(v10);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        if (var7_6.remoteAddress() != null) break block153;
                                                                                                                                                                                                                                        break block207;
                                                                                                                                                                                                                                        catch (Exception v11) {
                                                                                                                                                                                                                                            throw IlIlL0.a(v11);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    v12 = (int)IlIlOq.PACKET_DECODER_DISABLE_NULL_ADDRESS.IlIlt();
                                                                                                                                                                                                                                    if (var6_5 == null) break block154;
                                                                                                                                                                                                                                    break block208;
                                                                                                                                                                                                                                    catch (Exception v13) {
                                                                                                                                                                                                                                        throw IlIlL0.a(v13);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (v12 == 0) break block153;
                                                                                                                                                                                                                                break block209;
                                                                                                                                                                                                                                catch (Exception v14) {
                                                                                                                                                                                                                                    throw IlIlL0.a(v14);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            var2_2.skipBytes(var2_2.readableBytes());
                                                                                                                                                                                                                            v15 = IlIlOq.PACKET_DECODER_DISCONNECT.IlIlt();
                                                                                                                                                                                                                            if (var6_5 == null) break block155;
                                                                                                                                                                                                                            break block210;
                                                                                                                                                                                                                            catch (Exception v16) {
                                                                                                                                                                                                                                throw IlIlL0.a(v16);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            block211: {
                                                                                                                                                                                                                                if (!v15) break block156;
                                                                                                                                                                                                                                break block211;
                                                                                                                                                                                                                                catch (Exception v17) {
                                                                                                                                                                                                                                    throw IlIlL0.a(v17);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            var1_1.close();
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (Exception v18) {
                                                                                                                                                                                                                            throw IlIlL0.a(v18);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    v15 = IlIlOq.PACKET_DECODER_FLAG.IlIlt();
                                                                                                                                                                                                                }
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    if (v15) {
                                                                                                                                                                                                                        CoffeeProtect.IlIlK().flag(this.IlIli, (String)IlIlL0.a("b", (int)11896, (long)(3165643712333838046L ^ var4_4)), (String)IlIlL0.a("b", (int)2797, (long)(4477883887843299907L ^ var4_4)), (String)IlIlL0.a("b", (int)2997, (long)(6071518601967948575L ^ var4_4)));
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (Exception v19) {
                                                                                                                                                                                                                    throw IlIlL0.a(v19);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                return;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            this.IlIlT();
                                                                                                                                                                                                        }
                                                                                                                                                                                                        v12 = var2_2.readableBytes();
                                                                                                                                                                                                    }
                                                                                                                                                                                                    var8_7 = v12;
                                                                                                                                                                                                    var9_8 = var2_2.capacity();
                                                                                                                                                                                                    var10_9 = var2_2.refCnt();
                                                                                                                                                                                                    var11_10 = IlIlOq.PACKET_DECODER_MAX_BYTEBUF_SIZE.IlIlj();
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        v20 = var11_10;
                                                                                                                                                                                                        v21 /* !! */  = this.IlIlw;
                                                                                                                                                                                                        if (var6_5 == null) break block157;
                                                                                                                                                                                                        if (v21 /* !! */  == 0) break block158;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (Exception v22) {
                                                                                                                                                                                                        throw IlIlL0.a(v22);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    v21 /* !! */  = (int)IlIlL0.b("i", (int)21413, (long)(503209042151304181L ^ var4_4));
                                                                                                                                                                                                    break block157;
                                                                                                                                                                                                }
                                                                                                                                                                                                v21 /* !! */  = 0;
                                                                                                                                                                                            }
                                                                                                                                                                                            var11_10 = v20 + v21 /* !! */ ;
                                                                                                                                                                                            try {
                                                                                                                                                                                                v23 = var11_10;
                                                                                                                                                                                                v24 /* !! */  = this.IlIlM;
                                                                                                                                                                                                if (var6_5 == null) break block159;
                                                                                                                                                                                                if (v24 /* !! */  == 0) break block160;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (Exception v25) {
                                                                                                                                                                                                throw IlIlL0.a(v25);
                                                                                                                                                                                            }
                                                                                                                                                                                            v24 /* !! */  = (int)IlIlL0.b("i", (int)7924, (long)(421519312789153449L ^ var4_4));
                                                                                                                                                                                            break block159;
                                                                                                                                                                                        }
                                                                                                                                                                                        v24 /* !! */  = 0;
                                                                                                                                                                                    }
                                                                                                                                                                                    var11_10 = v23 + v24 /* !! */ ;
                                                                                                                                                                                    try {
                                                                                                                                                                                        v26 = var11_10;
                                                                                                                                                                                        v27 = this.IlIls;
                                                                                                                                                                                        if (var6_5 == null) break block161;
                                                                                                                                                                                        if (v27 == 0) break block162;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (Exception v28) {
                                                                                                                                                                                        throw IlIlL0.a(v28);
                                                                                                                                                                                    }
                                                                                                                                                                                    v27 = 4;
                                                                                                                                                                                    break block161;
                                                                                                                                                                                }
                                                                                                                                                                                v27 = 1;
                                                                                                                                                                            }
                                                                                                                                                                            var11_10 = v26 * v27;
                                                                                                                                                                            v29 = var9_8;
                                                                                                                                                                            if (var6_5 == null) break block163;
                                                                                                                                                                            if (v29 < IlIlOq.PACKET_DECODER_MIN_BYTEBUF_CAPACITY.IlIlj()) ** GOTO lbl194
                                                                                                                                                                            break block212;
                                                                                                                                                                            catch (Exception v30) {
                                                                                                                                                                                throw IlIlL0.a(v30);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        v31 = var9_8;
                                                                                                                                                                        v32 = var11_10;
                                                                                                                                                                        if (var6_5 == null) break block164;
                                                                                                                                                                        break block213;
                                                                                                                                                                        catch (Exception v33) {
                                                                                                                                                                            throw IlIlL0.a(v33);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    try {
                                                                                                                                                                        block214: {
                                                                                                                                                                            if (v31 < v32) break block165;
                                                                                                                                                                            break block214;
                                                                                                                                                                            catch (Exception v34) {
                                                                                                                                                                                throw IlIlL0.a(v34);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        this.IlIlr();
                                                                                                                                                                        var2_2.skipBytes(var8_7);
                                                                                                                                                                        v29 = (int)IlIlOq.PACKET_DECODER_DISCONNECT.IlIlt();
                                                                                                                                                                    }
                                                                                                                                                                    catch (Exception v35) {
                                                                                                                                                                        throw IlIlL0.a(v35);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                if (var6_5 == null) break block166;
                                                                                                                                                                try {
                                                                                                                                                                    block215: {
                                                                                                                                                                        if (v29 == 0) break block167;
                                                                                                                                                                        break block215;
                                                                                                                                                                        catch (Exception v36) {
                                                                                                                                                                            throw IlIlL0.a(v36);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    var1_1.close();
                                                                                                                                                                }
                                                                                                                                                                catch (Exception v37) {
                                                                                                                                                                    throw IlIlL0.a(v37);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            v29 = (int)IlIlOq.PACKET_DECODER_FLAG.IlIlt();
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            if (v29 != 0) {
                                                                                                                                                                CoffeeProtect.IlIlK().flag(this.IlIli, (String)IlIlL0.a("b", (int)5831, (long)(8144468399441596015L ^ var4_4)), (String)IlIlL0.a("b", (int)31425, (long)(5640479592920719969L ^ var4_4)), (String)IlIlL0.a("b", (int)1239, (long)(6804235636493048947L ^ var4_4)) + var9_8);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        catch (Exception v38) {
                                                                                                                                                            throw IlIlL0.a(v38);
                                                                                                                                                        }
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    v31 = var10_9;
                                                                                                                                                    v32 = IlIlOq.PACKET_DECODER_MIN_BYTEBUF_REFCNT.IlIlj();
                                                                                                                                                }
                                                                                                                                                if (var6_5 == null) break block168;
                                                                                                                                                if (v31 >= v32) break block169;
                                                                                                                                                break block216;
                                                                                                                                                catch (Exception v39) {
                                                                                                                                                    throw IlIlL0.a(v39);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            var2_2.skipBytes(var8_7);
                                                                                                                                            v40 = IlIlOq.PACKET_DECODER_DISCONNECT.IlIlt();
                                                                                                                                            if (var6_5 == null) break block170;
                                                                                                                                            break block217;
                                                                                                                                            catch (Exception v41) {
                                                                                                                                                throw IlIlL0.a(v41);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            block218: {
                                                                                                                                                if (!v40) break block171;
                                                                                                                                                break block218;
                                                                                                                                                catch (Exception v42) {
                                                                                                                                                    throw IlIlL0.a(v42);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            var1_1.close();
                                                                                                                                        }
                                                                                                                                        catch (Exception v43) {
                                                                                                                                            throw IlIlL0.a(v43);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    v40 = IlIlOq.PACKET_DECODER_FLAG.IlIlt();
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    if (v40) {
                                                                                                                                        CoffeeProtect.IlIlK().flag(this.IlIli, (String)IlIlL0.a("b", (int)5831, (long)(8144468399441596015L ^ var4_4)), (String)IlIlL0.a("b", (int)31425, (long)(5640479592920719969L ^ var4_4)), (String)IlIlL0.a("b", (int)26085, (long)(1909615746211986761L ^ var4_4)) + var10_9);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                catch (Exception v44) {
                                                                                                                                    throw IlIlL0.a(v44);
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                v31 = var8_7;
                                                                                                                                if (var6_5 == null) break block172;
                                                                                                                                v32 = var11_10;
                                                                                                                            }
                                                                                                                            catch (Exception v45) {
                                                                                                                                throw IlIlL0.a(v45);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (v31 < v32) break block173;
                                                                                                                        this.IlIlr();
                                                                                                                        var2_2.skipBytes(var8_7);
                                                                                                                        v46 = IlIlOq.PACKET_DECODER_DISCONNECT.IlIlt();
                                                                                                                        if (var6_5 == null) break block174;
                                                                                                                        break block219;
                                                                                                                        catch (Exception v47) {
                                                                                                                            throw IlIlL0.a(v47);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        block220: {
                                                                                                                            if (!v46) break block175;
                                                                                                                            break block220;
                                                                                                                            catch (Exception v48) {
                                                                                                                                throw IlIlL0.a(v48);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        var1_1.close();
                                                                                                                    }
                                                                                                                    catch (Exception v49) {
                                                                                                                        throw IlIlL0.a(v49);
                                                                                                                    }
                                                                                                                }
                                                                                                                v46 = IlIlOq.PACKET_DECODER_FLAG.IlIlt();
                                                                                                            }
                                                                                                            try {
                                                                                                                if (v46) {
                                                                                                                    CoffeeProtect.IlIlK().flag(this.IlIli, (String)IlIlL0.a("b", (int)5831, (long)(8144468399441596015L ^ var4_4)), (String)IlIlL0.a("b", (int)31425, (long)(5640479592920719969L ^ var4_4)), (String)IlIlL0.a("b", (int)30443, (long)(334862618757115464L ^ var4_4)) + var8_7);
                                                                                                                }
                                                                                                            }
                                                                                                            catch (Exception v50) {
                                                                                                                throw IlIlL0.a(v50);
                                                                                                            }
                                                                                                            return;
                                                                                                        }
                                                                                                        v31 = ByteBufHelper.IlIlb((Object)var2_2.copy());
                                                                                                    }
                                                                                                    var12_11 = v31;
                                                                                                    v51 = var12_11;
                                                                                                    if (var6_5 == null) break block176;
                                                                                                    if (v51 < 0) ** GOTO lbl336
                                                                                                    break block221;
                                                                                                    catch (Exception v52) {
                                                                                                        throw IlIlL0.a(v52);
                                                                                                    }
                                                                                                }
                                                                                                v53 = var12_11;
                                                                                                v54 = IlIlL0.b("i", (int)19133, (long)(2823247579582001902L ^ var4_4));
                                                                                                if (var6_5 == null) break block177;
                                                                                                break block222;
                                                                                                catch (Exception v55) {
                                                                                                    throw IlIlL0.a(v55);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                block223: {
                                                                                                    if (v53 <= v54) break block178;
                                                                                                    break block223;
                                                                                                    catch (Exception v56) {
                                                                                                        throw IlIlL0.a(v56);
                                                                                                    }
                                                                                                }
                                                                                                var2_2.skipBytes(var8_7);
                                                                                                v51 = (int)IlIlOq.PACKET_DECODER_DISCONNECT.IlIlt();
                                                                                            }
                                                                                            catch (Exception v57) {
                                                                                                throw IlIlL0.a(v57);
                                                                                            }
                                                                                        }
                                                                                        if (var6_5 == null) break block179;
                                                                                        try {
                                                                                            block224: {
                                                                                                if (v51 == 0) break block180;
                                                                                                break block224;
                                                                                                catch (Exception v58) {
                                                                                                    throw IlIlL0.a(v58);
                                                                                                }
                                                                                            }
                                                                                            var1_1.close();
                                                                                        }
                                                                                        catch (Exception v59) {
                                                                                            throw IlIlL0.a(v59);
                                                                                        }
                                                                                    }
                                                                                    v51 = (int)IlIlOq.PACKET_DECODER_FLAG.IlIlt();
                                                                                }
                                                                                try {
                                                                                    if (v51 != 0) {
                                                                                        CoffeeProtect.IlIlK().flag(this.IlIli, (String)IlIlL0.a("b", (int)5831, (long)(8144468399441596015L ^ var4_4)), (String)IlIlL0.a("b", (int)31425, (long)(5640479592920719969L ^ var4_4)), (String)IlIlL0.a("b", (int)30835, (long)(6515791327195472082L ^ var4_4)) + var12_11);
                                                                                    }
                                                                                }
                                                                                catch (Exception v60) {
                                                                                    throw IlIlL0.a(v60);
                                                                                }
                                                                                return;
                                                                            }
                                                                            v53 = var8_7;
                                                                            v54 = IlIlL0.b("i", (int)612, (long)(5452453814786538035L ^ var4_4));
                                                                        }
                                                                        if (v53 >= v54) {
                                                                            try {
                                                                                var13_12 = new String(ByteBufHelper.IlIlN((Object)var2_2), StandardCharsets.UTF_8);
                                                                            }
                                                                            catch (Exception var14_14) {
                                                                                break block181;
                                                                            }
                                                                            var13_12 = var13_12.replaceAll("\n", "").trim();
                                                                            var14_15 = IlIlL0.IlIlj.matcher(var13_12);
                                                                            var15_17 = 0;
                                                                            while (var14_15.find()) {
                                                                                v61 = var15_17++;
                                                                                while (v61 > IlIlL0.b("i", (int)11063, (long)(2591064609522914145L ^ var4_4))) {
                                                                                    block182: {
                                                                                        block183: {
                                                                                            var2_2.skipBytes(var8_7);
                                                                                            v61 = (int)IlIlOq.PACKET_DECODER_DISCONNECT.IlIlt();
                                                                                            if (var6_5 == null) continue;
                                                                                            try {
                                                                                                try {
                                                                                                    if (var6_5 == null) break block182;
                                                                                                    if (v61 == 0) break block183;
                                                                                                }
                                                                                                catch (Exception v62) {
                                                                                                    throw IlIlL0.a(v62);
                                                                                                }
                                                                                                var1_1.close();
                                                                                            }
                                                                                            catch (Exception v63) {
                                                                                                throw IlIlL0.a(v63);
                                                                                            }
                                                                                        }
                                                                                        v64 = IlIlOq.PACKET_DECODER_FLAG.IlIlt();
                                                                                    }
                                                                                    try {
                                                                                        if (v64) {
                                                                                            CoffeeProtect.IlIlK().flag(this.IlIli, (String)IlIlL0.a("b", (int)5831, (long)(8144468399441596015L ^ var4_4)), (String)IlIlL0.a("b", (int)31425, (long)(5640479592920719969L ^ var4_4)), (String)IlIlL0.a("b", (int)13947, (long)(3415781443138612958L ^ var4_4)) + var15_17);
                                                                                        }
                                                                                    }
                                                                                    catch (Exception v65) {
                                                                                        throw IlIlL0.a(v65);
                                                                                    }
                                                                                    return;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    this.IlIlW.IlIlY(var8_7);
                                                                    var13_13 = this.IlIlW.IlIlZ();
                                                                    var14_16 = IlIlOq.PACKET_DECODER_MAX_BYTEBUF_SIZE.IlIlj();
                                                                    try {
                                                                        try {
                                                                            v66 = var14_16;
                                                                            v67 = this.IlIls;
                                                                            if (var6_5 == null) break block184;
                                                                            if (v67 == 0) break block185;
                                                                        }
                                                                        catch (Exception v68) {
                                                                            throw IlIlL0.a(v68);
                                                                        }
                                                                        v67 = IlIlOq.PACKET_DECODER_MAX_BYTEBUF_RATE_MULTIPLIER.IlIlj() + IlIlL0.b("i", (int)8350, (long)(3867963967271540940L ^ var4_4));
                                                                        break block184;
                                                                    }
                                                                    catch (Exception v69) {
                                                                        throw IlIlL0.a(v69);
                                                                    }
                                                                }
                                                                v67 = IlIlOq.PACKET_DECODER_MAX_BYTEBUF_RATE_MULTIPLIER.IlIlj();
                                                            }
                                                            var14_16 = v66 * v67;
                                                            try {
                                                                try {
                                                                    v70 = var13_13;
                                                                    v71 /* !! */  = var14_16;
                                                                    if (var6_5 == null) break block186;
                                                                    if (v70 <= v71 /* !! */ ) break block187;
                                                                }
                                                                catch (Exception v72) {
                                                                    throw IlIlL0.a(v72);
                                                                }
                                                                IlIlrW.IlIlU(new String[]{(String)IlIlL0.a("b", (int)2673, (long)(8192417596553056984L ^ var4_4)) + this.IlIli.getName() + (String)IlIlL0.a("b", (int)13750, (long)(2588225746595507483L ^ var4_4)) + var13_13});
                                                                var2_2.skipBytes(var8_7);
                                                                var1_1.close();
                                                                return;
                                                            }
                                                            catch (Exception v73) {
                                                                throw IlIlL0.a(v73);
                                                            }
                                                        }
                                                        v70 = var9_8;
                                                        v71 /* !! */  = IlIlL0.IlIlb;
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (var6_5 == null) break block188;
                                                                        if (v70 <= v71 /* !! */ ) {
                                                                        }
                                                                        ** GOTO lbl495
                                                                    }
                                                                    catch (Exception v74) {
                                                                        throw IlIlL0.a(v74);
                                                                    }
                                                                    v70 = (int)var2_2.hasArray();
                                                                    if (var6_5 == null) break block189;
                                                                }
                                                                catch (Exception v75) {
                                                                    throw IlIlL0.a(v75);
                                                                }
                                                                if (v70 == 0) break block190;
                                                            }
                                                            catch (Exception v76) {
                                                                throw IlIlL0.a(v76);
                                                            }
                                                            v70 = var2_2.array().length;
                                                            v71 /* !! */  = IlIlL0.IlIlb;
                                                            if (var6_5 == null) break block188;
                                                        }
                                                        catch (Exception v77) {
                                                            throw IlIlL0.a(v77);
                                                        }
                                                        if (v70 <= v71 /* !! */ ) {
                                                        }
                                                        ** GOTO lbl495
                                                    }
                                                    catch (Exception v78) {
                                                        throw IlIlL0.a(v78);
                                                    }
                                                }
                                                v70 = var8_7;
                                            }
                                            try {
                                                try {
                                                    try {
                                                        v71 /* !! */  = IlIlL0.IlIlb;
                                                        if (var6_5 == null) break block188;
                                                        if (v70 <= v71 /* !! */ ) break block191;
                                                    }
                                                    catch (Exception v79) {
                                                        throw IlIlL0.a(v79);
                                                    }
lbl495:
                                                    // 3 sources

                                                    v70 = var9_8;
                                                    if (var6_5 == null) break block192;
                                                }
                                                catch (Exception v80) {
                                                    throw IlIlL0.a(v80);
                                                }
                                                v71 /* !! */  = (int)IlIlL0.b("i", (int)20154, (long)(354257884888528623L ^ var4_4));
                                            }
                                            catch (Exception v81) {
                                                throw IlIlL0.a(v81);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (v70 <= v71 /* !! */ ) break block193;
                                                        v70 = var8_7;
                                                        if (var6_5 == null) break block192;
                                                    }
                                                    catch (Exception v82) {
                                                        throw IlIlL0.a(v82);
                                                    }
                                                    if (v70 <= IlIlL0.b("i", (int)8428, (long)(6279553228525672632L ^ var4_4))) break block193;
                                                }
                                                catch (Exception v83) {
                                                    throw IlIlL0.a(v83);
                                                }
                                                v84 = this.IlIlS;
                                                v85 = v84;
                                                this.IlIlS = v84 + 1.0f;
                                                if (!this.IlIls) break block194;
                                            }
                                            catch (Exception v86) {
                                                throw IlIlL0.a(v86);
                                            }
                                            v87 = 75.0f;
                                            break block195;
                                        }
                                        catch (Exception v88) {
                                            throw IlIlL0.a(v88);
                                        }
                                    }
                                    v87 = 5.0f;
                                }
                                try {
                                    try {
                                        try {
                                            cfr_temp_0 = v85 - v87;
                                            v70 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                            if (var6_5 == null) break block192;
                                            if (v70 <= 0) break block193;
                                        }
                                        catch (Exception v89) {
                                            throw IlIlL0.a(v89);
                                        }
                                        this.IlIlS = 0.0f;
                                        IlIlrW.IlIlU(new String[]{(String)IlIlL0.a("b", (int)8140, (long)(7254717202835326819L ^ var4_4)) + this.IlIli.getName() + (String)IlIlL0.a("b", (int)13845, (long)(9146593999986028210L ^ var4_4)) + var9_8 + (String)IlIlL0.a("b", (int)11834, (long)(1058504380484449944L ^ var4_4)) + var8_7});
                                        this.IlIlr();
                                        var2_2.skipBytes(var8_7);
                                        if (!IlIlOq.PACKET_DECODER_DISCONNECT.IlIlt()) break block196;
                                    }
                                    catch (Exception v90) {
                                        throw IlIlL0.a(v90);
                                    }
                                    var1_1.close();
                                }
                                catch (Exception v91) {
                                    throw IlIlL0.a(v91);
                                }
                            }
                            return;
                        }
                        try {
                            try {
                                v92 = this;
                                v93 = v92;
                                v94 = v92.IlIlS;
                                v95 = this.IlIlS;
                                if (var6_5 == null) break block197;
                                if (!(v95 > 0.0f)) break block198;
                            }
                            catch (Exception v96) {
                                throw IlIlL0.a(v96);
                            }
                            v95 = 0.01f;
                            break block197;
                        }
                        catch (Exception v97) {
                            throw IlIlL0.a(v97);
                        }
                    }
                    v95 = 0.0f;
                }
                v93.IlIlS = v94 - v95;
            }
            v70 = (int)var3_3.add(var2_2.readBytes(var2_2.readableBytes()));
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        IlIlL0.a = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls.a((long)8750768291132086453L, (long)2673499021218218721L, MethodHandles.lookup().lookupClass()).a(19799572137037L);
                        var20 = IlIlL0.a ^ 116152437595949L;
                        IlIlL0.d = new HashMap<K, V>(13);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[16];
                        var16_4 = 0;
                        var15_5 = "\\*\u00c7E\u007f\u008a\u00bc\rD\u0091:0{\u0089\u00b2\u00be\u0006\u0013y*\u00cb\u0006\u0088\u00f00\u00c4\u00b8f\u00d6\u00fd\u0097\u000b\u00f7c\u009e\u0093\u00dc\u00b2H\u00fd\u00d2\u00d4\u00cd\u009cI\u00ec\u00ecc\u0003,\u00877\u00c5\\92i`F\u00a9\u0006\u00d4&(\u00acy\u00f1!\u00f4\u0084\u0095?\u0002\u00102\u00eeM\u00ee\u00d7\u00e1\u00ac\u001a\u00e1vD\rc\u00c6[\u00af\u0018\u00da\u00c9e\u00b1d\u001a\u000f\u00b51\u00b5\u00a5\u0083\u0090\u001a\u00c7\u00cb\u00ed\u0096X\u0098\u00f5r\u0015~\u0010-A\u0006sb\u00b9\u00fan\u0012\u0089\u00c0#\u00ac`\u008d\u009f(\u001eCCt\u0083_P\u00ceq&uqh/\u00ca\u0091\u00d2\u00ef\u00ba\u00f94#\u009d\u008f\u00bb\u001ae%\u00c2o\u00ffZ\u00a1\u00cb\u00d0\u00f42\u00fb'X\u0018\u00da\u00d6\u00a8\u00d7&y\u00f6\u0080{\u00ff\u008d\u000b\u00d2g\u00d5\u009f/\u00df\u00d37\u00b7U\u00e3\u0089\u0018\u00a2\u00a8P\u00a0\u00d1\u00a0\u00a4\u00ddb\u00af\u0084\u0084\u00c2\u00e9\u00ab\u00d2\u00d8\u00a2T\u00bdFAG\u0090 \u009f)\b\u00a8\u00a2;^\u00e3\u0088\u00b6o\u00a2&\u001f'\u00f4c_\u00d5\u00a5\u00e6^\u00941\u00aa\u000b\u0001E\u0004_\u00da\u0095 \u009d\u00d1\u0081\u00ffp\u0005\u00d5\u000e\u00b9\u00a1@\n=\u00ff%h\u00a1^;g\u00efJ\u00c8\u00deA\u00b6T\u001f\u001f(]\u00ab \u0018\u0007\u00b3!FZw<^\u0084\u0014Q\u00b2\u0002\u00e4+^\u00cb\u00cf}8Za'\u008b6w\u00b2\u0015zBN\u0018\u00b0w\u00033\u00b8J-\u00f6J\u009c@1B\u00beOY\u00b6\u00e2\u00e7\u00b6\u00bf\u00ac\u00a1|\u0010\u0096\u00f8{\u0088\u009a\u00eew\u00c4\u0005\u0014Z\u00e4\u0099\u008e\u0015\u009b |$\u00cf7key\u001e\u00b0\u00ce\u0087\u00f3\u008e\u00e7\u0001uKC\u00bf9\u001f\u00d6\u008e\u00fd\u00ee]d\u00a8\u00c6a\u00a3\u00b4";
                        var17_6 = "\\*\u00c7E\u007f\u008a\u00bc\rD\u0091:0{\u0089\u00b2\u00be\u0006\u0013y*\u00cb\u0006\u0088\u00f00\u00c4\u00b8f\u00d6\u00fd\u0097\u000b\u00f7c\u009e\u0093\u00dc\u00b2H\u00fd\u00d2\u00d4\u00cd\u009cI\u00ec\u00ecc\u0003,\u00877\u00c5\\92i`F\u00a9\u0006\u00d4&(\u00acy\u00f1!\u00f4\u0084\u0095?\u0002\u00102\u00eeM\u00ee\u00d7\u00e1\u00ac\u001a\u00e1vD\rc\u00c6[\u00af\u0018\u00da\u00c9e\u00b1d\u001a\u000f\u00b51\u00b5\u00a5\u0083\u0090\u001a\u00c7\u00cb\u00ed\u0096X\u0098\u00f5r\u0015~\u0010-A\u0006sb\u00b9\u00fan\u0012\u0089\u00c0#\u00ac`\u008d\u009f(\u001eCCt\u0083_P\u00ceq&uqh/\u00ca\u0091\u00d2\u00ef\u00ba\u00f94#\u009d\u008f\u00bb\u001ae%\u00c2o\u00ffZ\u00a1\u00cb\u00d0\u00f42\u00fb'X\u0018\u00da\u00d6\u00a8\u00d7&y\u00f6\u0080{\u00ff\u008d\u000b\u00d2g\u00d5\u009f/\u00df\u00d37\u00b7U\u00e3\u0089\u0018\u00a2\u00a8P\u00a0\u00d1\u00a0\u00a4\u00ddb\u00af\u0084\u0084\u00c2\u00e9\u00ab\u00d2\u00d8\u00a2T\u00bdFAG\u0090 \u009f)\b\u00a8\u00a2;^\u00e3\u0088\u00b6o\u00a2&\u001f'\u00f4c_\u00d5\u00a5\u00e6^\u00941\u00aa\u000b\u0001E\u0004_\u00da\u0095 \u009d\u00d1\u0081\u00ffp\u0005\u00d5\u000e\u00b9\u00a1@\n=\u00ff%h\u00a1^;g\u00efJ\u00c8\u00deA\u00b6T\u001f\u001f(]\u00ab \u0018\u0007\u00b3!FZw<^\u0084\u0014Q\u00b2\u0002\u00e4+^\u00cb\u00cf}8Za'\u008b6w\u00b2\u0015zBN\u0018\u00b0w\u00033\u00b8J-\u00f6J\u009c@1B\u00beOY\u00b6\u00e2\u00e7\u00b6\u00bf\u00ac\u00a1|\u0010\u0096\u00f8{\u0088\u009a\u00eew\u00c4\u0005\u0014Z\u00e4\u0099\u008e\u0015\u009b |$\u00cf7key\u001e\u00b0\u00ce\u0087\u00f3\u008e\u00e7\u0001uKC\u00bf9\u001f\u00d6\u008e\u00fd\u00ee]d\u00a8\u00c6a\u00a3\u00b4".length();
                        var14_7 = 24;
                        var13_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = IlIlL0.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "r03$\u00c9(\u00f1\u0011\u00fa3\u00e1\u00f4\u00d9n\u00c1\u00dc\u00f1\u00d5x\u00c2\u00bbi\u00f4\u00c0\u001c\u009a3\u00af[W\u009cXj\u00b6&\u009f5\u0084u\n8\u0002\u00eb\u00dd\u008d\u0000\u00a2\u008f,\"#\u00a0y\u0096iG\u0098[t\u0087\u00be\u009a\u00bd\u00c1H\u00d3\u0016\u00f8\u00c1E)\u00e1\u00a4\u00af\u00d2\u008eWf\u000ba\u00ffP\u00c8\u00c8\u00dd\u00df\u0093N\u00adY u\u00ab\u0096\u0097\u001d\u0089";
                            var17_6 = "r03$\u00c9(\u00f1\u0011\u00fa3\u00e1\u00f4\u00d9n\u00c1\u00dc\u00f1\u00d5x\u00c2\u00bbi\u00f4\u00c0\u001c\u009a3\u00af[W\u009cXj\u00b6&\u009f5\u0084u\n8\u0002\u00eb\u00dd\u008d\u0000\u00a2\u008f,\"#\u00a0y\u0096iG\u0098[t\u0087\u00be\u009a\u00bd\u00c1H\u00d3\u0016\u00f8\u00c1E)\u00e1\u00a4\u00af\u00d2\u008eWf\u000ba\u00ffP\u00c8\u00c8\u00dd\u00df\u0093N\u00adY u\u00ab\u0096\u0097\u001d\u0089".length();
                            var14_7 = 40;
                            var13_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = IlIlL0.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl51:
                        // 1 sources

                        ** continue;
                    }
                }
                IlIlL0.b = var18_3;
                IlIlL0.c = new String[16];
                IlIlL0.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[12];
                var3_13 = 0;
                var4_14 = "\u0016$\u00b9\u00cb\u00c7V\u00a5\u00e4\u0091\u0082\u00f9:\u0080\u00a9sC\u00bb\u00d3\u00ca\u00ba\u0015X\u00cd\u00e1\u00fc\u0012[C\u0080l{\u0084\u001cF\u000b$\u00c1\u00db\u0019\u008a\u0015\u00d3\u000bQ\u00d4\u000b\u009a\u00a0\u00001\u0082r\u000f72<F\u00fe\u0003qA\u00e2\u0098,\u0081\u00b6\u00d9M\u009b\u00a52x\u0018\u0015\u0090\u00dc\u00d4n_\"";
                var5_15 = "\u0016$\u00b9\u00cb\u00c7V\u00a5\u00e4\u0091\u0082\u00f9:\u0080\u00a9sC\u00bb\u00d3\u00ca\u00ba\u0015X\u00cd\u00e1\u00fc\u0012[C\u0080l{\u0084\u001cF\u000b$\u00c1\u00db\u0019\u008a\u0015\u00d3\u000bQ\u00d4\u000b\u009a\u00a0\u00001\u0082r\u000f72<F\u00fe\u0003qA\u00e2\u0098,\u0081\u00b6\u00d9M\u009b\u00a52x\u0018\u0015\u0090\u00dc\u00d4n_\"".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00d6\u00f8\u0088\u009b\u00fc\u00db\u00f2\u00f9\u0096\u00a7`\u0081\u00e9KZ9";
                    var5_15 = "\u00d6\u00f8\u0088\u009b\u00fc\u00db\u00f2\u00f9\u0096\u00a7`\u0081\u00e9KZ9".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl104:
                // 1 sources

                ** continue;
            }
        }
        IlIlL0.e = var6_12;
        IlIlL0.f = new Integer[12];
        IlIlL0.IlIlb = (int)(IlIlhL.IlIlv() != false ? IlIlL0.b("i", (int)9510, (long)(1170051214579330381L ^ var20)) : (IlIljC.IlIlZ().IlIlW(IlIljC.v1_12_R1) != false ? IlIlL0.b("i", (int)14935, (long)(5334773307689660978L ^ var20)) : IlIlL0.b("i", (int)6271, (long)(2750452758394982425L ^ var20))));
        IlIlL0.IlIlj = Pattern.compile((String)IlIlL0.a("b", (int)26484, (long)(1499065104514174949L ^ var20)));
    }

    private static Exception a(Exception exception) {
        return exception;
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6364;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/IlIlL0", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            IlIlL0.c[n2] = IlIlL0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlL0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIlL0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x39D;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/IlIlL0", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlL0.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlL0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIlL0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlL0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(IlIlL0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

