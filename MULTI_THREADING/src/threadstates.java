import java.util.Scanner;

class  fgff implements Runnable
{
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int b[][] = new int[2][5];
       try {
           for (int i = 0; i < b.length; i++) {
               for (int j = 0; j < b[i].length; j++) {
                   b[i][j] = sc.nextInt();
               }
           }

           Thread.sleep(2000);
       }
       catch (Exception e )
       {
           System.out.println("error");
       }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }}
public class threadstates {
    public static void main(String[] args) {
        fgff gg = new fgff();
        Thread tt = new Thread(gg);
        tt.start();
        System.out.println("main thread");
        Scanner sc =new Scanner(System.in);
        int b[]= new int[4];
        for(int i=0;i<b.length;i++)
        {
            b[i]= sc.nextInt();
        }
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }



    }
}
