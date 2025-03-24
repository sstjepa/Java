import moon.*;
import emergency.*;

public class Main {
    public static void main(String[] args) {
        MoonBaseAlpha baseAlpha = new MoonBaseAlpha();

        baseAlpha.unosEagle(new Eagle(1));
        baseAlpha.unosEagle(new Eagle(2));
        baseAlpha.unosEagle(new Eagle(3));
        baseAlpha.unosEagle(new Eagle(4));

        try
        {
            baseAlpha.alert();
        }
        catch (LowCapacity e)
        {
            System.out.println(e);
        }

        baseAlpha.stampaj();

        baseAlpha.ucitaj();

    }
}
