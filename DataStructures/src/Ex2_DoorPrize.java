
import java.util.Scanner;

public class Ex2_DoorPrize {

    public static void main(String[] args) {
        Scanner wordscan = new Scanner(System.in);

        String[] allNames = new String[10];
        int[] allIDs = new int[10];
        int temp = 1000;
        for (int i = 0; i < allIDs.length; i++) {
            allIDs[i] = ++temp; //// this adds 1 to temp before running the variable 
        }

        for (int i = 0; i < allIDs.length; i++) {
            System.out.println("Enter the next name.");
            String name = wordscan.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            allNames[i] = name;
        }

        int winner = (int) (Math.random() * allNames.length);
        while (allNames[winner] == null) {
            winner = (int) (Math.random() * allNames.length);
        }
        System.out.println("Our winner is " + allNames[winner]);

        for (int i = 0; i < allIDs.length; i++) {
            System.out.println(allIDs[i] + ".   " + allNames[i]);
        }

        printArray(allNames, true);

    }//end main

    public static void printArray(String[] arr, boolean across) {
        if (across) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ",  ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
        
}//end printArray

public static void printArray(String[] arr){
        for (int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
        }
    }//end printArray
    
    
}//end class
