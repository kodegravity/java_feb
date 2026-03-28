package mar28;

public class Test {
    public static void main(String[] args) {

        //StackOverflowError  - error

        // checked exception
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int[] arr = {10,324,5,34,643,45};

        // unchecked exception
        try {
            System.out.println(arr[8]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
