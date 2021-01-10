
import java.util.Scanner;

public class Assign3_Store {

    public static Scanner numscan = new Scanner(System.in);
    public static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {

        String toShop = "";
        double discount = 1;

        System.out.println("Welcome to the Sports store!");

        int[] numBought = new int[10];
        while (!toShop.equalsIgnoreCase("no")) {
            String[] allProducts = {"Jersey", "Shorts", "Ball ", "Pair of Cleats", "Windbreaker",
                "Team Scarf", "Addidas Bag", "Slippers", "Sweatpants", "Shinpads"};
            double[] allPrices = {49.99, 29.99, 24.99, 59.99, 27.99, 9.99, 44.99, 11.99, 34.99, 7.99};

            for (int i = 0; i < allProducts.length; i++) {
                System.out.println((i + 1) + ". " + allProducts[i] + "  " + allPrices[i]);
            }

            System.out.println();
            System.out.println("Please enter the number of the product you would like to purchase.");
            int choice = numscan.nextInt();

            if (choice == -1) {
                discount = 0.90;
                System.out.println();
                System.out.println("Do you want to continue shopping?");
                toShop = wordscan.nextLine();
            } else {
                System.out.println();
                System.out.println("How many " + allProducts[choice - 1] + "(s) would you like to buy?");
                int howMany = numscan.nextInt();
                numBought[choice] = howMany;
                if (discount == 0.90) {
                    System.out.println(numBought[choice] + " " + allProducts[choice - 1] + "(s) comes to $" + (allPrices[choice - 1] * howMany * 0.90));
                } else {
                    System.out.println(numBought[choice] + " " + allProducts[choice - 1] + "(s) comes to $" + allPrices[choice - 1] * howMany);
                }

                System.out.println();
                System.out.println("Do you want to continue shopping?");
                toShop = wordscan.nextLine();
            }
            if (toShop.equalsIgnoreCase("no")) {
                System.out.println();
                double costTotal = 0;
                if (discount == 0.90) {
                    System.out.println("Product  	Price  	Num Bought 	Total 	Discount Total");
                    for (int i = 0; i < allProducts.length; i++) {
                        if (numBought[i] > 0) {
                            System.out.println(allProducts[i - 1] + "   	" + allPrices[i - 1] + "      " + numBought[i] + "         " + (allPrices[i - 1] * numBought[i]) + "   " + allPrices[choice - 1] * numBought[i] * 0.90);
                            costTotal += (allPrices[i - 1] * numBought[i] * discount);
                        }
                    }
                } else {
                    System.out.println("Product  	Price  	Num Bought 	Total");
                    for (int i = 0; i < allProducts.length; i++) {
                        if (numBought[i] > 0) {
                            System.out.println(allProducts[i - 1] + "   	" + allPrices[i - 1] + "      " + numBought[i] + "           " + (allPrices[i - 1] * numBought[i]));
                            costTotal += (allPrices[i - 1] * numBought[i] * discount);
                        }
                    }
                }
                System.out.println("Total: " + costTotal);
                System.out.println("Thank you for shopping.");
                break;
            } else if (toShop.equalsIgnoreCase("yes")) {
                System.out.println();
            }
        }//end whileloop

    }//end main

}//end class

