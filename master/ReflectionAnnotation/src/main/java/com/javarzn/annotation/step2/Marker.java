package com.javarzn.annotation.step2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Аннотация-маркер
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
}

class Marker {
    //аннотировать метод с помощью маркера
    // Обратите внимание на обязательность скобок ()
    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            // определить наличие аннотации
            if (m.isAnnotationPresent(MyMarker.class)) {
                System.out.println("Aннoтaция-мapкep MyMarker присутствует.");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void maiп(String args[]) {
        myMeth();
    }
}
