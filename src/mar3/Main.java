package mar3;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Mike", 234234.34);
        Employee employee2 = new Employee(102, "Peter", 2654234.34);
        Employee employee3 = new Employee(103, "Sean", 23634.34);
        Employee employee4 = new Employee(104, "David", 23454234.34);
        Employee employee5 = new Employee(105, "Nikhil", 234234.34);
        Employee employee6 = new Employee(106, "Vivek", 2342544.34);

        employee1.printEmployee();
        employee2.printEmployee();
        employee3.printEmployee();
        employee4.printEmployee();
        employee5.printEmployee();
        employee6.printEmployee();
    }
}
