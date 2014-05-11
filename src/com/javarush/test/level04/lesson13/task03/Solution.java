package com.javarush.test.level04.lesson13.task03;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        for (int i = 10; i >= 0 ; i--) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(8);
            }
            System.out.println();
        }

    }
}
