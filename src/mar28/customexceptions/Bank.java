package mar28.customexceptions;

public class Bank {
    private double accountBalance;

    public Bank(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // deposit
    public double deposit(double amount){
        accountBalance = accountBalance + amount;
        return accountBalance;
    }

    public double withdraw(double amount){
        if(amount >  accountBalance){
            // creating our own exception based on the business usage
            throw new InsufficientBalanceException("Insufficient Balance Exception");
        }
        accountBalance = accountBalance - amount;
        return accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}
