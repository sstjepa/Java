package turizam;
import java.io.*;
public class Letovanje implements Put {

    private String destinacija;
    private int brDana;
    private double cenaDana;


    public Letovanje(String destinacija, int brDana, double cenaDana) {
        this.destinacija = destinacija;
        this.brDana=brDana;
        this.cenaDana=cenaDana;
    }

    public double cena() {
        double inflacija=1+Math.random();
        return brDana*cenaDana*inflacija;
    }

    public String uString()
    {
        double temp = cena();
        String tempStr =Double.toString(temp)  ;
        return tempStr;
    }

    public int compareTo(Put put) {
        return  Double.compare(this.cena(), put.cena());
    }

    public void upisDatoteka() {
        try {
            FileWriter writer = new FileWriter(uString()+ ".txt");
            writer.write(destinacija.split(" ")[0]);
            writer.close();
        } catch (IOException e) {
            System.out.println("Doslo je do izuzetka " + e);
        }
    }
}
