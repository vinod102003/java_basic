public class palindrome {
    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "";
        for(int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);
        }
      //  System.out.println(str2);
if(str1.equals(str2)){

    System.out.println("it is palindrome");
}else{
    System.out.println("it is not palindrome ");
}

String a = "2552";
String b = "";
for(int  i=a.length()-1;i>=0;i--)
{
     b=b+a.charAt(i);
}

    if(a.equals(b))
    {
        System.out.println("it is palindrome");
    }else
    {
        System.out.println("it is not a palindrome");
    }


    }
}
