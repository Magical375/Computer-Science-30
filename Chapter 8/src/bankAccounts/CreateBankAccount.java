package bankAccounts;
import java.util.Scanner;
public class CreateBankAccount 
{
	public static void main() 
	{	Scanner input = new Scanner(System.in);
		System.out.println(" Creating personal account. Please enter balance");
		String bal= input.nextLine();
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
		String amt= input.nextLine();
		PersonalAccount firstAccount = new PersonalAccount(bal,fName,lName,str,city,st,zip,amt);
		//BusinessAccount secondAccount = new BusinessAccount();
	
	}
}
