/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  org.bukkit.Color
 */
package me.nik.coffeeprotect;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.net.ssl.HttpsURLConnection;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIldU;
import me.nik.coffeeprotect.IlIliD;
import me.nik.coffeeprotect.IlIljp;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.Color;

public class IlIlPA {
    private static final String IlIlj;
    private static long IlIlN;
    private final String IlIlZ;
    private final IlIljp IlIlJ;
    private static boolean IlIli;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final long h;
    private static transient /* synthetic */ String POiiJKdQhC = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlPA(String string, IlIljp ilIljp) {
        this.IlIlZ = string;
        this.IlIlJ = ilIljp;
    }

    public void IlIlp() {
        long l;
        block4: {
            block5: {
                block3: {
                    int n;
                    block2: {
                        long l2 = a ^ 0x1AAF9F529137L;
                        boolean bl = IlIlPA.IlIly();
                        n = this.IlIlZ.isEmpty();
                        if (bl) break block2;
                        if (n != 0) break block3;
                        l = System.currentTimeMillis() - IlIlN;
                        if (bl) break block4;
                        long l3 = l - h;
                        n = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                    }
                    if (n >= 0) break block5;
                }
                return;
            }
            l = System.currentTimeMillis();
        }
        IlIlN = l;
        CoffeeProtect.IlIlJ().IlIlc().IlIlc().execute(() -> {
            Object object;
            IlIldU ilIldU;
            long l;
            block25: {
                Color color;
                IlIljp ilIljp;
                IlIldU ilIldU2;
                ArrayList<IlIldU> arrayList;
                boolean bl;
                block23: {
                    block24: {
                        block22: {
                            IlIljp ilIljp2;
                            block21: {
                                String string;
                                block19: {
                                    block20: {
                                        l = a ^ 0x115AE251DA6DL;
                                        boolean bl2 = IlIlPA.IlIly();
                                        ilIldU = new IlIldU(null);
                                        ilIldU.IlIlC((String)((Object)IlIlPA.a("b", (int)23782, (long)(0x6D7886698F544950L ^ l))), IlIlOq.DISCORD_WEBHOOK_ICON_URL.IlIld());
                                        ilIldU.IlIlC((String)((Object)IlIlPA.a("b", (int)16743, (long)(0x4D8AEE2954E5D4DEL ^ l))), IlIlOq.DISCORD_WEBHOOK_NAME.IlIld());
                                        bl = bl2;
                                        try {
                                            if (this.IlIlJ == null) {
                                                return;
                                            }
                                        }
                                        catch (IOException iOException) {
                                            throw IlIlPA.a(iOException);
                                        }
                                        arrayList = new ArrayList<IlIldU>();
                                        ilIldU2 = new IlIldU(null);
                                        ilIldU2.IlIlC((String)((Object)IlIlPA.a("b", (int)4238, (long)(0x37EB840FF720536L ^ l))), this.IlIlJ.IlIlo());
                                        string = this.IlIlJ.IlIla();
                                        if (bl) break block19;
                                        try {
                                            block26: {
                                                if (string == null) break block20;
                                                break block26;
                                                catch (IOException iOException) {
                                                    throw IlIlPA.a(iOException);
                                                }
                                            }
                                            ilIldU2.IlIlC((String)((Object)IlIlPA.a("b", (int)22442, (long)(0x3BCAC4C277FCC21FL ^ l))), this.IlIlJ.IlIla());
                                        }
                                        catch (IOException iOException) {
                                            throw IlIlPA.a(iOException);
                                        }
                                    }
                                    try {
                                        ilIljp2 = this.IlIlJ;
                                        if (bl) break block21;
                                        string = ilIljp2.IlIlV();
                                    }
                                    catch (IOException iOException) {
                                        throw IlIlPA.a(iOException);
                                    }
                                }
                                try {
                                    if (string != null) break block22;
                                    ilIljp2 = this.IlIlJ;
                                }
                                catch (IOException iOException) {
                                    throw IlIlPA.a(iOException);
                                }
                            }
                            ilIljp2.IlIl_(IlIlOq.DISCORD_WEBHOOK_ICON_URL.IlIld());
                        }
                        IlIldU ilIldU3 = new IlIldU(null);
                        try {
                            ilIldU3.IlIlC((String)((Object)IlIlPA.a("b", (int)16899, (long)(0x1C651247676457A1L ^ l))), this.IlIlJ.IlIlV());
                            ilIldU2.IlIlC((String)((Object)IlIlPA.a("b", (int)32149, (long)(0x7BFF6D4C2CAA682EL ^ l))), ilIldU3);
                            ilIljp = this.IlIlJ;
                            if (bl) break block23;
                            if (ilIljp.IlIlA() == null) break block24;
                        }
                        catch (IOException iOException) {
                            throw IlIlPA.a(iOException);
                        }
                        color = this.IlIlJ.IlIlA();
                        int n = color.getRed();
                        n = (n << IlIlPA.b("l", (int)2213, (long)(0x101D217D80CA0EDCL ^ l))) + color.getGreen();
                        n = (n << IlIlPA.b("l", (int)1821, (long)(0x26820FF9C8BD8165L ^ l))) + color.getBlue();
                        ilIldU2.IlIlC((String)((Object)IlIlPA.a("b", (int)29741, (long)(0x283AA4BDD42A6191L ^ l))), n);
                    }
                    ilIljp = this.IlIlJ;
                }
                color = ilIljp.IlIlz();
                ArrayList<IlIldU> arrayList2 = new ArrayList<IlIldU>();
                for (Object object2 : color) {
                    object = new IlIldU(null);
                    try {
                        ((IlIldU)object).IlIlC((String)((Object)IlIlPA.a("b", (int)16242, (long)(0x65972F07F8BEAACDL ^ l))), IlIliD.IlIlC((IlIliD)object2));
                        ((IlIldU)object).IlIlC((String)((Object)IlIlPA.a("b", (int)9053, (long)(0x10A66550393AB6EAL ^ l))), IlIliD.IlIlS((IlIliD)object2));
                        arrayList2.add((IlIldU)object);
                        if (!bl) {
                            if (!bl) continue;
                            break;
                        }
                        break block25;
                    }
                    catch (IOException iOException) {
                        throw IlIlPA.a(iOException);
                    }
                }
                ilIldU2.IlIlC((String)((Object)IlIlPA.a("b", (int)14388, (long)(0x2843EC44E68A2D85L ^ l))), arrayList2.toArray());
                arrayList.add(ilIldU2);
                ilIldU.IlIlC((String)((Object)IlIlPA.a("b", (int)17812, (long)(0x35141478FDA6D020L ^ l))), arrayList.toArray());
            }
            try {
                Object object2;
                URL uRL = new URL(this.IlIlZ);
                object2 = (HttpsURLConnection)uRL.openConnection();
                ((URLConnection)object2).addRequestProperty((String)((Object)IlIlPA.a("b", (int)20961, (long)(0x274E25E2A9EF4442L ^ l))), (String)((Object)IlIlPA.a("b", (int)16017, (long)(0x126ADDE1C5172B2CL ^ l))));
                ((URLConnection)object2).addRequestProperty((String)((Object)IlIlPA.a("b", (int)20453, (long)(0x21CFEA3B1221DA56L ^ l))), (String)((Object)IlIlPA.a("b", (int)9250, (long)(0x425FF806187BB190L ^ l))));
                ((URLConnection)object2).setDoOutput(true);
                ((HttpURLConnection)object2).setRequestMethod((String)((Object)IlIlPA.a("b", (int)25806, (long)(0xB0B9D3955A0F17EL ^ l))));
                object = ((URLConnection)object2).getOutputStream();
                ((OutputStream)object).write(ilIldU.toString().getBytes());
                ((OutputStream)object).flush();
                ((OutputStream)object).close();
                ((URLConnection)object2).getInputStream().close();
                ((HttpURLConnection)object2).disconnect();
            }
            catch (IOException iOException) {
                IlIlrW.IlIlU((String)((Object)IlIlPA.a("b", (int)5311, (long)(0x1FF474A31458101L ^ l))) + iOException.getLocalizedMessage());
            }
        });
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block17: {
                    block16: {
                        block15: {
                            IlIlPA.a = IlIls.a((long)-5517246544424037639L, (long)-1909001437128876511L, MethodHandles.lookup().lookupClass()).a(113361336294376L);
                            IlIlPA.d = new HashMap<K, V>(13);
                            var16 = IlIlPA.a ^ 27756861035198L;
                            IlIlPA.IlIlO(false);
                            var18_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                            v0 = SecretKeyFactory.getInstance("DES");
                            v1 = new byte[8];
                            v2 = v1;
                            v1[0] = (byte)(var16 >>> 56);
                            for (var19_2 = 1; var19_2 < 8; ++var19_2) {
                                v2 = v2;
                                v2[var19_2] = (byte)(var16 << var19_2 * 8 >>> 56);
                            }
                            var18_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                            var25_3 = new String[18];
                            var23_4 = 0;
                            var22_5 = "\u00e4\u00ac\u00edD9\u0005l\u00a5\u0099\u0091\u00b3\u008dIJ\u0002\u0014n\u00e1\u00e5\u0086\u0083r\u00b7\u008b\u00b1\u0006A\u00e7\u00c9hC\u00d9(\u00fa\u0000\u00afF\u00f8e\u00f7\u00c8\u00d6\u00b0\u00e0\u00bf\u00ae\u000e5\u00de\r\\8\u0017\u00d4|\u00a2\u0014;Pk\u0003\u00b3\u008f\u0084\u00d2\u00bd\u00b5\u00c3\u0007hAw&\u0010\u008cm8?%\t\b\u0001\u000e\u00d1\u0080\u00e1\u0018\u00c2\u008b\u00b1\u0010\u00eb\u001ezc\u00e9\u00eb\u00b3Ks\u00060\u00cb\f\u00ba\u0006\u00a4\u0010\u00d6E.\u00e8f\n:\u00cc\u00e7\u0002]\u009a\u00c9\u00dfN7\u0018\u0015i\u00b2\u0006P,scd\u0088\u00fc^\u00b38\u00faS\u00d2A\u00f3(\u0092\u00d1\u00ee!\u0018R\u00f9\r\u00bf\u00d9\u00c0\u001b\u009d\u00e9_^z\u00c9{\u008d\u00e1\u00b6\u00a0^2\u0098\u0002\u00ee\u00f6\u0010=\u00c8\u00fc\u00a1*\u00a94\u0083\u00de\u000e\u0093\u001bZ\u0094\u009d\u00fc\u0018\u00b2\u0007WTWTt\u00c6\u0006H\u00d7\u00f3\u00d9\u007fk\u0007\u00d8\u00fa=\u00ea\u00a7\u00c0\u001ck85\u0094!\u0082\u0092\\H\u0001\u00b4E\u0094\f\u00a3&L\u00f3\u00b4\u00c9cM\u00cc|\t\u007f:\u0011\u00b9\u00d4\u00feE\u0094\u0006\u00d8rP[\u00a0@\"\u0004\u001f\u007f\u00b9\u00ca\u00cc*\u0005\u00f7\u00aa\u0081)\u00e7\u0089\u001c\u00f9\u0017 \\\u00c29\u00f2\u00a8yz,j\u00ce'Q\u0005\u00c3$\u0087J\u0016\u00c3\u0082\u00ff\u00f9\u00df\u00cb\u001e\u00db\u00cf{K\u008bz\u001e\u0010\u00f5\u001a\u00ecbs\\\"x9\u0094\u0093\u00fd\u00a2\u00a9\u00ac\u0017\u00102\u0019p\u00ddP\u00f8C#\u0081#\u0091\u00e8\u00f1\u0012\u00a4\u00ac8\u001d8\u008bh\u00aa\u008a|=\u00af\u001a`$\u0007\u00c2|\u00cd\u00f5\u00c0M\u00ffRI\u0090\u008f\u00b7i<.\u0004z\u00e5N\u00f9\u008e\u00ceoa\u00ffG\u001c\u00fcw\u00af[\u008f\u00cf,8\u00b0\u00f0\u001bL^|\u0019\u00a6(-\u00cb\u0082-\u00fc#\u00dfC\u0095\u00f72g\u00f0|3F\u00ec\u0006\u00cd\u0005\u0006\u000b=\u00f8\u009d\u00a5\u00d3\u00ac@C9u\u00b22\u0010\u00aa\u00d2\u00a8_d\u0010\u00a0\u00f851\u00b9\u007f:\u00c81qswE\u0091IH";
                            var24_6 = "\u00e4\u00ac\u00edD9\u0005l\u00a5\u0099\u0091\u00b3\u008dIJ\u0002\u0014n\u00e1\u00e5\u0086\u0083r\u00b7\u008b\u00b1\u0006A\u00e7\u00c9hC\u00d9(\u00fa\u0000\u00afF\u00f8e\u00f7\u00c8\u00d6\u00b0\u00e0\u00bf\u00ae\u000e5\u00de\r\\8\u0017\u00d4|\u00a2\u0014;Pk\u0003\u00b3\u008f\u0084\u00d2\u00bd\u00b5\u00c3\u0007hAw&\u0010\u008cm8?%\t\b\u0001\u000e\u00d1\u0080\u00e1\u0018\u00c2\u008b\u00b1\u0010\u00eb\u001ezc\u00e9\u00eb\u00b3Ks\u00060\u00cb\f\u00ba\u0006\u00a4\u0010\u00d6E.\u00e8f\n:\u00cc\u00e7\u0002]\u009a\u00c9\u00dfN7\u0018\u0015i\u00b2\u0006P,scd\u0088\u00fc^\u00b38\u00faS\u00d2A\u00f3(\u0092\u00d1\u00ee!\u0018R\u00f9\r\u00bf\u00d9\u00c0\u001b\u009d\u00e9_^z\u00c9{\u008d\u00e1\u00b6\u00a0^2\u0098\u0002\u00ee\u00f6\u0010=\u00c8\u00fc\u00a1*\u00a94\u0083\u00de\u000e\u0093\u001bZ\u0094\u009d\u00fc\u0018\u00b2\u0007WTWTt\u00c6\u0006H\u00d7\u00f3\u00d9\u007fk\u0007\u00d8\u00fa=\u00ea\u00a7\u00c0\u001ck85\u0094!\u0082\u0092\\H\u0001\u00b4E\u0094\f\u00a3&L\u00f3\u00b4\u00c9cM\u00cc|\t\u007f:\u0011\u00b9\u00d4\u00feE\u0094\u0006\u00d8rP[\u00a0@\"\u0004\u001f\u007f\u00b9\u00ca\u00cc*\u0005\u00f7\u00aa\u0081)\u00e7\u0089\u001c\u00f9\u0017 \\\u00c29\u00f2\u00a8yz,j\u00ce'Q\u0005\u00c3$\u0087J\u0016\u00c3\u0082\u00ff\u00f9\u00df\u00cb\u001e\u00db\u00cf{K\u008bz\u001e\u0010\u00f5\u001a\u00ecbs\\\"x9\u0094\u0093\u00fd\u00a2\u00a9\u00ac\u0017\u00102\u0019p\u00ddP\u00f8C#\u0081#\u0091\u00e8\u00f1\u0012\u00a4\u00ac8\u001d8\u008bh\u00aa\u008a|=\u00af\u001a`$\u0007\u00c2|\u00cd\u00f5\u00c0M\u00ffRI\u0090\u008f\u00b7i<.\u0004z\u00e5N\u00f9\u008e\u00ceoa\u00ffG\u001c\u00fcw\u00af[\u008f\u00cf,8\u00b0\u00f0\u001bL^|\u0019\u00a6(-\u00cb\u0082-\u00fc#\u00dfC\u0095\u00f72g\u00f0|3F\u00ec\u0006\u00cd\u0005\u0006\u000b=\u00f8\u009d\u00a5\u00d3\u00ac@C9u\u00b22\u0010\u00aa\u00d2\u00a8_d\u0010\u00a0\u00f851\u00b9\u007f:\u00c81qswE\u0091IH".length();
                            var21_7 = 32;
                            var20_8 = -1;
lbl21:
                            // 2 sources

                            while (true) {
                                v3 = ++var20_8;
                                v4 = var22_5.substring(v3, v3 + var21_7);
                                v5 = -1;
                                break block15;
                                break;
                            }
lbl26:
                            // 1 sources

                            while (true) {
                                var25_3[var23_4++] = IlIlPA.a(var26_9).intern();
                                if ((var20_8 += var21_7) < var24_6) {
                                    var21_7 = var22_5.charAt(var20_8);
                                    ** continue;
                                }
                                var22_5 = "\u0003B:\u008e\u0016\u00e1\u0001\u0090\u00ec\u00e9\u00d4z\u0088C\u00dbgL\u00b2\u0086\u00c8.\u00d1\u00e0\u0086G\u0004m\u00f8\bt-\u00ec\u0010\u001c\u00c2\u00a3\u0006e\u00c9,\u00der\u001e\u00d0\u000b\u0080\u00f4M\u00cf";
                                var24_6 = "\u0003B:\u008e\u0016\u00e1\u0001\u0090\u00ec\u00e9\u00d4z\u0088C\u00dbgL\u00b2\u0086\u00c8.\u00d1\u00e0\u0086G\u0004m\u00f8\bt-\u00ec\u0010\u001c\u00c2\u00a3\u0006e\u00c9,\u00der\u001e\u00d0\u000b\u0080\u00f4M\u00cf".length();
                                var21_7 = 32;
                                var20_8 = -1;
lbl35:
                                // 2 sources

                                while (true) {
                                    v6 = ++var20_8;
                                    v4 = var22_5.substring(v6, v6 + var21_7);
                                    v5 = 0;
                                    break block15;
                                    break;
                                }
                                break;
                            }
lbl40:
                            // 1 sources

                            while (true) {
                                var25_3[var23_4++] = IlIlPA.a(var26_9).intern();
                                if ((var20_8 += var21_7) < var24_6) {
                                    var21_7 = var22_5.charAt(var20_8);
                                    ** continue;
                                }
                                break block16;
                                break;
                            }
                        }
                        var26_9 = var18_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                    IlIlPA.b = var25_3;
                    IlIlPA.c = new String[18];
                    IlIlPA.IlIlj = IlIlPA.a("b", (int)21690, (long)(8375620983026256339L ^ var16));
                    IlIlPA.g = new HashMap<K, V>(13);
                    var5_10 = Cipher.getInstance("DES/CBC/NoPadding");
                    v7 = SecretKeyFactory.getInstance("DES");
                    v8 = new byte[8];
                    v9 = v8;
                    v8[0] = (byte)(var16 >>> 56);
                    for (var6_11 = 1; var6_11 < 8; ++var6_11) {
                        v9 = v9;
                        v9[var6_11] = (byte)(var16 << var6_11 * 8 >>> 56);
                    }
                    var5_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                    var11_12 = new long[2];
                    var8_13 = 0;
                    var9_14 = "\u0001\u008b\u00ccZvm\u00c3\u00a5\u00af\u00e6't\u00d2/E\u00da";
                    var10_15 = "\u0001\u008b\u00ccZvm\u00c3\u00a5\u00af\u00e6't\u00d2/E\u00da".length();
                    var7_16 = 0;
                    while (true) {
                        break block17;
                        break;
                    }
lbl75:
                    // 1 sources

                    while (true) {
                        var11_12[v10] = ((long)var15_19[0] & 255L) << 56 | ((long)var15_19[1] & 255L) << 48 | ((long)var15_19[2] & 255L) << 40 | ((long)var15_19[3] & 255L) << 32 | ((long)var15_19[4] & 255L) << 24 | ((long)var15_19[5] & 255L) << 16 | ((long)var15_19[6] & 255L) << 8 | (long)var15_19[7] & 255L;
                        if (var7_16 < var10_15) ** continue;
                        break block18;
                        break;
                    }
                }
                var12_17 = var9_14.substring(var7_16, var7_16 += 8).getBytes("ISO-8859-1");
                v10 = var8_13++;
                var13_18 = ((long)var12_17[0] & 255L) << 56 | ((long)var12_17[1] & 255L) << 48 | ((long)var12_17[2] & 255L) << 40 | ((long)var12_17[3] & 255L) << 32 | ((long)var12_17[4] & 255L) << 24 | ((long)var12_17[5] & 255L) << 16 | ((long)var12_17[6] & 255L) << 8 | (long)var12_17[7] & 255L;
                var15_19 = var5_10.doFinal(new byte[]{(byte)(var13_18 >>> 56), (byte)(var13_18 >>> 48), (byte)(var13_18 >>> 40), (byte)(var13_18 >>> 32), (byte)(var13_18 >>> 24), (byte)(var13_18 >>> 16), (byte)(var13_18 >>> 8), (byte)var13_18});
                ** while (true)
            }
            IlIlPA.e = var11_12;
            IlIlPA.f = new Integer[2];
            var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
            v11 = SecretKeyFactory.getInstance("DES");
            v12 = new byte[8];
            v13 = v12;
            v12[0] = (byte)(var16 >>> 56);
            for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                v13 = v13;
                v13[var1_21] = (byte)(var16 << var1_21 * 8 >>> 56);
            }
            break block19;
lbl101:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_20.init(2, (Key)v11.generateSecret(new DESKeySpec(v13)), new IvParameterSpec(new byte[8]));
        var2_22 = 5239359329941273766L;
        var4_23 = var0_20.doFinal(new byte[]{(byte)(var2_22 >>> 56), (byte)(var2_22 >>> 48), (byte)(var2_22 >>> 40), (byte)(var2_22 >>> 32), (byte)(var2_22 >>> 24), (byte)(var2_22 >>> 16), (byte)(var2_22 >>> 8), (byte)var2_22});
        ** while (true)
        IlIlPA.h = ((long)var4_23[0] & 255L) << 56 | ((long)var4_23[1] & 255L) << 48 | ((long)var4_23[2] & 255L) << 40 | ((long)var4_23[3] & 255L) << 32 | ((long)var4_23[4] & 255L) << 24 | ((long)var4_23[5] & 255L) << 16 | ((long)var4_23[6] & 255L) << 8 | (long)var4_23[7] & 255L;
        IlIlPA.IlIlN = 0L;
    }

    public static void IlIlO(boolean bl) {
        IlIli = bl;
    }

    public static boolean IlIly() {
        return IlIli;
    }

    public static boolean IlIlf() {
        boolean bl = IlIlPA.IlIly();
        return !bl;
    }

    private static IOException a(IOException iOException) {
        return iOException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xE4C;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlPA", exception);
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
            IlIlPA.c[n2] = IlIlPA.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlPA.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlPA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1D87;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlPA", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlPA.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlPA.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlPA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlPA.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(IlIlPA.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

