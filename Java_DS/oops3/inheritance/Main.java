package oops3.inheritance;

public class Main {
    public static void main(String[] args) {
        // Box b1 = new Box();
        // Box b2 = new Box(4.3);

        // System.out.println(b1.l + " " +  b1.w + " " + b1.h );
        // System.out.println(b2.l + " " +  b2.w + " " + b2.h );



        BoxWEight b3 = new BoxWEight();
        System.out.println(b3.h + " " + b3.w);

        BoxWEight b4 = new BoxWEight(2,3,4,8);
        System.out.println("--");
        System.out.println(b4.l + " " + b4.weight);


        BoxPrice box = new BoxPrice();
        



    }
}
