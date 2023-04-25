import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class api_collections
{
    public static void main(String[] args)
    {

        ArrayList al = new ArrayList();
        al.add(10000);
        al.add(10);
        al.add(1);
        al.add(1000);
        al.add(100);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("vinod");
        al1.add("google");
        al1.add("java");
        System.out.println(al1);
        Collections.sort(al1);
        System.out.println(al1);

        ArrayList al2 = new ArrayList();

        al2.add(1);
        al2.add(1);
        al2.add(1);
        al2.add(10);
        al2.add(100);
        al2.add(1000);
        al2.add(10000);
        System.out.println(al2);

        int index = Collections.binarySearch(al2,100);// we can do binary search only when the given data is in sorted order.
        int index1 = Collections.binarySearch(al2,1010);

        System.out.println(index);// we will get the index of given value.
        System.out.println(index1);// it will give -ve value.
        System.out.println(al2);

        Collections.rotate(al2,2);
        System.out.println(al2);

        Collections.shuffle(al2);
        System.out.println(al2);

        System.out.println(Collections.frequency(al2,1));




    }



}
