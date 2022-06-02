/*
Program: RoverThumbstick.java           Date of this Revision: 1-June-2022

Purpose: controls the rover with the thumbstick

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/  
//Add Phidgets Library
import com.phidget22.*;
public class RoverThumbstick 
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

        //Increase acceleration
        leftMotors.setAcceleration(leftMotors.getMaxAcceleration());
        rightMotors.setAcceleration(rightMotors.getMaxAcceleration());

        //Use your Phidgets
        while(true)
        {
        	
        	/*    // vertical axis
            //Get data from vertical axis (value between -1 and 1)
            double verticalAxis = vAxis.getVoltageRatio();
            
            //display data from vertical axis
            System.out.println(verticalAxis);
            
            //Use Thumbstick position set motor controller target velocity
            leftMotors.setTargetVelocity(verticalAxis);
            rightMotors.setTargetVelocity(verticalAxis);
            
           //Wait 100 milliseconds
            Thread.sleep(100);
            
            */
                    //    horizontal axis
            //Get data from horizontal axis (value between -1 and 1)
            double horizontalAxis = hAxis.getVoltageRatio();
            
            //Use Thumbstick position set motor controller target velocity
            leftMotors.setTargetVelocity(horizontalAxis);
            rightMotors.setTargetVelocity(horizontalAxis);
            
           //Wait 100 milliseconds
            Thread.sleep(100);
            
        }	
	}
}
