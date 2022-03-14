package bankAccounts;

public class PersonalAccount extends Account
{
	public PersonalAccount(double bal, String fName, String lName, String str, String city, String st, String zip) 
	{
		super(bal,fName,lName,str,city,st,zip);
	}
	
	
	public void withdraw(double amount, double bal) {
		
		if (bal <= 100) {
	 		bal-= super.getamount;
	 	} else {
	 		System.out.println("Not enough money in account.");
	 	}	
	}
	
	
}
