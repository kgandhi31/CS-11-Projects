package Ex5_TextFiles;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class ActorMain {

    public static void main(String[] args) {

        ArrayList<Actor> castList = new ArrayList();
        loadFile("actors.txt", castList);

        for (int i = 0; i < castList.size(); i++) {
            System.out.println(castList.get(i).name + " " + castList.get(i).role);
        }

        Scanner wordscan = new Scanner(System.in);
        Scanner numscan = new Scanner(System.in);

        String answer;
        System.out.println("Do you want to add a new actor?");
        answer = wordscan.nextLine();
        if (answer.contains("y")) {
            System.out.println("Enter name");
            String newName = wordscan.nextLine();
            System.out.println("Enter sales so far");
            double newSales = numscan.nextDouble();
            System.out.println("Professional? (true or false)");
            boolean newPro = numscan.nextBoolean();
            System.out.println("Enter role");
            String newRole = wordscan.nextLine();
            castList.add(new Actor(newName, newSales, newPro, newRole));
        }

        saveFile("actors.txt", castList);

    }//end main

    public static void loadFile(String filename, ArrayList tempList) {
        String temp = "";
        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));
            while (file.ready()) {
                temp = file.readLine();
                String tempArray[] = temp.split(",");
//the next line is customized for whatever class you are creating.
//Here we create a new STUDENT so there are 4 variables
                //tempList.add(new Actor(tempArray[0], Double.parseDouble(tempArray[1]), Boolean.parseBoolean(tempArray[2]), tempArray[3]));

                //step 1
                //****tempList.add(new Actor());
                //step 2
                //****tempList.add(new Actor(tempArray[0], tempArray[1], tempArray[2], tempArray[3]));
                //step 3
                tempList.add(new Actor(tempArray[0], Double.parseDouble(tempArray[1]), Boolean.parseBoolean(tempArray[2]), tempArray[3]));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }//end loadFile

    public static void saveFile(String filename, ArrayList<Actor> tempList) {
        try {
            PrintWriter file = new PrintWriter(new FileWriter(filename));

            for (int i = 0; i < tempList.size(); i++) {
//the next lines are customized for whatever data you are getting.
                String toSave = "";
                toSave = tempList.get(i).name;
                toSave += "," + tempList.get(i).sales;
                toSave += "," + tempList.get(i).isPro;
                toSave += "," + tempList.get(i).role;

                file.println(toSave);

            }
            file.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }//end saveFile

}//end class
