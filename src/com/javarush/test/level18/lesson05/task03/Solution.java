package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> fileNames = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
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
        FileOutputStream file3 = new FileOutputStream(fileNames.get(2));

//        if (file1.available() > 0) {
//
//            byte[] buffer = new byte[file1.available()];
//            int count = file1.read(buffer);
//
//            int forSecond = (int) Math.round(count / 2d);
//            int forThird = count - forSecond;
//
//            file2.write(buffer, 0, forSecond);
//            file3.write(buffer, forSecond, forThird);
//
//            System.out.println(count);
//            System.out.println(forSecond);
//            System.out.println(forThird);
//        }

        while (file1.available() > 0) {
            if (file1.available() % 2 == 0) {
                byte[] o1 = new byte[file1.available() / 2];
                byte[] o2 = new byte[file1.available() / 2];
                int count1 = file1.read(o1);
                int count2 = file1.read(o2);
                file2.write(o1, 0, count1);
                file3.write(o2, 0, count2);
            } else {
                byte[] o1 = new byte[file1.available() / 2 + 1];
                byte[] o2 = new byte[file1.available() / 2];
                int count1 = file1.read(o1);
                int count2 = file1.read(o2);
                file2.write(o1, 0, count1);
                file3.write(o2, 0, count2);
            }
        }

        file1.close();
        file2.close();
        file3.close();
    }
}

