interface  car
{
   public abstract void drive(int average ,int topspeed );
}
//class supra implements car
//{
//    public void drive()
//    {
//        System.out.println("driving..........");
//    }



public class innerAnnonymousLamda
{
    public static void main(String[] args)
    {

//    car cc = new car() {
//        public void drive() {
//            System.out.println("driving...............");
//        }
//    };
    car cc = ( average, ts)-> System.out.println("driving......."+"averge with"+average+ "speed is "+ts);

   // if we have only one parameter than open bracket it optional we can it as average-> sout(); and defining data type
        // of parameter is  also optional


        cc.drive(23,903);
    }
}
