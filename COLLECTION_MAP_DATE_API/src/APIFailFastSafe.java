import java.util.*;
import java.util.concurrent.*;
public class APIFailFastSafe
{
    public static void main(String[] args)
    {
    ArrayList ssd = new ArrayList();
    ssd.add(10);
    ssd.add(20);
    ssd.add(30);
    ssd.add(40);
    ssd.add(50);
        System.out.println(ssd);
//        for(int i=0;i< ssd.size();i++)
//        {
//            System.out.println(ssd.get(i));
//           // ssd.add(345);
//        }

        //fail fast
Iterator it =ssd.iterator();
while (it.hasNext())
{
    System.out.println(it.next());
   // ssd.add(23);
}

/// fail safe
        CopyOnWriteArrayList sd = new CopyOnWriteArrayList<>();
        sd.add(10);
        sd.add(20);
        sd.add(30);
        sd.add(40);
        sd.add(50);
        System.out.println(sd);
        Iterator it1 =sd.iterator();
        while (it1.hasNext())
        {
            System.out.println(it1.next());
            ssd.add(23);

        }




    }



}
