package mar7;

public class Demo {
    public static void main(String[] args) {

//        String s = "hello";
//        String result = s + " how are you?";
//        System.out.println(result); //hello how are you?
//        System.out.println(s); //   hello


        // Thread safe
        StringBuffer sb = new StringBuffer("Hello");
        StringBuffer result = sb.append(" How are you ?");
        System.out.println(result); // Hello How are you?
        System.out.println(sb); // Hello How are you?  - N   // Hello  - A


        // Google search
        StringBuilder stringBuilder = new StringBuilder("Toronto");
        StringBuilder v = stringBuilder.append(" Downtown");
        System.out.println(v);
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.reverse());
    }
}
