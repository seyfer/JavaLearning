package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> fileNames = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String fileName = "";

            try {
                fileName = reader.readLine();

            } catch (IOException e) {
                e.printStackTrace();
            }

            fileNames.add(fileName);
        }

        reader.close();

        FileInputStream file1 = new FileInputStream(fileNames.get(0));
        FileOutputStream file2 = new FileOutputStream(fileNames.get(1));

        int file1count = file1.available();

        byte[] buffer = {};
        if (file1.available() > 0) {
            //читаем весь файл одним куском
            buffer = new byte[file1.available()];
            file1.read(buffer);
        }

        System.out.println(file1count);

        for (int i = file1count - 1; i >= 0; i--) {
            file2.write(buffer[i]);
        }

        file1.close();
        file2.close();
    }
}
