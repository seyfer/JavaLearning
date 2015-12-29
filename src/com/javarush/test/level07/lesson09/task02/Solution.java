package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 5;
        for (int i = 0; i < count; i++) {
            list.add(reader.readLine());
        }

        list.remove(2);

        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(size - i - 1));
        }
    }
}
