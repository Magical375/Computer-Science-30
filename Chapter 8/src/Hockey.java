import java.text.NumberFormat;
public class Hockey {

	public static void main(String[] args) 
	{
		Puck firstPuck = new Puck(3.5);
		
	    //NumberFormat dec = NumberFormat;
	 
		
		System.out.println("Does the pull from Git Hub work? yes!");
		System.out.println("  Weight of puck is " + firstPuck.getWeight());
		System.out.println("  Divison of game  is " + firstPuck.getDivision());
		System.out.println("  Radius of Puck is " + firstPuck.getRadius());
		System.out.println("  Thickness of Puck is " + firstPuck.getThickness());
		//System.out.println("  Area of Puck is " + dec.format(firstPuck.area()));
		//System.out.println("  Volume of Puck is " + dec.format(firstPuck.volume()));
		
	}

}
