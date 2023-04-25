@FunctionalInterface//if we create a other method we will get a compile time error
// functional interface
interface demo
{
    void disp();
    //void dissp();
}
//this is parent class
@Deprecated // if we use this class to create a object we will get a strike line
 class plane
{

public void planeFilesAtGoodHeight()
{
    System.out.println("plane is flying");

}



}
// this is child class
class CargoPlane11 extends plane
{
    @Override
public void  planeFilesAtGoodHeight()

{
    System.out.println("cargo plane is flying");
}

}

public class Annotation
{
    public static void main(String[] args)
    {
        //object of child class
        plane cp = new CargoPlane11();
        cp.planeFilesAtGoodHeight();

    }



}
