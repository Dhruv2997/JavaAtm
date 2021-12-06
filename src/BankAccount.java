public class BankAccount
{
    private double balance;

    //Constructs a bank account with a zero balance.

    public BankAccount()
    {
        balance = 0;
    }

    //Constructs a bank account with a given balance.

    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    //Deposits money into the bank account.

    public void deposit(double amount)
    {
        double newBalance = balance + amount;
        balance = newBalance;
    }

    //Withdraws money from the bank account.

    public void withdraw(double amount)
    {
        double newBalance = balance - amount;
        balance = newBalance;
    }

    //Gets the current balance of the bank account.

    public double getBalance()
    {
        return balance;
    }
}