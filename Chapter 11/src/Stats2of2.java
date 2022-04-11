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
		//../Chapter 11/src/namesandgrades.txt
		String FileName= input.nextLine();//allows user to pick name of file
		File textFile = new File(FileName);//creates the file with the name the user wanted
		System.out.println("Program will allow you to enter five students and their grades.");
		
		FileWriter out;
		File dataFile;
		//BufferedWriter out;
		BufferedWriter writeFile;
		String Grade1;
		
		try 
		{
			dataFile = new File(FileName);
			out = new FileWriter(dataFile);	
			writeFile = new BufferedWriter(out);
		for(int i = 0; i<5; i++) 
			{
			System.out.println("Please enter the name of a student");
			String Name1= input.next();
			
			
			System.out.println("Please enter the grade of "+Name1);
			Grade1 = input.next();
			writeFile.write(Name1);//writes information the user entered
			writeFile.newLine();
			writeFile.write(Grade1);
			writeFile.newLine();
			
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
	}
}
/*
Screen Dump of Console
Please enter the directory of where you want the file with the name of the file you want to create.
../Chapter 11/src/namesandgrades.txt
Program will allow you to enter five students and their grades.
Please enter the name of a student
A
Please enter the grade of A
100
Please enter the name of a student
B
Please enter the grade of B
90
Please enter the name of a student
C
Please enter the grade of C
80
Please enter the name of a student
D
Please enter the grade of D
70
Please enter the name of a student
E
Please enter the grade of E
60
Student names and grades have been written to file.
Lowest Grade: 60.0
Highest Grade: 100.0
Average Grade: 80.0

Screen Dump of File
A
100
B
90
C
80
D
70
E
60

*/
