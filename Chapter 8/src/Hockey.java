import java.text.NumberFormat;
public class Hockey 
{

	public static void main(String[]args) 
	{
		Puck firstPuck = new Puck(5);
		Puck secondPuck = new Puck(4);
		
		
	    NumberFormat dec = NumberFormat.getNumberInstance();
	 

		System.out.println("  Divison of game  is " + firstPuck.getDivision());
		System.out.println("  Radius of Puck is " + firstPuck.getRadius());
		System.out.println("  Thickness of Puck is " + firstPuck.getThickness());
		System.out.println("  Area of Puck is " + dec.format(firstPuck.area()));
		System.out.println("  Volume of Puck is " + dec.format(firstPuck.volume()));
	    System.out.println("  Weight of puck is " + firstPuck.getWeight());
				
		System.out.println("  Divison of game  is " + secondPuck.getDivision());
		System.out.println("  Radius of Puck is " + secondPuck.getRadius());
		System.out.println("  Thickness of Puck is " + secondPuck.getThickness());
		System.out.println("  Area of Puck is " + dec.format(secondPuck.area()));
		System.out.println("  Volume of Puck is " + dec.format(secondPuck.volume()));
		System.out.println("  Weight of puck is " + secondPuck.getWeight());
		if (firstPuck.equals(secondPuck)) 
		{
			System.out.println("  Objects are equal.");
		} 
		else 
		{
			System.out.println("  Objects are not equal.");
		}
	}

}
