package Pattern;

public class Patterns {
    public static void main(String[] args) {
        /*
         * pattern1(4);
         * pattern2(4);
         * pattern3(4);
         * pattern4(4);
         * 
         * pattern5(4);
         * pattern5Same(4);
         * pattern28(5);
         * pattern30(5);
         * pattern17(5);
         * pattern31(4);
         * 
         */

        pattern31Max(4);

    }
    static void pattern31Max(int n) {
        int originalN = n;
        n = 2 * n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int atEveryIndex = originalN - Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n) {
        n = 2 * n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int atEveryIndex = Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {

        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row : row;

            // space loop
            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {

        for (int row = 1; row <= n; row++) {

            // space loop
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalcolsInTRow = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalcolsInTRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalcolsInTRow; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5Same(int n) {
        for (int row = 0; row < 2 * n; row++) {

            int totalcolsInTRow = row > n ? 2 * n - row : row;

            for (int col = 0; col < totalcolsInTRow; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
