
import java.util.Scanner;

public class Ex5_Searching {

    public static void main(String[] args) {

//        String[] roles = Files.loadStringArr("roles.txt");
//        for (int i = 0; i < roles.length; i++) {
//            System.out.println(roles[i] + ", ");
//        }
//        System.out.println();
        Scanner numscan = new Scanner(System.in);
        Scanner wordscan = new Scanner(System.in);

        String[] allNames = Files.loadStringArr("nhl_last_names.txt");
        String[] allTeams = Files.loadStringArr("nhl_teams.txt");
        int[] allGoals = Files.loadIntArr("nhl_goals.txt");
        int[] allGames = Files.loadIntArr("nhl_games_played.txt");

        for (int i = 0; i < allNames.length; i++) {
            System.out.println(i + " " + allNames[i] + "    " + allTeams[i] + "    " + allGoals[i] + "  " + allGames[i]);
        }
        System.out.println("Who do you want to find?");
        String nameToFind;
        nameToFind = wordscan.nextLine();
        /**
         * *************** Linear Search  ****************
         */
        /**
         * *************** Efficiency: n/2 ****************
         */
        int foundIndex = -1;
        for (int i = 0; i < allNames.length; i++) {
            if (allNames[i].equalsIgnoreCase(nameToFind)) {
                foundIndex = i;
                break;
            }

        }

        if (foundIndex == -1) {
            System.out.println("not found");
        } else {
            System.out.println(allNames[foundIndex] + "   " + allGoals[foundIndex] + "   " + allGames[foundIndex]);
        }

        System.out.println("Who do you want to trade?");
        nameToFind = wordscan.nextLine();

        foundIndex = -1;
        for (int i = 0; i < allNames.length; i++) {
            if (allNames[i].equalsIgnoreCase(nameToFind)) {
                foundIndex = i;
                break;
            }

        }
        String toTrade = "Las Vegas GoldenCoupries";

        if (foundIndex == -1) {
            System.out.println("not found");
        } else {
            allTeams[foundIndex] = toTrade;
        }

        Files.saveFile("nhl_teams.txt", allTeams);

    }//end main

}//end class
