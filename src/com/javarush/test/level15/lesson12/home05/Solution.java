package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution(String spub) {
    }

    public Solution(int ipub) {
    }

    public Solution(char chpub) {
    }

    private Solution(double dpriv) {
    }

    private Solution(boolean bpriv) {
    }

    private Solution(Short shpriv) {
    }

    protected Solution(String sprot, int iprot) {
    }

    protected Solution(String sprot, char chprot) {
    }

    protected Solution(int iprot, char chprot) {
    }

    Solution(String s, char ch, int i) {
    }

    Solution(String s, int i, char ch) {
    }

    Solution() {
    }
}

