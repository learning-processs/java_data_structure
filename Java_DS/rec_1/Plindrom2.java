package rec_1;

public class Plindrom2 {
    public static void main(String[] args) {
        int n = 12321;
        System.out.println(palindrom(n));

    }

    static int sum = 0;
    static void rev(int n){
        if(n == 0){
            return;
        }

        int rem = n % 10;
        sum = sum * 10 +rem;
        rev(n/10);
    }

    static boolean palindrom(int n){
        sum = 0;
        rev(n);
        return n == sum;
    }
}
