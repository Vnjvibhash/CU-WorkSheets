package calculator;
import java.util.Scanner;

public class RDAccount implements Account{
	
	private double interestRate;
	private double amount;
	private double monthlyAmount;
	private int ageOfACHolder;
	private int givenMonth;
	
	
	
	public int getGivenMonth() {
		return givenMonth;
	}



	public void setGivenMonth(int givenMonth) {
		this.givenMonth = givenMonth;
	}



	public int getAgeOfACHolder() {
		return ageOfACHolder;
	}



	public void setAgeOfACHolder(int ageOfACHolder) {
		this.ageOfACHolder = ageOfACHolder;
	}



	public double getInterestRate() {
		return interestRate;
	}



	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	public double getMonthlyAmount() {
		return monthlyAmount;
	}



	public void setMonthlyAmount(double monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}
	

	public double calculateInterest(){
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the RD amount: ");
		amount = sc.nextDouble();
		setAmount(amount);
		System.out.println("Enter the number of months: Either 6 or 9 or 12 or 15 or 18 or 21");
		givenMonth = sc.nextInt();
		setGivenMonth(givenMonth);
		System.out.println("Enter your age: ");
		ageOfACHolder = sc.nextInt();
		setAgeOfACHolder(ageOfACHolder);
		
		if(amount <= 0.0){
			
			System.out.println("Invalid RD Amount");
			
		}
		
		
		
		else{
			
			if (getGivenMonth() == 6) {
				
				if(ageOfACHolder <= 0 || ageOfACHolder > 125)System.out.println("Invalid Age of Account holder");
				else if(ageOfACHolder <= 55){
					interestRate = 7.5;
					setInterestRate(interestRate);
					calculator(getAmount(), getInterestRate());
				}
				else{
					interestRate = 8.0;
					setInterestRate(interestRate);
					calculator(getAmount(), getInterestRate());
				}
				 
			}
				else if (getGivenMonth() == 9) {
					  
					if(ageOfACHolder <= 0 || ageOfACHolder > 125)System.out.println("Invalid Age of Account holder");
					else if(ageOfACHolder <= 55){
						interestRate = 7.75;
						setInterestRate(interestRate);
						calculator(getAmount(), getInterestRate());
					}
					else{
						interestRate = 8.25;
						setInterestRate(interestRate);
						calculator(getAmount(), getInterestRate());
					}
			}
				else if (getGivenMonth() == 12) {
					  
					if(ageOfACHolder <= 0 || ageOfACHolder > 125)System.out.println("Invalid Age of Account holder");
					else if(ageOfACHolder <= 55){
						interestRate = 8.0;
						setInterestRate(interestRate);
						calculator(getAmount(), getInterestRate());
					}
					else{
						interestRate = 8.5;
						setInterestRate(interestRate);
						calculator(getAmount(), getInterestRate());
					}
			}
				else if (getGivenMonth() == 15) {
					  
					if(ageOfACHolder <= 0 || ageOfACHolder > 125)System.out.println("Invalid Age of Account holder");
					else if(ageOfACHolder <= 55){
						interestRate = 8.25;
						setInterestRate(interestRate);
						calculator(getAmount(), getInterestRate());
					}
					else{
						interestRate = 8.75;
						setInterestRate(interestRate);
						calculator(getAmount(), getInterestRate());
					}
			}
				else if (getGivenMonth() == 18) {
					
					if(ageOfACHolder <= 0 || ageOfACHolder > 125)System.out.println("Invalid Age of Account holder");
					else if(ageOfACHolder <= 55){
						interestRate = 8.5;
						setInterestRate(interestRate);
						calculator(getAmount(), getInterestRate());
					}
					else{
						interestRate = 9.0;
						setInterestRate(interestRate);
						calculator(getAmount(), getInterestRate());
					}  
			}
				else if (getGivenMonth() == 21) {
					
					if(ageOfACHolder <= 0 || ageOfACHolder > 125)System.out.println("Invalid Age of Account holder");
					else if(ageOfACHolder <= 55){
						interestRate = 8.75;
						setInterestRate(interestRate);
						calculator(getAmount(), getInterestRate());
					}
					else{
						interestRate = 9.25;
						setInterestRate(interestRate);
						calculator(getAmount(), getInterestRate());
					    }	  
			        }
				
				else System.out.println("Please Provide Valid Months.");
			
			
		}
		
		
		return 0.0;
		
	}
	
      void calculator(double amount, double interestRate){
    	  
		  double gainedInterest = (amount * interestRate)/100;
		  System.out.println("Interest Gained is : "+gainedInterest);
		
		
	}

}

