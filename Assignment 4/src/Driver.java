import java.util.Scanner;

public class Driver {
/**
 *  One object of Driver class holds the age, number of traffic tickets and value of car,
 *  in age, tickets and value_of_car respectively for Driver
*/

	double BASEPRICEPERC = 0.05; 			// base price = percent of car value
	double ADDPERCFOR25ANDUNDER = 0.15; 	// percent added for under 25 year old
	double ADDPERCFOR25TO29 = 0.10; 		// percent added for 25 to 29 year old
	double ADDPERCFOR1TIX = 0.10; 			// percent added for 1 ticket
	double ADDPERCFOR2TIX = 0.25; 			// percent added for 2 ticket
	double ADDPERCFOR3TIX = 0.50; 			// percent added for 3 ticket

	private  int age;
	private  int tickets;
	private  double value_of_car;

	/*
	 * This method calculates the premium and returns it as a double
	 * It uses the following rules to calculate the premium: 
	 * The base premium is 5 percent of the value of the car.
	 * Drivers under 25 years old pay 15 percent more and 
	 * drivers from 25 through 29 pay 10 percent more.
	 * A driver with one traffic ticket pays 10 percent over the premium already figured. 
	 * Two tickets draws a 25 percent extra charge 
	 * Three tickets adds 50 percent and 
	 * drivers with more than three tickets are refused coverage.
	 */
	public String premium(){
		double base_price = value_of_car * BASEPRICEPERC; // base price is set to 5 percent of value of car
		double base_premium;
		double full_premium;
		String str_prm;			// for formatting double full_premium to 2 decimals
		
		// this segment checks drivers age and set base premium accordingly
		if (age > 29) 			// if driver's age is above 30 years
			base_premium = base_price; 
		else if (age >= 25) 	// if driver's age is 25 to 29 10 percent is added to base price
			base_premium = base_price * (1 + ADDPERCFOR25TO29);
		else if (age > 14)		// if driver's age is 15 to 25, 10 percent is added to base price
			base_premium = base_price * (1 + ADDPERCFOR25ANDUNDER);
		else
			base_premium = 0;	// 0 if under age

		// this segment checks the number of tickets and set the premium accordingly
		switch(tickets){
			case 0: 	full_premium = base_premium;	break;	// if no tickets: premium is base premium
			case 1: 	full_premium = base_premium * (1+ADDPERCFOR1TIX); break;
			case 2: 	full_premium = base_premium * (1+ADDPERCFOR2TIX); break;
			case 3: 	full_premium = base_premium * (1+ADDPERCFOR3TIX); break;
			default: 	full_premium = 0; break;
		}
		str_prm = String.format("%.2f", full_premium);
		return str_prm;
	}

	/*
	 * This method prompts the user for drivers age, number of tickets and value of car
	 * and sets them to class variable age, tickets and value_of_car respectively
	 */
	public void read(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Driver's Age? ");
		age = scanner.nextInt(); // read driver's age to age
		System.out.print("Number of Tickets? ");
		tickets = scanner.nextInt(); // read driver's tickets to tickets
		System.out.print("Value of Car? ");
		value_of_car = scanner.nextInt(); // read value of car to value_of_car
	}
}

/*
 * Driver's Age? 35
Number of Tickets? 1
Value of Car? 10000
Premium: $550.00
Driver's Age? 29
Number of Tickets? 2
Value of Car? 15000
Premium: $1031.25
Driver's Age? 19
Number of Tickets? 3
Value of Car? 850
Premium: $73.31
Driver's Age? 81
Number of Tickets? 4
Value of Car? 12500
Premium: $0.00
 */

