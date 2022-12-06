package unit3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WorkSheet8 {
	
	public static String longestPalindrome(String str) {
		if (str == null || str.length() == 0) {
			return str;
		}
		Map<Character, Integer> freq = new HashMap<>();
		for (char ch: str.toCharArray()) {
			freq.put(ch, freq.getOrDefault(ch, 0) + 1);
		}
		String mid_char = "";
		StringBuilder left = new StringBuilder();
		for (var entry: freq.entrySet()){
			char ch = entry.getKey();
			int count = entry.getValue();
			if (count % 2 == 1) {
				mid_char = String.valueOf(ch);
			}
			left.append(String.valueOf(ch).repeat(count / 2));
		}
		StringBuilder right = new StringBuilder(left).reverse();
		return ("" + left + mid_char + right);
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("Enter your String: ");
			String str = in.next();
			System.out.println("The longest palindrome is " + longestPalindrome(str));
		}
	}

}
