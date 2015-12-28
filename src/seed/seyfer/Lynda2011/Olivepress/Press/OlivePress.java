package seed.seyfer.Lynda2011.Olivepress.Press;

import java.util.Collection;

import seed.seyfer.Lynda2011.Olivepress.Olives.*;

/**
 * @author seyfer
 */
public class OlivePress implements Press {

    private int totalOil = 0;

    @Override
    public int getTotalOil() {
        return totalOil;
    }

    private void setTotalOil(int totalOil) {
        this.totalOil += totalOil;
    }

    @Override
    public void getOil(Collection<Olive> olives) {
        int oil = 0;

        for (Olive olive : olives) {
            oil += olive.crush();
        }

        this.setTotalOil(oil);

    }

}
