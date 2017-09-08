
public class SavingsAccount {
	
	private double initialDeposit;
	private double annualInterestRate;
	/**
	 * sets deposit to newDeposit
	 * @param newDep: double
	 */
    public void setDeposit(double newDep){
    	initialDeposit = newDep;
    }
    
    /**
     * sets annualInterestRate to newRate
     * @param newRate: double
     */
    public void setAnnualInterestRate(double newRate){
    	annualInterestRate = newRate;
    }
    
    /**
     * Calculates and returns amount in bank (deposit+interest) after number of years
     * @param years: int
     * @return: double (futureInvestmentValue = initialDeposit * (1 + monthlyInterestRate) years*12
     */
    public double futureInvestmentValue(int years){
    	double futureInterest = initialDeposit * Math.pow((1+(annualInterestRate/12)), years *12);
    	return futureInterest;
    	
    }
}
