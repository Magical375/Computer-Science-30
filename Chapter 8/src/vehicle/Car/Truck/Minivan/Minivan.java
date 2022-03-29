package vehicle.Car.Truck.Minivan;

public class Minivan extends Vehicle
{
	public boolean movieplayer;
	public Minivan(String n, String c, double s, String st,String plate) 
	{
		super(n,c,s,st,plate);
		st = "medium";
		movieplayer = true;
		s = 8;
		System.out.println("Storage is "+st+". Movieplayer in minivan is "+movieplayer+". Max seats of a minivan is "+s+".");	
	}
}//HI