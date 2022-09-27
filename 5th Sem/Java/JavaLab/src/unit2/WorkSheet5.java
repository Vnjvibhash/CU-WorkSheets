package unit2;

import java.util.Enumeration;
import java.util.Hashtable;

public class WorkSheet5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(1, "Vivek");
		ht.put(2, "Abhi");
		ht.put(3, "Amar");
		ht.put(4, "Punya");
		ht.put(5, "Vikash");
		ht.put(6, "Ruh");
	
		Enumeration<Integer> keys = ht.keys();
		Enumeration<String> values = ht.elements();
		 
		while(keys.hasMoreElements() && values.hasMoreElements()){
		    System.out.println("Key: "+keys.nextElement()+"\tValue: "+values.nextElement());
		}
		
	}

}
