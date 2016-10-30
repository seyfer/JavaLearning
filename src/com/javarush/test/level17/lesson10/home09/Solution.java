package com.javarush.test.level17.lesson10.home09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
*/

public class Solution
{
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    static {
        //read file names
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = "", secondFileName = "";

        try {
            // src/tmp/strings.txt
            firstFileName = reader.readLine();
            // src/tmp/strings1.txt
            secondFileName = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //debug
//        firstFileName = "src/tmp/strings.txt";
//        secondFileName = "src/tmp/strings2.txt";

        //1st file into allLines
        File file1 = new File(firstFileName);
        try {
            String text;
            reader = new BufferedReader(new FileReader(file1));

            while ((text = reader.readLine()) != null) {
                allLines.add(text);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //2nd file into removeLines
        File file2 = new File(secondFileName);
        try {
            String text;
            reader = new BufferedReader(new FileReader(file2));

            while ((text = reader.readLine()) != null) {
                forRemoveLines.add(text);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(allLines);
        System.out.println(forRemoveLines);

        Solution solution = new Solution();
        try {
            solution.joinData();

            System.out.println(allLines);
        } catch (CorruptedDataException e) {
            System.out.println("Exception!");
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        boolean containsCheck = allLines.containsAll(forRemoveLines);

        if (containsCheck) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
