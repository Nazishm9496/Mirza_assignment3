package Mirza_problem1;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 
{
	private static int number1;
	private static int number2;
	private static int answer;

	public void quiz()
	{
		SecureRandom rand = new SecureRandom();

	    int rand1 = rand.nextInt(10);
	    this.number1 = rand1;
	    int rand2 = rand.nextInt(10);
	    this.number2 = rand2;
	 }

	public void askQuestion(int r1, int r2)
	{
	    System.out.print("How much is " + r1 + " times " + r2 + "? ");
	}

	public void readResponse()
	{
	    Scanner data = new Scanner(System.in);
	    int d = data.nextInt();
	    this.answer = d;
	}
	
	public void isAnswerCorrect(int a)
	{
	    int correctAnswer = this.number1 * this.number2;

	    if(correctAnswer == a)
	    {
	      displayCorrectResponse();
	    }
	    else
	    {
	      displayIncorrectResponse();
	      askQuestion(number1, number2);
	      readResponse();
	      isAnswerCorrect(answer);
	    }
	}

	public void displayCorrectResponse()
	{
	    System.out.println("Very Good!");
	}

	public void displayIncorrectResponse()
	{
	    System.out.println("No, please try again.");
	}
	
	public static void main(String [] args)
	{
	    CAI1 math = new CAI1();
	    math.quiz();
	    math.askQuestion(number1, number2);
	    math.readResponse();
	    math.isAnswerCorrect(answer);
	}

}
