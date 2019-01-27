package com.javarzn.annotation.base.retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Пример аннотации с правилом удержания RetentionPolicy.SOURCE.
 *
 * @author Konstantin
 */
@Retention(RetentionPolicy.SOURCE)
public @interface FruitSource {
    String color();

    int count();
}