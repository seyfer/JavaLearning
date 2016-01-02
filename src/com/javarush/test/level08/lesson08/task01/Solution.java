package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
//    public static void main(String[] args) {
//        HashSet hashSet = createSet();
//        System.out.println(hashSet.size());
//    }

    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            StringBuilder sb = new StringBuilder("Л");
            sb.append(i);

            hashSet.add(sb.toString());
        }

        return  hashSet;
    }
}
