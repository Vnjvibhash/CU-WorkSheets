package unit2;

import java.util.*;

public class WorkSheet4 {

    public static void main(String args[]) {

    	Set<Character> mySet1 = new HashSet<Character>();
		mySet1.add('A');
		mySet1.add('B');
		mySet1.add('C');
		mySet1.add('A');
		mySet1.add('B');
        System.out.println("\nmySet1: " + mySet1);

        List<Character> list = new ArrayList<Character>();
		list.add('A');
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('B');
		Set<Character> mySet2 = new HashSet<Character>(list);
        System.out.println("\nlist: " + list);
        System.out.println("\nmySet2: " + mySet2);

        System.out.println("\nMySet1 matches mySet2: " + mySet1.equals(mySet2));
        
        mySet2.remove('A');
        System.out.println("\nmySet2: " + mySet2);
        System.out.println("\nMySet1 matches mySet2: " + mySet1.equals(mySet2));

        System.out.println("\nMySet1 contains all the elements: " + mySet1.containsAll(list));
        System.out.println("\nMySet2 contains all the elements: " + mySet2.containsAll(list));

        System.out.println("\nIterator Implementation");
        Iterator<Character> iterator = mySet1.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator loop: " + iterator.next());
        }
        System.out.println("\nFor loop Implementation");
        for(Object str:mySet1) {
			System.out.println("For each loop "+str);
		}
        
        mySet1.clear();
        System.out.println("\nmySet1 is Empty: " + mySet1.isEmpty());

        System.out.println("\nmySet1 has: " + mySet1.size() + " Elements");
        System.out.println("\nmySet2 has: " + mySet2.size() + " Elements");

        System.out.println("\nArray Conversion");
        Object[] array = mySet1.toArray(new String[mySet2.size()]);
        System.out.println("The array:" + Arrays.toString(array));
    }
}
