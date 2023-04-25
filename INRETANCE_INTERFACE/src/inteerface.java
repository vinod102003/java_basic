interface A
{
   int num=9;
    // we need to assing value to variable because the variables are by default public static final
        public void g();
// we don't need to mention public because by default in interface all methods are public

}
interface  s {
    void d();
}


class B implements A,s
{
    public void g()
    {
        System.out.println("inshow");
        System.out.println(num);
    }
public void d()
{
    System.out.println("other interface");
}

}

public class inteerface {
    public static void main(String[] args) {
        A obj = new B();
        // we can refer the interface to crete object of a class which implements it
        obj.g();
        s obj1 = new B();
        obj1.d();
        B obj3 = new B();

        obj3.g();
        obj3.d();



    }

    }


