package vehicle.Car.Truck.Minivan;

public class TestVehicles 
{
	public static void main(String[]args) 
	{
		Car firstvehicle = new Car("Storage is small. "," Car is convertable is false. ","Max seats of a car is 5. ","Car isNissan. ","Car is Blue","Small","CFT389");
		Truck secondvehicle = new Truck ("Ford","Red",5,"Large","VHU346");
		Minivan thirdvehicle = new Minivan("Toyota","Silver",8,"Medium","JSU694");
		System.out.println(firstvehicle);
		System.out.println(secondvehicle);
		System.out.println(thirdvehicle);
	}
}
