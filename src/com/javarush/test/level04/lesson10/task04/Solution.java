package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while. Буквы в одной строке не разделять.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
        int w = 10, h = 10;

        while (w > 0) {
            w--;
            while (h > 0) {
                System.out.print("S");
                h--;
            }
            System.out.println();
            h = 10;
        }
    }
}
