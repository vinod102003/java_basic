class Car1 implements Runnable
{

//  synchronized public void run()
     public void run()
     {
        try
        {
            synchronized (this)
            {
                System.out.println(Thread.currentThread().getName()+" has entered parking lot");
                 Thread.sleep(2000);
                 System.out.println(Thread.currentThread().getName()+" found the car and got into it ");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+" started to drive ");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+" came back and parked ");
                Thread.sleep(2000);

        }}
    catch (Exception e)
    {
        System.out.println("error");
    }



    }
}
public class MultiThreadSynchronization
{
    public static void main(String[] args)
    {
    Car1 cc = new Car1();


    Thread t1= new Thread(cc);
    Thread t2= new Thread(cc);
    Thread t3= new Thread(cc);

    t1.setName("son-1");
    t2.setName("son-2");
    t3.setName("son-3");


    t1.start();
    t2.start();
    t3.start();




    }


}
