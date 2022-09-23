package calculator;
import java.util.Scanner;

public class FDAccount implements Account {
	
	private double interestRate;
	private double amount;
	private int noOfDays;
	private int ageOfACHolder;
	
	
	
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

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public int getAgeOfACHolder() {
		return ageOfACHolder;
	}

	public void setAgeOfACHolder(int ageOfACHolder) {
		this.ageOfACHolder = ageOfACHolder;
	}

	
	public static boolean isBetween(int x, int lower, int upper) {
		  return lower <= x && x <= upper;
		}

		
	
	@Override
	public double calculateInterest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the FD amount: ");
		amount = sc.nextDouble();
		setAmount(amount);
		System.out.println("Enter the number of days: ");
		noOfDays = sc.nextInt();
		setNoOfDays(noOfDays);
		System.out.println("Enter your age: ");
		ageOfACHolder = sc.nextInt();
		setAgeOfACHolder(ageOfACHolder);
		
		if(amount <= 0.0){
			
			System.out.println("Invalid FD Amount");
			
		}
		
		
		
		else if(getAmount() <= 1000000){
			
			if (isBetween(getNoOfDays(), 7, 14)) {
				
				if(ageOfACHolder <= 0 || ageOfACHolder > 125)System.out.println("Invalid Age of Account holder");
				else if(ageOfACHolder <= 55){
					interestRate = 4.5;
					setInterestRate(interestRate);
					calculator(getAmount(), getInterestRate());
				}
				else{
					interestRate = 5.0;
					setInterestRate(interestRate);
					calculator(getAmount(), getInterestRate());
				}
				 
			}
				else if (isBetween(getNoOfDays(), 15, 29)) {
					  
					if(ageOfACHolder <= 0 || ageOfACHolder > 125)System.out.println("Invalid Age of Account holder");
					else if(ageOfACHolder <= 55){
						interestRate = 4.75;
						setInterestRate(interestRate);
						calculator(getAmount(), getInterestRate());
					}
					else{
						interestRate = 5.25;
						setInterestRate(interestRate);
						calculator(getAmount(), getInterestRate());
					}
			}
				else if (isBetween(getNoOfDays(), 30, 45)) {
					  
					if(ageOfACHolder <= 0 || ageOfACHolder > 125)System.out.println("Invalid Age of Account holder");
					else if(ageOfACHolder <= 55){
						interestRate = 5.5;
						setInterestRate(interestRate);
						calculator(getAmount(), getInterestRate());
					}
					else{
						interestRate = 6.0;
						setInterestRate(interestRate);
						calculator(getAmount(), getInterestRate());
					}
			}
				else if (isBetween(getNoOfDays(), 46, 60)) {
					  
					if(ageOfACHolder <= 0 || ageOfACHolder > 125)System.out.println("Invalid Age of Account holder");
					else if(ageOfACHolder <= 55){
						interestRate = 7.0;
						setInterestRate(interestRate);
						calculator(getAmount(), getInterestRate());
					}
					else{
						interestRate = 7.5;
						setInterestRate(interestRate);
						calculator(getAmount(), getInterestRate());
					}
			}
				else if (isBetween(getNoOfDays(), 61, 184)) {
					
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
				else if (isBetween(getNoOfDays(), 185, 365)) {
					
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
				
				else System.out.println("Please Provide Valid days.");
			
			
		}
				else{
					
					if (isBetween(getNoOfDays(), 7, 14)) {
						
							interestRate = 6.5;
							setInterestRate(interestRate);
							calculator(getAmount(), getInterestRate());
						 
					}
						else if (isBetween(getNoOfDays(), 15, 29)) {
							  
							
								interestRate = 6.75;
								setInterestRate(interestRate);
								calculator(getAmount(), getInterestRate());
					}
							
						
						else if (isBetween(getNoOfDays(), 30, 45)) {
							  
							
								interestRate = 6.75;
								setInterestRate(interestRate);
								calculator(getAmount(), getInterestRate());
					}
							
						
						else if (isBetween(getNoOfDays(), 46, 60)) {
							  
							
								interestRate = 8.0;
								setInterestRate(interestRate);
								calculator(getAmount(), getInterestRate());
							
				    }
						else if (isBetween(getNoOfDays(), 61, 184)) {
							
							
								interestRate = 8.5;
								setInterestRate(interestRate);
								calculator(getAmount(), getInterestRate());
							
					}
						else if (isBetween(getNoOfDays(), 185, 365)) {
							
							
								interestRate = 10.0;
								setInterestRate(interestRate);
								calculator(getAmount(), getInterestRate());
						}
						else System.out.println("Please Provide valid days.");
				}
		
		return 0.0;
							
		
	}
	
	void calculator(double amount, double interestRate){
		
		double gainedInterest = (amount * interestRate)/100;
		System.out.println("Interest Gained is : "+gainedInterest);
		
		
	}
	
	

}
