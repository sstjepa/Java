public class Gost extends Covek{

    private Konobar mojKonobar;

    public Gost() {
        super();
    }

    public Gost(Narudzbina n) {
        super(n);
    }

    public Gost(String n)
    {
        super(new Narudzbina(n));
        System.out.println("Napravljen gost, naruzdbina:  "+na);
    }

    public void primi(Konobar k)
    {
        po=this.mojKonobar.usluzi();
    }

    public void izjasniSe()
    {
        this.mojKonobar.primi(this.na);
    }

    //setter za konobara

    public void dodeliKonobara(Konobar mojKonobar) {
        this.mojKonobar = mojKonobar;
    }

    public String feedback() {
        if (mojKonobar == null) {
            return "Prijava!!!!";
        }
        else
        {
            return  null;
        }
    }
}
