package prevoz;

import java.io.*;

public class SUSAuto extends Auto{

    private String tipGoriva;

    public SUSAuto(int konjaza, int obrtniMoment, String tipGoriva) {
        super(konjaza, obrtniMoment);
        this.tipGoriva = tipGoriva;
    }

    public void upisiPodatke()
    {
        try
        {
            FileWriter fr =new FileWriter(getRedniBr()+"txt");
            BufferedWriter bw =new BufferedWriter(fr);
            bw.write("Konjaza: "+getKonjaza()+"\n");
            bw.write("Obrtni Moment: "+getObrtniMoment()+"\n");
            bw.write("Tip Goriva: "+tipGoriva+"\n");
            bw.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }

    public double brutalnost() {
        double brutalnost= getObrtniMoment()*getKonjaza();
        if (tipGoriva.equals("dizel"))
        {
            return brutalnost*1.3;
        }
        else if (tipGoriva.equals("beznin"))
        {
            return brutalnost*1.5;
        }

        return brutalnost;
    }
}
