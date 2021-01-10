
import java.util.Scanner;

public class Methods_8Triangles {

    public static Scanner numscan = new Scanner(System.in);
    public static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            double angle1;
            double angle2;
            double angle3;

            System.out.println("Welcome to Triangles!");
            System.out.println("Enter the first angle of the triangle.");
            angle1 = numscan.nextDouble();
            System.out.println("Enter the second angle of the triangle.");
            angle2 = numscan.nextDouble();
            System.out.println("Enter the third angle of the triangle.");
            angle3 = numscan.nextDouble();

            if (isTriangle(angle1, angle2, angle3) == true) {
                System.out.println("This is a triangle.");
                triangleType(angle1, angle2, angle3);
                isRightTriangle(angle1, angle2, angle3);
                break;
            } else if (isTriangle(angle1, angle2, angle3) == false) {
                System.out.println("This is not a traingle.");
                System.out.println();
            }
        }//end loop
    }//end main

    public static boolean isTriangle(double a1, double a2, double a3) {
        double sum = a1 + a2 + a3;
        if (sum == 180.0) {
            return true;
        } else {
            return false;
        }
    }//end isTriangle

    public static void triangleType(double a1, double a2, double a3) {
        if (a1 == a2 && a1 == a3) {
            System.out.println("This is an equilateral triangle.");
        } else if (a1 == a2 || a1 == a3 || a2 == a3) {
            System.out.println("This is an isosceles triangle.");
        } else {
            System.out.println("This is a scalene triangle.");
        }
    }//end triangleType  

    public static void isRightTriangle(double a1, double a2, double a3) {
        if (a1 == 90.0 || a2 == 90.0 || a3 == 90.0) {
            System.out.println("This is also a right triangle.");
        }
    }//end isRightTriangle

}//end class
