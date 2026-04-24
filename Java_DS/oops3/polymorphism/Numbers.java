package oops3.polymorphism;

public class Numbers {

    //  Compile time Polymorphism...
    double sum(double a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(2, 5);
        obj.sum(2, 5, 5);
    }
}
