
import java.util.Scanner;

public class Methods_4SimpleCalculator {

    public static Scanner numscan = new Scanner(System.in);
    public static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {

        String keyPress = "";

        while (true) {
            System.out.println("Welcome to the calculator. \nPlease enter operator ( + , - , * , / , exit ).");
            keyPress = wordscan.nextLine();

            if (keyPress.equals("+")) {
                double answer = add(0);
                System.out.println("Thank you. Your answer is: " + answer);

            } else if (keyPress.equals("-")) {
                double answer = subtract(0);
                System.out.println("Thank you. Your answer is: " + answer);

            } else if (keyPress.equals("*")) {
                double answer = multiply(0);
                System.out.println("Thank you. Your answer is: " + answer);

            } else if (keyPress.equals("/")) {
                double answer = divide(0);
                System.out.println("Thank you. Your answer is: " + answer);

            } else if (keyPress.equals("exit")) {
                System.out.println("You have exited the calculator.");
                break;
            }//end choices
        }//end loop
    }//end main

    public static double add(double sum) {
        double num1;
        double num2;
        System.out.println("You chose to ADD. \nEnter first number:");
        num1 = numscan.nextDouble();
        System.out.println("Enter second number:");
        num2 = numscan.nextDouble();
        return (num1 + num2);
    }//end add

    public static double subtract(double difference) {
        double num1;
        double num2;
        System.out.println("You chose to SUBTRACT. \nEnter first number:");
        num1 = numscan.nextDouble();
        System.out.println("Enter second number:");
        num2 = numscan.nextDouble();
        return (num1 - num2);
    }//end subtract

    public static double multiply(double product) {
        double num1;
        double num2;
        System.out.println("You chose to MULTIPLY. \nEnter first number:");
        num1 = numscan.nextDouble();
        System.out.println("Enter second number:");
        num2 = numscan.nextDouble();
        return (num1 * num2);
    }//end multiply

    public static double divide(double quotient) {
        double num1;
        double num2;
        System.out.println("You chose to DIVIDE. \nEnter first number:");
        num1 = numscan.nextDouble();
        System.out.println("Enter second number:");
        num2 = numscan.nextDouble();
        while (num2 == 0) {
            System.out.println("ERROR! You cannot divde by zero! Please try again.");

            System.out.println("Enter first number:");
            num1 = numscan.nextDouble();
            System.out.println("Enter second number:");
            num2 = numscan.nextDouble();
        }
        return (num1 / num2);
    }// divide
}//end class
