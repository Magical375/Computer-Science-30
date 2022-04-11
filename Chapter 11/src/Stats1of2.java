/*
Program: Stats1of2.java           Date of this Revision: 1-April-2022

Purpose: read data from file and display data from file
Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;
public class Stats1of2 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		File textFile = new File("../Chapter 11/src/test1.txt");
		NumberFormat percentFormat = NumberFormat.getPercentInstance();
		FileReader in;
		BufferedReader readFile;
		String fileName;
		String score;
		String StudentName;
		String StudentGrade;
		double averageGrade; 
		double scoreValue;
		double lowScore = 100;
		double highScore = 0;
		double addedGrades = 0;
		int numGrades = 0; 
	
		try 
		{
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			
			while ((StudentName=readFile.readLine())!=null)//the program reads file for student names
			{	
				StudentGrade=readFile.readLine();//the program reads file for student grades
				System.out.println(StudentName);//displays student names
				System.out.println(StudentGrade);//displays student grades
				numGrades +=1;//sets the number of grades variable 
				scoreValue = Double.parseDouble(StudentGrade);
				addedGrades += scoreValue;
				if (scoreValue<lowScore)
				{
					lowScore = scoreValue;	
				}
				if(scoreValue>highScore) 
				{
					highScore = scoreValue;
				}
			}
			averageGrade = addedGrades / numGrades;
		    //the program should now display the lowest grade(23), the highest grade(98) and the average grade(65)
			System.out.println("Lowest Grade: "+lowScore);
			System.out.println("Highest Grade: "+highScore);
			System.out.println("Average Grade: "+averageGrade);
			
			readFile.close();
			in.close();
		}//code that handles exceptions so when they happen the program doesn't crash
		catch(FileNotFoundException e) 
		{
		System.out.println("Error Message: File does not exists.");
		System.err.println("FileNotFoundException:"+ e.getMessage());
		}
		catch(IOException e) 
		{
		System.out.println("Error Message: Can not read the file");
		System.err.println("IOException:"+ e.getMessage());
		}
		catch(ArithmeticException e) 
		{
		System.out.println("Error Message: The number of grades equals zero.");
		System.err.println("ArithmeticException:"+ e.getMessage());
		}
	}
}
/*
Screen Dump
Jane 
63
Bob 
54
Ashley 
75
Sarah 
87
Marvin 
43
Tanya 
96
Ben 
23
Jack  
46
Lucas 
98
Lowest Grade: 23.0
Highest Grade: 98.0
Average Grade: 65.0
*/
