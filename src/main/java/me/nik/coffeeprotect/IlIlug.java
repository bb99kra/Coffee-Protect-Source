/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlb1
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlb5
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlbV
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 */
package me.nik.coffeeprotect;

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
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlTM;
import me.nik.coffeeprotect.IlIlTV;
import me.nik.coffeeprotect.IlIljC;
import me.nik.coffeeprotect.IlIljl;
import me.nik.coffeeprotect.IlIlu7;
import me.nik.coffeeprotect.IlIluV;
import me.nik.coffeeprotect.IlIlxe;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlb1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlb5;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlbV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

@IlIljl(IlIlJ="Invalid Sequence", IlIlM="Checks for invalid packet sequence")
public class IlIlug
extends IlIluV {
    private static final long b = IlIls.a((long)-4513147424088056010L, (long)-8094784434255821599L, MethodHandles.lookup().lookupClass()).a(19839153430834L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static transient /* synthetic */ String cvDciJQKbl = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlug(IlIlTM ilIlTM) {
        super(ilIlTM, IlIlOq.CHECKS_INVALID_SEQUENCE_ENABLED.IlIlt());
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public IlIlTV IlIlh(PacketReceiveEvent var1_1) {
        block8: {
            block9: {
                block7: {
                    var2_2 = IlIlug.b ^ 8566737975092L;
                    var4_3 = IlIlu7.IlIlq();
                    v0 = var1_1.getPacketType() instanceof IlIlnN;
                    if (var4_3 == null) {
                        if (v0 == 0) {
                            return null;
                        }
                        v0 = this.IlIlw.IlIlE().IlIlO(ClientVersion.V_1_19);
                    }
                    if (var4_3 != null) break block7;
                    if (v0 != 0) break block8;
                    v0 = IlIljC.IlIlZ().IlIlo(IlIljC.v1_19_R1);
                }
                if (var4_3 != null) break block9;
                if (v0 != 0) break block8;
                v0 = IlIlxe.IlIls[((IlIlnN)var1_1.getPacketType()).ordinal()];
            }
            if (var4_3 != null) ** GOTO lbl20
            switch (v0 ? 1 : 0) {
                case 1: {
                    v0 = new IlIlb5(var1_1).IlIl_();
lbl20:
                    // 2 sources

                    if (v0 >= 0) break;
                    return new IlIlTV(this, (String)IlIlug.a("v", (int)4655, (long)(1419282306457870538L ^ var2_2)));
                }
                case 2: {
                    if (new IlIlbV(var1_1).IlIln() >= 0) break;
                    return new IlIlTV(this, (String)IlIlug.a("v", (int)4991, (long)(2912087106841321883L ^ var2_2)));
                }
                case 3: {
                    if (new IlIlb1(var1_1).IlIlp() >= 0) break;
                    return new IlIlTV(this, (String)IlIlug.a("v", (int)3492, (long)(5823596343906385730L ^ var2_2)));
                }
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new HashMap(13);
        long l = b ^ 0x3545D228ABF6L;
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
        String string = "\u00b9\u00ba6\u0087\f\u001c\u00d0Y\u0099\u00a84\u00de\u00da\u0014/\u00e0 \n$\u00bd\u000bO=\u00a3\u0089U\u008d\u00c4\u00ea#\u00bd\u0006\u00fai\u001e\u008eC\u009d&\u00fc2\u00f4\u00fc\"\\\u0014@g\u0087\u0010k\u001f\u00edm\u00da\u0091\r\u00d6\b\u0084{\u00a2J\u007f\u00f4\u00e9";
        int n2 = "\u00b9\u00ba6\u0087\f\u001c\u00d0Y\u0099\u00a84\u00de\u00da\u0014/\u00e0 \n$\u00bd\u000bO=\u00a3\u0089U\u008d\u00c4\u00ea#\u00bd\u0006\u00fai\u001e\u008eC\u009d&\u00fc2\u00f4\u00fc\"\\\u0014@g\u0087\u0010k\u001f\u00edm\u00da\u0091\r\u00d6\b\u0084{\u00a2J\u007f\u00f4\u00e9".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = IlIlug.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                e = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static String b(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4CB;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlug", exception);
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
            IlIlug.e[n2] = IlIlug.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlug.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlug" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlug.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

