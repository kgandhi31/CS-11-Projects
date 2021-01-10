package OOP1_Game;

public class Game {

//Instance Variables    
    public String gameName;
    public String forConsole;
    public String gameGenre;
    public double sales;
    public int rating;

//Constructor Methods
    public Game(String name, String console, String genre, int r) {
        gameName = name;
        forConsole = console;
        gameGenre = genre;
        sales = 0;
        rating = r;
    }

//Instance Methods    
    public void newSales(double amount) {
        sales += amount;

    }//end newSales

    public void printAll() {
        System.out.println("- "+ gameName + " for " + forConsole + " is a(n) " + gameGenre + " game rated " + rating + " out of 10.");

    }//end printAll

}
