package vehicle.Car.Truck.Minivan;

public class TestVehicles 
{
	public static void main() 
	{
		Car firstvehicle = new Car("Nissan","Blue",5,"Small","CFT389");
		Truck secondvehicle = new Truck ("Ford","Red",5,"Large","VHU346");
		Minivan thirdvehicle = new Minivan("Toyota","Silver",8,"Medium","JSU694");
		System.out.println(firstvehicle);
		System.out.println(secondvehicle);
		System.out.println(thirdvehicle);
	}
}
