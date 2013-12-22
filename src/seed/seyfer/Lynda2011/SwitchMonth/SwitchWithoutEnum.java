package seed.seyfer.Lynda2011.SwitchMonth;

/**
 *
 * @author seyfer
 */
public class SwitchWithoutEnum {

    public void doSwitch(double monthNum)
    {
        int month = new Double(monthNum).intValue();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                break;
        }

    }

}
