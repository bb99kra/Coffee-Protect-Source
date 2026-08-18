/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.internal.properties;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.Properties;
import java.util.function.Function;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import me.nik.coffeeprotect.libs.jetbrains.annotations.VisibleForTesting;
import me.nik.coffeeprotect.libs.kyori.adventure.internal.properties.AdventureProperties;
import me.nik.coffeeprotect.libs.kyori.adventure.util.Services;

final class AdventurePropertiesImpl {
    private static final String FILESYSTEM_DIRECTORY_NAME = "config";
    private static final String FILESYSTEM_FILE_NAME = "adventure.properties";
    private static final Properties PROPERTIES = new Properties();
    private static transient /* synthetic */ String ARLMshFoHa = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private static void print(Throwable throwable) {
        throwable.printStackTrace();
    }

    private AdventurePropertiesImpl() {
    }

    @VisibleForTesting
    @NotNull
    static String systemPropertyName(String string) {
        return String.join((CharSequence)".", "net", "kyori", "adventure", string);
    }

    static <T>  @NotNull AdventureProperties.Property<T> property(@NotNull String string, @NotNull Function<String, T> function, @Nullable T t, boolean bl) {
        return new PropertyImpl<T>(string, function, t, bl);
    }

    static {
        Path path = Optional.ofNullable(System.getProperty(AdventurePropertiesImpl.systemPropertyName(FILESYSTEM_DIRECTORY_NAME))).map(string -> Paths.get(string, new String[0])).orElseGet(() -> Paths.get(FILESYSTEM_DIRECTORY_NAME, FILESYSTEM_FILE_NAME));
        if (Files.isRegularFile(path, new LinkOption[0])) {
            try (InputStream inputStream = Files.newInputStream(path, new OpenOption[0]);){
                PROPERTIES.load(inputStream);
            }
            catch (IOException iOException) {
                AdventurePropertiesImpl.print(iOException);
            }
        }
    }

    private static final class PropertyImpl<T>
    implements AdventureProperties.Property<T> {
        private final String name;
        private final Function<String, T> parser;
        @Nullable
        private final T defaultValue;
        private final boolean allowProviderDefaultOverride;
        private boolean valueCalculated;
        @Nullable
        private T value;
        private static transient /* synthetic */ String cfffGcKVrY = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

        PropertyImpl(@NotNull String string, @NotNull Function<String, T> function, @Nullable T t, boolean bl) {
            this.name = string;
            this.parser = function;
            this.defaultValue = t;
            this.allowProviderDefaultOverride = bl;
        }

        @Override
        @Nullable
        public T value() {
            if (!this.valueCalculated) {
                String string = AdventurePropertiesImpl.systemPropertyName(this.name);
                String string2 = System.getProperty(string, PROPERTIES.getProperty(this.name));
                if (string2 != null) {
                    this.value = this.parser.apply(string2);
                }
                if (this.value == null) {
                    this.value = this.allowProviderDefaultOverride ? Providers.DEFAULT_PROVIDER.map(defaultOverrideProvider -> defaultOverrideProvider.overrideDefault(this, this.defaultValue)).orElse(this.defaultValue) : this.defaultValue;
                }
                this.valueCalculated = true;
            }
            return this.value;
        }

        public boolean equals(@Nullable Object object) {
            return this == object;
        }

        public int hashCode() {
            return this.name.hashCode();
        }
    }

    static final class Providers {
        @NotNull
        static final Optional<AdventureProperties.DefaultOverrideProvider> DEFAULT_PROVIDER = Services.service(AdventureProperties.DefaultOverrideProvider.class);
        private static transient /* synthetic */ String nXnwWjiyfV = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

        Providers() {
        }
    }
}

