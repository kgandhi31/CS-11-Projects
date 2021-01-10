
public class Ex6_2DGolfCard {

    public static void main(String[] args) {

        String[] players = {"Rowan","Nima","Tay","Kurt"};
        int[][] scoreCard = new int[4][18];
        
        //[rows][columns]
        //[player][hole score}
        //[  i  ][  j  ]
        
        scoreCard[0][0] = 3;
        scoreCard[1][0] = 7;
        scoreCard[2][0] = 2;
        scoreCard[3][0] = 1;
        
        scoreCard[0][1] = 6;
        scoreCard[1][1] = 5;
        scoreCard[2][1] = 6;
        scoreCard[3][1] = 3;
       
        System.out.println(scoreCard[0].length);
              
        for (int i = 0; i < scoreCard.length; i++){
            int total = 0;
            for (int j = 0; j < scoreCard[i].length; j++){
                System.out.print(scoreCard[i][j] + "   ");
                total += scoreCard[i][j];
            }
            System.out.println(players[i] + "   Total Score:  " + total);
        }
        
    }//end main
    
}//end class
