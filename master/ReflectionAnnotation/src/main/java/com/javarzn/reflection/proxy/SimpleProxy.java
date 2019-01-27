package com.javarzn.reflection.proxy;

import com.javarzn.reflection.proxy.data.RealObject;
import com.javarzn.reflection.proxy.data.TargetInterface;

/**
 * Прокси-объект, который перехватывает действия. Мы его создали сами.
 */
class ProxyObject implements TargetInterface {
    private TargetInterface proxied;

    public ProxyObject(TargetInterface proxied) {
        this.proxied = proxied;
    }

    public void myTestMethod1() {
        System.out.println("Прокси объект, выполнение метода - myTestMethod1");
        proxied.myTestMethod1();
    }

    public void myTestMethod2(String arg) {
        System.out.println("Прокси объект, выполнение метода - myTestMethod2 с аргументом: " + arg);
        proxied.myTestMethod2(arg);
    }
}

class SimpleProxy {
    public static void consumer(TargetInterface iface) {
        iface.myTestMethod1();
        iface.myTestMethod2("parameter");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        System.out.println();
        consumer(new ProxyObject(new RealObject()));
    }
}