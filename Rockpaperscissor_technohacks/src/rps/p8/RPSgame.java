package rps.p8;

import java.util.Scanner;
import java.util.Random;

public class RPSgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        System.out.println("****************************************************");
        System.out.println("**************WELCOME TO TECHNOHACKS**************");
        System.out.println("**************WELCOME TO JAVA PROGRAMMING**************");
        System.out.println("**************WELCOME TO ROCK,PAPER,SCISSORS GAME**************");
        System.out.println();
        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("Enter your choice: ");
        System.out.println("1.Rock");
        System.out.println("2.Paper");
        System.out.println("3.Scissors");
        String userChoice = sc.nextLine();

        int computerChoice = random.nextInt(3); 

        System.out.println("Computer's choice: " + choices[computerChoice]);

        int userIndex = -1;

        for(int i = 0;i < choices.length; i++)
        {
            if(userChoice.equalsIgnoreCase(choices[i])) 
            {
                userIndex = i;
                break;
            }
        }

        if(userIndex != -1) 
        {
            if(userIndex == computerChoice) 
            {
                System.out.println("It's a tie!");
            } 
            else if((userIndex == 0 && computerChoice == 2) || (userIndex == 1 && computerChoice == 0) ||
                       (userIndex == 2 && computerChoice == 1)) 
            {
                System.out.println("You win!");
            }
            else
            {
                System.out.println("You lose!");
            }
        } 
        else 
        {
            System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
        }
        System.out.println("\nTHANKS FOR PLAYING!......");
    }
}
