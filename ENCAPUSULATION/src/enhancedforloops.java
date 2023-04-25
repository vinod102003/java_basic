public class enhancedforloops
{
    public static void main(String[] args)
    {
   //   int nums[]={5,8,9,3};
     int nums[][]={
               {2,3,1},{4,8,5},{6,0,1}
     };
        //this for 1d arrys
       // for(int n:nums){
         //   System.out.println(n);
      //  int nums[][]= new int[3][2];
        for(int a[]:nums){
            for(int b:a){
                System.out.print(b+" ");

        }
            System.out.println();




    }
    }
}
