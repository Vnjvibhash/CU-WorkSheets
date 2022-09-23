public class VideoStore {
	
	static int count[] = new int[10];
	static double[] rating = new double[10];
	static String[] videos = new String[10];
	String[] check = new String[10];
	int counter1, counter2, counter3,counter4;
	
	public void addVideo(String title) throws NumberFormatException{
		try{
		if(title == "")System.out.println("Please Enter name of the Movie");
		else{
		videos[counter1++] = title;
		System.out.println("You have successfully added video : " +title);
	        }
        }
		catch(NumberFormatException nfe){
			
            System.out.println("Please Enter Name in String only");
            nfe.printStackTrace();
		}
		
	}
	public void checkOut(String title){
		
		for(String s : videos){
			counter3++;
			if(s.equalsIgnoreCase(title)){
				check[counter2++] = title;
				videos[counter3] = "";
				System.out.println("You have successfully checkouted video : " +title);		
			}
			
		}
	}
	
    public void returnVideo(String title){
    	
    	for(String s : check){
    		counter4++;
    		if(s.equalsIgnoreCase(title)){
    			videos[counter1++] = title;
    			check[counter4] = "";
    	System.out.println("You have successfully returned video : " +title);		
    		}
    	}
	}
    
    public static void recieveRating(String title, int rating2){
    	
    	for(int i = 0; i < videos.length; i++){
    		
    		if(videos[i] == title){
    	
    			rating[i] = ((rating[i] + rating2) / ++count[i]);
    	    
    	    System.out.println("Rating recieved of "+title+" is : " +rating[i]);
    		}
    	}
	}
    
    public void listInventory(){
    	System.out.println("The Inventory of Movies is : ");
		for(String s : videos){
			
			if ( s!= null && s != "")
			System.out.println(s);
    	
    }
    }

}
