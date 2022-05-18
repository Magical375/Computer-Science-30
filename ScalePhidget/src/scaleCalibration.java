/*
Program: FindName.java           Date of this Revision: 17-May-2022

Purpose: allows the user to calibrate scale to increase accuracy. 

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.*;
import java.util.Scanner;
public class scaleCalibration 
{
	 //Define
    static VoltageRatioInput scale;
    
    public static double getAverage()throws Exception{
        double average = 0;
        int count = 0;
        System.out.println("Averaging Value...");
        while(count < 64){
            average += scale.getVoltageRatio();
            count += 1;
            Thread.sleep(20);
        }
        return average/count;
    }
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        
        //Create
        scale = new VoltageRatioInput();
        
        //Open
        scale.open(1000);
        
        //Set data interval to minimum
        scale.setDataInterval(scale.getMinDataInterval());
        
        System.out.println("Make sure nothing is on your scale and press Enter");
        scan.nextLine();
        double offset = getAverage();
        
        System.out.println("Place a known weight on the scale, type the weight in kilograms and press Enter");
        double knownWeight = Double.parseDouble(scan.nextLine());
        scan.close();//closes the scanner, or the editor program is annoyed 
        
        double measuredWeight = getAverage();
        
        double slope = knownWeight / (measuredWeight - offset);
        
        System.out.println("Your new slope value is: " + Math.round(slope));
    }    
}
/*
Screen Dump
Make sure nothing is on your scale and press Enter

Place a known weight on the scale, type the weight in kilograms and press Enter
0.144

Your new slope value is: 4803
*/
