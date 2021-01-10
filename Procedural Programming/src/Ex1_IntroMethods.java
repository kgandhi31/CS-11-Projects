/* Synonyms: method, function, procedure, sub-routines, 
    
   Parameter - a variable that you send INTO the method
   Return value - data that you send BACK from the method
   Scoper of a variable -  

 */

import java.util.Scanner;

public class Ex1_IntroMethods {

    public static Scanner numscan = new Scanner(System.in);
    public static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {

        double diameter = 10.5;
        printArea(diameter);
        printCircumference(diameter);
        printArea(20, 5);
        printVolume(diameter, "cm");
        //ask the user for a height

    }//end main

    //declare your methods here
    public static void printArea(double h, double w) {
        System.out.println("The area of the rectangle is: " + (h * w));

    }//printArea

    public static void printArea(double d) {
        //print surfacen area of a circle 
        double r = d / 2;
        System.out.println("The area of the circle is " + (Math.PI * r * r));

    }//end printArea

    public static void printCircumference(double d) {
        System.out.println("The circumference of the circle is " + (Math.PI * d));

    }//end printCircumference

    public static void printVolume(double d, String units) {

        System.out.println("What is the hieght of the cylinder?");
        double r = d / 2;
        double h = 0;
        h = numscan.nextDouble();
        System.out.println("Your cylinder is " + (Math.PI * r * r * h) + units + "cubed in volume.");

    }

}//end class

