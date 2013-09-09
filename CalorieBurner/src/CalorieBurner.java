/*  Homework. 2       Part 2
 *  File Name: CalorieBurner.java
 *  @Author: Jason Laprade
 *  Date: September 9th, 2013
 *  
 *  Problem Statement: Measure the amount of energy burned in calories using METs and 
 *  the weight of the person
 *  
 *  Overall Plan
 *  1) Establish METs for the three activities
 *  2) Greet the user
 *  3) Ask for the weight in pounds.
 *  4) Get the number of hours used for each activity
 *  5) Convert the weight from pounds to kilos
 *  6) Calculate the calories burned based on the formula:
 *  	Calories/minute = 0.0.175 X MET X Weight in kilos
 *  7) Display calories
 *  
 *  Classes needed and purpose: 'java.util' will be needed for the general purpose i/o from terminal
 */


import java.util.Scanner;
public class CalorieBurner {
	
	// declare our constants for activities to METS
	
	public static final int RUNNING_METS = 10;
	public static final int BBALLING_METS = 8;
	public static final int SLEEPING_METS = 1;
	
		
	public static void main(String[] args)
	{
	
		// declare a double for the result of Total METS
		
		double totalMets;
		
		// Display a title and ask for input
		
		System.out.println("\t Calorie Burner \n \n");
		System.out.println("Enter the weight you wish to calculate in pounds:");
		
		// create an instance of the new Scanner Class from the user
		Scanner keyboard = new Scanner(System.in);
		
		// assign first number to the weight
		
		double weightOfPerson = keyboard.nextDouble();
		
		// Get METS for each of the activities
		
		System.out.println("\nEnter the number of hours spent running:");
		double hoursRunning = keyboard.nextDouble();
		
		System.out.println("\nEnter the number of hours spent playing basketball:");
		double hoursBBalling = keyboard.nextDouble();
		
		System.out.println("\nEnter the number of hours spent sleeping:");
		double hoursSleeping = keyboard.nextDouble();
		
		
		// Use the formula kilos = pounds/2.2
		weightOfPerson = weightOfPerson/2.2; //Change weight to kilos
		
		
		// Calculate the totalMets
		totalMets = ((hoursRunning * RUNNING_METS) + (hoursBBalling * BBALLING_METS) + (hoursSleeping * SLEEPING_METS));
		
		// Get the caloriesBurned
		double caloriesBurned = (0.0175 * totalMets * weightOfPerson) * 60;
		
		// Display the information to the user
		System.out.println("Based on the weight entered, " + caloriesBurned + " calories were burned");
		
		keyboard.close();
		
			
	}
		
}
