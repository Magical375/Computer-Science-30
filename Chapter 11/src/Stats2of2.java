/*
Program: Stats.java           Date of this Revision: 6-April-2022

Purpose: allows the user to enter names and grades of the students this data will be written to a file, then the lowest grade, highest grade and average grade will be displayed 
Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;
public class Stats2of2 {
	public static void main(String[] args) 
	{
		NumberFormat percentFormat = NumberFormat.getPercentInstance();
		Scanner input = new Scanner(System.in);	
		System.out.println("Please enter the directory of where you want the file with the name of the file you want to create.");
		String FileName= input.nextLine();//allows user to pick name of file
		File textFile = new File(FileName);//creates the file with the name the user wanted
		System.out.println("program will allow you to enter five students and their grades.");
		
		//System.out.println("Please enter the number of students for this file.");
		//int numberofstudent= input.nextInt();
		//run loop numberofstudent times, ex. runs loop five times, create new variable names??
		
		FileWriter out;
		//BufferedWriter out;
		BufferedWriter writeFile;
		double score;
		String name;
		
		try 
		{
		out = new FileWriter(FileName);	
		writeFile = new BufferedWriter(out);
		for(int i = 0; i<5; i++) 
			{
			System.out.println("Please enter the name of the first student");
			String Name1= input.nextLine();
			writeFile.write(Name1);
			System.out.println("Please enter the grade of "+Name1);
			int Grade1= input.nextInt();
			writeFile.write(Grade1);
			
			System.out.println("Please enter the name of the second student");
			String Name2= input.nextLine();
			writeFile.write(Name2);
			writeFile.newLine();
			System.out.println("Please enter the grade of "+Name2+" no decimals");
			int Grade2= input.nextInt();
			writeFile.write(Grade2);
			
			System.out.println("Please enter the name of the third student");
			String Name3= input.nextLine();
			writeFile.write(Name3);
			writeFile.newLine();
			System.out.println("Please enter the grade of "+Name3+" no decimals");
			int Grade3= input.nextInt();
			writeFile.write(Grade3);
			
			System.out.println("Please enter the name of the fourth student");
			String Name4= input.nextLine();
			writeFile.write(Name4);
			writeFile.newLine();
			System.out.println("Please enter the grade of "+Name4+" no decimals");
			int Grade4= input.nextInt();
			writeFile.write(Grade4);
			
			System.out.println("Please enter the name of the fifth student");
			String Name5= input.nextLine();
			writeFile.write(Name5);
			writeFile.newLine();
			System.out.println("Please enter the grade of "+Name5+" no decimals");
			int Grade5= input.nextInt();
			writeFile.write(Grade1);
			}
		writeFile.close();
		out.close();
		System.out.println("Student names and grades have been written to file.");
		}
		catch(IOException e)
		{
		System.out.println("There is a problem writting to file.");
		System.err.println("IOException: "+ e.getMessage());
		}
	}
}
/*
Screen Dump
*/
