package com.javarush.test.level14.lesson08.home05;

/**
 * Created by seyfer on 1/25/16.
 */
public class Mouse implements CompItem {
    @Override
    public String getName() {
        Class<?> enclosingClass = getClass().getEnclosingClass();
        if (enclosingClass != null) {
            return enclosingClass.getSimpleName();
        } else {
            return getClass().getSimpleName();
        }
    }
}
