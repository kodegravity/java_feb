package mar24.anonymous;

public class Main {
    public static void main(String[] args) {

/*        Vehicle vehicle = new Car();
        vehicle.start();*/

        Vehicle vehicle = new Vehicle()  {
            @Override
            public void start() {
                System.out.println("Car starts...");
            }
        };
        vehicle.start();
    }
}
