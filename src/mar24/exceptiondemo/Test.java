package mar24.exceptiondemo;

public class Test {
    public static void main(String[] args) {


        int x = 10;
        int y = 0;
        try {
            int div = x / y;
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("End");

    }
}
/*
x = take user input
y take this input from scanner , 10,20,0,34,53

double div = x/y;



 */



