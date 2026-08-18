/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.title;

import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.kyori.adventure.title.Title;

@ApiStatus.NonExtendable
public interface TitlePart<T> {
    public static final TitlePart<Component> TITLE = new TitlePart<Component>(){
        private static transient /* synthetic */ String AVVFBnNZbY = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

        public String toString() {
            return "TitlePart.TITLE";
        }
    };
    public static final TitlePart<Component> SUBTITLE = new TitlePart<Component>(){
        private static transient /* synthetic */ String gusvTgOTCp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

        public String toString() {
            return "TitlePart.SUBTITLE";
        }
    };
    public static final TitlePart<Title.Times> TIMES = new TitlePart<Title.Times>(){
        private static transient /* synthetic */ String uRTXJjyheb = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

        public String toString() {
            return "TitlePart.TIMES";
        }
    };
}

