package numberguessing_technohacks.p6;
import java.util.Scanner;
import java.util.Random;

public class Numguess {

    public static void main(String[] args)
    {
        try
        (
        	Scanner sc = new Scanner(System.in)) {
			Random random = new Random();
			
			int secretNumber = random.nextInt(100) + 1; 
			System.out.println("***********WELCOME TO TECHNOHACKS***********");
	    	System.out.println("***********WELCOME TO JAVA PROGRAMMING***********");
	    	System.out.println("***********WELCOME TO NUMBER GUESSING GAME!!!...***********");
	    	System.out.println();
			System.out.println("Try to guess the secret number between 1 and 100.\n");

			int userGuess = 0;
			int attempts = 0;

			while(userGuess != secretNumber) 
			{
			    System.out.print("Enter your guess: ");
			    userGuess = sc.nextInt();
			    attempts++;

			    if(userGuess == secretNumber)
			    {
			        System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
			    } 
			    else if(userGuess < secretNumber) 
			    {
			        System.out.println("Try a higher number.\n");
			    }
			    else 
			    {
			        System.out.println("Try a lower number.\n");
			    }
			}
		}
        System.out.println();
        System.out.println("Thanks for playing!.........");
    }
}
