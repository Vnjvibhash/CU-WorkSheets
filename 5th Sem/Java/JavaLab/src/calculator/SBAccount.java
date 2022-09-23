package calculator;

import java.util.Scanner;

public class SBAccount implements Account {
	
	private double interestRate;
	private double amount;
	private int typeOfAcc;
	private double gainedInterest;
	
	public double getGainedInterest() {
		return gainedInterest;
	}

	public void setTypeOfAcc(int typeOfAcc) {
		this.typeOfAcc = typeOfAcc;
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

	/*public void calculateInterest(int typeOfAcc, int amount){
		double gainedInterest;
		if(typeOfAcc == 1){
			setInterestRate(4);
			gainedInterest = (amount * getInterestRate())/100;
			System.out.println("Interest Gained on Normal Account : "+gainedInterest);
			
		}
		else if(typeOfAcc == 2){
			setInterestRate(6);
			gainedInterest = (amount * getInterestRate())/100;
			System.out.println("Interest Gained on NRI Account : "+gainedInterest);
			
		}
		else System.out.println("Invalid Account type selection.");
		
	}
*/
	@Override
	public double calculateInterest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Average Amount in your account :");
		amount = sc.nextDouble();
		System.out.println("Enter 1 for Normal Account or Enter 2 for NRI Account.");
		typeOfAcc = sc.nextInt();
		
		if(amount <= 0)System.out.println("Please enter Valid Amount.");
		else{
		if(typeOfAcc == 1){
			setInterestRate(4);
			gainedInterest = (amount * getInterestRate())/100;
			System.out.println("Interest Gained on Normal Account : "+gainedInterest);
			
		}
		else if(typeOfAcc == 2){
			setInterestRate(6);
			gainedInterest = (amount * getInterestRate())/100;
			System.out.println("Interest Gained on NRI Account : "+gainedInterest);
			
		}
		else System.out.println("Invalid Account type selection.");
		
		}
		
		return getGainedInterest();
	    }

}
