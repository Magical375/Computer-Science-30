package bankAccounts;

public class BusinessAccount extends Account
{


 public BusinessAccount(double bal, String fName, String lName, String str, String city, String st, String zip) 
 {
	 super(bal,fName,lName,str,city,st,zip);
	if(balance<500)
	{
		bal -= 2;	
	}	
	 
 }
 public void withdraw(double amt) {
		
		
		if (amt <= super.getBalance() - 2)
		{
	 		super.withdrawal(amt);
	 		
	 		if(super.getBalance() < 500)
	 		{
	 			super.withdrawal(amt);
	 			System.out.println("Not enough money in account. You were chraged ten dollars.");
	 		}
	 	} 
		else 
		{
	 		
	 	}	
	}
}
