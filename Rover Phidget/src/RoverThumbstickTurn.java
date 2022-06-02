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

            for (int i = 0; i>0; i++) 
        	{ 
            //Apply values 
            leftMotors.setTargetVelocity(leftMotorsSpeed); 
            rightMotors.setTargetVelocity(rightMotorsSpeed);
            Thread.sleep(3000);
        	}
            
            //Wait for 100 milliseconds
            Thread.sleep(100);
        }
	}
}
