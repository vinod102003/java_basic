import java.util.*;

public class mapHASHMAP
{
    public static void main(String[] args)
   {
        //Map hm = new HashMap(); // also can be writen this to get polymorphism
        HashMap hm = new HashMap();// no order of insertion

        hm.put(01,"vinod");//entry
        hm.put(02,"messi");
        hm.put(03,"zaltan");
        hm.put(04,"vinod");
        hm.put(null,null);
        hm.put("vinod",01);
        hm.put("messi",02);
        System.out.println(hm);
        System.out.println( hm.get(4));
        Set s =hm.keySet();
        Iterator itr1 =s.iterator();// we will get only keys
        while (itr1.hasNext())
        {
             System.out.println(itr1.next());
        }
        System.out.println("*******************************************");
        Collection c =hm.values();// we will get only values
        Iterator  itr2 =c.iterator();
        while (itr2.hasNext()) {
             System.out.println(itr2.next());
        }
        System.out.println("**********************************************");
        Set ss=hm.entrySet();
        Iterator i =ss.iterator();
        while (i.hasNext())
        {
           //  System.out.println(i.next());
             Map.Entry ii =  (Map.Entry)i.next();
             //System.out.println(ii);
             System.out.println(ii.getKey()+":"+ii.getValue());
        }
        System.out.println("**************************************************");
        LinkedHashMap lm = new LinkedHashMap();//order of insertion is maintained

        lm.put(01,"vinod");//entry
        lm.put(02,"messi");
        lm.put(03,"zaltan");
        lm.put(04,"zaltan");
        lm.put(null,null);
        lm.put("vinod",01);
        lm.put("messi",02);
        System.out.println(lm);
    }

}
