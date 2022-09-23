public class Dog {

	/**
	 * @param args
	 */
	
	int drinkTime = 6;

	/**
	 * @return the drinkingTime
	 */
	public int getDrinkTime() {
		return drinkTime;
	}

	/**
	 * @param drinkingTime the drinkingTime to set
	 */
	public void setDrinkTime(int drinkTime) {
		this.drinkTime = drinkTime;
	}
	
	public boolean needsToGo(){
		
		//Dog has 4 hr without drinking, need to go outside now
		if(drinkTime > 4){
			return true;
		}
		
		return false;
		
	}

}
