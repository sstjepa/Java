package ulazIzlaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class Citac extends BufferedReader {


    public Citac(Reader in) {
        super(in);
    }

    public int procitajInt() throws NumberFormatException, IOException
    {
        return Integer.parseInt(super.readLine());
    }
    public float procitajFloat() throws NumberFormatException, IOException
    {
        return Float.parseFloat(super.readLine());
    }
    public double procitajDouble() throws NumberFormatException, IOException
    {
        return Double.parseDouble(super.readLine());
    }
}
