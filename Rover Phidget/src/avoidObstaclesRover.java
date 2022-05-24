/*
Program: FindName.java           Date of this Revision: 19-May-2022

Purpose: moves the rover while avoiding obstacles

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/ 
//Add Phidgets Library
import com.phidget22.*;
public class avoidObstaclesRover 
{
	public static void main(String[] args) throws Exception  
	{
		//Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        //
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
        
        //Set Data Interval 
        //sonar.setDataInterval(100);
        
        while (true) {

            System.out.println("Distance: " + sonar.getDistance() + " mm");
            
            if (sonar.getDistance() < 200) {
                //Object detected! Stop motors
                //leftMotors.setTargetVelocity(0);
                //rightMotors.setTargetVelocity(0);
            	//leftMotors.setTargetVelocity(-0.25);//moves backwards when object is detected 
                //rightMotors.setTargetVelocity(-0.25);
            	leftMotors.setTargetVelocity(0.25);//turns when object is  detected
            	rightMotors.setTargetVelocity(0.25);//car 363eb1 right wheels move opposite
                Thread.sleep(590);
                
            } else {
                //Move forward slowly (25% max speed)
                leftMotors.setTargetVelocity(0.25);
                rightMotors.setTargetVelocity(0.25);
            }

            //Wait for 250milliseconds
            Thread.sleep(250);
        }
	}

}
