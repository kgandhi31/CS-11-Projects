package OOP3_BankAccount;

import java.util.Scanner;
import java.util.ArrayList;

public class Banking_Main {

    static ArrayList<BankAccount> allClients = new ArrayList();
    static Scanner numscan = new Scanner(System.in);
    static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {

        allClients.add(new BankAccount("TD Canada Trust", "Mr. Mergel", 1000));
        allClients.add(new BankAccount("Scotiabank", "Mrs. Snyman", 2000));

        while (true) {
            System.out.println("Type the name of the person from the following list for the account you want to explore:");
            System.out.println();
            for (int i = 0; i < allClients.size(); i++){
                    System.out.println("- "+allClients.get(i).clientName);
            }
            String search = wordscan.nextLine();
            int index = -1;
            for (int i = 0; i < allClients.size(); i++) {
                if (search.equalsIgnoreCase(allClients.get(i).clientName)) {
                    index = i;
                }
            }
            if (index >= 0) {
                System.out.println();
                System.out.println("Account identified:" + allClients.get(index).clientName + "  Bank:" + allClients.get(index).bank);
                while (true) {
                    System.out.println();
                    System.out.println("Select from the following options:");
                    System.out.println("1.Make Deposit \n2.Make Withdrawal \n3.Get Balance \n4.Exit and return to main menu");
                    int choice = numscan.nextInt();
                    if (choice == 1) {
                        System.out.println();
                        System.out.println("Type the amount you want to deposit?");
                        double amount = numscan.nextDouble();
                        allClients.get(index).deposit(amount);
                    } else if (choice == 2) {
                        System.out.println();
                        System.out.println("Type the amount you want to withdraw?");
                        double amount = numscan.nextDouble();
                        if ((amount + 0.50) > allClients.get(index).getBalance()) {
                            System.out.println("Sorry, the balance is insufficient to withdraw with the above amount.");
                        } else {
                            allClients.get(index).withdraw(amount);
                            System.out.println(allClients.get(index).clientName + " you have withdrawn $" + amount + " on " + allClients.get(index).date + ".");
                        }
                    } else if (choice == 3) {
                        System.out.println();
                        System.out.println(allClients.get(index).clientName + " your balance is $" + allClients.get(index).getBalance() + ".");
                    } else if (choice == 4) {
                        System.out.println();
                        System.out.println("You have returned to the main menu.");
                        System.out.println();
                        break;
                    }
                }//end inner while loop
            } else {
                System.out.println("Account Not Found. Please try again.");
                System.out.println();
            }
        }//end while loop

    }//end main

}//end class
