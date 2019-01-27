package com.javarzn.annotation.runtime;

import com.javarzn.annotation.Todo;
import com.javarzn.annotation.base.FruitUse;
import com.javarzn.annotation.base.retention.FruitClass;
import com.javarzn.annotation.base.retention.FruitSource;
import com.javarzn.annotation.base.retention.FruitRuntime;

/**
 * Пример использования аннотаций с различными правилами удержания.
 * <br/>
 * {@link FruitUse <<< Назад (пример №2)} | Пример №3 | {@link FruitUseFirst Далее (пример №4) >>>}
 *
 * @author Konstantin
 */
//@Todo
public class FruitUseAll {
    @FruitSource(color = "Зелёный", count = 1)
    @FruitClass(color = "Синий", count = 2)
    @FruitRuntime(color = "Красный", count = 3)
    public static void getFruitsCount() {
        System.out.println("Программа выполнилась успешно");
    }

    public static void main(String[] args) {
        getFruitsCount();
    }
}
