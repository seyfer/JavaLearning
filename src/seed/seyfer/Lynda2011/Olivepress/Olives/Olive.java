package seed.seyfer.Lynda2011.Olivepress.Olives;

/**
 *
 * @author seyfer
 */
public class Olive {

    public static final long BLACK = 0x000000;
    public static final long GREEN = 0x00FF00;

    public String name = "Kalamata";
    public String flavor = "Grassy";
    public long color = Olive.BLACK;
    private int oil = 3;

    public Olive()
    {

    }

    public Olive(int oil)
    {
        this.setOil(oil);
    }

    public int crush()
    {
        return this.getOil();
    }

    /**
     * @return the oil
     */
    public int getOil()
    {
        return oil;
    }

    /**
     * @param oil the oil to set
     */
    public final void setOil(int oil)
    {
        this.oil = oil;
    }
}
