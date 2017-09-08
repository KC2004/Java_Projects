import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
/**
 * one object in ContactList is a person from Person Class
 * class ContactList creates an array of Person objects
 * array can be added to, printed, saved, and can be searched for a contact
 **/
public class ContactList {
	private ArrayList<Person> listOfContacts;

	/**
	 * constructor for contactList
	 * will initialize the array size to be 0
	 * will initialize listOfContacts to ArrayList<Person> object
	 */
	public ContactList() {
		listOfContacts = new ArrayList<Person>();
	}

	/**
	 * saves progress on the contact list to a file
	 */
	public void save() {

	}

	/**
	 * asks the user to add a contact
	 * calls person setters 
	 * adds a contact to the array list
	 */
	public void addContact() {
		
	}

	/**
	 * searches for a contact
	 * based on user input using the scanner
	 * will check for upper/lower case spelling
	 * finds and prints contact using toString person method
	 */
	public String findContact() {
		String contact = " ";
		
		return contact;
	}
	
	/**
	 * returns all contacts in a list format with first name then last name above street address1 etc
	 * contacts will be sorted in alphabetical order by last name
	 * the string returned will be one long string with all contacts
	 */
	public String sortedContactList() {
		String contacts= " ";
 
		return contacts;
	}
	
	/**
	 * returns all contacts in a list format with first name then last name above street address1 etc
	 */
	public String toString() {
		String oneContact = " ";
		
		return oneContact;
	}
}
