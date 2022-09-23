//Write a Program to perform the basic operations like Insert, Delete, Display and Search in a List. List contains string object items where these operations are to be performed.
import java.util.*;
import java.util.Scanner;

public class Practice4 {
	public static List<String> list=new ArrayList<String>();
	void addItem(String item) {
		list.add(item);
	}
	void displayItem() {
		if(list.size()>0) {
			for(String name:list)
				System.out.println(name);
		}else
			System.out.println("List is Empty");
	}
	void searchItem(String item) {
		if(list.size()>0) {
			if(list.contains(item))
				System.out.println(item+" is Present");
			else
				System.out.println(item+" is not Present");
		}else
			System.out.println("List is Empty");
	}
	void deleteItem(String item) {
		if(list.size()>0) {
			if(list.contains(item)) {
				list.remove(item);
				System.out.println(item+" is removed");
			}else
				System.out.println(item+" is not Present");
		}else
			System.out.println("List is Empty");
	}
	
	public static void main(String[] args) {
		Practice4 obj = new Practice4();
		boolean flag=true;
		String item;
        int choice;
		Scanner in = new Scanner(System.in);
		while(flag) {
	        System.out.println("  MAIN MENU");
	        System.out.println("*************");
	        System.out.println("1.Add Item in List:");
	        System.out.println("2.Search item in List:");
	        System.out.println("3.Delete Item from List:");
	        System.out.println("4.Display Items:");
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
		        	System.out.println("Enter the item: ");
		        	item = in.next();
		        	obj.deleteItem(item);
	                break;
		        }
		        case 4:
		        {
		        	System.out.println("\nElement of Lists are: ");
		        	obj.displayItem();
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
