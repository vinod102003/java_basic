class Demo5{
    int a,b;
    public Demo5()
    {
        this(4,5);
        System.out.println("parent class constructor");
    }
    public Demo5(int x,int y)
    {
        System.out.println("parametrized parent class");
        a=x;
        b=y;

    }
    public  void anst()
    {
        System.out.println(a);
        System.out.println(b);
    }

}

class Demo0 extends Demo5
{

    int m,n;
    public Demo0()
    {
        this( 2,3);
        // super(8,4);
        //super(); this will be called automatically
        System.out.println("child class constructor");
    }
    public Demo0(int x,int y)

    {

        // super(9,80);
        //super();
        System.out.println("parametrized child class");
        m=x;
        n=y;

    }
    public  void ans(){
        System.out.println(m);
        System.out.println(n);
    }

}

public class constructorinheritance{


    public static void main(String[] args) {
        Demo0 d2 = new Demo0();
        d2.ans();
       Demo0 d22 = new Demo0(8,8);
        d22.ans();
        d2.anst();



    }
}




