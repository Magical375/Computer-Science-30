/*
Program: FindName.java           Date of this Revision: 5-May-2022

Purpose: allows the user to enter grades and then finds the highest grade in the array created.

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
import java.util.Scanner;
public class HighestGrade 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	
		double [] gradeslist = new double [5];
		double grade;
		double highest = 0;
		
		for(int i = 0; i<5; i++)//runs loop for five grades 
		{
			System.out.println("Enter a grade: ");
			grade = input.nextDouble();
			gradeslist[i] = grade;
		}
		input.close();//closes the scanner, or the editor program is annoyed 
		
		
		for(int i = 0; i<5; i++)//compares all double values
		{
			if (highest < gradeslist[i])
			{
				highest = gradeslist[i];
			}
		}
		System.out.println("The highest grade is "+highest);//tells user the highest grade
	}
}
/*
Screen Dump
Enter a grade: 
70
Enter a grade: 
60
Enter a grade: 
72.5
Enter a grade: 
90
Enter a grade: 
92
The highest grade is 92.0
*/
