package mar28;

public class Sample {
    public static void main(String[] args) {

        int[] arr = {10,324,5,34,643,45};
        try {
            System.out.println(arr[8]);

        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Always execute");
            // database connection closing code..
            // scanner.close
        }
        System.out.println("Last line...");

    }
}
