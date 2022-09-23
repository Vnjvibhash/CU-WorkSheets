import java.util.Random;
import java.util.Scanner;

public class RandomHelper {

	//Method for generating integers
	public static int randint(int min, int max){
		
	
		Random rand = new Random();
		 int randomNum = rand.nextInt((max - min) + 1) + min;
         System.out.println(randomNum);
		 return randomNum;
		
	
		
	}
	//Method for generating doubles
	public static double randdouble(double min, double max){
		
		
		Random rand = new Random();
		double randomValue = min + (max - min) * rand.nextDouble();
         System.out.println(randomValue);
		 return randomValue;
		
	
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("If you want to generate integer random numbers TYPE 1, else TYPE 2 for double random number");
		int choice = sc.nextInt();
		
		if(choice == 1){
			System.out.println("Please Enter the range of integers, eg (5 15) : for number between 5 to 15");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
		    randint(num1, num2);
		
		}else{
			
			System.out.println("Please Enter the range of Doubles, eg (5.0 15.6) : for number between 5.0 to 15.6");
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
		    randdouble(num1, num2);
		
		}
	}

}