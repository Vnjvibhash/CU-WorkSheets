import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Practice5 {
	static List obj = new ArrayList<String>();
	static List obj1 = new ArrayList<String>();
	static Scanner in = new Scanner(System.in);
	static Integer itemCount;
	static String item;
	
	public static void main(String[] args) {		
		System.out.println("Enter the number item: ");
		itemCount = in.nextInt();
		System.out.println("Enter the items: ");
    	for(int i=0;i<itemCount;i++)
    		obj.add(in.next());
    	
		System.out.println("Given List items are: ");
		for(int i=0;i<obj.size();i++)
			System.out.println(obj.get(i));
		
	}

}
