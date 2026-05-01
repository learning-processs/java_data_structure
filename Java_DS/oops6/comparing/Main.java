package oops6.comparing;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(28, 95);
        Student s2 = new Student(25, 98);

        if(s1.compareTo(s2) < 0){
            System.out.println("S1 has more Marks");
        }

    }
}
