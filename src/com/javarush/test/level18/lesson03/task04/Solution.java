package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
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

            readBytes.add(data);
        }

        //calc repeats
        int count = 0;
        for (Integer i : readBytes) {
            count = Collections.frequency(readBytes, i);
            repeated.put(i, count);
        }

        //find min repeat value
        List<Integer> repeatedCountValues = new ArrayList<Integer>(repeated.values());

        Integer min = Integer.MAX_VALUE;
        for (Integer each : repeatedCountValues) {
            if (each < min) {
                min = each;
            }
        }

        //find and print bytes with min repeats
        for (Map.Entry<Integer, Integer> eachRepeated : repeated.entrySet()) {
            Integer key = eachRepeated.getKey();
            Integer value = eachRepeated.getValue();

            if (value.equals(min)) {
                System.out.print(key + " ");
            }
        }

//        System.out.println(readBytes);
//        System.out.println(repeated);
//        System.out.println(repeatedCountValues);
//        System.out.println(min);

        inputStream.close();
    }
}
