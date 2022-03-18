/*

Program: BusinessAccount.java           Date of this Revision: 15-March-2022

Purpose: creates a personal bank account and charges owner when money is less than 100

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
 

*/
package bankAccounts;

public class BusinessAccount extends Account
{
	public BusinessAccount(double bal, String fName, String lName, String str, String city, String st, String zip, double amt) 
	{
		super(bal,fName,lName,str,city,st,zip);//creates a bank account based on account template
	}
	public void withdraw(double amt)
	{
		if (amt <= super.getBalance() - 10)
		{
	 		super.withdrawal(amt);
	 		if(super.getBalance() < 500)
	 		{
	 			super.withdrawal(10);
	 			System.out.println("Not enough money in account. You were charged two dollars.");//charges user when money is less than 100
	 		}
	 		else
	 		{
	 			System.out.println("Not enough money in account.");	
	 		}
	 	} 
	}
}
