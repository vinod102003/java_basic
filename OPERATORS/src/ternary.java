public class ternary {
    public static void main(String[] args) {

    int a =30 , b= 20,c=90;
    int r= (a>b)?a:b;
    String ri = (a>b)?"less":"great";
       int f = (a<b)?((a<c)?a:c): ((b<c)? b:c);
        System.out.println(f);
        System.out.println(r);
                System.out.println(ri);
                int rf = (b>c)? ((a<=c)? a:c) : ((c>=a)? c:a);
        System.out.println(rf);
}
}

