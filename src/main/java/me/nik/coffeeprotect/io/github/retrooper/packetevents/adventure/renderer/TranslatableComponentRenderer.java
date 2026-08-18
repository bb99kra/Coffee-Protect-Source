/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.renderer;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.text.AttributedCharacterIterator;
import java.text.FieldPosition;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_Az;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_L1;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_L_;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_O5;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_R;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_XM;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_ZR;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_c;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_dn;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_fU;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_hF;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_iK;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_nf;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_oE;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_ou;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_qt;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_rS;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_u8;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_up;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_x6;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_yn;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.TextComponent;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.TranslatableComponent;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.event.CP_h_;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.renderer.CP_jM;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.renderer.CP_js;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import me.nik.coffeeprotect.libs.kyori.adventure.translation.Translator;

public abstract class TranslatableComponentRenderer<C>
extends CP_jM<C> {
    private static final Set<CP_Az> CP_f;
    private static final long b;
    private static final String d;

    @NotNull
    public static TranslatableComponentRenderer<Locale> usingTranslationSource(@NotNull Translator translator) {
        long l = b ^ 0x1ECF802ACD25L;
        Objects.requireNonNull(translator, d);
        return new CP_js(translator);
    }

    @Nullable
    protected MessageFormat CP_h(@NotNull String string, @NotNull C c) {
        return null;
    }

    @Nullable
    protected MessageFormat CP_C(@NotNull String string, @Nullable String string2, @NotNull C c) {
        return this.CP_h(string, c);
    }

    @Override
    @NotNull
    protected Component CP_A(@NotNull CP_rS ilIlrS, @NotNull C c) {
        CP_ou ilIlou = this.CP_W(c, Component.CP_x(), ilIlrS).CP_a(ilIlrS.CP_x());
        return this.CP_c(ilIlrS, ilIlou, c);
    }

    @Override
    @NotNull
    protected Component CP_R(@NotNull CP_hF ilIlhF, @NotNull C c) {
        CP_dn ilIldn = this.CP_W(c, Component.CP_M(), ilIlhF).CP_f(ilIlhF.CP_UnderScore());
        return this.CP_c(ilIlhF, ilIldn, c);
    }

    @Override
    @NotNull
    protected Component CP_Z(@NotNull CP_nf ilIlnf, @NotNull C c) {
        CP_L1 ilIlL1 = this.CP_W(c, Component.CP_Z(), ilIlnf).CP_f(ilIlnf.CP_k());
        return this.CP_c(ilIlnf, ilIlL1, c);
    }

    protected <O extends CP_XM<O, B>, B extends CP_x6<O, B>> B CP_W(@NotNull C c, B b, O o) {
        long l = TranslatableComponentRenderer.b ^ 0x7CD4412D69DDL;
        b.CP_l(o.CP_v()).CP_n(o.CP_w());
        Component component = o.CP_H();
        if (component != null) {
            b.CP_q(this.render(component, c));
        }
        return b;
    }

    @Override
    @NotNull
    protected Component CP_f(@NotNull CP_qt ilIlqt, @NotNull C c) {
        CP_fU ilIlfU = Component.CP_G().CP_S(ilIlqt.CP_G());
        return this.CP_c(ilIlqt, ilIlfU, c);
    }

    @Override
    @NotNull
    protected Component CP_q(@NotNull CP_up ilIlup, @NotNull C c) {
        long l = b ^ 0x32533FF91721L;
        CP_L_ ilIlL_ = Component.CP_H().CP_c(ilIlup.CP_d()).CP_l(ilIlup.CP_Z()).CP_b(ilIlup.CP_O());
        String[] stringArray = CP_jM.CP_g();
        Object o = this.CP_c(ilIlup, ilIlL_, c);
        if (stringArray == null) {
            PacketWrapper.CP_e(new int[2]);
        }
        return o;
    }

    @Override
    @NotNull
    protected Component CP_Q(@NotNull CP_yn ilIlyn, @NotNull C c) {
        CP_u8 ilIlu8 = Component.CP_p().CP_Z(ilIlyn.CP_M());
        return this.CP_c(ilIlyn, ilIlu8, c);
    }

    @Override
    @NotNull
    protected Component CP_U(@NotNull TextComponent textComponent, @NotNull C c) {
        CP_oE ilIloE = Component.CP_B().CP_d(textComponent.CP_F());
        return this.CP_c(textComponent, ilIloE, c);
    }

    @Override
    @NotNull
    protected Component CP_P(@NotNull TranslatableComponent translatableComponent, @NotNull C c) {
        block10: {
            CP_iK ilIliK;
            block7: {
                String[] stringArray;
                List<CP_c> list;
                block9: {
                    boolean bl;
                    block8: {
                        long l = b ^ 0x1AD577D9D953L;
                        list = translatableComponent.CP_r();
                        List<Component> list2 = translatableComponent.children();
                        stringArray = CP_jM.CP_g();
                        bl = list.isEmpty();
                        if (stringArray == null) break block8;
                        if (!bl) break block9;
                        bl = list2.isEmpty();
                    }
                    if (bl) break block10;
                }
                ilIliK = (CP_iK)translatableComponent.CP_z();
                if (!list.isEmpty()) {
                    ArrayList<CP_c> arrayList = new ArrayList<CP_c>(list);
                    int n = 0;
                    while (n < arrayList.size()) {
                        CP_c ilIlc = (CP_c)arrayList.get(n);
                        if (stringArray != null) {
                            if (stringArray != null) {
                                if (ilIlc.CP_x() instanceof Component) {
                                    Object object = ilIlc.CP_x();
                                    if (stringArray != null && !(object instanceof CP_O5)) {
                                        object = arrayList.set(n, CP_c.CP_w(this.render((Component)ilIlc.CP_x(), c)));
                                    }
                                }
                                ++n;
                            }
                            if (stringArray != null) continue;
                        }
                        break block7;
                    }
                    ilIliK.CP_u(arrayList);
                }
            }
            translatableComponent = (TranslatableComponent)ilIliK.CP_X();
        }
        return this.CP_l(translatableComponent, c);
    }

    @NotNull
    protected Component CP_l(@NotNull TranslatableComponent translatableComponent, @NotNull C c) {
        long l = b ^ 0x1CF0D143A20FL;
        MessageFormat messageFormat = this.CP_C(translatableComponent.key(), translatableComponent.CP_k(), c);
        String[] stringArray = CP_jM.CP_g();
        if (messageFormat == null) {
            return this.CP_e(translatableComponent, c);
        }
        List<CP_c> list = translatableComponent.CP_r();
        CP_oE ilIloE = Component.CP_B();
        this.CP_o(translatableComponent, ilIloE, c);
        int n = list.isEmpty();
        if (stringArray != null) {
            if (n != 0) {
                ilIloE.CP_d(messageFormat.format(null, new StringBuffer(), null).toString());
                return this.CP_f(translatableComponent.children(), ilIloE, c);
            }
            n = list.size();
        }
        Object[] objectArray = new Object[n];
        StringBuffer stringBuffer = messageFormat.format(objectArray, new StringBuffer(), (FieldPosition)null);
        AttributedCharacterIterator attributedCharacterIterator = messageFormat.formatToCharacterIterator(objectArray);
        while (attributedCharacterIterator.getIndex() < attributedCharacterIterator.getEndIndex()) {
            int n2;
            block9: {
                block8: {
                    Object object;
                    block7: {
                        n2 = attributedCharacterIterator.getRunLimit();
                        Integer n3 = (Integer)attributedCharacterIterator.getAttribute(MessageFormat.Field.ARGUMENT);
                        object = n3;
                        if (stringArray == null) break block7;
                        if (object == null) break block8;
                        object = list.get(n3);
                    }
                    CP_c ilIlc = (CP_c)object;
                    ilIloE.CP_t(ilIlc.asComponent());
                    if (stringArray != null) break block9;
                }
                ilIloE.CP_t(Component.text(stringBuffer.substring(attributedCharacterIterator.getIndex(), n2)));
            }
            attributedCharacterIterator.setIndex(n2);
            if (stringArray != null) continue;
        }
        return this.CP_f(translatableComponent.children(), ilIloE, c);
    }

    protected Component CP_e(Component component2, C c) {
        List<Component> list;
        long l = b ^ 0x2C5DDFFBC860L;
        CP_h_<?> ilIlh_ = component2.CP_B();
        if (ilIlh_ != null) {
            component2 = component2.CP_j(ilIlh_.CP_y(this, c));
        }
        if ((list = component2.children()).isEmpty()) {
            return component2;
        }
        ArrayList arrayList = new ArrayList(list.size());
        list.forEach(component -> arrayList.add(this.render((Component)component, c)));
        return component2.CP_w(arrayList);
    }

    protected <O extends CP_ZR<O, B>, B extends CP_R<O, B>> O CP_c(Component component, B b, C c) {
        this.CP_o(component, b, c);
        return this.CP_f(component.children(), b, c);
    }

    protected <O extends CP_ZR<O, B>, B extends CP_R<O, B>> O CP_f(List<Component> list, B b, C c) {
        block3: {
            List<Component> list2;
            block2: {
                long l = TranslatableComponentRenderer.b ^ 0x63F638C42440L;
                String[] stringArray = CP_jM.CP_g();
                list2 = list;
                if (stringArray == null) break block2;
                if (list2.isEmpty()) break block3;
                list2 = list;
            }
            list2.forEach(component -> b.CP_t(this.render((Component)component, c)));
        }
        return b.CP_X();
    }

    protected <B extends CP_R<?, ?>> void CP_o(Component component, B b, C c) {
        long l = TranslatableComponentRenderer.b ^ 0x3C5784B96E25L;
        b.CP_K(component, CP_f);
        b.CP_U(component.CP_o());
        CP_h_<?> ilIlh_ = component.CP_B();
        String[] stringArray = CP_jM.CP_g();
        if (ilIlh_ != null) {
            b.CP_Y(ilIlh_.CP_y(this, c));
        }
        if (PacketWrapper.CP_z() == null) {
            CP_jM.CP_L(new String[5]);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = CP_s.a(-4394756440348881078L, 14396315585317232L, MethodHandles.lookup().lookupClass()).a(278323868208444L);
        long l = b ^ 0x1884BB605DC4L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("~d\u00f8\u00c1\u00bcXB\u00d9".getBytes("ISO-8859-1"));
                d = TranslatableComponentRenderer.a(byArray3).intern();
                EnumSet<CP_Az> enumSet = EnumSet.allOf(CP_Az.class);
                enumSet.remove((Object)CP_Az.EVENTS);
                CP_f = Collections.unmodifiableSet(enumSet);
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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

