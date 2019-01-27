package com.javarzn.annotation.step3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by konstantin on 13.05.2017.
 */
// Аннотация-маркер, которую можно применить к типу данных
//@Target(ElementType.TYPE_USE)
//@interface ТуреАnnо {
//}

//Еще одна аннотация-маркер, которую можно применить к типу данных
@Target(ElementType.TYPE_USE)
@interface NotZeroLen {

}

// И еще одна аннотация-маркер, которую можно применить к типу данных
@Target(ElementType.TYPE_USE)
@interface Unique {
}

// Параметризированная аннотация, которую можно применить к типу данных
@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}

// Аннотация, которую можно применить к параметру типа
@Target(ElementType.TYPE_PARAMETER)
@interface What {
    String description();
}

//  Аннотация, которую можно применить в объявлении поля
@Target(ElementType.FIELD)
@interface EmptyOK {
}

// Аннотация, которую можно применить в объявлении метода
@Target(ElementType.METHOD)
@interface Recommended {
}

//    Аннотация          Целевая константа
//    @ТypeAnno          EleшentТype.TYPE_USE
//    @NaxLen            EleшentТype.TYPE_USE
//    @NotZeroLen        EleшentТype.TYPE_USE
//    @Unique            EleшentТype.TYPE_USE
//    @What              ElementТype.TYPE_PARAМEТER
//    @EmptyOK           EleшentТype.FIELD
//    @Recommended       ElementТype.МETBOD

public class MetaUse<@What(description = "Данные обобщенного типа") T> {
    // применить типовую аннотацию в конструкторе
    public @Unique MetaUse() {
    }

    // аннотировать тип (в данном случае - Strinq) , но не поле
    @TypeAnno String str;
    // аннотировать тест поля
    @EmptyOK
    String test;
    // применить типовую аннотацию для аннотирования ссылки this на объект (получатель)


    // на локальной машине этот блок не отработал
//    public int f(@TypeAnno MetaUse<T> this, int х) {
//        return 10;
//    }


    //    аннотировать возвращаемый тип
    public @TypeAnno Integer f2(int j, int k) {
        return j + k;
    }

    //    аннотировать объявление метода
    public @Recommended
    Integer fЗ(String str) {
        return str.length() / 2;
    }

    // применить типовую аннотацию в операторе throwв
    public void f4() throws @TypeAnno NullPointerException {

    }

    // аннотировать уровни доступа к массиву
    String @MaxLen(10) [] @NotZeroLen [] w;

    // аннотировать тип элемента массива
    @TypeAnno Integer[] vec;

    public static void myMeth(int i) {

        // применить типовую аннотацию в аргументе типа
        MetaUse<@TypeAnno Integer> оЬ = new MetaUse<@TypeAnno Integer>();

        // применить типовую аннотацию в операторе new
        @Unique MetaUse<Integer> оЬ2 = new MetaUse<Integer>();

        Object х = new Integer(10);
        Integer у;

        // применить типовую аннотацию в приведении типов
        у = (@TypeAnno Integer) х;
    }

    public static void main(String args[]) {
        myMeth(10);
    }

    // применить типовую аннотацию в выражении наследования
    class SomeClass extends MetaUse<Boolean> {
    }
}
