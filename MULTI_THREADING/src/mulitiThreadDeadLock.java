class library implements Runnable
{
    String res1 = new String("java");
    String res2 = new String("sql");
    String res3 = new String("dsa");
    public void run()
    {
       String name= Thread.currentThread().getName();
        if(name.equals("STUDENT1"))
        {
            try
            {
                Thread.sleep(3000);
                synchronized (res1)
                {
                    System.out.println("STUDENT1 has taken resource:"+res1);
                    Thread.sleep(3000);
                    synchronized (res2)
                    {
                        System.out.println("STUDENT1 HAS taken:"+res2);
                        Thread.sleep(3000);
                        synchronized (res3)
                    {
                        System.out.println("student1 has taken:"+res3);
                    }
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println("error");
            }
        }else

        {

                try
                {
                    Thread.sleep(3000);
                    synchronized (res3)
                    {
                        System.out.println("STUDENT2 has taken resource:"+res3);
                        Thread.sleep(3000);
                        synchronized (res2)
                        {
                            System.out.println("STUDENT2 HAS taken:"+res2);
                            Thread.sleep(3000);
                            synchronized (res1)
                            {
                                System.out.println("student2 has taken:"+res1);
                            }
                        }
                    }
                }catch (Exception e)
                {
                    System.out.println("error");
                }
            }
        }
    }


public class mulitiThreadDeadLock
{
    public static void main(String[] args) {
        library lib = new library();
        Thread t1=new Thread(lib);
        Thread t2=new Thread(lib);
        t1.setName("STUDENT1");
        t2.setName("STUDENT2");
        t1.start();
        t2.start();

    }




}
