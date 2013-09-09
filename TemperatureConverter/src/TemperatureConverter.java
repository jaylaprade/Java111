import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the Fahrenheit temperature you wish to convert:");
		int tempToConvert = keyboard.nextInt();
		
		
		System.out.printf( tempToConvert + " degrees Fahrenheit is %.1f degrees Celsius.", 5 * (tempToConvert - 32.0)/9.0);
		
		keyboard.close();
	}
}
