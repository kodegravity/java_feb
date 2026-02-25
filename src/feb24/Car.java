package feb24;

public class Car {
    // instance variable
    String brand;
    String color;
    int topSpeed;

    Car(){
        brand = "Audi";
        color = "Blue";
        topSpeed = 200;
    }

    public Car(String brand, String color, int topSpeed) {
        this.brand = brand;
        this.color = color;
        this.topSpeed = topSpeed;
    }

    public void display(){
        System.out.println(brand);
        System.out.println(color);
        System.out.println(topSpeed);
    }
}
