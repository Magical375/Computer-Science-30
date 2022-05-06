/*

Program: Circle.java          Last Date of this Revision: 10-Nov-2020

Purpose: Creates a circle class that can be access by a different java program  

Author: Laura Frede, 
School: CHHS
Course: Computer Science 20
 

*/

/**
 * Customer class.
 */
public class Customer {
	private String firstName, lastName, street, city, state, zip;
		
	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String str, String c, String s, String z) {
		firstName = fName;
		lastName = lName;
		street = str;
		city = c;
		state = s;
		zip = z;
	}
        
        
        public void changeStreet(String str){// street is refered to by str
            street = str;
        }
        
        public void changeCity(String c)//c is a shorter way of refering to city
        {
            city = c;
        }
        public void changeState(String s){//state is refered to by s
            state = s;
        }
        public void changeZip(String z){//zip is refered to by z
            zip = z;
        }
        
        
        
	

	/**
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Account object has 
	 * been returned.
	 */
	 public String toString() {
		String custString;
	
		custString = firstName + " " + lastName + "\n";
		custString += street + "\n";
		custString += city + ", " + state + "  " + zip + "\n";
	 	return(custString);
	}
}
