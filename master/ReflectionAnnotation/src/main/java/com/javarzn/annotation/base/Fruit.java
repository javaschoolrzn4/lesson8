package com.javarzn.annotation.base;

/**
 * Пример аннотации, присутствуют два поля.
 * <br/>
 * Пример №1 | {@link FruitUse Далее (пример №2) >>>}
 *
 * @author Konstantin
 */
public @interface Fruit {
    String color();

    int count();
}