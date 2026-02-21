package feb21;

import java.util.Scanner;

public class LotterySystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int jackpot = 25;
        System.out.println("Enter your lucky number ");
        int userInput = scanner.nextInt();

        if(jackpot == userInput){
            System.out.println("You won the lottery");
        }


    }
}
