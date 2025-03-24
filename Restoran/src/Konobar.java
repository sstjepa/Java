public class Konobar extends Covek {

    private String ime;
    private Double promili;

    public Konobar(String i) {
        this.ime = i;
        promili = Math.random()*3;
        System.out.println("Napravljen konobar, "+ime+", promili: "+promili);
    }

    public void primi(Narudzbina n)
    {
        this.na=n;
    }


    public Porcija usluzi()
    {
        return  po;
    }

    public String feedback() {
        return null;
    }

}
