//75% - flaw in #3: try "and" vs "abc"
import java.util.Scanner;

public class Methods_Final10 {

    public static Scanner numscan = new Scanner(System.in);
    public static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {

        String choice = "";

        while (choice != "exit") {

            System.out.println("Which method do you want to explore? \n 1.ContainsIgnoreCase \n 2.'The' Counter \n 3.Build your own String Equals function \n 4.Addition Evaluator");

            choice = wordscan.nextLine();

            if (choice.equalsIgnoreCase("1")) {
                String firstWord;
                String secondWord;
                System.out.println();
                System.out.println("Type the first string:");
                firstWord = wordscan.nextLine();
                System.out.println("Type the second string:");
                secondWord = wordscan.nextLine();

                if (ContainsIgnoreCase(firstWord, secondWord) == true) {
                    System.out.println("That's a positive match.");
                } else {
                    System.out.println("That's a negative match.");

                }
                System.out.println();
            }//end choice1

            if (choice.equalsIgnoreCase("2")) {
                String phrase;
                String find;
                System.out.println();
                System.out.println("Type the string:");
                phrase = wordscan.nextLine();
                System.out.println("What word should the program count?");
                find = wordscan.nextLine();

                System.out.println("Instances of '" + find + "':" + theCounter(phrase, find));
                System.out.println();
            }//end choice2

            if (choice.equalsIgnoreCase("3")) {
                String phrase1;
                String phrase2;
                System.out.println();
                System.out.println("Type the first string:");
                phrase1 = wordscan.nextLine();
                String[] sentenceOne = phrase1.split("");

                System.out.println("Type the second string");
                phrase2 = wordscan.nextLine();
                String[] sentenceTwo = phrase2.split("");

                if (myEquals(sentenceOne, sentenceTwo) == true) {
                    System.out.println("The two strings are equal.");
                } else {
                    System.out.println("The two strings are not equal.");

                }
                System.out.println();
            }//end choice3    	 

            if (choice.equalsIgnoreCase("4")) {

                System.out.println();
                System.out.println("Please enter an addition statement in the format `x + y = z`");
                String sum = wordscan.nextLine();
                String[] statement = sum.split(" ");   
                
                if (additionEvaluator(statement) == true) {
                    System.out.println("The statement is a valid addition statement.");
                } else {
                    System.out.println("The statement is not a valid addition statement.");
                }

                System.out.println();

            }//end choice4
            
        }//end while loop
        
    }//end main

    public static boolean ContainsIgnoreCase(String word1, String word2) {

        return word1.toLowerCase().contains(word2.toLowerCase()) || word2.toLowerCase().contains(word1.toLowerCase());

    }//end ContainsIgnoreCase

    public static int theCounter(String words, String subword) {
        int counts = 0;
        int index = words.toLowerCase().indexOf(subword);

        while (index >= 0) {
            index = words.toLowerCase().indexOf(subword, index + 1);
            counts++;
        }
        return counts;

    }//end theCounter

    public static boolean myEquals(String[] s1, String[] s2) {

        for (int i = 0; i < s1.length; i++) {
            if (s1.length == s2.length) {
                if (s1[i].equals(s2[i])) {
                    return true;
                }
            }
        }
        return false;
    }//end myEquals

    public static boolean additionEvaluator(String[] s1) {
        
        return Integer.parseInt(s1[0]) + Integer.parseInt(s1[2]) == Integer.parseInt(s1[4]);
    }//end additionEvaluator

}//end class

//System.out.println(Integer.parseInt(s1[0]) + Integer.parseInt(s1[2]));
