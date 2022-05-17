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
       double offsetValue = 9.663309906452573E-4; //for the 5kg capacity
       // double offsetValue = 3.427178600536277E-4; //for the 780g capacity 
        //double offsetValue = -7.792375985436317E-6; //for the 25kg capacity  
        
        //Use your Phidgets
        while(true)
        {
        //Calculate Weight
        //double average is the programs calculated offsetvalue 
        double weight = 4803* (scale.getVoltageRatio() - offsetValue); //for the 5kg capacity
       // double weight = 764* (scale.getVoltageRatio() - offsetValue); //for the 780g capacity
          //double weight = -23436* (scale.getVoltageRatio() - offsetValue); //for the 25kg capacity
        
        //Display Weight
       // System.out.println(String.format("%.3f g", weight * 1000));  //grams instead of kg  
        System.out.println(String.format("%.3f kg", weight ));  	//outputs kg
       // System.out.println(String.format("%.3f lbs", weight *2.205)); //outputs lbs instead of kg
        
       // System.out.println("Offset Value: " + scale.getVoltageRatio());
        Thread.sleep(250);
        }
    }    
}

