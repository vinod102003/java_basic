import java.util.Scanner;


public class araayandinputt
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        int a[]= new int[6];
//        for(int i=0;i<a.length;i++)
//        {
//            System.out.println("enter the numbers");
//            a[i]= sc.nextInt();
//
//        }
//        for(int i=0;i<a.length;i++)
//        {
//            System.out.println("the entered number are");
//            System.out.println(a[i]);
//        }

        int b[][]=new int[2][5];
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                b[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }

    }

}
