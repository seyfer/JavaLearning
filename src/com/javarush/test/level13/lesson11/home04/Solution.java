package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // src/tmp/target.txt
        String destinationFileName = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);

        while (true) {
            String string = reader.readLine();
            StringBuilder stringBuilder = new StringBuilder(string);
            String separator = System.getProperty("line.separator");
            stringBuilder.append(separator);

            fileOutputStream.write(stringBuilder.toString().getBytes());

            if (string.equals("exit")) {
                break;
            }
        }
    }
}
