package uEmployee.Faculty.Staff;

public class Faculty extends uEmployee
{
	public String department;
	
	public Faculty(String fn, String ln,double sal)
	{
	super(fn,ln);	
	}
	public String getDepartment() 
	{
		return department;	
	}	
}
