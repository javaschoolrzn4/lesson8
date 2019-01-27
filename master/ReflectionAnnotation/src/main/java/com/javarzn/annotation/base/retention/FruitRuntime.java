package com.javarzn.annotation.base.retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Пример аннотации с правилом удержания RetentionPolicy.RUNTIME.
 *
 * @author Konstantin
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitRuntime {
    String color();

    int count();
}