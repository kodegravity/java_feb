package april11;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "John", "Mike", "Mark", "Peter", "Bob", "John", "alice");

        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames);
    }
}
