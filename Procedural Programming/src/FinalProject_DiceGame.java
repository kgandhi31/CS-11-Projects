//It is not playing/totalling the roll again part properly
//90 % - otherwise works well

//I had misinterprted the reroll, so I have fixed it now.

import java.util.Scanner;
import java.util.Random;

public class FinalProject_DiceGame {

	public static Scanner numscan = new Scanner(System.in);
	public static Scanner wordscan = new Scanner(System.in);

	public static void main(String[] args) {

    	String player1;
    	String player2;

    	boolean play = true;
    	String playAgain;

    	System.out.println("Welcome to the Dice Game! \nIn this game, two players compete head to head in a dice rolling challenge. If a player rolls the dice and scores more than 0 points, \nthey will be "
            	+ "given the option of rolling again or quiting. By rolling again, the player gambles his points to score more points in \nthat round. However, if the player rolls a zero, his score for that round"
            	+ "will be zero and it will be the next player's turn.\nThe first player to reach 2000 total points wins the game!");
    	System.out.println();
    	System.out.println("Player 1, enter your name:");
    	player1 = wordscan.nextLine();
    	System.out.println();
    	System.out.println("Alright, player 2 enter your name:");
    	player2 = wordscan.nextLine();
    	System.out.println();

    	while (play != false) {

        	int player1Total = 0;
        	int player2Total = 0;

        	String toRoll;
        	int roundNum = 0;
        	int rounds = 0;

        	while (play != false) {

            	int singlePoints = 0;
            	int tripleSinglePoints = 0;
            	int triplePoints = 0;
            	int quadPoints = 0;
            	int inOrderPoints = 0;
            	roundNum++;
            	int roundScore = 0;
            	String rollAgain = "";

            	System.out.println("Round " + roundNum + ":");

            	//-----------------------------------------------------------------------------------------------------------------------player1 loop
            	while (play = true) {
                	int currentScore = 0;

                	System.out.println(player1 + " it is your turn. Hit enter to roll.");
                	toRoll = wordscan.nextLine();

                	int p1die1Num = rollDie(1);
                	int p1die2Num = rollDie(2);
                	int p1die3Num = rollDie(3);
                	int p1die4Num = rollDie(4);

                	System.out.println(player1 + " rolled " + p1die1Num + ", " + p1die2Num + ", " + p1die3Num + ", " + p1die4Num);

                	int singlep1Die1 = checkSingle(p1die1Num);
                	int singlep1Die2 = checkSingle(p1die2Num);
                	int singlep1Die3 = checkSingle(p1die3Num);
                	int singlep1Die4 = checkSingle(p1die4Num);

                	singlePoints = (singlep1Die1 + singlep1Die2 + singlep1Die3 + singlep1Die4);

                	tripleSinglePoints = checkTripleSingle(p1die1Num, p1die2Num, p1die3Num, p1die4Num);

                	triplePoints = checkTriple(p1die1Num, p1die2Num, p1die3Num, p1die4Num);

                	quadPoints = checkQuad(p1die1Num, p1die2Num, p1die3Num, p1die4Num);

                	inOrderPoints = checkStraight(p1die1Num, p1die2Num, p1die3Num, p1die4Num);

                	if (inOrderPoints == 1000) {
                    	currentScore = inOrderPoints;
                    	System.out.println(player1 + " scored " + currentScore + " points.");
                	} else if (inOrderPoints == 0 && quadPoints > 0) {
                    	currentScore = quadPoints;
                    	System.out.println(player1 + " scored " + currentScore + " points.");
                	} else if (inOrderPoints == 0 && quadPoints == 0 && tripleSinglePoints > 0) {
                    	currentScore = tripleSinglePoints;
                    	System.out.println(player1 + " scored " + currentScore + " points.");
                	} else if (inOrderPoints == 0 && quadPoints == 0 && tripleSinglePoints == 0 && (triplePoints == 100 || triplePoints == 500)) {
                    	currentScore = triplePoints;
                    	System.out.println(player1 + " scored " + currentScore + " points.");
                	} else if (inOrderPoints == 0 && quadPoints == 0 && tripleSinglePoints == 0 && triplePoints > 0 && singlePoints >= 0) {
                    	currentScore = triplePoints + singlePoints;
                    	System.out.println(player1 + " scored " + currentScore + " points.");
                	} else if (inOrderPoints == 0 && quadPoints == 0 && tripleSinglePoints == 0 && triplePoints == 0 && singlePoints >= 0) {
                    	currentScore = singlePoints;
                    	System.out.println(player1 + " scored " + currentScore + " points.");
                	}

                	System.out.println();

                	if (currentScore == 0) {
                    	roundScore = 0;
                    	System.out.println(player1 + "'s total is now " + player1Total + ".");
                    	System.out.println();
                    	break;
                	} else if (currentScore > 0) {
                    	roundScore += currentScore;
                    	System.out.println(player1 + "'s total is now " + (roundScore + player1Total) + ".");
                    	if ((roundScore + player1Total) >= 2000) {
                        	player1Total += roundScore;
                        	play = false;
                        	break;
                    	} else {
                        	System.out.println(player1 + ", press r to roll again or q to quit.");
                        	rollAgain = wordscan.nextLine();
                        	if (rollAgain.equalsIgnoreCase("r")) {
                            	System.out.println();
                        	} else if (!rollAgain.equalsIgnoreCase("q") || rollAgain.equalsIgnoreCase("q")) {
                            	player1Total += roundScore;
                            	roundScore = 0;
                            	System.out.println();
                            	break;
                        	}
                    	}
                	}
            	}//end player1 loop
            	//-----------------------------------------------------------------------------------------------------------------------player2 loop
            	while (play != false) {
                	int currentScore = 0;

                	System.out.println(player2 + " it is your turn. Hit enter to roll.");
                	toRoll = wordscan.nextLine();

                	int p2die1Num = rollDie(1);
                	int p2die2Num = rollDie(2);
                	int p2die3Num = rollDie(3);
                	int p2die4Num = rollDie(4);

                	System.out.println(player2 + " rolled " + p2die1Num + ", " + p2die2Num + ", " + p2die3Num + ", " + p2die4Num);

                	int singlep2Die1 = checkSingle(p2die1Num);
                	int singlep2Die2 = checkSingle(p2die2Num);
                	int singlep2Die3 = checkSingle(p2die3Num);
                	int singlep2Die4 = checkSingle(p2die4Num);

                	singlePoints = singlep2Die1 + singlep2Die2 + singlep2Die3 + singlep2Die4;

                	tripleSinglePoints = checkTripleSingle(p2die1Num, p2die2Num, p2die3Num, p2die4Num);

                	triplePoints = checkTriple(p2die1Num, p2die2Num, p2die3Num, p2die4Num);

                	quadPoints = checkQuad(p2die1Num, p2die2Num, p2die3Num, p2die4Num);

                	inOrderPoints = checkStraight(p2die1Num, p2die2Num, p2die3Num, p2die4Num);

                	if (inOrderPoints == 1000) {
                    	currentScore = inOrderPoints;
                    	System.out.println(player2 + " scored " + currentScore + " points.");
                	} else if (inOrderPoints == 0 && quadPoints > 0) {
                    	currentScore = quadPoints;
                    	System.out.println(player2 + " scored " + currentScore + " points.");
                	} else if (inOrderPoints == 0 && quadPoints == 0 && tripleSinglePoints > 0) {
                    	currentScore = tripleSinglePoints;
                    	System.out.println(player2 + " scored " + currentScore + " points.");
                	} else if (inOrderPoints == 0 && quadPoints == 0 && tripleSinglePoints == 0 && (triplePoints == 100 || triplePoints == 500)) {
                    	currentScore = triplePoints;
                    	System.out.println(player2 + " scored " + currentScore + " points.");
                	} else if (inOrderPoints == 0 && quadPoints == 0 && tripleSinglePoints == 0 && triplePoints > 0 && singlePoints >= 0) {
                    	currentScore = triplePoints + singlePoints;
                    	System.out.println(player2 + " scored " + currentScore + " points.");
                	} else if (inOrderPoints == 0 && quadPoints == 0 && tripleSinglePoints == 0 && triplePoints == 0 && singlePoints >= 0) {
                    	currentScore = singlePoints;
                    	System.out.println(player2 + " scored " + currentScore + " points.");
                	}

                	System.out.println();

                	if (currentScore == 0) {
                    	roundScore = 0;
                    	System.out.println(player2 + "'s total is now " + player2Total + ".");
                    	System.out.println();
                    	break;
                	} else if (currentScore > 0) {
                    	roundScore += currentScore;
                    	System.out.println(player2 + "'s total is now " + (roundScore + player2Total) + ".");
                    	if ((roundScore + player2Total) >= 2000) {
                        	player2Total += roundScore;
                        	play = false;
                        	break;
                    	} else {
                        	System.out.println(player2 + ", press r to roll again or q to quit.");
                        	rollAgain = wordscan.nextLine();
                        	if (rollAgain.equalsIgnoreCase("r")) {
                            	System.out.println();
                        	} else if (!rollAgain.equalsIgnoreCase("q") || rollAgain.equalsIgnoreCase("q")) {
                            	player2Total += roundScore;
                            	roundScore = 0;
                            	System.out.println();
                            	break;
                        	}
                    	}
                    	rounds++;
                	}
            	}//end player2 loop
        	}//end while loop
        	//-----------------------------------------------------------------------------------------------------------------------winner
        	System.out.println();
        	if (player1Total > player2Total) {
            	System.out.println("Congratulation " + player1 + ", you win! \n" + player2 + " better luck next time.");
        	} else if (player1Total < player2Total) {
            	System.out.println("Congratulation " + player2 + ", you win! \n" + player1 + " better luck next time.");
        	}

        	//-----------------------------------------------------------------------------------------------------------------------playAgain
        	System.out.println("Play again? Press 'y' to play again or press 'n' to quit.");
        	playAgain = wordscan.nextLine();

        	if (playAgain.equalsIgnoreCase("y")) {
            	play = true;
            	System.out.println();
        	} else if (!playAgain.equalsIgnoreCase("y") || playAgain.equalsIgnoreCase("n")) {
            	System.out.println();
            	System.out.println("Thank you for playing.");
            	break;
        	}
    	}//end playAgain loop
	}//end main   

	public static int rollDie(int diceNum) {

    	Random ran = new Random();

    	for (int i = 0; i < 7; i++) {
        	diceNum = ran.nextInt(6) + 1;
    	}
    	return diceNum;
	}//end rollDie

	public static int checkSingle(int dieNum) {

    	switch (dieNum) {
        	case 1:
            	return 100;
        	case 5:
            	return 50;
        	default:
            	return 0;
    	}
	}//end checkSingle

	public static int checkTripleSingle(int num1, int num2, int num3, int num4) {

    	if (num1 == 5 && num2 == 5 && num3 == 5 && num4 == 1) {
        	return 600;
    	} else if (num1 == 5 && num2 == 5 && num3 == 1 && num4 == 5) {
        	return 600;
    	} else if (num1 == 5 && num2 == 1 && num3 == 5 && num4 == 5) {
        	return 600;
    	} else if (num1 == 1 && num2 == 5 && num3 == 5 && num4 == 5) {
        	return 600;

    	} else if (num1 == 1 && num2 == 1 && num3 == 1 && num4 == 5) {
        	return 150;
    	} else if (num1 == 1 && num2 == 1 && num3 == 5 && num4 == 1) {
        	return 150;
    	} else if (num1 == 1 && num2 == 5 && num3 == 1 && num4 == 1) {
        	return 150;
    	} else if (num1 == 5 && num2 == 1 && num3 == 1 && num4 == 1) {
        	return 150;
    	} else {
        	return 0;
    	}
	}//end checkSingle

	public static int checkTriple(int num1, int num2, int num3, int num4) {

    	if (num1 == num2 && num1 == num3) {
        	return num1 * 100;
    	}
    	if (num1 == num2 && num1 == num4) {
        	return num1 * 100;
    	}
    	if (num1 == num3 && num1 == num4) {
        	return num1 * 100;
    	}
    	if (num2 == num3 && num2 == num4) {
        	return num2 * 100;
    	}
    	return 0;
	}//end checkTriple

	public static int checkQuad(int num1, int num2, int num3, int num4) {

    	if (num1 == num2 && num1 == num3 && num1 == num4) {
        	return 1200;
    	}
    	return 0;
	}//end checkQuad

	public static int checkStraight(int num1, int num2, int num3, int num4) {

    	if (num1 == 1 && num2 == 2 && num3 == 3 && num4 == 4) {
        	return 1000;
    	} else if (num1 == 2 && num2 == 3 && num3 == 4 && num4 == 5) {
        	return 1000;
    	} else if (num1 == 3 && num2 == 4 && num3 == 5 && num4 == 6) {
        	return 1000;
    	} else {
        	return 0;
    	}
	}//end checkStraight

}//end class




