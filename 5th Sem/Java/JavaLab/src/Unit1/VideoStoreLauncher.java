package Unit1;
import java.util.Scanner;

class Video {
    String videoName;
    boolean checkOut;
    int rating;
    
    String getName()
    {
        return videoName;
    }
    
    void doCheckOut()
    {
        checkOut = true;
    }
    
    void doReturn()
    {
        checkOut = false;
    }
    
    void receiveRating(int rating)
    {
        this.rating = rating;
    }

    int getRating()
    {
        return rating;
    }
    
    boolean getCheckOut()
    {
        return checkOut;
    }
    
    public Video(String videoName)
    {
        this.videoName = videoName;
    }
   
}

class VideoStore {
    Video store[]= new Video[20];
    static int a=0;
    void addVideo(String name)
    {
        store[a] = new Video(name);
        store[a].checkOut = false;
        store[a].receiveRating(0);
        System.out.println("video " +name +" added sucessfully");
        a++;
    }
   
    void doCheckOut(String name)
    {
        for(int i=0; i<a;i++)
        {
            if(store[i].getName().equals(name))
            {
            store[i].doCheckOut(); 
            System.out.println("Video " +name +" removed successfully from "+i +" location");   
            }else {
            	System.out.println("No such video exists at:" +i+" location");
            }
        }
    }
    void doReturn(String name)
    {
        
        for(int i= 0; i<a;i++)
        {
            if(store[i].getName().equals(name))
            {
	            store[i].doReturn(); 
	            System.out.println("Video returned: " +name +" from location "+i);
            }else{
            	System.out.println("No such video exists at locations:" +i);
            }
            
        }	
    }
    void receiveRating(String name, int rating)
    {
    	for(int i= 0; i<a;i++)
        {
            if(store[i].getName().equals(name))
            {
                store[i].receiveRating(rating); 
            }
        }
    	System.out.println("Ratings " +rating +" has been mapped to the video " +name);
    }
    void  listInventory()
    {
        for(int i= 0; i<a;i++)
        {
            if(!store[i].getCheckOut())
            {
                System.out.print("Videos (location "+i+ "): "+store[i].videoName+" Ratings (location "+i+ "): "+store[i].getRating()+"\n");
            }
        }
    }
    public void exit() {
	   	System.exit(0);
	}
}
class VideoStoreLauncher {
    public static void main(String[] args) {
        
        VideoStore obj = new VideoStore();
        int choice;
        String videoName;
        int rating;
        boolean status = true;
        while(status)
        {
	        System.out.println("MAIN MENU");
	        System.out.println("*********");
	        System.out.println("1.Add Videos:");
	        System.out.println("2.Check Out Videos:");
	        System.out.println("3.Return Videos:");
	        System.out.println("4.Receive Rating:");
	        System.out.println("5.List Inventory:");
	        System.out.println("6.Exit");
	        System.out.println("Enter your choice:");
	        Scanner sc = new Scanner(System.in);
	        choice = sc.nextInt();
	        switch(choice)
	        {
		        case 1:
		            {
		                System.out.println("Enter the name of the video you want to add");
		                videoName = sc.next();
		                obj.addVideo(videoName);
		                break;
		            }
		        case 2:
		        {
		            System.out.println("Enter the name of video to checkout");
		            videoName = sc.next();
		            obj.doCheckOut(videoName);
		            break;
		        }
		        case 3:
		        {
		            System.out.println("Enter the video name to return");
		            videoName = sc.next();
		            obj.doReturn(videoName);
		            break;
		        }
		        case 4:
		        {
		        	System.out.println("Enter the name of video you want to rate");
		             videoName = sc.next();
		            System.out.println("Enter the Ratings for this video");
		            rating = sc.nextInt();
		            obj.receiveRating(videoName, rating);
		            break;
		        }
		        case 5:
		        {
		            obj.listInventory();
		            break;
		        }
		        case 6:
		        {System.out.println("Exiting...!! Thanks for using the application");
		        	obj.exit();
		        	break;
		        }
		        default:
		        {
		            System.out.println("Wrong input!!");
		        }
	        }
        }
    }
}

