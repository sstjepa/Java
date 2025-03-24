package prevoz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ElektricniAuto extends Auto {

    private int kapcitet;

    public ElektricniAuto(int konjaza, int obrtniMoment, int kapcitet) {
        super(konjaza, obrtniMoment);
        this.kapcitet = kapcitet;
    }

    public void upisiPodatke()
    {
        try
        {
            FileWriter fr =new FileWriter(getRedniBr()+"txt");
            BufferedWriter bw =new BufferedWriter(fr);
            bw.write("Konjaza: "+getKonjaza()+"\n");
            bw.write("Obrtni Moment: "+getObrtniMoment()+"\n");
            bw.write("Kapacitet baterije: "+kapcitet+"\n");
            bw.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }

    public double brutalnost() {
        return getKonjaza()*getObrtniMoment()+kapcitet;
    }
}
