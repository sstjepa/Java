import java.util.*;
import java.io.*;
import turizam.*;
import inflacija.*;

public class Main {
    public static void main(String[] args) {
        Agencija<Put> agencija = new Agencija<>();

        Scanner tastatura = new Scanner(System.in);

        System.out.println("Unesite podatke za letovanje (destinacija, broj dana, cena po danu):");
        String destinacija = tastatura.nextLine();
        int brojDanaLetovanje = tastatura.nextInt();
        double cenaPoDanuLetovanje = tastatura.nextDouble();
        tastatura.nextLine();
        Letovanje letovanje = new Letovanje(destinacija, brojDanaLetovanje, cenaPoDanuLetovanje);
        agencija.dodajPut(letovanje);

        System.out.println("Unesite podatke za zimovanje (destinacija, broj dana, cena po danu, cena ski pasa po danu):");
        String destinacijaZimovanje = tastatura.nextLine();
        int brojDanaZimovanje = tastatura.nextInt();
        double cenaPoDanuZimovanje = tastatura.nextDouble();
        double cenaSkiPasaZimovanje = tastatura.nextDouble();
        tastatura.nextLine();
        Zimovanje zimovanje = new Zimovanje(destinacijaZimovanje, brojDanaZimovanje, cenaPoDanuZimovanje, cenaSkiPasaZimovanje);
        agencija.dodajPut(zimovanje);

        try
        {
            agencija.uvediRedUputeve();
        }
        catch(Preskupo poruka)
        {
            System.err.println("Izuzetak: " + poruka.getMessage());
        }

//        agencija.Stampaj();

        tastatura.close();
    }
}