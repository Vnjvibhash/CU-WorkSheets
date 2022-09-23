public class Book {
	
	static Patient[] patient = new Patient[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length != 10){
			System.out.println("Please Enter 10 inputs");
		}
		else{
		
		for( int i = 0; i < 10; i++){
			
			patient[i] = new Patient(args[i]);
			//System.out.println(patient[i]);
		}
		
		patient[0].setHeight(62);
		patient[0].setWeight(192);
		patient[1].setHeight(68);
		patient[1].setWeight(192);
		patient[2].setHeight(77);
		patient[2].setWeight(182);
		patient[3].setHeight(92);
		patient[3].setWeight(162);
		patient[4].setHeight(79);
		patient[4].setWeight(192);
		patient[5].setHeight(52);
		patient[5].setWeight(112);
		patient[6].setHeight(50);
		patient[6].setWeight(182);
		patient[7].setHeight(49);
		patient[7].setWeight(182);
		patient[8].setHeight(42);
		patient[8].setWeight(192);
		patient[9].setHeight(62);
		patient[9].setWeight(192);
		
		for( int i = 0; i < 10; i++){
			double bmi = patient[i].BMI(patient[i].getWeight(), patient[i].getHeight());
			//System.out.println(patient[i].getWeight() +" "+ patient[i].getHeight());
		 
			if(bmi > 25.0){
				System.out.println("Patients whose BMI is greater than 25 is : "+args[i]);
				System.out.println("Their BMI score is : "+bmi);
			}
		}
		
	}

	}

}
