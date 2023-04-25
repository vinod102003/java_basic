import java.util.Scanner;



class yrytf
{


}
class calculator1 extends yrytf implements Runnable
{
    public void run()
    {
        System.out.println("calculation started");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= sc.nextInt();
        System.out.println("enter the second number");
        int num2= sc.nextInt();
        int r=num2+num1;
        System.out.println(r);
        System.out.println("calculation ended");

    }}
class message1 implements Runnable
{


    public void run() {

        System.out.println("display score");
        try{
            int a[]={23,45,67};
            for(int score:a)
            {
                System.out.println(score);
                Thread.sleep(2000);//it might give exception so we write it in try and block
            }
            System.out.println("display score ended");

        }catch (Exception e)
        {
            System.out.println("error");
        }

        System.out.println("print * task started");
        for(int i=0;i<3;i++)
        {
            System.out.println("*");
        }
        System.out.println("print star ended");
        System.out.println("******************************************************");

    }
}
public class MultiTaskingByRunnableMethod {
    public static void main(String[] args) {
        System.out.println("main methods started");

        calculator1 c1 = new calculator1();

        message1 m1= new message1();

        Thread t1=new Thread(c1);

        Thread t2=new Thread(m1);
        t1.start();

        t2.start();






    }

}