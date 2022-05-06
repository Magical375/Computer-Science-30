package localBank;
/*

Program: Circle.java          Last Date of this Revision: 18-Nov-2020

Purpose: 

Author: Laura Frede, 
School: CHHS
Course: Computer Science 20
 

*/

/*
 * Bank.java from Chapter 7
 * Simulates a bank and its cusomters.
 * Lawrenceville Press
 * June 10, 2011
 */

 /**
 * A bank where accounts can be opened and customers can
 * make transactions.
 */

 import java.util.Scanner;
 import java.text.NumberFormat;

 public class oldBank{

	public static void main(String[] args) {
		int choice;
                String userstreet;
                String usercity;
                String userstate;
                String userzip;
                
                Account munozAccount = new Account(250, "Maria", "Munoz", "110 Glades Road", "Mytown", "FL", "33445");
		Scanner input = new Scanner(System.in);
		double data;
		NumberFormat money = NumberFormat.getCurrencyInstance();

		System.out.println(munozAccount);

		System.out.print("Enter deposit amount: ");
		data = input.nextDouble();
		munozAccount.deposit(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));

		System.out.print("Enter withdrawal amount: ");
		data = input.nextDouble();
		munozAccount.withdrawal(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));
                
                
                System.out.println("Change address: (enter 1 for yes)");// lets the user choose to change their address if they need to
                choice = input.nextInt();
                
                
                
                if (choice ==1)
                {
                        System.out.println("change street: ");
                        userstreet = input.next();
                        System.out.println("change city: ");
                        usercity = input.next();
                        System.out.println("change state: ");
                        userstate = input.next();
                        System.out.println("change zip: ");
                        userzip = input.next();
                    
                    
                    
                    munozAccount.changeAddress(userstreet, usercity, userstate, userzip);//lets the user change the information in their address
                }else{
                    
                }
	}
       
 }
