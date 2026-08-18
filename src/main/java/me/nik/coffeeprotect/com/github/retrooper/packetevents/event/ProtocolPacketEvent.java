/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.event;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_Gj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_jj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.CP_T3;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.CP_hS;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.CP_jE;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.CP_nQ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.CP_Zg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.UnpooledByteBufAllocationHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_hC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_hU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_oL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_rk;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_G2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.UnknownNullability;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public abstract class ProtocolPacketEvent
extends CP_nQ
implements CP_T3,
CP_hS,
CP_jE {
    private final int packetID;
    private final CP_oL packetType;
    private ServerVersion serverVersion;
    private final Object channel;
    private final CP_rk connectionState;
    private final CP_G2 user;
    private @UnknownNullability Object player;
    private Object byteBuf;
    private boolean cancel;
    private @Nullable PacketWrapper<?> lastUsedWrapper;
    private @Nullable List<Runnable> postTasks;
    private boolean cloned;
    private boolean needsReEncode;
    private static int CP_q;
    private static final long c;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    /*
     * Unable to fully structure code
     */
    public ProtocolPacketEvent(CP_hC var1_1, Object var2_2, CP_G2 var3_3, @UnknownNullability Object var4_4, Object var5_5, boolean var6_6) throws CP_jj {
        block27: {
            block28: {
                block29: {
                    block25: {
                        block26: {
                            block24: {
                                block23: {
                                    block22: {
                                        block30: {
                                            var7_7 = ProtocolPacketEvent.c ^ 93617962424215L;
                                            super();
                                            this.postTasks = null;
                                            this.needsReEncode = CP_r7.CP_b().CP_V().CP_s();
                                            this.channel = var2_2;
                                            this.user = var3_3;
                                            var9_8 = CP_nQ.CP_J();
                                            this.player = var4_4;
                                            if (var9_8 == null) break block22;
                                            if (var6_6) ** GOTO lbl22
                                            break block30;
                                            catch (Exception v0) {
                                                throw ProtocolPacketEvent.a(v0);
                                            }
                                        }
                                        try {
                                            block31: {
                                                if (var3_3.CP_h() != null) break block23;
                                                break block31;
                                                catch (Exception v1) {
                                                    throw ProtocolPacketEvent.a(v1);
                                                }
                                            }
                                            this.serverVersion = CP_r7.CP_b().CP_q().CP_F();
                                        }
                                        catch (Exception v2) {
                                            throw ProtocolPacketEvent.a(v2);
                                        }
                                    }
                                    try {
                                        if (var9_8 != null) break block24;
                                        PacketWrapper.CP_e(new int[4]);
                                    }
                                    catch (Exception v3) {
                                        throw ProtocolPacketEvent.a(v3);
                                    }
                                }
                                this.serverVersion = var3_3.CP_r().toServerVersion();
                            }
                            this.byteBuf = var5_5;
                            var10_9 = ByteBufHelper.CP_H(var5_5);
                            if (var9_8 == null) break block25;
                            try {
                                block32: {
                                    if (var10_9 != 0) break block26;
                                    break block32;
                                    catch (Exception v4) {
                                        throw ProtocolPacketEvent.a(v4);
                                    }
                                }
                                throw new CP_jj((String)ProtocolPacketEvent.a("w", (int)26730, (long)(4830620490741303421L ^ var7_7)));
                            }
                            catch (Exception v5) {
                                throw ProtocolPacketEvent.a(v5);
                            }
                        }
                        try {
                            this.packetID = ByteBufHelper.CP_b(var5_5);
                        }
                        catch (Exception var11_10) {
                            throw new CP_jj((String)ProtocolPacketEvent.a("w", (int)7078, (long)(3945493639196392368L ^ var7_7)) + var10_9 + ")");
                        }
                    }
                    var11_11 = this.serverVersion.CP_E();
                    try {
                        v6 = this;
                        v7 = var1_1 == CP_hC.CLIENT ? var3_3.CP_T() : var3_3.CP_b();
                    }
                    catch (Exception v8) {
                        throw ProtocolPacketEvent.a(v8);
                    }
                    v6.connectionState = v7;
                    var12_12 = CP_hU.CP_UnderScore(var1_1, this.connectionState, var11_11, this.packetID);
                    try {
                        try {
                            try {
                                if (var9_8 == null) break block27;
                                if (var12_12 != null) break block28;
                            }
                            catch (Exception v9) {
                                throw ProtocolPacketEvent.a(v9);
                            }
                            if (CP_hU.CP_UnderScore(var1_1, CP_rk.PLAY, var11_11, this.packetID) != CP_AG.DISCONNECT) break block29;
                        }
                        catch (Exception v10) {
                            throw ProtocolPacketEvent.a(v10);
                        }
                        throw new CP_Gj();
                    }
                    catch (Exception v11) {
                        throw ProtocolPacketEvent.a(v11);
                    }
                }
                throw new CP_jj((String)ProtocolPacketEvent.a("w", (int)26522, (long)(5473151697469130632L ^ var7_7)) + this.packetID + (String)ProtocolPacketEvent.a("w", (int)14467, (long)(745285344678647952L ^ var7_7)) + (Object)var1_1.CP_j() + (String)ProtocolPacketEvent.a("w", (int)24855, (long)(2627262954524885251L ^ var7_7)) + (Object)var3_3.CP_T() + (String)ProtocolPacketEvent.a("w", (int)21987, (long)(265135041610905075L ^ var7_7)) + this.serverVersion.CP_z());
            }
            this.packetType = var12_12;
        }
    }

    public ProtocolPacketEvent(int n, CP_oL ilIloL, ServerVersion serverVersion, Object object, CP_G2 ilIlG2, @UnknownNullability Object object2, Object object3) {
        CP_rk ilIlrk;
        block11: {
            CP_G2 ilIlG22;
            block9: {
                block10: {
                    long l = c ^ 0x419B7E8B7EB7L;
                    this.postTasks = null;
                    this.needsReEncode = CP_r7.CP_b().CP_V().CP_s();
                    this.channel = object;
                    int[] nArray = CP_nQ.CP_J();
                    try {
                        try {
                            try {
                                ProtocolPacketEvent protocolPacketEvent = this;
                                ilIlG22 = ilIlG2;
                                if (nArray == null) break block9;
                                protocolPacketEvent.user = ilIlG22;
                                this.player = object2;
                                this.serverVersion = serverVersion;
                                this.byteBuf = object3;
                                this.packetID = n;
                                this.packetType = ilIloL;
                                protocolPacketEvent = this;
                                if (ilIloL == null) break block10;
                            }
                            catch (CP_jj ilIljj) {
                                throw ProtocolPacketEvent.a(ilIljj);
                            }
                            if (ilIloL.CP_Y() != CP_hC.SERVER) break block10;
                        }
                        catch (CP_jj ilIljj) {
                            throw ProtocolPacketEvent.a(ilIljj);
                        }
                        ilIlrk = ilIlG2.CP_b();
                        break block11;
                    }
                    catch (CP_jj ilIljj) {
                        throw ProtocolPacketEvent.a(ilIljj);
                    }
                }
                ilIlG22 = ilIlG2;
            }
            ilIlrk = ilIlG22.CP_T();
        }
        try {
            protocolPacketEvent.connectionState = ilIlrk;
            this.cloned = true;
            if (PacketWrapper.CP_z() == null) {
                CP_nQ.CP_n(new int[5]);
            }
        }
        catch (CP_jj ilIljj) {
            throw ProtocolPacketEvent.a(ilIljj);
        }
    }

    public void markForReEncode(boolean bl) {
        this.needsReEncode = bl;
    }

    public boolean needsReEncode() {
        return this.needsReEncode;
    }

    public boolean isClone() {
        return this.cloned;
    }

    public Object getChannel() {
        return this.channel;
    }

    public SocketAddress getAddress() {
        return CP_Zg.CP_r(this.channel);
    }

    public InetSocketAddress getSocketAddress() {
        return (InetSocketAddress)this.getAddress();
    }

    @Override
    public CP_G2 getUser() {
        return this.user;
    }

    @Override
    public <T> @UnknownNullability T getPlayer() {
        return (T)this.player;
    }

    @Deprecated
    @ApiStatus.Internal
    public void setPlayer(Object object) {
        this.player = object;
    }

    public CP_rk getConnectionState() {
        return this.connectionState;
    }

    @Deprecated
    public ClientVersion getClientVersion() {
        return this.user.CP_h();
    }

    @Deprecated
    public void setClientVersion(ClientVersion clientVersion) {
        long l = c ^ 0x17B1597D025CL;
        CP_r7.CP_b().CP_m().CP_M((String)((Object)ProtocolPacketEvent.a("w", (int)22538, (long)(0x6847826FD6F5EDD0L ^ l))) + clientVersion.CP_r());
        this.user.CP_UnderScore(clientVersion);
    }

    public ServerVersion getServerVersion() {
        return this.serverVersion;
    }

    @Deprecated
    public void setServerVersion(ServerVersion serverVersion) {
        this.serverVersion = serverVersion;
    }

    public Object getByteBuf() {
        return this.byteBuf;
    }

    public void setByteBuf(Object object) {
        this.byteBuf = object;
    }

    public int getPacketId() {
        return this.packetID;
    }

    public CP_oL getPacketType() {
        return this.packetType;
    }

    @Deprecated
    public String getPacketName() {
        return ((Enum)((Object)this.packetType)).name();
    }

    @Override
    public boolean isCancelled() {
        return this.cancel;
    }

    @Override
    public void setCancelled(boolean bl) {
        this.cancel = bl;
    }

    public @Nullable PacketWrapper<?> getLastUsedWrapper() {
        return this.lastUsedWrapper;
    }

    public void setLastUsedWrapper(@Nullable PacketWrapper<?> packetWrapper) {
        this.lastUsedWrapper = packetWrapper;
    }

    public List<Runnable> getPostTasks() {
        List<Runnable> list;
        block4: {
            block5: {
                long l = c ^ 0x7F8A8B437811L;
                int[] nArray = CP_nQ.CP_J();
                try {
                    try {
                        list = this.postTasks;
                        if (nArray == null) break block4;
                        if (list != null) break block5;
                    }
                    catch (CP_jj ilIljj) {
                        throw ProtocolPacketEvent.a(ilIljj);
                    }
                    this.postTasks = new ArrayList<Runnable>();
                }
                catch (CP_jj ilIljj) {
                    throw ProtocolPacketEvent.a(ilIljj);
                }
            }
            list = this.postTasks;
        }
        return list;
    }

    public boolean hasPostTasks() {
        boolean bl;
        block8: {
            block7: {
                List<Runnable> list;
                int[] nArray;
                block6: {
                    long l = c ^ 0x57C2123D5185L;
                    nArray = CP_nQ.CP_J();
                    try {
                        try {
                            list = this.postTasks;
                            if (nArray == null) break block6;
                            if (list == null) break block7;
                        }
                        catch (CP_jj ilIljj) {
                            throw ProtocolPacketEvent.a(ilIljj);
                        }
                        list = this.postTasks;
                    }
                    catch (CP_jj ilIljj) {
                        throw ProtocolPacketEvent.a(ilIljj);
                    }
                }
                try {
                    bl = list.isEmpty();
                    if (nArray == null) break block8;
                    if (bl) break block7;
                }
                catch (CP_jj ilIljj) {
                    throw ProtocolPacketEvent.a(ilIljj);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    public ProtocolPacketEvent clone() {
        ProtocolPacketEvent protocolPacketEvent;
        block6: {
            ProtocolPacketEvent protocolPacketEvent2;
            block4: {
                block5: {
                    long l = c ^ 0x737E72C5F3AFL;
                    int[] nArray = CP_nQ.CP_J();
                    try {
                        try {
                            protocolPacketEvent2 = this;
                            if (nArray == null) break block4;
                            if (!(protocolPacketEvent2 instanceof PacketReceiveEvent)) break block5;
                        }
                        catch (CP_jj ilIljj) {
                            throw ProtocolPacketEvent.a(ilIljj);
                        }
                        protocolPacketEvent = ((PacketReceiveEvent)this).clone();
                        break block6;
                    }
                    catch (CP_jj ilIljj) {
                        throw ProtocolPacketEvent.a(ilIljj);
                    }
                }
                protocolPacketEvent2 = this;
            }
            protocolPacketEvent = ((PacketSendEvent)protocolPacketEvent2).clone();
        }
        return protocolPacketEvent;
    }

    public void cleanUp() {
        block4: {
            long l = c ^ 0x1C4BEE9B282L;
            int[] nArray = CP_nQ.CP_J();
            try {
                boolean bl;
                try {
                    bl = this.isClone();
                    if (nArray == null || !bl) break block4;
                }
                catch (CP_jj ilIljj) {
                    throw ProtocolPacketEvent.a(ilIljj);
                }
                bl = ByteBufHelper.release(this.byteBuf);
            }
            catch (CP_jj ilIljj) {
                throw ProtocolPacketEvent.a(ilIljj);
            }
        }
    }

    public Object getFullBufferClone() {
        byte[] byArray = ByteBufHelper.CP_N(this.getByteBuf());
        Object object = UnpooledByteBufAllocationHelper.buffer();
        ByteBufHelper.CP_N(object, this.getPacketId());
        ByteBufHelper.writeBytes(object, byArray);
        return object;
    }

    public static void CP_w(int n) {
        CP_q = n;
    }

    public static int CP_j() {
        return CP_q;
    }

    public static int CP_B() {
        int n = ProtocolPacketEvent.CP_j();
        try {
            if (n == 0) {
                return 66;
            }
        }
        catch (CP_jj ilIljj) {
            throw ProtocolPacketEvent.a(ilIljj);
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                ProtocolPacketEvent.c = CP_s.a(1668809225046633515L, -8691100683395275227L, MethodHandles.lookup().lookupClass()).a(156947976994966L);
                ProtocolPacketEvent.f = new HashMap<K, V>(13);
                ProtocolPacketEvent.CP_w(0);
                var0 = ProtocolPacketEvent.c ^ 73056567223296L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[7];
                var7_4 = 0;
                var6_5 = "t_\u00edu\u00dc\u00f2\u00d2\u00c8\u00a1\u00e4T\u008e\u0017!\u00f2KZ\u00ca]);\u008f\u009e\u001b\u00ac\u00f81d4\u00d6\u00b7\u0012\u008a\u008d\u0090\u00aa7\u00b1\u00c5\u009bqQ\u00dc\u00bd\u00b4S\u0013w@\u00ef\u00e7\u00be\u0001W\u0096\u000eQ\u00fd\u0019\u00bc\u00d5#]\u00b3u>\u00ea\u0098\u00a9\u00d8\u00b4\u00adv\u00ba\u00f9\u0013t\u00c0;\u00d4;\u00f3zJ\u000bP#\ri\u00e2\u00c8\u00bao\u00af\u0093\u00ccn\u00b7.\u0084\u00a6\u00fdD \u00d4\u000e\u00f9\u001f\u001c\u009b\u001d\u0093\u00cd(\u00f6\u00af\u00eb\u00af\u00d9tz\u000e\u00c3m}\u00fd3P\u00869\u009b\u0011\u000f\u00835U\u008d|O`\u00a4\\\u0019\u00af\u00c3\u00855\u00c9\u00ed\u00d0%\u00cau]H\u0001\u0095a/+i\u008b\u00ef\u00ef\u00cb[\u0013\u00b9l\u0019\u00f2?1+\u00c2\u00ad\u00ef\u0019\u00f4\u00ae\u0089?1\u00f1Po\u0002\u00ad%\u00ec\u00e9e\u00e8B\u00b8G\u008aD:\u009a\u00ec\u00c6\u00b8\u0014\u0018\u0013\u00d6\u001d\u00c8-\u00e5\u00d9\u00af\u00b3\u00fc#Y\u0011\u000bq\u00d1\u0092\u00af\u00d1\u00d6{\u00f9X7\u0017\u0003\u00b0o8\u008a\u008d|\u00ca@\u00ad\u00d2\u008e\u00fde\u00c8\r\u0082\u00cf\taV:5\u0017\u00fd\u00f6\u009eb\u00cf\u00e6\u00ad\u0084\u00b7\u00e5\u00de\u0098\u0003q\u0091\u00e7gD\n\u00bb\u009e\u00c1\u0002&?q\u00ac\u00b6\u00c1\u001fu\u00a9\u00ec\u00beY\u00eb\u00bc\u001a\u00ba \u00a9\u00c6\u001e\u00c4\u009awZ\u00b8&\u001e\u00cc^\u00d6\u000f\u0099\u00ad\u0010\u00f6[}\u0014\u00f6";
                var8_6 = "t_\u00edu\u00dc\u00f2\u00d2\u00c8\u00a1\u00e4T\u008e\u0017!\u00f2KZ\u00ca]);\u008f\u009e\u001b\u00ac\u00f81d4\u00d6\u00b7\u0012\u008a\u008d\u0090\u00aa7\u00b1\u00c5\u009bqQ\u00dc\u00bd\u00b4S\u0013w@\u00ef\u00e7\u00be\u0001W\u0096\u000eQ\u00fd\u0019\u00bc\u00d5#]\u00b3u>\u00ea\u0098\u00a9\u00d8\u00b4\u00adv\u00ba\u00f9\u0013t\u00c0;\u00d4;\u00f3zJ\u000bP#\ri\u00e2\u00c8\u00bao\u00af\u0093\u00ccn\u00b7.\u0084\u00a6\u00fdD \u00d4\u000e\u00f9\u001f\u001c\u009b\u001d\u0093\u00cd(\u00f6\u00af\u00eb\u00af\u00d9tz\u000e\u00c3m}\u00fd3P\u00869\u009b\u0011\u000f\u00835U\u008d|O`\u00a4\\\u0019\u00af\u00c3\u00855\u00c9\u00ed\u00d0%\u00cau]H\u0001\u0095a/+i\u008b\u00ef\u00ef\u00cb[\u0013\u00b9l\u0019\u00f2?1+\u00c2\u00ad\u00ef\u0019\u00f4\u00ae\u0089?1\u00f1Po\u0002\u00ad%\u00ec\u00e9e\u00e8B\u00b8G\u008aD:\u009a\u00ec\u00c6\u00b8\u0014\u0018\u0013\u00d6\u001d\u00c8-\u00e5\u00d9\u00af\u00b3\u00fc#Y\u0011\u000bq\u00d1\u0092\u00af\u00d1\u00d6{\u00f9X7\u0017\u0003\u00b0o8\u008a\u008d|\u00ca@\u00ad\u00d2\u008e\u00fde\u00c8\r\u0082\u00cf\taV:5\u0017\u00fd\u00f6\u009eb\u00cf\u00e6\u00ad\u0084\u00b7\u00e5\u00de\u0098\u0003q\u0091\u00e7gD\n\u00bb\u009e\u00c1\u0002&?q\u00ac\u00b6\u00c1\u001fu\u00a9\u00ec\u00beY\u00eb\u00bc\u001a\u00ba \u00a9\u00c6\u001e\u00c4\u009awZ\u00b8&\u001e\u00cc^\u00d6\u000f\u0099\u00ad\u0010\u00f6[}\u0014\u00f6".length();
                var5_7 = 48;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = ProtocolPacketEvent.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "H\u0081\u00fbqy\u00e4\u0098\u00fe\u0099)\u00ad<1'\u00e5\u00dad\u00d7\u00ec\u00f0x$\u00d5\u0080\u0084\u00d4\u00c2\u00fdw\u009a\u00cf%\u0089\u001b\u00f4,\u0000%Q\u00b8\u0091\u009e\u00fb\u00cf\u0086Y9\u001d\u00a2D\u00f9?\u00a2\u00c2T.\u00a8\u000et$\u0012\u00b9\r2\u00ef%\u00a0\u008a\u00ad\u0093\u00d8\u008fv<\u00b4n\u008fMTJ\u0014(P\u00ae\u00a5\u00c7\u00d7\u00c1\u00fb\u00c3m\u001b\u009d\u00c0D\u00f8i\u00b8\u0004i\u00cbPYC(\u00a6et\u00ca%\u00c1 ^\u009fP}\u0015\u00c9\u0003\u00b38\u00e6\u00f2\u00ff\u00ba(,<9\u00c28\u00be\u00bb9\t\u00de\u00e7\u00c7\u00ec\u00fe\u0015\u009b4\u00e9\u00f0";
                    var8_6 = "H\u0081\u00fbqy\u00e4\u0098\u00fe\u0099)\u00ad<1'\u00e5\u00dad\u00d7\u00ec\u00f0x$\u00d5\u0080\u0084\u00d4\u00c2\u00fdw\u009a\u00cf%\u0089\u001b\u00f4,\u0000%Q\u00b8\u0091\u009e\u00fb\u00cf\u0086Y9\u001d\u00a2D\u00f9?\u00a2\u00c2T.\u00a8\u000et$\u0012\u00b9\r2\u00ef%\u00a0\u008a\u00ad\u0093\u00d8\u008fv<\u00b4n\u008fMTJ\u0014(P\u00ae\u00a5\u00c7\u00d7\u00c1\u00fb\u00c3m\u001b\u009d\u00c0D\u00f8i\u00b8\u0004i\u00cbPYC(\u00a6et\u00ca%\u00c1 ^\u009fP}\u0015\u00c9\u0003\u00b38\u00e6\u00f2\u00ff\u00ba(,<9\u00c28\u00be\u00bb9\t\u00de\u00e7\u00c7\u00ec\u00fe\u0015\u009b4\u00e9\u00f0".length();
                    var5_7 = 104;
                    var4_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = ProtocolPacketEvent.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        ProtocolPacketEvent.d = var9_3;
        ProtocolPacketEvent.e = new String[7];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3D02;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/event/ProtocolPacketEvent", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            ProtocolPacketEvent.e[n2] = ProtocolPacketEvent.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ProtocolPacketEvent.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/event/ProtocolPacketEvent" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ProtocolPacketEvent.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

