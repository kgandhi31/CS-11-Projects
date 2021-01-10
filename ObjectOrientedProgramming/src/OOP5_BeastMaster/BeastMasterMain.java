package OOP5_BeastMaster;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class BeastMasterMain {

    static Scanner numscan = new Scanner(System.in);
    static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Contestants> statistics = new ArrayList();
        loadFile("beastmastercompetitors.txt", statistics);

        System.out.println("The inforamtion is displayed in this order: Fullname, Age, Job, Country, Episode, Firstname, Gender, Points.");
        System.out.println();
        for (int i = 0; i < statistics.size(); i++) {
            System.out.println(statistics.get(i).fullName + ",\t" + statistics.get(i).age + ",\t" + statistics.get(i).job + ",\t" + statistics.get(i).country + ",\t"
                    + statistics.get(i).episode + ",\t" + statistics.get(i).firstName + ",\t" + statistics.get(i).gender + ",\t" + statistics.get(i).points);
        }

        System.out.println();
        System.out.println("The total points for all competitors is " + totalPoints(statistics) + ".");
        System.out.println();
        System.out.println("The average age for all competitors is " + averageAge(statistics) + ".");
        System.out.println();
        int topScorer = highestScore(statistics);
        System.out.println(statistics.get(topScorer).fullName + ", is the competitor with the highest score of " + statistics.get(topScorer).points + " points.");
        System.out.println();
        oneToSixContestants(statistics);
        System.out.println();
        selectCountry(statistics);
        System.out.println();

//episode 10
        System.out.println("It is time for Episode 10. Answer the following questions for the new contestant.");
        System.out.println("First, type the contestant's fullname (ex. Takehide Sato):");
        String newFullName = wordscan.nextLine();
        System.out.println("Alright, what is the age of this contestant:");
        int newAge = numscan.nextInt();
        System.out.println("Next, what is the contestant's occupation (ex. Crossfit Coach):");
        String newJob = wordscan.nextLine();
        System.out.println("Ok, what country is this contestant from (ex. Japan)?");
        String newCountry = wordscan.nextLine();
        System.out.println("Sorry for the inconvienience, can you please type just the first name of this contestant:");
        String newFirstName = wordscan.nextLine();
        System.out.println("Thank you for your cooperation. Now enter the gender of this contestant (ex. male):");
        String newGender = wordscan.nextLine();
        System.out.println("Last question, please enter the number of points for this contestant (ex.40):");
        int newPoints = numscan.nextInt();
        statistics.add(new Contestants(newFullName, newAge, newJob, newCountry, 10, newFirstName, newGender, newPoints));
        saveFile("beastmastercompetitors.txt", statistics);
        System.out.println();

//Biased against females
        int numTotContestants = 0;
        int numFemale = 0;
        int numTotPoints = 0;
        int numFemalePoints = 0;
        for (int i = 0; i < statistics.size(); i++) {
            if (statistics.get(i).gender.equalsIgnoreCase("female")) {
                numFemale++;
                numFemalePoints += statistics.get(i).points;
            }
            numTotContestants++;
            numTotPoints += statistics.get(i).points;
        }
        System.out.println("The design of the BeastMaster course is inherently biased against females. Out of " + numTotContestants + " total contestants, only " + numFemale + " contestants are female.");
        int pointDifference = ((numTotPoints / numTotContestants) - (numFemalePoints / numFemale));
        System.out.println("Furthermore, the average points for a female contestant is " + (numFemalePoints / numFemale) + ", " + pointDifference + " points lower than the average points for all contestants.");

    }//end main

    public static int totalPoints(ArrayList<Contestants> stats) {
        int sumPoints = 0;
        for (int i = 0; i < stats.size(); i++) {
            sumPoints += stats.get(i).points;
        }
        return sumPoints;
    }//end totalPoints

    public static int averageAge(ArrayList<Contestants> stats) {
        int avg = 0;
        int numPeople = 0;
        for (int i = 0; i < stats.size(); i++) {
            avg += stats.get(i).age;
            numPeople++;
        }
        return (avg / numPeople);
    }//end averageAge

    public static int highestScore(ArrayList<Contestants> stats) {
        int index = 0;
        int topScore = stats.get(index).points;
        for (int i = 0; i < stats.size(); i++) {
            if (stats.get(i).points > topScore) {
                index = i;
            }
        }
        return (index);
    }//end averageAge    

    public static void oneToSixContestants(ArrayList<Contestants> stats) {
        System.out.println("The following are the names of the contestants from episodes 1-6:");
        for (int i = 0; i < stats.size(); i++) {
            if (stats.get(i).episode < 7) {
                System.out.println(" - " + stats.get(i).fullName);
            }
        }
    }//end oneToSixContestants 

    public static void selectCountry(ArrayList<Contestants> stats) {
        System.out.println("Type a name of a country:");
        String searchCountry = wordscan.nextLine();
        System.out.println("The following contestants are from (the) " + searchCountry + ":");
        for (int i = 0; i < stats.size(); i++) {
            if (stats.get(i).country.equalsIgnoreCase(searchCountry)) {
                System.out.println(" - " + stats.get(i).fullName);
            }
        }
    }//end selectCountry 

    public static void loadFile(String filename, ArrayList tempList) {
        String temp = "";
        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));
            while (file.ready()) {
                temp = file.readLine();
                String tempArray[] = temp.split(",");                                            
                tempList.add(new Contestants(tempArray[0], Integer.parseInt(tempArray[1]), tempArray[2], tempArray[3], Integer.parseInt(tempArray[4]), tempArray[5], tempArray[6], Integer.parseInt(tempArray[7])));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }//end loadFile

    public static void saveFile(String filename, ArrayList<Contestants> tempList) {
        try {
            PrintWriter file = new PrintWriter(new FileWriter(filename));

            for (int i = 0; i < tempList.size(); i++) {
                String toSave = "";
                toSave = tempList.get(i).fullName;
                toSave += "," + tempList.get(i).age;
                toSave += "," + tempList.get(i).job;
                toSave += "," + tempList.get(i).country;
                toSave += "," + tempList.get(i).episode;
                toSave += "," + tempList.get(i).firstName;
                toSave += "," + tempList.get(i).gender;
                toSave += "," + tempList.get(i).points;

                file.println(toSave);

            }
            file.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }//end saveFile
}//end class
