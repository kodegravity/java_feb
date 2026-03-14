package mar14;

public class VehicleMain {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.start();

        // Upcasting : assigning child class object to parent class reference
        Vehicle car = new Car();
        car.start(); // toString()

        System.out.println(car.toString());
    }
}










