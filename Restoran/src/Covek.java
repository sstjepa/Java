public abstract class Covek {

    protected Narudzbina na;
    protected Porcija po;

    public Covek()
    {
        na = null;
        po = null;
    }

    public Covek(Narudzbina n) {
        this.na = n;
        po = null;
    }

    public abstract String feedback();


}
