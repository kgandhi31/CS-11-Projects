//the order of parameters matters!!!!!

import java.util.Scanner;

public class Ex2_BankingParameters {

    public static Scanner numscan = new Scanner(System.in);
    public static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {

        double account1 = 1000;
        String choice;

        do{       
        System.out.println("deposit, withdraw, balance or exit");
        choice = wordscan.nextLine().toLowerCase();

        if (choice.contains("bal")) {
            printBalance(account1);
        } else if (choice.equals("deposit")) {
            System.out.println("How much do you want to deposit?");
            double amount = numscan.nextDouble();

            account1 = deposit(account1, amount);

        } else if (choice.contains("draw")) {
            System.out.println("How much do you want to withdraw?");
            double amount = numscan.nextDouble();

            account1 = withdraw(account1, amount);
        }
        
        }while(! choice.equals("exit"));
    }//end main

    public static double withdraw(double balance, double amt) {
        if (balance >= amt + 0.50) {
            balance -= amt;
            balance -= 0.50;
        } else {
            System.out.println("Insufficient Funds");
        }
        printBalance(balance);
        return balance;
    }//end withdraw

    public static double deposit(double balance, double amt) {
        balance += amt;
        printBalance(balance);

        return balance;
    }//end deposit

    public static void printBalance(double balance) {
        System.out.println("Your balance is $" + balance);

    }//printBalance

}//end class
