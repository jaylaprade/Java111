/*  Homework. 3       Part 3
 *  File Name: VendingMachine.java
 *  @Author: Jason Laprade
 *  Date: September 16, 2013
 *  
 *  Problem Statement: Write a program that determines the change to be dispensed from a vending machine.
 *  An item in the machine can cost between 25 cents and 1 dollar, in 5-cent increments and the machine only accepts
 *  a single dollar bill to pay for the item.
 *  
 *  Overall Plan
 *  1) Greet user
 *  2) Ask for the price of the item
 *  3) Calculate what is left over
 *  4) use mod to determine left over
 *  4) Display this to user
 * 
 *  Classes needed and purpose: 'javax.swing.JOptionPane' will be needed for the general purpose windows
 */

import javax.swing.JOptionPane;

public class VendingMachine {
	public static void main(String[] args)
	{
		
    	//Greet user
    	JOptionPane.showMessageDialog(null,  "Welcome to the Vending Machine.");
		
    	//Get cost of the item and convert it to a double
    	String costString = JOptionPane.showInputDialog(null, "Enter price of item\n (from 25 cents to a dollar, in 5- cent increments");
    	int costAsInt = Integer.parseInt(costString);
    	
    	//Determine how much change is left over
    	int changeInQuarters = ((100-costAsInt)/25);
    	int changeInDimes = ((100-costAsInt-(changeInQuarters*25))/10);
    	int changeInNickles = ((100-costAsInt-(changeInQuarters*25) - (changeInDimes*10))/5);
    	int changeInPennies = ((100-costAsInt-(changeInQuarters*25) - (changeInDimes*10))%5);
    	
    	//Display results to user
    	JOptionPane.showMessageDialog(null,  "You bought an item for " + costAsInt + " and gave me a dollar.\n" +
    			"So your change is:\n" +
    			changeInQuarters + " Quarters\n" +
    			changeInDimes + " Dimes\n" +
    			changeInNickles + " Nickels\n" +
    			changeInPennies + " Pennies");
    	

		
		
	}

}
