package feb21;

public class Car {
    // variables
    String brand;
    String model;
    int speed;
    int numberOfSeats;

    public Car() {
    }

    public Car(String brand, String model, int speed, int numberOfSeats) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.numberOfSeats = numberOfSeats;
    }

    // methods  - behaviours
    public void drive(){
        System.out.println("You can drive the car from point A to B");
    }

    public void stop(){
        System.out.println("car can stop ");
    }

    public void accelerate(){
        System.out.println("Car can accelerate");
    }

    public void display(){
        System.out.println(numberOfSeats);
        System.out.println(brand);
        System.out.println(model);
        System.out.println(speed);
    }
}
