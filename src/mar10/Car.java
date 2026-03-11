package mar10;


class Car extends Vehicle {
    String brand;

    public Car(String bodyType, String brand) {
        super(bodyType); // calling parent class constructor
        this.brand = brand;
    }

    void drive(){
        System.out.println("Car can be driven");
    }

    void displayCarDetails(){
        start();
        System.out.println("Body Type : " + bodyType);
        System.out.println("Body Type : " +brand);
    }
}
