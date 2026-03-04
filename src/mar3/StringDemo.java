package mar3;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        int x = 10;

        // + overloaded operator integer + integer = add
        // string + integer = concatenate
        System.out.println(s1 + 100 + 200 );  //a100200  , a300
        System.out.println(s3 + 100 + s1 + s3); // c100ac
        System.out.println(200 + 100 + s3 + s2); // 300cb
        System.out.println(x + "200" + "300" + s3 + 100); // 600c100
    }
}
