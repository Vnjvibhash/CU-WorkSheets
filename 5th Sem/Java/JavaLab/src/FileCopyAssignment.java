import java.io.*;
import java.util.*;

public class FileCopyAssignment {
	public static void main(String arg[]) throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.println("Provide source file name :");
		String sfile = in.next();
		System.out.println("Provide destination file name :");
		String dfile = in.next();
		FileReader fin = new FileReader("R:\\VnjVibhash\\Assignments\\CU-Assignments\\5th Sem\\Java\\JavaLab\\src\\"+sfile);
		FileWriter fout = new FileWriter("R:\\VnjVibhash\\Assignments\\CU-Assignments\\5th Sem\\Java\\JavaLab\\src\\"+dfile, true);
		int c;
		while ((c = fin.read()) != -1) {
			fout.write(c);
		}
		System.out.println("Copy finish...");
		fin.close();
		fout.close();
		in.close();
	}
}