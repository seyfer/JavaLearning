package com.javarush.test.level13.lesson11.bonus02;

public class Person implements RepkaItem {
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    @Override
    public String getNamePadezh() {
        return namePadezh;
    }

    public void pull(Person person) {
        //'<name> за <person>'
        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.append(" за ").append(person.getNamePadezh());

        System.out.println(stringBuilder);
    }
}
