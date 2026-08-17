/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlbY
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  org.bukkit.entity.Player
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlTM;
import me.nik.coffeeprotect.IlIlTV;
import me.nik.coffeeprotect.IlIljl;
import me.nik.coffeeprotect.IlIlu7;
import me.nik.coffeeprotect.IlIluV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlbY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.entity.Player;

@IlIljl(IlIlJ="Invalid Pick Item", IlIlM="Checks for invalid pick item packets")
public class IlIlu6
extends IlIluV {
    private static final long b = IlIls.a((long)6711737719260497621L, (long)3335889635419089217L, MethodHandles.lookup().lookupClass()).a(3126772621952L);
    private static final String d;
    private static transient /* synthetic */ String OrRdheztwg = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlu6(IlIlTM ilIlTM) {
        super(ilIlTM, IlIlOq.CHECKS_INVALID_PICK_ITEM_ENABLED.IlIlt());
    }

    @Override
    public IlIlTV IlIlh(PacketReceiveEvent packetReceiveEvent) {
        block8: {
            int n;
            block7: {
                int n2;
                int n3;
                block6: {
                    block4: {
                        block5: {
                            long l = b ^ 0x566A7CDBBEEDL;
                            String string = IlIlu7.IlIlq();
                            if (packetReceiveEvent.getPacketType() != IlIlnN.PICK_ITEM) {
                                return null;
                            }
                            IlIlbY ilIlbY = new IlIlbY(packetReceiveEvent);
                            n3 = n = ilIlbY.IlIlj();
                            if (string != null) break block4;
                            if (n3 >= 0) break block5;
                            n3 = n;
                            n2 = -1;
                            if (string != null) break block6;
                            if (n3 != n2) break block7;
                        }
                        n3 = n;
                    }
                    n2 = ((Player)packetReceiveEvent.getPlayer()).getInventory().getContents().length;
                }
                if (n3 <= n2) break block8;
            }
            return new IlIlTV(this, d + n);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x1A54231630E2L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u008b-Wn2\u008e\r\u00f9".getBytes("ISO-8859-1"));
                d = IlIlu6.b(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
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
}

