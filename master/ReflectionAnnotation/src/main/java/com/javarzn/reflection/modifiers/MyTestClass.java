package com.javarzn.reflection.modifiers;

public class MyTestClass {
    private int myIntegerValue = 1;

    private String myString = "Простая строка";

    private final String myFinalString = "Финальная строка";

    @Override
    public String toString() {
        return "MyTestClass{"
                + "myIntegerValue=" + myIntegerValue
                + ", myString='" + myString + '\''
                + ", myFinalString='" + myFinalString + '\''
                + '}';
    }
}
