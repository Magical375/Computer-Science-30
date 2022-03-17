/*

Program: Puck.java           Date of this Revision: 14-March-2022

Purpose: creates a puck with a weight and division

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
 

*/
public class Puck extends DiskExample 
{
	private double Min_Standard_Weight = 5;
	private double MAX_Standard_Weight = 5.5;
	private double MIN_Youth_Weight = 4;
	private double MAX_Youth_Weight = 4.5;
	
	private double weight;
	private boolean youth;
	private boolean standard;
	private String division;
	


	
	public Puck(double w)
	{
		super(1.5, 1);
		weight = w;
		if (weight >=Min_Standard_Weight && weight <= MAX_Standard_Weight )
	 	{
			youth = false;
			standard = true;//makes puck standard if it is of standard weight
		}
	 	 else if (weight >=MIN_Youth_Weight && weight<=MAX_Youth_Weight)
	 	 {
	 		 standard = false;
	 		 youth = true;//makes puck youth if it is of youth weight
	 	 }
	}
		public double getWeight()
		{
			return weight;
		}
	
		public String getDivision()
		{
			if(standard == true)
			{
				division = "standard";
			}
			else if (standard == false) 
			{
			division = "youth";
			}
			return division;
		}
}
