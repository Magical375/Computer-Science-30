/*
Program: turnRover.java           Date of this Revision: 18-May-2022

Purpose: turns the rover 

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/  
//Add Phidgets Library
import com.phidget22.*;
public class turnRover 
{
	public static void main(String[] args)  throws Exception  
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

        //Turn in one direction
        //leftMotors.setTargetVelocity(1); rightMotors.setTargetVelocity(-1);//turns clockwise
        //leftMotors.setTargetVelocity(-1); rightMotors.setTargetVelocity(1);//turns counter-clockwise
        //goes forward turns around and goes back to start 
        leftMotors.setTargetVelocity(1);rightMotors.setTargetVelocity(1);
        Thread.sleep(1000);
        
        leftMotors.setTargetVelocity(1); rightMotors.setTargetVelocity(-1);
        Thread.sleep(1125);
        
        leftMotors.setTargetVelocity(1);rightMotors.setTargetVelocity(1);
        
        //Wait for 1 second
        Thread.sleep(1400);

        //Stop motors
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);	
	}

}
