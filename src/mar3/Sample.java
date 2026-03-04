package mar3;

public class Sample {
    public static void main(String[] args) {

        String s1 = "hello"; //  xe43d    created in String constant pool

        String s2 = "hello";  // xe43d
        String s3 = new String("hello"); // not in string constant pool

        System.out.println(s1 == s3); //false
        System.out.println(s1.equals(s3)); //true


        // compare two strings
        //  ==           ------> compares the reference
        // .equals()     ----->  content of the string variables


    }
}













