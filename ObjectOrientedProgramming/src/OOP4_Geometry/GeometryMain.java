package OOP4_Geometry;

import java.util.ArrayList;

public class GeometryMain {

    static ArrayList allShapes = new ArrayList();

    public static void main(String[] args) {

        allShapes.add(new Circle("Man Hole", 0.5));
        allShapes.add(new Circle("Tower of Pisa", 20, 80));
        allShapes.add(new Rectangle("Paper", 0.216, 0.28));
        allShapes.add(new Rectangle("Printer", 0.36, 0.32, 0.24));

        System.out.println("Geometry");
        System.out.println();

        for (int i = 0; i < allShapes.size(); i++) {
            if (allShapes.get(i) instanceof Circle) {
                Circle temp = ((Circle) allShapes.get(i));
                System.out.println((temp.getName()) + "'s has the following properties:");
                temp.printArea();
                temp.printCircumference();
                temp.printVolume();
                temp.drill();
                System.out.println();
            } else if (allShapes.get(i) instanceof Rectangle) {
                Rectangle temp = (Rectangle) allShapes.get(i);
                System.out.println((temp.getName()) + "'s has the following properties:");
                temp.printArea();
                temp.printPerimeter();
                temp.printVolume();
                temp.drill();
                System.out.println();
            }
        }//end for loop

    }//end main  
}//end class
