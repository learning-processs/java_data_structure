package oops3.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes s1 = new Shapes();
        Circle c1 = new Circle();
        Sqare q1 = new Sqare();
        Triangle t1 = new Triangle();
        Cube c2 = new Cube();

        s1.area();
        c1.area();
        t1.area();
        c2.area();
    }
}
