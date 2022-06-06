/*
Program: RoverThumbstick.java           Date of this Revision: 2-June-2022

Purpose: controls and turns the rover with the thumbstick

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/  
//Add Phidgets Library
import com.phidget22.*;
public class RoverThumbstickTurn 
{
	public static void main(String[] args) throws Exception 
	{
		//Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        //Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();
        VoltageRatioInput vAxis = new VoltageRatioInput(); 
        VoltageRatioInput hAxis = new VoltageRatioInput();
        DigitalInput Button = new DigitalInput();
        DistanceSensor sonar = new DistanceSensor();

        //Address
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);
        vAxis.setChannel(0);
        hAxis.setChannel(1);

        //Open
        leftMotors.open(5000);
        rightMotors.open(5000);
        vAxis.open(5000);
        hAxis.open(5000);
        Button.open(5000);
        sonar.open(5000);

        //Increase acceleration 
        leftMotors.setAcceleration(leftMotors.getMaxAcceleration());
        rightMotors.setAcceleration(rightMotors.getMaxAcceleration());

        //Use your Phidgets
        boolean Buttonstate = false;
        while (true) 
        {
        	
        	
        	if( Button.getState()&& !Buttonstate){
        		
        	
        		//when the red button is pressed the car does a turn
        	leftMotors.setTargetVelocity(1);
        	rightMotors.setTargetVelocity(-1);
            Thread.sleep(895);
        		               
        		            } if(!Button.getState()&& Buttonstate)
        		            {
        		//when the red button is not pressed the car does nothing               
        		               
        		            }
        		            
            if (sonar.getDistance() < 300) 
            {

            //Move backwards slowly (25% max speed)
                leftMotors.setTargetVelocity(-1);
                rightMotors.setTargetVelocity(-1);
                
            Thread.sleep(1000);
            } else 
            {
            	System.out.println("Distance: " + sonar.getDistance() + " mm");
            	
              //Get data from vertical and horizontal axis (values between -1 and 1)
                double verticalAxis = vAxis.getVoltageRatio();
                double horizontalAxis = hAxis.getVoltageRatio();
                

                //Use thumbstick data to figure how each side of rover should move
                double leftMotorsSpeed = verticalAxis + horizontalAxis;
                double rightMotorsSpeed = verticalAxis - horizontalAxis;

                //Limit values to between -1 and 1
                if(leftMotorsSpeed > 1) leftMotorsSpeed = 1;
                if(leftMotorsSpeed < -1) leftMotorsSpeed = -1;
                if(rightMotorsSpeed > 1) rightMotorsSpeed = 1;
                if(rightMotorsSpeed < -1) rightMotorsSpeed = -1;

                //display speed for each axis
                System.out.println("left"+leftMotorsSpeed);
                System.out.println("right"+rightMotorsSpeed);

                //Apply values 
                leftMotors.setTargetVelocity(leftMotorsSpeed); 
                rightMotors.setTargetVelocity(rightMotorsSpeed);
                
                //Wait for 100 milliseconds
            }
        }
	}
}
