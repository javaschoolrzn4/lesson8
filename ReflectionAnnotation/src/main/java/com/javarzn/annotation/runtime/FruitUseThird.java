package com.javarzn.annotation.runtime;

import com.javarzn.annotation.base.retention.FruitRuntime;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Пример использования аннотации.
 * <br/>
 * {@link FruitUseSecond <<< Назад (пример №5)} | Пример №6
 *
 * @author Konstantin
 */
@What(description = "Аннотация тестового класса")
@FruitRuntime(color = "Фиолетовый", count = 25)
class FruitUseThird {
    @What(description = "Аннотация тестового метода")
    @FruitRuntime(color = "Оранжевый", count = 10)
    public static void testMethod() {
        FruitUseThird fruitUseThird = new FruitUseThird();
        try {
            Annotation annotations[] = fruitUseThird.getClass().getAnnotations();
            //  вывести все аннотации для класса FruitUseThird
            System.out.println("Bce аннотации класса FruitUseThird:");
            for (Annotation a : annotations) {
                System.out.println(a);
            }
            System.out.println();
            //  вывести все аннотации метода testMethod()
            Method m = fruitUseThird.getClass().getMethod("testMethod");
            annotations = m.getAnnotations();
            System.out.println("Bce аннотации метода testMethod():");
            for (Annotation a : annotations) {
                System.out.println(a);
            }
        } catch (NoSuchMethodException ехс) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String args[]) {
        testMethod();
    }
}