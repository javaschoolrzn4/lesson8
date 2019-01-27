package com.javarzn.annotation.step2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * Created by konstantin on 13.05.2017.
 */

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
    int value();
}

public class Single {
    @MySingle(100)
    public static void myMeth() {
        Single ob = new Single();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            MySingle anno = m.getAnnotation (MySingle.class);
            System.out.println(anno.value());
        } catch (NoSuchMethodException e) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String args[]) {
        myMeth();
    }
}

// перепешите аннотацию и вывод таким образом, чтобы выводилось 100 100
