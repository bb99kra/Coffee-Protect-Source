/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.translation;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import me.nik.coffeeprotect.libs.kyori.adventure.internal.Internals;
import me.nik.coffeeprotect.libs.kyori.adventure.key.Key;
import me.nik.coffeeprotect.libs.kyori.adventure.translation.TranslationLocales;
import me.nik.coffeeprotect.libs.kyori.adventure.translation.TranslationStore;
import me.nik.coffeeprotect.libs.kyori.adventure.util.TriState;
import me.nik.coffeeprotect.libs.kyori.examination.Examinable;
import me.nik.coffeeprotect.libs.kyori.examination.ExaminableProperty;

public abstract class AbstractTranslationStore<T>
implements Examinable,
TranslationStore<T> {
    @NotNull
    private final Key name;
    private final Map<String, Translation> translations = new ConcurrentHashMap<String, Translation>();
    @NotNull
    private volatile Locale defaultLocale = Locale.US;

    protected AbstractTranslationStore(@NotNull Key key) {
        this.name = Objects.requireNonNull(key, "name");
    }

    @Nullable
    protected T translationValue(@NotNull String string, @NotNull Locale locale) {
        Translation translation = this.translations.get(Objects.requireNonNull(string, "key"));
        if (translation == null) {
            return null;
        }
        return (T)translation.translate(Objects.requireNonNull(locale, "locale"));
    }

    @Override
    public final boolean contains(@NotNull String string) {
        return this.translations.containsKey(string);
    }

    @Override
    public final boolean contains(@NotNull String string, @NotNull Locale locale) {
        Translation translation = this.translations.get(Objects.requireNonNull(string, "key"));
        if (translation == null) {
            return false;
        }
        return translation.translations.get(Objects.requireNonNull(locale, "locale")) != null;
    }

    @Override
    public final boolean canTranslate(@NotNull String string, @NotNull Locale locale) {
        Translation translation = this.translations.get(Objects.requireNonNull(string, "key"));
        if (translation == null) {
            return false;
        }
        return translation.translate(Objects.requireNonNull(locale, "locale")) != null;
    }

    @Override
    public final void defaultLocale(@NotNull Locale locale) {
        this.defaultLocale = Objects.requireNonNull(locale, "locale");
    }

    @Override
    public final void register(@NotNull String string2, @NotNull Locale locale, @NotNull T t) {
        this.translations.computeIfAbsent(string2, string -> new Translation((String)string)).register(locale, t);
    }

    @Override
    public final void registerAll(@NotNull Locale locale, @NotNull Map<String, T> map) {
        this.registerAll(locale, map.keySet(), map::get);
    }

    @Override
    public final void registerAll(@NotNull Locale locale, @NotNull Set<String> set, Function<String, T> function) {
        IllegalArgumentException illegalArgumentException = null;
        int n = 0;
        for (String string : set) {
            try {
                this.register(string, locale, function.apply(string));
            }
            catch (IllegalArgumentException illegalArgumentException2) {
                if (illegalArgumentException == null) {
                    illegalArgumentException = illegalArgumentException2;
                }
                ++n;
            }
        }
        if (illegalArgumentException != null) {
            if (n == 1) {
                throw illegalArgumentException;
            }
            if (n > 1) {
                throw new IllegalArgumentException(String.format("Invalid key (and %d more)", n - 1), illegalArgumentException);
            }
        }
    }

    @Override
    public final void unregister(@NotNull String string) {
        this.translations.remove(string);
    }

    @Override
    @NotNull
    public final Key name() {
        return this.name;
    }

    @Override
    @NotNull
    public final TriState hasAnyTranslations() {
        return TriState.byBoolean(!this.translations.isEmpty());
    }

    @Override
    @NotNull
    public final Stream<? extends ExaminableProperty> examinableProperties() {
        return Stream.of(ExaminableProperty.of("translations", this.translations));
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof AbstractTranslationStore)) {
            return false;
        }
        AbstractTranslationStore abstractTranslationStore = (AbstractTranslationStore)object;
        return this.name.equals(abstractTranslationStore.name);
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    @NotNull
    public final String toString() {
        return Internals.toString(this);
    }

    private final class Translation
    implements Examinable {
        private final String key;
        private final Map<Locale, T> translations;
        private static transient /* synthetic */ String AVxjeVDltO = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

        private Translation(String string) {
            this.key = Objects.requireNonNull(string, "key");
            this.translations = new ConcurrentHashMap();
        }

        @Nullable
        private T translate(@NotNull Locale locale) {
            Object t = this.translations.get(Objects.requireNonNull(locale, "locale"));
            if (t == null && (t = this.translations.get(new Locale(locale.getLanguage()))) == null && (t = this.translations.get(AbstractTranslationStore.this.defaultLocale)) == null) {
                t = this.translations.get(TranslationLocales.global());
            }
            return t;
        }

        private void register(@NotNull Locale locale, @NotNull T t) {
            if (this.translations.putIfAbsent(Objects.requireNonNull(locale, "locale"), Objects.requireNonNull(t, "translation")) != null) {
                throw new IllegalArgumentException(String.format("Translation already exists: %s for %s", this.key, locale));
            }
        }

        @Override
        @NotNull
        public Stream<? extends ExaminableProperty> examinableProperties() {
            return Stream.of(ExaminableProperty.of("key", this.key), ExaminableProperty.of("translations", this.translations));
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Translation)) {
                return false;
            }
            Translation translation = (Translation)object;
            return this.key.equals(translation.key) && this.translations.equals(translation.translations);
        }

        public int hashCode() {
            return Objects.hash(this.key, this.translations);
        }

        public String toString() {
            return Internals.toString(this);
        }
    }

    public static abstract class StringBased<T>
    extends AbstractTranslationStore<T>
    implements TranslationStore.StringBased<T> {
        private static final Pattern SINGLE_QUOTE_PATTERN = Pattern.compile("'");

        protected StringBased(@NotNull Key key) {
            super(key);
        }

        @NotNull
        protected abstract T parse(@NotNull String var1, @NotNull Locale var2);

        @Override
        public final void registerAll(@NotNull Locale locale, @NotNull Path path, boolean bl) {
            try (BufferedReader bufferedReader = Files.newBufferedReader(path, StandardCharsets.UTF_8);){
                this.registerAll(locale, new PropertyResourceBundle(bufferedReader), bl);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }

        @Override
        public final void registerAll(@NotNull Locale locale, @NotNull ResourceBundle resourceBundle, boolean bl) {
            this.registerAll(locale, resourceBundle.keySet(), string -> {
                String string2 = resourceBundle.getString((String)string);
                return this.parse(bl ? SINGLE_QUOTE_PATTERN.matcher(string2).replaceAll("''") : string2, locale);
            });
        }
    }
}

