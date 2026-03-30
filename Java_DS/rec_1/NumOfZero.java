package rec_1;

public class NumOfZero {
    public static void main(String[] args) {
        int n = 12030430;
        System.out.println(numOfZero(n));
    }

    static int numOfZero(int n) {
        if (n == 0) {
            return 0;
        }

        int rem = n % 10;
        return (rem == 0 ? 1 : 0) + numOfZero(n/10);
    }
}
