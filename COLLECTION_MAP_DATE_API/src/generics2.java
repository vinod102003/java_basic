import java.util.*;
 class Gen<T>
{
    T obj;
     public Gen(T obj)
    {
        this.obj=obj;
    }

    void disp()
    {
        System.out.println("the type of data is : "+obj.getClass().getName());
    }

    public T getObj()
    {
        return obj;
    }
}





public class generics2
{
    public static void main(String[] args)
    {
        Gen<Integer> g = new Gen<Integer>(10);
        System.out.println(g.getObj());
        g.disp();
        System.out.println("**********************************************");
        Gen<Double> g1 = new Gen<Double>(10.9);
        System.out.println(g1.getObj());
        g1.disp();
//        generics gen = new generics();
//        ArrayList <String> list1= new ArrayList<String>();
//        List <String> list2 = new ArrayList<String>();
//        Collection<Integer> list3 = new ArrayList<Integer>();
//        ArrayList<generics> list4 = new ArrayList<generics>();
//
        //List<Object> list4 = new ArrayList<Integer>();
//        // we can't give a parent type reference to generics
//        // if it is int in right than it should be int in left also.
//       // Collection<int> list4 = new ArrayList<int>();
//        //we can't store primitive data type only we can add reference type only.




    }
}
