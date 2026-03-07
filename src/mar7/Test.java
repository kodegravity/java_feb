package mar7;

public class Test {
    public static void main(String[] args) {

        String s1 = "Hello";  // String constant pool
        String s2 = new String("Welcome"); // diff
        String s3 = new String("Welcome"); // diff


        //  == compare the references
//        System.out.println(s2 == s3);
//        System.out.println(s2.equals(s3));

        System.out.println(s3.toString());
    }
}
