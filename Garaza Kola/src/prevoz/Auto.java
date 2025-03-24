package prevoz;

public abstract class Auto implements Comparable<Auto>{
    private int konjaza;
    private int obrtniMoment;
    private int redniBr=1;

    public abstract double brutalnost();

    public Auto(int konjaza, int obrtniMoment) {
        this.konjaza = konjaza;
        this.obrtniMoment = obrtniMoment;
        this.redniBr = redniBr++;
    }

    public int getKonjaza() {
        return konjaza;
    }

    public int getObrtniMoment() {
        return obrtniMoment;
    }

    public int getRedniBr() {
        return redniBr;
    }
    public int compareTo(Auto o)
    {
        return Double.compare(this.brutalnost(), o.brutalnost());
    }

}
