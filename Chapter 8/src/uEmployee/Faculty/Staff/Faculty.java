/*

Program: Faculty.java           Date of this Revision: 14-March-2022

Purpose: creates a faculty that stores department name

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
 

*/
package uEmployee.Faculty.Staff;

public class Faculty extends uEmployee
{
	public String department;
	
	public Faculty(String fn, String ln,double sal)
	{
	super(fn,ln,sal);	
	}
	public String getDepartment() 
	{
		return department;	
	}	
}
