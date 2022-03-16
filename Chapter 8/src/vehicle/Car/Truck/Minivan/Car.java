package vehicle.Car.Truck.Minivan;

public class Car  extends Vehicle
{

	public Car(String name, String colour, double seats) 
	{
	super(name,colour,seats);
	}
	public String getName()
	{
		return ("Name: " + name);	
	}
}
