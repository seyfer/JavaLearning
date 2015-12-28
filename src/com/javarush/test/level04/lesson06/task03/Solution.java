package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
        Scanner s = new Scanner(System.in);

        int[] list = new int[3];
        list[0] = s.nextInt();
        list[1] = s.nextInt();
        list[2] = s.nextInt();

        int[] sorted = Solution.bubbleSort(list);

        for (int i = sorted.length - 1; i >= 0; i--) {
            System.out.println(sorted[i]);
        }

    }

    public static int[] bubbleSort(int[] list) {
        int n, f, min, temp;

        n = list.length;

        for (int j = 0; j < n - 1; j++) {
            f = 0;
            min = j;
            for (int i = j; i < (n - j - 1); i++) {
                if (list[i] > list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    f = 1;
                }
                if (list[i] < list[min])
                    min = i;
            }
            if (f == 0)
                break;
            if (min != j) {
                temp = list[j];
                list[j] = list[min];
                list[min] = temp;
            }
        }

        return list;
    }
}
