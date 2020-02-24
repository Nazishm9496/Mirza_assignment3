package Mirza_problem2;

public class SavingsAccount 
{
	private static double annualInterestRate;
	private static double savingsBalance;

	public void calculateMonthlyInterest(double savings)
	{
	    this.savingsBalance = savings;
	    double monthlyInterest = (this.savingsBalance * this.annualInterestRate) / 12;
	    this.savingsBalance += monthlyInterest;
	}
	
	public void modifyInterestRate(double newInterestRate)
	{
	    this.annualInterestRate = newInterestRate;
	}
	public void printMethod()
	{
	    System.out.println("Monthly Balance = " + this.savingsBalance);
	}

}
