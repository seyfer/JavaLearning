package Lynda2011.Calculator;

import java.io.*;

/**
 *
 * @author seyfer
 */
public class Calculator {

    public static double main(String[] args)
    {
        System.out.println("Calculator");

        return processInput();
    }

    private static double processInput() throws NumberFormatException
    {
        String s1 = getInput("Enter num1: ");
        String operator = getInput("Enter operator: ");
        String s2 = getInput("Enter num2: ");

        if (s1 == null && s2 == null) {
            return 0;
        }

        System.out.println(s1);
        System.out.println(s2);

        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);

        double result = calcResult(operator, d1, d2);

        System.out.println("result " + result);

        return result;
    }

    /**
     * calculate there
     *
     * @param operator
     * @param d1
     * @param d2
     * @return
     */
    private static double calcResult(String operator, double d1, double d2)
    {
        double result;
        switch (operator) {
            case "+":
                result = add(d1, d2);
                break;
            case "-":
                result = substract(d1, d2);
                break;
            case "*":
                result = multyply(d1, d2);
                break;
            case "/":
                result = divide(d1, d2);
                break;
            default:
                result = add(d1, d2);
                break;
        }
        return result;
    }

    /**
     * get command line input
     *
     * @param promt
     * @return
     */
    private static String getInput(String promt)
    {

        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print(promt);
        System.out.flush();

        try {
            return stdin.readLine();
        }
        catch (IOException e) {
            return "Error " + e.getMessage();
        }

    }

    private static double add(double d1, double d2)
    {
        return d1 + d2;
    }

    private static double substract(double d1, double d2)
    {
        return d1 - d2;
    }

    private static double divide(double d1, double d2)
    {
        return d1 - d2;
    }

    private static double multyply(double d1, double d2)
    {
        return d1 - d2;
    }

    /**
     * add multy values
     *
     * @param values
     * @return
     */
    public static double addMultipleValues(double... values)
    {
        if (values == null) {
            return 0;
        }

        double result = 0d;

        for (double d : values) {
            result += d;
        }

        return result;
    }

}
