package com.javarzn.annotation.step2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Объявление типа аннотации, включая значения ее членов по умолчанию
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str() default "Тестирование";

    int val() default 9000;
}
class DefaultValues {
    // аннотировать метод, используя значения по умолчанию
    @MyAnno()
    public static void myMeth() {
        DefaultValues ob = new DefaultValues();
        // получить аннотацию для данного метода
        // и вывести значения ее членов
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}