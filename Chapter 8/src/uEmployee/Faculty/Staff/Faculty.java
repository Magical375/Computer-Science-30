package uEmployee.Faculty.Staff;

public class Faculty extends uEmployee
{
	public String department;
	
	public Faculty(String firstname, String lastname)
	{
	super(firstname, lastname);	
	}
	public String getDepartment() 
	{
		return department;	
	}	
}
