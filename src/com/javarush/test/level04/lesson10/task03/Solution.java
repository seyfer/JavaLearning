package com.javarush.test.level04.lesson10.task03;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        Scanner s = new Scanner(System.in);

        String s1 = s.nextLine();
        int i = s.nextInt();

        while (i > 0) {
            i--;
            System.out.println(s1);
        }
    }
}
