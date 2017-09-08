/**
 * class person contains the variables of class list
 **/
public class Person {
	private String lastName;
	private String firstName;
	private String streetAddress1;
	private String streetAddress2;
	private String city;
	private String zip;
	private String state;
	private String emailAddress;
	private String phoneNumber;
	private String notes;

	/**
	 * returns string lastName
	 */
	public String getLastName() {

		return lastName;
	}

	/**
	 * returns string firstName
	 */
	public String getFirstName() {

		return firstName;
	}

	/**
	 * returns string streetAddress1
	 */
	public String getStreetAddress1() {

		return streetAddress1;
	}

	/**
	 * returns string streetAddress2
	 */
	public String getStreetAddress2() {

		return streetAddress2;
	}

	/**
	 * returns string city
	 */
	public String getCity() {

		return city;
	}

	/**
	 * returns string state
	 */
	public String getState() {

		return state;
	}

	/**
	 * returns string zip
	 */
	public String getZip() {

		return zip;
	}

	/**
	 * returns string emailAddress
	 */
	public String getEmailAddress() {

		return emailAddress;
	}

	/**
	 * returns string phoneNumber
	 */
	public String getPhoneNumber() {

		return phoneNumber;
	}

	/**
	 * returns string notes
	 */
	public String getNotes() {

		return notes;
	}

	/**
	 * sets string lastName with parameter newLastName
	 */
	public void setLastName(String newLastName) {
		
	}

	/**
	 * sets string newFirstName with parameter newFirstName
	 */
	public void setFirstName(String newFirstName) {
		
	}

	/**
	 * sets string streetAddress1 with parameter newStreetAddress1
	 */
	public void setStreetAddress1(String newStreetAddress1) {
		
	}

	/**
	 * sets string streetAddress2 with parameter newStreetAddress2
	 */
	public void setStreetAddress2(String newStreetAddress2) {

	}

	/**
	 * sets string city with parameter newCity
	 */
	public void setCity(String newCity) {

	}

	/**
	 * sets string state with parameter newState
	 */
	public void setState(String newState) {

	}

	/**
	 * sets string zip with parameter newZip
	 */
	public void setZip(String newZip) {

	}

	/**
	 * sets string emailAddress with parameter newEmailAddress
	 */
	public void setEmailAddress(String newEmailAddress) {

	}
	

	/**
	 * sets string phoneNumber with parameter newPhoneNumber
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		int count = 0;
		StringBuilder phoneStr = new StringBuilder("(");
		if (this.isValidPhone(newPhoneNumber)){
			for (int i = 0; i < newPhoneNumber.length(); i++) {
				if (Character.isDigit(newPhoneNumber.charAt(i))) {
					phoneStr.append(newPhoneNumber.charAt(i));
					count++;
					switch (count){
					case 3: phoneStr.append(")"); break; // append end parenthesis after 3rd digit
					case 6: phoneStr.append("-"); break; // append - after 6th digit
					}
				}
			}
		}
		this.phoneNumber = phoneStr.toString();
	}

	/**
	 * sets string notes with parameter newNotes 
	 */
	public void setNotes(String newNotes) {

	}

	/**
	 * checks to see if a phone number is valid
	 * returns true if valid phone number, false if not
	 */
	public boolean isValidPhone(String aPhoneNumber) {
		int count = 0;
		boolean valid = false;
		for (int i = 0; i < aPhoneNumber.length(); i++) {
		    if (Character.isDigit(aPhoneNumber.charAt(i))) {
		        count++;  
		    }
		}
		if (count == 10){
			valid = true;
		}
		return valid;
	}
	/**
	 * checks to see if an email is valid
	 * returns true if valid email, false if not
	 */
	public boolean isValidEmail(String anEmail) {
 
		return true;
	}

	/**
	 * prints a readable version of a contact
	 * each variable will be separated by a new line with the exception of
	 * first name and last name on the same line
	 * and address which will be formatted like a mailing address
	 */
	public String toString() {
		String fullContactString = " "; 
		
		return fullContactString;
	}
}
