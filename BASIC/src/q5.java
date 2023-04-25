package patternprograming;
public class q5  {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 5; j++) {
                if (j == 0 && i <= 3 || i == 0 || i == 3 || i == 6 || j == 4 && i >= 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (int j = 0; j < 5; j++) {
                if (j == 0 && i != 0 || j == 4 && i != 0 || i == 0 && j != 0 && j != 4 || i == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (int j = 0; j < 5; j++) {
                if (j == 0 && i != 6 || i == 6 && j != 0 && j != 4 || j == 4 && i != 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (int j = 0; j < 5; j++) {
                if (j == 0 && i != 0 || i == 0 && j != 0 && j != 4 || j == 4 && i != 0 && i != 3
                        || i == 3 && j != 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (int j = 0; j < 5; j++) {
                if (j == 0 && i != 0 || j == 4 && i != 0 || i == 0 && j != 0 && j != 4 || i == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4 && i != 0 && i != 3 && i != 6 || i == 0 && j != 4 || i == 3 && j != 4
                        || i == 6 && j != 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (int j = 0; j < 5; j++) {
                if (j == 0 || i == 3 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("     ");

            for (int j = 0; j < 5; j++) {
                if (j == 0 && i <= 3 || i == 0 || i == 3 || i == 6 || j == 4 && i >= 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (int j = 0; j < 5; j++) {
                if (j == 0 && i != 0 || j == 4 && i != 0 || i == 0 && j != 0 && j != 4 || i == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (int j = 0; j < 7; j++) {
                if (j - i == 0 || j + i == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (int j = 0; j < 5; j++) {
                if (j == 0 || i == 0 || i == 3 || i == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (int j = 0; j < 7; j++) {
                if (j == 0 || j - i == 0 || j == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (int j = 0; j < 5; j++) {
                if (j == 0 && i != 0 || j == 4 && i != 0 || i == 0 && j != 0 && j != 4 || i == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("  ");
        }
    }
}
    

