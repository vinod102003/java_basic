public class increment {
    public static void main(String[] args) {
        int a =46;
        int b =65;
        b = ++a + a++ + ++a + a++;
        System.out.println(b);
        System.out.println(a);
    }
}
