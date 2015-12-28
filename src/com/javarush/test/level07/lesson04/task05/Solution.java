package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        int[] ints = new int[20];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }

        int[] small1 = new int[10];
        int[] small2 = new int[10];

        for (int i = 0; i < ints.length; i++) {
            if (i < ints.length / 2 - 1) {
                small1[i] = ints[i];
            } else {
                small2[Math.abs(10 - i)] = ints[i];
            }

            //10 - 0, 10-11=-1, .. 10-19=-9
        }

        for (int i = 0; i < small2.length; i++) {
            System.out.println(small2[i]);
        }
    }
}
