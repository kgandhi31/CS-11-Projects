
public class Ex3_BasicAlgorithms {

    public static void main(String[] args) {

        int[] allCards = new int[13];
        for (int i = 0; i < allCards.length; i++) {
            allCards[i] = (int) (Math.random() * 13 + 2);
        }

        printArray(allCards, true);

        
        //Algorithm 1; Sum - total the array
        int sumCards = 0;
        for (int i = 0; i < allCards.length; i++) {
            sumCards += allCards[i];
        }
        System.out.println("The total of all cards is: " + sumCards);

        
        //Algorithm 2; Countif - Count all of the 5s
        int countFives = 0;
        for (int i = 0; i < allCards.length; i++) {
            if (allCards[i] == 5) {
                countFives++;
            }
        }
        System.out.println("The total number of fives are: " + countFives);

        
        //Algorithm 2; Sumif - If a card is 10 or higher, it is worth 10 points,
        //if it is less than 10, it is worth its face value
        int sumIf = 0;
        for (int i = 0; i < allCards.length; i++) {
            if (allCards[i] >= 10) {
                sumIf += 10;
            } else {
                sumIf += allCards[i];
            }
        } 
        System.out.println("The sumIf is: " + sumIf);

        
        //Algorithm 2; Number of pairs *****Not working correctly
        int numPair = 0;
        for (int i = 0; i < allCards.length; i++){
            int card1 = allCards[i];
            for (int j= 0; j < allCards.length; j++){
            int card2 = allCards[j];
            if (card1 == card2){
                numPair ++;
            }
            }   
        }
        System.out.println("The number of pairs are: " + numPair);

            
            
        }//end main

    public static void printArray(int[] arr, boolean across) {
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

}//end class
