class stud
{
    private String name;
    private int age;
    private String city;

   public   stud(String name,int age , String city)
    {
        this.city=city;
        this.name=name;
        this.age=age;
    }
public String toString()
{
    return  "Name: "+name+" "+"Age: "+age+" "+"City: "+city;
}

}

public class IO_Operation
{
    public static void main(String[] args)
    {

        stud st1 = new stud("vinod",20,"gul");
        stud st2 = new stud("messi",34,"barsa");
        System.out.println(st1);
        System.out.println(st2);
        //jvm will shutdown and the data will be deleted.
        // if we want to store it in hdd we have to use the package io package classes.
    }

}
