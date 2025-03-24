package turizam;
import java.io.*;
public class Zimovanje implements Put {
    private String destinacija;
    private int brDana;
    private double cenaDana;
    private double cenaSkiPass;


    public Zimovanje(String destinacija, int brDana, double cenaDana, double cenaSkiPass) {
        if(brDana < 2)
        {
            System.out.println("Broj dana mora biti barem 2!");
            brDana = 2;
        }
        this.destinacija = destinacija;
        this.brDana = brDana;
        this.cenaDana = cenaDana;
        this.cenaSkiPass = cenaSkiPass;
    }
    public double cena() {
        return (brDana*cenaDana)+(cenaSkiPass*(brDana-2));
    }

    public String uString()
    {
        double temp = cena();
        String tempStr =Double.toString(temp)  ;
        return tempStr;
    }

    public int compareTo(Put put) {
        return Double.compare(this.cena(), put.cena());
    }

    public void upisDatoteka() {
        try {
            FileWriter writer = new FileWriter(uString()+ ".txt");
            writer.write(destinacija.split(" ")[0]);
            writer.close();

        }catch (IOException e) {
            System.out.println("Doslo je do izuzetka " + e);
        }
    }
}
