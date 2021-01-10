
public class Ex5_Searching {
    
    
    public static void main (String [] args){
        
//        String yourName = "";
//        yourName = Util.loadFile("testfile1.txt");
//        
//        String[] names = {"Don", "Stevie","Chris", "Casey" };
//        String[] hobbies = {"playing soccer", "watching youtube","talking with friends", "biking" };
//        String lookFor = "soccer";
//
//        int foundIndex = -1;
//        
//        
//        for (int i=0; i<hobbies.length; i++){
//            
//            if (hobbies[i].contains(lookFor)){
//                System.out.println("Found a match for " + yourName);
//                foundIndex = i;
//                break;
//            }
//        }//end forloop
//        if (foundIndex == -1){
//            System.out.println("No match found.");
//        }
        
        
        System.out.println(countQuarters(64));//2
        System.out.println(countQuarters(1278));//3
        System.out.println(countQuarters(1005));//3
        System.out.println(countQuarters(2025));//3
        
        
    }//end main

    public static int countQuarters(int cents){
        int quarters = cents%100;
        return quarters/25;
        
    }//end countQuarters
    
    
}//end class
