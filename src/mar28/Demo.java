package mar28;

public class Demo {
    public static void main(String[] args) {

        String s = "Hello";
      //  s = null;
        try {
            System.out.println(s.toUpperCase()); // null pointer
            System.out.println("Hi");
            int[] arr = {10,324,5,34,643,45};
            System.out.println(arr[3]); // ArrayIndexOutOfBound

            System.out.println("this may cause exception...");

        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally will execute always...");
        }
        System.out.println("end of line");
    }
}


/*

username :     Alpahbet -----> 34234234 [disable keypad for numbers]
password :

10/0  --- Arithmetic exception




 */