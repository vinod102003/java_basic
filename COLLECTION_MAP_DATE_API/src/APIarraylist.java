import java.util.*;

public class APIarraylist
{
    public static void main(String[] args)
    {

        ArrayList al1 = new ArrayList();
        al1.add(300);
        al1.add(100);
        al1.add(200);
        System.out.println(al1);

        System.out.println(al1.contains(200));
        int index =al1.indexOf(100);
        System.out.println(index);
        System.out.println(al1.size());
        al1.ensureCapacity(12);
        al1.trimToSize();
        al1.clear();
        System.out.println(al1);










//        System.out.println("*******************************");
//        ArrayList al2 = new ArrayList();
//        al2.add("vinod ");
//        al2.add(10);
//        al2.add("java");
//        al2.add(89.012);
//
//        System.out.println(al2);
//        System.out.println("**************************");
//        ArrayList al3 = new ArrayList();
//        al3.add(1);
//        al3.add(2);
//        al3.add(3);
//        al3.add(4);
//
//        System.out.println(al3);
//        System.out.println("after adding collection");
//
//        al3.addAll(al2);
//
//        System.out.println(al3);
//        al3.add(2,"vo");
//        System.out.println(al3);


    }
}
