/*
Henry Do ＆ Shoto Morisaki　＆Riana Ali
May 26th 2021
Project 3
*/

public class BankAccount 
{
    // Instance Variables
    private double balance;
    private String accName;
    private int accNum;
    private char accountType;
    private double interestRate;
    static int lastAccNum = 0;

    public BankAccount()
    {
        balance = 0;
        accName = "   ";
        lastAccNum++;
        accNum = lastAccNum;
    }

    public BankAccount(double balance, String accName, char accountType)
    {
        this.balance = balance;
        this.accName = accName;
        this.accountType = accountType;
        lastAccNum++;
        accNum = lastAccNum;
    }
    
    // 4 setter methods
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public void setName(String accName)
    {
        this.accName = accName;
    }
    public void setAccountType(char accountType)
    {
        this.accountType = accountType;
    }
    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }

    // 4 getter methods
    public double getBalance()
    {
        return balance;
    }
    public String getName()
    {
        return accName;
    }
    public char getAccountType()
    {
        return accountType;
    }
    public double getInterestRate()
    {
        return interestRate;
    }
    

    public void withdraw(double withdraw)
    {
        if(withdraw > balance) 
        {
            throw new IllegalArgumentException("Amount being withdrawn exceeds balance");
        } else 
        {
            setBalance(this.balance -= withdraw);
        }
    }
    public void deposit(double amount)
    {
        setBalance(this.balance += amount);
    }
    public void transfer(double amount, BankAccount acc)
    {
        withdraw(amount);
        acc.deposit(amount);
    }
    public void addInterest(double interestRate, double balance)
    {
        if (accountType =='s')
        {
            double interest = Financial.percentOf(interestRate, balance);
            balance += interest;
        }
    }
    public void displayAccountInfo()
    {
        String fmt = "%-20s %s%n";
        System.out.println("--------------------------------");
        System.out.printf(fmt, "Balance", balance); 
        System.out.printf(fmt, "Account Name", accName); 
        System.out.printf(fmt, "Account number", accNum); 
        System.out.printf(fmt, "Account Type", accountType); 
        System.out.printf(fmt, "Interest Rate", interestRate); 
        System.out.printf(fmt, "Last Account Number", lastAccNum); 
        System.out.println();
    }
}