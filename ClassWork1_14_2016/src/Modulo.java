/**
 * 
 * @author kushlani
 * How to give 98 cents in change
 *
 */
import java.util.Scanner;
public class Modulo {
	public static void main(String arg[]){
		int ChangeToGive;
		ChangeToGive = 98;
		int quarters,dimes,nickels,pennies;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much to give out in change? ");
		scanner.close();
		ChangeToGive = scanner.nextInt();
		quarters = ChangeToGive/25;
		ChangeToGive %= 25;
		dimes = ChangeToGive/10;
		ChangeToGive %= 10;
		nickels = ChangeToGive/5;
		pennies = ChangeToGive%5;
		
		System.out.println("quaters: "+ quarters + " dimes = " + dimes);
		System.out.println("nickels: "+ nickels + " pennies = " + pennies);
	}
}
