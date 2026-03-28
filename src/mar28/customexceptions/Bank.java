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

    // throws : you let the caller of this method to handle this exception
    // delegating the responsibility of handling this exception
    public double withdraw(double amount) throws InsufficientBalanceException{
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

    public void callWithdrawMethod() throws InsufficientBalanceException{

            withdraw(12334); // this is where the exception is coming

    }

    public void newMethod(){
        callWithdrawMethod();
    }
}
