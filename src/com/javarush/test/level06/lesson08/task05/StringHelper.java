package com.javarush.test.level06.lesson08.task05;

/* Класс StringHelper
Cделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку повторенную count раз.
String multiply(String s) – возвращает строку повторенную 5 раз.
Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго
*/

public class StringHelper
{
    public static String multiply(String s) {
        String result = "";
        //напишите тут ваш код
        int count = 5;

        result = multiply(s, count);

        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        StringBuilder sb = new StringBuilder();
        //напишите тут ваш код
        for (int i = 0; i < count; i++) {
            sb.append(s);
        }

        result = sb.toString();

        return result;
    }

//    public static void main(String[] args) {
//        System.out.println(StringHelper.multiply("Амиго"));
//    }
}
