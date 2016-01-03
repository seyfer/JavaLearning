package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум
        int minimum = array.get(0);

        for (Integer num : array) {
            if (num < minimum) {
                minimum = num;
            }
        }

        return minimum;
    }

    public static List<Integer> getIntegerList() throws IOException {
        //Тут создать и заполнить список
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integers = new ArrayList<>();

        int count = Integer.parseInt(reader.readLine());

        if (count > 0) {
            for (int i = 0; i < count; i++) {
                integers.add(Integer.parseInt(reader.readLine()));
            }
        }

        return integers;
    }
}
