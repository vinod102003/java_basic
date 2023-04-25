import java.util.*;

class student12
{
    private String name;
    private int age;
    private String city;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    student12(String name, int age , String city)
    {
       this.name=name;
       this.age=age;
       this.city=city;
    }
    public String toString()
    {
        return name+" "+age+" "+city;
    }
}


public class mapHASHMAP2
{
    public static void main(String[] args)
    {
        student12 st1 = new student12("vinod",19,"tokyo");
        student12 st2 = new student12("zain",19,"london");
        student12 st3 = new student12("om",19,"mysuru");
        Map hh = new HashMap();

        hh.put(1,st1);
        hh.put(2,st2);
        hh.put(3,st3);
        System.out.println(hh);
        Set ss =hh.entrySet();
        Iterator itr  =ss.iterator();
        while (itr.hasNext())
        {

            Map.Entry m =(Map.Entry)itr.next();
            System.out.println(m.getKey()+" : "+m.getValue());

        }

    }


}


