class animal{
   void sleep(){
System.out.println("animal need sleep");
    }
}

class tiger extends animal{

}

public class simple_inheritance{public static void main(String[] args) {


    tiger obj = new tiger();
    obj.sleep();
}
}