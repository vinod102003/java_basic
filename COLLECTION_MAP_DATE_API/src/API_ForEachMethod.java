import java.util.*;
import java.util.function.Consumer;

public class API_ForEachMethod
{
    public static void main(String[] args)
    {

//        List<Integer> al = new ArrayList<Integer>();
//                al.add(2);
//                al.add(4);
//                al.add(14);
//                al.add(2);
//                al.add(9);
//                al.add(8);
//        System.out.println(al);
        // we can write it as this also
        List<Integer> al = Arrays.asList(2,4,14,2,9,8);
//        Consumer<Integer> con = new Consumer<Integer>()
//        {
//            @Override
//            public void accept(Integer i)
//            {
//                System.out.println(i+11);
//            }
//        };
//        al.forEach(con);
        //Consumer<Integer> con =  n -> System.out.println(n);
        al.forEach(i-> System.out.println(i));

        List <String> al2= Arrays.asList("nfs","valo","soul city","pubg");//here we should give reference as lit only to use as.list method
        al2.forEach(vbnhb-> System.out.println(vbnhb));
//        for (int u :al)
//        {
//            System.out.println(u);
//        }
    }








}
