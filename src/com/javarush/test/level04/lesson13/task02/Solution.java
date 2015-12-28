package com.javarush.test.level04.lesson13.task02;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
        Scanner s = new Scanner(System.in);

        int w = s.nextInt();
        int h = s.nextInt();

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
