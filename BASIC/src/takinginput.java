import java.util.Scanner;
public class takinginput {
    public static void main(String[] args)
    { Scanner sc = new Scanner(System.in);
        System.out.println("enter your lucky name");
        String name  = sc.nextLine();
        System.out.println("entered  lucky name  is "+name);
        char ch = sc.next().charAt(5);
        System.out.println("the charecter is"+ch);
}
}
