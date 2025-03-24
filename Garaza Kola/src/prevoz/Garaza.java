package prevoz;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Garaza {
    private ArrayList<Auto> automobili;

    public Garaza()
    {
        automobili = new ArrayList<Auto>();
    }

    public void ubaciAuto(Auto a)
    {
        automobili.add(a);
    }

    public void megaTest()
    {
        if (automobili.isEmpty())
        {
            System.out.println("Garaza je prazna.");
            return;
        }

        Collections.sort(automobili, Collections.reverseOrder());

        try
        {
            FileOutputStream f = new FileOutputStream("bruteforce.bin");
            DataOutputStream d = new DataOutputStream(f);
            d.writeDouble(automobili.get(0).brutalnost());
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }

    public void stampaj()
    {
        System.out.println("Vozila: ");
        for (int i = 0; i < automobili.size(); i++)
        {
            Auto a = automobili.get(i);
            System.out.println("Redni broj: " + a.getRedniBr());
            System.out.println("Konjaza: " + a.getKonjaza());
            System.out.println("Obrtni moment: " + a.getObrtniMoment());
            System.out.println("Brutalnost: " + a.brutalnost());
            System.out.println("----------------------------------");
        }
    }

    public void ucitaj()
    {
        try
        {
            FileInputStream f = new FileInputStream("bruteforce.bin");
            DataInputStream d = new DataInputStream(f);
            double cc = d.readDouble();
            d.close();
            System.out.println("U Fajlu: " + cc);

        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }

}
