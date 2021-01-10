
package Ex4_LawnMowing;

import java.util.Scanner;
import java.util.ArrayList;
public class LawnMain {
    

    static ArrayList<Client> allClients = new ArrayList();
    static Scanner numscan = new Scanner(System.in);
    static Scanner wordscan = new Scanner(System.in);
    public static int idCounter = 1000;
    
    public static void main(String[] args) {
        
        allClients.add(   new Client("Mr. Couprie", "555 Maple Lane", 50, false ) );
        allClients.add(   new Client("Mr. Pendlebury", "8900 86 Ave", 75, true ) );
        allClients.add(   new Client("Mr. Goldthorpe", "7959 47 Ave", 90, true ) );
        allClients.add(   new Client("Mr. Van Ginhoven", "22 173 Ave", 30, false ) );
        allClients.add(   new Client("Mrs. Lee", "1234 56 Ave", 100, false ) );
        
        while (true){
            System.out.println("1. Mow Lawn");
            System.out.println("2. Process Payment");
            System.out.println("3. exit");
            int choice = numscan.nextInt();
            if (choice == 3) break;
            else if (choice == 1) mow();
            else if (choice == 2) pay();
        
         
        }
        
    }//end main
    
    public static void mow(){
        allClients.get( searchByName() ).mowLawn();    
    }
    
    public static void pay(){
        int index = searchByName();
        System.out.println("How much is being payed?");
        double amount = numscan.nextDouble();
        allClients.get(index).processPayment(amount);
    }
    
    public static int searchByName(){
        System.out.println("Which client?");
        String name = wordscan.nextLine();
    
        for (int i = 0; i < allClients.size(); i++){
            if (name.equalsIgnoreCase((  allClients.get(i).getName())))
            return i;
    }
        return -1;      
    }//end searchByName
    
    
    
}//end lawnMain
