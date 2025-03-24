
import ulazIzlaz.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        float nizFlt[];
        double nizDbl[];
        int brFlt;
        int brDbl;
        float sumaFlt =0;
        double sumaDbl = 0;

        try {
            FileReader fr = new FileReader("FNiz.txt");
            Citac c = new Citac(fr);
            brFlt= c.procitajInt();
            nizFlt= new float[brFlt];
            for(int i=0; i<brFlt; i++){
                nizFlt[i]=c.procitajFloat();
            }
            c.close();

            for(int i=0; i<brFlt; i++){
                sumaFlt+=nizFlt[i];

            }
            System.out.println("Suma FLoat je :" + sumaFlt);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException n) {
            System.out.println(n);
        }

        try {
            InputStreamReader tastatura = new InputStreamReader(System.in);
            Citac c = new Citac(tastatura);

            brDbl= c.procitajInt();
            nizDbl= new double[brDbl];
            System.out.println("Inicijalizovan niz duzine: "+brDbl);

            for(int i=0; i<brDbl; i++){
                nizDbl[i]=c.procitajDouble();
            }
            c.close();

            for(int i=0; i<brDbl; i++){
                sumaDbl+=nizDbl[i];
            }
            System.out.println("Suma Double je : " + sumaDbl);

        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException n) {
            System.out.println(n);
        }

    }
}