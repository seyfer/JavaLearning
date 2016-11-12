package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
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
        Set<Integer> readBytes = new TreeSet<>();

        FileInputStream inputStream = new FileInputStream(firstFileName);
        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            Integer data = inputStream.read(); //прочитать очередной байт

//            System.out.println(data);

            readBytes.add(data);
        }

        for (Integer each : readBytes) {
            System.out.print(each + " ");
        }

//        System.out.println(readBytes);

        inputStream.close();
    }

//    private static class ValueComparator implements Comparator<Integer>
//    {
//        Map<Integer, Integer> base;
//
//        public ValueComparator(Map<Integer, Integer> base) {
//            this.base = base;
//        }
//
//        public int compare(Integer a, Integer b) {// returning 0 would merge keys
//            return (base.get(a) >= base.get(b)) ? -1 : 1;
//        }
//    }
}
