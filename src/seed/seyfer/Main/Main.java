package seed.seyfer.Main;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import seed.seyfer.Lynda2011.Calculator.Calculator;
import seed.seyfer.Lynda2011.Olivepress.Olives.Kalamata;
import seed.seyfer.Lynda2011.Olivepress.Olives.Ligurian;
import seed.seyfer.Lynda2011.Olivepress.Olives.Olive;
import seed.seyfer.Lynda2011.Olivepress.Press.OlivePress;
import seed.seyfer.Lynda2011.SwitchMonth.MonthLoops;
import seed.seyfer.Lynda2011.SwitchMonth.SwitchWithEnum;
import seed.seyfer.Lynda2011.SwitchMonth.SwitchWithoutEnum;
import seed.seyfer.Lynda2011.files.CopyFile;

/**
 *
 * @author seyfer
 */
public class Main {

    public static void main(String[] args)
    {
        try {
            System.out.println("Main");

//            double result = Calculator.main(args);
//            double resultMult = Calculator.addMultipleValues(1, 2, 3);
//            System.out.println(resultMult);
//
//        SwitchWithoutEnum monthSwitcher = new SwitchWithoutEnum();
//        monthSwitcher.doSwitch(result);
//
//        SwitchWithEnum enumSwitcher = new SwitchWithEnum();
//        enumSwitcher.doSwitch();
//        MonthLoops monthLooper = new MonthLoops();
//        monthLooper.withFor();
//        monthLooper.withWhile();
            ArrayList<Olive> olives = new ArrayList<Olive>();

            Olive olive;

            olive = new Kalamata();
            System.out.println(olive.name);
            olives.add(olive);

            olive = new Ligurian();
            System.out.println(olive.name);
            olives.add(olive);

            OlivePress press = new OlivePress();
            press.getOil(olives);

            System.out.println("You got" + press.getTotalOil() + " units");

            press.getOil(olives);

            System.out.println("You got" + press.getTotalOil() + " units");

            CopyFile.main(args);

        }
        catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    private static Double[] stringsToDuble (String[] strings) {
//        Double[] doubles;
//        for (String string : strings) {
//
//        }
//    }
}
