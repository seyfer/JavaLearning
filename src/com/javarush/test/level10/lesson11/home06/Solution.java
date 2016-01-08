package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human {
        //напишите тут ваши переменные и конструкторы
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;
        private String address;

        //1
        public Human(String name, boolean sex, int age, Human father, Human mother, String address) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
            this.address = address;
        }

        //2
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        //3
        public Human(String name, boolean sex, int age, String address) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.address = address;
        }

        //4
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        //5
        public Human(String name) {
            this.name = name;
        }

        //6
        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        //7
        public Human(String name, boolean sex, int age, Human father) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
        }

        //8
        public Human(String name, boolean sex, int age, Human father, String address) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.address = address;
        }

        //9
        public Human(String name, Human mother) {
            this.name = name;
            this.mother = mother;
        }

        //10
        public Human(String name, int age, Human father, Human mother, String address) {
            this.name = name;
            this.age = age;
            this.father = father;
            this.mother = mother;
            this.address = address;
        }
    }
}
