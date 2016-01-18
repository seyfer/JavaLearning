package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;
import java.nio.file.Files;

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // src/tmp/test.txt
        String sourceFileName = reader.readLine();

        method1(sourceFileName);

//        method2(sourceFileName);

//        method3(sourceFileName);

        reader.close();
    }

    /**
     * work
     *
     * @param sourceFileName
     * @throws IOException
     */
    private static void method2(String sourceFileName) throws IOException {
        //method 2 work
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);
        OutputStream printStream = new PrintStream(System.out);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            printStream.write(data);
        }

        fileInputStream.close();
        printStream.close();
    }

    /**
     * work
     *
     * @param sourceFileName
     * @throws IOException
     */
    private static void method1(String sourceFileName) throws IOException {
        File f = new File(sourceFileName);

        // work
        byte[] bytes = Files.readAllBytes(f.toPath());

        String data = new String(bytes, "UTF-8");
        System.out.println(data);
    }

    /**
     * wrong
     *
     * @param sourceFileName
     * @throws IOException
     */
    private static void method3(String sourceFileName) throws IOException {
        //or wrong!
        byte[] bytes = new byte[sourceFileName.length()];
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);
        int i = 0;
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            bytes[i] = (byte) data;
            i++;
        }
        fileInputStream.close();

        String data = new String(bytes, "UTF-8");
        System.out.println(data);
    }
}
