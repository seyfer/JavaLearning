package com.javarush.test.level16.lesson13.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
Подсказка: Нить 4 можно проверить методом isAlive()
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<Thread>(5);

    static {
        threads.add(new Unlimited());
        threads.add(new Interrupted());
        threads.add(new Hooray());
        threads.add(new Messages());
        threads.add(new NumberReader());
    }

    public static class Unlimited extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class Interrupted extends Thread {
        @Override
        public void run() {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                }

                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Hooray extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(500);
                    System.out.println("Ура");
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public static class Messages extends Thread implements Message {

        @Override
        public void showWarning() {

            interrupt();
            try {
                join();
            } catch (InterruptedException e) {

            }
        }

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {

            }
        }
    }

    public static class NumberReader extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;

            while (!Thread.currentThread().isInterrupted()) {
                try {
                    String input = reader.readLine();

                    if (input.equals("N")) {
                        break;
                    }

                    int num = Integer.parseInt(input);
                    sum += num;
                } catch (IOException e) {

                }
            }

            System.out.println(sum);
        }
    }

//    public static void main(String[] args) throws Exception {
//        Thread thread4 = threads.get(4);
//        Message message = (Message) thread4;
//        thread4.start();
//        Thread.sleep(2000);
//        message.showWarning();
//        System.out.println(thread4.isAlive());
//    }
}
