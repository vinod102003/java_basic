import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ss implements Comparable<ss>
{
    int age;
    int marks;
    String name;
     ss( int age,int marks, String name)
    {
         this.age=age;
         this.marks=marks;
         this.name=name;
    }
      public String toString()
      {
          return name+" "+age+" "+marks;
      }
public int compareTo(ss f0)
{
    if(this.marks> f0.marks)
    { return 1;}
    else
    {return -1;}
}

}
//class bassu implements Comparator<ss>
//{
//    public int compare( ss a , ss b)
//    {
//        if(a.marks> b.marks)
//        {
//            return 1;
//        }
//            else
//            {
//                return -1;
//            }
//    }
//}


public class map_compator
{
    public static void main(String[] args)
    {
        ArrayList<ss> al = new ArrayList<ss>();
        ss s1 = new ss(10,40,"vinod");
        ss s2 = new ss(12,60,"zain");
        ss s3 = new ss(13,49,"messi");
        ss hh2 = new ss(34,90,"kl00");
           al.add(s2);
        al.add(s3);
        al.add(hh2);
        al.add(s1);
        Collections.sort(al);
//        System.out.println(al);
//        System.out.println("before sorting -------------------------");
           // bassu bs = new bassu();

//        Comparator<ss> comp = new Comparator<ss>()
//    {
//        public int compare( ss a, ss v)
//        {
//            if(a.marks>v.marks)
//            {
//                return 1;
//            }
//            else
//            {
//                return -1;
//            }
//        }
////};
//                Comparator<ss> comp =  (ss a , ss b)->
//                {
//                    if(a.marks> b.marks)
//                    {
//                        return 1;
//                    }
//                    else
//                    {
//                        return -1;
//                    }
//                    };





      //  Collections.sort(al,bs);
       // Collections.sort(al,comp);

        System.out.println(al);



    }

}
