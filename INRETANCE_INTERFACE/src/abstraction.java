

abstract  class aeroplan
{
abstract public void takeoff();
  abstract public void fly();

public  void landing()
{
    System.out.println("aeroplane is landing");
}

}

class cargoplan extends aeroplan
{
public void takeoff(){
    System.out.println("cargoplane take off");
}
public void fly(){
    System.out.println("cargolane flyes");
} 

public void alert(){
    System.out.println("alert");
}
}

class passengerplane extends aeroplan
{
    public void takeoff(){
    System.out.println("passengerplane take off");
}
public void fly(){
    System.out.println("passsengerlane flyes");
} 

}

class fighterplane extends aeroplan
{
    public void takeoff(){
        System.out.println("fighterplane take off");
    }
    public void fly(){
        System.out.println("fighterplane flyes");
    } 
}
//class airport
//{
//    public void poly(aeroplane ref)
//    {
//ref.fly();
//ref.takeoff();
//ref.landing();
//
//    }
//}

public class abstraction { 
    public static void main(String[] args) 
    {
        aeroplan ref1 = new cargoplan();
        aeroplan ref2 = new passengerplane();
        aeroplan ref3 = new fighterplane();

        ref1.landing();
        ref1.takeoff();
        ref1.fly();
        ((cargoplan)ref1).alert();
        ref2.takeoff();
        ref2.landing();
        ref2.fly();
      ref3.fly();
        ref3.takeoff();
        ref3.landing();

//           airport a = new airport();
//    a.poly(ref1);
//    a.poly(ref2);
//    a.poly(ref3);
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