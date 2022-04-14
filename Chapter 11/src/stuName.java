/*
Program: stuName.java           First Date of this Revision: 13-April-2022

Purpose:holds first and last name of students in roster program
Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
import java.io.*;
public class stuName implements Serializable
{
	private String firstName, lastName;
	public stuName(String f, String l)
	{
		firstName =  f;
		lastName = l;
	}
	public String toString()//a to string constructor 
	{
		return("Name: "+firstName +" "+lastName);//makes the display of file read look nice	
	}
}
	



