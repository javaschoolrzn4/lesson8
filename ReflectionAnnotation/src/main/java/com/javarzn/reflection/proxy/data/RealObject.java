package com.javarzn.reflection.proxy.data;

/**
  * Настоящий объект, который должен выполнять какие-то действия.
  */
public class RealObject implements TargetInterface {
    public void myTestMethod1() {
        System.out.println("Реальный объект, выполнение метода myTestMethod1");
    }

    public void myTestMethod2(String arg) {
        System.out.println("Реальный объект, выполнение метода myTestMethod2 с аргументом: " + arg);
    }
}
