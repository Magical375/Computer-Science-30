/*

Program: PersonalAccount.java           Date of this Revision: 15-March-2022

Purpose: creates a personal bank account and charges owner when money is less than 100

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
 

*/
package bankAccounts;

public class PersonalAccount extends Account
{
	public PersonalAccount(double bal, String fName, String lName, String str, String city, String st, String zip, double amt) 
	{
		super(bal,fName,lName,str,city,st,zip);//creates a bank account based on account template
	}
	public void withdraw(double amt)
	{
		//super.getBalance() - amt;
		if (amt <= super.getBalance() - 2)
		{
	 		super.withdrawal(amt);
	 		if(super.getBalance() < 100)
	 		{
	 			super.withdrawal(2);
	 			System.out.println("You were charged two dollars.");//charges user when money is less than 100
	 		}
	 		else
	 		{
	 			System.out.println("Not enough money in account.");	
	 		}
	 	} 
	}
}
