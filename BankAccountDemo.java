/*
Henry Do ＆ Shoto Morisaki　＆Riana Ali
May 26th 2021
Project 3
*/

public class BankAccountDemo 
{
    public static void main(String args[]) 
    {
        // Create 3 objects
        BankAccount AdamsAcc = new BankAccount();
        BankAccount SamsAcc = new BankAccount(1000, "Sam", 's');
        BankAccount LeilasAcc = new BankAccount(5600, "Leilas", 'c');

        AdamsAcc.setBalance(8100);
        AdamsAcc.setName("Adam");
        AdamsAcc.setAccountType('c');
        AdamsAcc.setInterestRate(4.25);
        System.out.println("Adam's balance " + AdamsAcc.getBalance());
        System.out.println("Adam's Name " + AdamsAcc.getName());
        System.out.println("Adam's Account Type " + AdamsAcc.getAccountType());
        System.out.println("Adam's Interest Rate " + AdamsAcc.getInterestRate());

        // System.out.println("Bank information : " + "Adam");
        // AdamsAcc.displayAccountInfo();
        // System.out.println("Bank information : " + "Sam");
        // SamsAcc.displayAccountInfo();
        // System.out.println("Bank information : " + "Leilas");
        // LeilasAcc.displayAccountInfo();

        // LeilasAcc.addInterest(4.5, 3000.00);
        // SamsAcc.addInterest(4.5, 3000.00);
        // AdamsAcc.transfer(1000.00, LeilasAcc);
        // LeilasAcc.deposit(600);
        // LeilasAcc.withdraw(1200);

        // System.out.println("Bank information : " + "Adam");
        // AdamsAcc.displayAccountInfo();
        // System.out.println("Bank information : " + "Sam");
        // SamsAcc.displayAccountInfo();
        // System.out.println("Bank information : " + "Leilas");
        // LeilasAcc.displayAccountInfo();

        SamsAcc.withdraw(80000000);
        System.out.println("Bank information : " + "Sam");
        SamsAcc.displayAccountInfo();
    }
}