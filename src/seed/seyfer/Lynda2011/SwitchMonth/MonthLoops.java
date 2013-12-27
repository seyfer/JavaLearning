package seed.seyfer.Lynda2011.SwitchMonth;

/**
 * learn loops
 * @author seyfer
 */
public class MonthLoops {

    private String[] _months;

    public MonthLoops()
    {
        this._months = new String[]{"april", "may", "june"};
    }

    /**
     * iterate with for
     */
    public void withFor()
    {
        for (int i = 0; i < this.getMonths().length; i++) {
            System.out.println(this.getMonths()[i]);
        }

        for (String _month : this.getMonths()) {
            System.out.println(_month);
        }
    }

    /**
     * iterate with while
     */
    public void withWhile()
    {
        classicWhile();
        doWhile();
    }

    private void doWhile()
    {
        int counter = 0;
        do {
            System.out.println(this.getMonths()[counter]);
            counter++;
        }
        while (counter < this.getMonths().length);
    }

    private void classicWhile()
    {
        int counter = 0;
        while (counter < this.getMonths().length) {
            System.out.println(this.getMonths()[counter]);
            counter++;
        }
    }

    /**
     * @return the _months
     */
    public String[] getMonths()
    {
        return this._months;
    }

    /**
     * @param _months the _months to set
     */
    public void setMonths(String[] _months)
    {
        this._months = _months;
    }

}
