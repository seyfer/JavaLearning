package com.javarush.test.level15.lesson12.home05;

/**
 * Created by seyfer on 2/4/16.
 */
public class SubSolution extends Solution {

    public SubSolution(String spub) {
        super(spub);
    }

    public SubSolution(int ipub) {
        super(ipub);
    }

    public SubSolution(char chpub) {
        super(chpub);
    }

    private SubSolution(double dpriv) {
    }

    private SubSolution(boolean bpriv) {
    }

    private SubSolution(Short shpriv) {
    }

    protected SubSolution(String sprot, int iprot) {
        super(sprot, iprot);
    }

    protected SubSolution(String sprot, char chprot) {
        super(sprot, chprot);
    }

    protected SubSolution(int iprot, char chprot) {
        super(iprot, chprot);
    }

    SubSolution(String s, char ch, int i) {
        super(s, ch, i);
    }

    SubSolution(String s, int i, char ch) {
        super(s, i, ch);
    }

    SubSolution() {
        super();
    }
}
