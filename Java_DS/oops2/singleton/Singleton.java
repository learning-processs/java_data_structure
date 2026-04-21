package oops2.singleton;

// a Singleton class is a design pattern that ensures only one instance of a 
// class is created and provides a global point of access to that
public class Singleton {

    private int num = 0;
    private Singleton(){ // if put private on constructor it can't allow to create obj in other file
    
    }

    private static Singleton instance;

    static Singleton getInstance(){

        if(instance == null){
            instance = new Singleton();
        }
        
        return instance;
    }
    public static void main(String[] args) {
        
    }
}
