
/**
 * 
 * @author kushlani and Nihar
 * Evaluates and prints out the results of the following operation:
 * ((1+h)(1-f))/((3f)/(h^2-x))
 *
 */
public class ClassQuiz {
	public static void main(String args[]){

		int f;
		int h;
		int x;

		f = 9;
		h = 7;
		x = 4;
		
		System.out.println((1+h)*(1-f)/((double)3*f/(h*h-x)));	// (double) casts f into a double
																// numerator and denominator gets 
																// evaluated first. so cast 
																// denominator to double as it has a division.
	}
}
