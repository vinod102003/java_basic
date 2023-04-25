 interface computer
{
     void compilecode();
     default void run()
     {
         System.out.println("run the code");
     }
     static void vv()
     {
         System.out.println("gg");
     }

}
class Laptop implements computer
{
    public void compilecode()
    {
        System.out.println("got 10 errors");
    }
}
class Desktop implements computer
{
    public void compilecode()
    {
        System.out.println("got 19 errors");
    }
}
class Deveploper
{
      //public void buildApp(Laptop lap)
       public void buildApp(computer lap)
    {
        System.out.println("building app");
        lap.compilecode();
    }
}
public class companyinterfaceandneedofinterface
{
    public static void main(String[] args)
    {
     computer lap = new Desktop();
     lap.run();
     computer lap1 = new Laptop();
     lap1.run();
        Deveploper dev = new Deveploper();
    dev.buildApp(lap);
    dev.buildApp(lap1);
    computer.vv();

        }
    }

