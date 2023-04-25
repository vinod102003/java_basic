

class aeroplane{

    public void takeoff(){
        System.out.println("aeroplane is taking off");
    }
public void fly(){
    System.out.println("aeroplane is flying");
}
}

class cargoplane extends aeroplane
{

}

class passengerpalne extends aeroplane
{

}



 public class inheritedmethod
{
public static void main(String[] args)
 {
cargoplane cp= new cargoplane();     
cp.fly();
cp.takeoff();
passengerpalne pp = new passengerpalne();
pp.fly();
pp.takeoff();

}
}



