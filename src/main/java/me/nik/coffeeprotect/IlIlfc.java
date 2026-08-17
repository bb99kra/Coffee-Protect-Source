/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  org.bukkit.Bukkit
 *  org.bukkit.boss.BarColor
 *  org.bukkit.boss.BarFlag
 *  org.bukkit.boss.BarStyle
 *  org.bukkit.boss.BossBar
 *  org.bukkit.entity.Player
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.IlIlfj;
import me.nik.coffeeprotect.IlIlqi;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

public class IlIlfc
implements IlIlfj {
    private String IlIlk;
    private float IlIlR = 1.0f;
    private BarColor IlIlq = BarColor.PURPLE;
    private Player IlIle;
    private BarStyle IlIlK = BarStyle.SOLID;
    private BossBar IlIlH;
    private static final long a = IlIls.a((long)8620838520310818641L, (long)-2494140331785678939L, MethodHandles.lookup().lookupClass()).a(188391426772706L);
    private static transient /* synthetic */ String HJOgtlDfHA = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Override
    public void IlIlq(String string) {
        this.IlIlk = string;
    }

    @Override
    public void IlIle(float f) {
        this.IlIlR = f;
    }

    @Override
    public void IlIla(BarColor barColor) {
        this.IlIlq = barColor;
    }

    @Override
    public void IlIly(Player player) {
        this.IlIle = player;
    }

    @Override
    public void IlIlg(BarStyle barStyle) {
        this.IlIlK = barStyle;
    }

    @Override
    public void IlIlr() {
        this.IlIlH = Bukkit.createBossBar((String)IlIlrW.IlIlW(this.IlIlk), (BarColor)this.IlIlq, (BarStyle)this.IlIlK, (BarFlag[])new BarFlag[0]);
        this.IlIlH.setProgress((double)this.IlIlR);
        this.IlIlH.addPlayer(this.IlIle);
        this.IlIlH.setVisible(true);
    }

    @Override
    public void IlIlE() {
        long l = a ^ 0x3A5A38B0BA0BL;
        int[] nArray = IlIlqi.IlIlW();
        BossBar bossBar = this.IlIlH;
        if (nArray == null) {
            if (bossBar == null) {
                return;
            }
            this.IlIlH.removeAll();
            bossBar = this.IlIlH;
        }
        bossBar.setVisible(false);
        this.IlIlH = null;
    }
}

