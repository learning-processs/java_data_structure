package oops6.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(28, 95);
        Student s2 = new Student(25, 94);
        Student s3 = new Student(16, 91);
        Student s4 = new Student(7, 90);
        Student s5 = new Student(25, 99);

        Student [] list = {s1, s2, s3, s4, s5};
        System.out.println(Arrays.toString(list));

        Arrays.sort(list);

        if(s1.compareTo(s2) < 0){
            System.out.println("S1 has more Marks");
        }

    }
}
