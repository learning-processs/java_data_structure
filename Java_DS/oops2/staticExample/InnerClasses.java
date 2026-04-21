package oops2.staticExample;

import java.util.Arrays;

// Outer classes can't be static 
public class InnerClasses {

    // Only inner classes can be static
    // Becoz it is inner class so it depend on outer one that's 
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString(){
            return name;
        }
    }

    public static void main(String[] args) {
        Test t1 = new Test("Anu");
        Test t2 = new Test("Vin");
        Arrays.toString(new int[] {3,4});

        System.out.println(t1.name);
        System.out.println(t2.name);
    }
}
