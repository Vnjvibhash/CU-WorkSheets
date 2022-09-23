package calculator;

public interface Account {
	
	double interestRate = 0.0;
	double amount = 0.0;
	
	abstract double calculateInterest();

}
