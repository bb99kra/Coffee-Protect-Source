/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  org.bukkit.entity.Player
 */
package me.nik.coffeeprotect;

import io.netty.buffer.ByteBuf;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_Q3;
import me.nik.coffeeprotect.CheckException;
import me.nik.coffeeprotect.CP_jR;
import me.nik.coffeeprotect.CP_nH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.CP_Pn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.CP_dF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.simple.PacketPlayReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_Cg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_J2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JZ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Jv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_b5;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.entity.Player;

public class CP_P1
extends CP_Pn
implements CP_jR {
    private final ExecutorService CP_UnderScore;
    private final File CP_q;
    private boolean CP_o;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long f;
    private static transient /* synthetic */ String gArmlCVasO = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_P1(CoffeeProtect coffeeProtect) {
        long l = b ^ 0x59C5860083ECL;
        String string = CP_nH.CP_H();
        super(CP_dF.MONITOR);
        String string2 = string;
        try {
            this.CP_UnderScore = Executors.newSingleThreadExecutor();
            this.CP_o = false;
            this.CP_q = new File(coffeeProtect.getDataFolder(), (String)((Object)CP_P1.a("k", (int)24394, (long)(0x4FD27AFCFCC66ED9L ^ l))));
            if (string2 == null) {
                PacketWrapper.CP_e(new int[3]);
            }
        }
        catch (CheckException ilIlfF) {
            throw CP_P1.a(ilIlfF);
        }
    }

    private CP_Cg CP_W(PacketReceiveEvent packetReceiveEvent) {
        CP_Cg ilIlCg;
        block12: {
            CP_Cg ilIlCg2;
            block10: {
                CP_Cg ilIlCg3;
                block11: {
                    long l = b ^ 0x5C88D5AB5F93L;
                    ilIlCg3 = null;
                    String string = CP_nH.CP_H();
                    switch (CP_Q3.CP_A[((CP_nN)packetReceiveEvent.getPacketType()).ordinal()]) {
                        case 1: {
                            ilIlCg3 = new CP_JZ(packetReceiveEvent).CP_M();
                            break;
                        }
                        case 2: {
                            ilIlCg3 = new CP_J2(packetReceiveEvent).CP_n();
                            break;
                        }
                        case 3: {
                            ilIlCg3 = new CP_b5(packetReceiveEvent).CP_m().orElse(null);
                            break;
                        }
                        case 4: {
                            ilIlCg3 = new CP_Jv(packetReceiveEvent).CP_H();
                        }
                    }
                    try {
                        try {
                            ilIlCg2 = ilIlCg3;
                            if (string == null) break block10;
                            if (ilIlCg2 != null) break block11;
                        }
                        catch (CheckException ilIlfF) {
                            throw CP_P1.a(ilIlfF);
                        }
                        ilIlCg = null;
                        break block12;
                    }
                    catch (CheckException ilIlfF) {
                        throw CP_P1.a(ilIlfF);
                    }
                }
                ilIlCg2 = ilIlCg3;
            }
            ilIlCg = ilIlCg2.CP_r();
        }
        return ilIlCg;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void CP_O(PacketPlayReceiveEvent var1_1) {
        block26: {
            block24: {
                block25: {
                    block23: {
                        block22: {
                            var2_2 = CP_P1.b ^ 6600243595990L;
                            var4_3 = CP_nH.CP_H();
                            try {
                                try {
                                    try {
                                        try {
                                            if (this.CP_o) {
                                                v0 /* !! */  = var1_1.getUser();
                                                if (var4_3 == null) break block22;
                                            }
                                            ** GOTO lbl39
                                        }
                                        catch (CheckException v1) {
                                            throw CP_P1.a(v1);
                                        }
                                        if (v0 /* !! */  != null) {
                                        }
                                        ** GOTO lbl39
                                    }
                                    catch (CheckException v2) {
                                        throw CP_P1.a(v2);
                                    }
                                    v3 = var1_1;
                                    if (var4_3 == null) break block23;
                                }
                                catch (CheckException v4) {
                                    throw CP_P1.a(v4);
                                }
                                v0 /* !! */  = v3.getPlayer();
                            }
                            catch (CheckException v5) {
                                throw CP_P1.a(v5);
                            }
                        }
                        if (v0 /* !! */  == null) ** GOTO lbl39
                        v3 = var1_1;
                    }
                    try {
                        try {
                            if (var4_3 == null) break block24;
                            if (!v3.isCancelled()) break block25;
                        }
                        catch (CheckException v6) {
                            throw CP_P1.a(v6);
                        }
lbl39:
                        // 4 sources

                        return;
                    }
                    catch (CheckException v7) {
                        throw CP_P1.a(v7);
                    }
                }
                v3 = var1_1;
            }
            var5_4 = v3.getPacketType();
            try {
                v8 = CP_Q3.CP_A[var5_4.ordinal()];
                if (var4_3 == null) break block26;
            }
            catch (CheckException v9) {
                throw CP_P1.a(v9);
            }
            {
                ** switch (v8)
            }
lbl-1000:
            // 1 sources

            {
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 15: {
                    return;
                }
            }
lbl55:
            // 1 sources

            v8 = ((ByteBuf)var1_1.getFullBufferClone()).readableBytes();
        }
        var6_5 = v8;
        try {
            if (var6_5 < (int)CP_P1.f) {
                return;
            }
        }
        catch (CheckException v10) {
            throw CP_P1.a(v10);
        }
        var7_6 = (Player)var1_1.getPlayer();
        var8_7 = this.CP_W(var1_1);
        this.CP_UnderScore.execute((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$onPacketPlayReceive$1(org.bukkit.entity.Player me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN int me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_Cg ), ()V)((CP_P1)this, (Player)var7_6, (CP_nN)var5_4, (int)var6_5, (CP_Cg)var8_7));
    }

    public CP_nH CP_S() {
        block4: {
            CP_P1 ilIlP1;
            block5: {
                long l = b ^ 0x2FFF85A8C9D8L;
                String string = CP_nH.CP_H();
                try {
                    try {
                        ilIlP1 = this;
                        if (string == null) break block4;
                        if (!ilIlP1.CP_o) break block5;
                    }
                    catch (CheckException ilIlfF) {
                        throw CP_P1.a(ilIlfF);
                    }
                    return CP_nH.ALREADY_RUNNING;
                }
                catch (CheckException ilIlfF) {
                    throw CP_P1.a(ilIlfF);
                }
            }
            ilIlP1 = this;
        }
        ilIlP1.CP_o = true;
        return CP_nH.START_SUCCESS;
    }

    public CP_nH CP_q() {
        block4: {
            CP_P1 ilIlP1;
            block5: {
                long l = b ^ 0x355E719A24F7L;
                String string = CP_nH.CP_H();
                try {
                    try {
                        ilIlP1 = this;
                        if (string == null) break block4;
                        if (ilIlP1.CP_o) break block5;
                    }
                    catch (CheckException ilIlfF) {
                        throw CP_P1.a(ilIlfF);
                    }
                    return CP_nH.NOT_RUNNING;
                }
                catch (CheckException ilIlfF) {
                    throw CP_P1.a(ilIlfF);
                }
            }
            ilIlP1 = this;
        }
        ilIlP1.CP_o = false;
        return CP_nH.STOP_SUCCESS;
    }

    @Override
    public void CP_C() {
        CP_r7.CP_b().CP_g().CP_UnderScore(this);
    }

    @Override
    public void CP_y() {
        long l = b ^ 0x2104BE46877FL;
        CP_r7.CP_b().CP_g().CP_A(this);
        String string = CP_nH.CP_H();
        this.CP_q();
        String string2 = string;
        try {
            if (PacketWrapper.CP_z() == null) {
                CP_nH.CP_X("GgJNOc");
            }
        }
        catch (CheckException ilIlfF) {
            throw CP_P1.a(ilIlfF);
        }
    }

    /*
     * Loose catch block
     */
    private /* synthetic */ void lambda$onPacketPlayReceive$1(Player player, CP_nN ilIlnN, int n, CP_Cg ilIlCg) {
        block21: {
            Object object;
            Object object2;
            StringBuilder stringBuilder;
            String string2;
            long l;
            block24: {
                block28: {
                    Map<String, NBT> map;
                    block30: {
                        NBTCompound nBTCompound;
                        block27: {
                            block25: {
                                block26: {
                                    CP_Cg ilIlCg2;
                                    block22: {
                                        block23: {
                                            Player player2;
                                            block20: {
                                                l = b ^ 0x7EC335AB2239L;
                                                string2 = CP_nH.CP_H();
                                                try {
                                                    player2 = player;
                                                    if (string2 == null) break block20;
                                                    if (player2 == null) break block21;
                                                }
                                                catch (IOException iOException) {
                                                    throw CP_P1.a(iOException);
                                                }
                                                player2 = player;
                                            }
                                            if (!player2.isOnline()) break block21;
                                            stringBuilder = new StringBuilder((String)((Object)CP_P1.a("k", (int)11972, (long)(0x3D2D8DC583C43E80L ^ l))) + player.getName() + (String)((Object)CP_P1.a("k", (int)18651, (long)(0x6D3997CAA17B589EL ^ l))) + ilIlnN.name() + (String)((Object)CP_P1.a("k", (int)1244, (long)(0x6C3375FAFFFB149DL ^ l))) + n);
                                            try {
                                                ilIlCg2 = ilIlCg;
                                                if (string2 == null) break block22;
                                                if (ilIlCg2 != null) break block23;
                                                break block24;
                                            }
                                            catch (IOException iOException) {
                                                throw CP_P1.a(iOException);
                                            }
                                        }
                                        ilIlCg2 = ilIlCg;
                                    }
                                    object2 = ilIlCg2.CP_J().getName().getKey();
                                    if (string2 == null) break block25;
                                    try {
                                        if (!((String)object2).equals(CP_P1.a("k", (int)31400, (long)(0x4AAFB7BA06B8EAEBL ^ l)))) break block26;
                                        break block24;
                                        catch (IOException iOException) {
                                            throw CP_P1.a(iOException);
                                        }
                                    }
                                    catch (IOException iOException) {
                                        throw CP_P1.a(iOException);
                                    }
                                }
                                stringBuilder.append((String)((Object)CP_P1.a("k", (int)167, (long)(0x5FD55BEACE2310E7L ^ l)))).append((String)object2);
                            }
                            object = ilIlCg.CP_L();
                            try {
                                nBTCompound = object;
                                if (string2 == null) break block27;
                                if (nBTCompound == null) break block28;
                            }
                            catch (IOException iOException) {
                                throw CP_P1.a(iOException);
                            }
                            nBTCompound = object;
                        }
                        map = nBTCompound.getTags();
                        if (string2 == null) break block30;
                        try {
                            block31: {
                                if (map.isEmpty()) break block28;
                                break block31;
                                catch (IOException iOException) {
                                    throw CP_P1.a(iOException);
                                }
                            }
                            map = ((NBTCompound)object).getTags();
                        }
                        catch (IOException iOException) {
                            throw CP_P1.a(iOException);
                        }
                    }
                    map.forEach((string, nBT) -> stringBuilder.append(" ").append("(").append((String)string).append("-").append(nBT.toString()).append(")"));
                }
                stringBuilder.append("}");
            }
            try {
                block29: {
                    boolean bl = this.CP_q.exists();
                    if (string2 == null) break block29;
                    try {
                        block32: {
                            if (bl) break block29;
                            break block32;
                            catch (IOException iOException) {
                                throw CP_P1.a(iOException);
                            }
                        }
                        bl = this.CP_q.createNewFile();
                    }
                    catch (IOException iOException) {
                        throw CP_P1.a(iOException);
                    }
                }
                object2 = new FileWriter(this.CP_q, true);
                object = new PrintWriter((Writer)object2);
                ((PrintWriter)object).println(stringBuilder);
                ((PrintWriter)object).flush();
                ((PrintWriter)object).close();
            }
            catch (IOException iOException) {
                this.CP_q();
                throw new CheckException((String)((Object)CP_P1.a("k", (int)24420, (long)(0x12AB18A8CABA4F23L ^ l))) + iOException.getLocalizedMessage());
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    CP_P1.b = CP_s.a(-8197292846402025959L, -4431068857028150244L, MethodHandles.lookup().lookupClass()).a(23319460801725L);
                    CP_P1.e = new HashMap<K, V>(13);
                    var5 = CP_P1.b ^ 73957463818070L;
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[7];
                    var12_4 = 0;
                    var11_5 = "V\u009aIS\u00ae\u001d\u0094\u00f8\u00ff(>\u0016\u00d92\n\u00e2\u00aa\u0095/\u00eeA\u00b1\u00e4S\u0018\u0015\u00ed\u00f6\u00ffj\\bv~\u00ce\u0081R\u00a2\u00d2\u00df\u0084A\u0010?\u00b5\u00eb%\u00c0\r@\u00cdq\u0094\u00f2\u0080E\u00d8\u00bd\u0004|<N\u0001e\u0016E\u009e#\u00b9:\t\u0018\u00edF\u00fd\u00be\u00aa\u00b0\u00dd\u001e\u00d8\u00b4\u00d73\u0095\u00ed]j\u00ed\u00c2\u00de\u00b9B\u00c8Am\u00b3k\u00efe\u00ce\u0016\u00e7R\u00d5\u00c3\u00fa\u00be5h\u008ft\u00a7\u00b4(\u0089\u008b\u0012\u0083\u00077\u00ccu]\u00c5!\u0085\u00bd\u00cb(\u00bbB\u008a\u0002\u0089\u001c\u00f4\u0003p\u00b3\u00de3O\u0000v\u0090\u00cd\u00e1\u0089\u0096FQ\u00c6\u0015\u00c9\u0010\u00c1[\u00e4W\u00e6c\u00bc\u00c6Y\u00dcRig\u007fR\u00b8";
                    var13_6 = "V\u009aIS\u00ae\u001d\u0094\u00f8\u00ff(>\u0016\u00d92\n\u00e2\u00aa\u0095/\u00eeA\u00b1\u00e4S\u0018\u0015\u00ed\u00f6\u00ffj\\bv~\u00ce\u0081R\u00a2\u00d2\u00df\u0084A\u0010?\u00b5\u00eb%\u00c0\r@\u00cdq\u0094\u00f2\u0080E\u00d8\u00bd\u0004|<N\u0001e\u0016E\u009e#\u00b9:\t\u0018\u00edF\u00fd\u00be\u00aa\u00b0\u00dd\u001e\u00d8\u00b4\u00d73\u0095\u00ed]j\u00ed\u00c2\u00de\u00b9B\u00c8Am\u00b3k\u00efe\u00ce\u0016\u00e7R\u00d5\u00c3\u00fa\u00be5h\u008ft\u00a7\u00b4(\u0089\u008b\u0012\u0083\u00077\u00ccu]\u00c5!\u0085\u00bd\u00cb(\u00bbB\u008a\u0002\u0089\u001c\u00f4\u0003p\u00b3\u00de3O\u0000v\u0090\u00cd\u00e1\u0089\u0096FQ\u00c6\u0015\u00c9\u0010\u00c1[\u00e4W\u00e6c\u00bc\u00c6Y\u00dcRig\u007fR\u00b8".length();
                    var10_7 = 24;
                    var9_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = CP_P1.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u00ae7\u00ab\u00ed)X\u00b1\u0090:#5Ye\u0001\u0094\u0084\u0010\u00fe\u00cdS\u0001\u0091\u00c8\u00c0\u00af\u00eaN\u009d*\u00d4\u00fc\u0081\u0088";
                        var13_6 = "\u00ae7\u00ab\u00ed)X\u00b1\u0090:#5Ye\u0001\u0094\u0084\u0010\u00fe\u00cdS\u0001\u0091\u00c8\u00c0\u00af\u00eaN\u009d*\u00d4\u00fc\u0081\u0088".length();
                        var10_7 = 16;
                        var9_8 = -1;
lbl34:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = CP_P1.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
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
            CP_P1.c = var14_3;
            CP_P1.d = new String[7];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl65:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = 7882384471136906607L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        CP_P1.f = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4893;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/CP_P1", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            CP_P1.d[n2] = CP_P1.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_P1.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/CP_P1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_P1.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
