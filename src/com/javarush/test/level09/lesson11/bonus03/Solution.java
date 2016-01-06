package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код

        //count of numbers
        int numberCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                numberCount++;
            }
        }

        int stringCount = array.length - numberCount;

        String[] strings = new String[stringCount];
        int[] numbers = new int[numberCount];

        //separate numbers and strings
        int j = 0, k = 0;
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                numbers[j] = Integer.parseInt(array[i]);
                j++;
            } else {
                strings[k] = array[i];
                k++;
            }
        }

//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(strings));

        //sort numbers
        numbers = BubbleSort(numbers);

        //sort strings
        strings = BubbleSortString(strings);

//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(strings));

        //compose result array
        j = 0;
        k = 0;
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                array[i] = String.valueOf(numbers[j]);
                j++;
            } else {
                array[i] = strings[k];
                k++;
            }
        }

//        System.out.println(Arrays.toString(array));
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

    public static int[] BubbleSort(int[] num) {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable

        while (flag) {
            flag = false;    //set flag to false awaiting a possible swap
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1])   // change to > for ascending sort
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

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    //строка - это на самом деле число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
