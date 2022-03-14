package bankAccounts;

public class PersonalAccount extends Account
{
	
	public PersonalAccount(double bal, String fName, String lName, String str, String city, String st, String zip, double amt) 
	{
		super(bal,fName,lName,str,city,st,zip,amt);
	}
	
	
	public void withdraw(double amt, double bal) {
		
		if (bal <= 100) {
	 		bal-= super.amt;
	 	} else {
	 		System.out.println("Not enough money in account.");
	 	}	
	}
	
	
}
