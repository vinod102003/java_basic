public class ifesle {
    public static void main(String[] args) {
        int age = 98;
        if(age>=18 && age<60){
            if(age>=20 && age<=30){
                System.out.println("your'e in 20's");
            }else if(age>30 && age<=60){
                System.out.println("your'e in 30's");
            }else {
                System.out.println("your'e in teen age");
            }
        }else if(age>=60){
            System.out.println("your'e old");
        }else{
            System.out.println("your'e a kid");
        }
    }
}
