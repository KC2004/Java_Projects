
/**
 * 
 * @author kushlani
 * This calculates and prints the Body mass index using the formula 
 * BMI = w/((h/100)*(h/100))
 * weight in kilograms, height in cm.
 *
 */
import java.util.Scanner;
/*
 * This class prompts for your weight in Kilograms and height in cm.
 * prints out the Body mass index (BMI) using formula 
 * BMI = w/(h/100)^2
 * BMI of 20 to 25 is considered healthy
 * 
 */
public class BodyMassIndex {
	public static void main(String arg[]){
		int w;
		int h;
		double BMI;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter weight in kilograms: ");
		w = scanner.nextInt();
		System.out.println("Enter height in cm: ");
		h = scanner.nextInt();
		scanner.close();
		BMI = w/(((double)h/100)*((double)h/100));
		System.out.println("The BMI = " + BMI);	
	}
}
/*
Enter weight in kilograms: 
60
Enter height in cm: 
156
The BMI = 24.654832347140037
*/
