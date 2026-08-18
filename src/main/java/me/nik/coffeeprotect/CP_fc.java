/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.boss.BarColor
 *  org.bukkit.boss.BarFlag
 *  org.bukkit.boss.BarStyle
 *  org.bukkit.boss.BossBar
 *  org.bukkit.entity.Player
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.CP_fj;
import me.nik.coffeeprotect.CP_qi;
import me.nik.coffeeprotect.CP_rW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

public class CP_fc
implements CP_fj {
    private String CP_k;
    private float CP_R = 1.0f;
    private BarColor CP_q = BarColor.PURPLE;
    private Player CP_e;
    private BarStyle CP_K = BarStyle.SOLID;
    private BossBar CP_H;
    private static final long a = CP_s.a(8620838520310818641L, -2494140331785678939L, MethodHandles.lookup().lookupClass()).a(188391426772706L);
    private static transient /* synthetic */ String HJOgtlDfHA = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Override
    public void CP_q(String string) {
        this.CP_k = string;
    }

    @Override
    public void CP_e(float f) {
        this.CP_R = f;
    }

    @Override
    public void CP_a(BarColor barColor) {
        this.CP_q = barColor;
    }

    @Override
    public void CP_y(Player player) {
        this.CP_e = player;
    }

    @Override
    public void CP_g(BarStyle barStyle) {
        this.CP_K = barStyle;
    }

    @Override
    public void CP_r() {
        this.CP_H = Bukkit.createBossBar((String)CP_rW.CP_W(this.CP_k), (BarColor)this.CP_q, (BarStyle)this.CP_K, (BarFlag[])new BarFlag[0]);
        this.CP_H.setProgress((double)this.CP_R);
        this.CP_H.addPlayer(this.CP_e);
        this.CP_H.setVisible(true);
    }

    @Override
    public void CP_E() {
        long l = a ^ 0x3A5A38B0BA0BL;
        int[] nArray = CP_qi.CP_W();
        BossBar bossBar = this.CP_H;
        if (nArray == null) {
            if (bossBar == null) {
                return;
            }
            this.CP_H.removeAll();
            bossBar = this.CP_H;
        }
        bossBar.setVisible(false);
        this.CP_H = null;
    }
}
