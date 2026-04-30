package oops5.abstractDemo;

public abstract class Parent {

    int age;

    public Parent(int age){
        this.age = age;
    }

    void normal(){
        System.out.println("I'm normal class...");
    }

    abstract void career();
    abstract void partner();
}
