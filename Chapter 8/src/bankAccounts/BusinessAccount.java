package bankAccounts;

public class BusinessAccount extends Account
{
	private Customer cust;
	private double balance;
 public BusinessAccount(double bal, String fName, String lName, String str, String city, String st, String zip) 
 {
	 super(bal,fName,lName,str,city,st,zip);
	cust = new Customer(fName, lName, str, city, st, zip);
	if(balance<500)
	{
		bal -= 2;	
	}	
	 
 }
}
