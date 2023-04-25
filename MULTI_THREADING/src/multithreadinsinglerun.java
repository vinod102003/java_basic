import java.util.Scanner;


class  mythread00 extends Thread
{
    public void run()
    {
String tname=Thread.currentThread().getName();
if(tname.equals("clac"))
{
    calc();
}else
{
    impmprotant();
}


    }


    public void calc()
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

    }
    public void impmprotant()
    {
        System.out.println("display score");
        try
        {
            int a[] = {23, 45, 67};
            for (int score : a) {
                System.out.println(score);
                Thread.sleep(2000);//it might give exception so we write it in try and block
            }
            System.out.println("display score ended");

        }catch(Exception e)

        {
            System.out.println("error");
        }

        System.out.println("print * task started");
        for(int i = 0;i<3;i++)

        {
            System.out.println("*");
        }
        System.out.println("print star ended");
        System.out.println("******************************************************");

    }

}



public class multithreadinsinglerun {
    public static void main(String[] args) {
        System.out.println("main methods started");
        mythread00 thread1 = new mythread00();
        mythread00 thread2 = new mythread00();
        thread1.setName("calc");
        thread2.setName("print");
        thread1.start();
        thread2.start();









    }

}

