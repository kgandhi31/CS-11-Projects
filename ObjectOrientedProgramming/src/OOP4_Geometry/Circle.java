package OOP4_Geometry;

import java.util.Scanner;

public class Circle {

    static Scanner numscan = new Scanner(System.in);

//instance variables    
    private String name;
    private double radius;
    private double height;

//contructor methods
    //cylinder
    public Circle(String n, double r, double h) {
        name = n;
        radius = r;
        height = h;
    }

    //flat circle
    public Circle(String n, double r) {
        name = n;
        radius = r;
        height = 0;
    }

//instance methods   
    public String getName() {
        return name;
    }//end getName

    public void printArea() {
        if (height == 0) {
            double surfaceArea = (Math.PI * radius * radius);
            System.out.println(name + "'s surface area is equal to " + surfaceArea + "metres squared.");
        } else if (height > 0) {
            double surfaceArea = ((2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius));
            System.out.println(name + "'s surface area is equal to " + surfaceArea + "metres squared.");
        }
    }//end printArea

    public void printCircumference() {
        double circ = (2 * Math.PI * radius);
        System.out.println(name + "'s circumference is equal to " + circ + "metres.");
    }//end printCircumference

    public void printVolume() {
        if (height == 0) {
            System.out.println(name + " is not a cylinder. Volume cannot be computed.");
        } else if (height > 0) {
            double vol = (Math.PI * radius * radius * height);
            System.out.println("The " + name + " is a cylinder. It has a volume of " + vol + " cubic metres.");
        }
    }//end printVolume

    public void drill() {
        if (height == 0) {
            System.out.println("This is not a drillable shape.");
        } else if (height > 0) {
            double bitSize = 0;
            System.out.println("This is a drillable shape. What is the drill bit's radius in metres?");
            bitSize = numscan.nextDouble();
            double drillVolume = (Math.PI * bitSize * bitSize * height);
            System.out.println("Your drill will remove the following volume: " + drillVolume + " cubic metres.");
            double drillOutVol = ((Math.PI * radius * radius * height) - (drillVolume));
            System.out.println("Your drilled out volume is now " + drillOutVol + " cubic metres.");
        }
    }//end ovid drill
}
