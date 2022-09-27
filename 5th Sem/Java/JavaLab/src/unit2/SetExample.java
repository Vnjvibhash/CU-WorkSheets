package unit2;

import java.util.*;

public class SetExample {
	public static void main(String args[]) {
		System.out.println("My Set 1: ");
		Set<Character> mySet1 = new HashSet<Character>();
		mySet1.add('A');
		mySet1.add('B');
		mySet1.add('C');
		mySet1.add('A');
		mySet1.add('B');
		System.out.println(mySet1);
		System.out.println("\nMy List: ");
		List<Character> list = new ArrayList<Character>();
		list.add('A');
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('B');
		System.out.println(list);
		System.out.println("\nMy Set 2: ");
		Set<Character> mySet2 = new HashSet<Character>(list);
		System.out.println(mySet2);
		
		System.out.println("\nRemove A from set 1: ");
		mySet1.remove('A');
		System.out.println(mySet1);
		
		System.out.println("\nWhile Iterator: ");
		Iterator<Character> iterator = mySet1.iterator();
		while(iterator.hasNext()) {
			System.out.println("Iterator Loop "+iterator.next());
		}
		
		System.out.println("\nFor Loop: ");
		for(Object str:mySet1) {
			System.out.println("For each loop "+str);
		}

		System.out.println("\nCompare Set1 & Set2 "+mySet1.equals(mySet2));
		
		System.out.println("\nSet2 contains all List "+mySet2.containsAll(list));
		
		System.out.println("\nClear My Set 1: ");
		mySet1.clear();
		System.out.println("mySet1 is Empty "+mySet1.isEmpty());
		
		System.out.println("\nConvert MySet1 to Array: ");
		Object[] myArray = mySet1.toArray(new String[mySet2.size()]);
		System.out.println("The array is "+Arrays.toString(myArray));
	}

}
