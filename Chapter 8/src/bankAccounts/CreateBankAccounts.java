/*

Program: AccountSetup.java          Date of this Revision: 17, March 2020

Purpose: Creates a bank account for the user 

Author: Laura  Frede, 904269504
School: CHHS
Course: Computer Science 20
 

*/
package bankAccounts;
import java.util.Scanner;
public class CreateBankAccounts
{
	public static void main(String[]args)  
	{	
		Scanner input = new Scanner(System.in);
		System.out.println(" Creating personal account. Please enter balance");
		double bal= input.nextDouble();
		System.out.println("Please enter first name");
		String fName= input.nextLine();
		System.out.println("Please enter last name");
		String lName= input.nextLine();
		System.out.println("Please enter street you live on");
		String str= input.nextLine();
		System.out.println("Please enter city you live in");
		String city= input.nextLine();
		System.out.println("Please enter state you live in");
		String st= input.nextLine();
		System.out.println("Please enter your zipcode");
		String zip= input.nextLine();
		System.out.println("withdraw money please enter an amount");
		double amt= input.nextDouble();
		PersonalAccount firstAccount = new PersonalAccount(bal,fName,lName,str,city,st,zip,amt);
				//BusinessAccount secondAccount = new BusinessAccount();
		System.out.println(bal);	
	}
}
