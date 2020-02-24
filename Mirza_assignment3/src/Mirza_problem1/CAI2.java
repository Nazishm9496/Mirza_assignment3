package Mirza_problem1;
public class CAI2 
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
	    askQuestion(rand1, rand2);
	  }

	  public void askQuestion(int r1, int r2)
	  {
	    System.out.print("How much is " + r1 + " times " + r2 + "? ");
	    readResponse();
	  }

	  public void readResponse()
	  {
	    Scanner data = new Scanner(System.in);
	    int d = data.nextInt();
	    this.answer = d;
	    isAnswerCorrect(d);
	  }

	  public void isAnswerCorrect(int answer)
	  {
	    int correctAnswer = this.number1 * this.number2;

	    if(correctAnswer == answer)
	    {
	      displayCorrectResponse();
	    }
	    else
	    {
	      displayIncorrectResponse();
	      askQuestion(this.number1, this.number2);
	    }
	  }

	  public void displayCorrectResponse()
	  {
	    SecureRandom option1 = new SecureRandom();
	    int choose1 = option1.nextInt(5);
	    switch(choose1)
	    {
	      case 1:
	      {
	        System.out.println("Very Good!");
	        break;
	      }
	      case 2:
	      {
	        System.out.println("Excellent!");
	        break;
	      }
	      case 3:
	      {
	        System.out.println("Nice work!");
	        break;
	      }
	      case 4:
	      {
	        System.out.println("Keep up the good work!");
	        break;
	      }
	    }
	  }

	  public void displayIncorrectResponse()
	  {
	    SecureRandom option2 = new SecureRandom();
	    int choose2 = option2.nextInt(5);
	    switch(choose2)
	    {
	      case 1:
	      {
	        System.out.println("No, please try again.");
	        break;
	      }
	      case 2:
	      {
	        System.out.println("Wrong, try once more.");
	        break;
	      }
	      case 3:
	      {
	        System.out.println("Don't give up!");
	        break;
	      }
	      case 4:
	      {
	        System.out.println("No, keep trying.");
	        break;
	      }
	    }
	  }

	  public static void main(String[] args)
	  {
	    CAI2 math = new CAI2();
	    math.quiz();
	  }

}
