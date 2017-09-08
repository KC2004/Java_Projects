/**
 * 
 * @author kushlani
 * One object of this class stores the house, city, state, zip and country of
 *  a StreetAddress
 */
public class StreetAddress {
	
	private String house;
	private String city;
	private String state;
	private String zip;
	private String country;
	
	/**
	 * Returns a String containing the formatted address of the StreetAddress. 
	 * Which contains the house, city, state, zip and country of the StreetAddress.
	 */
	public String toString(){
		return (house + "\n\n"+ city + ", " + state + " " + zip + "\n\n" + country + "\n");
	}

	/**
	 * Sets the value for house to "newHouse". 
	 */
	public void setHouse (String newHouse) {     
		house = newHouse;
	}

	/**
	 * Sets the value for city to "newCity". 
	 */
	public void setCity (String newCity) {     
		city = newCity;
	}

	/**
	 * Sets the value for state to "newState". 
	 */
	public void setState (String newState) {     
		state = newState;
	}

	/**
	 * Sets the value for zip to "newZip". 
	 */
	public void setZip (String newZip) {     
		zip = newZip;
	}

	/**
	 * Sets the value for country to "newCountry". 
	 */
	public void setCountry (String newCountry) {     // newHouse is a parameter
		country = newCountry;
	}

}
		
