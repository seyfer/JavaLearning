package seed.seyfer.Lynda2011.Olivepress.Olives;

/**
 *
 * @author seyfer
 */
public class Olive {

    public String name = "Kalamata";
    public String flavor = "Grassy";
    public long color = 0x000000;
    private int oil = 3;

    public Olive()
    {

    }

    public Olive(int oil)
    {
        this.oil = oil;
    }

    public int crush()
    {
        return this.oil;
    }
}
