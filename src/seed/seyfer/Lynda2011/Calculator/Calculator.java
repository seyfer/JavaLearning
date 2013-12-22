package seed.seyfer.Lynda2011.Calculator;

import seed.seyfer.Lynda2011.Helpers.MathHelper;
import seed.seyfer.Lynda2011.Helpers.InputHelper;

/**
 *
 * @author seyfer
 */
public class Calculator {

    public static double main(String[] args) throws Exception
    {
        System.out.println("Calculator");

        return processInput();
    }

    private static double processInput() throws NumberFormatException, Exception
    {
        String s1 = InputHelper.getInput("Enter num1: ");
        String operator = InputHelper.getInput("Enter operator: ");
        String s2 = InputHelper.getInput("Enter num2: ");

        if (s1 == null && s2 == null) {
            return 0;
        }

        System.out.println(s1);
        System.out.println(s2);

        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);

        double result;

        result = calcResult(operator, d1, d2);

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
    private static double calcResult(String operator, double d1, double d2) throws Exception
    {
        double result;
        switch (operator) {
            case "+":
                result = MathHelper.add(d1, d2);
                break;
            case "-":
                result = MathHelper.substract(d1, d2);
                break;
            case "*":
                result = MathHelper.multyply(d1, d2);
                break;
            case "/":
                result = MathHelper.divide(d1, d2);
                break;
            default:
                throw new Exception("invalid operator");
        }

        return result;
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
