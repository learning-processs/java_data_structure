package oops5.abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age){
       super(age);
    }

    @Override
    void career(){
        System.out.println("Daughter -> Career");
    }

    @Override
    void partner(){
        System.out.println("Daughter -> Partner" );
    }
}
