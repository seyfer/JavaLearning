package seed.seyfer.Main;

import seed.seyfer.Lynda2011.files.ReadNetworkFile;
import seed.seyfer.Lynda2011.files.ReadXML;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author seyfer
 */
public class Main {

    public static void main(String[] args) {
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
//            ArrayList<Olive> olives = new ArrayList<Olive>();
//
//            Olive olive;
//
//            olive = new Kalamata();
//            System.out.println(olive.name);
//            olives.add(olive);
//
//            olive = new Ligurian();
//            System.out.println(olive.name);
//            olives.add(olive);
//
//            OlivePress press = new OlivePress();
//            press.getOil(olives);
//
//            System.out.println("You got" + press.getTotalOil() + " units");
//
//            press.getOil(olives);
//
//            System.out.println("You got" + press.getTotalOil() + " units");

//            CopyFile copyFile = new CopyFile();
//            copyFile.copyWithFileUtils();

            ReadNetworkFile read = new ReadNetworkFile();
            read.get();

            ReadXML xml = new ReadXML();
            xml.get();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
