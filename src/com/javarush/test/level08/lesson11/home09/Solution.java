package com.javarush.test.level08.lesson11.home09;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        String string = "December 30 2000";
        System.out.println(isDateOdd(string));
    }

    public static boolean isDateOdd(String date) throws ParseException {

        DateFormat format = new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH);
        Date currentTime = format.parse(date);

        DateFormat yearFormat = new SimpleDateFormat("yyyy", Locale.ENGLISH);
        String currentYear = yearFormat.format(currentTime);

//        System.out.println(currentTime);
//        System.out.println(currentYear);

        DateFormat formatStart = new SimpleDateFormat("yyyy", Locale.ENGLISH);
        Date yearStartTime = formatStart.parse(currentYear);
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);
        yearStartTime.setDate(0);
        yearStartTime.setMonth(0);

//        System.out.println(yearStartTime);

        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance / msDay); //количество целых дней

//        System.out.println("Days from start of year: " + dayCount);

        if (dayCount == 0 || dayCount % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
