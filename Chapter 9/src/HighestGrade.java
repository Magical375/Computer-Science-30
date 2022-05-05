/*
Program: FindName.java           Date of this Revision: 5-May-2022

Purpose: allows the user to enter grades and then finds the highest grade in the array created.

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
import java.util.Scanner;
public class HighestGrade {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	
		Double [] gradeslist = new Double [5];
		Double grade;
		for(int i = 0; i<5; i++)//runs loop for five grades 
		{
			System.out.print("Enter a grade: ");
			grade = input.nextDouble();
			gradeslist[i] = grade;
		}
		input.close();//closes the scanner, or the editor program is annoyed
		Double find= 0.0;
		int highestgrade= SearchDouble.linear(gradeslist, find);
	}

}
