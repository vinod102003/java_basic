

class animal1{
    void sleep(){
        System.out.println("animal needs sleep");
    }
}

class tiger1 extends animal1
{

}
class money1 extends animal1
{

}
class deer1 extends animal1
{

}


public class hierarchial_inheritance {
public static void main(String[] args) {
    deer1 obj = new deer1();
    obj.sleep();
    tiger1 onj = new tiger1();
    onj.sleep();
    money1 ss = new money1();
    ss.sleep();
}    
}
