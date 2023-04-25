import java.io.*;
public class io_filewriter
{
    public static void main(String[] args) throws IOException
    {
        File dir = new File("pw");
        File file = new File(dir,"pw.txt");

        file.createNewFile();

        FileWriter fw = new FileWriter(file,true);
//        fw.write("pw");
//        fw.write("\n");
//        fw.write(65);
//        fw.write("\n");
//        fw.write(97);
//        fw.write("\n");
//        char ch[] = {'j','a','v','a'};
//        fw.write(ch);
//        fw.write("\n");
        fw.write("JAVA");
        fw.write("\n");
        fw.write(65);
        fw.write("\n");
        fw.write(97);
        fw.write("\n");
        char ch[] = {'j','a','v','a'};
        fw.write(ch);
        fw.write("\n");
        fw.close();
          //fw.flush(); we can also use this but best approach is to use close();
        System.out.println("open the file pw.txt from pw directory to see the data");


    }


}
