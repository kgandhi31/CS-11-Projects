//Database 100%
//Text Files extension 100%

package OOP6_Database;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class DatabaseMain {

    static Scanner numscan = new Scanner(System.in);
    static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {
        int mainChoice;
        int choice;
        System.out.println("Welcome to the Primera Division Database. Choose the number corresponding to option you want to explore:");
        System.out.println(" 1. Use the original hardcoded data \n 2. Load the data from a text file");
        mainChoice = numscan.nextInt();

        if (mainChoice == 1) {
            ArrayList<Teams> allTeams = new ArrayList();
            //String name, String c, int games, int w, int d, int l, int gs, int ga, int p
            allTeams.add(new Teams("Barcelona", "Barcelona", 38, 28, 9, 1, 99, 29, 93));
            allTeams.add(new Teams("Athletico Madrid", "Madrid", 38, 23, 10, 5, 58, 22, 79));
            allTeams.add(new Teams("Real Madrid", "Madrid", 38, 22, 10, 6, 94, 44, 76));
            allTeams.add(new Teams("Valencia", "Valencia", 38, 22, 7, 9, 65, 38, 73));
            allTeams.add(new Teams("Villarreal", "Villarreal", 38, 18, 7, 13, 57, 50, 61));
            allTeams.add(new Teams("Real Betis", "Seville", 38, 18, 6, 14, 60, 61, 60));
            allTeams.add(new Teams("Sevilla", "Seville", 38, 17, 7, 14, 49, 58, 58));
            allTeams.add(new Teams("Getafe", "Getafe", 38, 15, 10, 13, 42, 33, 55));
            allTeams.add(new Teams("Eibar", "Eibar", 38, 14, 9, 15, 44, 50, 51));
            allTeams.add(new Teams("Girona", "Girona", 38, 14, 9, 15, 50, 59, 51));

            while (true) {
                System.out.println();
                System.out.println("Enter the number corresponding to the option you want to explore:\n 1.Print all Team Names \n 2.Search Statistics for a Team \n 3.Print Teams by City "
                        + "\n 4.Point Difference for all Teams \n 5.Average Points for a Team per Game \n 6.Add a Team to the Database \n 7.Remove a Team from the Database \n 8.Exit");
                System.out.println();
                choice = numscan.nextInt();
                System.out.println();
                if (choice == 1) {
                    System.out.println("The following are the teams in the Primera Division:");
                    for (int i = 0; i < allTeams.size(); i++) {
                        System.out.println("- " + allTeams.get(i).teamName);
                    }
                } else if (choice == 2) {
                    System.out.println("Please enter the team name that you want to explore the season's statistics for:");
                    String searchTeam = wordscan.nextLine();
                    boolean found = false;
                    for (int i = 0; i < allTeams.size(); i++) {
                        if (allTeams.get(i).teamName.equalsIgnoreCase(searchTeam)) {
                            System.out.println("-> City of the Team: " + allTeams.get(i).city);
                            System.out.println("-> Game Played: " + allTeams.get(i).gamesPlayed);
                            System.out.println("-> Games Won: " + allTeams.get(i).numWins);
                            System.out.println("-> Games Drawn: " + allTeams.get(i).numDraw);
                            System.out.println("-> Games Lost: " + allTeams.get(i).numLost);
                            System.out.println("-> Goal(s) Scored: " + allTeams.get(i).goalsScored);
                            System.out.println("-> Goal(s) Against: " + allTeams.get(i).goalsAgainst);
                            System.out.println("-> Points: " + allTeams.get(i).points);
                            found = true;
                        }
                    }
                    if (found == false) {
                        System.out.println("Sorry, the team name that you have entered is not in the Primera Division.");
                    }
                } else if (choice == 3) {
                    System.out.println("Please enter a city name in Spain to display all the teams from that city:");
                    String searchCity = wordscan.nextLine();
                    int noneFound = 0;
                    for (int i = 0; i < allTeams.size(); i++) {
                        if (!allTeams.get(i).city.equalsIgnoreCase(searchCity)) {
                            noneFound++;
                        }
                    }
                    if (allTeams.size() == noneFound) {
                        System.out.println("There are no teams from the city that you have entered in the Primera Division.");
                    } else {
                        System.out.println();
                        System.out.println("The following teams are from " + searchCity + ":");
                        for (int i = 0; i < allTeams.size(); i++) {
                            if (allTeams.get(i).city.equalsIgnoreCase(searchCity)) {
                                System.out.println("-> " + allTeams.get(i).teamName);
                            }
                        }
                    }
                } else if (choice == 4) {
                    System.out.println("The following are all the teams in the Primera Division with their corresponding goal difference:");
                    System.out.println();
                    for (int i = 0; i < allTeams.size(); i++) {
                        System.out.println("-> " + allTeams.get(i).teamName + ": \t" + allTeams.get(i).goalDifference);
                    }
                } else if (choice == 5) {
                    System.out.println("The following are all the teams in the Primera Division with their average points per game:");
                    System.out.println();
                    for (int i = 0; i < allTeams.size(); i++) {
                        System.out.println("-> " + allTeams.get(i).teamName + ": \t" + allTeams.get(i).getAveragePoints());
                    }
                } else if (choice == 6) {
                    //String name, String c, int games, int w, int d, int l, int gs, int ga, int p
                    System.out.println("A new team has joined the Primera Division and it just played its last game of the season. "
                            + "Please carefully and correctly enter the information for the new team.");
                    System.out.println("What is the team name? (ex. Real Betis)");
                    String newName = wordscan.nextLine();
                    System.out.println("What city in Spain is the team located? (ex. Seville)");
                    String newCity = wordscan.nextLine();
                    System.out.println("Alright, the team has played all 38 matches. How many games did they win?");
                    int newWins = numscan.nextInt();
                    System.out.println("How many games did they draw?");
                    int newDraw = numscan.nextInt();
                    System.out.println("How many games did they lose?");
                    int newLost = numscan.nextInt();
                    System.out.println("Ok, how many goals did the team score?");
                    int newGoalsScored = numscan.nextInt();
                    System.out.println("How many goals were scored against this team?");
                    int newGoalsAgainst = numscan.nextInt();
                    System.out.println("Lastly, how many points did the team finish the season with?");
                    int newPoints = numscan.nextInt();
                    allTeams.add(new Teams(newName, newCity, 38, newWins, newDraw, newLost, newGoalsScored, newGoalsAgainst, newPoints));
                } else if (choice == 7) {
                    System.out.println("Enter the name of the team that has been relegated:");
                    String relegatedTeam = wordscan.nextLine();
                    int noneFound = 0;
                    for (int i = 0; i < allTeams.size(); i++) {
                        if (allTeams.get(i).teamName.equalsIgnoreCase(relegatedTeam)) {
                            allTeams.remove(i);
                        }
                        noneFound++;
                    }
                    if (allTeams.size() == noneFound) {
                        System.out.println("Sorry, the team name that you have entered is incorrect.");
                    }
                } else if (choice == 8) {
                    System.out.println("You have exited the database.");
                    break;
                }
            }//end while loop
//******************************************************************************end original hard coded data           
        } else if (mainChoice == 2) {
            ArrayList<Teams> allTeams = new ArrayList();
            loadFile("soccerdatabase.txt", allTeams);

            while (true) {
                System.out.println();
                System.out.println("Enter the number corresponding to the option you want to explore:\n 1.Print all Team Names \n 2.Search Statistics for a Team \n 3.Print Teams by City "
                        + "\n 4.Point Difference for all Teams \n 5.Average Points for a Team per Game \n 6.Add a Team to the Database \n 7.Remove a Team from the Database \n 8.Exit");
                System.out.println();
                choice = numscan.nextInt();
                System.out.println();
                if (choice == 1) {
                    for (int i = 0; i < allTeams.size(); i++) {
                        System.out.println("- " + allTeams.get(i).teamName);
                    }
                } else if (choice == 2) {
                    System.out.println("Please enter the team name that you want to explore the season's statistics for:");
                    String searchTeam = wordscan.nextLine();
                    boolean found = false;
                    for (int i = 0; i < allTeams.size(); i++) {
                        if (allTeams.get(i).teamName.equalsIgnoreCase(searchTeam)) {
                            System.out.println("-> City of the Team: " + allTeams.get(i).city);
                            System.out.println("-> Game Played: " + allTeams.get(i).gamesPlayed);
                            System.out.println("-> Games Won: " + allTeams.get(i).numWins);
                            System.out.println("-> Games Drawn: " + allTeams.get(i).numDraw);
                            System.out.println("-> Games Lost: " + allTeams.get(i).numLost);
                            System.out.println("-> Goal(s) Scored: " + allTeams.get(i).goalsScored);
                            System.out.println("-> Goal(s) Against: " + allTeams.get(i).goalsAgainst);
                            System.out.println("-> Points: " + allTeams.get(i).points);
                            found = true;
                        }
                    }
                    if (found == false) {
                        System.out.println("Sorry, the team name that you have entered is not in the Primera Division.");
                    }
                } else if (choice == 3) {
                    System.out.println("Please enter a city name in Spain to display all the teams from that city:");
                    String searchCity = wordscan.nextLine();
                    int noneFound = 0;
                    for (int i = 0; i < allTeams.size(); i++) {
                        if (!allTeams.get(i).city.equalsIgnoreCase(searchCity)) {
                            noneFound++;
                        }
                    }
                    if (allTeams.size() == noneFound) {
                        System.out.println("There are no teams from the city that you have entered in the Primera Division.");
                    } else {
                        System.out.println();
                        System.out.println("The following teams are from " + searchCity + ":");
                        for (int i = 0; i < allTeams.size(); i++) {
                            if (allTeams.get(i).city.equalsIgnoreCase(searchCity)) {
                                System.out.println("-> " + allTeams.get(i).teamName);
                            }
                        }
                    }
                } else if (choice == 4) {
                    System.out.println("The following are all the teams in the Primera Division with their corresponding goal difference:");
                    System.out.println();
                    for (int i = 0; i < allTeams.size(); i++) {
                        System.out.println("-> " + allTeams.get(i).teamName + ": \t" + allTeams.get(i).goalDifference);
                    }
                } else if (choice == 5) {
                    System.out.println("The following are all the teams in the Primera Division with their average points per game:");
                    System.out.println();
                    for (int i = 0; i < allTeams.size(); i++) {
                        System.out.println("-> " + allTeams.get(i).teamName + ": \t" + allTeams.get(i).getAveragePoints());
                    }
                } else if (choice == 6) {
                    //String name, String c, int games, int w, int d, int l, int gs, int ga, int p
                    System.out.println("A new team has joined the Primera Division and it just played its last game of the season. "
                            + "Please carefully and correctly enter the information for the new team.");
                    System.out.println("What is the team name? (ex. Real Betis)");
                    String newName = wordscan.nextLine();
                    System.out.println("What city in Spain is the team located? (ex. Seville)");
                    String newCity = wordscan.nextLine();
                    System.out.println("Alright, the team has played all 38 matches. How many games did they win?");
                    int newWins = numscan.nextInt();
                    System.out.println("How many games did they draw?");
                    int newDraw = numscan.nextInt();
                    System.out.println("How many games did they lose?");
                    int newLost = numscan.nextInt();
                    System.out.println("Ok, how many goals did the team score?");
                    int newGoalsScored = numscan.nextInt();
                    System.out.println("How many goals were scored against this team?");
                    int newGoalsAgainst = numscan.nextInt();
                    System.out.println("Lastly, how many points did the team finish the season with?");
                    int newPoints = numscan.nextInt();
                    allTeams.add(new Teams(newName, newCity, 38, newWins, newDraw, newLost, newGoalsScored, newGoalsAgainst, newPoints));
                    saveFile("soccerdatabase.txt", allTeams);
                } else if (choice == 7) {
                    System.out.println("Enter the name of the team that has been relegated:");
                    String relegatedTeam = wordscan.nextLine();
                    int noneFound = 0;
                    for (int i = 0; i < allTeams.size(); i++) {
                        if (allTeams.get(i).teamName.equalsIgnoreCase(relegatedTeam)) {
                            allTeams.remove(i);
                        }
                        noneFound++;
                    }
                    if (allTeams.size() == noneFound) {
                        System.out.println("Sorry, the team name that you have entered is incorrect.");
                    }
                } else if (choice == 8) {
                    System.out.println("You have exited the database.");
                    break;
                }
            }//end while loop
        }//*********************************************************************end data from a text file
    }//end main

    public static void loadFile(String filename, ArrayList<Teams> tempList) {
        String temp = "";
        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));
            while (file.ready()) {
                temp = file.readLine();
                String tempArray[] = temp.split(",");
                //String name, String c, int games, int w, int d, int l, int gs, int ga, int p                          
                tempList.add(new Teams(tempArray[0], tempArray[1], Integer.parseInt(tempArray[2]), Integer.parseInt(tempArray[3]), Integer.parseInt(tempArray[4]), Integer.parseInt(tempArray[5]),
                        Integer.parseInt(tempArray[6]), Integer.parseInt(tempArray[7]), Integer.parseInt(tempArray[8])));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }//end loadFile

    public static void saveFile(String filename, ArrayList<Teams> tempList) {
        try {
            PrintWriter file = new PrintWriter(new FileWriter(filename));

            for (int i = 0; i < tempList.size(); i++) {
                String toSave = "";
                toSave = tempList.get(i).teamName;
                toSave += "," + tempList.get(i).city;
                toSave += "," + tempList.get(i).gamesPlayed;
                toSave += "," + tempList.get(i).numWins;
                toSave += "," + tempList.get(i).numDraw;
                toSave += "," + tempList.get(i).numLost;
                toSave += "," + tempList.get(i).goalsScored;
                toSave += "," + tempList.get(i).goalsAgainst;
                toSave += "," + tempList.get(i).points;
                file.println(toSave);
            }
            file.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }//end saveFile
}//end class
