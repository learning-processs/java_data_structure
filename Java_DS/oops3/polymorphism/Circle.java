package oops3.polymorphism;

public class Circle extends Shapes{

    // This will run when obj of circle is created
    // hence it is overriding the parent method
    
    @Override // this is called annotation
    void area(){
        System.out.println("Area of circle is pie * r * r");
    }
}

