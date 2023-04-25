import java.io.*;

class Cricketer implements Serializable // it is a marker interface no abstract method
{
    private String name;
    private int age;
    private int runs;
    Cricketer(String name,int age,int runs)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;
    }
public void disp()
        {
            System.out.println(name);
            System.out.println(age);
            System.out.println(runs);
        }
}



public class io_serialization
{
    public static void main(String[] args) throws Exception
    {
        Cricketer c = new Cricketer("abd",36,500000);
        c.disp();

        FileOutputStream fos = new FileOutputStream("pwskill.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(c);
            oos.flush();
            oos.close();


    }
}
