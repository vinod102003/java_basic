public class Final {
    public static void main(String[] args) {
//      final   int a = 10;
//        a=20;
      final   StringBuffer sb = new StringBuffer("vinod");
        //sb = new StringBuffer("vinnod");
        sb.append("gh");
        System.out.println(sb);
      //  System.out.println(a);
     final    String a = "vinod";
      //  a="b";//connot use
       // a=a.concat("gh");// cannot not use
        System.out.println(a);
        StringBuffer sb1 = new StringBuffer();
sb1.append("zxcvbnmlkjhgfdsa");// 16 letters
        sb1.append("e");// if we add a letters more than 16 it will autommatically ceattes a new string with more capacity (o.c+1)*2=n.c
        System.out.println(sb1.capacity());//how many charecters  you can add  34
             System.out.println(sb1.length());//how many are already present 17
StringBuilder s2 = new StringBuilder("vinod");
        System.out.println(s2.capacity());//22
        System.out.println(s2.charAt(1));
        s2.setCharAt(1,'I');
        System.out.println(s2);//output is vInod
        StringBuilder s = new StringBuilder(150);
        System.out.println(s.capacity());//150
            s.append("java");
        System.out.println(s);
        System.out.println(s.capacity());//150
            s.trimToSize();
        System.out.println(s.capacity());//4

        StringBuilder v = new StringBuilder();
        v.append("vinod");
        v.reverse();
        System.out.println(v);

    }
}
