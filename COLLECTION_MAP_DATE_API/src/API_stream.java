import java.util.*;
//import java.util.stream.Stream;
import java.util.function.Function;
import java.util.stream.*;

public class API_stream
{
    public static void main(String[] args)
    {

        List<Integer> list = Arrays.asList(12,6,2,13,4,5,6);
        //System.out.println(list);

//        Stream streamData  =list.stream();
//        streamData.forEach(n-> System.out.println(n));
//        System.out.println("**********************************");
//        Stream streamData1= list.stream();
//        long bb =streamData1.count();
//        System.out.println(bb);
//        System.out.println("-------------------------------");

        Stream streamData2= list.stream();
        Stream<Integer> streamData3 =streamData2.sorted();
               //streamData3.forEach(i-> System.out.println(i));

                Stream <Integer> ss =  streamData3.map(n -> n*2);

                ss.forEach(n-> System.out.println(n));

        System.out.println("********************************************");
//                  Stream<Integer> s=list.stream();
//                  Stream<Integer> s1 =s.filter(n-> n%2==0);
//                    Stream<Integer> s2=s1.map(n-> n+3);
//                    Stream<Integer> s3 =s2.sorted();

//
//        Predicate<Integer> pp = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                if(integer%2==0)
//                return true;
//                else return false;
//
//            }
//        };
//        Function <Integer,Integer>ff = new Function<Integer,Integer>() {
//            @Override
//            public Integer apply(Integer o) {
//                return o*5;
//            }
//        };



        Stream<Integer> finalstream = list.stream().filter(n-> n%2==0).sorted().map(n->n*3);

                    finalstream.forEach(n-> System.out.println(n));
    }



}
