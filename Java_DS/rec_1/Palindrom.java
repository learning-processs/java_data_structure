package rec_1;

public class Palindrom {
    public static void main(String[] args) {
        int n = 1234321;
        System.out.println(palindrom(n));
    }

    static int rev(int n){
        if(n == 0){
            return 0;
        }

        int rem = n % 10;
       return rem * (int)Math.pow(10, (int)Math.log10(n)) + rev(n/10);
    }

    static boolean palindrom(int n ){
        return n == rev(n);
    }
}
