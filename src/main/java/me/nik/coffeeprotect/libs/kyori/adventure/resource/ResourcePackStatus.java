/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.resource;

public enum ResourcePackStatus {
    ACCEPTED(true),
    DECLINED(false),
    INVALID_URL(false),
    FAILED_DOWNLOAD(false),
    DOWNLOADED(true),
    FAILED_RELOAD(false),
    DISCARDED(false),
    SUCCESSFULLY_LOADED(false);

    private final boolean intermediate;

    private ResourcePackStatus(boolean bl) {
        this.intermediate = bl;
    }

    public boolean intermediate() {
        return this.intermediate;
    }
}

