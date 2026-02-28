package feb28;

public class Student {

    {
        System.out.println("Inside the instance block");//2

    }

    Student(){
       int x = 10;
        System.out.println("Inside the constructor"); //3
    }

    public static void read(){
        System.out.println("reading...");//4
    }

    public  void study(){
        System.out.println("studying..."); //5
    }
    static {
        System.out.println("inside the static block"); //1
    }

}
