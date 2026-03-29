package rec_1;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        int result = sumOfDigits(n);
        System.out.println(result);


        int result1 = prodOfDigits(n);
        System.out.println(result1);
    }

    static int sumOfDigits(int n) {
        if (n == 0){
            return 0;
        }
        return (n%10) + sumOfDigits(n/10);
    }

     static int prodOfDigits(int n) {
        if (n == 0){
            return 1;
        }
        return (n%10) * prodOfDigits(n/10);
    }
}
