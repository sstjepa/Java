package moon;

import emergency.LowCapacity;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class MoonBaseAlpha<T extends Eagle> {

    private ArrayList<T> eaglovi;

    public MoonBaseAlpha() {
        eaglovi = new ArrayList<T>();
    }

    public void unosEagle(T eagle)
    {
        eaglovi.add(eagle);
    }

    public void alert() throws LowCapacity
    {
        Collections.sort(eaglovi,Collections.reverseOrder());

        if (eaglovi.get(0).getKapacitet()<100)
        {
            throw new LowCapacity("Uzbuna prostranstvo manje od 100!!!");
        }

        try
        {
            FileOutputStream fos = new FileOutputStream("eagle.bin");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos= new DataOutputStream(bos);
            for (int i = 0; i < 3; i++)
            {
                dos.writeDouble(eaglovi.get(i).getKapacitet());
            }
            dos.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }

    public void stampaj()
    {
        System.out.println("Letelice: ");
       for (int i = 0; i < eaglovi.size(); i++)
       {
           System.out.println("Serijski broj: "+(i+1)+", Kapacitet: "+eaglovi.get(i).getKapacitet());
       }
    }

//    public void ucitaj()
//    {
//        try
//        {
//            FileInputStream fis = new FileInputStream("eagle.bin");
//            BufferedInputStream bis = new BufferedInputStream(fis);
//            DataInputStream dis = new DataInputStream(bis);
//            double cc, dd, ff;
//            cc = dis.readDouble();
//            dd = dis.readDouble();
//            ff = dis.readDouble();
//            dis.close();
//            System.out.println(cc+" "+dd+" "+ff);
//        }
//        catch (IOException e)
//        {
//            System.out.println(e);
//        }
//    }

}
