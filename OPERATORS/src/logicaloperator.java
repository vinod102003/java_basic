public class logicaloperator {
    public static void main(String[] args) {
        int p=15;
        int q=10;
        int r=5;
//        && operators
        System.out.println(p>q && p>r);//true
        System.out.println(p>q && p<r);//false
//        || oeparators
        System.out.println(r<q || p<q);//trrue
        System.out.println(r>q || p>q);//true
//        ! operators
        System.out.println(!(p==q));//true
        System.out.println(!(r==q));//true
        System.out.println(!(r>=q));//true
    }
}
