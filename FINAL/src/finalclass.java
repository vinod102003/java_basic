// final class beer//if we make a class final than it cant be used in inheritance
//{
//    public  void drink()
//    {
//        System.out.println("vinod drinks beer");
//    }
//}
// class beer
// {
//
//    final public  void drink()// if apply final to a method it cant be overridden
//     {
//         System.out.println("vinod drinks beer");
//     }
// }
class beer{
 // final  int age= 19;//if we make a variable final than it cant be reused and cant change/momdify the value
   int age =4;
    public void in()
    {
        age=109;
        System.out.println(age);
    }

    public  void drink()
    {
        System.out.println("vinod drinks beer");
    }
}

class gt20 extends beer
{
public  void drink(){
    System.out.println("drink");
}

}

public class finalclass {
    public static void main(String[] args)
    {
        gt20 gt = new gt20();
        gt.drink();
        gt.in();

    }
}
