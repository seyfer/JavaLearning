package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> ints = new ArrayList<>();

        int[] one = {1, 2, 3, 4, 5};
        int[] two = {1, 2};
        int[] three = {1, 2, 3, 4};
        int[] four = {1, 2, 3, 4, 5, 6, 7};
        int[] five = new int[0];

        ints.add(one);
        ints.add(two);
        ints.add(three);
        ints.add(four);
        ints.add(five);

        return ints;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
