import java.util.Scanner;
/**
 * 
 * @author kushlani
 * This program asks what 14*16 is till the user gets it right.
 *
 */


public class MathQuestion {
	public static void main(String arg[]){
		Scanner scanner = new Scanner(System.in);
		int answer = 0;
		System.out.println("what is 14 * 16: ");
		answer = scanner.nextInt();
		while (answer != 264){
			System.out.println("sorry, try again: ");
			answer = scanner.nextInt();
		}
		System.out.print("you got it!");
	}
}
		
	



