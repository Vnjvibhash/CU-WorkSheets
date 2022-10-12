import java.util.Scanner;

class MyUnit {
	public boolean palindromeCheck(String str)
    {
        String rev = "";
        boolean ans = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
 
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
}

public class JUnitTest {
    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	MyUnit obj =  new MyUnit();
    	System.out.println("Enter the String: ");
		String str = in.next();
		if(obj.palindromeCheck(str)) {
	    	System.out.println(str+" is Palindrome");
		}else {
	    	System.out.println(str+" is not Palindrome");
	    }
		in.close();
    	
    }
}
