package unit2;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=n;i>=0;i--)
			System.out.println("Reversed Number: "+i);
	}
}