import java.util.*;
public class mapHASHTABLE
{
    public static void main(String[] args)
    {

        Hashtable ht = new Hashtable();
        ht.put(1,"in");
        ht.put(2,"hatr");
       ht.put(3,"nigga");
        System.out.println(ht);
        ht.putIfAbsent(3,"in");//it will get inserted if it not present
        ht.putIfAbsent(4,"messi");
        ht.putIfAbsent(6,"siuuuuuuuuuuuuuuuuuuuuuuuuu");

        Set r =ht.entrySet();
        Iterator ii = r.iterator();
        while (ii.hasNext())
      {
          System.out.println(ii.next());
      }
String s = "dff";
        TreeMap tm = new TreeMap();
        tm.put(1,"po");
        tm.put(2,9.0);
        tm.put(3,45);
        tm.put(4,7);
        tm.put(5,s);
        System.out.println(tm);




    }
}

