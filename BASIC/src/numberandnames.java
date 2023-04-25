import java.util.Scanner;
        public class numberandnames {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("the number is ");
                int num = sc.nextInt();
                System.out.println("the name is ");
                String Name = sc.next();
                String numberandname = num+Name;
                System.out.println("the answer is"+ numberandname);

            }
}
