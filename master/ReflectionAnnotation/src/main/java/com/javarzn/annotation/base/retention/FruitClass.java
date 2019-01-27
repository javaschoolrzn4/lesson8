package com.javarzn.annotation.base.retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Пример аннотации с правилом удержания RetentionPolicy.CLASS.
 *
 * @author Konstantin
 */
@Retention(RetentionPolicy.CLASS)
public @interface FruitClass {
    String color();

    int count();
}