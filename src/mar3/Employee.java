package mar3;

public class Employee {
    int empId;
    String name;
    double salary;
    static String companyName = "Microsoft";

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public void printEmployee(){
        System.out.println(empId);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(companyName);
    }
}
