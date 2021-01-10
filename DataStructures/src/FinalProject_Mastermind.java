
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class FinalProject_Mastermind {

    public static Scanner numscan = new Scanner(System.in);
    public static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {
        //print instructions
        System.out.println("Welcome to Mastermind! In this version of the game, the A.I. thinks of a number consisting of three digits. Your task "
                + "\nis to guess the three digits within 10 atempts. You will receive code words with every guess to assist you: ");
        System.out.println();
        System.out.println("	Green: A guess is exactly correct, meaning it is the right number in the right position.\n"
                + "       	However, it does NOT indicate which of the three numbers are correct.");
        System.out.println("	Yellow: A number is guessed correctly but it is in the wrong position.");
        System.out.println("	Red: None of the numbers appear in the solution.");
        System.out.println();

        //playAgain while loop
        while (true) {
            System.out.println("Alright, guess the three digit number the A.I. is thinking of.");
            System.out.println();
            int[] digits = new int[3];
            int[] numGenerated = numGenerator(digits);
            //System.out.println(Arrays.toString(numGenerated)); //only used to display the numGenerated - not used for actual game
            int attempts = 0;
            String playAgain = "";
            System.out.println("Guess   	Evaluation            	Attempts");

            //guessing the number loop
            while (true) {
                //break if guess exceeds 10 attempts and display the numGenerated
                if (attempts == 10) {
                    System.out.println("Your ten attempts are over. The three digit number was " + Arrays.toString(numGenerated) + ".");
                    System.out.println();
                    break;
                }
                String guess = wordscan.nextLine();
                int[] guessArray = guessStrToArr(guess);
                boolean exactMatch = isAllGreen(numGenerated, guessArray);
                //printing evaluation and attempts
                if (exactMatch == true) {
                    attempts++;
                    System.out.println("        	green, green, green      	" + attempts);
                    System.out.println();
                    System.out.println("Well done! You got it!");
                    System.out.println();
                    break;
                } else if (exactMatch == false) {
                    attempts++;
                    System.out.println("        	" + evaluateGuess(numGenerated, guessArray) + "   	" + attempts);
                }
            }//end while loop
            System.out.println("Play Again? Answer yes or no.");
            playAgain = wordscan.nextLine();
            if (playAgain.equalsIgnoreCase("yes")) {
                System.out.println();
            } else if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for playing Mastermind.");
                break;
            }
        }//
    }//end main

    public static int[] numGenerator(int[] digitsArr) {
        Random ran = new Random();
        for (int i = 0; i < digitsArr.length; i++) {
            digitsArr[i] = ran.nextInt(10);
        }
        return digitsArr;
    }//end numGenerator

    public static int[] guessStrToArr(String guess) {
        String[] integerStrings = guess.split("");
        int[] integers = new int[integerStrings.length];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = Integer.parseInt(integerStrings[i]);
        }
        return integers;
    }//end stringToIntArr

    public static boolean isAllGreen(int[] target, int[] guess) {
        int counter = 0;
        for (int i = 0; i < target.length; i++) {
            if (target[i] == guess[i]) {
                counter++;
            }
        }
        return counter == 3;
    }//end isAllGreen

    public static String evaluateGuess(int[] target, int[] guess) {
        int numGreen = 0;
        int numYellow = 0;
        //check green
        for (int i = 0; i < target.length; i++) {
            if (target[i] == guess[i]) {
                numGreen++;
            }
        }
        //check yellow
        boolean repeatNum0 = false;
        boolean repeatNum1 = false;
        boolean repeatNum2 = false;
        if (guess[0] == target[1] && guess[1] != target[1]) {
            numYellow++;
            repeatNum0 = true;
        } else if (guess[2] == target[1] && guess[1] != target[1]) {
            numYellow++;
            repeatNum2 = true;
        }
        if (guess[0] == target[2] && guess[2] != target[2] && repeatNum0 == false) {
            numYellow++;
        } else if (guess[1] == target[2] && guess[2] != target[2]) {
            numYellow++;
            repeatNum1 = true;
        }
        if (guess[1] == target[0] && guess[0] != target[0] && repeatNum1 == false) {
            numYellow++;
        } else if (guess[2] == target[0] && guess[0] != target[0] && repeatNum2 == false) {
            numYellow++;
        }
        //return colour
        if ((numGreen == 2) && (numYellow == 0)) {
            return "green, green      	";
        } else if ((numGreen == 1) && (numYellow == 0)) {
            return "green             	";
        } else if ((numGreen == 1) && (numYellow == 2)) {
            return "green, yellow, yellow ";
        } else if ((numGreen == 1) && (numYellow == 1)) {
            return "green, yellow     	";
        } else if ((numGreen == 0) && (numYellow == 3)) {
            return "yellow, yellow, yellow";
        } else if ((numGreen == 0) && (numYellow == 2)) {
            return "yellow, yellow    	";
        } else if ((numGreen == 0) && (numYellow == 1)) {
            return "yellow            	";
        } else {
            return "red               	";
        }
    }//end evaluateGuess
}//end class

