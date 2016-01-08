package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String>[] arrayOfStringList = new ArrayList[5];

        ArrayList<String> one = new ArrayList<>();
        one.add("one");
        ArrayList<String> two = new ArrayList<>();
        two.add("two");
        ArrayList<String> three = new ArrayList<>();
        three.add("three");
        ArrayList<String> four = new ArrayList<>();
        four.add("four");
        ArrayList<String> five = new ArrayList<>();
        five.add("five");

        arrayOfStringList[0] = one;
        arrayOfStringList[1] = two;
        arrayOfStringList[2] = three;
        arrayOfStringList[3] = four;
        arrayOfStringList[4] = five;

        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}