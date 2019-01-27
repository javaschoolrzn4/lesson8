package com.javarzn.annotation.step3;

import com.javarzn.annotation.base.Fruit;

import java.lang.reflect.Method;

/**
 * Created by konstantin on 13.05.2017.
 */
class Meta {
    // аннотировать метод
    @Fruit(color = "Пример аннотации", count = 100)
    public static void myMeth() throws @TypeAnno NoSuchMethodException {
        Meta ob = new Meta();
        // получить аннотацию из метода
        // и вывести значения ее членов

            // сначала получить объект типа Class,
            // представляющий данный класс
            Class<?> obClass = ob.getClass();
            // затем получить объект типа Мethod,
            // представляющий данный метод
            Method m = obClass.getMethod("myMeth");
            // далее получить аннотацию для данного класса
        Fruit anno = m.getAnnotation(Fruit.class);
            // и наконец, вывести значения членов аннотации
            System.out.println(anno.color() + " " + anno.count());
    }

    public static void main(@TypeAnno String[] args) throws NoSuchMethodException {
        myMeth();
        //myMeth2("Test", 1); // раскомментировать и вывести - Пример аннотации 2
    }
}