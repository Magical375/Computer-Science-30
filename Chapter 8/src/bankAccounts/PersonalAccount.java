package bankAccounts;

public class PersonalAccount extends Account
{
	
	public PersonalAccount(double bal, String fName, String lName, String str, String city, String st, String zip, double amt) 
	{
		super(bal,fName,lName,str,city,st,zip);
	}
	
	
	public void withdraw(double amt) {
		
		
		if (amt <= super.getBalance() - 2)
		{
	 		super.withdrawal(amt);
	 		
	 		if(super.getBalance() < 100)
	 		{
	 			super.withdrawal(amt);
	 			System.out.println("Not enough money in account. You were chraged two dollars.");
	 		}
	 	} 
		else 
		{
	 	}	
	}
	
	
}
