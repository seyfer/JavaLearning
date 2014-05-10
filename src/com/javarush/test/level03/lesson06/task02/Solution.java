package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран надпись: таблицу умножения 10 на 10:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        int nums = 10;
        int maxRows = 10;
        for (int i = 1; i <= nums; i++) {
            for (int j = 1; j <= maxRows; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}