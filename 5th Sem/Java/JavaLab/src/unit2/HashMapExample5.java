package unit2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample5 {
	static HashMap<Integer, String> hm = new HashMap<Integer, String>();
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hm.put(1, "Vivek");
		hm.put(2, "Abhi");
		hm.put(3, "Amar");
		hm.put(4, "Ravi");
		System.out.println("After Invoking put() method");
		for(Map.Entry<Integer, String> m: hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
		System.out.println("After Invoking replace() method");
		hm.replace(4, "Pavitra");
		for(Map.Entry<Integer, String> m: hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
		System.out.println("After Invoking replace() method with old and new Value");
		hm.replace(4, "Pavitra","Pratibha");
		for(Map.Entry<Integer, String> m: hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
		System.out.println("After Invoking replaceAll() method");
		hm.replaceAll((k,v)->"Ruh");
		for(Map.Entry<Integer, String> m: hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
	}
}
