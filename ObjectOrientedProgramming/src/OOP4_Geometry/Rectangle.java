package OOP4_Geometry;

import java.util.Scanner;

public class Rectangle {

    static Scanner numscan = new Scanner(System.in);

//instance variables    
    private String name;
    private double width;
    private double length;
    private double height;

//constructor methods
    //flat rectangle
    public Rectangle(String n, double w, double l) {
        name = n;
        width = w;
        length = l;
        height = 0;
    }

    //rectangular prism
    public Rectangle(String n, double w, double l, double h) {
        name = n;
        width = w;
        length = l;
        height = h;
    }

//instance methods
    public String getName() {
        return name;
    }//end getName

    public void printArea() {
        if (height == 0) {
            double surfaceArea = (width * length);
            System.out.println(name + "'s surface area is equal to " + surfaceArea + "metres squared.");
        } else if (height >= 1) {
            double surfaceArea = ((2 * width * length) + (2 * width * height) + (2 * length * height));
            System.out.println(name + "'s surface area is equal to " + surfaceArea + "metres squared.");
        }
    }//end printArea

    public void printPerimeter() {
        double perimeter = (width * length);
        System.out.println(name + "'s perimeter is equal to " + perimeter + "metres.");
    }//end printPerimeter

    public void printVolume() {
        if (height == 0) {
            System.out.println(name + " is not a rectangular prism. Volume cannot be computed.");
        } else if (height > 0) {
            double vol = (width * length * height);
            System.out.println("The " + name + " is a rectangular prism. It has a volume of " + vol + " cubic metres.");
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
            double drillOutVol = ((width * length * height) - (drillVolume));
            System.out.println("Your drilled out volume is now " + drillOutVol + " cubic metres.");
        }
    }//end ovid drill
}
