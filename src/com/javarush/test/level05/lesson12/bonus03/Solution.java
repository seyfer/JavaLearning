package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        //напишите тут ваш код
        int count = Integer.parseInt(reader.readLine());

        if (count > 0) {
            for (int i = 0; i < count; i++) {

//            System.out.println(i);

                int input = Integer.parseInt(reader.readLine());

                if (maximum == 0) {
                    maximum = input;
                }

                maximum = max(maximum, input);
            }

            System.out.println(maximum);
        }
    }

    /**
     * @param a
     * @param b
     * @return boolean
     */
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
