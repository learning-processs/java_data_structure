package rec_1;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1824;
        revNumber(n);
        System.out.println(sum);

    }

    static int sum = 0;

    static void revNumber(int n) {
        if (n == 0) {
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        revNumber(n / 10);
    }

    // static int revNumber2(int n) {
    //     int digits = (int) (Math.log10(n)) + 1;
    //     return helper(n, digits);
    // }

    // static int helper(int n, int digits) {
    //     if(n%10 == n){
    //         return n;
    //     }

    //     int rem = n % 10;
    //     return  rem * (int)Math.pow(10, digits - 1) + helper(n/10, digits);
    // }
}
