import com.phidget22.*;
public class scale 
{
	public static void main(String[] args) throws Exception
	{
        //Create
        VoltageRatioInput scale = new VoltageRatioInput();
        
        //Open
        scale.open(1000);
        
        //Use your Phidgets
        while(true)
        {
            System.out.println("Offset Value: " + scale.getVoltageRatio());
            Thread.sleep(250);
        }
    }    
}
// Offset Value: -8.596805859635028E-5