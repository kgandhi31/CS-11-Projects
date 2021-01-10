
import java.util.Scanner;

public class Methods_3HomeReno {

    public static Scanner numscan = new Scanner(System.in);
    public static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {

        double width;
        double length;
        double height;
        int door;
        int choice;
        String newRoom = "yes";

        while (newRoom.equalsIgnoreCase("yes")) {

            System.out.println("What is the width of the room (in feet)?");
            width = numscan.nextDouble();
            System.out.println("What is the length of the room (in feet)?");
            length = numscan.nextDouble();
            System.out.println("What is the height of the room (in feet)?");
            height = numscan.nextDouble();
            System.out.println("How many doors are in your room?");
            door = numscan.nextInt();

            System.out.println("Choose from the following: \n 1.Flooring \n 2.Paint \n 3.Indoor Hot Tub \n 4.Home Theater");
            choice = numscan.nextInt();

            if (choice == 1) {
                flooring(width, length);

            } else if (choice == 2) {
                paint(width, length, height, door);

            } else if (choice == 3) {
                hotTube(width, length);

            } else if (choice == 4) {
                homeTheater(width, length, height);
            }

            System.out.println("Do you have another room?");
            newRoom = wordscan.nextLine();
            if (newRoom.equalsIgnoreCase("no")) {
                break;
            }

        }
    }//end main

    public static void flooring(double w, double l) {
        System.out.println("The total square feet of carpet is " + w * l + " ft squared." + ". \nThe total cost is $" + ((w * l) * 2) + ".");
    }//end flooring

    public static void paint(double w, double l, double h, int d) {
        double gallons;
        gallons = (((2 * l * h) + (2 * w * h) + (w * l) - (20 * d)) / 350);
        System.out.println("The number of gallons of paint required to paint your room is " + gallons + " ." + ". \nThe total cost is $" + (gallons * 4) + ".");
    }//end paint

    public static void hotTube(double w, double l) {
        double volume;

        if ((w < l) || (w == l)) {
            volume = (Math.PI * ((w - 2) / 2) * ((w - 2) / 2) * 3);
            System.out.println("The volume of water needed to fill the largest circular 3 foot deep hot tub is " + volume + " feet cubed.");

        } else if (w > l) {
            volume = (Math.PI * ((l - 2) / 2) * ((l - 2) / 2) * 3);
            System.out.println("The volume of water needed to fill the largest circular 3 feet deep hot tub is " + volume + " feet cubed.");
        }

    }//end hotTube

    public static void homeTheater(double w, double l, double h) {
        if ((w < l && w != h)) {
            int screenMeasure;
            screenMeasure = (int) ((Math.floor(w) - 2) * ((Math.floor(h) - 2)));
            System.out.println("The size of the screen will be " + screenMeasure + " square feet. \nThe cost to set up the theater screen is $" + ((screenMeasure * 150) + 1000) + ".");

        } else if ((w > l && l != h)) {
            int screenMeasure;
            screenMeasure = (int) ((Math.floor(l) - 2) * ((Math.floor(h) - 2)));
            System.out.println("The size of the screen will be " + screenMeasure + " square feet. \nThe cost to set up the theater screen is $" + ((screenMeasure * 150) + 1000) + ".");

        } else if (w == h || l == h) {
            System.out.println("Sorry, your dimensions do not meet the requirements to set up a theater screen.");
        }
    }//end homeTheater

}//end class
