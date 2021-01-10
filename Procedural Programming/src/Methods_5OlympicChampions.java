
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Methods_5OlympicChampions {

    public static Scanner numscan = new Scanner(System.in);
    public static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("The Long Jump Champion is: " + distanceMedalist());
        System.out.println("The 100m Sprint Champion is: " + timeMedalist());
        JOptionPane.showMessageDialog(null, "The average time was: " + getAverage() + " seconds. \nGood luck in your next event.");

    }//end main  

    public static String distanceMedalist() {
        String name1;
        String name2;
        double distance1;
        double distance2;

        System.out.println("Long Jump: \n What is the name of the first person?");
        name1 = wordscan.nextLine();
        System.out.println(" What is the distance of the long jump for the first person?");
        distance1 = numscan.nextDouble();
        System.out.println(" What is the name of the second person?");
        name2 = wordscan.nextLine();
        System.out.println(" What is the distance of the long jump for the second person?");
        distance2 = numscan.nextDouble();

        if (distance1 > distance2) {
            return (name1);
        } else if (distance1 < distance2) {
            return (name2);
        } else {
            return ("tie.");
        }

    }//end distanceMedalist

    public static String timeMedalist() {
        String name1;
        String name2;
        double time1;
        double time2;

        System.out.println("100m Sprint: \n What is the name of the first person?");
        name1 = wordscan.nextLine();
        System.out.println(" What is the time of the 100m sprint for the first person?");
        time1 = numscan.nextDouble();
        System.out.println(" What is the name of the second person?");
        name2 = wordscan.nextLine();
        System.out.println(" What is the time of the 100m sprint for the second person?");
        time2 = numscan.nextDouble();

        if (time1 < time2) {
            return (name1);
        } else if (time1 > time2) {
            return (name2);
        } else {
            return ("tie.");
        }

    }//end timeMedalist

    public static double getAverage() {
        double distance1;
        double distance2;
        double distance3;

        System.out.println("Average time for 100m sprint: \n What was the sprinter's first time?");
        distance1 = numscan.nextDouble();
        System.out.println(" What was the sprinter's second time?");
        distance2 = numscan.nextDouble();
        System.out.println(" What was the sprinter's third time?");
        distance3 = numscan.nextDouble();

        return ((distance1 + distance2 + distance3) / 3);
    }//end getAverage

}//end class
