package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int age = s.nextInt();

        System.out.print(name + " захватит мир через " + age + " лет. Му-ха-ха!");
    }
}