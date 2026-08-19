/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.checks;

public enum CheckType {
    BOOK("Book", "Checks for oversized pages, translation crashes, and malicious JSON tags"),
    SIGN("Sign", "Checks for malicious sign clickEvents and oversized lines"),
    CREATIVE_SLOT("CreativeSlot", "Checks for hacked item NBT, illegal enchantments, and invalid skull URLs"),
    CUSTOM_PAYLOAD("CustomPayload", "Checks for channel flood, oversized buffers, and payload crashes"),
    WINDOW_CLICK("WindowClick", "Checks for impossible slot clicks, quick craft exploits, and click spam"),
    MOVEMENT("Movement", "Checks for NaN / Infinite coordinates and crash teleports"),
    REDSTONE("Redstone", "Checks for high-frequency redstone clocks and chunk lag machines");

    private final String name;
    private final String description;

    private CheckType(String string2, String string3) {
        this.name = string2;
        this.description = string3;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
}

