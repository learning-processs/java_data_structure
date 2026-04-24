package oops3.polymorphism;

public class Shapes {
    void area(){
        System.out.println("Shape class...");
    }
}


class Cube extends Shapes {
    void area(){
        System.out.println("Area is side * 4");
    }
}