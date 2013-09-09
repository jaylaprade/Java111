/*  Homework. 2       Part 1
 *  File Name: AvgOfNumbr.java
 *  @Author: Jason Laprade
 *  Date: September 9th, 2013
 *  
 *  Problem Statement: Read in three whole numbers and output the average of the three.
 *  
 *  Overall Plan
 *  1) Greet the user
 *  2) Ask for three numbers
 *  3) Get Average of the three numbers
 *  4) Display results to user
 *  
 *  Classes needed and purpose: 'java.util' will be needed for the general purpose i/o from terminal
 */

import java.util.Scanner;

public class AvgOfNumbers {
	

		public static void main(String[] args)
		{
			Scanner keyboard = new Scanner(System.in);
			
			// Display a title and describe function
			
			System.out.println("\t Average of Three integers \n \n");
			System.out.println("This program will give you the average ");
			System.out.println("of three whole numbers.");
			
			//Ask for the numbers
			
			System.out.println("Enter your first number:");
			int firstNumber = keyboard.nextInt();

			System.out.println("Enter your second number:");
			int secondNumber = keyboard.nextInt();

			System.out.println("Enter your third number:");
			int thirdNumber = keyboard.nextInt();
			
			//Calculate the Average
			int avgOfThree = (firstNumber + secondNumber + thirdNumber) / 3;
			
			//Display results to user
			System.out.println("The Average of your three numbers = "
												+ avgOfThree);
		}



}
