package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.0d, "ff");
        labels.put(1.1d, "ff1");
        labels.put(1.2d, "ff2");
        labels.put(1.3d, "ff3");
        labels.put(1.4d, "ff4");
    }

    public static void main(String[] args) {

        System.out.println(labels);
    }
}
