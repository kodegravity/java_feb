package mar7.inheritancedemo;

public class Employee {
    String id;
    String name;
    String email;
    Address address;
    double salary;

    public Employee(String id, String name, String email, Address address, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.salary = salary;
    }

    public void printEmployeeDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(address);
        System.out.println(salary);
    }
}
