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
		System.out.println("Creating personal account. Please enter balance");//creates a personal account and asks user for the needed information
		double ibal= input.nextDouble();
		input.nextLine();
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
		PersonalAccount firstAccount = new PersonalAccount(ibal,fName,lName,str,city,st,zip,amt);
		firstAccount.withdraw(amt);
		System.out.println("Current Account Balance "+firstAccount.getBalance());	
		
		System.out.println("Creating business account. Please enter balance");//creates a  business account and asks user for needed information 
		double gbal= input.nextDouble();
		input.nextLine();
		System.out.println("Please enter first name");
		String fNam= input.nextLine();
		System.out.println("Please enter last name");
		String lNam= input.nextLine();
		System.out.println("Please enter street you live on");
		String strt= input.nextLine();
		System.out.println("Please enter city you live in");
		String cit= input.nextLine();
		System.out.println("Please enter state you live in");
		String s= input.nextLine();
		System.out.println("Please enter your zipcode");
		String zi= input.nextLine();
		System.out.println("withdraw money please enter an amount");
		double am= input.nextDouble();
		BusinessAccount secondAccount = new BusinessAccount(gbal,fNam,lNam,strt,cit,s,zi,am);//needs different names for the inputs or the computer gets confused with the personal account
		secondAccount.withdraw(am);
		System.out.println("Current Account Balance "+secondAccount.getBalance());
	
		}
}

/*
Screen Dump
Creating personal account. Please enter balance
200
Please enter first name
ded
Please enter last name
dd
Please enter street you live on
d
Please enter city you live in
d
Please enter state you live in
d
Please enter your zipcode
d
withdraw money please enter an amount
10
Withdrew money.
Current Account Balance 190.0
Creating business account. Please enter balance
400
Please enter first name
d
Please enter last name
d
Please enter street you live on
d
Please enter city you live in
d
Please enter state you live in
d
Please enter your zipcode
d
withdraw money please enter an amount
30
Not enough money in account. You were charged ten dollars.
Current Account Balance 360.0

*/