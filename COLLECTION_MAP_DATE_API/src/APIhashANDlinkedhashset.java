import java.util.*;
public class APIhashANDlinkedhashset
{
    public static void main(String[] args) {
        HashSet hh = new HashSet();
   hh.add(100);
   hh.add(20);
   hh.add(30);
   hh.add(44);
   hh.add(44);
   hh.add("hj");
// no hetro and no dupli
        System.out.println(hh);
        LinkedHashSet hh1 = new LinkedHashSet();
        hh1.add(100);
        hh1.add(20);
        hh1.add(30);
        hh1.add(44);
        hh1.add(44);
        hh1.add("hj");
        System.out.println(hh1);

    }


}
