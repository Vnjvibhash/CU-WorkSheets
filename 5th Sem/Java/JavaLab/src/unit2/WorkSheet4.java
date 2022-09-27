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
        System.out.println("mySet1: " + mySet1);

        List<Character> list = new ArrayList<Character>();
		list.add('A');
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('B');
		Set<Character> mySet2 = new HashSet<Character>(list);
        System.out.println("list: " + list);
        System.out.println("mySet2: " + mySet2);

        System.out.println("MySet1 matches mySet2: " + mySet1.equals(mySet2));
        
        mySet2.remove('A');
        System.out.println("mySet2: " + mySet2);
        System.out.println("MySet1 matches mySet2: " + mySet1.equals(mySet2));

        System.out.println("MySet1 contains all the elements: " + mySet1.containsAll(list));
        System.out.println("MySet2 contains all the elements: " + mySet2.containsAll(list));

        Iterator<Character> iterator = mySet1.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator loop: " + iterator.next());
        }

        for(Object str:mySet1) {
			System.out.println("For each loop "+str);
		}
        
        mySet1.clear();
        System.out.println("mySet1 is Empty: " + mySet1.isEmpty());

        System.out.println("mySet1 has: " + mySet1.size() + " Elements");
        System.out.println("mySet2 has: " + mySet2.size() + " Elements");

        Object[] array = mySet1.toArray(new String[mySet2.size()]);
        System.out.println("The array:" + Arrays.toString(array));
    }
}
