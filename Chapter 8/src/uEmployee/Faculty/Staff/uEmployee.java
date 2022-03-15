/*

Program: BreakAPlate.java           Date of this Revision: 14-March-2022

Purpose: creates a blueprint for the faculty and staff classes

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
 

*/
package uEmployee.Faculty.Staff;

public abstract class uEmployee
{

	private String firstname;
	private String lastname;//store name
	private double salary;//stores salary

	

	public uEmployee(String fn, String ln, double sal)
    {
        firstname = fn;
        lastname = ln;
        salary = sal;
    }public String getName()
	{
		return ("Firstname: " + firstname + "Lastname: "+ lastname);	
	}
	public double getPay()
	{
		return salary;
	}
	public void setName(String John)
	{
	firstname = John;
	}
	public void setSalary(double wage)
	{
	salary = wage;
	
	}
}
