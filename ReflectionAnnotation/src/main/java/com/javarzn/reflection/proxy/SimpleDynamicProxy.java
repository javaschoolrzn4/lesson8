package com.javarzn.reflection.proxy;

import com.javarzn.reflection.proxy.data.RealObject;
import com.javarzn.reflection.proxy.data.TargetInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Объект динамического прокси, принимает реальный объект в качестве параметра.
 */
class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Динамический прокси, proxy: " + proxy.getClass() + ", method: " + method + ", args: " + args);
        if (args != null) {
            for (Object arg : args) {
                System.out.println("  " + arg);
            }
        }
        return method.invoke(proxied, args);
    }
}

class SimpleDynamicProxy {
    public static void consumer(TargetInterface iface) {
        iface.myTestMethod1();
        iface.myTestMethod2("parameter");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);

        System.out.println();

        TargetInterface proxy = (TargetInterface) Proxy.newProxyInstance(
                TargetInterface.class.getClassLoader(), new Class[] { TargetInterface.class }, new DynamicProxyHandler(real)
        );
        consumer(proxy);
    }
}
