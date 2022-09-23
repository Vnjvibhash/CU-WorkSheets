public class DogOwner{
	
	public boolean takeForWalk(Dog d){
		
		if(d.needsToGo()){
			return true;
			
		}
		
		return false;
		
	}

}