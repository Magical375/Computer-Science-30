public class Puck extends DiskExample 
{
	private double Min_Standard_Weight = 5;
	private double MAX_Standard_Weight = 5.5;
	private double MIN_Youth_Weight = 4;
	private double MAX_Youth_Weight = 4.5;
	
	public double weight;
	public boolean youth;
	public boolean standard;
	public String division;
	


	
	public Puck(double w)//abstract
	{
		super(1.5, 1);
		weight = w;
		if (weight >=Min_Standard_Weight && weight <= MAX_Standard_Weight )
	 	{
			youth = false;
			standard = true;
		}
	 	 else if (weight >=MIN_Youth_Weight && weight<=MAX_Youth_Weight)
	 	 {
	 		 standard = false;
	 		 youth = true;
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
