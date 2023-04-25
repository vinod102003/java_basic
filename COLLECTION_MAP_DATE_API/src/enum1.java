enum Result
{
    PASS,FAIL,NR;
    // behind the scene when we create a constant in enum like
    //public static final Result PASS = new Result();
    //public static final Result FAIL = new Result();
    // public static final Result NR = new Result();
    int marks;
Result()
{
    System.out.println("Constructor in enum");
}
   void setMarks(int marks)
   {
       this.marks=marks;
   }
int getMarks()

{
   return marks;
}


}




public class enum1
{

    public static void main(String[] args)
    {
        Result.PASS.setMarks(50);
        int m =Result.PASS.getMarks();
        System.out.println(m);


        int n=Result.FAIL.getMarks();
        System.out.println(n);
       // System.out.println(Result.FAIL);
         Result d[]=Result.values();
      //  Result.PASS.ordinal();
for(Result r:d)
{
    System.out.println(r);
}
    }

}
