package com.javarush.test.level03.lesson08.task05;

/* Чистая любовь
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String n1 = r.readLine();
        String n2 = r.readLine();
        String n3 = r.readLine();

        System.out.print(n1 + " + " + n2 + " + " + n3 + " = Чистая любовь, да-да!");
    }
}