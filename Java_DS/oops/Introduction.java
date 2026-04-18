package oops;

public class Introduction {
    public static void main(String[] args) {

        Student s = new Student("Anu", 28, 9.4f); // student()=>constructor
        Student s2 = new Student("Lia",32,2.3f);
        // s.name= "Anu";
        // s.rollNo= 28;
        // s.marks= 8.5f;

        // s.changeName("Lia");
        // s.greeting();


        System.out.println(s.name);
        System.out.println(s.rollNo);
        System.out.println(s.marks);
        System.out.println();

        System.out.println(s2.name);
        System.out.println(s2.rollNo);
        System.out.println(s2.marks);


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

    this keyword just replacing the referance varible

    Student(String name, int rollNo , float marks) { // Constructor
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

}