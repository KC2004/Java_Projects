import java.text.DecimalFormat;

/**
 * Tests class SavingsAccount by creating a
 * SavingsAccount object and printing
 * a table of "year" and the "amount in account" 
 * after each year for 10 years.
 */
class TestSavingsAccount {
	public static void main(String[] args) {
		SavingsAccount saver;
        saver = new SavingsAccount ();
        saver.setDeposit(1000);
        saver.setAnnualInterestRate(0.0325);
        // make a table of year and Amount in account
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("year" + "  Amount in account");
        for (int i=0; i<=10; i++){
        	System.out.print(" " + i + "   	  " + 
        				df.format(saver.futureInvestmentValue(i)));
        	System.out.println();
        }
    }
}

/*
year  Amount in account
 0   	  1000.00
 1   	  1032.99
 2   	  1067.07
 3   	  1102.27
 4   	  1138.63
 5   	  1176.19
 6   	  1214.99
 7   	  1255.07
 8   	  1296.47
 9   	  1339.24
 10   	  1383.42
 */
