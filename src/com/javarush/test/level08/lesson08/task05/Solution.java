package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Сергеев", "Антон");
        hashMap.put("Иванов", "Петя");
        hashMap.put("Стаханов", "Жора");
        hashMap.put("Сталин", "Иосиф");
        hashMap.put("Куриев", "Артур");
        hashMap.put("Сколов", "Антон");
        hashMap.put("Воробев", "Станислав");
        hashMap.put("Сергеева", "Антон");
        hashMap.put("Глодин", "Паша");
        hashMap.put("Кинг", "Стивен");

        return hashMap;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код

        //1 fail
//        attemptOne(map);

        //2 fail
//        attemptTwo(map);

        //3 work!
        attemptThree(map);

        //4 work!
//        attemptFour(map);
    }

    // work!
    private static void attemptFour(HashMap<String, String> map) {
        ArrayList<String> keyList = new ArrayList<String>();
        keyList.addAll(map.keySet());
        //or
//        List<?> keyList = new ArrayList<>(map.keySet());
        //not this
//        for (Map.Entry<String, String> pair : map.entrySet()) {
//            String key = pair.getKey();
//            keyList.add(key);
//        }

        for (int i = 0; i < keyList.size(); i++) {
            for (int j = i + 1; j < keyList.size(); j++) {
                if (map.get(keyList.get(i)) == (map.get(keyList.get(j)))) {
                    removeItemFromMapByValue(map, map.get(keyList.get(i)));
                }
            }
        }
    }

    // work!
    private static void attemptThree(HashMap<String, String> map) {
        HashSet<String> set = new HashSet<>();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            String value = iterator.next().getValue();
            int count = 0;

            HashMap<String, String> copy = new HashMap<String, String>(map);
            Iterator<Map.Entry<String, String>> copyIterator = copy.entrySet().iterator();

            while (copyIterator.hasNext()) {
                if (value.equals(copyIterator.next().getValue())) {
                    count++;
                }
            }

            if (count > 1) {
                set.add(value);
            }
        }

        for (String each : set) {
            removeItemFromMapByValue(map, each);
        }
    }

    //fail
    private static void attemptTwo(HashMap<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            String value = iterator.next().getValue();

            HashMap<String, String> copy = new HashMap<String, String>(map);
            Iterator<Map.Entry<String, String>> copyIterator = copy.entrySet().iterator();

            while (copyIterator.hasNext()) {
                if (value.equals(copyIterator.next().getValue())) {
                    removeItemFromMapByValue(map, value);
                }
            }
        }
    }

    //fail
    private static void attemptOne(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            for (Map.Entry<String, String> entryCopy : copy.entrySet()) {
                if (entry.getValue().equals(entryCopy.getValue())) {
                    removeItemFromMapByValue(map, entry.getValue());
                }
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> hashMap = createMap();
        removeTheFirstNameDuplicates(hashMap);

        System.out.println(hashMap);
    }
}
