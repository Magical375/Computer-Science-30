import com.phidget22.*;
public class lightone 
{

	public static void main(String[] args)throws Exception 
	{
		// TODO Auto-generated method stub
		   DigitalOutput redLED = new DigitalOutput();
		redLED.setHubPort(1);
		  redLED.open(1000);
		    redLED.setState(true);
	}

}
