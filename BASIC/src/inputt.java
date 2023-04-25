import java.util.Scanner;
public class inputt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first  number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();

        int u = a+b;
        System.out.println("sum"+u);
        System.out.println("enter the average");
        float t = sc.nextFloat();
        System.out.println("entered avarage is"+t);
        float h =u+t;
        System.out.println(h);
        int f =(int)h;
        System.out.println(f);





    }
}
