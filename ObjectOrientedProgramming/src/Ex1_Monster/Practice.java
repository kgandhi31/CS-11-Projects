
package Ex1_Monster;


public class Practice {
 
    private String address;
    private String owner;
    private int value;
    private boolean isCatholic;
    private double oweing;
    
    public void properties(String a, String o, int v, boolean c){
        address = a;
        owner = o;
        value = v;
        isCatholic = c;
        oweing = 0; ////owing has a default value of 0 so do NOT pass in parameter 
    }//end properties
   
    
    private String entryName;
    private String school;
    private boolean isGroup;
    private String category;
    private int[] score = new int[6];
    
    public void entry(String n, String s, boolean g, String c){
        entryName = n;
        school = s;
        isGroup = g;
        category = c;
    }//end entry  
      
    private String planet;
    private String power;
    private int babies;
    private boolean hostile;
    
    public void Aliens(String p, String pow){
        
        planet = p;
        power = pow;
        babies = 0;
        if (pow.equals("none")){
            hostile = false;
        } else {
            hostile = true;
        }
        
        
        
    }
    
    
    
    
    
    
    
}
