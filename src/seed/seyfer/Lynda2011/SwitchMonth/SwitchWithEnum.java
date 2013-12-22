package seed.seyfer.Lynda2011.SwitchMonth;

/**
 *
 * @author seyfer
 */
public class SwitchWithEnum {

    public void doSwitch()
    {
        Month month = Month.JANUARY;

        switch (month) {
            case JANUARY:
                System.out.println("January");
                break;
            case FEBRUARY:
                System.out.println("February");
                break;
            case MARCH:
                System.out.println("March");
                break;
            default:
                break;
        }

    }

}
