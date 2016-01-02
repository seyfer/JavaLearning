package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution {
//    public static void main(String[] args) {
//        HashSet<Integer> hashSet = createSet();
//        hashSet = removeAllNumbersMoreThan10(hashSet);
//
//        System.out.println(hashSet);
//    }

    public static HashSet<Integer> createSet() {

        //напишите тут ваш код
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            hashSet.add(i);
        }

        return hashSet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {

        HashSet<Integer> hashSet = new HashSet<>();

        //напишите тут ваш код
        for (Integer each : set) {
            if (each <= 10) {
                hashSet.add(each);
            }
        }

        return hashSet;
    }
}
