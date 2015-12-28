package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
        Scanner s = new Scanner(System.in);

        int[] nums = new int[3];

        nums[0] = s.nextInt();
        nums[1] = s.nextInt();
        nums[2] = s.nextInt();

        int[] sorted = Solution.bubbleSort(nums);

        System.out.print(sorted[1]);

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
