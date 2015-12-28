package seed.seyfer.Lynda2011.Olivepress.Press;

import java.util.Collection;

import seed.seyfer.Lynda2011.Olivepress.Olives.Olive;

/**
 * @author seyfer
 */
public interface Press {

    void getOil(Collection<Olive> olives);

    int getTotalOil();

}
