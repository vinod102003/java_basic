import java.util.*;

public class generics
{
    public static void main(String[] args)
    {
        String ar[]= new String[10];
        ar[0]="er";
        ar[1]="23";
        //ar[1]=4;//ce
        String name=ar[0];
        String name1=ar[1];

        ArrayList<String>al = new ArrayList<String>();

       // al.add(12);
        al.add("vinod");
        al.add("gg");
        al.add("rt");

        String s1 =  al.get(0);
        String s2 = (String) al.get(1);
        String s3 = (String) al.get(2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);






        }
}
