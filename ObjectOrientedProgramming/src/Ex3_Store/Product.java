
package Ex3_Store;


public class Product {
    //****** instance variables *******/
    public String category;
    public String brand;
    public double price;
    public int stock;
    public String date;

    //****** constructor methods ******/
    public Product(String c, String b, double p){
        category = c;
        brand = b;
        price = p;
        stock = 0;
        date = "June 4, 2018";  
        
    }
    
    public Product(String c, String b, double p, int s){
        category = c;
        brand = b;
        price = p;
        stock = s;
        date = "June 4, 2018";   
        
    }
    
    //****** instance methods *********/
    
    public void printProduct(){
        System.out.println("On Special This Week:");
        System.out.println(brand + " " + category + " $" + price);
        System.out.println("Buy now! Only " + stock + " left in stock!");
        System.out.println();
        
    }//end printProduct
    
    public void sellProduct(int numSold){
        stock -= numSold;
        
    }//end sellProduct
        
    public void receiveProduct(int numReceived){
        stock += numReceived;    
    
    }//end sellProduct
    
    
}
