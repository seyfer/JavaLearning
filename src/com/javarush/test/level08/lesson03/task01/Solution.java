package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> vegetables = new HashSet<>();

        vegetables.add("арбуз");
        vegetables.add("банан");
        vegetables.add("вишня");
        vegetables.add("груша");
        vegetables.add("дыня");
        vegetables.add("ежевика");
        vegetables.add("жень-шень");
        vegetables.add("земляника");
        vegetables.add("ирис");
        vegetables.add("картофель");

        for (String vegetable : vegetables) {
            System.out.println(vegetable);
        }
    }
}
