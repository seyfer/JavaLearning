package com.javarush.test.level04.lesson16.home04;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
        Scanner s = new Scanner(System.in);

        String name = s.nextLine();

        int y = s.nextInt();
        int m = s.nextInt();
        int d = s.nextInt();

        System.out.print("Меня зовут " + name + "\n" +
                "Я родился " + d + "." + m + "." + y);
    }
}
