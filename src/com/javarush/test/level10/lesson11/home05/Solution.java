package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.*;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        //напишите тут ваш код
//        System.out.println(alphabet);

        Map<String, Integer> counts = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (Character c : alphabet) {
            counts.put(String.valueOf(c), 0);
        }

        //count
        for (String input : list) {
            char[] inputCopy = input.toCharArray();
            for (int i = 0; i < inputCopy.length; i++) {
                if (Character.isLetter(inputCopy[i])) {
                    int currentCount = counts.get(String.valueOf(inputCopy[i]));
                    currentCount++;
                    counts.put(String.valueOf(inputCopy[i]), currentCount);
                }
            }
        }

        //form result list
        String[] result = new String[alphabet.size()];
        int i = 0;
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            result[i] = String.valueOf(key) + " " + String.valueOf(value);
            i++;

//            System.out.println(String.valueOf(key) + " " + String.valueOf(value));
        }

        //sort
        result = BubbleSortString(result);

        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        Collator russianCollator = Collator.getInstance(new Locale("ru", "RU"));

        if ((a.contains("е") && b.contains("ё"))) {
            return false;
        }
        if ((a.contains("E") && b.contains("Ё"))) {
            return false;
        }
        return russianCollator.compare(a, b) > 0;
    }

    public static String[] BubbleSortString(String[] num) {
        boolean flag = true;   // set flag to true to begin first pass
        String temp;   //holding variable

        while (flag) {
            flag = false;    //set flag to false awaiting a possible swap
            for (int j = 0; j < num.length - 1; j++) {
                if (isGreaterThan(num[j], num[j + 1]))   // change to > for ascending sort
                {
                    temp = num[j];                //swap elements
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;              //shows a swap occurred
                }
            }
        }

        return num;
    }

}
