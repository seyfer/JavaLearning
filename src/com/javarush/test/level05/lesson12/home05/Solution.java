package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);

        String input = "";
        int sum = 0;

        while (!input.equals("сумма")) {
            input = s.nextLine();

            try {
                sum += Integer.parseInt(input);
            } catch (Exception e) {

            }
        }

        System.out.println(sum);
    }
}
