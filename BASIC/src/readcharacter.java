 import java.util.Scanner;
public class readcharacter {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter a character");
         char ch = sc.next().charAt(4);
        System.out.println("the charecter is "+ ch);
         String a1 = "vinodh";
         char c = a1.charAt(4);
         System.out.println(c);
     }
}
