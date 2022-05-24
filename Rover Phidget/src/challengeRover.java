/*
Program: challengeRover.java           Date of this Revision: 24-May-2022

Purpose: moves the rover around the 1 meter square while avoiding obstacles 

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
//Add Phidgets Library
import com.phidget22.*;
public class challengeRover 
{
	public static void main(String[] args) throws Exception   
	{
		//Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        //Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();
        DistanceSensor sonar = new DistanceSensor();
        
     

        //Address
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        //Open
        leftMotors.open(5000);
        rightMotors.open(5000);
        sonar.open(5000);
        
        while (true) 
        {
            System.out.println("Distance: " + sonar.getDistance() + " mm");
            
            if (sonar.getDistance() < 200) {
                //Object detected! Turn Vehicle 180
            	//leftMotors.setTargetVelocity(0.5);
            	//rightMotors.setTargetVelocity(-0.5);
                //Thread.sleep(550);
                
              //Object detected! Turn Vehicle 90
                leftMotors.setTargetVelocity(0.5);
            	rightMotors.setTargetVelocity(-0.5);
                Thread.sleep(50);
                
                
                
            } else {
                //Move forward slowly (25% max speed)
                leftMotors.setTargetVelocity(0.25);
                rightMotors.setTargetVelocity(0.25);
            }

            //Wait for 250milliseconds
            //Thread.sleep(250);
        }
        

	}

}
