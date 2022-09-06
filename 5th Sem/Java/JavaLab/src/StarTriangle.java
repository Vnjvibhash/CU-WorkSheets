//Print the Triangle
import java.util.Scanner;

public class StarTriangle {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i, j, row;
		System.out.println("Enter the No. of row: ");
		row = in.nextInt();
		for (i=0; i<row; i++)   
		{      
			for (j=row-i; j>1; j--)   
			{ 
				System.out.print(" ");   
			}   
			for (j=0; j<=i; j++ )   
			{    
				System.out.print("* ");   
			}  
			System.out.println();   
		}
	}
}
