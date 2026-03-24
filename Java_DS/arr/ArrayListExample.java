package arr;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
    /*  
        list.add(64);
        list.add(63);
        list.add(60);
        list.add(61);

        System.out.println(list.contains(64));     
        System.out.println(list.contains(69));      // Contain
        list.set(0,19);               //set
        list.remove(2);                         //remove
        System.out.println(list);
     */ 
    
   
        System.out.println("Enter your Number : ");
        for(int i = 0 ; i < 5 ; i++){    // input
            list.add(sc.nextInt());
        }

        for(int i = 0 ; i < 5 ; i++){
            System.out.println(list.get(i));    // 1. print
        }
        System.out.println(list);               // 2. print
   
   
    }
}
