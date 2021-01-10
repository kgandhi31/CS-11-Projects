//Set Up: 40/40
//Basic Algorithms: 30/30
//Add Car:  15/15
//Mileage: 15/15
package OOPNoHelp;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class CoupriesFleetMain {

    static Scanner numscan = new Scanner(System.in);
    static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Car> allCars = new ArrayList();
        allCars.add(new Car("Gandhi", "Krish", 18000, "SUV"));
        allCars.add(new Car("Toyato", "Corolla", 16000, "Car"));
        allCars.add(new Car("Ford", "Focus", 20000, "Car"));
        allCars.add(new Car("Ram", "F150", 26000, "Truck"));
        allCars.add(new Car("Volkswagon", "T2018", 29000, "SUV"));
        allCars.add(new Car("Lamborghini", "Aventador", 300000, "Sports car"));
        allCars.add(new Car("Ferrai", "F8", 350000, "Sports car"));

        while (true) {
            System.out.println();
            System.out.println("Select the number corresponding to the option you want to explore:");
            System.out.println(" 1.Print all \n 2.Search by Style \n 3.Find Most Expensive \n 4.Add a new car \n 5.Fill Up Car \n 6.Exit");
            int menuChoice;
            menuChoice = numscan.nextInt();
            System.out.println();
            if (menuChoice == 1) {
                for (int i = 0; i < allCars.size(); i++) {
                    System.out.println((i + 1) + ". Make: " + allCars.get(i).make + "\t Model: " + allCars.get(i).model
                            + "\t Price: $" + allCars.get(i).price + "\t Style: " + allCars.get(i).style);
                }
            } else if (menuChoice == 2) {
                System.out.println("Alright, enter the style of car that you are looking for:");
                String selection = "";
                int notFound = allCars.size();
                selection = wordscan.nextLine();
                for (int i = 0; i < allCars.size(); i++) {
                    if (allCars.get(i).style.equalsIgnoreCase(selection)) {
                        System.out.println("->  Make: " + allCars.get(i).make + "\t Model: " + allCars.get(i).model);
                        notFound++;
                    }
                }
                if (allCars.size() == notFound) {
                    System.out.println("Sorry, the style of car that you have entered is not found in the database.");
                }
            } else if (menuChoice == 3) {
                int index = 0;
                for (int i = 0; i < allCars.size(); i++) {
                    if (allCars.get(i).price > allCars.get(index).price) {
                        index = i;
                    }
                }
                System.out.println("->  Make: " + allCars.get(index).make + "\t Model: " + allCars.get(index).model);
            } else if (menuChoice == 4) {
                System.out.println("Ok, enter the make of this new car:");
                String newMake = wordscan.nextLine();
                System.out.println("Enter the model of this new car:");
                String newModel = wordscan.nextLine();
                System.out.println("Enter the cost of this new car:");
                int newCost = numscan.nextInt();
                System.out.println("Enter the style of this new car:");
                String newStyle = wordscan.nextLine();
                allCars.add(new Car(newMake, newModel, newCost, newStyle));
            } else if (menuChoice == 5) {
                System.out.println("Enter the ID number of the car based on the Print All option:");
                int index = (numscan.nextInt() - 1);
                //System.out.println("Testing, Car Chosen: " + allCars.get(index).make);
                System.out.println("Please enter the number of litres that was filled:");
                double fuel = numscan.nextDouble();
                System.out.println("Please enter the new odometer reading:");
                int newOdometer = numscan.nextInt();
                allCars.get(index).fillCar(fuel, newOdometer);
                //System.out.println("Testing, New Reading: " + allCars.get(index).lastOdometerReading);
            } else if (menuChoice == 6) {
                System.out.println("You have successfully exited the program.");
                break;
            }
        }//end looping menu
    }//end main
}//end class
