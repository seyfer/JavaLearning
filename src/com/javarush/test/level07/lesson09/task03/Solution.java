package com.javarush.test.level07.lesson09.task03;

import java.util.ArrayList;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();

        list.add("мама");
        list.add("мыла");
        list.add("раму");

        String word = "именно";

        int size = list.size();
        for (int i = 1; i < size * 2; i += 2) {
//            StringBuilder sb = new StringBuilder(list.get(i));
//            sb.append(word);
//            list.set(i, sb.toString());

            list.add(i, word);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
