import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class WordCounter {
	
	static TreeMap<String, Integer> tm = new TreeMap<String, Integer>();

	public static void main(String[] args) {
		
		File file = new File(args[0]);
		FileWriter f0 = null;
		try {
			f0 = new FileWriter(args[1]);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Scanner input;
		try {
			input = new Scanner(file);
			
			while(input.hasNext()) {
				
				String word = input.next();
				
				if(!tm.containsKey(word)){
					tm.put(word, 1);
					
				}else{
					tm.put(word, tm.get(word) + 1);
				}
				
				}
			
			

			String newLine = System.getProperty("line.separator");


			for (Entry<String, Integer> entry : tm.entrySet()) {
			    String key = entry.getKey();
			    Integer value = entry.getValue();
			    f0.write(key+" "+value+""+newLine);
			    
			}
			f0.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		

	}

}