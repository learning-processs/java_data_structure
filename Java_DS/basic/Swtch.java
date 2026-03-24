package basic;
import java.util.Scanner;

public class Swtch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        String day = in.next();
        System.out.println("Enter the emp : ");
        String emp = in.next();

        switch (day) {
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                switch (emp) {
                    case "a":
                        System.out.println("Software Engineer");
                        break;
                    case "b":
                        System.out.println("MERN Stack");
                        break;
                    default:
                        System.out.println("No department");
                }
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
