package calculator.p1;

import java.util.Scanner;

public class Simplecalci {
	public static void main(String[] args)
	{
		try 
		(
			Scanner sc = new Scanner(System.in)) {
			System.out.println("*****WELCOME TO TECHNO HACKS*****");
			System.out.println("*****WELCOME TO JAVA DEVELOPMENT INTERNSHIP*****");
			System.out.println("*****WELCOME TO SIMPLE CALCULATOR*****");
			System.out.println("\nEnter your choice: 1.Addition, 2.Subtraction, 3.Multiplication, 4.Divison");
			System.out.println("Enter the first number:");
			double a = sc.nextDouble();
			System.out.println("Enter the second number:");
			double b = sc.nextDouble();
			double res = 0;
			System.out.println("The choice is: ");
			int choice = sc.nextInt(); 
			switch(choice)
			{
			case 1:
				res = a+b;
				System.out.println("Addition is: " +res);
				break;
			case 2:
				res = a-b;
				System.out.println("Subtraction is: " +res);
				break;
			case 3:
				res = a*b;
				System.out.println("Multiplication is: " +res);
				break;
			case 4:
				res = a/b;
				System.out.println("Division is: " +res);
				break;
			default:
				System.out.println("Invalid Choice!.");
			}
		}		
		System.out.println("Thank you....");
	}
}
