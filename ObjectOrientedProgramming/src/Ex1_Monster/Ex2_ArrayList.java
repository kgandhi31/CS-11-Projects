package Ex1_Monster;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2_ArrayList {

    public static Scanner numscan = new Scanner(System.in);
    public static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {

        //a)ArrayLists are better for Ipods than arrays since arraylists have the capability to change the size of data it can hold. 
        //  In the case of Ipods, the user may remove songs, shrinking the array, or add more songs, make the array larger. 
        //  Although the user is able to replace a song while using arrays, they cannot change the number of songs.
        //b)It's not necessary to create a fourth arrayList to store the artists whose songs are in the playlist because 
        int menuChoice = 0;

        ArrayList<String> allSongs = new ArrayList();
        ArrayList<String> allArtists = new ArrayList();
        ArrayList<String> partyPlayList = new ArrayList();
        ArrayList<String> artistsPlayList = new ArrayList();
        allSongs.add("Nice for What");
        allArtists.add("Drake");
        allSongs.add("God's Plan");
        allArtists.add("Drake");
        allSongs.add("Hall of Fame");
        allArtists.add("The Script");
        allSongs.add("Slow Motion");
        allArtists.add("Randolph");
        allSongs.add("Transforming");
        allArtists.add("KSI");
        allSongs.add("Never Be The Same");
        allArtists.add("Camila Cabello");
        allSongs.add("Walk It Talk It");
        allArtists.add("Migos");
        allSongs.add("Whatever it takes?");
        allArtists.add("Imagine Dragons");
        allSongs.add("Havana");
        allArtists.add("Camila Cabello");
        allSongs.add("Rockstar");
        allArtists.add("Post Malone");

        printSongs(allSongs, allArtists);

        while (true) {
            System.out.println();
            System.out.println("Select from the following options:\n 1. Add a new song to the library \n 2. Delete a song from the library"
                    + "\n 3. Add a song to the PartyPlayList \n 4. Exit menu");
            menuChoice = numscan.nextInt();
            System.out.println();
            if (menuChoice == 1) {
                System.out.println("You have chosen to add a song to your library.\nEnter the new song name.");
                String newSong = wordscan.nextLine();
                allSongs.add(newSong);
                System.out.println("Enter the artist name.");
                String newArtist = wordscan.nextLine();
                allArtists.add(newArtist);

            } else if (menuChoice == 2) {
                System.out.println("You have chosen to delete a song from your library.\nEnter the number corresponding to the song that you want to delete.");
                printSongs(allSongs, allArtists);
                System.out.println();
                int deleteSong = numscan.nextInt();
                allSongs.remove(deleteSong - 1);
                allArtists.remove(deleteSong - 1);
            } else if (menuChoice == 3) {
                System.out.println("You have chosen to add a song to your Party Play List.\nEnter the number corresponding to the song that you want to add to the Part Play List.");
                printSongs(allSongs, allArtists);
                System.out.println();
                int newPartySong = numscan.nextInt();
                partyPlayList.add(allSongs.get(newPartySong - 1));
                artistsPlayList.add(allArtists.get(newPartySong - 1));
                System.out.println("Your Party Play List:");
                printPartyPlayList(partyPlayList, artistsPlayList);
            } else if (menuChoice == 4) {
                System.out.println("You have exited the program.");
            }
        }//end while loop

//        allSongs.remove(0);
//        allArtists.remove(0);
//
//        allSongs.add(0, allSongs.remove(3));
//        allArtists.add(0, allArtists.remove(3));
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        for (int i = 0; i < allSongs.size(); i++) {
//            System.out.println(allArtists.get(i) + " - " + allSongs.get(i));
//        }
//
//        allArtists.set(2, "The Weekday");
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        for (int i = 0; i < allSongs.size(); i++) {
//            System.out.println(allArtists.get(i) + " - " + allSongs.get(i));
//        }
    }//end main

    public static void printSongs(ArrayList songs, ArrayList artists) {

        for (int i = 0; i < songs.size(); i++) {
            System.out.println((i + 1) + ". " + artists.get(i) + "\t" + songs.get(i));
        }
    }//end printSongs

    public static void printPartyPlayList(ArrayList playList, ArrayList artists) {

        for (int i = 0; i < playList.size(); i++) {
            System.out.println((i + 1) + ". " + artists.get(i) + "\t" + playList.get(i));
        }
    }//end printPartyPlayList

}//end class
