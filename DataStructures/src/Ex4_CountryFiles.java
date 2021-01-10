
public class Ex4_CountryFiles {

    public static void main(String[] args) {
   
    String[] countries;
    int[] populations;
    countries = Files.loadStringArr("countries.txt");
    populations = Files.loadIntArr("populations.txt");
        
    for (int i = 0; i < countries.length; i++){
        System.out.println(i + ". " + countries[i] + ":   " + populations[i]);
    }
    
    //a) find and print the lowest population
    //b) print the country name
    
    int lowestPop = populations[0];
    int lowestIndex = 0;
    for (int i = 0; i < countries.length; i++){
        if (populations[i] < lowestPop){
            lowestPop = populations[i];
            lowestIndex = i;
        }   
    }
    System.out.print("The country with the smallest populations is: " + countries[lowestIndex] + " with a population of " + lowestPop);
    
    
    
    
    
    }//end main
    
}//end class
