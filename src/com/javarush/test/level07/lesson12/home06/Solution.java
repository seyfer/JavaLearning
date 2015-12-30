package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

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
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        //напишите тут ваш код
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
