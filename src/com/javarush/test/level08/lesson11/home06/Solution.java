package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandFF = new Human("Вова", true, 75, null, null);
        Human grandMF = new Human("Маша", false, 70, null, null);

        Human grandFM = new Human("Петя", true, 65, null, null);
        Human grandMM = new Human("Настя", false, 60, null, null);

        Human father = new Human("Иван", true, 40, grandFF, grandMF);
        Human mother = new Human("Аня", false, 35, grandFM, grandMM);

        Human child1 = new Human("Сергей", true, 10, father, mother);
        Human child2 = new Human("Лена", false, 6, father, mother);
        Human child3 = new Human("Таня", false, 4, father, mother);

        System.out.println(grandFF);
        System.out.println(grandMF);
        System.out.println(grandFM);
        System.out.println(grandMM);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        //напишите тут ваш код
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;

            this.children = new ArrayList<>();

            if (father != null) {
                father.addChild(this);
            }

            if (mother != null) {
                mother.addChild(this);
            }
        }

        public void addChild(Human human) {
            children.add(human);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
