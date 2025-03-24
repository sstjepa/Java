public class Restoran {

    private Gost gost[];
    private Konobar konobar[];

    private int brGostiju;
    private int brKonobara;

    public Restoran()
    {
        brGostiju = 0;
        brKonobara = 0;
    }

    public void ugosti(Gost G)
    {
        if (brGostiju == 0)
        {
            gost=new Gost[1];
            gost[0]=G;
            brGostiju++;
        }
        else
        {
            Gost pom[] = new Gost[brGostiju+1];
            for (int i=0; i<brGostiju; i++)
            {
                pom[i]=gost[i];
                pom[i+1]=G;
                gost=pom;
            }
            brGostiju++;
        }
    }
    public void zaposli(Konobar K) {
        if (brKonobara == 0) {
            konobar = new Konobar[1];
            konobar[0] = K;
            brKonobara++;
        } else {
            Konobar pom[] = new Konobar[brKonobara + 1]; // Increase the size of pom by 1
            for (int i = 0; i < brKonobara; i++) {
                pom[i] = konobar[i];
            }
            pom[brKonobara] = K; // Assign K to the last index of pom
            konobar = pom;
            brKonobara++;
        }
    }

    public void posluzi()
    {
        //=============================LOSAA SITUACIJA
        if (brGostiju > brKonobara)
        {
            for (int i=0; i<brKonobara; i++)
            {
                gost[i].dodeliKonobara(konobar[i]);
                System.out.println("Gostu "+(i+1)+" dodeljen konobar "+(i+1));
                //dodela koliko ima konobara
            }
            for (int i=brKonobara; i<brGostiju; i++)
            {
                gost[i].dodeliKonobara(null);
                System.out.println("Gostu "+(i+1)+" nije dodeljen konobar");
            }
            //ugostacvanje u losoj situaciji
        }
        else
        //=============================DOBRAA SITUACIJA
        {
            for (int i=0; i<brGostiju; i++)
            {
                gost[i].dodeliKonobara(konobar[i]);
            }

            //ugostacvanje u dobroj situaciji
        }
    }











}
