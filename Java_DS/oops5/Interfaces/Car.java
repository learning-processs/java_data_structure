package oops5.Interfaces;

public class Car implements Engine , Brake{

    @Override
    public void brake() {
        System.out.println("I brake like a normal car...");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal Car..");
    }

    @Override
    public void stop() {
        System.out.println("I Stop like a normal Car..");

    }

    @Override
    public void accelerate() {
        System.out.println("I Accelerate like a normal Car..");

    }
    
}
