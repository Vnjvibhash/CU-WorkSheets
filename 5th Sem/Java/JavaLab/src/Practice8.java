import java.util.*;
public class Practice8{
	static Scanner in = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("Enter your String: ");
		String str = in.next();
		if(isPalindrome(str.toLowerCase()))
			System.out.println("Given String "+str+" is a Palindrome");
		else
			System.out.println("Given String "+str+" is not a Palindrome");
	}
	public static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		String reverse="";
		int length = str.length();
		for(int i=length-1;i>=0;i--) {
			reverse = reverse + str.charAt(i);
		}
		if(str.equals(reverse))
			return true;
		else
			return false;
	}
}