public class API_Date
{
    public static void main(String[] args)
    {
    //Date dt = new Date();
    //java.util.ArrayList<String> al = new java.util.ArrayList<String>();

            java.util.Date dt = new java.util.Date();
            System.out.println(dt);

            long timeInMins =dt.getTime();


        java.sql.Date dt1 = new java.sql.Date(timeInMins);//we can't have zero parametrized object of date in sql package

        System.out.println(dt1);

    }

}
