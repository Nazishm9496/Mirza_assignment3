package Mirza_problem1;

public class CAI4 
{
	private int number1;
	  private int number2;
	  private int right;
	  private int wrong;
	  private double percentage;
	  private int counter = 0;
	  private int level;
	  private int zeros;

	  public void readDifficulty()
	  {
	    System.out.print("Enter the difficulty level from 1-4: ");
	    Scanner data = new Scanner(System.in);
	    int userData = data.nextInt();
	    this.level = userData;
	  }

	  public void generateQuestionArgument(int z)
	  {
	    SecureRandom rand = new SecureRandom();

	    int rand1 = rand.nextInt(z);
	    this.number1 = rand1;

	    int rand2 = rand.nextInt(z);
	    this.number2 = rand2;

	    askQuestion(rand1, rand2);
	  }

	  public void quiz()
	  {
	    switch(this.level)
	    {
	      case 1:
	      {
	        this.zeros = 10;
	        generateQuestionArgument(zeros);
	        askQuestion(number1, number2);
	        break;
	      }
	      case 2:
	      {
	        this.zeros = 100;
	        generateQuestionArgument(zeros);
	        askQuestion(number1, number2);
	        break;
	      }
	      case 3:
	      {
	        this.zeros = 1000;
	        generateQuestionArgument(zeros);
	        askQuestion(number1, number2);
	        break;

	      }
	      case 4:
	      {
	        this.zeros = 10000;
	        generateQuestionArgument(zeros);
	        askQuestion(number1, number2);
	        break;
	      }
	    }
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
	    isAnswerCorrect(d);
	  }

	  public void isAnswerCorrect(int answer)
	  {
	    this.counter++;
	    int correctAnswer = this.number1 * this.number2;
	    if(correctAnswer == answer)
	    {
	      displayCorrectResponse();
	      this.right++;
	    }
	    else
	    {
	      displayIncorrectResponse();
	    }
	    while(this.counter < 5)
	    {
	      quiz();
	    }
	  }

	  public void calculation()
	  {
	    this.percentage = (this.right * 100) / 10;
	    displayCompletionMessage(this.percentage);
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

	  public void displayCompletionMessage(double p)
	  {
	    System.out.println("Your total score is " + p);

	    if (p > 75)
	    {
	      System.out.println("Congratulations! You are ready to go to the next level!");
	    }
	    else
	    {
	      System.out.println("Please ask your teacher for extra help.");
	    }
	    System.out.println("Would you like to do another problem set?");
	    System.out.print("Enter 1 for yes and 2 for no: ");

	    Scanner input = new Scanner(System.in);
	    int x = input.nextInt();

	    switch(x)
	    {
	      case 1:
	      {
	        this.right = 0;
	        this.counter = 0;
	        quiz();
	        calculation();
	        break;
	      }
	      case 2:
	      {
	        break;
	      }
	    }
	  }

	  public static void main(String[] args)
	  {
	    CAI4 math = new CAI4();
	    math.readDifficulty();
	    math.quiz();
	    math.calculation();
	  }

}
