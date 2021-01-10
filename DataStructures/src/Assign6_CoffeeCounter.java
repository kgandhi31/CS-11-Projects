//80% - Error on 'not found', missing the average calculation

import java.util.Scanner;

public class Assign6_CoffeeCounter {

    public static Scanner numscan = new Scanner(System.in);
    public static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {

        String[] allDrinks = Files.loadStringArr("allDrinks.txt");
        double[] allCalories = Files.loadDoubleArr("allCalories.txt");
        double[] allFat = Files.loadDoubleArr("allFat.txt");
        double[] allSodium = Files.loadDoubleArr("allSodium.txt");
        String drinkBought;
        String loop = "";
        double totalCalories = 0;
        double totalFat = 0;
        double totalSodium = 0;
        int numDrinks = 0;
        int week = 0;

        while (true) {
            for (int i = 0; i < allDrinks.length; i++) {
                System.out.println(allDrinks[i]);
            }
            System.out.println();
            System.out.println("What drink did you drink today?");
            drinkBought = wordscan.nextLine();

            if (drinkBought.equalsIgnoreCase("exit")) {
                break;
            }

            int result = -1;
            result = search(allDrinks, drinkBought);

            if (result < 0) {
                System.out.println("Sorry, the drink you have typed is not in the list.");
            } else if (result >= 0) {
                totalCalories += allCalories[result];
                totalFat += allFat[result];
                totalSodium += allSodium[result];
                numDrinks++;
                week++;
                System.out.println("You consumed: " + allCalories[result] + " calorie(s), " + allFat[result] + " gram(s) of fat and " + allSodium[result] + " mg of sodium.");
            }

            if (week == 7) {
                System.out.println();
                System.out.println("You have reached the end of the week.");
                System.out.println("On average you have consumed: " + (totalCalories / numDrinks) + " calorie(s), " + (totalFat / numDrinks) + " gram(s) of fat and " + (totalSodium / numDrinks) + " mg of sodium.");
                week = 0;
            }
            System.out.println();

        }//end while loop

        if (drinkBought.equalsIgnoreCase("exit")) {
            System.out.println("For " + numDrinks + " day(s): On average you have consumed: " + (totalCalories / numDrinks) + " calorie(s), " + (totalFat / numDrinks) + " gram(s) of fat and " + (totalSodium / numDrinks) + " mg of sodium.");
        }
    }//end main

    public static int search(String[] array, String searchTerm) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if ((array[i].equalsIgnoreCase(searchTerm))) {
                index = i;
                break;
            }
        }
        return index;
    }//end search

}//end class
