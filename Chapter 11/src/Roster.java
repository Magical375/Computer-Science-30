/*
Program: Roster.java           Date of this Revision: 6-April-2022

Purpose: allows user to name file and write data to the file created
Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
import java.io.*;
import java.util.Scanner;
public class Roster 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	
		System.out.println("Please enter the directory of where you want the file with the name of the file you want to create.");
		//     please use this directory         ../Chapter 11/src/NamesandGrades.txt
		String FileName= input.nextLine();//allows user to pick name of file
		File textFile = new File(FileName);//creates the file with the name the user wanted
		
		System.out.println("Program will allow you to enter five students and their grades.");
		
		FileWriter out;//enables the write to file
		File dataFile;
		BufferedWriter writeFile;
		
		try 
		{
			dataFile = new File(FileName);
			out = new FileWriter(dataFile);	
			writeFile = new BufferedWriter(out);
		for(int i = 0; i<5; i++) 
			{
			System.out.println("Please enter the first name of a student");
			String Namef= input.next();
			System.out.println("Please enter the last name of a student");
			String Namel= input.next();
			writeFile.write(Namef);//writes information the user entered
			writeFile.write(Namel);
			writeFile.newLine();
			
			}
		}
			catch(IOException e)
				{
				System.out.println("There is a problem writting to file.");
				System.err.println("IOException: "+ e.getMessage());
				}
		
		FileReader in;//helps the program to read the file
		BufferedReader readFile;
		String fileName;
		String StudentName;
	
		try 
		{
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			
			while ((StudentName=readFile.readLine())!=null)//the program reads file for student names
			{	
				System.out.println(StudentName);//displays student names
			}
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
