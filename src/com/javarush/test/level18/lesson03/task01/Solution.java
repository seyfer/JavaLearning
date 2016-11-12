package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {

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

        FileInputStream inputStream = new FileInputStream(firstFileName);

        int max = 0;

        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            int data = inputStream.read(); //прочитать очередной байт

            if (data > max) {
                max = data;
            }

//            System.out.println(data);
        }

        System.out.println(max);

        inputStream.close(); // за
    }
}
