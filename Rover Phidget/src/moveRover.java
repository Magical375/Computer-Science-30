/*
Program: FindName.java           Date of this Revision: 18-May-2022

Purpose: moves the rover forward

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
//Add Phidgets Library
import com.phidget22.*;
public class moveRover 
{
	public static void main(String[] args) throws Exception 
	{
		//Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        //Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();

        //Address
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        //Open
        leftMotors.open(5000);
        rightMotors.open(5000);

        //Move forward at full speed
        //leftMotors.setTargetVelocity(1);
        //rightMotors.setTargetVelocity(1);
        leftMotors.setTargetVelocity(0.25);
        rightMotors.setTargetVelocity(0.25);//negative moves backwards, positive moves forwards. 

        //Wait for 1 second
        Thread.sleep(5000);

        //Stop motors
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);	

	}

}
