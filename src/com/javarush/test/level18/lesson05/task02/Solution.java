package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    private static String firstFileName = "";

    public static void main(String[] args) throws IOException {

        //read file names
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // src/tmp/strings.txt
            firstFileName = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        reader.close();

        int comaCount = 0;
        char coma = ',';
        Integer comaCharNum = (int) coma;

        FileInputStream inputStream = new FileInputStream(firstFileName);
        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            Integer data = inputStream.read(); //прочитать очередной байт

            if (comaCharNum.equals(data)) {
                comaCount++;
            }

//            System.out.println(data);
        }

        System.out.println(comaCount);

        inputStream.close();
    }
}
