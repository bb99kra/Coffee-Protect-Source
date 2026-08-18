/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.nbt;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class IOStreamUtil {
    private static transient /* synthetic */ String HDFDPKhnhN = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private IOStreamUtil() {
    }

    static InputStream closeShield(final InputStream inputStream) {
        return new InputStream(){
            private static transient /* synthetic */ String OKTmStxvSf = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            public int read() throws IOException {
                return inputStream.read();
            }

            @Override
            public int read(byte[] byArray) throws IOException {
                return inputStream.read(byArray);
            }

            @Override
            public int read(byte[] byArray, int n, int n2) throws IOException {
                return inputStream.read(byArray, n, n2);
            }
        };
    }

    static OutputStream closeShield(final OutputStream outputStream) {
        return new OutputStream(){
            private static transient /* synthetic */ String TnZOnAVvYY = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            public void write(int n) throws IOException {
                outputStream.write(n);
            }

            @Override
            public void write(byte[] byArray) throws IOException {
                outputStream.write(byArray);
            }

            @Override
            public void write(byte[] byArray, int n, int n2) throws IOException {
                outputStream.write(byArray, n, n2);
            }
        };
    }
}

