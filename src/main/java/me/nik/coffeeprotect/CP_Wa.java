/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.CP_vn;

public abstract class CP_Wa {
    protected static final long CP_C = TimeUnit.DAYS.toMillis(CP_Oq.LOGS_CLEAR_DAYS.CP_j());
    protected final CoffeeProtect CP_K;

    public CP_Wa(CoffeeProtect coffeeProtect) {
        this.CP_K = coffeeProtect;
    }

    public abstract void CP_E();

    public abstract void CP_k();

    public abstract void CP_y(Collection<CP_vn> var1);

    public abstract void CP_E(CP_vn var1);

    public abstract List<CP_vn> CP_z();

    public abstract List<CP_vn> CP_V(String var1);
}
