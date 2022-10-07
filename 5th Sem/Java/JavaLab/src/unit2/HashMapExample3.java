package unit2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample3 {
	static HashMap<Integer, String> hm = new HashMap<Integer, String>();
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hm.put(1, "Vivek");
		hm.put(2, "Abhi");
		hm.put(3, "Amar");
		System.out.println("After Invoking put() method");
		for(Map.Entry<Integer, String> m: hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
		System.out.println("After Invoking putIfAbsent() method");
		hm.putIfAbsent(4,"Ruh");
		for(Map.Entry<Integer, String> m: hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
		HashMap<Integer, String> newMap = new HashMap<Integer, String>();
		newMap.put(5, "Ravi");
		newMap.putAll(hm);
		System.out.println("After Invoking putAll() method");
		for(Map.Entry<Integer, String> nm: newMap.entrySet())
			System.out.println(nm.getKey()+" "+nm.getValue());
		
		
	}
}
