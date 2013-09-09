/*  Chapter No. 2       Lab No. 2
 *  File Name: CandyBar.java
 *  @Author: Jason Laprade
 *  Date: August 26, 2013
 *  
 *  Problem Statement: Learn about String Methods
 *  
 *  
 */

import java.util.Scanner;

public class CandyBar
{
    public static void main(String[] args)
    {
        
        
        int numCoupons = 0;
        int couponsToCandyBars = 10;
        int couponsToGumballs = 3;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter the number of tickets you have");
        
        numCoupons = keyboard.nextInt();
        
        System.out.println("You get " + numCoupons / couponsToCandyBars + " Candy Bars.");
        
        numCoupons = numCoupons % couponsToCandyBars;
        
        System.out.println("You get " + numCoupons / couponsToGumballs + " Gumballs.");
        
        System.out.println("You have " + numCoupons % couponsToGumballs + " tickets left over.");
        
        
        
    }
}
