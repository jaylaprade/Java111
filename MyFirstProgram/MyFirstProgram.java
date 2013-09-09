/*  Chapter No. 1       Homework No. 1
 *  File Name: MyFirstProgram.java
 *  @Author: Jason Laprade
 *  Date: August 26, 2013
 *  
 *  Problem Statement: Ask the user to enter three numbers, calculate the sum of
 *  these three numbers, calculate the product and the divide the sum by the product.
 *  
 *  Overall Plan
 *  1) Request three numbers and show the user numbers entered
 *  2) Calculate the Sum
 *  3) Calculate the Product
 *  4) Show the results
 *  5) Calculate the sum divided by the product
 *  6) Print the results
 *  
 *  Classes needed and purpose: 'java.util' will be needed for the general purpose i/o from terminal
 */

import java.util.Scanner;

public class MyFirstProgram
{
    public static void main(String[] args)
    {
        int n1, n2, n3; //store input
        
        int sum, product; //stores integer results
        
        double finalnumber; //stores the sum divided by the product in a double
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter your first whole number and hit enter.");
        
        n1 = keyboard.nextInt();
        
        System.out.println("The number entered is " + n1);
        
        System.out.println("Please enter your second whole number and hit enter.");
       
        n2 = keyboard.nextInt();
        
        System.out.println("The number entered is " + n2);
        
        System.out.println("Please enter your third whole number and hit enter.");
        
        n3 = keyboard.nextInt();
        
        System.out.println("The number entered is " + n3);
        
        
        sum = n1 + n2 + n3; // Sum of the three entered numbers
        
        product = n1 * n2 * n3; //Product of the three entered numbers
        
        System.out.println("The sum of the numbers entered is " + sum);
        
        System.out.println("The product of the numbers entered is " + product);
        
        finalnumber = sum/(double)product; //calculate the sum divided by the product
        
        System.out.printf("The sum divided by the product is %g.%n", finalnumber);
        
    }
}
