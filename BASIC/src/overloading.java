class fuck
{ public int add(int n1,int n2) {
    int r=n1-n2;
   return r;

}
    public double add(double n1,double n2) { double r=n1+n2;
    return r;

}

    public int add(int n1,int n2,int n3) {
        int r=n1+n2+n3;
        return r;

    }

    }


public class overloading {
    int a =2;
    public static void main(String[] args) {

        fuck obj = new fuck();
        int r =obj.add(4,3,8);
        int r2=obj.add(4,9);
        obj.add(3,4);
        System.out.println(r2);
        int r1 =obj.add(4,6,7);
        System.out.println(r1);
        System.out.println(r);
        overloading obj1 = new overloading();
        int t=obj1.a;
        System.out.println(t);
        double j =obj.add(7,3);



    }
}
