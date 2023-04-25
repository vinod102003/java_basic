class printing implements Runnable
{
    public  void  run()
    {
        try
        {
            for(int i=0;i<2;i++)
            {
                System.out.println("focus is fucked");


                Thread.sleep(3000);
            }
        }
            catch (InterruptedException e)
            {
                System.out.println("thread is interrupted");
            }
    }
}
public class threadJionISAlive
{
    public static void main(String[] args) throws Exception
    {

        System.out.println("main thread started");

    printing p = new printing();
        Thread tt = new Thread(p);
        System.out.println(tt.isAlive());
    tt.start();
        System.out.println(tt.isAlive());
        tt.interrupt();// it is used to interrupt the thread this method can used only when the thread is in block or waiting  state
        tt.join();
        System.out.println(tt.isAlive());

        System.out.println("main thread ended ");


}
}
