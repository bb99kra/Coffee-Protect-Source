/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.jetbrains.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NonNls;

@Documented
@Retention(value=RetentionPolicy.CLASS)
@Target(value={ElementType.TYPE_USE})
public @interface UnknownNullability {
    @NonNls
    public String value() default "";
}

