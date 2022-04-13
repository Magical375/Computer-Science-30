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
		//     please use this directory:"../Chapter 11/src/StudentNames.txt"
		String FileName= input.nextLine();//allows user to pick name of file
		File textFile = new File(FileName);//creates the file with the name the user wanted
		
		System.out.println("How many students do you want to list?");
		int num = input.nextInt();
		
		//FileWriter out;//enables the write to file
		BufferedWriter writeFile;
		FileReader in;//helps the program to read the file
		BufferedReader readFile;
		String fileName;
		String StudentName;
		
		try 
		{
			FileOutputStream out = new FileOutputStream(textFile);
			ObjectOutputStream writetextFile = new ObjectOutputStream(out);
			for(int i = 0; i<num; i++) 
			{
			System.out.println("Please enter the first name of a student");
			String Namef= input.next();
			System.out.println("Please enter the last name of that student");
			String Namel= input.next();
			String stuName = "Name: ";
			writetextFile.writeObject(new stuName(Namef, Namel));//writes information the user entered	
			
			
			//writetextFile.writeBytes(space);
			//writetextFile.writeChars(spacee);
			
			}
		writetextFile.close();
		System.out.println("program has writen student names");
		
		
		//in = new FileReader(textFile);
		//readFile = new BufferedReader(in);
		
		FileInputStream in = new FileInputStream(textFile);
		ObjectInputStream readtext = new ObjectInputStream(in);
		
		for(int i = 0; i<num; i++) 
		{
			System.out.println((stuName) readtext.readObject() );//displays student names
		}
		
		
		readtext.close();
		}
		
			catch(IOException e)//handles exceptions so when they happen the code doen't crash
			{
			System.out.println("There is a problem writting to file.");
			System.err.println("IOException: "+ e.getMessage());
			}
			/*catch(FileNotFoundException e) 
			{
			System.out.println("Error Message: File does not exists.");
			System.err.println("FileNotFoundException:"+ e.getMessage());
			}*/
			catch (ClassNotFoundException e) {
			System.out.println("Error Message: Class not found.");
			System.err.println("ClassnotFound:"+ e.getMessage());
		}
	}
}
