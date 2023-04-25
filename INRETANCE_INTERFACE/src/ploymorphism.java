class aeroplane1
{
public void takeoff(){
    System.out.println("aeroplane take off");
}
public void fly(){
    System.out.println("aeroplane flyes");
} 
}

class cargoplane1 extends aeroplane1
{
public void takeoff(){
    System.out.println("cargoplane take off");
}
public void fly(){
    System.out.println("cargolane flyes");
} 


}

class passengerplane1 extends aeroplane1
{
    public void takeoff(){
    System.out.println("passengerplane take off");
}
public void fly(){
    System.out.println("passsengerlane flyes");
} 

}

class fighterplane1 extends aeroplane1
{
    public void takeoff(){
        System.out.println("fighterplane take off");
    }
    public void fly(){
        System.out.println("fighterplane flyes");
    } 
}
class airport
{
    public void poly(aeroplane1 ref)
    {
ref.fly();
ref.takeoff();
    }
}

public class ploymorphism { 
    public static void main(String[] args) 
    {
        cargoplane1 cp = new cargoplane1();
        passengerplane1 pp = new passengerplane1();
        fighterplane1 ff = new fighterplane1();
    airport a = new airport();
    a.poly(ff);
    a.poly(cp);
    a.poly(pp);
        //     aeroplane ref;
    //    ref=cp;
    //    cp.fly();
    //    cp.takeoff();
    //    ref=pp;
    //    ref.fly();
    //    ref.takeoff();
    //    ref=ff;
    //    ref.fly();
    //    ref.takeoff();

    }
    
}
