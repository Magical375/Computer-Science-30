package localBank;

import java.util.Scanner;

/*
Program: LocalBank.java           Date of this Revision: 5-May-2022

Purpose: allows the user to create a bank account make deposits and withdrawals change their address and close the bank account

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
public class myLocalBank 
{
	public static void main(String[] args) 
	{
		Bank easySave = new Bank();
		Scanner input = new Scanner(System.in);
		String action, acctID;
		Double amt;

		/* display menu of choices */
		do {
			System.out.println("\nDeposit\\Withdrawal\\Check balance");
			System.out.println("Add an account\\Remove an account");
			System.out.println("Quit\n");
			System.out.print("Enter choice: ");
			action = input.next();

			if (action.equalsIgnoreCase("A")) 
			{
				easySave.addAccount();
			} 
			else if (!action.equalsIgnoreCase("Q")) 
			{
				System.out.print("Enter account ID: ");
				acctID = input.next();
				if (action.equalsIgnoreCase("D")) {
					System.out.print("Enter deposit amount: ");
					amt = input.nextDouble();
					easySave.transaction(1, acctID, amt);
				} else if (action.equalsIgnoreCase("W")) {
					System.out.print("Enter withdrawal amount: ");
					amt = input.nextDouble();
					easySave.transaction(2, acctID, amt);
				} else if (action.equalsIgnoreCase("C")) {
					easySave.checkBalance(acctID);
				} else if (action.equalsIgnoreCase("R")) {
					easySave.deleteAccount(acctID);
				}
				//write code to modify information if action equals "M"
			}
		} while (!action.equalsIgnoreCase("Q"));
	}
}
