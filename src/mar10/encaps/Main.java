package mar10.encaps;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Mike", "Java", 23);
        System.out.println(student);

        System.out.println(student.getAge());
        System.out.println(student.getCourse());
        System.out.println(student.getName());

        System.out.println("Student modified ");
        System.out.println(student);
    }
}
