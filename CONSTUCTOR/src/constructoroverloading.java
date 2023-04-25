class  student1
{
    private int age;
    private String name;

    student1()
    {
       this(4,"vinod");

       System.out.println("first");
      age=19;
    }
    student1(int age,String name)
    {
        this.name=name;
        this.age=age;
    }
    student1(String name)
    {
        this();
        this.name=name;
        age=89;
    }

    public void f2() {
        System.out.println(age);
        System.out.println(name);
    }
}

    public class constructoroverloading
    {
        public static void main(String[] args)
        {
            student1 b = new student1();
            b.f2();
            student1 b1 = new student1(2,"vinod");
            b1.f2();
            student1 b2 = new student1("vinod");
            b2.f2();


        }
    }

