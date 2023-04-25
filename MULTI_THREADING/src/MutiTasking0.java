class MyThread extends Thread
{
public void run()
{
    int a=2;
    int b=34;
    int r=a*b;
    System.out.println(r);
}
}




public class MutiTasking0
{
    public static void main(String[] args)
    {
        System.out.println("main method");
        MyThread t = new MyThread();
        t.start();

    }
}
