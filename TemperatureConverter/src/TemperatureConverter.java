/*  Homework. 2       Part 3
 *  File Name: TemperatureConverter.java
 *  @Author: Jason Laprade
 *  Date: September 9th, 2013
 *  
 *  Problem Statement: Write a program that converts degrees Fahrenheit to Celsius using the formula
 *  
 *  degreesC= 5(degreesF - 32)/9
 *  
 *  Overall Plan
 *  1) Greet the user
 *  2) Get the temperature in Fahrenheit
 *  3) Calculate out using the formal
 *  4) Display results
 
 *  Classes needed and purpose: 'java.util' will be needed for the general purpose i/o from terminal
 */
import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);

		// Display a title and ask for the temperature
		System.out.println("\t Temperature Converter \n \n");
		System.out.println("Please enter the Fahrenheit temperature you wish to convert:");
		int tempToConvert = keyboard.nextInt();
		
		//Display the conversion and finish
		System.out.printf( tempToConvert + " degrees Fahrenheit is %.1f degrees Celsius.", 5 * (tempToConvert - 32.0)/9.0);
		
		keyboard.close();
	}
}
