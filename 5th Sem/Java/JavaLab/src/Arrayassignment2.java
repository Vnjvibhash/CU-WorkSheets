public class Arrayassignment2 {

	/**
	 * @param args
	 */
	static int[][] numbers = new int[3][3];
	static int[] givenNumbers = new int[4];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 4){
			System.out.println("Please enter 4 integer numbers");
			
		}
		else{
		
		for(int i = 0; i < 4; i++){
			String givenvalue = args[i];
	        System.out.println(givenvalue);
	        givenNumbers[i] = Integer.parseInt(givenvalue);
	        
		}
		
		
		System.out.println("The given array is : ");
		int k = 0;
		for(int i = 0; i < 2; i++){
			for(int j = 0; j<2; j++){
				numbers[i][j] = Integer.parseInt(args[k++]);
				int m  = numbers[i][j];
				System.out.print(m+"\t");
			}
			
		    System.out.println(" ");
		}
		
		System.out.println("The reverse array is : ");
		
		for(int i = 1; i >= 0; i--){
			for(int j = 1; j>=0; j--){
				int n = numbers[i][j];
				System.out.print(n+"\t");
			}
		    System.out.println(" ");

	}
		}
	}
}
