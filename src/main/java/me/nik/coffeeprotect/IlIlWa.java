/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlvn;

public abstract class IlIlWa {
    protected static final long IlIlC = TimeUnit.DAYS.toMillis(IlIlOq.LOGS_CLEAR_DAYS.IlIlj());
    protected final CoffeeProtect IlIlK;

    public IlIlWa(CoffeeProtect coffeeProtect) {
        this.IlIlK = coffeeProtect;
    }

    public abstract void IlIlE();

    public abstract void IlIlk();

    public abstract void IlIly(Collection<IlIlvn> var1);

    public abstract void IlIlE(IlIlvn var1);

    public abstract List<IlIlvn> IlIlz();

    public abstract List<IlIlvn> IlIlV(String var1);
}

