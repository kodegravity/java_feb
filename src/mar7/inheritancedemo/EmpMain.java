package mar7.inheritancedemo;

public class EmpMain {
    public static void main(String[] args) {
        Address mikeAddress = new Address(101, "Bathhurt street", "Toronto", "M1R 4f5", "ON", "CA");
        Address peterAddress = new Address(101, "Bathhurt street", "Toronto", "M1R 4f5", "ON", "CA");
        Address johnAddress = new Address(101, "Bathhurt street", "Toronto", "M1R 4f5", "ON", "CA");
        Address emmaAddress = new Address(101, "Bathhurt street", "Toronto", "M1R 4f5", "ON", "CA");


        Employee mike = new Employee("101","Mike" ,"mike@gmail.com", mikeAddress, 234234.34);
        Employee peter = new Employee("102","Peter" ,"peter@gmail.com", peterAddress, 234234.34);
        Employee John = new Employee("103","John" ,"peter@gmail.com", johnAddress, 234234.34);
        Employee emma = new Employee("104","Emma" ,"peter@gmail.com", emmaAddress, 234234.34);

        System.out.println(mike);
        System.out.println(peter);
    }
}
// address : streenumber, streename, city , postal code, country , province