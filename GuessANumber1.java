import java.util.Scanner;


public class GuessANumber1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		RandomNumber1 compNum = new RandomNumber1(1,10);
		compNum.GetANumber();
		
		int guess;
		
		System.out.println("Guess of a number between 1-10: ");
		guess= input.nextInt();
		
		if(compNum.computerNum1==guess)
		{
			System.out.println("Correct");
		}
		else if(compNum.computerNum1>guess)
		{
			System.out.println("Your guess is too low.");
		}
		else if(compNum.computerNum1<guess)
		{
			System.out.println("Your guess is too high.");
		}
		
		System.out.println("Please play again.");
		
	}

}


