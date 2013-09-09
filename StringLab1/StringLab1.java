/*  Chapter No. 2       Lab No. 1
 *  File Name: StringLab1.java
 *  @Author: Jason Laprade
 *  Date: August 26, 2013
 *  
 *  Problem Statement: Learn about String Methods
 *  
 *  
 *  Classes needed and purpose: 'java.util' will be needed for the general purpose i/o from terminal
 */

public class StringLab1
{
    public static void main(String[] args)
    {
    
        String collegeName = "Mira Costa College";

        System.out.println("Our string is: " + collegeName);
    
        boolean isEqual = collegeName.equals("Mira Costa College");
        System.out.println("Mira Costa College for the equals value is:");
        System.out.println(isEqual);
        
        boolean isNotEqual = collegeName.equals("Mira");
        System.out.println("Mira for the equals value is:");
        System.out.println(isNotEqual);
        
        System.out.println("Our string in lowercase is: " + collegeName.toLowerCase());
        System.out.println("Our string in UpperCase is: " + collegeName.toUpperCase());
        
        
        String newCollegeName = "   Mira Costa College   ";
        System.out.println("Now our String will be: " + newCollegeName + "____Underscores not applicable");
        
        System.out.println("Using the trim method we see: " + newCollegeName.trim() + "____Underscores not applicable");
        
        System.out.println("The length of out first string is: " + collegeName.length());
        
        System.out.println("The sixth charecter is a: " + collegeName.charAt(6));
        
        System.out.println("The substring 7 method returns: " + collegeName.substring(7));
        
        System.out.println("The substring 7 and 12 returns: " + collegeName.substring(7,12));
        
        System.out.println("The IndexOf method set to College returns: " + collegeName.indexOf("College"));
        
        System.out.println("The CompareTo method set ot Costa returns: " + collegeName.compareTo("Costa"));


    }
}