package com.javarush.test.level03.lesson04.task02;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        int s =5, r=10;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print("Oleg ");
            }
            System.out.println();
        }

    }
}