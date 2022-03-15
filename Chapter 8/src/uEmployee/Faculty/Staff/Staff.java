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
	public Staff(String fn, String ln,double sal) 
	{
		super(fn,ln,sal);	
	}
	private String jobtitle;
	
	public String toString(){
	return (super.getName()+ super.getPay()+ jobtitle);	
	}
}
