package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;

        //напишите тут ваш код
        int count = 20;
        int[] ints = new int[count];
        for (int i = 0; i < count; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }

        maximum = minimum = ints[0];

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > maximum) {
                maximum = ints[i];
            }

            if (ints[i] < minimum) {
                minimum = ints[i];
            }
        }

        System.out.println(maximum + " " + minimum);
    }
}
