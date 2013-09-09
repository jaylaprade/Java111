import java.util.Scanner;
public class CalorieBurner {
	
	public static final int RUNNING_METS = 10;
	public static final int BBALLING_METS = 8;
	public static final int SLEEPING_METS = 1;
	
		
	public static void main(String[] args)
	{
	
		double totalMets;
		
		
		System.out.println("\t Calorie Burner \n \n");
		System.out.println("Enter the weight you wish to calculate in pounds:");
		
		Scanner keyboard = new Scanner(System.in);
		double weightOfPerson = keyboard.nextDouble();
		
		System.out.println("\nEnter the number of hours spent running:");
		double hoursRunning = keyboard.nextDouble();
		
		System.out.println("\nEnter the number of hours spent playing basketball:");
		double hoursBBalling = keyboard.nextDouble();
		
		System.out.println("\nEnter the number of hours spent sleeping:");
		double hoursSleeping = keyboard.nextDouble();
		
		weightOfPerson = weightOfPerson/2.2; //Change weight to kilos
		
		totalMets = ((hoursRunning * RUNNING_METS) + (hoursBBalling * BBALLING_METS) + (hoursSleeping * SLEEPING_METS));
		
		double caloriesBurned = (0.0175 * totalMets * weightOfPerson) * 60;
		
		System.out.println("Based on the weight entered, " + caloriesBurned + " calories were burned");
		
		keyboard.close();
		
			
	}
		
}
