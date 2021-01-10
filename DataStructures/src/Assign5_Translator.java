
import java.util.Scanner;

public class Assign5_Translator {

	public static Scanner numscan = new Scanner(System.in);
	public static Scanner wordscan = new Scanner(System.in);

	public static void main(String[] args) {

    	String[] english = {"hello", "goodbye", "please", "excuse me", "thank you", "sorry", "where", "when",
        	"how", "why", "where is", "how much", "I want", "food", "drink"};
    	String[] french = {"bonjour", "au revoir", "s'il vous plait", "excusez-moi", "merci", "desole", "ou", "quand",
        	"comment", "pourquoi", "ou est", "combien", "je veux", "aliments", "boisson"};
    	String direction;
    	String goAgain;

    	System.out.println("Welcome to the English-French Translator.");
    	System.out.println("Enter 'french' to translate from english to french or enter 'english' to translate from french to english.");
    	direction = wordscan.nextLine();

    	if (direction.equalsIgnoreCase("french")) {
        	while (true) {
            	System.out.println("This translator works for the following english words/phrases: ");
            	String translate;

            	for (int i = 0; i < english.length; i++) {
                	System.out.println(english[i]);
            	}

            	System.out.println();
            	System.out.println("Type the word/phrase you want translated to french:");
            	translate = wordscan.nextLine();

            	int index = 0;
            	for (int i = 0; i < english.length; i++) {
                	if (translate.equalsIgnoreCase(english[i])) {
                    	index = i;
                    	break;
                	} else if (!translate.equalsIgnoreCase(english[i])) {
                    	index = -1;
                	}
            	}

            	if (index == -1) {
                	System.out.println("This word cannot be translated with this translator.");
            	} else {
                	System.out.println();
                	System.out.println("The french translation is: " + french[index] + ".");
            	}

            	System.out.println("Do you want to translate another word/phrase? Type 'yes' or 'no.'");
            	goAgain = wordscan.nextLine();

            	if (goAgain.equalsIgnoreCase("no")) {
                	System.out.println();
                	System.out.println("You have exited the Translator.");
                	break;
            	} else {
                	System.out.println();
            	}
        	}//end while loop for english to french

    	} else if (direction.equalsIgnoreCase("english")) {
        	while (true) {
            	System.out.println("This translator works for the following french words/phrases: ");
            	String translate;

            	for (int i = 0; i < french.length; i++) {
                	System.out.println(french[i]);
            	}

            	System.out.println();
            	System.out.println("Type the word/phrase you want translated to english:");
            	translate = wordscan.nextLine();

            	int index = 0;
            	for (int i = 0; i < french.length; i++) {
                	if (translate.equalsIgnoreCase(french[i])) {
                    	index = i;
                    	break;
                	} else if (!translate.equalsIgnoreCase(french[i])) {
                    	index = -1;
                	}
            	}

            	if (index == -1) {
                	System.out.println("This word cannot be translated with this translator.");
            	} else {
                	System.out.println();
                	System.out.println("The english translation is: " + english[index] + ".");
            	}

            	System.out.println("Do you want to translate another word/phrase? Type 'yes' or 'no.'");
            	goAgain = wordscan.nextLine();

            	if (goAgain.equalsIgnoreCase("no")) {
                	System.out.println();
                	System.out.println("You have exited the Translator.");
                	break;
            	} else {
                	System.out.println();
            	}
        	}//end while loop for english to french
    	}

	}//end main

}//end class


