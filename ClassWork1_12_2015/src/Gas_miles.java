/* 
 * Calculates and prints miles per gallon for a car that can drive 350 miles on a 
 * 15 gallon tank of gas
 */
import java.util.Scanner;
class Gas_miles {
	public static void main(String args[]){
		int gallonsPerTank;
		int milesPerTank;
		double milesPerGallon;
		
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("How many gallons fit in the tank? ");
		gallonsPerTank = scanner.nextInt(); 
		scanner.nextLine(); // scan past newline character user typed in
		System.out.println("How many miles can you drive on one Tank? ");
		milesPerTank = scanner.nextInt();
		scanner.nextLine();
		scanner.close();

//		milesPerTank = 350;
		milesPerGallon = (double)milesPerTank/gallonsPerTank; // (double) casts milesPerTank to a double
		System.out.println("Miles per gallon = " + milesPerGallon);
	}
}
