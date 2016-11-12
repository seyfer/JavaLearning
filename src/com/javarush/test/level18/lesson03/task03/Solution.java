package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution
{

    private static String firstFileName = "";

    static {
        //read file names
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // src/tmp/strings.txt
            firstFileName = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> readBytes = new ArrayList<>();
        HashMap<Integer, Integer> repeated = new HashMap<>();

        FileInputStream inputStream = new FileInputStream(firstFileName);
        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            Integer data = inputStream.read(); //прочитать очередной байт

//            System.out.println(data);

            //read data and calc repeats
            if (readBytes.contains(data)) {
                if (repeated.containsKey(data)) {
                    Integer storedCount = repeated.get(data);
                    storedCount++;
                    repeated.put(data, storedCount);
                } else {
                    Integer storedCount = 0;
                    repeated.put(data, storedCount);
                }
            }

            readBytes.add(data);
        }

        //find max repeat value
        List<Integer> repeatedCountValues = new ArrayList<Integer>(repeated.values());

        Integer max = 0;
        for (Integer each : repeatedCountValues) {
            if (each > max) {
                max = each;
            }
        }

        //find and print bytes with max repeats
        for (Map.Entry<Integer, Integer> eachRepeated : repeated.entrySet()) {
            Integer key = eachRepeated.getKey();
            Integer value = eachRepeated.getValue();

            if (Objects.equals(value, max)) {
                System.out.print(key + " ");
            }
        }

//        System.out.println(readBytes);
//        System.out.println(repeated);
//        System.out.println(repeatedCountValues);
//        System.out.println(max);

        inputStream.close(); // за
    }
}
