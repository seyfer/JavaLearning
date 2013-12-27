package seed.seyfer.Lynda2011.Olivepress.Press;

import java.util.ArrayList;
import seed.seyfer.Lynda2011.Olivepress.Olives.Olive;

/**
 *
 * @author seyfer
 */
public class OlivePress {

    private int totalOil = 0;

    public int getTotalOil()
    {
        return totalOil;
    }

    private void setTotalOil(int totalOil)
    {
        this.totalOil += totalOil;
    }

    public void getOil(ArrayList<Olive> olives)
    {
        int oil = 0;

        for (Olive olive : olives) {
            oil += olive.crush();
        }

        this.setTotalOil(oil);

    }

}
