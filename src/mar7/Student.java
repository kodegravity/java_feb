package mar7;

public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        Student student = new Student(101, "Vikas");
        // Student student ----------->new Student(101, "Vikas");
        //        Stack                 Heap
        System.out.println(student.toString());

    }
}