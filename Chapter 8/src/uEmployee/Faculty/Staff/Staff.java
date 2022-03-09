package uEmployee.Faculty.Staff;

public class Staff extends uEmployee
{
	public Staff(String fn, String ln,double sal) 
	{
		super(fn,ln,sal);	
	}
	private String jobtitle;
	
	public String getTitle(){
	return jobtitle;	
	}
}
