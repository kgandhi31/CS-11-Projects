package Ex2_BikeAThon;

import java.util.ArrayList;

public class BikeAThonMain {

    public static void main(String[] args) {
        ArrayList<Team> teamList = new ArrayList();
        teamList.add(new Team("Bike is Short for Bichael", "Tate"));
        teamList.add(new Team("Nut and Bolt", "Zack"));
        teamList.add(new Team("XCELLERATE", "Krish"));
        teamList.add(new Team("Head Honchos", "Rowan"));
        teamList.add(new Team("Man On Bike", "Shaq"));

        teamList.get(0).addMember("Bradley");
        teamList.get(1).addMember("Jacob");
        teamList.get(2).addMember("Pratham");
        teamList.get(3).addMember("Sim");
        teamList.get(4).addMember("Numbers");

        for (int i = 0; i < teamList.size(); i++) {
            teamList.get(i).printAll();
        }

    }//end main

}//end class
