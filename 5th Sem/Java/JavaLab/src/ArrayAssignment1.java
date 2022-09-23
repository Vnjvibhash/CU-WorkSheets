public class ArrayAssignment1 {

	/**
	 * @param args
	 */
	static int[][] numbers = new int[3][3];
	static int[] givenNumbers = new int[9];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 9){
			System.out.println("Please enter 9 integer numbers");
		}
		
		else{
		/*
		int i = 0;
		String givenvalue = args[i];
		for(int k = 0; k < 3; k++){
	    for(int j = 0; j<3; j++){
		//numbers[i] = Integer.parseInt(givenvalue);
	    	numbers
	    	*/
		for(int i = 0; i < 9; i++){
			String givenvalue = args[i];
	        
	        givenNumbers[i] = Integer.parseInt(givenvalue);
	        
		}
		
		System.out.println("The given array is : ");
		int k = 0;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j<3; j++){
				numbers[i][j] = Integer.parseInt(args[k++]);
				int m = numbers[i][j];
				System.out.print(m+"\t");
			}
		    System.out.println(" ");
		}
		
		
        
		int temp = numbers[0][0];
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j<3; j++){
			
			if(temp < numbers[i][j]){
				temp = numbers[i][j];
			}
			
			
		}
		}
		
		System.out.println("The biggest number in the given array is " +temp);
        
		
		}  

	}

	}
