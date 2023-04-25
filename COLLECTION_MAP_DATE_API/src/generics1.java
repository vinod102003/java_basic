import java.util.ArrayList;

class std
{
    private String name;
    private int id;
}
class emp
{
    private String name;
    private int id;
}


public class generics1
{
    public static void main(String[] args) {
        std s1 = new std();
        std s2= new std();
        emp e1 = new emp();

        ArrayList<std> al = new ArrayList<std>();

        al.add(s1);
        //al.add(e1);//compile time error
    }
}
