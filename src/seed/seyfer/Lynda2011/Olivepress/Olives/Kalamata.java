package seed.seyfer.Lynda2011.Olivepress.Olives;

public class Kalamata extends Olive {

    public Kalamata()
    {
        super(2);
        this.name = "Kalamata";
        this.flavor = "Grassy";
        this.color = Olive.BLACK;
    }

    public Kalamata(int oil)
    {
        super(oil);
    }

    @Override
    public int crush()
    {
        return super.crush();
        //To change body of generated methods, choose Tools | Templates.
    }

}
