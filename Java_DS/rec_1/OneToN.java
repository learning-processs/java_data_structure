package rec_1;

public class OneToN {
    public static void main(String[] args) {
        int n = 1;
        oneToN(n);
    }

    static void oneToN(int n){
        if(n == 6){
            return;
        }

        System.out.println(n);
        oneToN(n+1);
    }
}
