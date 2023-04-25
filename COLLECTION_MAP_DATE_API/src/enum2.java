enum Result1
{
    PASS,FAIL,NR;

}



public class enum2
{
    public static void main(String[] args)
    {
                    Result1 res = Result1.PASS;
   switch (res)
   {
       case FAIL :
           System.out.println("Failed");
           break;

       case PASS:
           System.out.println("Passed");
           break;
       case NR:
           System.out.println("no result");

   }
      Result1 fee =Result1.FAIL;
            switch (fee)
            {
                case FAIL :
                    System.out.println("fuck you failed dude");
                    break;
                case PASS:
                    System.out.println("Passed");
            break;
                case NR:
                    System.out.println("your'e gay");

            }


    }

}
