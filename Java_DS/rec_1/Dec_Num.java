package rec_1;

public class Dec_Num {
    public static void main(String[] args) {

        int n = 5;
        nToOne(n);
    }

    static void nToOne(int n){
        if(n==0 ){
            return;
        }

        System.out.println(n);
        nToOne(n-1);
    }

    static void revFun(int n){
        if (n == 0) {
            return;
        }

        revFun(n - 1);
        System.out.println(n);
    }
}
