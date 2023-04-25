

class Demo{
   private  int a;
    private int b;

    Demo (){
        System.out.println("default constructor by the programmer to the the first object");

    }

    Demo(int a,int b){
        this.a=a;
        this.b=b;
    }
    void disp()
    {
        System.out.println(a);
        System.out.println(b);
    }


}
public class constructor {
    public static void main(String[] args) {


Demo d = new Demo();

        d.disp();
        Demo d1 = new Demo(1,1);
        System.out.println(d1);
        d1.disp();





}
}
