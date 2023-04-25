import java.io.*;
public class io_printwriter
{
    public static void main(String[] args) throws Exception
    {

    File dir = new File("pw");
    File file = new File(dir,"pw.txt");

    FileWriter fw = new FileWriter(file);
    PrintWriter pw = new PrintWriter(fw);
    pw.println("pw");
    pw.println(100);
//    pw.write(97);
//    pw.write("\n");
    pw.println(50.5);
    pw.println('w');
    pw.println(true);


    pw.flush();
    pw.close();
    }


}
