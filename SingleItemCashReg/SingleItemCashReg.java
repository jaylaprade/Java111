/*  Lab Assignment 9/9/13
 *  File Name: SingleItemCashReg.java
 *  @Author: Jason Laprade, Jasmine Alexander
 *  Date: September 9, 2013
 *  
 *  Problem Statement: Create a single item cash register.  Use the scanner class to get a 
 *  product name (next()) and then the cost of the item and the quantity.  Use the printf method to output 
 *  a receipt such as in the example.
 *  
 *  Overall Plan
 *  1) Print the program title
 *  2) Get product name
 *  3) Get the cost of the item
 *  4) Get the quantity of the item
 *  5) Calculate the total cost
 *  6) Print the results
 *  
 *  Classes needed and purpose: 'java.util' will be needed for the general purpose i/o from terminal
 */

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import java.text.DecimalFormat;


public class SingleItemCashReg {
	
	// Tax Rate is constant
	public static final double TAX_RATE = .075;

    public static void main(String[] args)
    {
    	
    	// prepare the keyboard object 
    	Scanner keyboard = new Scanner(System.in);
    	
    	NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
    	
    	DecimalFormat formatter = new DecimalFormat("#0.00#%");
    	    	
    	//Greet user
    	System.out.println("Welcome to the Single item cash register");
    	
    	//Get item name
    	System.out.println("Please enter your item name");
    	String productName = keyboard.next();
    	
    	//Get the cost of the item
    	System.out.println("Please enter the cost of your item");
    	double itemCost = keyboard.nextDouble();
    	
    	//Get the quantity
    	System.out.println("Please enter the quantity");
    	int quantityOf = keyboard.nextInt();
    	
    	System.out.println("Please enter the amount of saving for your coupon");
    	double couponCost = keyboard.nextDouble();
 	
    	
    	//Print Receipt
    	System.out.println("\t\t\t Kevin's Store");
    	System.out.println("------------------------------------------------------------------------------");
    	System.out.println("Quantity \t\t\t Item \t\t\t\t Cost");
    	System.out.printf("%d", quantityOf);
    	System.out.printf("\t\t\t\t " + productName + "\t\t\t %s%n", moneyFormatter.format(itemCost));
    	System.out.printf("1" + "\t\t\t\t  Coupon \t\t\t (" + couponCost + ")/n");
    	System.out.printf("\t\t\t\t\t\t Subtotal:\t %s%n ", moneyFormatter.format((quantityOf * itemCost) - couponCost));
    	System.out.printf("\t\t\t\t\t\t Tax:\t\t %s%n ", moneyFormatter.format((quantityOf * itemCost)* TAX_RATE));
    	System.out.printf("\t\t\t\t\t\t Total:\t\t %s%n", moneyFormatter.format(((quantityOf * itemCost) - couponCost) + ((quantityOf * itemCost)* TAX_RATE)));
    	// Show savings
    	
    	System.out.printf("Savings: ");
    	double savingsAmount = (couponCost/(((quantityOf * itemCost) - couponCost) + (((quantityOf * itemCost)* TAX_RATE))));
    	System.out.print(formatter.format(savingsAmount));
    	
    	
    	//Close keyboard object
    	keyboard.close();
    	
    	//done
    	    	
    }

}
