package feb24;

public class OrderMain {
    public static void main(String[] args) {
        Order order = new Order();

        Order macbook = new Order(10001,"Macbook" , "Mike", 2000.23);
        macbook.printOrderDetails();
        System.out.println();
        Order iphone = new Order(10002, "Iphone", "Peter", 1500.10);
        iphone.printOrderDetails();
    }
}
