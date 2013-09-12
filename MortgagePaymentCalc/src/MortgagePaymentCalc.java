import javax.swing.JOptionPane;

/*  Homework. 3       Part 1
 *  File Name: MortgagePaymentCalc.java
 *  @Author: Jason Laprade
 *  Date: September 12, 2013
 *  
 *  Problem Statement: Write a program that reads in the amount of a monthly mortgage payment 
 *  and the outstanding balance (i.e., the amount still owed) and then outputs the amount of the
 *  payment that goes to interest and the amount that goes to principal (i.e., the amount that goes 
 *  to reducing the debt). 
 *  
 *  Overall Plan
 *  1) Greet the user
 *  2) Get balance on loan amount
 *  3) multiply by interest amount to get annual interest
 *  4) output monthly interest
 *  5) Ask for the monthly payment amount
 *  6) Out the amount of the payment of principle
 *  
 *  Classes needed and purpose: 'javax.swing.JOptionPane' will be needed for the general purpose windows
 */

public class MortgagePaymentCalc {
	
	public static final double INTEREST_RATE = .0749;

    public static void main(String[] args)
    {
    	
    	JOptionPane.showMessageDialog(null,  "Welcome to the Mortgage Payment Calculator.");
    	
    	String balanceAmountTxt = JOptionPane.showInputDialog(null, "Please enter your remaining loan balance:");
    	double balanceAmount = Double.parseDouble(balanceAmountTxt);
    	
    	double monthlyInterest = ((balanceAmount * INTEREST_RATE)/12);
    	
    	JOptionPane.showMessageDialog(null, "Your current monthly interest is: " + monthlyInterest);
    	
    	String monthlyPaymentAmountTxt = JOptionPane.showInputDialog(null, "Please enter the amount of your monthly mortgage payment");
    	double monthlyPaymentAmount = Double.parseDouble(monthlyPaymentAmountTxt);
    	
    	double monthlyPrincipleAmount = (monthlyPaymentAmount - monthlyInterest);
    	
    	String txtOutput = ("Payment Amount: " + monthlyPaymentAmount + "\n");
    	txtOutput = txtOutput + ("Monthly Interest:" + monthlyInterest + "\n");
    	txtOutput = txtOutput + ("Principle Amount:" + monthlyPrincipleAmount + "\n");
    	  
    	JOptionPane.showMessageDialog(null, txtOutput);
    	
    	
    }

}
