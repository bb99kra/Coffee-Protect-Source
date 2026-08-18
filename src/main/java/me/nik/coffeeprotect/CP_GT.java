/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_Cb;
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_GT {
    private static final String[] CP_B;
    private final CoffeeProtect CP_u;
    private CP_Cb CP_I;
    private static boolean CP_H;
    private static PacketWrapper[] CP_b;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String odTyFrTZGc = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_GT(CoffeeProtect coffeeProtect) {
        this.CP_u = coffeeProtect;
    }

    /*
     * Unable to fully structure code
     */
    public void CP_m() {
        var1_1 = CP_GT.a ^ 100106264974257L;
        var4_2 = new File(this.CP_u.getDataFolder(), (String)CP_GT.a("n", (int)31153, (long)(7628178799134938222L ^ var1_1)));
        CP_GT.CP_H = var4_2.exists();
        var3_3 = CP_GT.CP_h();
        v0 = CP_GT.CP_H;
        if (var3_3 != null) {
            v0 = v0 == false;
        }
        var6_5 = var5_4 = v0;
        this.CP_I = CP_Cb.CP_m(this.CP_u, var4_2);
        v1 = var5_4;
        if (var3_3 != null) {
            if (v1) {
                this.CP_I.CP_H(CP_GT.CP_B);
            }
            v1 = this.CP_u.CP_O().CP_n();
        }
        if (var3_3 == null) ** GOTO lbl31
        if (!v1) ** GOTO lbl-1000
        v1 = this.CP_u.CP_m().CP_b();
        if (var3_3 != null) {
            ** if (v1) goto lbl-1000
lbl-1000:
            // 1 sources

            {
                var7_6 = CP_Oq.values();
                var8_7 = var7_6.length;
                for (var9_8 = 0; var9_8 < var8_7; ++var9_8) {
                    var10_9 = var7_6[var9_8];
                    var10_9.CP_o();
                    var6_5 |= CP_Oq.CP_A((CP_Oq)var10_9, (CP_Cb)this.CP_I);
                    if (var3_3 != null) {
                        if (var3_3 != null) continue;
                    } else {
                        ** GOTO lbl28
                    }
lbl28:
                    // 2 sources

                    ** GOTO lbl35
                }
            }
        }
        ** GOTO lbl31
lbl-1000:
        // 4 sources

        {
            v1 = var6_5;
lbl31:
            // 3 sources

            if (v1) {
                this.CP_I.CP_R();
            }
            var7_6 = CP_Oq.values();
            var8_7 = var7_6.length;
        }
lbl35:
        // 3 sources

        for (var9_8 = 0; var9_8 < var8_7; ++var9_8) {
            var10_9 = var7_6[var9_8];
            var10_9.CP_c();
            if (var3_3 != null) continue;
        }
        if (PacketWrapper.CP_z() == null) {
            CP_GT.CP_q(new PacketWrapper[5]);
        }
    }

    public void CP_d() {
        long l = a ^ 0x5A0C86F1E115L;
        CP_Oq[] ilIlOqArray = CP_Oq.values();
        int n = ilIlOqArray.length;
        PacketWrapper[] packetWrapperArray = CP_GT.CP_h();
        for (int i = 0; i < n; ++i) {
            CP_Oq ilIlOq = ilIlOqArray[i];
            ilIlOq.CP_o();
            if (packetWrapperArray != null) continue;
        }
    }

    public CP_Cb CP_S() {
        return this.CP_I;
    }

    static /* synthetic */ boolean CP_C() {
        return CP_H;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_GT.a = CP_s.a(-6834623080181349888L, 7679400200754157312L, MethodHandles.lookup().lookupClass()).a(211620608456031L);
                        var20 = CP_GT.a ^ 109808953032523L;
                        CP_GT.d = new HashMap<K, V>(13);
                        CP_GT.CP_q(new PacketWrapper[3]);
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
                        var18_3 = new String[8];
                        var16_4 = 0;
                        var15_5 = "\u00d6\u0099\u00dc\u00a8\u00a7b\u00ef\u000b\u0099e\u009f\u00fc\r+\u00ef\u00b8r\u00a7[\u0087+\u00c7\u001d\u0010\u0017\u00ce+\u0013\"\u00cf\u007f\u00c6\u00b4\u00c3\u00ed\u00f1E\u0096\u0088d\u00a0\u00f0\u00dd\u00b22p\u00a8\u00a0J \u00ac\u00ec(i\u00ac\u00d3l\u00c0Q\u00ca`e\u000b\u00b94x\u00cewwV\u00c8C\u00f5\u0097/E\u00c6\u00e0Y\u0088\u0098\u00b8r\u00c2i\u00d8\u000b\u0019n<\u00c6\u00f4\u00c9d\u0082J\u00eda\u00cf\u00cd\u00da`\u0001](\u0003\u00d8|,3#\u009a\u00c7Y\u001c\u00cf.\u00f3\u00f5\u00d3\u00ae\u0006\u00bb\u009a$\u00b9\u00c9\u0084j\u00cac\u0096\u00ed.\u0094\u0084\u00d9\u00b9f\u00de\u001f\b\u001dzu\u00c1\u0006$\u00a4L\u0012\u00f9\f\u000b\u0006\u00cb\u00d1\u0097\f\u00c4\u00a0Px\u0017\u00bdso^\u0001$m\u00b5p\u0010\u00d5\u00e1\u0000\u00c1\u0013@\u00a9\u0015Z\u0017\u00c7\u0096\u008b\u008d*\u00f9\u00f2\u001b\u00ca\u0012\u00fb\u0005\u0004i\u009b\u00e0[Y\u0013\u00f2\u00e64@iF\u00cb\u0083\u0015\u00f3\u00f3JCp\u00af\u00c2\u0084\u008e\u00fd\u008f\u00d5\u00a83a%\u0017E\u008f\u0019\u00d9\\M\\\u0086(\u00fe\u001a\u008bF\u00e8\u001b\u00c85\u00b4\u00b9&\u0092\u0091\u00f7\u00f6\u0007\u00fb+\u00e2\u00b6\u00a9;[\u008c\u0080\u001b\u00b1\u0080c\u00ba\u0004\u00da\u00ea\u00d8\u001f\u00d8\u00e6\u0094JYx\u009a\u00fat\u00b8\u00ebdJ\u00c9\t\u00f0\u00cc\u00f5\u0018\u00d2\u009b!\u0087\t\u008eC\u0006\u00b7\u00e7&\u00e9\u00c3\u00f4\b\u00d4\u001f\u00ca\u00d7\u00c8\u001b5\u000e\u00a0\u00d5\u0006\u00dff\u00cf\u00a8\u00eb\b\u001fo\u00a9\u00c4[\u0000m\u00e6@\u00f12\u00ed\u00e3C\u00ce\u0001\u0007gog\u00fd\u0081\u00f2\u0093+\u00918\u0090\u00c6\u00bc\u00a7ZQ\u0082\u009d\u0099\u00ea@I\u0019\u0096V(\u00ec\u00cd0^!\"\u0014\u0083\u0005\u00cb\u009c\u00d3}TJ\u00c8\u00fc{s6\u00e6\u00d4\u000f\u00a4$\u00e7a\u00d0\u0088\u0001\u00a9L\u00c9\u00aeH\u00e1\u00a5\u0003U\u00f2\u00f3Uu\n\u0091\u0084\u00bc\u0003\u00ef=\u009d=\u000fx\u00d2\u001bc*;\u000b\u00ddJ\u00fdl~1\u0000@:\u00b2\u009b\u0003\u0091\u00fb\u0019\u0089q{\u00ae\u0084\u009f\u00c8[U\u009c\u00a3\u00e6\fy]9\u00bc\u0094:YQ\u00d7~\r=\u0019\u00f6\u0012N\u00b7\u0088\u00e3y$Lo4\u00f4\u00d3\\\u0006\u0015\u008c\u0016M\u009d\u00da\u00bf\u00a0\u0090\u0085\u00de\u0083\u00a1 \u00eaY\u00b2\u00da\u000e\u00a3\u00b6hv\u00f1F4\u00b2\u009a\u0097\u00ec|4CQ\u00dd\u009b\u009d\u0002\u00aa#\u00ce\u0088_\u00ffz]A\u001cU\u00b5\u00b9\u00f69\u0082\u0092\u0000\u00ce\u00c7\u00c1\u00ca\u000e\u00d6`\u00b7\u008d_.\u00c9r\u0086\u00ad\u00bfm3\u009dU\u00ad#\u00fd\u00be\u008e[\u00a1\u00b4\u00a4=\u00b5\u00da0^z!X\u0096@m\u00b9\u00e4\u00f1\u000e\u00e4\u00bc\u00c8\u009d\u0015\u00e4i\u0086\u0003{7\u00ed\u0014\u0014Tg\u008a|D,6\u00ba\u00a0\u00cab\u00dfS\u0001\u00a5|\u00dc\u009a\u00e9\u00daqx8\u0016\u00ea\u00ca\u0091\u00f1~z~\u0002\u0089\u00f1\u00d0\u00afQ\u00a2m\u00c4r\u00c0\u00ea+e.\b\u00ea\u00a0\u0019\u00b8\u00c6/k \u00e2@I\u001cCs;\u0092gK\u00e2$\u00cd\u00cc\u00e2\u00f1};\u0090\u00e8\u00ea\u008a#_g\u00ac\u00a6<\u0089\u0084Za\u00a8\u008c\u00bct\u00ac\u00f8GZ\u00d2PHf\u0095\u00f8\u00ed\u001a\u008fs\u00d4l\u00f2\u00d6cy[\u00f1\u00eb[\u00e7\u0084\u00a6;\u00d8R\u00afE\u0010\u00ees\u0097\u008b@\u00b6\u00b9\u00cd\u00fc\u00e8C\u000e\u00f2q-\u00fb\u007f8\u00e4\u0084\u001co\u0081\u0005~\u00cf\u00bb\u00fe\u00fa\u001a\u00d6\u00b8r\u0095\u00e7\u0088\u00e9\u00b2\u00a5\u008dk\u0080\u008e\u008d\u00e7\u000214\u00beb\u00bf\u009b\u00fb\u00b5\u007f\u0087!\u0000[\u00d1\u00bc\b\u0006x2\u0091H\u0016\u001d\u00c1STv\u00faX:5%\u00bb7\u00e5\u00891\u00f0\u00db\u00efR\u00d0\u0011D'1\u00e5\u00f3\u0019\u00d8\r\u00ee3b.\u007f\u00b8\u00ce\u00b1:t\u009a\u00b1;\u00f4\u008bz\u00da\u00cd\u009e\u0015z\u00bc\u00af\u0016\u0080\u0083\u00ed\u00d9a\u00cd\u00c1Y\u00a5q\u00cb";
                        var17_6 = "\u00d6\u0099\u00dc\u00a8\u00a7b\u00ef\u000b\u0099e\u009f\u00fc\r+\u00ef\u00b8r\u00a7[\u0087+\u00c7\u001d\u0010\u0017\u00ce+\u0013\"\u00cf\u007f\u00c6\u00b4\u00c3\u00ed\u00f1E\u0096\u0088d\u00a0\u00f0\u00dd\u00b22p\u00a8\u00a0J \u00ac\u00ec(i\u00ac\u00d3l\u00c0Q\u00ca`e\u000b\u00b94x\u00cewwV\u00c8C\u00f5\u0097/E\u00c6\u00e0Y\u0088\u0098\u00b8r\u00c2i\u00d8\u000b\u0019n<\u00c6\u00f4\u00c9d\u0082J\u00eda\u00cf\u00cd\u00da`\u0001](\u0003\u00d8|,3#\u009a\u00c7Y\u001c\u00cf.\u00f3\u00f5\u00d3\u00ae\u0006\u00bb\u009a$\u00b9\u00c9\u0084j\u00cac\u0096\u00ed.\u0094\u0084\u00d9\u00b9f\u00de\u001f\b\u001dzu\u00c1\u0006$\u00a4L\u0012\u00f9\f\u000b\u0006\u00cb\u00d1\u0097\f\u00c4\u00a0Px\u0017\u00bdso^\u0001$m\u00b5p\u0010\u00d5\u00e1\u0000\u00c1\u0013@\u00a9\u0015Z\u0017\u00c7\u0096\u008b\u008d*\u00f9\u00f2\u001b\u00ca\u0012\u00fb\u0005\u0004i\u009b\u00e0[Y\u0013\u00f2\u00e64@iF\u00cb\u0083\u0015\u00f3\u00f3JCp\u00af\u00c2\u0084\u008e\u00fd\u008f\u00d5\u00a83a%\u0017E\u008f\u0019\u00d9\\M\\\u0086(\u00fe\u001a\u008bF\u00e8\u001b\u00c85\u00b4\u00b9&\u0092\u0091\u00f7\u00f6\u0007\u00fb+\u00e2\u00b6\u00a9;[\u008c\u0080\u001b\u00b1\u0080c\u00ba\u0004\u00da\u00ea\u00d8\u001f\u00d8\u00e6\u0094JYx\u009a\u00fat\u00b8\u00ebdJ\u00c9\t\u00f0\u00cc\u00f5\u0018\u00d2\u009b!\u0087\t\u008eC\u0006\u00b7\u00e7&\u00e9\u00c3\u00f4\b\u00d4\u001f\u00ca\u00d7\u00c8\u001b5\u000e\u00a0\u00d5\u0006\u00dff\u00cf\u00a8\u00eb\b\u001fo\u00a9\u00c4[\u0000m\u00e6@\u00f12\u00ed\u00e3C\u00ce\u0001\u0007gog\u00fd\u0081\u00f2\u0093+\u00918\u0090\u00c6\u00bc\u00a7ZQ\u0082\u009d\u0099\u00ea@I\u0019\u0096V(\u00ec\u00cd0^!\"\u0014\u0083\u0005\u00cb\u009c\u00d3}TJ\u00c8\u00fc{s6\u00e6\u00d4\u000f\u00a4$\u00e7a\u00d0\u0088\u0001\u00a9L\u00c9\u00aeH\u00e1\u00a5\u0003U\u00f2\u00f3Uu\n\u0091\u0084\u00bc\u0003\u00ef=\u009d=\u000fx\u00d2\u001bc*;\u000b\u00ddJ\u00fdl~1\u0000@:\u00b2\u009b\u0003\u0091\u00fb\u0019\u0089q{\u00ae\u0084\u009f\u00c8[U\u009c\u00a3\u00e6\fy]9\u00bc\u0094:YQ\u00d7~\r=\u0019\u00f6\u0012N\u00b7\u0088\u00e3y$Lo4\u00f4\u00d3\\\u0006\u0015\u008c\u0016M\u009d\u00da\u00bf\u00a0\u0090\u0085\u00de\u0083\u00a1 \u00eaY\u00b2\u00da\u000e\u00a3\u00b6hv\u00f1F4\u00b2\u009a\u0097\u00ec|4CQ\u00dd\u009b\u009d\u0002\u00aa#\u00ce\u0088_\u00ffz]A\u001cU\u00b5\u00b9\u00f69\u0082\u0092\u0000\u00ce\u00c7\u00c1\u00ca\u000e\u00d6`\u00b7\u008d_.\u00c9r\u0086\u00ad\u00bfm3\u009dU\u00ad#\u00fd\u00be\u008e[\u00a1\u00b4\u00a4=\u00b5\u00da0^z!X\u0096@m\u00b9\u00e4\u00f1\u000e\u00e4\u00bc\u00c8\u009d\u0015\u00e4i\u0086\u0003{7\u00ed\u0014\u0014Tg\u008a|D,6\u00ba\u00a0\u00cab\u00dfS\u0001\u00a5|\u00dc\u009a\u00e9\u00daqx8\u0016\u00ea\u00ca\u0091\u00f1~z~\u0002\u0089\u00f1\u00d0\u00afQ\u00a2m\u00c4r\u00c0\u00ea+e.\b\u00ea\u00a0\u0019\u00b8\u00c6/k \u00e2@I\u001cCs;\u0092gK\u00e2$\u00cd\u00cc\u00e2\u00f1};\u0090\u00e8\u00ea\u008a#_g\u00ac\u00a6<\u0089\u0084Za\u00a8\u008c\u00bct\u00ac\u00f8GZ\u00d2PHf\u0095\u00f8\u00ed\u001a\u008fs\u00d4l\u00f2\u00d6cy[\u00f1\u00eb[\u00e7\u0084\u00a6;\u00d8R\u00afE\u0010\u00ees\u0097\u008b@\u00b6\u00b9\u00cd\u00fc\u00e8C\u000e\u00f2q-\u00fb\u007f8\u00e4\u0084\u001co\u0081\u0005~\u00cf\u00bb\u00fe\u00fa\u001a\u00d6\u00b8r\u0095\u00e7\u0088\u00e9\u00b2\u00a5\u008dk\u0080\u008e\u008d\u00e7\u000214\u00beb\u00bf\u009b\u00fb\u00b5\u007f\u0087!\u0000[\u00d1\u00bc\b\u0006x2\u0091H\u0016\u001d\u00c1STv\u00faX:5%\u00bb7\u00e5\u00891\u00f0\u00db\u00efR\u00d0\u0011D'1\u00e5\u00f3\u0019\u00d8\r\u00ee3b.\u007f\u00b8\u00ce\u00b1:t\u009a\u00b1;\u00f4\u008bz\u00da\u00cd\u009e\u0015z\u00bc\u00af\u0016\u0080\u0083\u00ed\u00d9a\u00cd\u00c1Y\u00a5q\u00cb".length();
                        var14_7 = 160;
                        var13_8 = -1;
lbl21:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = CP_GT.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u00aes+\u00cc\u00c4\u0086S\u00ad\u00b6\u00ab\u009f\u0089\u00af\u00d2K[\u0095$)\u000f\u007fb\u009d^d>+\u00df\u00a0\u00b2}\u00b6\u00c9\u00f9\u00a8\u0097\u0099\u000bJ\u00bb\u00d8\u00a2\u00db\u008b)\u00d7c[%\u0097*\u00d6\u009e\u00f5\u00dc\u00fb\u00a2 \u00cc\u0097%n\u0094\u0014B\u00d9{R\u007fe3\u008aF\u0002\u00b6\u00ac\u0083\u00db\u00f9\u0098\u00e1\u00e6\u0082v\u00e1Xx\u00b8|\u0096A\u00e9I\u0086\u0017\u0087\u0001\u001b\u00ae\\\u008f\u00bd{\u00b8\u00a7\u0015\u00ab\u00c5\u00b5\u00c0\u0004`\u00fd\u000e4\u00e1\u008e\u0006\u00978\u00ad\u00c7^i\u00fe\u008em\u00de-y\u00e4\u00b5(*-\u00eb`\u00aa\u001d&\\\u0010\u008e\u00b7H\u0000\u00b5\u00f7\u009e\u00b3uj,\u00ccq\u00c18\u00a5\u00dd{\u0098\u00bb&\u0088\u00d8k\u00c6\u00d6\u009b\u0089 Iy\u00a7\u0087\u00e8\u00d6&\u00f0\u0011\u00a6\u0006n7\u00cd\u0017\u00f6Wf\u00cd\u00b9C0\u009a\\\u00868\u00ec\u009b\u00f9\u00d5u\u0016\u00e9\u00cd\u00a5:\u00ff4\u00ab\"\u0018\u0085\b\n]\u00e9\u00e3\u00df2C\u00bb\u00e6\u00b5\u00cd\u00d2\u00e46\u00fdx\u00da\u00a78\b\u00fd\b/\u00b3_\u00fb\u0082\u00fe\u00fca\u009c\u00a9l\u0089g\u00c7.\u00ad\u0006q\u00d9\u00f8\u009f^_\u00ec\u00bf\u0013\u0000\u001d\u0087\u00c0\u0092\u0090\u00d7\u00f3\u00ee\u00dd\u00a9-\u0088\u0099K\u00ea\u0082K\u000f\u00e7,\u0083\u0081\u00a4\u00f7@\u0092\u00b5\u0085\u009c\u00e8\u009fzzk\u00ba\"\u00f7\u00b5\u00ac\u009bz\u00cdO\u00f7-{\u0093T1\u00e9";
                            var17_6 = "\u00aes+\u00cc\u00c4\u0086S\u00ad\u00b6\u00ab\u009f\u0089\u00af\u00d2K[\u0095$)\u000f\u007fb\u009d^d>+\u00df\u00a0\u00b2}\u00b6\u00c9\u00f9\u00a8\u0097\u0099\u000bJ\u00bb\u00d8\u00a2\u00db\u008b)\u00d7c[%\u0097*\u00d6\u009e\u00f5\u00dc\u00fb\u00a2 \u00cc\u0097%n\u0094\u0014B\u00d9{R\u007fe3\u008aF\u0002\u00b6\u00ac\u0083\u00db\u00f9\u0098\u00e1\u00e6\u0082v\u00e1Xx\u00b8|\u0096A\u00e9I\u0086\u0017\u0087\u0001\u001b\u00ae\\\u008f\u00bd{\u00b8\u00a7\u0015\u00ab\u00c5\u00b5\u00c0\u0004`\u00fd\u000e4\u00e1\u008e\u0006\u00978\u00ad\u00c7^i\u00fe\u008em\u00de-y\u00e4\u00b5(*-\u00eb`\u00aa\u001d&\\\u0010\u008e\u00b7H\u0000\u00b5\u00f7\u009e\u00b3uj,\u00ccq\u00c18\u00a5\u00dd{\u0098\u00bb&\u0088\u00d8k\u00c6\u00d6\u009b\u0089 Iy\u00a7\u0087\u00e8\u00d6&\u00f0\u0011\u00a6\u0006n7\u00cd\u0017\u00f6Wf\u00cd\u00b9C0\u009a\\\u00868\u00ec\u009b\u00f9\u00d5u\u0016\u00e9\u00cd\u00a5:\u00ff4\u00ab\"\u0018\u0085\b\n]\u00e9\u00e3\u00df2C\u00bb\u00e6\u00b5\u00cd\u00d2\u00e46\u00fdx\u00da\u00a78\b\u00fd\b/\u00b3_\u00fb\u0082\u00fe\u00fca\u009c\u00a9l\u0089g\u00c7.\u00ad\u0006q\u00d9\u00f8\u009f^_\u00ec\u00bf\u0013\u0000\u001d\u0087\u00c0\u0092\u0090\u00d7\u00f3\u00ee\u00dd\u00a9-\u0088\u0099K\u00ea\u0082K\u000f\u00e7,\u0083\u0081\u00a4\u00f7@\u0092\u00b5\u0085\u009c\u00e8\u009fzzk\u00ba\"\u00f7\u00b5\u00ac\u009bz\u00cdO\u00f7-{\u0093T1\u00e9".length();
                            var14_7 = 160;
                            var13_8 = -1;
lbl35:
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
lbl40:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = CP_GT.a(var19_9).intern();
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
lbl52:
                        // 1 sources

                        ** continue;
                    }
                }
                CP_GT.b = var18_3;
                CP_GT.c = new String[8];
                var1_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var2_11 = 1; var2_11 < 8; ++var2_11) {
                    v9 = v9;
                    v9[var2_11] = (byte)(var20 << var2_11 * 8 >>> 56);
                }
                var1_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var0_12 = new long[4];
                var4_13 = 0;
                var5_14 = "\u007f\u00de\u00f9\u0099\u008f\u0087\u00bc\u00cbY\u00fc\u0087\u009e$z<\u00d8";
                var6_15 = "\u007f\u00de\u00f9\u0099\u008f\u0087\u00bc\u00cbY\u00fc\u0087\u009e$z<\u00d8".length();
                var3_16 = 0;
                while (true) {
                    var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                    v10 = var0_12;
                    v11 = var4_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    var5_14 = "\u00e5>$\u00bb\u0094\u00fc\u0005\u00f1\u00f0-\u00a1\u0000-$Q6";
                    var6_15 = "\u00e5>$\u00bb\u0094\u00fc\u0005\u00f1\u00f0-\u00a1\u0000-$Q6".length();
                    var3_16 = 0;
                    while (true) {
                        var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                        v10 = var0_12;
                        v11 = var4_13++;
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
                    if (var3_16 < var6_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var1_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
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
        v15 = new String[(int)var0_12[0]];
        v15[0] = CP_GT.a("n", (int)4431, (long)(7950429711095107688L ^ var20));
        v15[1] = CP_GT.a("n", (int)7125, (long)(3095908888815311603L ^ var20));
        v15[2] = CP_GT.a("n", (int)26834, (long)(8379216236439890422L ^ var20));
        v15[3] = CP_GT.a("n", (int)9612, (long)(4064625319233004719L ^ var20));
        v15[4] = CP_GT.a("n", (int)25930, (long)(6319161177117418602L ^ var20));
        v15[5] = CP_GT.a("n", (int)9612, (long)(4064625319233004719L ^ var20));
        v15[(int)var0_12[3]] = CP_GT.a("n", (int)25142, (long)(171573598899331860L ^ var20));
        v15[(int)var0_12[2]] = CP_GT.a("n", (int)9612, (long)(4064625319233004719L ^ var20));
        v15[(int)var0_12[1]] = CP_GT.a("n", (int)17335, (long)(567442962144936598L ^ var20));
        CP_GT.CP_B = v15;
    }

    public static void CP_q(PacketWrapper[] packetWrapperArray) {
        CP_b = packetWrapperArray;
    }

    public static PacketWrapper[] CP_h() {
        return CP_b;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x25B3;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_GT", exception);
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
            CP_GT.c[n2] = CP_GT.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_GT.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_GT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_GT.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
