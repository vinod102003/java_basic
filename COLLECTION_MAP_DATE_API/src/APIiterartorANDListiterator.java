import  java.util.*;
public class APIiterartorANDListiterator
{
    public static void main(String[] args)
    {

    ArrayList as = new ArrayList();
    as.add(12);
    as.add(122);
    as.add(134);
    as.add(129);
   // as.add("df");
        System.out.println(as);

//
//    for (int i=0;i< as.size();i++)
//    {
//        Object o =as.get(i);
//        System.out.println(o);
//    }
//    for (Object o:as)// when index based access is not allowed
//    {
//        System.out.println(o);
//
//    }
// we fetch data with for loops but is not recommended we have method called iterator to fetch data
        Iterator itr1=as.iterator();
        while (itr1.hasNext())
        {
     // Object o = u.next();
            Integer o ;
            o=(Integer) itr1.next();

            System.out.println(o);
        }

        ListIterator itr2 = as.listIterator(as.size());
       while (itr2.hasPrevious()){
           Object o =itr2.previous();
           System.out.println(o);



        }



    }
}



