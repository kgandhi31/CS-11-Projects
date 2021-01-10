package OOP3_BankAccount;

public class BankAccount {

    //instance variables
    public String bank;
    public String clientName;
    private double balance;
    public String date;

    //constructor method
    public BankAccount(String bankName, String userName, double openingAmount) {
        bank = bankName;
        clientName = userName;
        balance = openingAmount;
        date = "May 14, 2018";
    }

    //instance methods
    public void deposit(double depAmount) {
        balance += depAmount;
    }//end deposit

    public void withdraw(double wdAmount) {
        balance -= (wdAmount + 0.50);
    }//end withdraw

    public double getBalance() {
        return balance;
    }//end getBalance

}
