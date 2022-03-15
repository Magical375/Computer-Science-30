/*

Program: Staff.java           Date of this Revision: 14-March-2022

Purpose: stores employees name and job title

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
 

*/
package uEmployee.Faculty.Staff;

public class Staff extends uEmployee
{	
	private String jobtitle;
	
	public String getTitle()
	{
		return jobtitle;
	}
	public void setTitle(String manager)
	{
	jobtitle = manager;
	
	}
	public Staff(String fn, String ln,double sal) 
	{
		super(fn,ln,sal);	
	}
	
	
	public String toString() //accessor method 
	{
	return (super.getName()+ super.getPay()+ jobtitle);	
	}
}
