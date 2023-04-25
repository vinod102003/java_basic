

 class aeroplane2{

     public void takeoff()
     {
         System.out.println("aeroplane is taking off");
     }
 public void fly()
 {
     System.out.println("aeroplane is flying");
 }
 }

 class cargoplane2 extends aeroplane2
 {
  public void fly()
 {
     System.out.println("cargo plane flyes at lower height");
 }
 public void carrygoods()
 {
     System.out.println("cargo carry goods");
 }
 }

 class passengerpalne2 extends aeroplane2
 {
 public void fly()
 {
     System.out.println("passenger plane flys at medium height");
 }
 public void carrygoods()
 {
     System.out.println("cargo carry passengers");
 }
 }





 public class overddenmethodinheritance
 {
 public static void main(String[] args)
  {
 cargoplane2 cp = new cargoplane2();
 cp.fly();
 cp.takeoff();
 cp.carrygoods();
 passengerpalne2 pp = new passengerpalne2();
 pp.fly();
 pp.takeoff();
 pp.carrygoods();
 }
 }
