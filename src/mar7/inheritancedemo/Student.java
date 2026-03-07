package mar7.inheritancedemo;

// child class
public class Student extends Person{

    int studentId;
    String course;

    public void displayStudentInfo(){
        System.out.println("Student id " + studentId);
        System.out.println("Course " + course);
    }
}
