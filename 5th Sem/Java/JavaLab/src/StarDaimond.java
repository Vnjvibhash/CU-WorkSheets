//Print Diamond
import java.util.Scanner;

public class StarDaimond {

	public static void main(String args[]) {
	    Scanner in = new Scanner(System.in);
	    int i, j, row, space;
		System.out.println("Enter the No. of row: ");
	    row = in.nextInt();
	    space = row - 1;
	    for (j = 1; j <= row; j++) {
	    	for (i = 1; i <= space; i++) {
	    		System.out.print(" ");
	    	}
	    	space--;
	    	for (i = 1; i <= 2 * j - 1; i++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	    space = 1;
	    for (j = 1; j <= row - 1; j++) {
	    	for (i = 1; i <= space; i++) {
	    		System.out.print(" ");
	    	}
	    	space++;
	    	for (i = 1; i <= 2 * (row - j) - 1; i++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	}
}
