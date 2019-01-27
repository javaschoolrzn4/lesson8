package com.javarzn.annotation.base;

import com.javarzn.annotation.runtime.FruitUseAll;

/**
 * Пример использования аннотации.
 * <br/>
 * {@link Fruit <<< Назад (пример №1)} | Пример №2 | {@link FruitUseAll Далее (пример №3) >>>}
 *
 * @author Konstantin
 */
public class FruitUse {
    @Fruit(color = "Апельсин", count = 10)
    public static void getFruitsCount() {
        System.out.println("Программа выполнилась успешно");
    }

    public static void main(String[] args) {
        getFruitsCount();
    }
}
