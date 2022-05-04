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
		String [] nameslist = new String [num];
		String name;
		for(int i = 0; i<num; i++)//runs loop for the exact number of names the user wants 
		{
			System.out.println("Enter a name: ");
			name = input.nextLine();
			nameslist[i] = name;
		}
		System.out.println("Please enter what name you want to find.");
		String find =input.nextLine();
		
		String[] array= null;
		int index = 0;
		while ((array[index] != find) && (index < array.length - 1)) 
		{
			index += 1;
		}
		if (array[index] == find) 
		{
			//return(index);	
		} else {
			//return(-1);
		}
		System.out.println("the index of the array is "+index);
	}
}
/*
Screen Dump
*/


