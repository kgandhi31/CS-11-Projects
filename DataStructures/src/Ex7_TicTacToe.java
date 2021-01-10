
import java.util.Scanner;

public class Ex7_TicTacToe {

    Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {

        String[][] tictactoe = new String[3][3];

        setupBoard(tictactoe);
        
        tictactoe[0][0] = "X";
        
        
        printBoard(tictactoe);
        
        
    }//end main
    
    public static void checkWinner(String[][] tictactoe) {
        ///use a for loop to check if a row is a winner
        for (int i = 0; i < tictactoe.length; i++){
            if (tictactoe[i][0].equals(tictactoe[i][1]) && (tictactoe[i][0].equals(tictactoe[i][2]))){
               System.out.println("We have a winner with " + tictactoe[i][0]);  
            }
        }
        ///use a for loop to check columns
    }
    
    
    public static void printBoard(String[][] tictactoe) {
        for (int i = 0; i < tictactoe.length; i++) {              /////number of rows
            for (int j = 0; j < tictactoe[i].length; j++) {        /////row length
                System.out.print(tictactoe[i][j] + " | ");
            }
            System.out.println();
        }
    }//end printBoard
    
    public static void setupBoard(String[][] tictactoe) {
        for (int i = 0; i < tictactoe.length; i++) {              /////number of rows
            for (int j = 0; j < tictactoe[i].length; j++) {        /////row length
                tictactoe[i][j] = " ";
            }
        }
    }//end printBoard

}//end class
