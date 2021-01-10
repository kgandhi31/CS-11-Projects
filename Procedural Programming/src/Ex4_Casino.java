public class Ex4_Casino{

    public static void main(String[] args) {

        System.out.println("Welcome to Couprie's Casino");
        String p1suit;
        int p1number;
        p1suit = getSuit();
        p1number = getNumber();
        
        String p2suit;
        int p2number;
        p2suit = getSuit();
        p2number = getNumber();
        
        String c1suit;
        int c1number;
        c1suit = getSuit();
        c1number = getNumber();
        
        String c2suit;
        int c2number;
        c2suit = getSuit();
        c2number = getNumber();
        
        System.out.println("You were dealt a " + p1number+ " of " +p1suit);
        System.out.println("Your second card was a " + p2number+ " of " +p2suit);
        System.out.println("The Casino was dealt a " + c1number+ " of " +c1suit);
        System.out.println("The Casiono's second card was a " + c2number+ " of " +c2suit);
        System.out.println();
        //check the player's hand
        if (   isFlush(p1suit, p2suit)   ){
            System.out.println("You have a flush.");
        }  else if (   isPair(p1number, p2number)   ){
            System.out.println("You have a pair.");
        } else {
             System.out.println("You have nothing.");
            
        }
        
        //check the casino's hand
         if (   isFlush(c1suit, c2suit)   ){
            System.out.println("The Casion has a flush.");
        }  else if (   isPair(c1number, c2number)   ){
            System.out.println("The Casino has a pair.");
        } else {
             System.out.println("The Casino has nothing.");
            
        }
        
        
    }//end main

    public static boolean isPair( int c1, int c2    ){
        if(c1==c2){
            return true;
        } else{
            return false;
        }
     
    }//end isPair
    
    public static boolean isFlush( String c1, String c2    ){
        if(  c1.equals(c2)      ){
            return true;
        } else{
            return false;
        }
     
    }//end isFlush
    
    public static int getNumber(){
        int temp = (int) (Math.random() * 12) + 2;
        return temp;
    }//end getNumber
    
    
    
    public static String getSuit() {
        int temp = (int) (Math.random() * 4);
        if (temp == 1) {
            return "clubs";
        } else if (temp == 2) {
            return "hearts";
        } else if (temp == 3) {
            return "spades";
        } else {
            return "diamonds";
        }
    }//end getSuit

}//end class
