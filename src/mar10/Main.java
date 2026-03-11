package mar10;

class Main {
    public static void main(String[] args) {
        Car car = new Car("Sedan", "Honda");
        car.drive();
        car.start();
        System.out.println(car.toString());
    }
}