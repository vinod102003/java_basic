import  java.util.*;
public class APItreeset
{
    public static void main(String[] args) {
        TreeSet tt = new TreeSet();
        tt.add(100);
        tt.add(50);
        tt.add(150);
        tt.add(75);
        tt.add(25);
        tt.add(125);
        tt.add(175);
        System.out.println(tt);
        tt.add(175);
        System.out.println(tt);// duplicates are not allowed
        System.out.println(tt.higher(50));
        System.out.println(tt.lower(50));
        System.out.println(tt.lower(120));
        System.out.println(tt.ceiling(40));
        System.out.println(tt.floor(40));
        System.out.println(tt.ceiling(150));
        System.out.println(tt.floor(150));


    }




}



