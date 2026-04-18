package oops;

public class Introduction {
    public static void main(String[] args) {

        Student s = new Student(); // student()=>constructor

        // s.name= "Anu";
        // s.rollNo= 28;
        // s.marks= 8.5f;

        s.changeName("Lia");
        s.greeting();


        // System.out.println(s.name);
        // System.out.println(s.rollNo);
        // System.out.println(s.marks);

    }
}

class Student {
    String name;
    int rollNo;
    float marks = 9.0f;



    void greeting() {
        System.out.println("Hello! My name is " + name);
    }

    void changeName(String newName){
        name = newName;
    }

    Student() { // Constructor
        this.name = "Anu";
        this.rollNo = 28;
        this.marks = 9.0f;
    }

}