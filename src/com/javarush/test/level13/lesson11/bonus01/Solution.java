package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // src/tmp/numbers.txt
        String sourceFileName = reader.readLine();

        ArrayList<Integer> result = method2(sourceFileName);

        for (Integer num : result) {
            System.out.println(num);
        }
    }

    /**
     * work
     *
     * @param sourceFileName
     * @throws IOException
     */
    private static ArrayList<Integer> method2(String sourceFileName) throws IOException {
        //method 2 work

        ArrayList<Integer> list = new ArrayList<>();

        File file = new File(sourceFileName);
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;

            while ((text = reader.readLine()) != null) {
                int num = Integer.parseInt(text);
                if (num % 2 == 0) {
                    list.add(num);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }

        Collections.sort(list);

//        System.out.println(list);

        return list;
    }
}
