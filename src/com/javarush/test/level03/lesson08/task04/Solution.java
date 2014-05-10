package com.javarush.test.level03.lesson08.task04;

/* Спонсор - это звучит гордо
Ввести с клавиатуры два имени и вывести надпись:
name1 проспонсировал name2 и она стала известной певицей.
Пример: Коля проспонсировал Лену, и она стала известной певицей.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        Scanner s = new Scanner(System.in);

        String n1 = s.nextLine();
        String n2 = s.nextLine();



        System.out.print(n1 + " проспонсировал " + n2 + ", и она стала известной певицей.");
    }
}