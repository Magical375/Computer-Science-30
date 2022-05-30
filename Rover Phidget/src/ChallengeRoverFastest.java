/*
Program: challengeRover.java           Date of this Revision: 24-May-2022

Purpose: moves the rover around the 1 meter square while avoiding obstacles 

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
//Add Phidgets Library
import com.phidget22.*;
public class ChallengeRoverFastest 
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
        
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(1);
        Thread.sleep(1120);
   
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(-1);
        Thread.sleep(900);
        

        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(1);
        Thread.sleep(1120);
    
    
	}
}
