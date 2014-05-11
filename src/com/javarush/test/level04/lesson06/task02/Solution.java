package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int n4 = s.nextInt();

        int m1 = Solution.max(n1, n2);
        int m2 = Solution.max(n3, n4);

        int min = Solution.max(m1, m2);
        System.out.print(min);

    }

    public static int max(int a, int b) {

        if (a < b) {
            return b;
        } else {
            return a;
        }

    }
}
