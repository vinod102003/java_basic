import java.io.*;
public class io_filereader
{
    public static void main(String[] args) throws IOException
    {
        File dir = new File("pw");
        File file = new File(dir,"pw.txt");

    FileReader fr = new FileReader(file);
//   int  i =fr.read();//it will return the decimal representation/decimal number of the character
//        System.out.println((char) i);
//      int i=fr.read();
//        while(i!=-1)
//        {
//            System.out.print(i+"---->");
//            System.out.println((char)i);
//            i=fr.read();
//        }
         char ch[] = new char[(int) file.length()];

            fr.read(ch); // it will store all the data in array

            for(char data:ch)
            {
                System.out.print(data);
            }




    }

}
