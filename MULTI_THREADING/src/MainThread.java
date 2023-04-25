public class MainThread
{
    public static void main(String[] args)
    {
        System.out.println("main thread");
        System.out.println("before changing thread details");
        String name =Thread.currentThread().getName();
        System.out.println("the name of thread:"+name);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("after changing thread details");
        Thread t=Thread.currentThread();
        t.setName("pw");
        t.setPriority(1);
        String name1 =Thread.currentThread().getName();
        System.out.println("the name of thread:"+name1);
        System.out.println(Thread.currentThread().getPriority());


    }
}
