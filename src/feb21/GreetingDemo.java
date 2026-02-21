package feb21;

public class GreetingDemo {
    public static void main(String[] args) {

        Greeting greeting = new Greeting();
        String result = greeting.greeting("Mike");
        System.out.println(result);
    }
}
