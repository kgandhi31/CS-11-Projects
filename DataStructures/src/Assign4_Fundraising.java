
public class Assign4_Fundraising {

	public static void main(String[] args) {

    	String[] allNames = {"Krish", "Sanders", "Pratham", "Ayoj", "Kadar", "Andrew", "Jeffry", "Simon", "Brandon", "Hari"};
    	double[] allRaised = {50, 100, 200, 300, 400, 500, 600, 700, 800, 900};
    	boolean[] formReturned = {true, true, true, false, false, true, true, true, true, true};
   	 
    	System.out.println("Bike-A-Thon Fundraising");
    	System.out.println();
    	System.out.println("Rider Name  Amount Raised  Form Returned");
    	for (int i = 0; i < allNames.length; i++) {
        	System.out.println(i + 1 + "   " + allNames[i] + "  	" + allRaised[i] + "    	" + formReturned[i]);
    	}

    	//total amount raised by team
    	double teamRaised = 0;
    	for (int i = 0; i < allNames.length; i++) {
        	teamRaised += allRaised[i];
    	}
    	System.out.println();
    	System.out.println("The total amount raised by the team is: $" + teamRaised + ".");

    	//average amount raised per student
    	System.out.println();
    	System.out.println("The average amount raised per student is: $" + (teamRaised / allNames.length) + ".");

    	//number of students who raised more than 200
    	int numTwoHundred = 0;
    	for (int i = 0; i < allNames.length; i++) {
        	if (allRaised[i] > 200) {
            	numTwoHundred++;
        	}
    	}
    	System.out.println();
    	System.out.println(numTwoHundred + " student(s) raised more than $200.");

    	//number of students who have not returned forms
    	int numNotReturned = 0;
    	for (int i = 0; i < allNames.length; i++) {
        	if (formReturned[i] == false) {
            	numNotReturned++;
        	}
    	}
    	System.out.println();
    	System.out.println(numNotReturned + " student(s) have not yet turned in their forms.");

    	//lowest amount raised
    	double lowestRaised = allRaised[0];
    	int shamePerson = 0;
    	for (int i = 0; i < allNames.length; i++) {
        	if (allRaised[i] < lowestRaised) {
            	lowestRaised = allRaised[i];
                shamePerson = i;
                break;
        	}
        	
    	}
    	System.out.println();
    	System.out.println(allNames[shamePerson] + " has raised the lowest amount: $" + lowestRaised + ".");

    	//total amount raised by students who rasied more than $200
    	double overTwoHundred = 0;
    	for (int i = 0; i < allNames.length; i++) {
        	if (allRaised[i] > 200) {
            	overTwoHundred += allRaised[i];
        	}
    	}
    	System.out.println();
    	System.out.println("The total amount raised by students who have raised more than $200 is: $" + overTwoHundred + ".");

	}//end main

}//end class


