public class Porcija {

    private String jelo;
    private String pice;
    private String desert;

    public Porcija(String jelo, String pice, String desert) {
        this.jelo = jelo;
        this.pice = pice;
        this.desert = desert;
    }

    public String getJelo() {
        return jelo;
    }

    public String getPice() {
        return pice;
    }

    public String getDesert() {
        return desert;
    }

    public void setJelo(String jelo) {
        this.jelo = jelo;
    }

    public void setPice(String pice) {
        this.pice = pice;
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }

    public String toString()
    {
        return jelo+" "+pice+" "+desert;
    }

}
