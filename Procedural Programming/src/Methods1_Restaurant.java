
import java.util.Scanner;

public class Methods1_Restaurant {

    public static Scanner numscan = new Scanner(System.in);
    public static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {

        double mainSubtotal;
        int numPeople = 0;
        String firstName;
        String phone;

        System.out.println("What is the subtotal?");
        mainSubtotal = numscan.nextDouble();

        System.out.println("How many people were in your party?");
        numPeople = numscan.nextInt();

        System.out.println("What is your first name?");
        firstName = wordscan.nextLine();

        System.out.println("What is your phone number?");
        phone = wordscan.nextLine();

        addTax(mainSubtotal);
        addTip(mainSubtotal);
        splitTotal(mainSubtotal, numPeople);
        hitOn(firstName, phone);
        apologize(200);

    }//end main

    public static void addTax(double amount) {
        System.out.println("Subtotal: $" + amount);
        System.out.println("Gst: $" + amount * .05);
        System.out.println("Total: $" + amount * 1.05);
    }//end addTax

    public static void addTip(double amount) {
        System.out.println("How much tip do you want to give in percentage?");
        double tip;
        tip = numscan.nextDouble();
        System.out.println("Your new total is $" + (amount + (amount * tip / 100)));
    }//end addTip

    public static void splitTotal(double amount, int numPeople) {
        System.out.println("Each person must pay $" + (amount / numPeople));
    }//end splitTotal

    public static void hitOn(String fn, String numPhone) {
        System.out.println("Is your name Wi-fi? Because I'm really feeling a connection.");
        System.out.println("My name is " + fn + " and you should call me at " + numPhone);
    }//end hitOn

    public static void apologize(int pounds) {
        for (int i = pounds; i > 0; i--) {
            System.out.println("I am sorry.");
        }
    }//end apologize

}//end class
