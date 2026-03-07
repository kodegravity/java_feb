package mar7.inheritancedemo;

public class Main {
    public static void main(String[] args) {

        // object of child class
        Student student = new Student(); // memory
        student.name = "Mike";
        student.studentId = 101;
        student.age = 25;
        student.course = "Java Full stack";

        student.displayStudentInfo();
        student.displayPersonInfo();
    }
}
