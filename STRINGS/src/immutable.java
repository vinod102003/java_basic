public class immutable {
    public static void main(String[] args) {
      // String a1="hello";
       //String a2 ="hello";
        //System.out.println(a1==a2);//ture
        //String a = new String("hello");
        //String b = new String("hello");
        //System.out.println(a==b);//false
        //System.out.println(a==a1);//false
        //System.out.println(a1.equals(a2));//ture
        //System.out.println(a2.equals(b));true
        //System.out.println(a1==a2);//true
//String s1="pw java";
//String s2="pw java";
//String s3="pw Java";
//        System.out.println(s1==s2);//true
//        System.out.println(s1==s3);//false
//        System.out.println(s1.equals(s2));//true
//        System.out.println(s1.equals(s3));//false
String s1="vinod";
String s2 = new String("vinod");
s2.concat("vinoe");
String s3 = new String("vinod");
String s4 = new String("Vinod");
        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//false
        System.out.println(s2==s3);//false
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//t
        System.out.println(s2.equals(s3));//t
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s1.equals(s4));




    }
}

