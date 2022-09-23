public class Patient {
	
	public String name = "";
	public double height = 0.0;
	public double weight = 0.0;
	
	public Patient(String name){
		this.name = name;
		
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double BMI(double weight, double height){
		
		double bmi = (weight / (height * height)) * 703;
		return bmi;
		
	}

	

}
