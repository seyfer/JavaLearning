package com.javarush.test.level06.lesson11.home02;

import java.util.ArrayList;

/* Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat {
    public Cat() {
        if (Cat.cats == null) {
            Cat.cats = new ArrayList<>();
        }

        Cat.cats.add(this);
    }

    //напишите тут ваш код
    public static ArrayList<Cat> cats;

    public static void main(String[] args) {
        //Создай тут 10 котов
        int count = 10;
        for (int i = 0; i < count; i++) {
            Cat cat = new Cat();
        }

        printCats();
    }

    public static void printCats() {
        //Добавь свой код для пункта 3 тут
//        for (int i = 0; i < 10; i++) {
//            Cat cat = cats.get(i);
//            System.out.println(cat.hashCode());
//        }

        System.out.println(Cat.cats);
    }
}
