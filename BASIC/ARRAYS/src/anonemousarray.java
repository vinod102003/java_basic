 class clac{
    public int add(int b[]){
        int reslut =0;
        for(int y :b){
            reslut=reslut+y;
        }
    return reslut;}

     public int add(int b[][]){
      int  reslut=0;
      for(int t[]:b){
          for(int c:t){reslut=reslut+c;
      }

     }


      return reslut;  }}





        public class anonemousarray{
            public static void main(String[] args) {
                clac obl = new clac();
              // int a[]={2,3};
                int r=  obl.add(new int[]{4,5,6,7});
                System.out.println(r);
                int f = obl.add(new int[][]{{7,8,9},

                        {6,5,4},
                        {0,8,54}});
                System.out.println(f);

            }}