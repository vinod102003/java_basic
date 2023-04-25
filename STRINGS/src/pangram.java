import org.w3c.dom.ls.LSOutput;

public class pangram {
    public static void main(String[] args) {
        String s1 = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        boolean flag= false;
      s1=s1.replace(" ","");

        //  s1 = s1.trim();
    s1=s1.toLowerCase();
    char a[]=s1.toCharArray();
    char b[]= new char[26];
    for(int i=0;i<a.length;i++){
        b[a[i]-97]++;
    }

    for(int i=0;i<b.length;i++)
    {
        if(b[i]==0){
            System.out.println("it is not a pangram");
            flag=true;
        }
        }
    if(flag==false){
            System.out.println("it is a pangram");
        }

    }






    }


