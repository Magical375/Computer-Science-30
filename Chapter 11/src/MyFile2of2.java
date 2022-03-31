/*
Program: MyFile2of2.java           Date of this Revision: 31-March-2022

Purpose: creates a file with the user entering the name and if the user wants deleting it

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
import java.util.Scanner;
import java.io.*;
public class MyFile2of2 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	
		System.out.println("Please enter the directory of a file");
		// choices that work "../Chapter 11/src/[PICK NAME HERE WITH .txt]" or "C:\Users\904269504\git\Computer-Science-30\Chapter 11\src\[PICK NAME HERE WITH .txt]"
		String Name= input.nextLine();//allows user to pick name of file
	File textFile = new File(Name);//creates file with the name the user choose 
	
	if (textFile.exists())//checks if file already exists 
	{
		System.out.println("File exists.");	//tells user the file already exists if the file already exists 
	}
		else//if file does not already exist
	{
		try 
		{
	textFile.createNewFile();//creates file
	System.out.println("File has been created.");//tells user file has been created
		}
		catch (IOException e)//handles the file could not be created exception, code considers removing this an error in it's code and refuses to run 
		{
			System.out.println("File could not be created.");
			System.err.println("IOException: " + e.getMessage());
		}
	}		
	System.out.println("Keep or delete file? ");//allows user to choose to keep or delete file
	String choice= input.next();
	
	if(choice.equalsIgnoreCase("delete"))//if choice is delete it deletes file in next line, "IgnoreCase" means it ignores the capitals the user enters 
	{
		if(textFile.delete())//deletes file if that is what the user entered
		{
			System.out.println(Name+" has been deleted.");//tells the user the name of the file that has been deleted if they choose to delete the file they created  	
		}
	}
	}
}
/*
Screen Dump
Please enter the directory of a file
../Chapter 11/src/la.txt
File has been created.
Keep or delete file? 
Delete
../Chapter 11/src/la.txt has been deleted.
 
*/

