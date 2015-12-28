package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 5;
        for (int i = 0; i < count; i++) {
            list.add(reader.readLine());
        }

        int maxLength = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() >= maxLength) {
                maxLength = list.get(i).length();
            }
        }

        ArrayList<String> longList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == maxLength) {
                longList.add(list.get(i));
            }
        }

        for (int i = 0; i < longList.size(); i++) {
            System.out.println(longList.get(i));
        }
    }
}
