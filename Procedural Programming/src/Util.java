
import javax.swing.JOptionPane;
import java.io.*;

public class Util {

    public static String loadFile(String filename){
        
        String variable = "";
        try {
            BufferedReader file = new BufferedReader (new FileReader (filename) );
            
            while (file.ready()){
                variable = file.readLine();            
            }
     
        } catch (IOException e ) {
            System.out.println(e);
        }
        return variable;
    
    }//end loadFile
    

    
    
    
    public static String getString(String prompt){
        
        return JOptionPane.showInputDialog(prompt);
        
    }//end getString


    public static int getInt(String prompt){
        
        String temp = JOptionPane.showInputDialog(prompt);
        return Integer.parseInt(temp);
        
    }//end getInt

    public static double getDouble(String prompt){
        
        String temp = JOptionPane.showInputDialog(prompt);
        return Double.parseDouble(temp);
        
    }//end getInt
    
    public static String printRounded(double num, int places){
        
        for (int i=1; i<= places; i++){
            num*=10;
        }
        
        int temp = (int)num;
        double temp2 = temp;
                
        for (int i=1; i<= places; i++){
            temp2/=10;
        }
        
        String finalNum = "" + temp2;
        int decimal = finalNum.indexOf(".");
        return finalNum.substring(0, decimal+places+1);
        
    }//end printRounded


}
