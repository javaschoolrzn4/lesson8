package com.javarzn.annotation.runtime;

import com.javarzn.annotation.base.retention.FruitRuntime;

/**
 * Пример использования аннотации.
 * <br/>
 * {@link FruitUseAll <<< Назад (пример №3)} | Пример №4 | {@link FruitUseSecond Далее (пример №5) >>>}
 *
 * @author Konstantin
 */
public class FruitUseFirst {
    @FruitRuntime(color = "Апельсин", count = 10)
    public static void getFruitsCount() {
        System.out.println("Программа выполнилась успешно");
    }

    public static void main(String[] args) {
        getFruitsCount();
    }
}
