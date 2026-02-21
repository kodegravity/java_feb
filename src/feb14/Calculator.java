package feb14;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("********************");
            System.out.println("Welcome to My Calculator");
            System.out.println("********************");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("0. Exit");

            // take a user input
            System.out.println("Enter your choice from menu");
            int choice = scanner.nextInt();

            if(choice == 1) {
                Calculator calculator = new Calculator();
                calculator.sum();


            } else if(choice == 2) {
                System.out.println("Enter the first Number ");
                int x = scanner.nextInt();
                System.out.println("Enter the second Number ");
                int y = scanner.nextInt();
                int sub = x - y;

            }
        }while (true);
       

        // enter the first number
        // enter the second number

        // add two numbers

        // subtract

        // multiplication

        // Division


/*

1. create a calculator with switch case
2.  IVR

Press 1 for ENglish
            1. Billing
                1. Mobile
                2. Internet
            2. sales
            3. technical support

Press 2 for French




 */





    }

    public void sum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number ");
        int x = scanner.nextInt();
        System.out.println("Enter the second Number ");
        int y = scanner.nextInt();

        int sum = x + y;

        System.out.println(sum);
    }


}
