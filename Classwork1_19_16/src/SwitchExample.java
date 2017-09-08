
public class SwitchExample {
	/**

	 * Takes a letter grade and converts it to a number

	 * of grade points.

	 */

	public static void main(String args[])  {

	     char grade;

	     grade = 'B';

	     int points;

	     switch (grade) {

	          case 'A': points = 4;

	                    break;

	          case 'B': points = 3;

	                    break;

	          case 'C': points = 2;

	                    break;

	          case 'D': points = 1;

	                    break;

	          default: points = 0;

	                    break;

	     }

	     System.out.println("For a grade of " + grade + ", you get " + points + " points.");

	}

}
