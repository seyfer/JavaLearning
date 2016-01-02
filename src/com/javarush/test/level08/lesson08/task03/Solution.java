package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution {
//    public static void main(String[] args) {
//        HashMap hashMap = createMap();
//        System.out.println(getCountTheSameFirstName(hashMap, "Антон"));
//        System.out.println(getCountTheSameLastName(hashMap, "Сталин"));
//    }

    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Сергеев", "Антон");
        hashMap.put("Иванов", "Петя");
        hashMap.put("Стаханов", "Жора");
        hashMap.put("Сталин", "Иосиф");
        hashMap.put("Куриев", "Артур");
        hashMap.put("Сколов", "Антон");
        hashMap.put("Воробев", "Станичлав");
        hashMap.put("Сергеева", "Антон");
        hashMap.put("Глодин", "Паша");
        hashMap.put("Кинг", "Стивен");

        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (name.equals(entry.getValue())) {
                count++;
            }
        }

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (lastName.equals(entry.getKey())) {
                count++;
            }
        }

        return count;
    }
}
