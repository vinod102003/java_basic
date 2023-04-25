import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class io_deserialiation
{
    public static void main(String[] args) throws Exception
    {


        FileInputStream fis = new FileInputStream("pwskill.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        ObjectInputStream ois = new ObjectInputStream(bis);

        Cricketer cr = (Cricketer) ois.readObject();
        cr.disp();

        ois.close();
    }

}
