package com.javarush.test.level14.lesson06.home01;

/**
 * Created by seyfer on 1/23/16.
 */
public class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 40;
    }

    public String getDescription() {
        return super.getDescription() +
                " Моя страна - " + Country.RUSSIA +
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
