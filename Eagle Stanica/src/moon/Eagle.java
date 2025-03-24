package moon;

import javax.swing.plaf.IconUIResource;
import java.io.*;

public class Eagle implements Comparable<Eagle> {
    private double kapacitet;

    public Eagle(int serijskiBr)
    {
        try {
            FileReader fr = new FileReader(serijskiBr+".txt");
            BufferedReader br = new BufferedReader(fr);
            this.kapacitet = Double.parseDouble(br.readLine());
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public double getKapacitet() {
        return kapacitet;
    }

    public int compareTo(Eagle o) {
        return Double.compare(this.kapacitet, o.kapacitet);
    }
}
