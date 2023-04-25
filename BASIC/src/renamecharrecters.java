public class renamecharrecters {
    public static void main(String[] args) {
        String str = "Hello,have a good day";
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (vowels.indexOf(c) != -1) {
                sb.append(c);
            }
        }

        String result = sb.toString();
        System.out.println(result);




    }
}
