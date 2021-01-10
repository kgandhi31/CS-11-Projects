package OOP1_Game;

import java.util.ArrayList;
import java.util.Scanner;

public class Game_Main {

    static Scanner numscan = new Scanner(System.in);
    static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Game> allGames = new ArrayList();

        //(String name, String console, String genre, int r)
        allGames.add(new Game("Minecraft", "PC", "sandbox", 8));
        allGames.add(new Game("God of War", "PS4", "action", 9));
        allGames.add(new Game("Dragon Ball FighterZ", "PS4", "action", 8));
        allGames.add(new Game("Far Cry 5", "Xbox One", "action", 7));
        allGames.add(new Game("PUBG", "PC", "Survival", 6));
        allGames.add(new Game("The Legend of Zelda: Breath of the Wild", "Nintendo Switch", "adventure", 6));
        allGames.add(new Game("Call of Duty WWII", "PS4", "shooter", 6));
        allGames.add(new Game("PES 2018", "PS4", "sports", 9));
        allGames.add(new Game("Rocket League", "PC", "sports", 7));

        while (true) {
            System.out.println("Select the number corresponding to the method you want to explore:");
            System.out.println("1.Print All \n2.Print by Genre \n3.Record Day's Sales \n4.Total Sales \n5.Get Highest Seller \n6.Exit");
            int choice = numscan.nextInt();
            if (choice == 1) {
                System.out.println();
                for (int i = 0; i < allGames.size(); i++) {
                    allGames.get(i).printAll();
                }
            } else if (choice == 2) {
                System.out.println();
                System.out.println("What genre of game are you looking for?");
                String search = wordscan.nextLine();
                int found = 0;
                System.out.println("We have the followling " + search + " game(s):");
                for (int i = 0; i < allGames.size(); i++) {
                    if (allGames.get(i).gameGenre.equalsIgnoreCase(search)) {
                        allGames.get(i).printAll();
                    }
                }
            } else if (choice == 3) {
                System.out.println();
                for (int i = 0; i < allGames.size(); i++) {
                    System.out.println("What are today's sales for " + allGames.get(i).gameName + "?");
                    double saleEntry = numscan.nextDouble();
                    allGames.get(i).sales = saleEntry;
                    System.out.println();
                }
            } else if (choice == 4) {
                System.out.println();
                double totSales = 0;
                for (int i = 0; i < allGames.size(); i++) {
                    totSales += allGames.get(i).sales;
                }
                System.out.println("The total sales of all the product is $" + totSales + ".");
            } else if (choice == 5) {
                System.out.println();
                int index = 0;
                for (int i = 0; i < allGames.size(); i++) {
                    if (allGames.get(i).sales > allGames.get(index).sales) {
                        index = i;
                    }
                }
                System.out.println("The highest seller is " + allGames.get(index).gameName + ".");
            } else if (choice == 6) {
                System.out.println();
                System.out.println("You have exited the program.");
                break;
            }
            System.out.println();
            System.out.println();
        }//end while loop

    }//end main

}//end class
