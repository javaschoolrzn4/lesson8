package com.javarzn.annotation.step2;


import com.javarzn.annotation.runtime.What;

import java.lang.annotation.Annotation;

/**
 * Created by konstantin on 13.05.2017.
 */
@What(description = "Не супер 1")
class Meta1 extends MetaSuper {

    @What(description = "Не супер 2")
    public static void myMeth() {
        Meta1 ob = new Meta1();
        Annotation annos[] = ob.getClass().getDeclaredAnnotations();
        //  вывести все аннотации для класса Меtа2
        System.out.println("Bce аннотации для класса Meta2:");
        for (Annotation a : annos) {
            System.out.println(a);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        myMeth();
    }
}