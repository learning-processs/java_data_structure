package oops4.access;

public class SubClass extends A{

    public SubClass(int num, String name){
        super(num, name);  // calling the constructor of parent class..
    }
    public static void main(String[] args) {
        SubClass obj = new SubClass(25, "Anu");
        int n = obj.num;
    }
}
