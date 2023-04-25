public class reversingstring {
    public static void main(String[] args) {
//        String str1 = "pwjava";
//        String str2 = " ";
//        for (int i =str1.length()-1; i>=0; i-- ){
//            str2 =str2+str1.charAt(i);
//
//        }
//        System.out.println(str2);
////String a ="vinod";
//String b = " ";
//for (int i=a.length()-1; i>=0; i--){
//    b=b+a.charAt(i);
//}
//        System.out.println(b);
//String str1 = "pwskill java";
//String str2 = " ";
//String a[]=str1.split(" ");
//for(int i =a.length-1;i>=0;i--){
//    str2=str2+a[i]+" ";
//}
//        System.out.print/
String str1 ="pwskill java";
String str2 = "";
String sarr[]= str1.split(" ");
for(String elem:sarr){
    for(int i=elem.length()-1;i>=0;i--){
        str2=str2+elem.charAt(i);
    }str2=str2+" ";
}
        System.out.println(str2);


    }

}

