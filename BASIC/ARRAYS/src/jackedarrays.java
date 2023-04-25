public class jackedarrays {
    public static void main(String[] args) {
     // int a[][]= new int[3][];

      // a[0]= new int[4];
       //a[1]= new int[2];
       //a[2]=new int[3];
       int a[][]= {
               {9,0,6,7},
               {9,7,3},
               {8,1}};
//for(int i =0;i<=2;i++){
  //  for(int j=0 ; j<a[i].length ; j++){
    //    System.out.print(a[i][j]+" ");
     for(int r[]:a){
         for(int b:r){
             System.out.print(b+" ");
         }
         System.out.println();  }






    }
}








