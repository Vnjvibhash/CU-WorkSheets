import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;
public class TreeSetAssignment {
	static Scanner in = new Scanner(System.in);
	static TreeSet<String> tSet = new TreeSet<String>();
	void addItem(String item) {
		tSet.add(item);
	}
	void displayItem() {
		System.out.println("Original TreeSet:");
		for(String name:tSet)
			System.out.println(name);
	}
	void searchItem(String item) {
		if(tSet.contains(item)) {
			System.out.println("Yes TreeSet contains "+item);
		}else {
			System.out.println("No "+item+" not found in TreeSet");
		}
	}
	void reverse() {
		Iterator<String> iterator = tSet.descendingIterator();
		System.out.println("\nReversed TreeSet:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String args[]) {
		TreeSetAssignment obj = new TreeSetAssignment();
		boolean flag=true;
		String item;
        int choice;
		while(flag) {
	        System.out.println("\nMAIN MENU");
	        System.out.println("*************");
	        System.out.println("1.Insert Item in TreeSet:");
	        System.out.println("2.Search Item in TreeSet:");
	        System.out.println("3.Display Items of TreeSet:");
	        System.out.println("4.Reverse Items of TreeSet:");
	        System.out.println("5.Exit");
	        System.out.println("\nEnter your choice:");
	        choice = in.nextInt();
	        switch(choice)
	        {
		        case 1:
		        {
		        	System.out.println("Enter the item: ");
		        	item = in.next();
		        	obj.addItem(item);
		        	break;
		        }
		        case 2:
		        {
		        	System.out.println("Enter the item: ");
		        	item = in.next();
		        	obj.searchItem(item);
	                break;
		        }
		        case 3:
		        {
		        	obj.displayItem();
	                break;
		        }
		        case 4:
		        {
		        	System.out.println("\nElement of Reversed TreeSets are: ");
		        	obj.reverse();
	                break;
		        }
		        case 5:
		        {
		        	System.out.println("Exiting...!! Thanks for using the application");
		        	flag=false;
		        	break;
		        }
		        default:
		        {
		            System.out.println("Wrong input!!");
		        }
	        }
		}
		in.close();		
	}
}
