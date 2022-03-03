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
	
//hi

	
	public Puck(double w)//abstract
	{
		super(1.5, 1);
		
		
		//public void getDivision(boolean youth, boolean standard) 
	
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
	//  abstract double money(double time); //abstract method
	
	}
		public double getWeight()
		{
			return weight;
		}
	
		public String getDivision()
		{
			
			
			if(standard = true)
			{
				division = "Puck is standard";
			}
			
			else if (standard = false) 
			{
			division = "Puck is youth";
			
			}
			
			return division;
		}
		
}
