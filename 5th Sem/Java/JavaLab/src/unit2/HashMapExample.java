package unit2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {
	static HashMap<Integer, String> hm = new HashMap<Integer, String>();
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hm.put(1, "Vivek");
		hm.put(2, "Abhi");
		hm.put(3, "Amar");
		hm.put(4, "Punya");
		hm.put(5, "Vikash");
		hm.put(6, "Ruh");
		
		for(Map.Entry<Integer, String> m: hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
	}

}
