/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.examination;

import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import me.nik.coffeeprotect.libs.kyori.examination.Examiner;

public abstract class ExaminableProperty {
    private ExaminableProperty() {
    }

    @NotNull
    public abstract String name();

    @NotNull
    public abstract <R> R examine(@NotNull Examiner<? extends R> var1);

    public String toString() {
        return "ExaminableProperty{" + this.name() + "}";
    }

    @NotNull
    public static ExaminableProperty of(final @NotNull String string, final @Nullable Object object) {
        return new ExaminableProperty(){
            private static transient /* synthetic */ String GiPzdXKzsz = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public String name() {
                return string;
            }

            @Override
            @NotNull
            public <R> R examine(@NotNull Examiner<? extends R> examiner) {
                return examiner.examine(object);
            }
        };
    }

    @NotNull
    public static ExaminableProperty of(final @NotNull String string, final @Nullable String string2) {
        return new ExaminableProperty(){
            private static transient /* synthetic */ String UvFGdpgGVR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public String name() {
                return string;
            }

            @Override
            @NotNull
            public <R> R examine(@NotNull Examiner<? extends R> examiner) {
                return examiner.examine(string2);
            }
        };
    }

    @NotNull
    public static ExaminableProperty of(final @NotNull String string, final boolean bl) {
        return new ExaminableProperty(){
            private static transient /* synthetic */ String RTpkRqVWux = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public String name() {
                return string;
            }

            @Override
            @NotNull
            public <R> R examine(@NotNull Examiner<? extends R> examiner) {
                return examiner.examine(bl);
            }
        };
    }

    @NotNull
    public static ExaminableProperty of(final @NotNull String string, final boolean[] blArray) {
        return new ExaminableProperty(){
            private static transient /* synthetic */ String XurZSXHEMD = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public String name() {
                return string;
            }

            @Override
            @NotNull
            public <R> R examine(@NotNull Examiner<? extends R> examiner) {
                return examiner.examine(blArray);
            }
        };
    }

    @NotNull
    public static ExaminableProperty of(final @NotNull String string, final byte by) {
        return new ExaminableProperty(){
            private static transient /* synthetic */ String CFmRCzmVTI = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public String name() {
                return string;
            }

            @Override
            @NotNull
            public <R> R examine(@NotNull Examiner<? extends R> examiner) {
                return examiner.examine(by);
            }
        };
    }

    @NotNull
    public static ExaminableProperty of(final @NotNull String string, final byte[] byArray) {
        return new ExaminableProperty(){
            private static transient /* synthetic */ String ofayqWwGHG = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public String name() {
                return string;
            }

            @Override
            @NotNull
            public <R> R examine(@NotNull Examiner<? extends R> examiner) {
                return examiner.examine(byArray);
            }
        };
    }

    @NotNull
    public static ExaminableProperty of(final @NotNull String string, final char c) {
        return new ExaminableProperty(){
            private static transient /* synthetic */ String LKawXtiRRj = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public String name() {
                return string;
            }

            @Override
            @NotNull
            public <R> R examine(@NotNull Examiner<? extends R> examiner) {
                return examiner.examine(c);
            }
        };
    }

    @NotNull
    public static ExaminableProperty of(final @NotNull String string, final char[] cArray) {
        return new ExaminableProperty(){
            private static transient /* synthetic */ String xWAhEAHdgR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public String name() {
                return string;
            }

            @Override
            @NotNull
            public <R> R examine(@NotNull Examiner<? extends R> examiner) {
                return examiner.examine(cArray);
            }
        };
    }

    @NotNull
    public static ExaminableProperty of(final @NotNull String string, final double d) {
        return new ExaminableProperty(){
            private static transient /* synthetic */ String xwDtryRDiC = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public String name() {
                return string;
            }

            @Override
            @NotNull
            public <R> R examine(@NotNull Examiner<? extends R> examiner) {
                return examiner.examine(d);
            }
        };
    }

    @NotNull
    public static ExaminableProperty of(final @NotNull String string, final double[] dArray) {
        return new ExaminableProperty(){
            private static transient /* synthetic */ String qymPnGKmLT = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public String name() {
                return string;
            }

            @Override
            @NotNull
            public <R> R examine(@NotNull Examiner<? extends R> examiner) {
                return examiner.examine(dArray);
            }
        };
    }

    @NotNull
    public static ExaminableProperty of(final @NotNull String string, final float f) {
        return new ExaminableProperty(){
            private static transient /* synthetic */ String hprJDaQpfE = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public String name() {
                return string;
            }

            @Override
            @NotNull
            public <R> R examine(@NotNull Examiner<? extends R> examiner) {
                return examiner.examine(f);
            }
        };
    }

    @NotNull
    public static ExaminableProperty of(final @NotNull String string, final float[] fArray) {
        return new ExaminableProperty(){
            private static transient /* synthetic */ String qxDVMCidNt = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public String name() {
                return string;
            }

            @Override
            @NotNull
            public <R> R examine(@NotNull Examiner<? extends R> examiner) {
                return examiner.examine(fArray);
            }
        };
    }

    @NotNull
    public static ExaminableProperty of(final @NotNull String string, final int n) {
        return new ExaminableProperty(){
            private static transient /* synthetic */ String vVBkOvxCer = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public String name() {
                return string;
            }

            @Override
            @NotNull
            public <R> R examine(@NotNull Examiner<? extends R> examiner) {
                return examiner.examine(n);
            }
        };
    }

    @NotNull
    public static ExaminableProperty of(final @NotNull String string, final int[] nArray) {
        return new ExaminableProperty(){
            private static transient /* synthetic */ String LQSBYjuEKN = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public String name() {
                return string;
            }

            @Override
            @NotNull
            public <R> R examine(@NotNull Examiner<? extends R> examiner) {
                return examiner.examine(nArray);
            }
        };
    }

    @NotNull
    public static ExaminableProperty of(final @NotNull String string, final long l) {
        return new ExaminableProperty(){
            private static transient /* synthetic */ String bfnSjuqQRX = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public String name() {
                return string;
            }

            @Override
            @NotNull
            public <R> R examine(@NotNull Examiner<? extends R> examiner) {
                return examiner.examine(l);
            }
        };
    }

    @NotNull
    public static ExaminableProperty of(final @NotNull String string, final long[] lArray) {
        return new ExaminableProperty(){
            private static transient /* synthetic */ String rirEQDPvLo = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public String name() {
                return string;
            }

            @Override
            @NotNull
            public <R> R examine(@NotNull Examiner<? extends R> examiner) {
                return examiner.examine(lArray);
            }
        };
    }

    @NotNull
    public static ExaminableProperty of(final @NotNull String string, final short s) {
        return new ExaminableProperty(){
            private static transient /* synthetic */ String RNRduaAFGV = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public String name() {
                return string;
            }

            @Override
            @NotNull
            public <R> R examine(@NotNull Examiner<? extends R> examiner) {
                return examiner.examine(s);
            }
        };
    }

    @NotNull
    public static ExaminableProperty of(final @NotNull String string, final short[] sArray) {
        return new ExaminableProperty(){
            private static transient /* synthetic */ String rzOAFgAvGx = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public String name() {
                return string;
            }

            @Override
            @NotNull
            public <R> R examine(@NotNull Examiner<? extends R> examiner) {
                return examiner.examine(sArray);
            }
        };
    }
}

