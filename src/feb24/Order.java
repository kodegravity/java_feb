package feb24;

public class Order {
    int orderId;
    String productName;
    String customerName;
    double amount;

    public Order() {
    }

    public Order(int orderId, String productName, String customerName, double amount) {
        this.orderId = orderId;
        this.productName = productName;
        this.customerName = customerName;
        this.amount = amount;
    }

    public void printOrderDetails(){
        System.out.println("Order ID :"+orderId);
        System.out.println("Product Name :"+productName);
        System.out.println("Customer Name : "+customerName);
        System.out.println("Amount :" +amount);
    }
}
