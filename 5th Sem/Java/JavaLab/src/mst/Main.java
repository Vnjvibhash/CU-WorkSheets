package mst;

import java.util.Scanner;

abstract class StationaryItem {    
    abstract String getName();
    abstract void doCheckOut();
    abstract void doReturn();
    abstract boolean borrowedItem();
    abstract int borrowCount();
}

class Operation extends StationaryItem{

    String itemName;
    boolean checkOut;
    int borrowed=0;
    
	public Operation(String itemName) {
		this.itemName=itemName;
	}

	@Override
	String getName()
    {
        return itemName;
    }
    
	@Override
	void doCheckOut()
    {
        checkOut = false;
        ++borrowed;
    }
    
	@Override
	void doReturn()
    {
        checkOut = true;
        --borrowed;
    }
    
	@Override
	boolean borrowedItem()
    {
        return checkOut;
    }

	@Override
	int borrowCount() {
		// TODO Auto-generated method stub
		return borrowed;
	}
}

class StationaryStore {
	Operation store[]= new Operation[20];
    static int a=0;
    void addbook(String name)
    {
        store[a] = new Operation(name);
        store[a].checkOut = false;
        System.out.println("Stationary Item " +name +" added sucessfully");
        a++;
    }
   
    void doCheckOut(String name)
    {
        for(int i=0; i<a;i++)
        {
            if(store[i].getName().equals(name))
            {
	            store[i].doCheckOut(); 
	            System.out.println("Stationary Item " +name +" checked out successfully from "+i +" location");   
            }else {
            	System.out.println("No such Stationary Item exists at:" +i+" location");
            }
        }
    }
    void doReturn(String name)
    {
        
        for(int i= 0; i<a;i++)
        {
            if(store[i].getName().equals(name))
            {
	            store[i].doReturn(); 
	            System.out.println("Stationary Item returned: " +name +" from location "+i);
            }else{
            	System.out.println("No such Stationary Item exists at locations:" +i);
            }
            
        }	
    }
    void  listStationary()
    {
        for(int i= 0; i<a;i++)
        {
            if(!store[i].borrowedItem())
            {
                System.out.print("Stationary Item (location "+i+ "): "+store[i].itemName+" checked out "+store[i].borrowCount()+" times\n");
            }
        }
    }
    public void exit() {
	   	System.exit(0);
	}
}
class Main {
    public static void main(String[] args) {
        
    	StationaryStore obj = new StationaryStore();
        int choice;
        String bookName;
        boolean status = true;
        while(status)
        {
	        System.out.println("MAIN MENU");
	        System.out.println("*********");
	        System.out.println("1.Add Stationary Item:");
	        System.out.println("2.Check Out Stationary Item:");
	        System.out.println("3.Return Stationary Item:");
	        System.out.println("4.List Stationary Item:");
	        System.out.println("5.Exit");
	        System.out.println("Enter your choice:");
	        Scanner sc = new Scanner(System.in);
	        choice = sc.nextInt();
	        switch(choice)
	        {
		        case 1:
		            {
		                System.out.println("Enter the name of the Stationary Item you want to add");
		                bookName = sc.next();
		                obj.addbook(bookName);
		                break;
		            }
		        case 2:
		        {
		            System.out.println("Enter the name of Stationary Item to checkout");
		            bookName = sc.next();
		            obj.doCheckOut(bookName);
		            break;
		        }
		        case 3:
		        {
		            System.out.println("Enter the Stationary Item name to return");
		            bookName = sc.next();
		            obj.doReturn(bookName);
		            break;
		        }
		        case 4:
		        {
		            obj.listStationary();
		            break;
		        }
		        case 6:
		        {System.out.println("Exiting...!! Thanks for using the application");
		        	obj.exit();
		        	break;
		        }
		        default:
		        {
		            System.out.println("Wrong input!!");
		        }
	        }
        }
    }
}

