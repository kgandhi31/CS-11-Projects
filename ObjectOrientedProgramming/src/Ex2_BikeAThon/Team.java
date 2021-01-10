package Ex2_BikeAThon;

import java.util.ArrayList;

public class Team {

    //*** Instance Variables   *****/
    public String teamName;
    public String captain;
    public double amountRaised;
    public int location;
    public boolean formsIn;
    ArrayList<String> membersList = new ArrayList();

    //*** Constructor Methods   ****/
    public Team(String name, String cap) {
        teamName = name;
        captain = cap;
        amountRaised = 0;
        location = -1;
        formsIn = false;
        membersList.add(cap);
    }

    public void printAll() {
        System.out.println("Team Name: " + teamName + "    Captain: " + captain);
        if (location > -1) {
            System.out.println("Living Room Location: " + location);
        }
        System.out.println("Forms in? " + formsIn);

        for (int i = 0; i < membersList.size(); i++) {
            System.out.println(membersList.get(i) + ", ");
        }
        System.out.println();
        System.out.println();
    
    }//end printAll

    public void addMember(String name){
        membersList.add(name);
        
    }
    
    
    
}//end team
