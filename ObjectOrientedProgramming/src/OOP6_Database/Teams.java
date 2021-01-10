package OOP6_Database;

public class Teams {

//instance variables    
    public String teamName;
    public String city;
    public int gamesPlayed;
    public int numWins;
    public int numDraw;
    public int numLost;
    public int goalsScored;
    public int goalsAgainst;
    public int goalDifference;
    public int points;

//constructor methods    
    public Teams(String name, String c, int games, int w, int d, int l, int gs, int ga, int p) {
        teamName = name;
        city = c;
        gamesPlayed = games;
        numWins = w;
        numDraw = d;
        numLost = l;
        goalsScored = gs;
        goalsAgainst = ga;
        goalDifference = (gs - ga);
        points = p;
    }

//instance methods    
    public String getName() {
        return teamName;
    }
    public int getAveragePoints() {
        return (points/gamesPlayed);
    }
    
}
