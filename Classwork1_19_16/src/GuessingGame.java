/**
 * 
 * @author kushlani
 *One object of this class represents a guessing game 
 */
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static void play(){
		/**
		 * plays one round, allowing the user to guess until she gets it right
		 */
		Random randomObject = new Random();
		int target;
		target = randomObject.nextInt(10)+1;
		System.out.println("our target is " + target);
		System.out.println("One game played");
		int answer = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Guess anumber between 1 and 10: ");
		while (answer != target){
			System.out.println("please try  again: ");
			answer = scan.nextInt();
		}
	}

}
