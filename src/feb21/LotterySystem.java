package feb21;

import java.util.Scanner;

public class LotterySystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int jackpot = 25;
        int attempt = 3;
        int count = 0;

        System.out.println("Welcome to My Lottery System!!");
        System.out.println("You will get 3 attempt MAX");

        while (count <  attempt){  // 0 < 3

            System.out.println("Enter the lucky number you want to play");
            int userInput = scanner.nextInt();  // 45

            if(jackpot == userInput){
                System.out.println("You won the Lottery");
                break;
            }else{
                count ++;
                if(count < attempt){
                    System.err.println("Not a lucky Number!!!");
                }else {
                    System.err.println("You ran out of attempts");
                }
            }

        }



    }
}
