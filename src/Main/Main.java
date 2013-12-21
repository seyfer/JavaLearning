package Main;

import Lynda2011.Calculator.Calculator;
import Lynda2011.SwitchMonth.MonthLoops;
import Lynda2011.SwitchMonth.SwitchWithEnum;
import Lynda2011.SwitchMonth.SwitchWithoutEnum;

/**
 *
 * @author seyfer
 */
public class Main {

    public static void main(String[] args)
    {
        System.out.println("Main");

        double result = Calculator.main(args);
        double resultMult = Calculator.addMultipleValues(1,2,3);

        System.out.println(resultMult);
//
//        SwitchWithoutEnum monthSwitcher = new SwitchWithoutEnum();
//        monthSwitcher.doSwitch(result);
//
//        SwitchWithEnum enumSwitcher = new SwitchWithEnum();
//        enumSwitcher.doSwitch();
//        MonthLoops monthLooper = new MonthLoops();
//        monthLooper.withFor();
//        monthLooper.withWhile();
    }

//    private static Double[] stringsToDuble (String[] strings) {
//        Double[] doubles;
//        for (String string : strings) {
//
//        }
//    }
}
