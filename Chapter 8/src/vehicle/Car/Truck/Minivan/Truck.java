package vehicle.Car.Truck.Minivan;

public class Truck  extends Vehicle
{
	public boolean clean;
	public Truck(String n, String c, double s, String st, String plate) 
	{
		super(n,c,s,st,plate);
		st = "large";
		clean = false;
		s = 5;
		System.out.println("Storage is "+st+"Truck is clean "+clean+" Max seats of a truck is "+s);	
	}
	public String toString()
	{
		return(super.toString() + clean );
	}
}
