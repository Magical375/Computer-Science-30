package bankAccounts;

public class PersonalAccount extends Account
{
	private Customer cust;
	private double balance;
	public PersonalAccount(double bal, String fName, String lName, String str, String city, String st, String zip) 
	{
		super(bal,fName,lName,str,city,st,zip);
		cust = new Customer(fName, lName, str, city, st, zip);
		if(balance<100)
		{
			bal -= 2;	
		}	
	}
	
	
}
