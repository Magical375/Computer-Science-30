package uEmployee.Faculty.Staff;

public abstract class uEmployee
{

	private String firstname;
	private String lastname;
	private double salary;
	private double period;
	

	public uEmployee(String fn, String ln, double sal)
    {
        firstname = fn;
        lastname = ln;
        salary = sal;
    }
	abstract double pay(double period);
	
		
	public String getName()//to string
	{
		return ("Firstname: " + firstname + "Lastname: "+ lastname);	
	}
	public double getPay()
	{
		return salary + period;
	}
}
