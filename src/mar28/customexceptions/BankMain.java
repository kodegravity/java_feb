package mar28.customexceptions;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank(1000);
        System.out.println("Current Account Balance : $"+bank.getAccountBalance());

        System.out.println("Enter the amount you want to deposit");
        double depositAmount = scanner.nextDouble();

        double newBalance = bank.deposit(depositAmount);
        System.out.println("Balance after deposit " + depositAmount + " is : $" +newBalance);

        System.out.println("****Withdraw*****");
        System.out.println("Enter the amount you want to withdraw");
       // double withdrawAmount = scanner.nextDouble();
        bank.callWithdrawMethod();
        //System.out.println("Balance after withdraw " + withdrawAmount + " is : $" +withdraw);
        System.out.println(":end of last line");
    }
}
