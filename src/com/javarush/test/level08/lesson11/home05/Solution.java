package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        final int len = s.length();
        final char[] copy = s.toCharArray();

        if (Character.isLetter(copy[0])) {
            copy[0] = Character.toUpperCase(copy[0]);
        }

        boolean newWordFlag = true;
        for (int i = 0; i < len; i++) {
//            System.out.print(copy[i]);

            if (copy[i] == ' ') {
                newWordFlag = true;
            }
            if (copy[i] != ' ' && newWordFlag) {
                copy[i] = Character.toUpperCase(copy[i]);
                newWordFlag = false;
            }
        }

        String result = new String(copy);

        System.out.println(result);
    }


}
