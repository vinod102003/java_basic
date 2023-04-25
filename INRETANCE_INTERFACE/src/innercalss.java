class person{
    int age;
    String name;
    public void deatails()
    {
        age=19;
        name="vinod";
        System.out.println(age+" "+name);
    }
      class adderess
    {
int pincode=585102;
String city="gulbarga";
String colony="godutai nagar";
    public void detail()
    {
        pincode= 585102;
        city="gulbarga";
        colony= "godutai nagar";
        System.out.println(pincode+" "+city+" "+colony);
    }

    }
}
public class innercalss {

    public static void main(String[] args) {

        person pp = new person();
        pp.deatails();
       person.adderess add = pp.new adderess();
        // person.adderess add  =  new person.adderess();
        // if the inner class is stsic than we dont't use obbject refrencewe only use class name
        add.detail();

    }

}
