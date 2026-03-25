package mar24.exceptiondemo;

public class Test {
    public static void main(String[] args) {

        String s = "hello";
        s = null;

        try {
            System.out.println(s.toUpperCase());
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        System.out.println("Hello end of program");
    }
}

/*
x = take user input
y take this input from scanner , 10,20,0,34,53

double div = x/y;



 */



