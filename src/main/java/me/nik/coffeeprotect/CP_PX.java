/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.md_5.bungee.api.chat.BaseComponent
 *  net.md_5.bungee.api.chat.ClickEvent
 *  net.md_5.bungee.api.chat.ClickEvent$Action
 *  net.md_5.bungee.api.chat.HoverEvent
 *  net.md_5.bungee.api.chat.HoverEvent$Action
 *  net.md_5.bungee.api.chat.TextComponent
 *  org.bukkit.Bukkit
 *  org.bukkit.Color
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
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
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.CP_PA;
import me.nik.coffeeprotect.CP_Qb;
import me.nik.coffeeprotect.UserData;
import me.nik.coffeeprotect.CP_jp;
import me.nik.coffeeprotect.CP_vF;
import me.nik.coffeeprotect.CP_vn;
import me.nik.coffeeprotect.CP_xi;
import me.nik.coffeeprotect.api.events.PlayerExploitEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class CP_PX
implements Listener {
    private final CoffeeProtect CP_h;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String MlwYADBKsp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_PX(CoffeeProtect coffeeProtect) {
        this.CP_h = coffeeProtect;
    }

    @EventHandler
    public void CP_U(PlayerExploitEvent playerExploitEvent) {
        int n;
        UUID uUID;
        String string;
        String string2;
        String string3;
        String string4;
        UserData ilIlTM;
        block11: {
            int n2;
            Player player;
            block10: {
                String[] stringArray;
                block9: {
                    block8: {
                        Player player2;
                        block7: {
                            long l = a ^ 0x4AEDA4E1C3BCL;
                            player = playerExploitEvent.getPlayer();
                            stringArray = CP_vF.CP_o();
                            player2 = player;
                            if (stringArray == null) break block7;
                            if (player2 == null) break block8;
                            player2 = player;
                        }
                        if (player2.isOnline()) break block9;
                    }
                    return;
                }
                ilIlTM = this.CP_h.CP_F().CP_R(player);
                string4 = playerExploitEvent.getCheckName();
                string3 = playerExploitEvent.getDescription();
                string2 = playerExploitEvent.getInformation();
                string = player.getName();
                uUID = player.getUniqueId();
                n2 = n = ilIlTM.CP_E();
                if (stringArray == null) break block10;
                if (n2 <= CP_Oq.PUNISH_MAX_VIOLATIONS.CP_j()) break block11;
                ilIlTM.CP_W();
                n2 = CP_Oq.PUNISH_DISCONNECT.CP_t() ? 1 : 0;
            }
            if (n2 != 0) {
                CoffeeProtect.CP_K().disconnect(player);
            }
            CP_Qb.CP_L(() -> CP_Oq.PUNISH_COMMANDS.CP_T().forEach(string2 -> {
                long l = a ^ 0xA80A1816876L;
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), (String)string2.replace((CharSequence)((Object)CP_PX.a("v", (int)16645, (long)(0x1E480ACE522EB584L ^ l))), string).replace((CharSequence)((Object)CP_PX.a("v", (int)8885, (long)(0x2AB57207D9EF5638L ^ l))), "\n"));
            }));
        }
        this.CP_h.CP_c().CP_c().execute(() -> {
            long l = a ^ 0x32D08370A073L;
            this.CP_h.CP_Z().CP_k(new CP_vn(CP_Oq.SERVER_NAME.CP_d(), string, uUID.toString(), string4, string2));
            String string5 = CP_xi.ALERT_HOVER.CP_F().replace((CharSequence)((Object)CP_PX.a("v", (int)12863, (long)(0x310988648238EB9L ^ l))), string3).replace((CharSequence)((Object)CP_PX.a("v", (int)21494, (long)(0x6714D9E286BD6F7DL ^ l))), string2);
            String string6 = CP_xi.ALERT_MESSAGE.CP_F().replace((CharSequence)((Object)CP_PX.a("v", (int)699, (long)(0x242C9C07C744BE39L ^ l))), string).replace((CharSequence)((Object)CP_PX.a("v", (int)16642, (long)(0x332817EAFC587D82L ^ l))), string4).replace((CharSequence)((Object)CP_PX.a("v", (int)4712, (long)(0x2481E5FC3E7CAEE1L ^ l))), String.valueOf(n));
            TextComponent textComponent = new TextComponent(TextComponent.fromLegacyText((String)string6));
            textComponent.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, (BaseComponent[])new TextComponent[]{new TextComponent(TextComponent.fromLegacyText((String)string5))}));
            textComponent.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, (String)((Object)CP_PX.a("v", (int)13051, (long)(0x185477F9B8960E77L ^ l))) + string));
            this.CP_h.CP_c().CP_F().forEach(uUID -> {
                block3: {
                    Player player;
                    block2: {
                        long l = a ^ 0x578F3E5E5318L;
                        Player player2 = Bukkit.getPlayer((UUID)uUID);
                        String[] stringArray = CP_vF.CP_o();
                        player = player2;
                        if (stringArray == null) break block2;
                        if (player == null) break block3;
                        player = player2;
                    }
                    player.spigot().sendMessage((BaseComponent)textComponent);
                }
            });
            if (CP_Oq.ALERT_CONSOLE.CP_t()) {
                Bukkit.getConsoleSender().sendMessage(string6);
            }
            if (CP_Oq.DISCORD_ENABLED.CP_t()) {
                new CP_PA(CP_Oq.DISCORD_WEBHOOK_URL.CP_d(), new CP_jp().CP_UnderScore((String)((Object)CP_PX.a("v", (int)13745, (long)(0x3DA4D3F58ACA893CL ^ l)))).CP_i(string).CP_k(Color.YELLOW).CP_z(string).CP_W((String)((Object)CP_PX.a("v", (int)13230, (long)(0x211DE52701300F32L ^ l))), CP_Oq.SERVER_NAME.CP_d()).CP_W((String)((Object)CP_PX.a("v", (int)6494, (long)(0x7EB754F9FB8F25D4L ^ l))), string4).CP_W((String)((Object)CP_PX.a("v", (int)8248, (long)(0x104AE7DDCE119CB6L ^ l))), string3).CP_W((String)((Object)CP_PX.a("v", (int)31290, (long)(0x78C51A5AAA4E46BDL ^ l))), ilIlTM.CP_c()).CP_W((String)((Object)CP_PX.a("v", (int)1505, (long)(0x6BF6B6BC313BB960L ^ l))), ilIlTM.CP_E().CP_r()).CP_W((String)((Object)CP_PX.a("v", (int)22195, (long)(0x7FAB265DC983EA3CL ^ l))), String.valueOf(ilIlTM.CP_p().CP_w())).CP_W((String)((Object)CP_PX.a("v", (int)28716, (long)(0x1015E35FB6DC4CB1L ^ l))), String.valueOf(ilIlTM.CP_D().CP_w())).CP_W((String)((Object)CP_PX.a("v", (int)10536, (long)(0x8159D9F89F395ADL ^ l))), String.valueOf(n)).CP_W((String)((Object)CP_PX.a("v", (int)7755, (long)(0x7648F3133930A2C8L ^ l))), string2)).CP_p();
            }
        });
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_PX.a = CP_s.a(6490007009696666097L, -2578573810602897688L, MethodHandles.lookup().lookupClass()).a(106897405826692L);
                CP_PX.d = new HashMap<K, V>(13);
                var0 = CP_PX.a ^ 53972301750292L;
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
                var9_3 = new String[18];
                var7_4 = 0;
                var6_5 = "y\u00af\u0095b\u00fdqA\u00dc\u00d2^\n\u00ab\u0097\u00de\u00cd&\u00ee\f\u00fb\u0081\u0002\u0019|w\u0010\u00ffQk)\u00b2J\u00f7\u0003\u009aINtwe9\u00bf\u0010e\u0003\u001f\u00b9\u00ef\u0088\u00be\u00d8`\u00d3\u00a9\u008bO\u00d2\u009f, \u00fdf$\u00f3g \u00f9TV\u00fbR\u0082\u0016\u00db\u009f\u00d7\u00db\fg\u008b\u009a\u008d\u00c0Dg\u008d\u009c:\u00fc\u0005\u00e0%\u0010\u00a6L\u001e\u00c7\u0098\u001ct[\u009e\u0016\u009b\u00ec\u00fb\u0097:\u00f7\u0010\u008d*\u00aas c$E\u00ca\u00ceS\u0095\u00fd\u007f\u008e6 f[.Cs\u0084\u00d0\u0092\u0091\f\u00eb\u00cd\u00a0\u00d5\u00a0q\u00fb\u00c1k@\u0013\u001a\u0011\u00a1\u008c;Z$\u0003\u00b8\f \u0010!\u00c4Vd\u00c25$\u00cd\u001e\u00ac\u0089\u008b\u00e1\tq\u0092 %\u00c4NgH\u00e1\u00d2\u00d9~g\u0017uB9\u00d5\u00a2\u00d9\u0013$\u0003-\u00e8N`\u00fb\u00ff\u00e9\u00d9\u00e7D\u00f6\u0014 \u00a0\u00d4ew\u0092\u0017\u00cd\u00d0\u009d\u00cd\u00b1\u00adV\u00ac+\u00d2\u001e\u00af\u00f8\u00e4f\u001b\u001f\u00c4E\u0010\u00c6\u00a2\u00b3Xs\u00c5\u00106\u00d6\u000f=\u00deS\u00b6\u0003\bf\u0081^\u00a9\u00b1[F\u0018\u00ef\u00e9\u0010E\u00b6+\u00a9\u0016\u00da\u00f9\u0010$\u00fc\u0010\\\u0092m\u00eb\u0002\u001dQ\u00a6Fo\u0010q\u009f\u00f1\u00b4q\u00a1dE\u00de|\u00c8\u00e7\u0083\u00f3@|\u0010\u00f0{\u001a\u00faY9\u0001eeXjp\u00bb\u009b\u00eb\u00b6 \u001e\u0098\u00bd\u00e1\u00ad`\u00c4\u00e54\u00c6\u0097\n\u0090\u00f2\u00b67X.Cx\u001f\b\u00e4#\u00c82\u00c1\u00c0\u00e4\u0003\u008a\u00d5\u0018\u00db\u00f1P\u0015Q\u00ba\u00e4\u0080\u0014\u00c3\tc\u009d\u00ca\u0015v\t\u0017\u00e9\u0000\u00cc\u0090\u00dab";
                var8_6 = "y\u00af\u0095b\u00fdqA\u00dc\u00d2^\n\u00ab\u0097\u00de\u00cd&\u00ee\f\u00fb\u0081\u0002\u0019|w\u0010\u00ffQk)\u00b2J\u00f7\u0003\u009aINtwe9\u00bf\u0010e\u0003\u001f\u00b9\u00ef\u0088\u00be\u00d8`\u00d3\u00a9\u008bO\u00d2\u009f, \u00fdf$\u00f3g \u00f9TV\u00fbR\u0082\u0016\u00db\u009f\u00d7\u00db\fg\u008b\u009a\u008d\u00c0Dg\u008d\u009c:\u00fc\u0005\u00e0%\u0010\u00a6L\u001e\u00c7\u0098\u001ct[\u009e\u0016\u009b\u00ec\u00fb\u0097:\u00f7\u0010\u008d*\u00aas c$E\u00ca\u00ceS\u0095\u00fd\u007f\u008e6 f[.Cs\u0084\u00d0\u0092\u0091\f\u00eb\u00cd\u00a0\u00d5\u00a0q\u00fb\u00c1k@\u0013\u001a\u0011\u00a1\u008c;Z$\u0003\u00b8\f \u0010!\u00c4Vd\u00c25$\u00cd\u001e\u00ac\u0089\u008b\u00e1\tq\u0092 %\u00c4NgH\u00e1\u00d2\u00d9~g\u0017uB9\u00d5\u00a2\u00d9\u0013$\u0003-\u00e8N`\u00fb\u00ff\u00e9\u00d9\u00e7D\u00f6\u0014 \u00a0\u00d4ew\u0092\u0017\u00cd\u00d0\u009d\u00cd\u00b1\u00adV\u00ac+\u00d2\u001e\u00af\u00f8\u00e4f\u001b\u001f\u00c4E\u0010\u00c6\u00a2\u00b3Xs\u00c5\u00106\u00d6\u000f=\u00deS\u00b6\u0003\bf\u0081^\u00a9\u00b1[F\u0018\u00ef\u00e9\u0010E\u00b6+\u00a9\u0016\u00da\u00f9\u0010$\u00fc\u0010\\\u0092m\u00eb\u0002\u001dQ\u00a6Fo\u0010q\u009f\u00f1\u00b4q\u00a1dE\u00de|\u00c8\u00e7\u0083\u00f3@|\u0010\u00f0{\u001a\u00faY9\u0001eeXjp\u00bb\u009b\u00eb\u00b6 \u001e\u0098\u00bd\u00e1\u00ad`\u00c4\u00e54\u00c6\u0097\n\u0090\u00f2\u00b67X.Cx\u001f\b\u00e4#\u00c82\u00c1\u00c0\u00e4\u0003\u008a\u00d5\u0018\u00db\u00f1P\u0015Q\u00ba\u00e4\u0080\u0014\u00c3\tc\u009d\u00ca\u0015v\t\u0017\u00e9\u0000\u00cc\u0090\u00dab".length();
                var5_7 = 24;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = CP_PX.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u008fX\u00b9\u0098\u008b\u0091~\u00f0\u001b\u00b4s\u008e\u00dbu\u0090\u00e7\u001e\u009a\r\u00d4*\u00eeGP\u0010\u00d5\u001d\u00a02\u00ccm9\u00f4\u00f6\u00a3K[\u00cf\u000e\u008a\u0017";
                    var8_6 = "\u008fX\u00b9\u0098\u008b\u0091~\u00f0\u001b\u00b4s\u008e\u00dbu\u0090\u00e7\u001e\u009a\r\u00d4*\u00eeGP\u0010\u00d5\u001d\u00a02\u00ccm9\u00f4\u00f6\u00a3K[\u00cf\u000e\u008a\u0017".length();
                    var5_7 = 24;
                    var4_8 = -1;
lbl34:
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
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = CP_PX.a(var10_9).intern();
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
lbl51:
                // 1 sources

                ** continue;
            }
        }
        CP_PX.b = var9_3;
        CP_PX.c = new String[18];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7B21;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_PX", exception);
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
            CP_PX.c[n2] = CP_PX.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_PX.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_PX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_PX.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
