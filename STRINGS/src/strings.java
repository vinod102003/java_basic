public class strings {
    public static void main(String[] args) {
        String brand1= "pw skills";
       // System.out.println(brand1);
        brand1 = brand1.concat("bangalore");
        System.out.println(brand1);

        StringBuilder brand = new StringBuilder("pw skills");
 brand.append("bangalore");
        System.out.println(brand);
    }
}
