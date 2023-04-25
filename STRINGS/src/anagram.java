import java.util.Arrays;

public class anagram
{
    public static void main(String[] args) {
        String s1 = "Vinod Hiregouda";
        String s2 = "nodiv aDEouhirg";

        s2 = s2.replace(" ", "");
        s1 = s1.replace(" ", "");
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char ar1[] = s1.toCharArray();
        char ar2[] = s2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        if (Arrays.equals(ar1, ar2)) {
            System.out.println("it is anagram");
        } else {
            System.out.println("it is not anagram");
        }
 
   }
}
//String a = "vin oD";
//String b = "do znvI";
//a=a.trim();
//b=b.trim();
//a=a.toLowerCase();
//b=b.toLowerCase();
//char c[]=a.toCharArray();
//char d[]=b.toCharArray();
//Arrays.sort(c);
//Arrays.sort(d);
//if(Arrays.equals(c,d))
//{
//    System.out.println("true");
//}else
//{
//    System.out.println("false");
//}
//    }
//}

