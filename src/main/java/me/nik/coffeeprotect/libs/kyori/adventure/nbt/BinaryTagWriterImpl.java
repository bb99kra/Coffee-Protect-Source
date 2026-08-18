/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.nbt;

import java.io.BufferedOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.BinaryTagIO;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.BinaryTagTypes;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.CompoundBinaryTag;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.IOStreamUtil;

final class BinaryTagWriterImpl
implements BinaryTagIO.Writer {
    static final BinaryTagIO.Writer INSTANCE = new BinaryTagWriterImpl();
    private static transient /* synthetic */ String MnKVvvyGSV = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    BinaryTagWriterImpl() {
    }

    @Override
    public void write(@NotNull CompoundBinaryTag compoundBinaryTag, @NotNull Path path,  @NotNull BinaryTagIO.Compression compression) throws IOException {
        try (OutputStream outputStream = Files.newOutputStream(path, new OpenOption[0]);){
            this.write(compoundBinaryTag, outputStream, compression);
        }
    }

    @Override
    public void write(@NotNull CompoundBinaryTag compoundBinaryTag, @NotNull OutputStream outputStream,  @NotNull BinaryTagIO.Compression compression) throws IOException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(compression.compress(IOStreamUtil.closeShield(outputStream))));){
            this.write(compoundBinaryTag, dataOutputStream);
        }
    }

    @Override
    public void write(@NotNull CompoundBinaryTag compoundBinaryTag, @NotNull DataOutput dataOutput) throws IOException {
        this.write(compoundBinaryTag, dataOutput, true);
    }

    private void write(@NotNull CompoundBinaryTag compoundBinaryTag, @NotNull DataOutput dataOutput, boolean bl) throws IOException {
        dataOutput.writeByte(BinaryTagTypes.COMPOUND.id());
        if (bl) {
            dataOutput.writeUTF("");
        }
        BinaryTagTypes.COMPOUND.write(compoundBinaryTag, dataOutput);
    }

    @Override
    public void writeNameless(@NotNull CompoundBinaryTag compoundBinaryTag, @NotNull Path path,  @NotNull BinaryTagIO.Compression compression) throws IOException {
        try (OutputStream outputStream = Files.newOutputStream(path, new OpenOption[0]);){
            this.writeNameless(compoundBinaryTag, outputStream, compression);
        }
    }

    @Override
    public void writeNameless(@NotNull CompoundBinaryTag compoundBinaryTag, @NotNull OutputStream outputStream,  @NotNull BinaryTagIO.Compression compression) throws IOException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(compression.compress(IOStreamUtil.closeShield(outputStream))));){
            this.writeNameless(compoundBinaryTag, dataOutputStream);
        }
    }

    @Override
    public void writeNameless(@NotNull CompoundBinaryTag compoundBinaryTag, @NotNull DataOutput dataOutput) throws IOException {
        this.write(compoundBinaryTag, dataOutput, false);
    }

    @Override
    public void writeNamed( @NotNull Map.Entry<String, CompoundBinaryTag> entry, @NotNull Path path,  @NotNull BinaryTagIO.Compression compression) throws IOException {
        try (OutputStream outputStream = Files.newOutputStream(path, new OpenOption[0]);){
            this.writeNamed(entry, outputStream, compression);
        }
    }

    @Override
    public void writeNamed( @NotNull Map.Entry<String, CompoundBinaryTag> entry, @NotNull OutputStream outputStream,  @NotNull BinaryTagIO.Compression compression) throws IOException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(compression.compress(IOStreamUtil.closeShield(outputStream))));){
            this.writeNamed(entry, dataOutputStream);
        }
    }

    @Override
    public void writeNamed( @NotNull Map.Entry<String, CompoundBinaryTag> entry, @NotNull DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(BinaryTagTypes.COMPOUND.id());
        dataOutput.writeUTF(entry.getKey());
        BinaryTagTypes.COMPOUND.write(entry.getValue(), dataOutput);
    }
}

