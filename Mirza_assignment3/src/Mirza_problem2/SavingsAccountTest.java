package Mirza_problem2;

public class SavingsAccountTest 
{
	private static double saver1;
	private static double saver2;

	public SavingsAccountTest(double s1, double s2)
	{
	    this.saver1 = s1;
	    this.saver2 = s2;
	}

	public static void main(String[] args)
	{
	    SavingsAccount cal = new SavingsAccount();
	    SavingsAccountTest data = new SavingsAccountTest(2000, 3000);

	    cal.modifyInterestRate(4.0);
	    cal.calculateMonthlyInterest(saver1);
	    cal.printMethod();
	    cal.modifyInterestRate(5.0);
	    cal.calculateMonthlyInterest(saver2);
	    cal.printMethod();
	}

}
