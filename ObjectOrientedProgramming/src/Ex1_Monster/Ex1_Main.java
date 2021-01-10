package Ex1_Monster;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1_Main {

    public static void main(String[] args) {
        Scanner wordscan = new Scanner(System.in);    //constructed method
        Monster m1 = new Monster("zombie", true, 2);
        Monster m2 = new Monster("werewolf", true, 4);

//        System.out.println(m1.getType());
//        System.out.println(m1.getHealth());
//        System.out.println(m1.getDescription());
        int playerhealth = 100;
        int playerdamage = 10;

//        System.out.println("You are walking through an abandoned amusement park");
//        System.out.println("Suddenly, you come upon a " + m1.getDescription() + " " + m1.getType());
//
//        while (playerhealth > 0 && m1.getHealth() > 0) {
//            playerhealth -= m1.attack();
//            if (playerhealth < 1) {
//                playerhealth = 0;
//            } else {
//                m1.defend(playerdamage * 2);
//            }
//            System.out.println("Zombie Health: " + m1.getHealth() + "     Your Health: " + playerhealth);
//            wordscan.nextLine();
//        }
//        if (playerhealth < 1) {
//            System.out.println("You lose! Game over.");
//            return;
//        } else {
//            System.out.println("Woah, that was too close!");
//            System.out.println("You continue walking through the park and find bandages on a bench.");
//            System.out.println("You restore 3/4 of your health.");
//            playerhealth = 75;
//            System.out.println("Suddenly, you hear a howl and the night grows darker.");
//            System.out.println("You see a bush shivering and unexpectedly a " + m2.getDescription() + " " + m2.getType() + " jumps at you.");
//            while (playerhealth > 0 && m2.getHealth() > 0) {
//                playerhealth -= m2.attack();
//                if (playerhealth < 1) {
//                    playerhealth = 0;
//                } else {
//                    m2.defend(playerdamage * 2);
//                }
//                System.out.println("Zombie Health: " + m2.getHealth() + "     Your Health: " + playerhealth);
//                wordscan.nextLine();
//            }
//        }

        ArrayList<Monster> monsterList = new ArrayList();
        monsterList.add(m2);
        monsterList.add(m1);
        monsterList.add( new Monster("ghost", false, 1) );
        monsterList.add( new Monster("vampire", true, 4) );
        monsterList.add( new Monster("ghost", true, 1) );
        monsterList.add( new Monster("mummy", true, 5) );

        for (int i = 0; i < monsterList.size(); i++){
            if (monsterList.get(i).getEvil()){
                System.out.println("You meet a mean " + monsterList.get(i).getType());
            } else {
                System.out.println("You meet a friendly " + monsterList.get(i).getType());
            }
        }
        
        
        
    }//end main

}//end Ex1_Main
