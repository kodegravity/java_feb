package april14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(560);
        list.add(13);
        Collections.sort(list);
       // System.out.println(list);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101, "Mike", 85));
        studentList.add(new Student(102, "Mark", 34));
        studentList.add(new Student(103, "Peter", 99));
        studentList.add(new Student(104, "John", 87));

        Collections.sort(studentList);
        System.out.println(studentList);
    }
}
