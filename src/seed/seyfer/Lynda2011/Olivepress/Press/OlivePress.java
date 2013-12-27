package seed.seyfer.Lynda2011.Olivepress.Press;

import java.util.ArrayList;
import seed.seyfer.Lynda2011.Olivepress.Olives.Olive;

/**
 *
 * @author seyfer
 */
public class OlivePress {

    public void getOil(ArrayList<Olive> olives)
    {
        int oil = 0;

        for (Olive olive : olives) {
            oil += olive.crush();
        }

        System.out.println("You got" + oil + " units");
    }

}
