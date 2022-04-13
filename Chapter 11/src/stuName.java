/*
Program: stuName.java           First Date of this Revision: 13-April-2022

Purpose:holds first and last name of students in roster program
Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
public class stuName extends Roster
{
	public String stuName()//a to string constructor 
		{
		super(Sarah, Smith);//gets variables from supperclass roster	
		String stuString;//declares string with name
			stuString = stuName + "Name: "+ Namef +" "+Namel;//initalizes sting with student's first and last names
			return(stuString);//returns string
		}
}
