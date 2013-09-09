
import java.util.Scanner;

public class AvgOfNumbers {
	

		public static void main(String[] args)
		{
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("This program will give you the average ");
			System.out.println("of three numbers:");
			
			System.out.println("Enter your first number:");
			int firstNumber = keyboard.nextInt();

			System.out.println("Enter your second number:");
			int secondNumber = keyboard.nextInt();

			System.out.println("Enter your third number:");
			int thirdNumber = keyboard.nextInt();
			
			int avgOfThree = (firstNumber + secondNumber + thirdNumber) / 3;
			
			System.out.println("The Average of your three numbers = "
												+ avgOfThree);
		}



}
