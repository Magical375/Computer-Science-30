package bankAccounts;

public class BusinessAccount extends Account
{


 public BusinessAccount(double bal, String fName, String lName, String str, String city, String st, String zip) 
 {
super(bal,fName,lName,str,city,st,zip);
 }
 public void withdraw(double amt) 
 	{
		
		
		if (amt <= super.getBalance() - 10)
		{
	 		super.withdrawal(amt);
	 		if(super.getBalance() < 500)
	 		{
	 			super.withdrawal(10);
	 			System.out.println("Not enough money in account. You were charged ten dollars.");
	 		}
	 		else
	 		{
	 			System.out.println("Not enough money in account.");	
	 		}
	 	} 
			
	}
}
