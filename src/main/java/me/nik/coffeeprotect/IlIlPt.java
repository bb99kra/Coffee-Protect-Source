/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIlPs
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIlPw
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIldF
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.UserDisconnectEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.IlIlum
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.type.IlIljn
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlG2
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlQG
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlv_
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlCH
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlD1
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlDI
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlP
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlbU
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 *  org.bukkit.GameMode
 *  org.bukkit.Location
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlCF;
import me.nik.coffeeprotect.IlIlPB;
import me.nik.coffeeprotect.IlIlQb;
import me.nik.coffeeprotect.IlIlT9;
import me.nik.coffeeprotect.IlIlTF;
import me.nik.coffeeprotect.IlIlWx;
import me.nik.coffeeprotect.IlIljR;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.IlIlvS;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIlPs;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIlPw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIldF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.UserDisconnectEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.IlIlum;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.type.IlIljn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.IlIlG2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlQG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlv_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlCH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlD1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlDI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlbU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class IlIlPt
extends IlIlPw
implements IlIljR {
    private final CoffeeProtect IlIlt;
    private final Set<UUID> IlIle;
    private final List<String> IlIlo;
    private final List<String> IlIlf;
    private static int IlIlV;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final long[] h;
    private static final Long[] i;
    private static final Map j;
    private static transient /* synthetic */ String fezeevwzEG = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlPt(CoffeeProtect coffeeProtect) {
        long l = a ^ 0x64E145CCB209L;
        super(IlIldF.LOWEST);
        this.IlIle = new HashSet<UUID>();
        String[] stringArray = new String[IlIlPt.b("l", (int)25797, (long)(0x6AB723B3D5D2399AL ^ l))];
        stringArray[0] = IlIlPt.a("x", (int)23718, (long)(0x29891F07BD9AB7C0L ^ l));
        stringArray[1] = IlIlPt.a("x", (int)23490, (long)(0x4CC02C47910530A6L ^ l));
        stringArray[2] = IlIlPt.a("x", (int)12523, (long)(0x6AE2DC17D7BEDB92L ^ l));
        stringArray[3] = IlIlPt.a("x", (int)31861, (long)(0xC35C3CEC0839716L ^ l));
        stringArray[4] = IlIlPt.a("x", (int)1019, (long)(0x6F6ABE613A886899L ^ l));
        stringArray[5] = IlIlPt.a("x", (int)23597, (long)(0x563CBEA435B0B74CL ^ l));
        stringArray[IlIlPt.b("l", (int)25314, (long)(0x621FAD1A509E3FBFL ^ l))] = IlIlPt.a("x", (int)334, (long)(0x7319A71B52F16A26L ^ l));
        stringArray[IlIlPt.b("l", (int)23946, (long)(0x5B4027CD1ACF80D1L ^ l))] = IlIlPt.a("x", (int)9048, (long)(0x4DD3B96CE27DC820L ^ l));
        this.IlIlo = Arrays.asList(stringArray);
        int n = IlIlPt.IlIln();
        String[] stringArray2 = new String[IlIlPt.b("l", (int)19567, (long)(0x549181A0BF6F1131L ^ l))];
        stringArray2[0] = IlIlPt.a("x", (int)20485, (long)(0x3CEDB59E9EF3B69L ^ l));
        stringArray2[1] = IlIlPt.a("x", (int)5479, (long)(0x7A143967EA5C7E0DL ^ l));
        stringArray2[2] = IlIlPt.a("x", (int)4475, (long)(0x4899130928B57A1BL ^ l));
        stringArray2[3] = IlIlPt.a("x", (int)13765, (long)(0x606269F3775F5EAEL ^ l));
        stringArray2[4] = IlIlPt.a("x", (int)8769, (long)(0x6AF5E87FB566C92EL ^ l));
        stringArray2[5] = IlIlPt.a("x", (int)14969, (long)(0x1C5CD7AE9AA0D110L ^ l));
        stringArray2[IlIlPt.b("l", (int)14340, (long)(0x60958F47CA42E55EL ^ l))] = IlIlPt.a("x", (int)9231, (long)(0x7D213B31F5CC4F6AL ^ l));
        stringArray2[IlIlPt.b("l", (int)7674, (long)(0x2DBD65D2ADEC40A6L ^ l))] = IlIlPt.a("x", (int)21236, (long)(0x1F099A692F163999L ^ l));
        this.IlIlf = Arrays.asList(stringArray2);
        this.IlIlt = coffeeProtect;
        if (n != 0) {
            PacketWrapper.IlIle((int[])new int[2]);
        }
    }

    public void IlIlq(Player player, IlIlWx ilIlWx) {
        long l = a ^ 0xAC377B460BAL;
        IlIlG2 ilIlG2 = IlIlr7.IlIlb().IlIlq().IlIlV((Object)player);
        int n = IlIlPt.IlIlD();
        Location location = player.getLocation();
        block0 : switch (IlIlCF.IlIlE[ilIlWx.ordinal()]) {
            case 1: {
                float f = 3.4028234E35f;
                CallSite callSite = IlIlPt.b("l", (int)27254, (long)(0x21E30BBD67D7E59DL ^ l));
                IlIlv_ ilIlv_ = new IlIlv_((double)f, (double)f, (double)f);
                IlIlD1 ilIlD1 = new IlIlD1(ilIlv_, ilIlv_);
                ilIlD1.IlIld(Collections.emptyList());
                ilIlD1.IlIlE(IlIlP.KEEP_BLOCKS);
                ilIlD1.IlIlM(new IlIlum(IlIljn.IlIlhm));
                IlIlDI ilIlDI = new IlIlDI(new IlIlum(IlIljn.IlIlhm), true, new IlIlv_(location.getX(), location.getY(), location.getZ()), new IlIlQG(f, f, f), f, (int)callSite);
                for (int i = 0; i < IlIlPt.b("l", (int)14116, (long)(0x5BADC4DC3E1EB8CEL ^ l)); ++i) {
                    ilIlG2.IlIlx((PacketWrapper)ilIlD1);
                    ilIlG2.IlIlx((PacketWrapper)ilIlDI);
                    if (n == 0) break block0;
                    if (n != 0) continue;
                }
                if (n != 0) break;
            }
            case 2: {
                this.IlIle.add(player.getUniqueId());
                if (n != 0) break;
            }
            case 3: {
                boolean bl = this.IlIlt.IlIli();
                if (n != 0) {
                    if (bl) {
                        IlIlrW.IlIlU(new String[]{IlIlPt.a("x", (int)10132, (long)(0x2C06A10CC5049E40L ^ l))});
                        return;
                    }
                    bl = this.IlIle.add(player.getUniqueId());
                }
                if (n != 0) {
                    if (player.getGameMode() != GameMode.SURVIVAL) {
                        player.setGameMode(GameMode.SURVIVAL);
                    }
                    new IlIlTF(this, player).runTaskTimer((Plugin)this.IlIlt, 0L, 1L);
                }
                if (n != 0) break;
            }
            case 4: {
                boolean bl = this.IlIlt.IlIli();
                if (n != 0) {
                    if (bl) {
                        IlIlrW.IlIlU(new String[]{IlIlPt.a("x", (int)22680, (long)(0x64554B25B7A76145L ^ l))});
                        return;
                    }
                    bl = this.IlIle.add(player.getUniqueId());
                }
                new IlIlPB(this, location, player).runTaskTimer((Plugin)this.IlIlt, 0L, 1L);
                if (n != 0) break;
            }
            case 5: {
                boolean bl = this.IlIlt.IlIli();
                if (n != 0) {
                    if (bl) {
                        IlIlrW.IlIlU(new String[]{IlIlPt.a("x", (int)22680, (long)(0x64554B25B7A76145L ^ l))});
                        return;
                    }
                    bl = this.IlIle.add(player.getUniqueId());
                }
                IlIlbU ilIlbU = new IlIlbU(IlIlCH.WIN_GAME, 1.0f);
                new IlIlT9(this, player, ilIlbU).runTaskTimerAsynchronously((Plugin)this.IlIlt, 0L, 0L);
                if (n != 0) break;
            }
            case 6: {
                boolean bl = this.IlIlt.IlIli();
                if (n != 0) {
                    if (bl) {
                        IlIlrW.IlIlU(new String[]{IlIlPt.a("x", (int)22680, (long)(0x64554B25B7A76145L ^ l))});
                        return;
                    }
                    bl = this.IlIle.add(player.getUniqueId());
                }
                new IlIlvS(this, player, ilIlG2).runTaskTimerAsynchronously((Plugin)this.IlIlt, 0L, (long)IlIlPt.c("x", (int)28561, (long)(0x65FEBD0937CB58D7L ^ l)));
            }
        }
    }

    public void IlIlP(PacketReceiveEvent packetReceiveEvent) {
        boolean bl;
        block7: {
            block8: {
                block5: {
                    PacketReceiveEvent packetReceiveEvent2;
                    int n;
                    block6: {
                        Object object;
                        block4: {
                            long l = a ^ 0x4F89252DE33EL;
                            n = IlIlPt.IlIln();
                            object = packetReceiveEvent.getUser();
                            if (n != 0) break block4;
                            if (object == null) break block5;
                            packetReceiveEvent2 = packetReceiveEvent;
                            if (n != 0) break block6;
                            object = packetReceiveEvent2.getPlayer();
                        }
                        if (object == null) break block5;
                        packetReceiveEvent2 = packetReceiveEvent;
                    }
                    bl = packetReceiveEvent2.isCancelled();
                    if (n != 0) break block7;
                    if (!bl) break block8;
                }
                return;
            }
            bl = this.IlIle.contains(packetReceiveEvent.getUser().IlIlM());
        }
        if (bl) {
            packetReceiveEvent.setCancelled(true);
        }
    }

    public void IlIlF(UserDisconnectEvent userDisconnectEvent) {
        long l = a ^ 0x282E0F4EEB09L;
        IlIlQb.IlIly(() -> this.IlIle.remove(userDisconnectEvent.getUser().IlIlM()), (long)IlIlPt.c("x", (int)18718, (long)(0x5461B0E78E9475EAL ^ l)));
    }

    @Override
    public void IlIlC() {
        IlIlr7.IlIlb().IlIlg().IlIl_((IlIlPs)this);
    }

    @Override
    public void IlIly() {
        this.IlIle.clear();
        IlIlr7.IlIlb().IlIlg().IlIlA((IlIlPs)this);
    }

    static /* synthetic */ List IlIlm(IlIlPt ilIlPt) {
        return ilIlPt.IlIlo;
    }

    static /* synthetic */ List IlIlH(IlIlPt ilIlPt) {
        return ilIlPt.IlIlf;
    }

    public static void IlIla(int n) {
        IlIlV = n;
    }

    public static int IlIln() {
        return IlIlV;
    }

    public static int IlIlD() {
        int n = IlIlPt.IlIln();
        if (n == 0) {
            return 82;
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            block21: {
                                IlIlPt.a = IlIls.a((long)7183996068580144861L, (long)1711922279806884736L, MethodHandles.lookup().lookupClass()).a(15844057377645L);
                                IlIlPt.d = new HashMap<K, V>(13);
                                IlIlPt.IlIla(0);
                                var22 = IlIlPt.a ^ 50061756776863L;
                                var24_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                v0 = SecretKeyFactory.getInstance("DES");
                                v1 = new byte[8];
                                v2 = v1;
                                v1[0] = (byte)(var22 >>> 56);
                                for (var25_2 = 1; var25_2 < 8; ++var25_2) {
                                    v2 = v2;
                                    v2[var25_2] = (byte)(var22 << var25_2 * 8 >>> 56);
                                }
                                var24_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                                var31_3 = new String[18];
                                var29_4 = 0;
                                var28_5 = "D\u000e\b\tM$\u0094o?/\u00a3+t(\u0015\u00c64\u00a6\u00e1\t \u009b\u00c8\u00cd\u00baN\u00150\u00b5\u0003\u00ff\u00da:\u00ce!!\u00e8!\u00ad*\u00a7\u00dd\u009dt \u0016\u009e5\u0010\u0002<W||&\u0097H\u00c94wS\u00d0\u0092\u00c9A2)\u009d\u0091\u0093\u00f1\u00da\u00f2\u00b4\u00d8Bi\u000e\u00b6\u0012\u00a0J\u00een\u00d6|\u00d8{y\u0089v\u00da\u00d2W\u00felV\u00ff\u00d1%\u00e2\u0005`\u00e9\u00ab4\u00d0\u00ab\u00c6\u0013k\u00dd\u00d95\u0086*\u00fb\u00af\u0011\u00a8\u00a4\u0002U\u0092\u0081l=\u0094\u0016(\u001cW\u00b6\u00ff3\u00bck\u00cd'\u00db{\u00fa\fG\u00cd_\u00ee^\u00e1X\u00f1e\"=\u00b5\u00d1\u0015'\u0080\u00d5K'U|\u00a8s8%Yf8A\u00e5\u001bND\u00b7\u0001\u009b\u00e7\u00e52\u009eP\u00d8G\u00f6\u00ab\f\fQ\u00a5:{&_8==\u009d\u00b1_dW\u0088 \u00d9\u00ccF\u00f1\u0014\u001b\u00a1\u0017\u0094\u0081\u001f\u00a1s\u007fT\u0001T\u00b5u\u001a\u008f0,\u0005g\u00c2$\u00ed\u0097\u00dca\u00a4!\u009c1\u00b5\u0092_\u0003@\u0007\u00a1\u0010\u0010\u0089A)\u007f\u000bg\u00908iI\u00c7\r\u00fe\u0016\u00b8\u00beI\u00ee5\u00ccr\u0082\u007f\u00c9\u00c3\u00eb0\u00df\u00a8k\\\u00e7\u001ba{\u00cd\u001f\u00d1e\u00dfzJw*%%\u00c0w\u00f5\u0092\u00d3\u001d\u00ba\u001a\u00b6H\u00c6HL\r\u00f3\u008b\u00ca\u00a6*\u00dc\u001afI\u00a3\u00d6\u00ff;\u001d\u00140\u00c6^C9)\u00cc\u00eaCs=t\u00dc\u0083\u00e2\u0088\u0014\u00e3\u00e2\u00f6\u0097\u00a0\u0081x\u00dc\u00ddB\u00ec\u00e4\u0087\u00e4D\u0095Z\u00c9]\u00d2\u009d\u00d2Z\u00fc\u00cb&Gz>\\}\u00f0H\u009de\u00e89\u007f\u00e4>\u0004G\u00a8u_A\u00cew7\u00c2oh/\u00eb\u0087j&v)\\=r\u00b79\u009f^\u0012\u00e4\u00e9\u00d4\u00b5\u0015h\u0019\u00ac\u00cb\u0006\u00a1\u00de&\u0018\u001b\u0083G`\"w\u00df\u0013L|$\u00be\u009dUL#\u00812\u0087>\u00e0\u00dd\u00cd\u008dP\u00f6h\f@\u0014\u00e2\u00cb\u000b\u0095\u00c0\u00cb\u00f8\u00b8\u00d4/\u00a5\u00b2o\u0018-\u00d8\u00d5\u00ea\u00fe\u0003<#\u00a3\u00ea\u00ad\u00b3\u00cd\u009d2\u008d\u00b7B{*m\u00d7\u00d8s}tq3;\u0083E\u00e3\u00ac\u00df\u009aT6\u00b7\u00a0\u00c6\u00a4d\u00e15\u00bc|\u00e6\u009d\u0018\u00e2\u00f4O|\u00e0\u00d6\u0090\u0002\u00a4\u00a5%9(\u0080J\u00cbM\u00a6\u00e2\u00f9\u000fX\n\u0095\u0096FS\u0001E)I[=\u00ec3\u00a4\u00b9E\u00d6\u00fb\u0098\u00d6\u00e5\u00d5\u00de\u00ae\u00efs&U \u00c2,@?\u00ae-\u00bb.\fLU\u009a\u00eb\u00c0\u008e\u00c1\u00df\u00d1/\u008c\u0093\u009e\u00e2OU\u0082R\u0012W\u009a1\u00fdt\u009bV\u00e9\u00cd\u0094\u00e9!\u0015\u00c1\u0084\u00c4\u0099\u0095\u00fd\u00c9h\u0083\u00ddB\u001f\u00bf{\u00c9D\u00d3|gq\u00d97NOq\u00fehB;y\u00a5\u00dc\u00bf3?\u00b7\u00b9+\u00a31\u0089W\u009fV\u00c7=\u008f\u00f6cT\r\u00c6\u00eb\u0082\u0081g\u0001\u001d\u00eb\u009a\u00d3\u00ab\u00ee\u00d94\u0087\n\u00adR\u001a\u0095\u00f0\u009c\u000f\u0001Cf3\u00ce`\u00aa4R\u0012tK\u0085S8\n3\u0014\u0016\u00ea\u00ac\u00b6\u00984:\u00cf$\u008e\u00b7\u00d8\u00a3\n\u00ea\u008e<\u009a\u0011ky\u007f\u00a7f\u00c7\u001a\u00ee\u0019j\u00d0]w(\u00b7\u00ed\u0019\u00ac\u0005\u00938?\u00b6\u00bc?@\u00ff\u0087/\u0015\u00c4^\u000b\u000eO}\u00b0\u00d1\u00c8\u001c@\u009e,\u00c0\u00d3\u00efE\u000b\u009ez\u0005(\u00df:a\u000f\u00f9\u00a8\u00a3\u00ed\u0090 \u00ad\u00c3W\u0096\u00d9\u00ceK\u00c69\u00a3\u00ce\u00e4z\u008c\u00a8X\u00a9\u00b2\u00c0f\u00acN\u0090\u00bb\u00f1\u0094\u00a0\u00a2\u00dd!Q\u0002;N\\,\u00eb\u00cb]'\u00a8w\u00d6f\u00ff\u00eeK\u0015\u0086\u00f4\u00eb\u0095\u0012\u00a6\u00d8d.\u009dp\u0093y\u00bc\u0002\u0002\u00a7\u00e6\u008e+\u00d6,\u0005\u0093\u00cf\u00f6\u00caT\u0016aP\u0091 \u00a5\u00b7\u00a0W\u009dJ$\u0000\u00ff\u00a6\u0010\u00a1uD>\u0086\u00f4=\u00fb\u009e\u0099\u0007\u00d8P\u009c\u00d6%\t+\u00b8\u00cc\u00ea\u00f7\u0006\u00e2Q\u00d2\u00b6\u00e1\u00e90b\u0013\u00fae\u00ae\u009b\u00c0\u0090\u009fO\u00df\u00ed\u00e3@\u008e\u00ca\r*l_\u00f4X\u008c\u00f6\u00bc\u00da~,!\u00daGP\u0095\u00d6\u00e9\u000b\f\u00f6m\n\u001a+)E\u000e\u0092\u00e7\u001ce?\u00f1\u0086v\u0010\u00b9\u0010\u00d4#xOQ6\u0015@\u0096~\u0093\u00d3\u00a5\u001b\u0097xR\u00f0\u0098\u00cdy\u008c\u00aa\u00c8\u00a2t\u0089\u00b1\u00fe\u00e2_@u\u00d7\u0088\f\u00baT\u00e6@\u000fs\u0015\u001bV(9Pc:\u0094\u001b\u00b8\u00c9\u0014\u00b8E 7\u00fd\u00a6\u00e2\u00a9\u00ad\u0088\u00a6\u0007\u0013\u00c1\u00bcC\u0011";
                                var30_6 = "D\u000e\b\tM$\u0094o?/\u00a3+t(\u0015\u00c64\u00a6\u00e1\t \u009b\u00c8\u00cd\u00baN\u00150\u00b5\u0003\u00ff\u00da:\u00ce!!\u00e8!\u00ad*\u00a7\u00dd\u009dt \u0016\u009e5\u0010\u0002<W||&\u0097H\u00c94wS\u00d0\u0092\u00c9A2)\u009d\u0091\u0093\u00f1\u00da\u00f2\u00b4\u00d8Bi\u000e\u00b6\u0012\u00a0J\u00een\u00d6|\u00d8{y\u0089v\u00da\u00d2W\u00felV\u00ff\u00d1%\u00e2\u0005`\u00e9\u00ab4\u00d0\u00ab\u00c6\u0013k\u00dd\u00d95\u0086*\u00fb\u00af\u0011\u00a8\u00a4\u0002U\u0092\u0081l=\u0094\u0016(\u001cW\u00b6\u00ff3\u00bck\u00cd'\u00db{\u00fa\fG\u00cd_\u00ee^\u00e1X\u00f1e\"=\u00b5\u00d1\u0015'\u0080\u00d5K'U|\u00a8s8%Yf8A\u00e5\u001bND\u00b7\u0001\u009b\u00e7\u00e52\u009eP\u00d8G\u00f6\u00ab\f\fQ\u00a5:{&_8==\u009d\u00b1_dW\u0088 \u00d9\u00ccF\u00f1\u0014\u001b\u00a1\u0017\u0094\u0081\u001f\u00a1s\u007fT\u0001T\u00b5u\u001a\u008f0,\u0005g\u00c2$\u00ed\u0097\u00dca\u00a4!\u009c1\u00b5\u0092_\u0003@\u0007\u00a1\u0010\u0010\u0089A)\u007f\u000bg\u00908iI\u00c7\r\u00fe\u0016\u00b8\u00beI\u00ee5\u00ccr\u0082\u007f\u00c9\u00c3\u00eb0\u00df\u00a8k\\\u00e7\u001ba{\u00cd\u001f\u00d1e\u00dfzJw*%%\u00c0w\u00f5\u0092\u00d3\u001d\u00ba\u001a\u00b6H\u00c6HL\r\u00f3\u008b\u00ca\u00a6*\u00dc\u001afI\u00a3\u00d6\u00ff;\u001d\u00140\u00c6^C9)\u00cc\u00eaCs=t\u00dc\u0083\u00e2\u0088\u0014\u00e3\u00e2\u00f6\u0097\u00a0\u0081x\u00dc\u00ddB\u00ec\u00e4\u0087\u00e4D\u0095Z\u00c9]\u00d2\u009d\u00d2Z\u00fc\u00cb&Gz>\\}\u00f0H\u009de\u00e89\u007f\u00e4>\u0004G\u00a8u_A\u00cew7\u00c2oh/\u00eb\u0087j&v)\\=r\u00b79\u009f^\u0012\u00e4\u00e9\u00d4\u00b5\u0015h\u0019\u00ac\u00cb\u0006\u00a1\u00de&\u0018\u001b\u0083G`\"w\u00df\u0013L|$\u00be\u009dUL#\u00812\u0087>\u00e0\u00dd\u00cd\u008dP\u00f6h\f@\u0014\u00e2\u00cb\u000b\u0095\u00c0\u00cb\u00f8\u00b8\u00d4/\u00a5\u00b2o\u0018-\u00d8\u00d5\u00ea\u00fe\u0003<#\u00a3\u00ea\u00ad\u00b3\u00cd\u009d2\u008d\u00b7B{*m\u00d7\u00d8s}tq3;\u0083E\u00e3\u00ac\u00df\u009aT6\u00b7\u00a0\u00c6\u00a4d\u00e15\u00bc|\u00e6\u009d\u0018\u00e2\u00f4O|\u00e0\u00d6\u0090\u0002\u00a4\u00a5%9(\u0080J\u00cbM\u00a6\u00e2\u00f9\u000fX\n\u0095\u0096FS\u0001E)I[=\u00ec3\u00a4\u00b9E\u00d6\u00fb\u0098\u00d6\u00e5\u00d5\u00de\u00ae\u00efs&U \u00c2,@?\u00ae-\u00bb.\fLU\u009a\u00eb\u00c0\u008e\u00c1\u00df\u00d1/\u008c\u0093\u009e\u00e2OU\u0082R\u0012W\u009a1\u00fdt\u009bV\u00e9\u00cd\u0094\u00e9!\u0015\u00c1\u0084\u00c4\u0099\u0095\u00fd\u00c9h\u0083\u00ddB\u001f\u00bf{\u00c9D\u00d3|gq\u00d97NOq\u00fehB;y\u00a5\u00dc\u00bf3?\u00b7\u00b9+\u00a31\u0089W\u009fV\u00c7=\u008f\u00f6cT\r\u00c6\u00eb\u0082\u0081g\u0001\u001d\u00eb\u009a\u00d3\u00ab\u00ee\u00d94\u0087\n\u00adR\u001a\u0095\u00f0\u009c\u000f\u0001Cf3\u00ce`\u00aa4R\u0012tK\u0085S8\n3\u0014\u0016\u00ea\u00ac\u00b6\u00984:\u00cf$\u008e\u00b7\u00d8\u00a3\n\u00ea\u008e<\u009a\u0011ky\u007f\u00a7f\u00c7\u001a\u00ee\u0019j\u00d0]w(\u00b7\u00ed\u0019\u00ac\u0005\u00938?\u00b6\u00bc?@\u00ff\u0087/\u0015\u00c4^\u000b\u000eO}\u00b0\u00d1\u00c8\u001c@\u009e,\u00c0\u00d3\u00efE\u000b\u009ez\u0005(\u00df:a\u000f\u00f9\u00a8\u00a3\u00ed\u0090 \u00ad\u00c3W\u0096\u00d9\u00ceK\u00c69\u00a3\u00ce\u00e4z\u008c\u00a8X\u00a9\u00b2\u00c0f\u00acN\u0090\u00bb\u00f1\u0094\u00a0\u00a2\u00dd!Q\u0002;N\\,\u00eb\u00cb]'\u00a8w\u00d6f\u00ff\u00eeK\u0015\u0086\u00f4\u00eb\u0095\u0012\u00a6\u00d8d.\u009dp\u0093y\u00bc\u0002\u0002\u00a7\u00e6\u008e+\u00d6,\u0005\u0093\u00cf\u00f6\u00caT\u0016aP\u0091 \u00a5\u00b7\u00a0W\u009dJ$\u0000\u00ff\u00a6\u0010\u00a1uD>\u0086\u00f4=\u00fb\u009e\u0099\u0007\u00d8P\u009c\u00d6%\t+\u00b8\u00cc\u00ea\u00f7\u0006\u00e2Q\u00d2\u00b6\u00e1\u00e90b\u0013\u00fae\u00ae\u009b\u00c0\u0090\u009fO\u00df\u00ed\u00e3@\u008e\u00ca\r*l_\u00f4X\u008c\u00f6\u00bc\u00da~,!\u00daGP\u0095\u00d6\u00e9\u000b\f\u00f6m\n\u001a+)E\u000e\u0092\u00e7\u001ce?\u00f1\u0086v\u0010\u00b9\u0010\u00d4#xOQ6\u0015@\u0096~\u0093\u00d3\u00a5\u001b\u0097xR\u00f0\u0098\u00cdy\u008c\u00aa\u00c8\u00a2t\u0089\u00b1\u00fe\u00e2_@u\u00d7\u0088\f\u00baT\u00e6@\u000fs\u0015\u001bV(9Pc:\u0094\u001b\u00b8\u00c9\u0014\u00b8E 7\u00fd\u00a6\u00e2\u00a9\u00ad\u0088\u00a6\u0007\u0013\u00c1\u00bcC\u0011".length();
                                var27_7 = 56;
                                var26_8 = -1;
lbl21:
                                // 2 sources

                                while (true) {
                                    v3 = ++var26_8;
                                    v4 = var28_5.substring(v3, v3 + var27_7);
                                    v5 = -1;
                                    break block21;
                                    break;
                                }
lbl26:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = IlIlPt.a(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "\u00e6\u00eb&\u00b4\u00ae\u001f\u0005\u00b2%\u00bf%\u00d6m\u00f6\u00e9\u0012\u00ee\u00ee\u00ba\u00dd\u0096\u0005\u00c7|6\u00fa_C\u001f\u00fb<S6\u008c\u00f8\u00e0\u00ca\u0085\u00f5u\u00d6\u0093\u000b\u0088a\u00b2\u001e\u00c5{\u00cd\u0016\u000b\u00b28S\u0084\u00a2B\u001e\u00810\u00c8w\u0007X\u00ae}\u0015FD\u0094!b\u00b9\u000b4\u008eVz\u00b8\b\u0086\u00f6\u0007\u0017\u0085\u00cf\u0000\u0085\u00e0\u0015\u00c7\u008e\u009aQz,\u0098V*F$GvX[4\u0004'<>\u0095\u00bd^,\u00e1\b1\u008e\u00dc\u0094t%\u00b7s\u00f1\u0002\u00dds\u00bb\u00ab\u00bc\u0013\u0004X\u0010\u0010d\u00f6M\u00b3\u0084\u00fe\u00e2\u00eaG\u00c2\u00ed\u0085\u0014.Df";
                                    var30_6 = "\u00e6\u00eb&\u00b4\u00ae\u001f\u0005\u00b2%\u00bf%\u00d6m\u00f6\u00e9\u0012\u00ee\u00ee\u00ba\u00dd\u0096\u0005\u00c7|6\u00fa_C\u001f\u00fb<S6\u008c\u00f8\u00e0\u00ca\u0085\u00f5u\u00d6\u0093\u000b\u0088a\u00b2\u001e\u00c5{\u00cd\u0016\u000b\u00b28S\u0084\u00a2B\u001e\u00810\u00c8w\u0007X\u00ae}\u0015FD\u0094!b\u00b9\u000b4\u008eVz\u00b8\b\u0086\u00f6\u0007\u0017\u0085\u00cf\u0000\u0085\u00e0\u0015\u00c7\u008e\u009aQz,\u0098V*F$GvX[4\u0004'<>\u0095\u00bd^,\u00e1\b1\u008e\u00dc\u0094t%\u00b7s\u00f1\u0002\u00dds\u00bb\u00ab\u00bc\u0013\u0004X\u0010\u0010d\u00f6M\u00b3\u0084\u00fe\u00e2\u00eaG\u00c2\u00ed\u0085\u0014.Df".length();
                                    var27_7 = 64;
                                    var26_8 = -1;
lbl35:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var26_8;
                                        v4 = var28_5.substring(v6, v6 + var27_7);
                                        v5 = 0;
                                        break block21;
                                        break;
                                    }
                                    break;
                                }
lbl40:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = IlIlPt.a(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    break block22;
                                    break;
                                }
                            }
                            var32_9 = var24_1.doFinal(v4.getBytes("ISO-8859-1"));
                            switch (v5) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl52:
                                // 1 sources

                                ** continue;
                            }
                        }
                        IlIlPt.b = var31_3;
                        IlIlPt.c = new String[18];
                        IlIlPt.g = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var22 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v9 = v9;
                            v9[var12_11] = (byte)(var22 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[8];
                        var14_13 = 0;
                        var15_14 = "eQ\u00b7\u0013f\u009a\u00b4\u00f3\u00de\u008a0\u00891\u00f8\u0086}\u0000\\`qf?6RS\u0087\u00c3\u00f1\u00a7\u000ee\u0090F\u00d6&\u0083\u00896\u00f4b{\u00ff\u00a3\u00be2\u00f3.$";
                        var16_15 = "eQ\u00b7\u0013f\u009a\u00b4\u00f3\u00de\u008a0\u00891\u00f8\u0086}\u0000\\`qf?6RS\u0087\u00c3\u00f1\u00a7\u000ee\u0090F\u00d6&\u0083\u00896\u00f4b{\u00ff\u00a3\u00be2\u00f3.$".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v10 = var17_12;
                            v11 = var14_13++;
                            v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v13 = -1;
                            break block23;
                            break;
                        }
lbl79:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "o\u00c4\u00be\u00bfn\u008b\u00b01\u0018\u0007\u00b3\u00a0\u00a7!5\u00b3";
                            var16_15 = "o\u00c4\u00be\u00bfn\u008b\u00b01\u0018\u0007\u00b3\u00a0\u00a7!5\u00b3".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v10 = var17_12;
                                v11 = var14_13++;
                                v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v13 = 0;
                                break block23;
                                break;
                            }
                            break;
                        }
lbl92:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            break block24;
                            break;
                        }
                    }
                    var19_18 = v12;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    v14 = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
                    switch (v13) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl105:
                        // 1 sources

                        ** continue;
                    }
                }
                IlIlPt.e = var17_12;
                IlIlPt.f = new Integer[8];
                IlIlPt.j = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v15 = SecretKeyFactory.getInstance("DES");
                v16 = new byte[8];
                v17 = v16;
                v16[0] = (byte)(var22 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v17 = v17;
                    v17[var1_21] = (byte)(var22 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v15.generateSecret(new DESKeySpec(v17)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[2];
                var3_23 = 0;
                var4_24 = "N\u0086/\"!Z\f\u00c7\u00ad\u00e1@\u001dAwC\u0083";
                var5_25 = "N\u0086/\"!Z\f\u00c7\u00ad\u00e1@\u001dAwC\u0083".length();
                var2_26 = 0;
                while (true) {
                    break block25;
                    break;
                }
lbl127:
                // 1 sources

                while (true) {
                    var6_22[v18] = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
                    if (var2_26 < var5_25) ** continue;
                    break block26;
                    break;
                }
            }
            var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
            v18 = var3_23++;
            var8_28 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            ** while (true)
        }
        IlIlPt.h = var6_22;
        IlIlPt.i = new Long[2];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6CB2;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlPt", exception);
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
            IlIlPt.c[n2] = IlIlPt.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlPt.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlPt" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5A83;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlPt", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlPt.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlPt.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlPt" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x622F;
        if (i[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/IlIlPt", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            IlIlPt.i[n2] = l4;
        }
        return i[n2];
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = IlIlPt.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIlPt" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlPt.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(IlIlPt.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(IlIlPt.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

