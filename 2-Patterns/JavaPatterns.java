public class JavaPatterns {

    public static void hollow_rectangle(int row, int col) {
        // outer loop - row
        for (int i = 1; i <= row; i++) {
            // inner loop - column
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
                // System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inver_rot_pyramid(int n) {
        // outer loop - row
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // start *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

    public static void inverted_half_pyramid(int n) {
        // outer loop - row
        for (int i = n; i >= 1; i--) {
            // innver loop - column
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void floyd_triangle(int n) {
        int coutner = 1;
        // outer loop - row
        for (int i = 1; i <= n; i++) {
            // inner loop - column
            for (int j = 1; j <= i; j++) {
                System.out.print(coutner + " ");
                coutner++;
            }
            System.out.println();
        }

    }

    public static void zero_one_triangle(int n) {
        // outer loop - no of lines
        for (int i = 1; i <= n; i++) {
            // inner loop - what to print
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " ");
                } else
                    System.out.print("0" + " ");
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // star - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space - 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // star - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = n; i >= 1; i--) {
            // star
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            // space
            for (int j = 2 * (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            // star
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void solid_rhombus(int n) {
        // outer loop - i
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n) {
        // outer loop - i
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == n || i == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond_pattern(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = n; i >= 1; i--) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void number_pyramid(int n) {
        int counter = 1;
        // outer loop = i
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // number
            for (int j = i; j <= (2 * i - (1)); j++) {
                System.out.print(counter + " ");

            }
            counter++;
            System.out.println();
        }
    }

    public static void palindrom_pyramid(int n) {
        int counter = 1;
        // outer loop - i
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // deacrese the number
            for (int j = counter; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= counter; j++) {

                System.out.print(j);
            }
            System.out.println();
            counter++;
        }
    }

    public static void main(String[] args) {
        palindrom_pyramid(15);
    }
}
