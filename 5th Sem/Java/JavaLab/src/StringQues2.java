public class StringQues2 {
	
	static String name1 = "Rohit";
	static String name2 = "Rohit";
	static String name3 = new String("Rohit");

	
	public static void main(String[] args) {
		
		if(name1 == name2)System.out.println("name1 == name2 is true");
		else System.out.println("name1 == name2 false");
		
		if(name1.equals(name2))System.out.println("name1 equals name2");
		else System.out.println("name1 equals name2 false");
		
		if(name1 == name3)System.out.println("name1 == name3 is true");
		else System.out.println("name1 == name3 false");
		
		if(name1.equals(name3))System.out.println("name1 equals name3");
		else System.out.println("name1 equals name3 false");
		

	}

}
