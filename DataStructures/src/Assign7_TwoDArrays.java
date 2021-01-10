//100% - 2D array assignment marked as complete/incomplete
import java.util.Scanner;

public class Assign7_TwoDArrays {

	public static Scanner numscan = new Scanner(System.in);
	public static Scanner wordscan = new Scanner(System.in);

	public static void main(String[] args) {

    	int[][] grid = new int[3][3];

    	//[rows][columns]
    	//[  i  ][  j  ]
    	System.out.println("Welcome to Mini-Sudoku Tester!\nEnter numbers 1 through 9 one by one and they will appear from left to right going down.");

    	System.out.println("Row 1:");
    	for (int i = 0; i < grid.length; i++) {
        	grid[0][i] = numscan.nextInt();
    	}

    	System.out.println("Row 2:");
    	for (int i = 0; i < grid.length; i++) {
        	grid[1][i] = numscan.nextInt();
    	}

    	System.out.println("Row 3:");
    	for (int i = 0; i < grid.length; i++) {
        	grid[2][i] = numscan.nextInt();
    	}

    	int numTotal = 0;
    	for (int i = 0; i < grid.length; i++) {
        	System.out.println();
        	for (int j = 0; j < grid[i].length; j++) {
            	System.out.print(grid[i][j] + " ");
            	numTotal += grid[i][j];
        	}
    	}

    	System.out.println();
    	int foundSame = 0;
    	if (numTotal == 45) {
        	for (int i = 0; i < grid.length; i++) {
            	//check rows
            	for (int j = 1; j < grid[i].length; j++) {
                	if ((grid[i][0] == grid[i][j])) {
                    	foundSame = 1;
                    	break;
                	}
            	}
            	for (int k = 1; k < grid[i].length; k++) {
                	if ((grid[0][k] == grid[k][i])) {
                    	foundSame = 1;
                    	break;
                	}
            	}
        	}
    	} else if (numTotal != 45) {
        	System.out.println("This is not a valid grid.");
    	}

    	if ((numTotal == 45) && (foundSame == 0)) {
        	System.out.println("This is a valid grid.");
    	} else if ((numTotal == 45) && (foundSame == 1)) {
        	System.out.println("This is not a valid grid.");
    	}
	}//end main

}//end class




