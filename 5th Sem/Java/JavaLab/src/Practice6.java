import java.util.HashMap;
import java.util.Scanner;
public class Practice6 {
	static HashMap<String, Integer> obj = new HashMap<>();
	static Scanner in = new Scanner(System.in);
	static Integer itemCount;
	static String item;
	
	public static void main(String[] args) {		
		System.out.println("Enter the number item: ");
		itemCount = in.nextInt();
		System.out.println("Enter the items: ");
    	for(int i=0;i<itemCount;i++) {
    		String key = in.next();
    		Integer val = in.nextInt();
    		obj.put(key,val);
    	}
		System.out.println("Given List items are: "+obj);
	}

}