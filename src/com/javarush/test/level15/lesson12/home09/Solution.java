package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        URL url = new URL(reader.readLine());

        Map<String, List<String>> query_pairs = splitQuery(url);

//        System.out.println(query_pairs);

        int length = query_pairs.size();
        int i = 0;
        for (Map.Entry<String, List<String>> pair : query_pairs.entrySet()) {
            String key = pair.getKey();
            System.out.print(key);

            if (i < length - 1) {
                System.out.print(" ");
            }

            i++;
        }
        System.out.println();

        for (Map.Entry<String, List<String>> pair : query_pairs.entrySet()) {
            String key = pair.getKey();
            if (key.equals("obj")) {
                List<String> objList = query_pairs.get("obj");

                for (String obj : objList) {
                    try {
                        double doubleVal = Double.parseDouble(obj);
                        alert(doubleVal);
                    } catch (NumberFormatException e) {
                        alert(obj);
                    }
                }
            }
        }
    }

    //string out of bound http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
    public static Map<String, String> splitQueryOld(URL url) throws UnsupportedEncodingException {
        Map<String, String> query_pairs = new LinkedHashMap<>();
        String query = url.getQuery();
        String[] pairs = query.split("&");
        for (String pair : pairs) {
            int idx = pair.indexOf("=");
            query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"),
                    URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
        }

        return query_pairs;
    }

    /**
     * @param url
     * @return Map<String, List<String>> query_pairs
     * @throws UnsupportedEncodingException
     */
    public static Map<String, List<String>> splitQuery(URL url) throws UnsupportedEncodingException {

        final Map<String, List<String>> query_pairs = new LinkedHashMap<String, List<String>>();
        final String[] pairs = url.getQuery().split("&");

//        System.out.println(Arrays.toString(pairs));

        for (String pair : pairs) {
            final int idx = pair.indexOf("=");

            final String key = idx > 0 ? URLDecoder.decode(pair.substring(0, idx), "UTF-8") : pair;
            if (!query_pairs.containsKey(key)) {
                query_pairs.put(key, new LinkedList<String>());
            }

            //found = and there is value
            final String value = idx > 0 && pair.length() > idx + 1 ?
                    URLDecoder.decode(pair.substring(idx + 1), "UTF-8") : null;

            query_pairs.get(key).add(value);
        }

        return query_pairs;
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
