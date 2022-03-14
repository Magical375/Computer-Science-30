/*

Program: Hockey.java           Date of this Revision: 14-March-2022

Purpose: Tells the user the radius, thickness, division, area and weight of two hockey pucks and compares them

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
 

*/
import java.text.NumberFormat;
public class Hockey 
{

	public static void main(String[]args) 
	{
		Puck firstPuck = new Puck(5);
		Puck secondPuck = new Puck(4);
		
		
	    NumberFormat dec = NumberFormat.getNumberInstance();//prevents very long decimals
	 

		System.out.println("  Divison of game is " + firstPuck.getDivision());
		System.out.println("  Radius of Puck is " + firstPuck.getRadius());
		System.out.println("  Thickness of Puck is " + firstPuck.getThickness());
		System.out.println("  Area of Puck is " + dec.format(firstPuck.area()));
		System.out.println("  Volume of Puck is " + dec.format(firstPuck.volume()));
	    System.out.println("  Weight of puck is " + firstPuck.getWeight());//displays the information in the puck class
				
		System.out.println("  Divison of game is " + secondPuck.getDivision());
		System.out.println("  Radius of Puck is " + secondPuck.getRadius());
		System.out.println("  Thickness of Puck is " + secondPuck.getThickness());
		System.out.println("  Area of Puck is " + dec.format(secondPuck.area()));
		System.out.println("  Volume of Puck is " + dec.format(secondPuck.volume()));
		System.out.println("  Weight of puck is " + secondPuck.getWeight());
		if (firstPuck == secondPuck)//compares the two different pucks
		{
			System.out.println("  Objects are equal.");
		} 
		else 
		{
			System.out.println("  Objects are not equal.");
		}
	}

}
