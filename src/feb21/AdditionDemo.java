package feb21;

public class AdditionDemo {
    public static void main(String[] args) {

        // create object of Additon class
        Addition addition = new Addition();
        int result = addition.add(10, 20);


        int average = result / 2;
        System.out.println("Average " + average);
    }
}
