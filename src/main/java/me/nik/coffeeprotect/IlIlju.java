/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 *  org.bukkit.command.CommandSender
 */
package me.nik.coffeeprotect;

import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.command.CommandSender;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class IlIlju {
    private static PacketWrapper[] IlIlQ;

    protected abstract String IlIlC();

    protected abstract String IlIlV();

    protected abstract String IlIld();

    protected abstract String IlIla();

    protected abstract int IlIlX();

    protected abstract boolean IlIlr();

    protected abstract void IlIlM(CommandSender var1, String[] var2);

    protected abstract List<String> IlIlb(CommandSender var1, String[] var2);

    public static void IlIly(PacketWrapper[] packetWrapperArray) {
        IlIlQ = packetWrapperArray;
    }

    public static PacketWrapper[] IlIlC() {
        return IlIlQ;
    }

    static {
        if (IlIlju.IlIlC() != null) {
            IlIlju.IlIly(new PacketWrapper[4]);
        }
    }
}

