
/**
 * Tests class GuessingGame
 */
import java.util.Scanner;
class TestGuessingGame {
   public static void main (String args[]) {
       GuessingGame.play();  
       Scanner scan = new Scanner (System.in);
       System.out.print("Do you want to play again? (Y/N)");
       String response;
       response = scan.next();
       System.out.println("response=" + response);
       while (response.equals("Y")) {
            GuessingGame.play();
               System.out.print("Do you want to play again? (Y/N)");
               response = scan.next();
       }
       
       System.out.println("Bye");
   }
}