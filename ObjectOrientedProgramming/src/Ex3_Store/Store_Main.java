package Ex3_Store;

import java.util.ArrayList;

public class Store_Main {

    public static void main(String[] args) {

        ArrayList allProducts = new ArrayList();
        allProducts.add(new Product("Milk", "Dairyland", 4.60, 20));
        allProducts.add(new Product("Margerine", "Dairyland", 2.50, 8));
        allProducts.add(new Product("Oranges", "Peru", 3.60, 10));
        allProducts.add(new Product("Chocolate Bar", "Caramilk", 1.20));
        allProducts.add(new Product("Cheese", "Kraft", 8.60));
        allProducts.add(new Product("Cereal", "Froot Loops", 2.99, 7));
        allProducts.add("testing a string");
        allProducts.add(new Boolean(false));

        for (int i = 0; i < allProducts.size(); i++) {
            if (allProducts.get(i) instanceof Product) {
                Product temp = ((Product) allProducts.get(i));
                temp.receiveProduct(25);
            }
        }

        //temp.receiveProduct(10);
        printInStock(allProducts);

    }//end main

    public static void printInStock(ArrayList<Product> allProducts) {
        for (int i = 0; i < allProducts.size(); i++) {
            if (allProducts.get(i).stock > 0) {
                allProducts.get(i).printProduct();

            }

        }

    }

}//end class
