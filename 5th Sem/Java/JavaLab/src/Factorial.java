public class Factorial {

	/**
	 * @param args
	 * 
	 */
	
	static int temp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String givenvalue = args[0];
        
        int number = Integer.parseInt(givenvalue);
        
        if(number == 0){
        	System.out.println("The factorial of 0 is 1");
        }
        
        else if(givenvalue == ""){
        	System.out.println("Please enter an Integer number");
        }
        
        else{
        	
        	int temp = number - 1;
        	while(temp > 0){
        		number = number * temp;
        		temp--;
        	}
        	System.out.println(number);
        }

	}

}
