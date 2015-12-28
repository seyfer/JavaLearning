package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        System.out.println("".length());

        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 5;
        for (int i = 0; i < count; i++) {
            list.add(reader.readLine());
        }

        int minLength = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() <= minLength) {
                minLength = list.get(i).length();
            }
        }

        ArrayList<String> shortList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == minLength) {
                shortList.add(list.get(i));
            }
        }

        for (int i = 0; i < shortList.size(); i++) {
            System.out.println(shortList.get(i));
        }
    }
}
