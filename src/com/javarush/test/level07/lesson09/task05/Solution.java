package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 10;
        for (int i = 0; i < count; i++) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        //Вывести на экран result
        for (int i = 0; i < result.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        //напишите тут ваш код
        int size = list.size();
        for (int i = 0; i < size * 2; i += 2) {
            list.add(i, list.get(i));
        }

        return list;
    }
}
