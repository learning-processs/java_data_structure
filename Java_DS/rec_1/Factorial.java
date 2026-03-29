package rec_1;

public class Factorial {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);

        int result1 = sum(5);
        System.out.println(result1);
    }

    static int factorial(int n){
        if( n <= 1){
            return 1;
        }

        return n*factorial(n-1);
    }

    static int sum(int n){
        if (n <= 1) {
            return 1;
        }

        return n + sum(n-1);
    }
}
