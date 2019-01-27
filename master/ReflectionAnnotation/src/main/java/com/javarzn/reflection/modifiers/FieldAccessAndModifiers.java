package com.javarzn.reflection.modifiers;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldAccessAndModifiers {
    private static MyTestClass testClass;

    public static void changePrivateIntField() {
        Field field = null;

        try {
            field = testClass.getClass().getDeclaredField("myIntegerValue");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        field.setAccessible(true);

        try {
            field.setInt(testClass, 47);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(testClass);
    }

    public static void changePrivateStrField(String name) {
        Field field = null;

        try {
            field = testClass.getClass().getDeclaredField(name);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        field.setAccessible(true);

        try {
            field.set(testClass, field.get(testClass) + " была изменена!");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(testClass);
    }

    public static void getModifiersFromField(String name) throws Exception {
        Field field = testClass.getClass().getDeclaredField(name);
        int modifiers = field.getModifiers();
        System.out.println("isAbstract - " + Modifier.isAbstract(modifiers));
        System.out.println("isFinal - " + Modifier.isFinal(modifiers));
        System.out.println("isInterface - " + Modifier.isInterface(modifiers));
        System.out.println("isNative - " + Modifier.isNative(modifiers));
        System.out.println("isPrivate - " + Modifier.isPrivate(modifiers));
        System.out.println("isProtected - " + Modifier.isProtected(modifiers));
        System.out.println("isPublic - " + Modifier.isPublic(modifiers));
        System.out.println("isStatic - " + Modifier.isStatic(modifiers));
        System.out.println("isStrict - " + Modifier.isStrict(modifiers));
        System.out.println("isSynchronized - " + Modifier.isSynchronized(modifiers));
        System.out.println("isTransient - " + Modifier.isTransient(modifiers));
        System.out.println("isVolatile - " + Modifier.isVolatile(modifiers));        
    }

    public static void main(String[] args) throws Exception {
        testClass = new MyTestClass();

        System.out.println("Первоначальное значение: ");
        System.out.println(testClass);
        System.out.println();

        System.out.println("Пробуем изменить int значение: ");
        System.out.println("Значения полей до изменений:");
        System.out.println(testClass);
        System.out.println("Значения полей после изменений:");
        changePrivateIntField();
        System.out.println();

        System.out.println("Пробуем изменить myString значение: ");
        System.out.println("Значения полей до изменений:");
        System.out.println(testClass);
        System.out.println("Значения полей после изменений:");
        changePrivateStrField("myString");
        System.out.println();

        System.out.println("Пробуем изменить myFinalString значение: ");
        System.out.println("Значения полей до изменений:");
        System.out.println(testClass);
        System.out.println("Значения полей после изменений:");
        changePrivateStrField("myFinalString");
        System.out.println();

        System.out.println("Полный список модификаторов для поля myFinalString:");
        getModifiersFromField("myFinalString");
    }
}
