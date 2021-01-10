
public class Ex3_UtilitiesTester {
    
    public static void main(String[] args){
        
        String name;
        name = Util.getString("What is yo handle homie?");
        System.out.println("Welcome to the hood " + name);
       
        double numToRound;
        numToRound = Util.getDouble("What number dawg?");
        System.out.println("");
        
        System.out.println("Your number is " + Util.printRounded(numToRound, 2));
        
    }//end main
   
    
}//end class
