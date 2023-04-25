import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

class Empolyee
{

    private String name;
    private int empo;
    Empolyee (String name ,int empo)
    {
        this.name=name;
        this.empo=empo;
    }
    public String toString()
    {
        return name;
    }
    @Override
    public void finalize()
    {
        System.out.println("Clean up work Gc before  de allocating memory from heap ");
    }

}

public class mapWEAKHASHMAP
{
    public static void main(String[] args) {
        Empolyee ee = new Empolyee("fing",406);
        WeakHashMap hm = new WeakHashMap();

        hm.put(ee,"vinod");
        ee =null;
        System.out.println(hm);
        System.out.println(ee);

        System.gc();//invocking garbage collector
        System.out.println("last line");

    }
}
