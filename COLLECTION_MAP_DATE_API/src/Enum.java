enum week
{
    MON,TUE,WED,THRU,FRI,SAT,SUN;
}

public class Enum
{
    enum result
    {
        PASS,FAIL,NR;
    }
    public static void main(String[] args)
    {

        System.out.println(result.FAIL);

        week w =week.MON;
        System.out.println(w);
        System.out.println(week.MON.ordinal());// it will give the index of the variable used
        System.out.println(week.SUN.ordinal());
        System.out.println(week.SAT.ordinal());

                    week p[]=week.values();
//                for (int i=0;i<p.length;i++)
//                {
//                    System.out.println(p[i]);
//                }
        for (week t:p)
        {
            System.out.println(t+" : "+t.ordinal());
        }
    }

}
