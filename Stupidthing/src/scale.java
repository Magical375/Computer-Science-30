import com.phidget22.*;
public class scale 
{
	public static void main(String[] args) throws Exception
	{
        //Create
        VoltageRatioInput scale = new VoltageRatioInput();
        
        //Open
        scale.open(1000);
        
        //Use your Offset Value
        double offsetValue =-7.53952190631047E-6;
        
        //Use your Phidgets
        while(true)
        {
        //Calculate Weight (kg)
        //double weight = 4700 * (scale.getVoltageRatio() - offsetValue);
        
        double weight = -23286* (scale.getVoltageRatio() - offsetValue);
            
        //Display Weight
        System.out.println(String.format("%.3f kg", weight));    
        	
        //System.out.println("Offset Value: " + scale.getVoltageRatio());
        Thread.sleep(250);
        }
    }    
}

