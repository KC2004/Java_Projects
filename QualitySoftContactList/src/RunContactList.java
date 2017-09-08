/**
 * runs the contact list program
 **/
public class RunContactList {
	public static void main(String[] args) {
		// KJ
		ContactList myList = new ContactList();
		myList.addContact();
		System.out.println(myList);
		myList.addContact();
		System.out.println(myList);


		Person person1;
		person1 = new Person();
		person1.setLastName("lo");
		System.out.println("will return null in place of last name for now, " + person1.getLastName());
		person1.setFirstName("Shu");
		System.out.println("will return null in place of first name for now, " + person1.getLastName());
		person1.setStreetAddress1("2670 Abrego Road");
		System.out.println("will return null in place of streetaddress1 for now, " + person1.getStreetAddress1());
		person1.setStreetAddress2("apartment 4");
		System.out.println("will return null in place of streetaddress2 for now, " + person1.getStreetAddress2());
		person1.setCity("Palo Alto");
		System.out.println("will return null in place of city for now, " + person1.getCity());
		person1.setZip("64827");
		System.out.println("will return null in place of zip for now, " +  person1.getZip());
		person1.setState("CA");
		System.out.println("will return null in place of state for now, " + person1.getState());
		person1.setEmailAddress("Shuistlo@gmail.com");
		System.out.println("this will true if an email is valid, "  + person1.isValidEmail("Shuistlo@gmail.com"));
		System.out.println("will return null in place of emailAddress for now, " + person1.getEmailAddress());
		person1.setPhoneNumber("(242) 820-5212");
		System.out.println(person1.getPhoneNumber());
		person1.setPhoneNumber("1234567890");
		System.out.println(person1.getPhoneNumber());
		System.out.println("phone number, (232) 820-5212, is valid should return true. "  + person1.isValidPhone("(232) 820-5212"));
		System.out.println("phone number, 2320-5212, is valid should return false. "  + person1.isValidPhone("(2320-5212"));
		System.out.println("phone number, %$#6781230987, is valid should return true. "  + person1.isValidPhone("(%$#6781230987"));
		System.out.println("phone number, 4089425089, is valid should return true. "  + person1.isValidPhone("4089425089"));
		System.out.println("will return null in place of phoneNumber for now, " + person1.getPhoneNumber());
		person1.setNotes("this is a test");
		System.out.println("will return null in place of notes for now, " + person1.getNotes());
		System.out.println("the toString method should return (black space), " + person1.toString());
		
		ContactList contactListTest;
		contactListTest = new ContactList();
		contactListTest.addContact();
		System.out.println("this method will return nothing for now "+ contactListTest.findContact());
		System.out.println("this method will just return nothing for now " + contactListTest.sortedContactList());
		System.out.println("this method will just return nothing for now " + contactListTest.toString());
		contactListTest.save();
		String menu = " ";
		System.out.println(menu);
		System.out.println("this program works");
	}
}

/*
will return null in place of last name for now, null
will return null in place of first name for now, null
will return null in place of streetaddress1 for now, null
will return null in place of streetaddress2 for now, null
will return null in place of city for now, null
will return null in place of zip for now, null
will return null in place of state for now, null
this will true if an email is valid, true
will return null in place of emailAddress for now, null
this will true if a phone number is valid, true
will return null in place of phoneNumber for now, null
will return null in place of notes for now, null
the toString method should return (black space),  
this method will return nothing for now  
this method will just return nothing for now  
this method will just return nothing for now  
 
this program works
*/