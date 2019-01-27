package com.javarzn.annotation.runtime;

import com.javarzn.annotation.base.Fruit;
import com.javarzn.annotation.base.retention.FruitRuntime;

import java.lang.reflect.Method;

/**
 * Пример использования аннотации.
 * <br/>
 * {@link FruitUseFirst <<< Назад (пример №4)} | Пример №5 | {@link FruitUseThird Далее (пример №6) >>>}
 *
 * @author Konstantin
 */
public class FruitUseSecond {
    @FruitRuntime(color = "Зелёный", count = 1)
    public static void getApple() {
        FruitUseSecond ob = new FruitUseSecond();
        try {
            Class<?> fruitObject = ob.getClass();
            Method fruitMethod = fruitObject.getMethod("getApple");
            FruitRuntime fruitAnnotation = fruitMethod.getAnnotation(FruitRuntime.class);
            System.out.println("Цвет фрукта: " + fruitAnnotation.color() + ", количество фруктов: " + fruitAnnotation.count());
        } catch (NoSuchMethodException ехс) {
            System.out.println("Meтoд не найден.");
        }
    }

    @Fruit(color = "Красный", count = 5)
    public static void getGarnet(String str, int value ) {
        FruitUseSecond ob = new FruitUseSecond();
        try {
            Class<?> fruitObject = ob.getClass();
            Method fruitMethod = fruitObject.getMethod("getАpple");
            FruitRuntime fruitAnnotation = fruitMethod.getAnnotation(FruitRuntime.class);
            System.out.println("Цвет фрукта: " + fruitAnnotation.color() + ", количество фруктов: " + fruitAnnotation.count());
        } catch (NoSuchMethodException ехс) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        getApple();
        //getGarnet("Желтый", 8); // раскомментировать и вывести значения
    }
}