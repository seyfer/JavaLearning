package com.javarush.test.level12.lesson04.task03;

/* Пять методов print с разными параметрами
Написать пять методов print с разными параметрами.
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static void print(int n) {
        System.out.println(n);
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void print(Integer i) {
        System.out.println(i);
    }

    public static void print(Integer i, String s) {
        System.out.println(i);
        System.out.println(s);
    }

    public static void print(int n, boolean b) {
        System.out.println(n);
        System.out.println(b);
    }
}
