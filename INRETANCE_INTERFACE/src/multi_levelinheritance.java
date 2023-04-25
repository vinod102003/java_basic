

class demo1{
    void disp(){
        System.out.println("dispmethod written in demo1");
    }
}

class demo2 extends demo1
{

}

class demo3 extends demo2
{

}

class demo4 extends demo3
{

}



public class multi_levelinheritance {
    public static void main(String[] args) {
        demo4 obj = new demo4();
        obj.disp();
    }
}
