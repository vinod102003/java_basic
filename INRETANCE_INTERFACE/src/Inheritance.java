class Human// it is called as parent class super,base class
{
    private String name;

    
    int age;
Human(){
    System.out.println("human class constructor");
}

    void sleep()
    {        age=18;
        System.out.println("human needs good sleep");
        System.out.println(age);

    }
}

class Student00 extends Human{

void disp()
{
    System.out.println("the age is:"+age);
 // System.out.println("the age is:"+name);//we cant use private variables in inheritance
}
}



public class Inheritance
{
    public static void main(String[] args)
    {
Human obj = new Student00();
obj.sleep();
        ((Student00)obj).disp();


    }
}













