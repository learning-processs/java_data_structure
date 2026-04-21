package oops2.staticExample;

// Outer classes can't be static 
public class InnerClasses {

    // Only inner classes can be static
    // Becoz it is inner class so it depend on outer one that's 
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test t1 = new Test("Anu");
        Test t2 = new Test("Vin");

        System.out.println(t1.name);
        System.out.println(t2.name);
    }
}
