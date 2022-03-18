package vehicle.Car.Truck.Minivan;

public class Car  extends Vehicle
{
	public boolean convertable;
	
	public Car(String n, String c, double s, String st, String plate) 
	{
		super(n,c,s,st,plate);
		st = "small";
		convertable = false;
		s =5;
		System.out.println();	
	}
}
