package mar3;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String s1 = "  hello   ";
        String s2 = "HELLO";
        char[] chars = s1.toCharArray();// convert string to array

        System.out.println(s1.length());


        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        System.out.println(s1.startsWith("hello")); // hel llo lo he
        System.out.println(s1.substring(0, 2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s1.charAt(0));

        System.out.println(s1.indexOf('e'));
        System.out.println(s1.isEmpty());
        System.out.println(s1.trim());


    }
}
