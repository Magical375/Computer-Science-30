package vehicle.Car.Truck.Minivan;

public class Minivan extends Vehicle
{
	public int stickers;
	public Minivan(String n, String c, double s, String st,String plate) 
	{
		super(n,c,s,st,plate);
		st = "medium";
		stickers = 3;
		s = 8;
		System.out.println("Storage is "+st+"Number of stickers"+stickers+"Max seats of a minivan is "+s);	
	}
}