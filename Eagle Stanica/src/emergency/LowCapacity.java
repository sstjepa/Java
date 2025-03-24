package emergency;

public class LowCapacity extends Exception{
    public LowCapacity(String poruka)
    {
        super(poruka);
    }
}
