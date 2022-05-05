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
			System.out.println("Enter a grade: ");
			grade = input.nextDouble();
			gradeslist[i] = grade;
		}
		input.close();//closes the scanner, or the editor program is annoyed
		Double element0, element1, element2, element3, element4;
		element0 = gradeslist.get(0);
		element1 = gradeslist.get(1);
		//compare double values
		if(element0.compareTo(element1)>0)
		{
			System.out.println(element0+"is greater than"+element1);
		}else if (element0.compareTo(element2)>0)
		{
			System.out.println(element0+"is greater than"+element2);
		}else if (element0.compareTo(element3)>0)
		{
			System.out.println(element0+" is greater than "+element3);
		}else if (element0.compareTo(element4)>0)
		{
			System.out.println(element0+" is greater than "+element4);
		}else if (element1.compareTo(element2)>0)
		{
			System.out.println(element1+" is greater than "+element2);
		}else if (element1.compareTo(element3)>0)
		{
			System.out.println(element1+" is greater than "+element3);
		}else if (element1.compareTo(element4)>0)
		{
			System.out.println(element1+" is greater than "+element4);
		}else if (element2.compareTo(element3)>0)
		{
			System.out.println(element2+" is greater than "+element3);
		}else if (element2.compareTo(element4)>0)
		{
			System.out.println(element2+" is greater than "+element4);
		}else if (element3.compareTo(element4)>0)
		{
			System.out.println(element3+" is greater than "+element4);
		}
	}

}
