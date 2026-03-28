package mar28.collectiondemo;

public class Main {
    public static void main(String[] args) {
        Container<String, Integer> container = new Container<>("iphone", 123);
        System.out.println(container.getItem1());
        System.out.println(container.getItem2());

        Container<String, Double> container1 = new Container<>("Mike",  1200.23);
        Container<String, String> container2 = new Container<>("Mike",  "Toronto");

    }
}

/*
Java is type safe
String item1    : String type data
String item2




 */
