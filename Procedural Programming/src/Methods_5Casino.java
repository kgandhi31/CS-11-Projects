
public class Methods_5Casino {

    public static void main(String[] args) {

        System.out.println("Welcome to Couprie's Casino");
        String p1suit;
        int p1number;
        p1suit = getSuit();
        p1number = getNumber();
        boolean playerFlush = false;
        boolean playerPair = false;
        int highPlayercard = 0;

        String p2suit;
        int p2number;
        p2suit = getSuit();
        p2number = getNumber();

        String c1suit;
        int c1number;
        c1suit = getSuit();
        c1number = getNumber();
        boolean casinoFlush = false;
        boolean casinoPair = false;
        int highCasinocard = 0;

        String c2suit;
        int c2number;
        c2suit = getSuit();
        c2number = getNumber();

        System.out.println("You were dealt a " + p1number + " of " + p1suit);
        System.out.println("Your second card was a " + p2number + " of " + p2suit);
        System.out.println("The Casino was dealt a " + c1number + " of " + c1suit);
        System.out.println("The Casiono's second card was a " + c2number + " of " + c2suit);
        System.out.println();

        //check the player's hand
        if (isFlush(p1suit, p2suit)) {
            System.out.println("You have a flush.");
            playerFlush = true;
            if (p1number > p2number) {
                highPlayercard = p1number;
            } else if (p1number < p2number) {
                highPlayercard = p2number;
            } else {
                highPlayercard = p1number;
            }
        } else if (isPair(p1number, p2number)) {
            System.out.println("You have a pair.");
            playerPair = true;
            if (p1number > p2number) {
                highPlayercard = p1number;
            } else if (p1number < p2number) {
                highPlayercard = p2number;
            } else {
                highPlayercard = p1number;
            }
        } else {
            System.out.println("You have nothing.");
            if (p1number > p2number) {
                System.out.println("Your highest card was " + p1number);
                highPlayercard = p1number;
            } else if (p1number < p2number) {
                System.out.println("Your highest card was " + p2number);
                highPlayercard = p2number;
            } else {
                System.out.println("Your highest card was " + p1number);
                highPlayercard = p1number;
            }
        }
        System.out.println();

        //check the casino's hand
        if (isFlush(c1suit, c2suit)) {
            System.out.println("The Casino has a flush.");
            casinoFlush = true;
            if (c1number > c2number) {
                highCasinocard = c1number;
            } else if (c1number < c2number) {
                highCasinocard = c2number;
            } else {
                highCasinocard = c1number;
            }
        } else if (isPair(c1number, c2number)) {
            System.out.println("The Casino has a pair.");
            casinoPair = true;
            if (c1number > c2number) {
                highCasinocard = c1number;
            } else if (c1number < c2number) {
                highCasinocard = c2number;
            } else {
                highCasinocard = c1number;
            }
        } else {
            System.out.println("The Casino has nothing.");
            if (c1number > c2number) {
                System.out.println("The Casino's highest card was " + c1number);
                highCasinocard = c1number;
            } else if (c1number < c2number) {
                System.out.println("The Casino's highest card was " + c2number);
                highCasinocard = c2number;
            } else {
                System.out.println("The Casino's highest card was " + c1number);
                highCasinocard = c1number;
            }
        }
        System.out.println();

        if (playerFlush == true && playerPair == false && casinoFlush == false && casinoPair == false) {
            System.out.println("The Player Wins!");
        } else if (playerFlush == true && playerPair == false && casinoFlush == false && casinoPair == true) {
            System.out.println("The Player Wins!");
        } else if (playerFlush == true && playerPair == false && casinoFlush == true && casinoPair == false) {
            if (highPlayercard > highCasinocard) {
                System.out.println("The Player Wins!");
            } else if (highPlayercard < highCasinocard) {
                System.out.println("The Casino Wins!");
            } else if (highPlayercard == highCasinocard) {
                System.out.println("WOW, What are the chances that your highest card is equal to the highest card of the casino. It's a tie.");
            }
        } else if (playerFlush == false && playerPair == true && casinoFlush == false && casinoPair == false) {
            System.out.println("The Player Wins!");
        } else if (playerFlush == false && playerPair == true && casinoFlush == false && casinoPair == true) {
            if (highPlayercard > highCasinocard) {
                System.out.println("The Player Wins!");
            } else if (highPlayercard < highCasinocard) {
                System.out.println("The Casino Wins!");
            } else if (highPlayercard == highCasinocard) {
                System.out.println("WOW, What are the chances that your highest card is equal to the highest card of the casino. It's a tie.");
            }
        } else if (playerFlush == false && playerPair == false && casinoFlush == true && casinoPair == false) {
            System.out.println("The Casino Wins!");
        } else if (playerFlush == false && playerPair == false && casinoFlush == false && casinoPair == true) {
            System.out.println("The Casino Wins!");
        } else if (highPlayercard > highCasinocard) {
            System.out.println("The Player Wins!");
        } else if (highPlayercard < highCasinocard) {
            System.out.println("The Casino Wins!");
        } else if (highPlayercard == highCasinocard) {
            System.out.println("WOW, What are the chances that your highest card is equal to the highest card of the casino. It's a tie.");
        }

    }//end main

    public static boolean isPair(int c1, int c2) {
        if (c1 == c2) {
            return true;
        } else {
            return false;
        }
    }//end isPair

    public static boolean isFlush(String c1, String c2) {
        if (c1.equals(c2)) {
            return true;
        } else {
            return false;
        }
    }//end isFlush

    public static int getNumber() {
        int temp = (int) (Math.random() * 12) + 2;
        return temp;
    }//end getNumber

    public static String getSuit() {
        int temp = (int) (Math.random() * 4);
        if (temp == 1) {
            return "clubs";
        } else if (temp == 2) {
            return "hearts";
        } else if (temp == 3) {
            return "spades";
        } else {
            return "diamonds";
        }
    }//end getSuit

}//end class
