
package Ex4_LawnMowing;


public class Client {
    private String name;
    private String address;
    private int lawnSize;    //in square meters
    private boolean hasDog;
    private double outstandingFees;
    private int IDNumber;
    
    public Client (String n, String a, int s, boolean dog){
        name = n;
        address = a;
        lawnSize = s;
        hasDog = dog;
        outstandingFees = 0;
        IDNumber = LawnMain.idCounter++;
    }
    public void mowLawn(){
        double charge = lawnSize * 0.25;
        if( hasDog ){
            charge += 10;
        }
        outstandingFees+= charge;
        printBill(charge);
    }//mow lawn
    public void printBill(double c){
        System.out.println(name + " your charge for today is $" + c);
        System.out.println("Your total fees owing are $" + outstandingFees);
        
    }
    public String getName(){
        return name;        
    }
    public void processPayment(double amount){
        outstandingFees -= amount;
        System.out.println("The amount still owing is $" + outstandingFees);
    }
    public void overdue(){
        outstandingFees *= 1.10;
        System.out.println(name + " your amount still owing is $" + outstandingFees);
        if (outstandingFees > 60 && hasDog){
            hasDog = false;
        }
    }//overdue
    
}
