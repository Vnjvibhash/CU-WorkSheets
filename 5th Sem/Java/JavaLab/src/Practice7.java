import java.util.HashMap;
import java.util.Scanner;
public class Practice7 {
	static HashMap<String, Integer> map = new HashMap<>();
	static Scanner in = new Scanner(System.in);
	static Integer itemCount;
	static String item;
	
	public static void main(String[] args) {		
		System.out.println("Enter the number of Card: ");
		itemCount = in.nextInt();
    	for(int i=1;i<=itemCount;i++) {
    		System.out.println("Enter the card: "+i);
    		String key = in.next();
    		Integer val = in.nextInt();
    		map.put(key,val);
    	}
    	
		System.out.println("Given List items are: "+map);
	}

}
