package unit2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample4 {
	static HashMap<Integer, String> hm = new HashMap<Integer, String>();
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hm.put(1, "Vivek");
		hm.put(2, "Abhi");
		hm.put(3, "Amar");
		hm.put(4, "Ravi");
		hm.put(5, "Pavitra");
		hm.put(6, "Ruh");
		System.out.println("After Invoking put() method");
		for(Map.Entry<Integer, String> m: hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
		System.out.println("After Invoking remove() with key method");
		hm.remove(4);
		for(Map.Entry<Integer, String> m: hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
		System.out.println("After Invoking remove() with Value method");
		hm.remove("Pavitra");
		for(Map.Entry<Integer, String> m: hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
		System.out.println("After Invoking remove() with key-value pairs method");
		hm.remove(6, "Ruh");
		for(Map.Entry<Integer, String> m: hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
	}
}
