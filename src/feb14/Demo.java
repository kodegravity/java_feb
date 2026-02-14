package feb14;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        // switch case
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");
        int input = scanner.nextInt();

        switch (input) {
            case 1 :
                System.out.println("Case 1 ");
                break;
            case 2 :
                System.out.println("Case 2 ");
                break;
            case 3 :
                System.out.println("Case 3 ");
                break;

            default:
                System.out.println("Invalid");
        }


    }
}
