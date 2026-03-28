package rec_1;

public class Factorial {
    public static void main(String[] args) {
        int n = 3;
        int result = factorial(n);
        System.out.println(result);
    }

    static int factorial(int n){
        if( n == 1){
            return 1;
        }

        return n*factorial(n-1);
    }
}
