package oops7.enums;
// In Java, an enum (enumeration) is a special type used to define a fixed set of constants.
public class Basic {

    enum Week implements A{
        Monday , Tuesday , Wednesday , Thrusday, Friday , Saturday , Sunday;

        // Enum constant
        // public static final
        // since its final you can create child enums
        // Type is Week

        Week(){
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
           System.out.println("hey, I'm Hello...");
        }



        // not public or protect, only private or default;

    }
    public static void main(String[] args) {
        Week week ;
        week = Week.Monday;

        week.hello();
        System.out.println(week.valueOf("Monday"));

        // for(Week day : Week.values()){
        //     System.out.println(day);
        // }

        // System.out.println(week);

        // System.out.println(week.ordinal());
    }
}
