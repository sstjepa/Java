import java.io.*;
import java.util.*;
import turizam.*;
import inflacija.*;

public class Agencija<T extends Put> {
    private ArrayList<T> putevi;

    public Agencija() {
        putevi = new ArrayList<>();
    }

    public void dodajPut(T put) {
        putevi.add(put);
    }

    public void uvediRedUputeve() throws Preskupo {
        Collections.sort(putevi);
        T najskupljiPut = putevi.get(putevi.size() - 1);
        double cenaNajskupljegPuta = najskupljiPut.cena();

        for (T put : putevi) {
            put.upisDatoteka();
        }

        try {
            FileOutputStream f = new FileOutputStream("ekskluziva.bin");
            ObjectOutputStream b = new ObjectOutputStream(f);
            DataOutputStream d = new DataOutputStream(b);
            d.writeDouble(putevi.get(putevi.size() - 1).cena());
            d.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (cenaNajskupljegPuta > 2000) {
            throw new Preskupo("Cena najskupljeg puta je veća od 2000 eura!");
        }
    }
}
