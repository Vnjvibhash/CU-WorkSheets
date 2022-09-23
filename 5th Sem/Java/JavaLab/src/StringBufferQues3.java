import java.util.Scanner;

public class StringBufferQues3 {
	
	
	public void StringFunctions(){
		
		System.out.println("---------------------String Functions------------------");
		System.out.println("");
		System.out.println("The length() method returns the length of the string.");
		System.out.println("char charAt(int index) Returns the character at the specified index.");
		System.out.println("int compareTo(Object o) Compares this String to another Object.");
		System.out.println("int compareTo(String anotherString) Compares two strings lexicographically.");
		System.out.println("String concat(String str) Concatenates the specified string to the end of this string.");
		
	}
	
	public void StringBufferFunctions(){
		
		System.out.println("---------------------String Buffer Functions------------------");
		System.out.println("");
		System.out.println("StringBuffer append(boolean b), This method appends the string representation of the boolean argument to the sequence");
		System.out.println("int capacity(), This method returns the current capacity.");
		System.out.println("char charAt(int index), This method returns the char value in this sequence at the specified index.");
		System.out.println("int codePointAt(int index), This method returns the character (Unicode code point) at the specified index");
		System.out.println("StringBuffer delete(int start, int end), This method removes the characters in a substring of this sequence.");
		
	}
	 
	

	
	public static void main(String[] args) {
		
		StringBufferQues3 sbq3 = new StringBufferQues3();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------Menu----------------");
		System.out.println("1. String Functions.");
		System.out.println("2. StringBuffer Functions.");
		System.out.println("Please Enter your input here :");
		
		int choice = Integer.parseInt(sc.next());
		
		if(choice == 1) sbq3.StringFunctions();
		else if(choice == 2) sbq3.StringBufferFunctions();
		else System.out.println("Invalid input, Please input 1 or 2 only.");

	}

}
