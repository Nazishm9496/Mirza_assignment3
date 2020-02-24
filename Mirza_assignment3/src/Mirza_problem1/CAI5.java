package Mirza_problem1;
public class CAI5 
{
	private int number1;
	  private int number2;
	  private int right;
	  private int wrong;
	  private double percentage;
	  private int counter = 0;
	  private int level;
	  private int zeros;
	  private int problemType;
	  private int randomMath;

	  public void readDifficulty()
	  {
	    System.out.print("Enter the difficulty level from 1-4: ");
	    Scanner data = new Scanner(System.in);
	    int userData = data.nextInt();
	    this.level = userData;
	  }

	  public void readProblemType()
	  {
	    System.out.println("Enter the problem type: ");
	    System.out.println("1. Addition Problems Only.");
	    System.out.println("2. Multiplication Problems Only.");
	    System.out.println("3. Subtraction Problems Only.");
	    System.out.println("4. Division Problems Only.");
	    System.out.println("5. Random mixture of all types.");
	    Scanner moreData = new Scanner(System.in);
	    int typeData = moreData.nextInt();
	    this.problemType = typeData;
	  }

	  public void generateQuestionArgument(int z)
	  {
	    SecureRandom rand = new SecureRandom();

	    int rand1 = rand.nextInt(z);
	    this.number1 = rand1;

	    int rand2 = rand.nextInt(z);
	    this.number2 = rand2;
	  }

	  public void quiz()
	  {
	    switch(this.level)
	    {
	      case 1:
	      {
	        this.zeros = 10;
	        break;
	      }
	      case 2:
	      {
	        this.zeros = 100;
	        break;
	      }
	      case 3:
	      {
	        this.zeros = 1000;
	        break;

	      }
	      case 4:
	      {
	        this.zeros = 10000;
	        break;
	      }
	    }
	    generateQuestionArgument(zeros);
	    askQuestion(number1, number2, problemType);
	  }
	  public void askQuestion(int r1, int r2, int pt)
	  {
	    switch(pt)
	    {
	      case 1:
	      {
	        System.out.print("How much is " + r1 + " plus " + r2 + "? ");
	        readResponse();
	        break;
	      }
	      case 2:
	      {
	        System.out.print("How much is " + r1 + " times " + r2 + "? ");
	        readResponse();
	        break;
	      }
	      case 3:
	      {
	        System.out.print("How much is " + r1 + " minus " + r2 + "? ");
	        readResponse();
	        break;
	      }
	      case 4:
	      {
	        System.out.print("How much is " + r1 + " divided by " + r2 + "? ");
	        readResponse();
	        break;
	      }
	      case 5:
	      {
	        SecureRandom moreMath = new SecureRandom();
	        this.randomMath = moreMath.nextInt(4);
	        generateQuestionArgument(this.zeros);
	        askQuestion(this.number1, this.number2, this.randomMath);
	      }
	    }
	  }

	  public void readResponse()
	  {
	    Scanner data = new Scanner(System.in);
	    int d = data.nextInt();
	    isAnswerCorrect(d, problemType);
	  }

	  public void isAnswerCorrect(int answer, int type)
	  {
	    this.counter++;
	    int correctAnswer = 0;
	    double divisionAnswer = 0.0;
	    switch(type)
	    {
	      case 1:
	      {
	        correctAnswer = this.number1 + this.number2;
	        if(correctAnswer == answer)
	        {
	          displayCorrectResponse();
	          this.right++;
	        }
	        else
	        {
	          displayIncorrectResponse();
	        }
	        break;
	      }
	      case 2:
	      {
	        correctAnswer = this.number1 * this.number2;
	        if(correctAnswer == answer)
	        {
	          displayCorrectResponse();
	          this.right++;
	        }
	        else
	        {
	          displayIncorrectResponse();
	        }
	        break;
	      }
	      case 3:
	      {
	        correctAnswer = this.number1 - this.number2;
	        if(correctAnswer == answer)
	        {
	          displayCorrectResponse();
	          this.right++;
	        }
	        else
	        {
	          displayIncorrectResponse();
	        }
	        break;
	      }
	      case 4:
	      {
	        divisionAnswer = this.number1 / this.number2;
	        if(divisionAnswer == answer)
	        {
	          displayCorrectResponse();
	          this.right++;
	        }
	        else
	        {
	          displayIncorrectResponse();
	        }
	        break;
	      }
	    }
	    while(counter < 10)
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
	    CAI5 math = new CAI5();
	    math.readDifficulty();
	    math.readProblemType();
	    math.quiz();
	    math.calculation();
	  }

}
