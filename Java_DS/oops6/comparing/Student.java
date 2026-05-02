package oops6.comparing;

public class Student implements Comparable<Student>{
    
    int rollNo ;
    int marks;

    public Student( int rollNo ,int marks){
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "Student{" + 
        "rollno=" + rollNo + 
        ", marks=" + marks + 
        '}';
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;
    }

   
}