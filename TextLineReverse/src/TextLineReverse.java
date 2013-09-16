/*  Homework. 3       Part 2
 *  File Name: TextLineReverse.java
 *  @Author: Jason Laprade
 *  Date: September 16, 2013
 *  
 *  Problem Statement: Write a program that will read in a line of text as input and then output the
 *  line with the line with the first word moved to the end of the line.
 *  
 *  Overall Plan
 *  1) Greet user
 *  2) Get a line of text
 *  3) Reverse 
 *  4) Print it in reverse
 * 
 *  Classes needed and purpose: 'javax.swing.JOptionPane' will be needed for the general purpose windows
 */

import javax.swing.JOptionPane;

public class TextLineReverse 
{
	
	public static void main(String[] args)
	{

    	//Greet user
    	JOptionPane.showMessageDialog(null,  "Welcome to Text Line Reverse.");
    	
    	//Get remaining loan balance
    	String textToReorder = JOptionPane.showInputDialog(null, "Please enter your text to be ordered.");
    	
    	int indexOfSpace = textToReorder.indexOf(" ");
    	
    	String restOfString = textToReorder.substring(indexOfSpace + 1, textToReorder.length());
    	
    	JOptionPane.showMessageDialog(null,  restOfString + " " + textToReorder.substring(0, indexOfSpace));
		
		
	}
	
}
