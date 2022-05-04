/*
Program: FindName.java           Date of this Revision: 4-May-2022

Purpose: allows the user to enter names and then finds requested name in the array created.

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
import java.util.Scanner;
public class FindName 
{
	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);	
		System.out.println("Please enter how many names you want to store");//allows user to enter the number of names to store
		int num = input.nextInt();
		input.nextLine();
		String [] nameslist = new String [num];//creates array
		String name;
		
		for(int i = 0; i<num; i++)//runs loop for the exact number of names the user wants 
		{
			System.out.println("Enter a name: ");
			
			name = input.nextLine();
			nameslist[i] = name;
		}
		System.out.println("Please enter what name you want to find.");
		String find =input.nextLine();
		
		int location= SearchExample.linear(nameslist, find);
		if (location == -1) 
		{
			System.out.println("name not found");//tells user the name is not found
		} else {
			System.out.println("name is found at array index "+location);//tells user the name is found	
		}
		input.close();//closes the scanner, or the editor program is annoyed 
	}
}
/*
Screen Dump
Please enter how many names you want to store
3
Enter a name: 
bob
Enter a name: 
sarah
Enter a name: 
emily
Please enter what name you want to find.
sarah
name is found at array index 1

*/


