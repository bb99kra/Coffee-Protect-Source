/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.CommandSender
 */
package me.nik.coffeeprotect;

import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.command.CommandSender;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class CP_ju {
    private static PacketWrapper[] CP_Q;

    protected abstract String CP_C();

    protected abstract String CP_V();

    protected abstract String CP_d();

    protected abstract String CP_a();

    protected abstract int CP_X();

    protected abstract boolean CP_r();

    protected abstract void CP_M(CommandSender var1, String[] var2);

    protected abstract List<String> CP_b(CommandSender var1, String[] var2);

    public static void CP_y(PacketWrapper[] packetWrapperArray) {
        CP_Q = packetWrapperArray;
    }

    public static PacketWrapper[] CP_C() {
        return CP_Q;
    }

    static {
        if (CP_ju.CP_C() != null) {
            CP_ju.CP_y(new PacketWrapper[4]);
        }
    }
}
